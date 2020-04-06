package gw.plugin.policy.notification.pc800

uses gw.plugin.policy.IPolicySystemNotificationPlugin
uses gw.plugin.policy.PolicySystemRetryableException
uses gw.plugin.policy.PolicySystemAlreadyExecutedException
uses wsi.remote.gw.webservice.pc.pc800.claimtopolicysystemnotificationapi.ClaimToPolicySystemNotificationAPI
uses java.util.Date
uses wsi.remote.gw.webservice.pc.pc800.claimtopolicysystemnotificationapi.faults.AlreadyExecutedException
uses java.lang.Exception
uses gw.pl.currency.MonetaryAmount
uses gw.api.financials.CurrencyAmount
uses gw.api.util.LocaleUtil

/**
 * Implementation of IPolicySystemNotificationPlugin that uses web services to
 * notify Guidewire PolicyCenter
 */
@Export
class PCPolicySystemNotificationPlugin implements IPolicySystemNotificationPlugin {

  private property get NotificationPlugin() : ClaimToPolicySystemNotificationAPI {
     var plugin = new ClaimToPolicySystemNotificationAPI()
     plugin.Config.Guidewire.Locale = LocaleUtil.CurrentLanguage.toString()
     return plugin
  }
  
  override function claimExceedsLargeLossThreshold(lossDate : Date,
          policyNumber : String, grossTotalIncurred : String, transactionId : String) {
    // Whereas the previous versions of PolicyCenter used to accept the currency amount in String format, v8 now takes
    // a MonetaryAmount type instead (owing to MultiCurrency considerations). Hence we need to convert the input string
    // (in "100 USD" format) to a MonetaryAmount type. We could have just done "new MonetaryAmount(grossTotalIncurred)"
    // directly, but that would introduce an unnecessary assumption that the input string is always going to be in a
    // "MonetaryAmount-compatible" format. This needn't always be the case, so we are instead assuming that the input
    // string would always be in "CurrencyAmount-compatible" format instead. Of course, converting from CurrencyAmount
    // to MonetaryAmount is a breeze, so this is a pretty flexible assumption to make anyway.
    var grossTotalIncurredCurrencyAmount = new CurrencyAmount(grossTotalIncurred)
    var grossTotalIncurredMonetaryAmount = new MonetaryAmount(grossTotalIncurredCurrencyAmount.Amount,
            grossTotalIncurredCurrencyAmount.Currency)

    executeNotification(\ -> {
      NotificationPlugin.claimExceedsThreshold(lossDate, policyNumber, grossTotalIncurredMonetaryAmount, transactionId)
    })
  }
  
  private function executeNotification(notification()) {
    try {
      notification()
    } catch (e : AlreadyExecutedException) {
      throw new PolicySystemAlreadyExecutedException("Policy system already processed this notification", e)
    } catch (e : Exception) {
      throw new PolicySystemRetryableException("SOAP error when contacting policy system", e)
    }
  }

}
