package gw.api.financials.summary

uses java.util.List

/**
 * Leaf nodes (gw.api.financials.summary.Leaf) are value
 * objects which can store the results of the lowest level financials calculations.
 * (They need not strictly be calculations- they could simply retrieve the value
 * from an extension field if necessary)
 * They are subclasses of a more general interface called gw.api.financials.summary.Node
 * which can contain rolled-up sums from the nodes and leaf nodes "below" them.
 */

@Export
interface Leaf extends Node {

  /**
  * Ask the Leaf to calculate and store amounts for all the columns in the list.  Leaf implementations
  * can do their calculations using a FinancialsCalculator, or any other mechanism of their choosing.
  * Do not skip over any columns; doing so will cause the
  * FinancialsSummaryEngine to throw an IllegalStateException at runtime.
  */
  function calculateAmounts(columns: List<String>)
}