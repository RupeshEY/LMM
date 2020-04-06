package gw.subrogation.financials

@Export
public class AdversePartyWrapper {
  private var _adverseParty : SubroAdverseParty

  public construct(adverseParty : SubroAdverseParty) {
    _adverseParty = adverseParty
  }

  public property get AdverseParty() : SubroAdverseParty {
    //The adverseParty was removed so the wrapper will get rid of it
    if(_adverseParty.Bundle == null) {
      _adverseParty = null
      return null
    } else {
      return _adverseParty
    }
  }

  public property set AdverseParty( adverseParty : SubroAdverseParty ) {
    _adverseParty = adverseParty
  }

  override function equals(obj : Object) : boolean {
    return obj typeis AdversePartyWrapper
      and obj.AdverseParty == this.AdverseParty
  }

}
