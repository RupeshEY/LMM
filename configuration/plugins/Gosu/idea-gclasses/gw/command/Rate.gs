package gw.command

uses com.guidewire.pl.quickjump.Argument
uses java.util.regex.Pattern
uses java.math.BigDecimal
uses com.guidewire.pl.quickjump.DefaultMethod
uses gw.util.financials.FinancialsTestUtil

@Export
@DefaultMethod("conv")
class Rate extends CCBaseCommand {

  construct() {
    var regex = "([a-z]{3})\\s*=\\s*(\\d+\\.?\\d*)\\s*([a-z]{3})"
    pattern = Pattern.compile(regex)
  }
  static var pattern : Pattern

  @Argument("spec")
  function conv() : String {
    print("argument=" + Argument)

    // example usd = 5 GBP
    var m = pattern.matcher(Argument)
    if (!m.matches()) {
      displayMessageAndExit("argument did not match format gbp=6eur")
    }
    var fromCurrency = m.group(1)
    var toCurrency = m.group(3)
    var factor = m.group(2)
    var factorBd = new BigDecimal(factor)
    var fromC = Currency.get(fromCurrency)
    var toC = Currency.get(toCurrency)
    FinancialsTestUtil.setNewMarketRateForPair(fromC, toC, factorBd)
    return("OK, I just set " + fromC.Code + " to " + factorBd + " " + toC.Code)
  }
}
