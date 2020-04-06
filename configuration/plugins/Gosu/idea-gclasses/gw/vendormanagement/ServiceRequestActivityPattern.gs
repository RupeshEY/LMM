package gw.vendormanagement

@Export
enum ServiceRequestActivityPattern {
  INVOICE_NOT_AUTO_APPROVED("invoice_not_auto_approved"),
  INVOICE_NOT_AUTO_PAID("invoice_not_auto_paid"),
  VENDOR_ADDED_QUOTE("vendor_added_quote"),
  VENDOR_COMPLETED_WORK("vendor_completed_work"),
  VENDOR_DECLINED_WORK("vendor_declined_work"),
  VENDOR_CANCELED_WORK("vendor_canceled_work"),
  VENDOR_SENT_QUESTION_MESSAGE("vendor_sent_question_message"),
  VENDOR_ADDED_DELAY("vendor_added_delay"),
  VENDOR_DID_NOT_ACCEPT_WORK("vendor_did_not_accept_work"),
  VENDOR_PAST_EXPECTED_QUOTE_COMPLETION_DATE("vendor_past_expected_quote_completion_date"),
  VENDOR_PAST_EXPECTED_SERVICE_COMPLETION_DATE("vendor_past_expected_service_completion_date")

  var _code: String as readonly PatternCode
  private construct(activityPatternCode: String) {
    _code = activityPatternCode
  }

  property get Pattern(): ActivityPattern {
    return ActivityPattern.finder.getActivityPatternByCode(PatternCode)
  }

}
