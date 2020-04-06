package gw.subrogation.financials


uses gw.api.financials.CurrencyAmount

uses java.lang.Comparable
uses java.util.ArrayList
uses java.util.HashMap
uses java.util.Map

@Export
abstract class AbstractSubroFinsNode implements Comparable {
  protected var _label : String
  protected var _reserveLine : ReserveLine as ReserveLine
  protected var _adverseParty : SubroAdverseParty as AdverseParty
  protected var _children : List<AbstractSubroFinsNode> as Children

  protected var _calculations : Map<SubrogationCalculationsEnum, CurrencyAmount> as Calculations

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty) {
    _reserveLine = reserveLine
    _children = new ArrayList<AbstractSubroFinsNode>()
    _adverseParty = adverseParty
    _calculations = new HashMap<SubrogationCalculationsEnum, CurrencyAmount>()
  }

  abstract property get SummaryRow() : AbstractSubroFinsNode

  abstract override function hashCode(): int

  abstract override function equals(obj : Object) : boolean

  abstract function compareTo(obj : Object) : int

  abstract property get Level() : int

  abstract property get Label() : String
}