package gw.api.financials.summary

uses com.google.common.collect.Lists
uses com.google.common.collect.Sets
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.summary.variants.AbstractNode
uses gw.api.financials.summary.variants.FinancialSummaryVariant
uses gw.api.financials.summary.variants.RootNode
uses javax.annotation.Nonnull
uses org.slf4j.LoggerFactory

uses java.lang.IllegalStateException
uses java.util.Collections
uses java.util.Set
uses java.util.List

/**
 * FinancialsSummaryEngine
 * Responsible for building up the tree of node that represent the buckets and summary buckets
 * for amounts in the claim which are then sent to the FinancialSummaryScreen
 */
@Export
class FinancialsSummaryEngine {
  private static var logger = LoggerFactory.getLogger(FinancialsSummaryEngine)
  //Leaf nodes are the lowest level buckets of values.
  private var leafNodeSet: Set<Leaf>
  protected var leafNodeList: List<Leaf>
  //need a place to Keep track of the lists of summary nodes.
  protected var summaryNodeListList: List<List<Node>> = Lists.newArrayList<List<Node>>()
  //A variant defines the hierarchy of leaf and summary nodes and is chosen by the user at runtime.
  public var _variant: FinancialSummaryVariant as Variant
  private var _claim: Claim

  //Usually holds the "Claim Total" FSRow, which is the first row in the list of SummaryRows returned.
  //Note that this property is not necessary to have for ListViews of FSRows- but it is needed
  //to support a TreeView of FSRows, suitable for display in a RowTree widget
  //In the event that the ReservingCurrency variant is selected, you will have one root in this list for each reserving currency
  //present on the claim.  For all other variants, the list will contain one element which is the ClaimTotal FSRow.
  private var _rootFSRows : List<FSRow> = {}

  property get Roots(): List<FSRow> {
    return _rootFSRows
  }

  private var _options : FinancialSummaryCalculationOptions

  construct(claim: Claim, variant: FinancialSummaryVariant, options : FinancialSummaryCalculationOptions) {
    this._claim = claim
    this._variant = variant
    this._options = options
  }

  function containsOnlyRootNode(list : List<Node>) : boolean {
    return list.size() == 1 and (typeof list.single()) as String ==  RootNode.Type.Name
  }

  function makeSummaryNodes(currentNodeList: List<Node>) {
    //we iterate over the current level until we reach the root node.
    while (currentNodeList.HasElements and not containsOnlyRootNode(currentNodeList)) {
      //create a multiMap where the keys are Summary nodes and the values are a list of leaf nodes
      //that rollup to the summary node.
      var summaryNode2ListOfChildren = currentNodeList.partition(\node -> {
        var summaryNode = node.buildSummaryInstance()
        summaryNode.FinancialSummaryCalculationOptions = _options
        return summaryNode
      })

      //place the total of the leaf nodes in the summary node
      //and set the summary node's children
      summaryNode2ListOfChildren.eachKeyAndValue(\summaryNode, childNodeList -> {
        _variant.Columns.each(\column -> {
          //add the nodes on the current level and place the sum at the next level up
          //But if all of the values are null, leave the sum as null.
          summaryNode.storeAmount(column, childNodeList.reduce(PotentiallyInvalid.of(null as CurrencyAmount), \accumluatedAmount, node -> {
            return differingCurrencyTolerantCurrenyAmountAdder(accumluatedAmount, node.retrieveAmount(column))
          }))
        })
        summaryNode.attachChildren(childNodeList)
      })
      summaryNodeListList.add(currentNodeList)

      currentNodeList = Lists.newArrayList(summaryNode2ListOfChildren.keySet())
      Collections.sort(currentNodeList)
    }
    //for obtaining the root node only.
    summaryNodeListList.add(currentNodeList)
  }

  //In the case of the ReservingCurrency Variant, when summing the nodes just under the root node, we
  //would end up possibly summing currency amounts with differing reserving currencies.  This is not allowed,
  //and in fact the claim total for the root node should be "invalid" in this case.
  //We can handle this by using this special class that can handle the case when the currencies differ
  function differingCurrencyTolerantCurrenyAmountAdder(@Nonnull p1: PotentiallyInvalid<CurrencyAmount>,
                                                       @Nonnull p2: PotentiallyInvalid<CurrencyAmount>):
      PotentiallyInvalid<CurrencyAmount> {

    //if either are invalid then return invalid because you cant combine unlike currencies.
    if (not p1.Valid or not p2.Valid) {
      return PotentiallyInvalid.buildInvalid()
    }

    //both have to be valid to add them: unwrap them into currency amounts safely now.
    var c1 = p1.Value
    var c2 = p2.Value
    if (c1.Currency != null and c2.Currency != null and c1.Currency != c2.Currency) {
      //differing currency amounts results in an invalid value.
      return PotentiallyInvalid.buildInvalid()
    }
    var sum =  nullPreservingCurrencyAmountAdder(c1, c2)
    //wrap up the sum before returning.
    return PotentiallyInvalid.of(sum)
  }

