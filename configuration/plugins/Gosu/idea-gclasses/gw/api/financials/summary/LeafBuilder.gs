package gw.api.financials.summary

/**
 * Note that in the explanation below, the use of ReserveLine is for clarity.
 * The system also accepts any TAccountOwnerDelegate in its place. Out of the box, most variants use ReserveLines.
 * By allowing for the more general case of TAccountOwnerDelegate, the screen can be based on RecoveryCodings.
 *
 * The FinancialsSummaryEngine performs its work by passing a claim's ReserveLines into a LeafBuilder instance.
 * A LeafBuilder is a class that each variant must implement.  A LeafBuilder is responsible for building "Leaf" objects
 * that contain the lowest level computations of each variant.  For example, the LeafBuilder for the ClaimCostOnlyVariant
 * is the FinSumClaimCostOnlyLeafBuilder.  This class constructs the Leaf node for that variant by first deciding if
 * the reserve line has a cost type of "ClaimCost".  Only if it does, will the resulting Leaf object get constructed.
 * This is the mechanism by which variants can decide whether to include certain transactions or not. By inspecting the
 * reserve line's properties, they can choose to build or not build a leaf node.
 *
 *
 * Its possible for a LeafBuilder implementation to take three different courses of action when its build() method
 * is called with a ReserveLine.
 *
 * a) It can return null, and therefore exclude all the transactions associated with the reserve line from the hierarchy.
 *    It will exclude these amounts from the claim total also.
 *
 * b) It can construct one leaf node that corresponds to the one reserve line, thereby including it in the variant.
 *
 * c) None of the OOTB variants do this, but its possible to keep set of already-constructed leaf nodes and return a
 *    reference to an already returned one.  This would be useful, for example, if the financial calculations involving
 *    two or more reserve lines need to be mapped to the same leaf node.  One could use this technique for keeping the
 *    lowest level of the hierarchy at Exposure/CostCategory/Reserving Currency.  All reserves lines with the differing
 *    Cost Types, but with the same combination of {Exposure/CostCategory/Reserving Currency} could be combined within the
 *    leaf node.
 */
@Export
interface LeafBuilder {

  /**
   * Build the appropriate Leaf instance given the data on the taccountOwnerDelegate
   */
  function build(taccountOwnerDelegate: TAccountOwnerDelegate): Leaf
}