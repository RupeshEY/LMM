package gw.subrogation.financials

uses gw.api.financials.CurrencyAmount

uses java.util.Map

@Export
class SubroFinsResult {

  private var _map : Map<SubrogationCalculationsEnum, CurrencyAmount> as Totals
  private var _nodes : List<AbstractSubroFinsNode> as Nodes

  construct(map : Map<SubrogationCalculationsEnum, CurrencyAmount>, nodes : List<AbstractSubroFinsNode>) {
    _map = map
    _nodes = nodes
  }

  public static function make(map : Map<SubrogationCalculationsEnum, CurrencyAmount>, nodes : List<AbstractSubroFinsNode>) : SubroFinsResult {
    return new SubroFinsResult(map, nodes)
  }
}