  //necessary so that we keep the sums of the summary nodes null as long as all of its children are null
  //as soon as one child is a non-null currency amount, then we start adding
  function nullPreservingCurrencyAmountAdder(c1: CurrencyAmount, c2: CurrencyAmount): CurrencyAmount {
    if (c1 == null) {
      if (c2 == null) {
        return null
      } else {
        return c2
      }
    }
    //c1 is not null here.
    if (c2 == null) {
      return c1
    }
    return c1.add(c2)
  }

  function process() {
    populateLeafNodes()
    if (leafNodeSet.Empty) {
      //no rows to process.
      return
    }
    leafNodeList = Lists.newArrayList(leafNodeSet)
    Collections.sort(leafNodeList) //uses the compareTo method on Leaf.  This determines how the rows are ordered
    //on the display, and can explain for example why rows corresponding to Exposures are sorted before rows corresponding
    //to claim-level payments.
    makeSummaryNodes(leafNodeList)
  }

  function populateLeafNodes() {
    var leafBuilder = _variant.getLeafBuilder()
    leafNodeSet = Sets.newHashSet<Leaf>()

    //build the list of leaf nodes
    var tAccountOwnerDelegates = _variant.getTAccountOwnerDelegates(_claim)
    //note there may be more reserve lines than leaf nodes if
    //the definition of the leaf bucket is sufficiently broad enough to capture
    //multiple reserve lines.
    tAccountOwnerDelegates.each(\taccountOwnerDelegate -> {
      //if there is no Leaf with this combination then create it.
      //make sure that a leaf only gets built when needed: its possible that n reserve lines
      //can be combined into one leaf.
      var leaf = leafBuilder.build(taccountOwnerDelegate)
      if (leaf == null) {
        return
      }
      leaf.FinancialSummaryCalculationOptions = _options
      leafNodeSet.add(leaf)
    })

    leafNodeSet.each(\leaf -> {
      leaf.calculateAmounts(_variant.Columns)
      //validate that the leaf nodes calculated amounts and stored for all the expressions.
      //The stored amount is allowed to be null, but storedAmount must be called either way.
      _variant.Columns.each( \ column -> {
        if (not (leaf as AbstractNode).anAmountHasBeenStoredForExpression(column)) {
          throw new IllegalStateException("Leaf node class ${typeof leaf} did not store an amount for "+
              "expression ${column}. This is likely a programming error.")
        }
      })
    })
  }

  private var summaryRows: List<FSRow>
  property get SummaryRows(): List<FSRow> {
    //return if computed
    if (summaryRows != null) {
      return summaryRows
    }
    //compute
    summaryRows = {}
    //depth-first traversal of the tree of nodes from the root node

    //if no leaf nodes were built, then are are no nodes, and there is no root node: return an empty list in this case.
    if (!summaryNodeListList.HasElements) {
      return summaryRows
    }
    //Note that this root is the RootNode which is a Node.  It is NOT the RootFSNode.
    //Nodes and Leafs are part of the "model" and are not exposed to the PCFs.
    //FSRows, with the first one being the root are objects exposed to the PCFs. These
    //are built using the depthFirstTraversal call which follows.
    var root = summaryNodeListList.last().single()
    depthFirstTraversal(root, null)
    return summaryRows
  }

  //Traverses the tree of Nodes, and accepts the last parent FSRow object that was constructed
  //so that children FSNodes and be linked to it.
  //Note that FSRow.Children are not needed for the ListView of FSRows but in a RowTree implementation
  //having each FSRow contain a list of its children FSRow instances is required.
  function depthFirstTraversal(node: Node, parentFSRow: FSRow) {
    var fsRow = visit(node, parentFSRow)
    if (node.Children == null) {
      return
    }
    node.Children.each(\child -> depthFirstTraversal(child, fsRow))
  }

  function visit(node: Node, parentFSRow : FSRow) : FSRow {
    var fsRow = node.buildFSRow()
    if (parentFSRow != null) {
      parentFSRow.Children.add(fsRow)
    }
    //The ReservingCurrency variant needs to OMIT the Claim Total summary row, by design. In general we can allow a variant
    //to decide whether to include/exclude a row by having the variant class implement an includeRowBuiltFrom method on the
    //variant interface. All variants OOTB except for the ReservingCurrency variant simply return true
    if (_variant.includeRowBuiltFrom(node)) {
      summaryRows.add(fsRow)

      if (_variant.useRowBuiltFromThisAsRoot(node)) {
        _rootFSRows.add(fsRow)
      }

    }
    return fsRow
  }
}