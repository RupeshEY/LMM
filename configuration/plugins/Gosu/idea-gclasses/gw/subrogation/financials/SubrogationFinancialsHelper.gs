package gw.subrogation.financials

uses gw.api.financials.CurrencyAmount
uses gw.api.web.RequestVar
uses org.apache.commons.collections.map.MultiKeyMap

uses java.math.BigDecimal

@Export
class SubrogationFinancialsHelper {
  private static var cachedRecoveries = new RequestVar<MultiKeyMap>()
  public static property get Cache() : MultiKeyMap {
    if (cachedRecoveries.RequestAvailable) {
      if (cachedRecoveries.get() == null) {
        cachedRecoveries.set(new MultiKeyMap())
      }
      return cachedRecoveries.get()
    } else {
      return null
    }
  }

  //Public
  public static function getSubroFinancialsRows(claim : Claim, adverseParty : SubroAdverseParty) : SubroFinsResult {

    //What kind of subrogation are we working with?
    var exposureLevel = claim.SubrogationSummary.SubrogateIndividualExposures

    //If claim level, generate the rows using the Claim and the adverse party
    if(!exposureLevel) {
      return createRows(claim, adverseParty)
    }

    //Otherwise, filter the ReserveLines to those matching the Exposures in subrogation
    var subroReserveMap = new HashMap<Subrogation, List<ReserveLine>>()

    for(var subrogation in claim.SubrogationSummary.Subrogations) {
      var reserves = claim.ReserveLines.where(\ res ->
          res.Exposure == subrogation.Exposure
          and res.CostType == CostType.TC_CLAIMCOST
      ).toList()
      subroReserveMap.put(subrogation, reserves)
    }

    return createRows(subroReserveMap, adverseParty)
  }


  /**
   * Finds the appropriate expected recovery for a given subrogation and adverse party, if the adverse party is
   * null, we return the subrogation's total expected recovery, otherwise, either the overridden percent or the
   * party's percent are returned based on when the expected recovery percentage is overridden for the given Subrogation
   * @param subrogation
   * @param adverseParty
   * @return
   */
  public static function getExpectedRecoveryFor(subrogation: Subrogation, adverseParty: SubroAdverseParty = null) : BigDecimal {
    if(adverseParty == null) {
      return subrogation.TotalExpectedRecoveryPercent
    }

    if (subrogation.CustomizedLiability) {
      return subrogation.OverridesForAllParties.singleWhere(\ over -> over.SubroAdverseParty == adverseParty).ExpectedRecovery
    }

    return adverseParty.ExpectedRecovery ?: 0
  }

  public static function getLiabilityForUI(claim : Claim, adversePartyWrapper : AdversePartyWrapper) : String {
    var value : Double
    if (adversePartyWrapper.AdverseParty != null) {
      value = adversePartyWrapper.AdverseParty.Fault?.doubleValue()
    } else if (claim.SubrogationSummary.Subrogations.hasMatch(\subrogation -> subrogation.CustomizedLiability)) {
      value = null
    } else {
      value = claim?.AdversePartyLiabilityPercent()?.doubleValue()
    }

    if(value == null) {
      return ""
    } else {
      return util.Display.DisplayPercent(value, new Double(100))
    }
  }

  public static function getExpectedRecoveryPercentForUI(claim: Claim, adversePartyWrapper: AdversePartyWrapper) : String {
    var value : Double
    if (adversePartyWrapper.AdverseParty != null) {
      value = adversePartyWrapper.AdverseParty.ExpectedRecovery?.doubleValue()
    } else if (claim.SubrogationSummary.Subrogations.hasMatch(\subrogation -> subrogation.CustomizedLiability)) {
      value = null
    } else {
      value = claim?.AdversePartyExpectedRecoveryPercent()?.doubleValue()
    }

    if(value == null) {
      return ""
    } else {
      return util.Display.DisplayPercent(value, new Double(100))
    }
  }

