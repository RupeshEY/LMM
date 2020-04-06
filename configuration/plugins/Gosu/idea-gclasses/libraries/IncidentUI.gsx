package libraries
uses gw.api.financials.CurrencyAmount

@Export
enhancement IncidentUI : entity.Incident
{
  function isSuitableForExposure(exposure : Exposure) : boolean {
    // Not ideal to use typeis, but cannot override methods per subclass in Gosu yet
    if (this typeis VehicleIncident) {
      // For a vehicle incident, the vehicle loss party must match the exposure loss party, if it is
      // non null. This method is called on a new exposure so the loss party may not be set yet. If
      // not, then assume the UI will set it to the first possible loss party by default
      var vehicleIncident = this
      var lossParty = exposure.LossParty != null ? exposure.LossParty : exposure.PossibleLossParties[0];
      return vehicleIncident.VehicleLossParty == null || vehicleIncident.VehicleLossParty == lossParty;
    } else {
      return true;
    }
  }

  function createAssessmentSource() : entity.AssessmentSource {
      var source = new AssessmentSource(this) ;
      this.addToSourceLine( source );
      return source ;  
    }

  function ApprovedContentTotal() : CurrencyAmount {
      var TotalOfContentApproved: CurrencyAmount = new CurrencyAmount(0, this.ClaimCurrency) ; 
      for (aline in this.ContentItemLine) {
        if (aline.Action == TC_APPROVE) {
          TotalOfContentApproved = TotalOfContentApproved + aline.contentItemValue();        
        }
      }
  
      return TotalOfContentApproved;
    }

  function ApprovedTotal() : CurrencyAmount {
      var TotalOfApproved: CurrencyAmount = new CurrencyAmount(0, this.ClaimCurrency) ; 
   
   
      for (aline in this.ItemLine) {
        if (aline.Action == TC_APPROVE) {
             if (aline.EstimateAmount != null) {
                TotalOfApproved = TotalOfApproved + aline.EstimateAmount;
             }
          }
      }
  
      return TotalOfApproved;
    }

  function ReviewTotal() : CurrencyAmount {
      var TotalOfInReview: CurrencyAmount = new CurrencyAmount(0, this.ClaimCurrency);
      for (aline in this.ItemLine) {
        if (aline.Action == TC_REVIEW or aline.Action == null) {
          if (aline.EstimateAmount != null) {
            TotalOfInReview = TotalOfInReview + aline.EstimateAmount;
          }
        }
      }
      return TotalOfInReview;
    }

  function ReviewContentTotal() : CurrencyAmount {
      var TotalOfInReview: CurrencyAmount = new CurrencyAmount(0, this.ClaimCurrency) ; 
      for (aline in this.ContentItemLine) {
        if (aline.Action == TC_REVIEW or aline.Action == null or aline.Action==TC_DEPRECIATE) {
               TotalOfInReview = TotalOfInReview + aline.contentItemValue();
        }
      }
        
      return TotalOfInReview;
    }

  function getLineItems(source: AssessmentSource) : AssessmentItem[] {
    return this.ItemLine.where(\ i -> i.AssessmentSource == source)
  }

  function createAssessmentItem() : AssessmentItem {
      var source = new AssessmentItem(this) ;
      this.addToItemLine( source );
      return source ;  
    }

  function createAssessmentContentItem() : AssessmentContentItem {
      var source = new AssessmentContentItem(this) ;
      this.addToContentItemLine( source );
      return source ;  
    }

  function getContentLineItems(source: AssessmentSource) : AssessmentContentItem[] {
    return this.ContentItemLine.where(\ c -> c.AssessmentSource == source)
  }


}