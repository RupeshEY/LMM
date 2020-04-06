package gw.api.financials.summary.variants

uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses gw.api.locale.DisplayKey
uses org.apache.commons.lang.builder.HashCodeBuilder

uses java.lang.UnsupportedOperationException

/**
* Top-level node that stores the Claim Total for use in the FinancialsSummaryScreen.
* Also the parent of all summary and leaf nodes in the hierarchy. Its parent is AbstractNode which only has some extra
* behavior.  There can only be one RootNode per variant.
*/

@Export
class RootNode extends AbstractNode implements Node {

  construct(claim: Claim) {
    super(claim)
  }

  override function buildSummaryInstance(): Node {
    throw new UnsupportedOperationException("top level summary nodes cannot have summary instances")
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis RootNode )) {
      return false
    }
    //all root nodes for the same claim should equal each other.
    return this._claim == ((obj as RootNode)._claim)
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return DisplayKey.get("Java.Financials.Summary.ClaimTotal")
  }

  override public property get Level(): int {
    return 1
  }

  override function populateFSRow(fsRow: FSRow) {
    fsRow.Claim = _claim
  }
}