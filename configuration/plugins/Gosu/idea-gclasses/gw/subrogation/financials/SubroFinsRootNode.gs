package gw.subrogation.financials

uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class SubroFinsRootNode extends AbstractSubroFinsNode {

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty) {
    super(reserveLine, adverseParty)
  }

  property get SummaryRow() : AbstractSubroFinsNode {
    return null
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .toHashCode()
  }

  override function equals(obj : Object) : boolean {
    return obj typeis SubroFinsRootNode
  }

  function compareTo(obj : Object) : int {
    return 0
  }

  property get Level() : int {
    return 0
  }

  property get Label() : String {
    return "Root"
  }

}