package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.document.SymbolProvider
uses gw.document.SimpleSymbol
uses gw.document.GosuCaseInsensitiveBackwardsCompatibleSymbolProvider
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminActivityPatternDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminActivityPatternDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=CreateDocument) at AdminActivityPatternDV.pcf: line 114, column 39
    function action_62 () : void {
      DocumentTemplateSearchPopup.push(symbolProvider)
    }
    
    // 'pickLocation' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function action_69 () : void {
      PickEmailTemplatePopup.push(new gw.api.email.EmailTemplateSearchCriteria({"Activity","Claim"}))
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=CreateDocument) at AdminActivityPatternDV.pcf: line 114, column 39
    function action_dest_63 () : pcf.api.Destination {
      return pcf.DocumentTemplateSearchPopup.createDestination(symbolProvider)
    }
    
    // 'pickLocation' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function action_dest_70 () : pcf.api.Destination {
      return pcf.PickEmailTemplatePopup.createDestination(new gw.api.email.EmailTemplateSearchCriteria({"Activity","Claim"}))
    }
    
    // 'conversionExpression' attribute on DocumentTemplateInput (id=CreateDocument) at AdminActivityPatternDV.pcf: line 114, column 39
    function conversionExpression_64 (PickedValue :  gw.plugin.document.IDocumentTemplateDescriptor) : java.lang.String {
      return PickedValue.TemplateId
    }
    
    // 'conversionExpression' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function conversionExpression_71 (PickedValue :  gw.plugin.email.IEmailTemplateDescriptor) : java.lang.String {
      return PickedValue.getFilename()
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetStartPoint) at AdminActivityPatternDV.pcf: line 164, column 61
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.TargetStartPoint = (__VALUE_TO_SET as typekey.StartPointType)
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetIncludeDays) at AdminActivityPatternDV.pcf: line 171, column 60
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.TargetIncludeDays = (__VALUE_TO_SET as typekey.IncludeDaysType)
    }
    
    // 'value' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function defaultSetter_112 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.TargetBusCalType = (__VALUE_TO_SET as gw.api.activity.BusCalType)
    }
    
    // 'value' attribute on TextInput (id=EscalationDays) at AdminActivityPatternDV.pcf: line 188, column 40
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EscalationDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=EscalationHours) at AdminActivityPatternDV.pcf: line 194, column 40
    function defaultSetter_123 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EscalationHours = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=EscalationStartPoint) at AdminActivityPatternDV.pcf: line 200, column 45
    function defaultSetter_127 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EscalationStartPt = (__VALUE_TO_SET as typekey.StartPointType)
    }
    
    // 'value' attribute on TypeKeyInput (id=ActivityClass) at AdminActivityPatternDV.pcf: line 39, column 43
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.ActivityClass = (__VALUE_TO_SET as typekey.ActivityClass)
    }
    
    // 'value' attribute on TypeKeyInput (id=EscalationIncludeDays) at AdminActivityPatternDV.pcf: line 206, column 45
    function defaultSetter_131 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EscalationInclDays = (__VALUE_TO_SET as typekey.IncludeDaysType)
    }
    
    // 'value' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function defaultSetter_137 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EscalationBusCalType = (__VALUE_TO_SET as gw.api.activity.BusCalType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at AdminActivityPatternDV.pcf: line 53, column 47
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Category = (__VALUE_TO_SET as typekey.ActivityCategory)
    }
    
    // 'value' attribute on TextInput (id=Code) at AdminActivityPatternDV.pcf: line 59, column 39
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Subject) at AdminActivityPatternDV.pcf: line 24, column 41
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Priority) at AdminActivityPatternDV.pcf: line 66, column 39
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Priority = (__VALUE_TO_SET as typekey.Priority)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mandatory) at AdminActivityPatternDV.pcf: line 72, column 44
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Mandatory = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Importance) at AdminActivityPatternDV.pcf: line 79, column 46
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Importance = (__VALUE_TO_SET as typekey.ImportanceLevel)
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimLossType) at AdminActivityPatternDV.pcf: line 85, column 39
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.ClaimLossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AutomatedOnly) at AdminActivityPatternDV.pcf: line 91, column 47
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.AutomatedOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AvailableForClosedClaim) at AdminActivityPatternDV.pcf: line 99, column 52
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.ClosedClaimAvlble = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternallyOwned) at AdminActivityPatternDV.pcf: line 105, column 50
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.ExternallyOwned = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DocumentTemplateInput (id=CreateDocument) at AdminActivityPatternDV.pcf: line 114, column 39
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.DocumentTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ShortSubject) at AdminActivityPatternDV.pcf: line 32, column 47
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.ShortSubject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.EmailTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Recurring) at AdminActivityPatternDV.pcf: line 130, column 44
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Recurring = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at AdminActivityPatternDV.pcf: line 137, column 45
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TargetDays) at AdminActivityPatternDV.pcf: line 150, column 61
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.TargetDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=TargetHours) at AdminActivityPatternDV.pcf: line 157, column 61
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivityPattern.TargetHours = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'editable' attribute on TypeKeyInput (id=ActivityClass) at AdminActivityPatternDV.pcf: line 39, column 43
    function editable_9 () : java.lang.Boolean {
      return !ActivityPattern.SystemPattern
    }
    
    // 'initialValue' attribute on Variable at AdminActivityPatternDV.pcf: line 14, column 46
    function initialValue_0 () : gw.document.SymbolProvider {
      return createSymbolProvider()
    }
    
    // 'outputConversion' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function outputConversion_72 (VALUE :  java.lang.String) : java.lang.String {
      return getDisplayName(VALUE)
    }
    
    // 'required' attribute on TypeKeyInput (id=Category) at AdminActivityPatternDV.pcf: line 53, column 47
    function required_21 () : java.lang.Boolean {
      return !ActivityPattern.AutomatedOnly
    }
    
    // 'valueRange' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function valueRange_114 () : java.lang.Object {
      return getBusCalTypeRange()
    }
    
    // 'value' attribute on TextInput (id=Subject) at AdminActivityPatternDV.pcf: line 24, column 41
    function valueRoot_4 () : java.lang.Object {
      return ActivityPattern
    }
    
    // 'value' attribute on TextInput (id=Subject) at AdminActivityPatternDV.pcf: line 24, column 41
    function value_1 () : java.lang.String {
      return ActivityPattern.Subject
    }
    
    // 'value' attribute on TypeKeyInput (id=ActivityClass) at AdminActivityPatternDV.pcf: line 39, column 43
    function value_10 () : typekey.ActivityClass {
      return ActivityPattern.ActivityClass
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetIncludeDays) at AdminActivityPatternDV.pcf: line 171, column 60
    function value_103 () : typekey.IncludeDaysType {
      return ActivityPattern.TargetIncludeDays
    }
    
    // 'value' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function value_109 () : gw.api.activity.BusCalType {
      return ActivityPattern.TargetBusCalType
    }
    
    // 'value' attribute on TextInput (id=EscalationDays) at AdminActivityPatternDV.pcf: line 188, column 40
    function value_117 () : java.lang.Integer {
      return ActivityPattern.EscalationDays
    }
    
    // 'value' attribute on TextInput (id=EscalationHours) at AdminActivityPatternDV.pcf: line 194, column 40
    function value_121 () : java.lang.Integer {
      return ActivityPattern.EscalationHours
    }
    
    // 'value' attribute on TypeKeyInput (id=EscalationStartPoint) at AdminActivityPatternDV.pcf: line 200, column 45
    function value_125 () : typekey.StartPointType {
      return ActivityPattern.EscalationStartPt
    }
    
    // 'value' attribute on TypeKeyInput (id=EscalationIncludeDays) at AdminActivityPatternDV.pcf: line 206, column 45
    function value_129 () : typekey.IncludeDaysType {
      return ActivityPattern.EscalationInclDays
    }
    
    // 'value' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function value_134 () : gw.api.activity.BusCalType {
      return ActivityPattern.EscalationBusCalType
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at AdminActivityPatternDV.pcf: line 46, column 43
    function value_15 () : typekey.ActivityType {
      return ActivityPattern.Type
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at AdminActivityPatternDV.pcf: line 53, column 47
    function value_19 () : typekey.ActivityCategory {
      return ActivityPattern.Category
    }
    
    // 'value' attribute on TextInput (id=Code) at AdminActivityPatternDV.pcf: line 59, column 39
    function value_26 () : java.lang.String {
      return ActivityPattern.Code
    }
    
    // 'value' attribute on TypeKeyInput (id=Priority) at AdminActivityPatternDV.pcf: line 66, column 39
    function value_31 () : typekey.Priority {
      return ActivityPattern.Priority
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mandatory) at AdminActivityPatternDV.pcf: line 72, column 44
    function value_35 () : java.lang.Boolean {
      return ActivityPattern.Mandatory
    }
    
    // 'value' attribute on TypeKeyInput (id=Importance) at AdminActivityPatternDV.pcf: line 79, column 46
    function value_39 () : typekey.ImportanceLevel {
      return ActivityPattern.Importance
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimLossType) at AdminActivityPatternDV.pcf: line 85, column 39
    function value_43 () : typekey.LossType {
      return ActivityPattern.ClaimLossType
    }
    
    // 'value' attribute on BooleanRadioInput (id=AutomatedOnly) at AdminActivityPatternDV.pcf: line 91, column 47
    function value_48 () : java.lang.Boolean {
      return ActivityPattern.AutomatedOnly
    }
    
    // 'value' attribute on TextInput (id=ShortSubject) at AdminActivityPatternDV.pcf: line 32, column 47
    function value_5 () : java.lang.String {
      return ActivityPattern.ShortSubject
    }
    
    // 'value' attribute on BooleanRadioInput (id=AvailableForClosedClaim) at AdminActivityPatternDV.pcf: line 99, column 52
    function value_53 () : java.lang.Boolean {
      return ActivityPattern.ClosedClaimAvlble
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternallyOwned) at AdminActivityPatternDV.pcf: line 105, column 50
    function value_57 () : java.lang.Boolean {
      return ActivityPattern.ExternallyOwned
    }
    
    // 'value' attribute on DocumentTemplateInput (id=CreateDocument) at AdminActivityPatternDV.pcf: line 114, column 39
    function value_61 () : java.lang.String {
      return ActivityPattern.DocumentTemplate
    }
    
    // 'value' attribute on PickerInput (id=EmailTemplate) at AdminActivityPatternDV.pcf: line 124, column 39
    function value_68 () : java.lang.String {
      return ActivityPattern.EmailTemplate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Recurring) at AdminActivityPatternDV.pcf: line 130, column 44
    function value_76 () : java.lang.Boolean {
      return ActivityPattern.Recurring
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at AdminActivityPatternDV.pcf: line 137, column 45
    function value_80 () : java.lang.String {
      return ActivityPattern.Description
    }
    
    // 'value' attribute on TextInput (id=TargetDays) at AdminActivityPatternDV.pcf: line 150, column 61
    function value_85 () : java.lang.Integer {
      return ActivityPattern.TargetDays
    }
    
    // 'value' attribute on TextInput (id=TargetHours) at AdminActivityPatternDV.pcf: line 157, column 61
    function value_91 () : java.lang.Integer {
      return ActivityPattern.TargetHours
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetStartPoint) at AdminActivityPatternDV.pcf: line 164, column 61
    function value_97 () : typekey.StartPointType {
      return ActivityPattern.TargetStartPoint
    }
    
    // 'valueRange' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function verifyValueRangeIsAllowedType_115 ($$arg :  gw.api.activity.BusCalType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function verifyValueRangeIsAllowedType_115 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function verifyValueRangeIsAllowedType_140 ($$arg :  gw.api.activity.BusCalType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function verifyValueRangeIsAllowedType_140 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function verifyValueRange_116 () : void {
      var __valueRangeArg = getBusCalTypeRange()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_115(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function verifyValueRange_141 () : void {
      var __valueRangeArg = getBusCalTypeRange()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_140(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=TargetBusCalType) at AdminActivityPatternDV.pcf: line 182, column 89
    function visible_108 () : java.lang.Boolean {
      return ActivityPattern.TargetIncludeDays == IncludeDaysType.TC_BUSINESSDAYS
    }
    
    // 'visible' attribute on RangeInput (id=EscalationBusCalType) at AdminActivityPatternDV.pcf: line 217, column 90
    function visible_133 () : java.lang.Boolean {
      return ActivityPattern.EscalationInclDays == IncludeDaysType.TC_BUSINESSDAYS
    }
    
    // 'visible' attribute on TextInput (id=TargetDays) at AdminActivityPatternDV.pcf: line 150, column 61
    function visible_84 () : java.lang.Boolean {
      return ActivityPattern.ActivityClass == TC_TASK
    }
    
    property get ActivityPattern () : ActivityPattern {
      return getRequireValue("ActivityPattern", 0) as ActivityPattern
    }
    
    property set ActivityPattern ($arg :  ActivityPattern) {
      setRequireValue("ActivityPattern", 0, $arg)
    }
    
    property get symbolProvider () : gw.document.SymbolProvider {
      return getVariableValue("symbolProvider", 0) as gw.document.SymbolProvider
    }
    
    property set symbolProvider ($arg :  gw.document.SymbolProvider) {
      setVariableValue("symbolProvider", 0, $arg)
    }
    
    
          function createSymbolProvider(): SymbolProvider {
            return new GosuCaseInsensitiveBackwardsCompatibleSymbolProvider({
              "Activity"->SimpleSymbol.PLACEHOLDER,
              "Claim"->SimpleSymbol.PLACEHOLDER
            })
          }
    
          function getBusCalTypeRange(): java.util.List<gw.api.activity.BusCalType> {
            try {
              return gw.api.activity.BusCalType.createListWithLocations(
                {
                  DisplayKey.get("Web.Admin.ActivityPatterns.ClaimLossLocation")->"Activity.Claim.LossLocation"
                });
            } catch (e: java.lang.Throwable) {
              throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ActivityPattern.Configuration.BusinessCalendarLocation.Error"));
            }
          }
    
          function getDisplayName(templateFilename: String): String {
            if (templateFilename == null) {
              return null;
            }
            var ets = gw.pcf.specialhandling.EmailTemplateUtil.EmailTemplatePlugin
            if (ets.getEmailTemplate(templateFilename) == null) {
              return DisplayKey.get("Web.Email.TemplateNotFound");
            }
            return ets.getEmailTemplate(templateFilename).getName();
          }
    
    
  }
  
  
}