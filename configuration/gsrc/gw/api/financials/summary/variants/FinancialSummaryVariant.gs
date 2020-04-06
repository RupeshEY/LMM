package gw.api.financials.summary.variants

uses gw.api.financials.summary.LeafBuilder
uses gw.api.financials.summary.Node
uses java.util.List

/**
*
    There are several variants of the Financials Summary Screen, which are chosen by the "view".
    These variants are Claim Cost Only, Claimant, Coverage, Exposure, Exposure Only, Reserving Currency, and
    Recovery Category.
    <P>
    The variant determines several things:
    <P>
    The transactions that qualify for inclusion into the summary view
    For example, Claim Cost Only limits the transactions to those who have a CostType of "claimcost".
    "Exposure only" excludes transactions that are associated with Claim-level reserve lines.
    <P>
    The Rollup hierarchy and Labels
    The financial summary screen presents financial information in a hierarchy.
 */

@Export
interface FinancialSummaryVariant {

 /**
  *  A LeafBuilder is a class that each variant must implement.  A LeafBuilder is responsible for building "Leaf" objects
  *  that contain the lowest level computations of each variant.
  */
  property get LeafBuilder(): LeafBuilder

  /**
   * Defines whether or not to include the FSRow in the ListView for the variant.  This is the means by which the
   * reserving currency variant omits the Claim Total row from the view.
  */
  function includeRowBuiltFrom(node: Node) : boolean

  /**
   * Defines whether or not to use the FSNode that is built from this node as a Root in the RowTree.
   * All variants except ReservingCurrency have a claim total FSNode which is the root node built from the node whose
   * Level is 1.  Only the ReservingCurrency variant omits this and therefore its root nodes are build from node at
   * Level 2, which is the ReservingCurrency level.
   * @param node
   * @return true iff this node should create a Root node for display in the RowTree
   */
  function useRowBuiltFromThisAsRoot(node : Node) : boolean

  /**
   * Returns the TaccountOwnerDelegates for the Claim for this variant.  Out of the box, this returns the Reserve Lines
   * for most of the variants. The exception is the RecoveryCategory variant- that returns RecoveryCodings.
   * But each variant can decide to return a List of any kind of interface that extends TAccountOwnerDelegate
   */
  function getTAccountOwnerDelegates(claim : Claim): List<TAccountOwnerDelegate>


  /**
   * Returns the list of keys which correspond the the "columns" of the FinancialsSummaryScreen.  Each Variant can potentially
   * display a different set of columns.  Each Leaf of the variant must also know how to calculate the value
   * for each key, usually by using a FinancialsCalculator.  The names of these expressions are Strings
   * and configurations are encouraged to use string constants.
   */
  property get Columns(): List<String>
}