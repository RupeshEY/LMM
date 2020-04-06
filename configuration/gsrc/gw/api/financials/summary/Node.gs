package gw.api.financials.summary

uses gw.api.financials.CurrencyAmount

uses java.lang.Comparable
uses java.util.List

/**
 * Leaf nodes (gw.api.financials.summary.Leaf) are value
 * objects which store the results of the lowest level financials calculations.
 * They are subclasses of a more general interface called gw.api.financials.summary.Node (this one)
 * which can contain rolled-up sums from the Nodes and leaf nodes "below" them.
 *
 * Node extends Comparable because the compareTo(o: Node) method is used to order the nodes within the same
 * level in the hierarchy.
 *
 * Node should implement equals and hashCode because these two methods are used to differentiate nodes from each other
 * by value (rather than by reference) during processing by the FinancialSummaryEngine.
 *
 */

@Export
interface Node extends Comparable<Node> {

  /**
  * Store an amount for a column inside this Node.  A column refers to the name of a column on the FinancialsSummaryScreen.
  * CurrencyAmounts can be potentially invalid if two amounts are combined with differing currencies.  This does not happen
  * if all amounts are Claim Amounts.
   */
  function storeAmount(column: String, amount: PotentiallyInvalid<CurrencyAmount>)

  /**
   * Retrieve the amount for a column from this node.  Used for building an FSNode which is eventually displayed by the PCF.
   * Also used for obtaining sums of nodes at one level to place onto nodes at the next highest level.
   */
  function retrieveAmount(column: String): PotentiallyInvalid<CurrencyAmount>

  /**
   * Build an instance of a Node which summarizes the current node instances.  This is essentially a factory method for the node
   * that is one level "up" (summary-wise) from the current node. If two nodes "build" two summary instances which are equal by value,
   * then only one summary node will be used.
  */
  function buildSummaryInstance(): Node

  /**
   * Attach the given children (lower level nodes) to this node.  This is useful for maintaining the hierarchy of nodes that is then traversed
   * so that we can build the FSNodes in the correct order (depth-first) to send to the PCF
   */
  function attachChildren(children: List<Node>)

  /**
   * Builds an FSNode corresponding to this node in the hierarchy.  Nodes are used for computation, FSNodes are passed to the PCF.
   * The separation is there for future cases in which we might compute something differently than we display it.  For now we do not
   * build an FSNode which corresponds the the RootNode in the hierarchy for the ReservingCurrency variant.
   * This is because that FSNode would make no sense; it would correspond
   * to the sum of nodes from differing reserving currencies and we never
   * want to display that.
  */
  function buildFSRow(): FSRow

  /**
  * Obtain the children (lower level) of the current node.  Needed for the recursive depth-first traversal of the Nodes in the hierarchy.
  */
  property get Children(): List<Node>

  /**
   * Obtain the ReserveLines (or more generally the TAccountOwnerDelegates corresponding to the current Node.  This is needed
   * in order to allow the PCF to query and then display all of the relevant transactions that contributed to the amount in the node.
   * @See gw.api.financials.FinancialsUtil#updateCustomTransactionIdsForClaim for how we use this.
  */
  property get TAccountOwnerDelegates(): List<TAccountOwnerDelegate>

  /**
   * Returns the level within the hierarchy. The Root Node, which would correspond to the claim total, is level 1.
   */
  property get Level(): int

  /**
   * Sets the options which can affect the calculations of the Node.  This is used to convey the choice of Fixed/Market rates
   * (via a property inside this options class- UseFloatingFinancials)
   * on many of the calculations out of the box.  The engine will attach this property to each Node when building the hierarchy.
   * Other values which need to be conveyed to the calculations can be passed in this way by expanding the
   * definition of the FinancialSummaryCalculationOptions interface accordingly.
   *
   */
  property set FinancialSummaryCalculationOptions(options : FinancialSummaryCalculationOptions)

  /**
   * See the setter of this property for a full description.
   */
  property get FinancialSummaryCalculationOptions(): FinancialSummaryCalculationOptions
}
