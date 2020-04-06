package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsSummaryPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsSummaryPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFMessageDetailsSummaryPanelSet.pcf: line 49, column 40
    function def_onEnter_18 (def :  pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_Ext) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on InputSetRef at ECFMessageDetailsSummaryPanelSet.pcf: line 49, column 40
    function def_onEnter_20 (def :  pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_default) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on InputSetRef at ECFMessageDetailsSummaryPanelSet.pcf: line 49, column 40
    function def_refreshVariables_19 (def :  pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_Ext) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on InputSetRef at ECFMessageDetailsSummaryPanelSet.pcf: line 49, column 40
    function def_refreshVariables_21 (def :  pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_default) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'mode' attribute on InputSetRef at ECFMessageDetailsSummaryPanelSet.pcf: line 49, column 40
    function mode_22 () : java.lang.Object {
      return claimDataMsg.Subtype
    }
    
    // 'outputConversion' attribute on TextInput (id=ClaimDataLossDateQualifier) at ECFMessageDetailsSummaryPanelSet.pcf: line 120, column 57
    function outputConversion_59 (VALUE :  typekey.ECFLossDateQualifier_Ext) : java.lang.String {
      return VALUE == null ? "" : DisplayKey.get("Accelerator.IPLM.Web.ECFMessageDetails.LossDateQualifier.Output", VALUE.Code, VALUE.Description)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 220, column 54
    function sortValue_101 (err :  ECFMessageErrorOrWarning_Ext) : java.lang.Object {
      return err.ErrorType.DisplayName
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 226, column 42
    function sortValue_102 (err :  ECFMessageErrorOrWarning_Ext) : java.lang.Object {
      return err.ErrorCode
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 232, column 44
    function sortValue_103 (err :  ECFMessageErrorOrWarning_Ext) : java.lang.Object {
      return err.Description
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 256, column 52
    function sortValue_114 (softWarning :  ECFMessageSoftWarning_Ext) : java.lang.Object {
      return softWarning.Description
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 154, column 45
    function sortValue_68 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.DocType.Code
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 160, column 44
    function sortValue_69 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.Description
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 166, column 44
    function sortValue_70 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.VersionDate
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 172, column 43
    function sortValue_71 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.DocumentId
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 178, column 42
    function sortValue_72 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.Reference
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 184, column 40
    function sortValue_73 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.Version
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 190, column 48
    function sortValue_74 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.FileFormat.Code
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 196, column 37
    function sortValue_75 (doc :  ECFMessageClaimDataDocument_Ext) : java.lang.Object {
      return doc.Size
    }
    
    // 'value' attribute on TextInput (id=ClaimDataStatus) at ECFMessageDetailsSummaryPanelSet.pcf: line 34, column 56
    function valueRoot_11 () : java.lang.Object {
      return claimDataMsg.TransactionStatus
    }
    
    // 'value' attribute on TextInput (id=ClaimDataUUID) at ECFMessageDetailsSummaryPanelSet.pcf: line 19, column 38
    function valueRoot_2 () : java.lang.Object {
      return claimDataMsg
    }
    
    // 'value' attribute on TextInput (id=claimStatus) at ECFMessageDetailsSummaryPanelSet.pcf: line 76, column 50
    function valueRoot_36 () : java.lang.Object {
      return claimDataMsg.ClaimStatus
    }
    
    // 'value' attribute on TextInput (id=LineOfBusiness) at ECFMessageDetailsSummaryPanelSet.pcf: line 91, column 54
    function valueRoot_45 () : java.lang.Object {
      return claimDataMsg.ClassOfBusiness
    }
    
    // 'value' attribute on TextInput (id=PcsCatastropheCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 125, column 57
    function valueRoot_64 () : java.lang.Object {
      return claimDataMsg.PcsCatastropheCode
    }
    
    // 'value' attribute on TextInput (id=LcoCatastropheCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 130, column 57
    function valueRoot_67 () : java.lang.Object {
      return claimDataMsg.LcoCatastropheCode
    }
    
    // 'value' attribute on TextInput (id=ClaimDataUUID) at ECFMessageDetailsSummaryPanelSet.pcf: line 19, column 38
    function value_0 () : java.lang.String {
      return claimDataMsg.UUID
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 147, column 61
    function value_100 () : ECFMessageClaimDataDocument_Ext[] {
      return claimDataMsg.Docs
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 213, column 58
    function value_113 () : ECFMessageErrorOrWarning_Ext[] {
      return claimDataMsg.ErrorsOrWarnings
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsSummaryPanelSet.pcf: line 249, column 55
    function value_118 () : ECFMessageSoftWarning_Ext[] {
      return claimDataMsg.SoftWarnings
    }
    
    // 'value' attribute on TextInput (id=ClaimDataDescription) at ECFMessageDetailsSummaryPanelSet.pcf: line 39, column 50
    function value_12 () : java.lang.String {
      return claimDataMsg.AmendmentDetails
    }
    
    // 'value' attribute on TextInput (id=ClaimDataTime) at ECFMessageDetailsSummaryPanelSet.pcf: line 45, column 39
    function value_15 () : java.util.Date {
      return claimDataMsg.OriginTimeStamp
    }
    
    // 'value' attribute on TextInput (id=UCR) at ECFMessageDetailsSummaryPanelSet.pcf: line 59, column 37
    function value_23 () : java.lang.String {
      return claimDataMsg.UCR
    }
    
    // 'value' attribute on TextInput (id=TriageCategory) at ECFMessageDetailsSummaryPanelSet.pcf: line 66, column 49
    function value_27 () : typekey.ECFTriageCode_Ext {
      return claimDataMsg.TriageCategory
    }
    
    // 'value' attribute on TextInput (id=ClaimDataTR) at ECFMessageDetailsSummaryPanelSet.pcf: line 24, column 36
    function value_3 () : java.lang.String {
      return claimDataMsg.TR
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ECFMessageDetailsSummaryPanelSet.pcf: line 71, column 42
    function value_31 () : java.lang.String {
      return claimDataMsg.Claimant
    }
    
    // 'value' attribute on TextInput (id=claimStatus) at ECFMessageDetailsSummaryPanelSet.pcf: line 76, column 50
    function value_34 () : java.lang.String {
      return claimDataMsg.ClaimStatus.Code
    }
    
    // 'value' attribute on TextInput (id=LossOrEventName) at ECFMessageDetailsSummaryPanelSet.pcf: line 81, column 49
    function value_37 () : java.lang.String {
      return claimDataMsg.LossOrEventName
    }
    
    // 'value' attribute on TextInput (id=LossDescription) at ECFMessageDetailsSummaryPanelSet.pcf: line 86, column 45
    function value_40 () : java.lang.String {
      return claimDataMsg.LossDetails
    }
    
    // 'value' attribute on TextInput (id=LineOfBusiness) at ECFMessageDetailsSummaryPanelSet.pcf: line 91, column 54
    function value_43 () : java.lang.String {
      return claimDataMsg.ClassOfBusiness.Code
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ECFMessageDetailsSummaryPanelSet.pcf: line 96, column 43
    function value_46 () : java.lang.String {
      return claimDataMsg.LossCause
    }
    
    // 'value' attribute on TextAreaInput (id=LossLocation) at ECFMessageDetailsSummaryPanelSet.pcf: line 101, column 46
    function value_49 () : java.lang.String {
      return claimDataMsg.LossLocation
    }
    
    // 'value' attribute on DateInput (id=LossStartDate) at ECFMessageDetailsSummaryPanelSet.pcf: line 107, column 39
    function value_52 () : java.util.Date {
      return claimDataMsg.LossStartDate
    }
    
    // 'value' attribute on DateInput (id=LossEndDate) at ECFMessageDetailsSummaryPanelSet.pcf: line 113, column 39
    function value_55 () : java.util.Date {
      return claimDataMsg.LossEndDate
    }
    
    // 'value' attribute on TextInput (id=ClaimDataLossDateQualifier) at ECFMessageDetailsSummaryPanelSet.pcf: line 120, column 57
    function value_58 () : typekey.ECFLossDateQualifier_Ext {
      return claimDataMsg.LossDateQualifier
    }
    
    // 'value' attribute on TextInput (id=ClaimDataSequenceNo) at ECFMessageDetailsSummaryPanelSet.pcf: line 29, column 53
    function value_6 () : java.lang.String {
      return claimDataMsg.TransactionSequence
    }
    
    // 'value' attribute on TextInput (id=PcsCatastropheCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 125, column 57
    function value_62 () : java.lang.String {
      return claimDataMsg.PcsCatastropheCode.Code
    }
    
    // 'value' attribute on TextInput (id=LcoCatastropheCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 130, column 57
    function value_65 () : java.lang.String {
      return claimDataMsg.LcoCatastropheCode.Code
    }
    
    // 'value' attribute on TextInput (id=ClaimDataStatus) at ECFMessageDetailsSummaryPanelSet.pcf: line 34, column 56
    function value_9 () : java.lang.String {
      return claimDataMsg.TransactionStatus.Code
    }
    
    // 'visible' attribute on TextInput (id=TriageCategory) at ECFMessageDetailsSummaryPanelSet.pcf: line 66, column 49
    function visible_26 () : java.lang.Boolean {
      return claimDataMsg.LloydsMessage
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getRequireValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimDataMsg", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ECFMessageDetailsSummaryPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ErrorType) at ECFMessageDetailsSummaryPanelSet.pcf: line 220, column 54
    function valueRoot_106 () : java.lang.Object {
      return err.ErrorType
    }
    
    // 'value' attribute on TextCell (id=ErrorCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 226, column 42
    function valueRoot_109 () : java.lang.Object {
      return err
    }
    
    // 'value' attribute on TextCell (id=ErrorType) at ECFMessageDetailsSummaryPanelSet.pcf: line 220, column 54
    function value_104 () : java.lang.String {
      return err.ErrorType.DisplayName
    }
    
    // 'value' attribute on TextCell (id=ErrorCode) at ECFMessageDetailsSummaryPanelSet.pcf: line 226, column 42
    function value_107 () : java.lang.String {
      return err.ErrorCode
    }
    
    // 'value' attribute on TextCell (id=ErrorsOrWarningDescription) at ECFMessageDetailsSummaryPanelSet.pcf: line 232, column 44
    function value_110 () : java.lang.String {
      return err.Description
    }
    
    property get err () : ECFMessageErrorOrWarning_Ext {
      return getIteratedValue(1) as ECFMessageErrorOrWarning_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ECFMessageDetailsSummaryPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=SoftWarningDescription) at ECFMessageDetailsSummaryPanelSet.pcf: line 256, column 52
    function valueRoot_117 () : java.lang.Object {
      return softWarning
    }
    
    // 'value' attribute on TextCell (id=SoftWarningDescription) at ECFMessageDetailsSummaryPanelSet.pcf: line 256, column 52
    function value_115 () : java.lang.String {
      return softWarning.Description
    }
    
    property get softWarning () : ECFMessageSoftWarning_Ext {
      return getIteratedValue(1) as ECFMessageSoftWarning_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsSummaryPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ECFMessageDetailsSummaryPanelSet.pcf: line 154, column 45
    function valueRoot_78 () : java.lang.Object {
      return doc.DocType
    }
    
    // 'value' attribute on TextCell (id=Desc) at ECFMessageDetailsSummaryPanelSet.pcf: line 160, column 44
    function valueRoot_81 () : java.lang.Object {
      return doc
    }
    
    // 'value' attribute on TextCell (id=Format) at ECFMessageDetailsSummaryPanelSet.pcf: line 190, column 48
    function valueRoot_96 () : java.lang.Object {
      return doc.FileFormat
    }
    
    // 'value' attribute on TextCell (id=Type) at ECFMessageDetailsSummaryPanelSet.pcf: line 154, column 45
    function value_76 () : java.lang.String {
      return doc.DocType.Code
    }
    
    // 'value' attribute on TextCell (id=Desc) at ECFMessageDetailsSummaryPanelSet.pcf: line 160, column 44
    function value_79 () : java.lang.String {
      return doc.Description
    }
    
    // 'value' attribute on DateCell (id=Date) at ECFMessageDetailsSummaryPanelSet.pcf: line 166, column 44
    function value_82 () : java.util.Date {
      return doc.VersionDate
    }
    
    // 'value' attribute on TextCell (id=DocumentId) at ECFMessageDetailsSummaryPanelSet.pcf: line 172, column 43
    function value_85 () : java.lang.String {
      return doc.DocumentId
    }
    
    // 'value' attribute on TextCell (id=Reference) at ECFMessageDetailsSummaryPanelSet.pcf: line 178, column 42
    function value_88 () : java.lang.String {
      return doc.Reference
    }
    
    // 'value' attribute on TextCell (id=Version) at ECFMessageDetailsSummaryPanelSet.pcf: line 184, column 40
    function value_91 () : java.lang.String {
      return doc.Version
    }
    
    // 'value' attribute on TextCell (id=Format) at ECFMessageDetailsSummaryPanelSet.pcf: line 190, column 48
    function value_94 () : java.lang.String {
      return doc.FileFormat.Code
    }
    
    // 'value' attribute on TextCell (id=Size) at ECFMessageDetailsSummaryPanelSet.pcf: line 196, column 37
    function value_97 () : java.lang.String {
      return doc.Size
    }
    
    property get doc () : ECFMessageClaimDataDocument_Ext {
      return getIteratedValue(1) as ECFMessageClaimDataDocument_Ext
    }
    
    
  }
  
  
}