  public static function getSelectableAdversePartiesWithTotalRow(claim : Claim) : List<AdversePartyWrapper> {
    var adverseParties = claim.SubrogationSummary.SubroAdverseParties.toList().map(\adverseParty -> {
      return new AdversePartyWrapper(adverseParty)
    })
    adverseParties.add(new AdversePartyWrapper(null))
    return adverseParties
  }



  //Private
  private static function createRows(claim : Claim, adverseParty : SubroAdverseParty) : SubroFinsResult {
    return createRows(new HashMap<Subrogation, List<ReserveLine>>(){
        claim.SubrogationSummary.Subrogations.single() -> claim.ReserveLinesForClaimCost
    }, adverseParty)
  }


  private static function createRows(subroReserveMap : Map<Subrogation, List<ReserveLine>>, adverseParty : SubroAdverseParty) : SubroFinsResult {
    var leafNodes = new ArrayList<AbstractSubroFinsNode>()
    var totals = new HashMap<SubrogationCalculationsEnum, CurrencyAmount>()
    var calcTotals = true

    //We create by creating a "Leaf" node for each reserve line, this is the lowest level subclass of SubroFinsRootNode
    subroReserveMap.eachKeyAndValue(\subro, reserveLines -> {
      for (reserveLine in reserveLines) {
        //Create the leaf node, which computes its totals
        var leaf = new SubroFinsClaimCostCategoryNode(reserveLine, adverseParty, subro)
        //If we haven't yet hit an invalid calculation
        if(calcTotals) {
          for (var calc in SubrogationCalculationsEnum.getAllValues()) {
            if (totals[calc] == null) {
              //Start at Zero
              totals[calc] = CurrencyAmount.getStrict(0bd, reserveLine.ReservingCurrency)
            }
            if (reserveLine.ReservingCurrency == totals[calc].Currency) {
              if(leaf.Calculations[calc] != null) {
                totals[calc] = totals[calc].add(leaf.Calculations[calc])
              }
            } else {
              //We have a different reserve line currency
              //no totals will be created
              totals.clear()
              calcTotals = false
              break
            }
          }
        }
        leafNodes.add(leaf)
      }
    })

    //No reserve lines?
    if(leafNodes.isEmpty()) {
      return SubroFinsResult.make(totals, leafNodes)
    }

    //We need to sort so the output looks as expected
    Collections.sort(leafNodes)

    //We will keep creating levels until we hit the root
    var root : AbstractSubroFinsNode = null
    //Partition until we hit the root row
    while(leafNodes.HasElements) {
      //This creates a Map from a Leaf node's Summary (super class in this case)
      //to the list of leaf nodes that share the same summary
      //See hashCode() and equals() in SubroFinsRootNode subclasses to understand the grouping
      var nodeMap = leafNodes.partition(\row -> {
        var summary = row.SummaryRow
        //This will be null in the case of the root, that is expected
        return summary
      })

      //We are going to re-populate this list with the keys of the newly created map
      //This allows use to continue working up through Summaries
      leafNodes.clear()

      //For each key, add all of the values as it's children
      //Then add it to the leafNodes list so that it can be processed as a new leaf
      nodeMap.eachKeyAndValue(\ key , val -> {
        //key will be null once the Root node has been mapped, in this case
        //save the root node
        if (key != null) {
          leafNodes.add(key)
          key.Children.addAll(val)
        } else {
          root = val.single()
        }

      })
      //Sort the elements, see compareTo() in subclasses of SubroFinsRootNode
      if(leafNodes.HasElements) {
        Collections.sort(leafNodes)
      }
    }

    //Now that we have created a tree, flatten it for display in the LV
    return SubroFinsResult.make(totals, flatten(root))
  }

  private static function flatten(root: AbstractSubroFinsNode) : List<AbstractSubroFinsNode> {
    var list = new ArrayList<AbstractSubroFinsNode>()
    //We don't want the root in the list, so iterate over its children here
    for(var node in root.Children) {
      depthFirstSearch(node, list)
    }
    return list
  }

  private static function depthFirstSearch(node: AbstractSubroFinsNode, list : List<AbstractSubroFinsNode>) {
    list.add(node)
    if (node.Children == null) {
      return
    }
    node.Children.each(\ child -> depthFirstSearch(child, list))
  }

}