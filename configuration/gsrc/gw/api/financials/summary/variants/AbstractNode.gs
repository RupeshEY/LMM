package gw.api.financials.summary.variants

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.FinancialsCalculations
uses gw.api.financials.FinancialsCalculator
uses gw.api.financials.FinancialsExpression
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.FinancialSummaryCalculationOptions
uses gw.api.financials.summary.Node
uses gw.api.financials.summary.PotentiallyInvalid
uses gw.api.locale.DisplayKey

uses java.lang.UnsupportedOperationException
uses java.util.ArrayList
uses java.util.HashMap
uses java.util.HashSet
uses java.util.Map
uses java.util.List

//AbstractNode is the parent class of all Nodes, including leaf nodes.  Note that its abstract so its limited to
//behavior that all nodes need to inherit, including the RootNode.

@Export
abstract class AbstractNode implements Node {
  protected var children: List<Node>
  private var _financialsAmounts= new HashMap<String, PotentiallyInvalid<CurrencyAmount>>()

  //we are keeping track of whether a leaf node called storeAmount on each expression.  They are required to do so, even if the amount
  //that is stored is null, so that we can know that the Leaf classes are implemented correctly.
  //Its in this class because this class is the parent class of all Leaf Nodes.
  private var _expressionsForWhichStoreAmountHasBeenCalled = new HashSet<String>()
  protected var _options : FinancialSummaryCalculationOptions as FinancialSummaryCalculationOptions

  protected var _claim: Claim
  construct(claim: Claim) {
    _claim = claim
  }

  override function storeAmount(fex: String, amount: PotentiallyInvalid<CurrencyAmount>) {
    _financialsAmounts.put(fex, amount)
    _expressionsForWhichStoreAmountHasBeenCalled.add(fex)
  }

  function anAmountHasBeenStoredForExpression(fex: String) : boolean {
    return _expressionsForWhichStoreAmountHasBeenCalled.contains(fex)
  }

  override function retrieveAmount(fex: String): PotentiallyInvalid<CurrencyAmount> {
    return _financialsAmounts.get(fex)
  }

  override function buildSummaryInstance(): Node {
    throw new UnsupportedOperationException("non-RootNode subclasses must implment buildSummaryInstance() : Node")
  }

  override function attachChildren(c: List<Node>) {
    children = c
  }

  //used for the fist column in the PCF
  abstract public property get FSRowLabel(): String

  //used for Node and leaf classes to populate variant-specific fields on the FSRow instance, to meet requirements of the PCF
  abstract function populateFSRow(fsRow: FSRow)

  //These are passed into the PCF and become the Rows in the ListView
  override function buildFSRow(): FSRow {
    var fsRow = new FSRow()
    fsRow.Amounts = _financialsAmounts
    fsRow.Label = FSRowLabel
    fsRow.Level = Level
    fsRow.TAccountOwnerDelegates = TAccountOwnerDelegates
    populateFSRow(fsRow)
    return fsRow
  }

  override property get Children(): List<Node> {
    return children
  }

  //returns all reserve lines by obtaining them recursively
  override property get TAccountOwnerDelegates(): List<TAccountOwnerDelegate> {
    var retval = new ArrayList<TAccountOwnerDelegate>()
    children.each(\node -> retval.addAll(node.TAccountOwnerDelegates))
    return retval
  }

  override function compareTo(o: Node): int {
    return 0
  }

  //A map to a block that returns a calculator
  //We use a block that returns a calculator instead of a simple static reference to a calculator.
  // The reason for this is that a FinancialsCalculator has "state" such as the
  //claim and the exposure that its querying on.  If we just mapped from a FinancialsExpression directly to a FinancialsCalculator in this static map,
  //we would be returning the same FinancialsCalculator instance every time for a given FinancialsExpression.  This would lead to
  //concurrency problems because of the shared state: Two thread using the same calculator would be a bad idea.
  //Using a block guarantees that we get a new calculator instance whenever the block is called
  static var supportedFloatingFinancialsCalculatorsBlock: Map<FinancialsExpression, block() : FinancialsCalculator> = {
      FinancialsCalculationUtil.OpenRecoveryReservesExpression -> \-> {return FinancialsCalculations.FloatingFinancials.OpenRecoveryReserves},
      FinancialsCalculationUtil.RemainingReservesExpression -> \-> {return FinancialsCalculations.FloatingFinancials.RemainingReserves},
      FinancialsCalculationUtil.TotalIncurredNetRecoveriesExpression -> \-> {return FinancialsCalculations.FloatingFinancials.TotalIncurredNet},
      FinancialsCalculationUtil.TotalRecoveryReservesExpression -> \-> {return FinancialsCalculations.FloatingFinancials.TotalRecoveryReserves}
  }

  //returns an appropriate financials calculator for the given expression and useFloatingFinancials argument but does not
  //restrict the transactions to anything but the claim.  Subclasses are expected to further restrict by using
  //additional ".with" clauses on the returned calculator
  protected function obtainUnrestrictedFinancialsCalculator(expression : FinancialsExpression) : FinancialsCalculator {
    var f : FinancialsCalculator
    if (FinancialSummaryCalculationOptions.UseFloatingFinancials) {
      var financialsExpressionProviderBlock = supportedFloatingFinancialsCalculatorsBlock.get(expression)
      if (financialsExpressionProviderBlock == null) {
        //the expression has no associated floating financials calculation (block) defined.  Use the fixed counterpart.
        f = FinancialsCalculations.getFinancialsCalculation(expression)
      } else {
        //This line makes sure we use a new instance of the calculator each time one is requested for the expression. We are executing the block.
        f = financialsExpressionProviderBlock()
      }
    } else {
      //not using floating financials
      f = FinancialsCalculations.getFinancialsCalculation(expression)
    }
    f.withClaim(_claim)
    return f
  }

  protected function getDisplayValue(amount: PotentiallyInvalid<CurrencyAmount>) : String {
    return (not amount.Valid) ? DisplayKey.get("Java.Financials.Summary.InvalidCurrencyAmount") : amount.Value.DisplayValue
  }

}
