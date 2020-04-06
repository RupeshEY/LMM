package gw.sampledata

uses gw.api.databuilder.FinancialThresholdTriggerBuilder
uses gw.api.databuilder.CustomerServiceTierSpecialHandlingBuilder
uses gw.api.databuilder.FinancialAutomatedActivityHandlerBuilder
uses gw.api.databuilder.FinancialAutomatedNotificationHandlerBuilder
uses gw.api.financials.CurrencyAmount
uses gw.pl.persistence.core.Bundle

@Export
class SampleCustomerServiceTiers extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }


  override property get Description() : String {
    return "Service Tiers"
  }

  override function testSampleData(bundle : Bundle) {
    demoSampleData(bundle)
  }

  override function demoSampleData(bundle : Bundle) {
    createPlatinumCustomerServiceTier(bundle)
    createGoldCustomerServiceTier(bundle)
  }
  
  private function createPlatinumCustomerServiceTier(bundle : Bundle) {
    var p1 = new CustomerServiceTierSpecialHandlingBuilder()
        .withCustomerServiceTier(CustomerServiceTier.TC_PLATINUM)
        .withAutomatedHandler(new FinancialAutomatedActivityHandlerBuilder()
                    .withActivityPattern(ActivityPattern.finder.getActivityPatternByCode("general_reminder"))
                    .withTrigger(new FinancialThresholdTriggerBuilder(new CurrencyAmount(1, Currency.TC_USD))
                            .withCurrency(Currency.TC_USD)
                            .withFinancialThreshold(FinancialThreshold.TC_TOTALPAID)
                            .withTriggeringCause(FinancialTriggerCause.TC_REACHED)))
    .create(bundle)
  }
  
  private function createGoldCustomerServiceTier(bundle : Bundle) {
    var p1 = new CustomerServiceTierSpecialHandlingBuilder()
            .withCustomerServiceTier(CustomerServiceTier.TC_GOLD)                                
            .withAutomatedHandler(new FinancialAutomatedNotificationHandlerBuilder()
                    .withEmailTemplate("FinancialAutomatedNotification.gst")
                    .withEmailRole(ContactRole.TC_INSURED)
                    .withEmailAddress("a@b.com")
                    .withNotificationType(NotificationType.TC_CONTACTROLE)
                    .withTrigger(new FinancialThresholdTriggerBuilder(new CurrencyAmount(1, Currency.TC_USD))
                            .withFinancialThreshold(FinancialThreshold.TC_TOTALPAID)
                            .withTriggeringCause(FinancialTriggerCause.TC_REACHED)
                    )
            ).create(bundle)
  }

}
