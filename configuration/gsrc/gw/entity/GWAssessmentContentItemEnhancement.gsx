package gw.entity;
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWAssessmentContentItemEnhancement : entity.AssessmentContentItem
{
  function getItemValue(): CurrencyAmount {
    var ItemValue = this.PurchaseCost-this.Salvage-this.Depreciation;
    return ItemValue;
  }

  function denyAssessmentItem() {
    this.Action = TC_DENY
  }

  function approveAssessmentItem() {
    this.Action = TC_APPROVE
  }

  function associateAssessmentItem(selectedsource: AssessmentSource) {
    this.AssessmentSource = selectedsource;
  }


  function contentItemValue() : CurrencyAmount
  {
    var zero = 0bd.ofCurrency(this.ClaimCurrency)
    var total : CurrencyAmount = zero;
    if (this.PurchaseCost != null) {
      total = this.PurchaseCost ;
    }
    if (this.Salvage != null) {
      total = total - this.Salvage;
    }
    if (this.Depreciation != null) {
      total = total - this.Depreciation;
    }
    if (total < zero) {
      total = zero;
    }
   
    return total;
  }

  function updateAssessmentSource(myAssessmentSource : AssessmentSource) {    
    if (this.AssessmentSource != myAssessmentSource) {
      this.AssessmentSource = myAssessmentSource;                
    }
  }
}
