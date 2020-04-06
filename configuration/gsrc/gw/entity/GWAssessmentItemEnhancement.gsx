package gw.entity;
uses java.lang.IllegalStateException

@Export
enhancement GWAssessmentItemEnhancement : entity.AssessmentItem
{
  function approveAssessmentItem() {
    this.Action = TC_APPROVE;
  }

  function associateAssessmentItem(selectedsource: AssessmentSource) {
    this.AssessmentSource = selectedsource; 
  }


  function updateAssessmentItemWithSource(myAssessmentSource : AssessmentSource) {
     if (this.AssessmentSource != myAssessmentSource) {
         this.AssessmentSource = myAssessmentSource                     
     }  
  }
 
  function denyAssessmentItem() {
    this.Action = TC_DENY;
  }
}
