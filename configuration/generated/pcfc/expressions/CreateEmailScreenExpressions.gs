package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Map
uses gw.plugin.email.IEmailTemplateDescriptor
uses gw.api.system.CCLoggerCategory
uses gw.api.email.Email
uses java.lang.Exception
uses gw.api.util.LocationUtil
@javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CreateEmailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateEmailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton1) at CreateEmailScreen.pcf: line 75, column 25
    function action_10 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on PickerToolbarButton (id=AddDocumentButton) at CreateEmailScreen.pcf: line 347, column 31
    function action_112 () : void {
      PickExistingDocumentPopup.push(claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=EmailWorksheet_UseTemplateButton) at CreateEmailScreen.pcf: line 83, column 38
    function action_12 () : void {
      PickEmailTemplatePopup.push(new gw.api.email.EmailTemplateSearchCriteria(activity != null ? {"Claim", "Activity"} :{"Claim"}))
    }
    
    // 'action' attribute on ButtonInput (id=ShowCCRecipients) at CreateEmailScreen.pcf: line 177, column 30
    function action_46 () : void {
      showCC = true
    }
    
    // 'action' attribute on ButtonInput (id=ShowBCCRecipients) at CreateEmailScreen.pcf: line 241, column 31
    function action_68 () : void {
      showBCC = true
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton0) at CreateEmailScreen.pcf: line 69, column 25
    function action_9 () : void {
      sendEmailToRecipients(NewEmail)
    }
    
    // 'action' attribute on PickerToolbarButton (id=AddDocumentButton) at CreateEmailScreen.pcf: line 347, column 31
    function action_dest_113 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=EmailWorksheet_UseTemplateButton) at CreateEmailScreen.pcf: line 83, column 38
    function action_dest_13 () : pcf.api.Destination {
      return pcf.PickEmailTemplatePopup.createDestination(new gw.api.email.EmailTemplateSearchCriteria(activity != null ? {"Claim", "Activity"} :{"Claim"}))
    }
    
    // 'available' attribute on PickerToolbarButton (id=AddDocumentButton) at CreateEmailScreen.pcf: line 347, column 31
    function available_111 () : java.lang.Boolean {
      return documentActionsUIHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=ToolbarButton0) at CreateEmailScreen.pcf: line 69, column 25
    function available_8 () : java.lang.Boolean {
      return not templateEvalError
    }
    
    // 'value' attribute on TextInput (id=TextInput0) at CreateEmailScreen.pcf: line 325, column 37
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewEmail.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=TextAreaInput0) at CreateEmailScreen.pcf: line 334, column 34
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewEmail.Body = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at CreateEmailScreen.pcf: line 104, column 95
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on CheckBoxInput (id=SaveAsDocument) at CreateEmailScreen.pcf: line 306, column 55
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      saveAsDocument = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=TextInput1) at CreateEmailScreen.pcf: line 313, column 41
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewEmail.Sender.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TextInput2) at CreateEmailScreen.pcf: line 318, column 49
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewEmail.Sender.EmailAddress = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 23, column 24
    function initialValue_0 () : Document {
      return null
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 27, column 23
    function initialValue_1 () : Boolean {
      return emailTemplate == null
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 31, column 52
    function initialValue_2 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 35, column 62
    function initialValue_3 () : gw.api.contact.ContactEmailAutocompleteHandler {
      return new gw.api.contact.ContactEmailAutocompleteHandler(claim.Contacts.map(\contact -> contact.Contact))
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 39, column 23
    function initialValue_4 () : boolean {
      return perm.Claim.createdocument(claim)
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 51, column 28
    function initialValue_5 () : LanguageType {
      return claim.Insured.PrimaryLanguage == null ? gw.api.util.LocaleUtil.getDefaultLanguageType() : claim.Insured.PrimaryLanguage
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 58, column 34
    function initialValue_6 () : gw.api.email.Email {
      return initNewEmail()
    }
    
    // 'initialValue' attribute on Variable at CreateEmailScreen.pcf: line 62, column 52
    function initialValue_7 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'label' attribute on AlertBar (id=NoDefaultTemplate) at CreateEmailScreen.pcf: line 89, column 62
    function label_16 () : java.lang.Object {
      return DisplayKey.get("Web.Email.Template.NotFound", emailTemplate)
    }
    
    // 'label' attribute on AlertBar (id=templateEvalErro) at CreateEmailScreen.pcf: line 94, column 36
    function label_18 () : java.lang.Object {
      return DisplayKey.get("Web.Email.Template.Unusable", emailTemplate)
    }
    
    // 'onChange' attribute on PostOnChange at CreateEmailScreen.pcf: line 106, column 51
    function onChange_19 () : void {
      executeTemplate(NewEmail)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=AddDocumentButton) at CreateEmailScreen.pcf: line 347, column 31
    function onPick_114 (PickedValue :  Document) : void {
      NewEmail.addDocument(PickedValue)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=EmailWorksheet_UseTemplateButton) at CreateEmailScreen.pcf: line 83, column 38
    function onPick_14 (PickedValue :  gw.plugin.email.IEmailTemplateDescriptor) : void {
      resolveTemplate(PickedValue, { "Activity" -> activity, "Claim" -> claim}); language = gw.api.util.LocaleUtil.toLanguageType(PickedValue.Locale);
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=TextInput0) at CreateEmailScreen.pcf: line 325, column 37
    function requestValidationExpression_102 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == null ? DisplayKey.get("Web.Email.Error.SubjectRequired") : null
    }
    
    // 'requestValidationExpression' attribute on TextAreaInput (id=TextAreaInput0) at CreateEmailScreen.pcf: line 334, column 34
    function requestValidationExpression_107 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == null ? DisplayKey.get("Web.Email.Error.BodyRequired") : null
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 366, column 50
    function sortValue_115 (AttachedDocument :  entity.Document) : java.lang.Object {
      return AttachedDocument.Name
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 155, column 44
    function sortValue_25 (ToRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return ToRecipient.Name
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 167, column 53
    function sortValue_26 (ToRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return ToRecipient.EmailAddress
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 220, column 44
    function sortValue_47 (CcRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return CcRecipient.Name
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 231, column 53
    function sortValue_48 (CcRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return CcRecipient.EmailAddress
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 284, column 45
    function sortValue_69 (BccRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return BccRecipient.Name
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 295, column 54
    function sortValue_70 (BccRecipient :  gw.api.email.EmailContact) : java.lang.Object {
      return BccRecipient.EmailAddress
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at CreateEmailScreen.pcf: line 136, column 55
    function toCreateAndAdd_41 () : gw.api.email.EmailContact {
      var newEmailContact = new gw.api.email.EmailContact(); NewEmail.addToRecipient(newEmailContact); return newEmailContact;
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at CreateEmailScreen.pcf: line 201, column 55
    function toCreateAndAdd_62 () : gw.api.email.EmailContact {
      var newEmailContact = new gw.api.email.EmailContact(); NewEmail.addCcRecipient(newEmailContact); return newEmailContact;
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at CreateEmailScreen.pcf: line 265, column 55
    function toCreateAndAdd_84 () : gw.api.email.EmailContact {
      var newEmailContact = new gw.api.email.EmailContact(); NewEmail.addBccRecipient(newEmailContact); return newEmailContact;
    }
    
    // 'toRemove' attribute on RowIterator at CreateEmailScreen.pcf: line 360, column 45
    function toRemove_120 (AttachedDocument :  entity.Document) : void {
      NewEmail.removeDocument( AttachedDocument )
    }
    
    // 'toRemove' attribute on RowIterator at CreateEmailScreen.pcf: line 136, column 55
    function toRemove_42 (ToRecipient :  gw.api.email.EmailContact) : void {
      NewEmail.removeToRecipient( ToRecipient )
    }
    
    // 'toRemove' attribute on RowIterator at CreateEmailScreen.pcf: line 201, column 55
    function toRemove_63 (CcRecipient :  gw.api.email.EmailContact) : void {
      NewEmail.removeCcRecipient( CcRecipient )
    }
    
    // 'toRemove' attribute on RowIterator at CreateEmailScreen.pcf: line 265, column 55
    function toRemove_85 (BccRecipient :  gw.api.email.EmailContact) : void {
      NewEmail.removeBccRecipient( BccRecipient )
    }
    
    // 'value' attribute on TextInput (id=TextInput0) at CreateEmailScreen.pcf: line 325, column 37
    function valueRoot_105 () : java.lang.Object {
      return NewEmail
    }
    
    // 'value' attribute on TextInput (id=TextInput1) at CreateEmailScreen.pcf: line 313, column 41
    function valueRoot_96 () : java.lang.Object {
      return NewEmail.Sender
    }
    
    // 'value' attribute on TextInput (id=TextInput0) at CreateEmailScreen.pcf: line 325, column 37
    function value_101 () : java.lang.String {
      return NewEmail.Subject
    }
    
    // 'value' attribute on TextAreaInput (id=TextAreaInput0) at CreateEmailScreen.pcf: line 334, column 34
    function value_106 () : java.lang.String {
      return NewEmail.Body
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 360, column 45
    function value_121 () : entity.Document[] {
      return NewEmail.Documents?.toTypedArray()
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at CreateEmailScreen.pcf: line 104, column 95
    function value_21 () : typekey.LanguageType {
      return language
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 136, column 55
    function value_43 () : gw.api.email.EmailContact[] {
      return NewEmail.ToRecipients?.toTypedArray()
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 201, column 55
    function value_64 () : gw.api.email.EmailContact[] {
      return NewEmail.CcRecipients?.toTypedArray()
    }
    
    // 'value' attribute on RowIterator at CreateEmailScreen.pcf: line 265, column 55
    function value_86 () : gw.api.email.EmailContact[] {
      return NewEmail.BccRecipients?.toTypedArray()
    }
    
    // 'value' attribute on CheckBoxInput (id=SaveAsDocument) at CreateEmailScreen.pcf: line 306, column 55
    function value_89 () : java.lang.Boolean {
      return saveAsDocument
    }
    
    // 'value' attribute on TextInput (id=TextInput1) at CreateEmailScreen.pcf: line 313, column 41
    function value_93 () : java.lang.String {
      return NewEmail.Sender.Name
    }
    
    // 'value' attribute on TextInput (id=TextInput2) at CreateEmailScreen.pcf: line 318, column 49
    function value_97 () : java.lang.String {
      return NewEmail.Sender.EmailAddress
    }
    
    // 'visible' attribute on PickerToolbarButton (id=EmailWorksheet_UseTemplateButton) at CreateEmailScreen.pcf: line 83, column 38
    function visible_11 () : java.lang.Boolean {
      return noDefaultTemplate
    }
    
    // 'visible' attribute on AlertBar (id=NoDefaultTemplate) at CreateEmailScreen.pcf: line 89, column 62
    function visible_15 () : java.lang.Boolean {
      return emailTemplate != null and noDefaultTemplate
    }
    
    // 'visible' attribute on AlertBar (id=templateEvalErro) at CreateEmailScreen.pcf: line 94, column 36
    function visible_17 () : java.lang.Boolean {
      return templateEvalError
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at CreateEmailScreen.pcf: line 104, column 95
    function visible_20 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count >  1 and emailTemplate != null
    }
    
    // 'visible' attribute on ButtonInput (id=ShowCCRecipients) at CreateEmailScreen.pcf: line 177, column 30
    function visible_44 () : java.lang.Boolean {
      return !showCC
    }
    
    // 'visible' attribute on ListViewInput (id=CcRecipientLVInput) at CreateEmailScreen.pcf: line 183, column 28
    function visible_65 () : java.lang.Boolean {
      return showCC
    }
    
    // 'visible' attribute on ButtonInput (id=ShowBCCRecipients) at CreateEmailScreen.pcf: line 241, column 31
    function visible_66 () : java.lang.Boolean {
      return !showBCC
    }
    
    // 'visible' attribute on ListViewInput (id=BccRecipientLVInput) at CreateEmailScreen.pcf: line 247, column 29
    function visible_87 () : java.lang.Boolean {
      return showBCC
    }
    
    // 'visible' attribute on CheckBoxInput (id=SaveAsDocument) at CreateEmailScreen.pcf: line 306, column 55
    function visible_88 () : java.lang.Boolean {
      return perm.Claim.createdocument(claim)
    }
    
    property get NewEmail () : gw.api.email.Email {
      return getVariableValue("NewEmail", 0) as gw.api.email.Email
    }
    
    property set NewEmail ($arg :  gw.api.email.Email) {
      setVariableValue("NewEmail", 0, $arg)
    }
    
    property get activity () : Activity {
      return getRequireValue("activity", 0) as Activity
    }
    
    property set activity ($arg :  Activity) {
      setRequireValue("activity", 0, $arg)
    }
    
    property get autoCompleteHandler () : gw.api.contact.ContactEmailAutocompleteHandler {
      return getVariableValue("autoCompleteHandler", 0) as gw.api.contact.ContactEmailAutocompleteHandler
    }
    
    property set autoCompleteHandler ($arg :  gw.api.contact.ContactEmailAutocompleteHandler) {
      setVariableValue("autoCompleteHandler", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get documentActionsUIHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentActionsUIHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentActionsUIHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentActionsUIHelper", 0, $arg)
    }
    
    property get documentToSave () : Document {
      return getVariableValue("documentToSave", 0) as Document
    }
    
    property set documentToSave ($arg :  Document) {
      setVariableValue("documentToSave", 0, $arg)
    }
    
    property get documentsToSend () : Document[] {
      return getRequireValue("documentsToSend", 0) as Document[]
    }
    
    property set documentsToSend ($arg :  Document[]) {
      setRequireValue("documentsToSend", 0, $arg)
    }
    
    property get emailTemplate () : String {
      return getRequireValue("emailTemplate", 0) as String
    }
    
    property set emailTemplate ($arg :  String) {
      setRequireValue("emailTemplate", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get language () : LanguageType {
      return getVariableValue("language", 0) as LanguageType
    }
    
    property set language ($arg :  LanguageType) {
      setVariableValue("language", 0, $arg)
    }
    
    property get noDefaultTemplate () : Boolean {
      return getVariableValue("noDefaultTemplate", 0) as Boolean
    }
    
    property set noDefaultTemplate ($arg :  Boolean) {
      setVariableValue("noDefaultTemplate", 0, $arg)
    }
    
    property get saveAsDocument () : boolean {
      return getVariableValue("saveAsDocument", 0) as java.lang.Boolean
    }
    
    property set saveAsDocument ($arg :  boolean) {
      setVariableValue("saveAsDocument", 0, $arg)
    }
    
    property get showBCC () : boolean {
      return getVariableValue("showBCC", 0) as java.lang.Boolean
    }
    
    property set showBCC ($arg :  boolean) {
      setVariableValue("showBCC", 0, $arg)
    }
    
    property get showCC () : boolean {
      return getVariableValue("showCC", 0) as java.lang.Boolean
    }
    
    property set showCC ($arg :  boolean) {
      setVariableValue("showCC", 0, $arg)
    }
    
    property get templateEvalError () : boolean {
      return getVariableValue("templateEvalError", 0) as java.lang.Boolean
    }
    
    property set templateEvalError ($arg :  boolean) {
      setVariableValue("templateEvalError", 0, $arg)
    }
    
    
    function resolveTemplate(template:IEmailTemplateDescriptor, beans:Map<String,Object>) {
      resolveTemplate(NewEmail, template, beans)
    }
    
    function resolveTemplate(email:Email, template:IEmailTemplateDescriptor, beans:Map<String,Object>) {
      try {
        email.useEmailTemplate(template, beans)
        //re-set error flag in case true
        templateEvalError = false
      } catch (e:Exception) {
        //set flag for error message
        templateEvalError = true
        CCLoggerCategory.APPLICATION.error("Unable to resolve template ${template.Name}", e)
      }
    }
    
    function initNewEmail() : gw.api.email.Email {
      var rtn = new gw.api.email.Email()
      if (emailTemplate != null) {
        executeTemplate(rtn)
      }
      if (documentsToSend != null) {
        for (document in documentsToSend) {
          rtn.addDocument( document )
        }
      }
      return rtn
    }
    
    function executeTemplate(rtn : gw.api.email.Email) {
      var templatePlugin = gw.plugin.Plugins.get(gw.plugin.email.IEmailTemplateSource)
      var template = templatePlugin.getEmailTemplate(gw.api.util.LocaleUtil.toLanguage(language), emailTemplate)
      if (template == null) {
        noDefaultTemplate = true
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Activity.EmailTemplate.Language", emailTemplate, language))
      }
      else {
        resolveTemplate(rtn, template, { "Activity" -> activity, "Claim" -> claim})
      }
    }
    
    function sendEmailToRecipients(emailToSend : gw.api.email.Email) {
      if(templateEvalError) {
          gw.api.system.CCLoggerCategory.UI.error("Unable to send email due to template error")
          LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("Web.CreateEmailScreen.TemplateError.EmailNotSent"))
          return
      }
      var warnings = gw.api.email.EmailUtil.emailContentsValid(emailToSend)
      if (warnings.length > 0) {
        throw new gw.api.util.DisplayableException(warnings)
      }
      if (saveAsDocument) {
        claim.saveEmailAsDocument(emailToSend, gw.api.util.LocaleUtil.toLanguage(language), {"Activity" -> activity}, true)
      } else if (documentToSave != null) {
        documentToSave.remove()
      }
      gw.api.email.EmailUtil.sendEmailWithBody(claim, emailToSend)
      // it didn't throw so reset email template so that other templates can be used
      if (emailTemplate != null and activity.EmailTemplate == emailTemplate) {
        activity.EmailTemplate = null
      }
      CurrentLocation.commit()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends CreateEmailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 212, column 65
    function action_49 () : void {
      AddressBookPickerPopup.push(Contact, true, claim)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 212, column 65
    function action_dest_50 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(Contact, true, claim)
    }
    
    // 'autoComplete' attribute on TextCell (id=CcName) at CreateEmailScreen.pcf: line 220, column 44
    function autoComplete_57 () : gw.api.contact.AutocompleteHandler {
      return autoCompleteHandler
    }
    
    // 'value' attribute on TextCell (id=CcName) at CreateEmailScreen.pcf: line 220, column 44
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      CcRecipient.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=CcEmail) at CreateEmailScreen.pcf: line 231, column 53
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      CcRecipient.EmailAddress = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at CreateEmailScreen.pcf: line 223, column 41
    function onChange_52 () : void {
      var emailForName = autoCompleteHandler.getEmailForName(CcRecipient.Name); if (emailForName != null) { CcRecipient.EmailAddress = emailForName }
    }
    
    // 'onPick' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 212, column 65
    function onPick_51 (PickedValue :  Contact) : void {
      CcRecipient.Contact = PickedValue
    }
    
    // 'value' attribute on TextCell (id=CcName) at CreateEmailScreen.pcf: line 220, column 44
    function valueRoot_56 () : java.lang.Object {
      return CcRecipient
    }
    
    // 'value' attribute on TextCell (id=CcName) at CreateEmailScreen.pcf: line 220, column 44
    function value_53 () : java.lang.String {
      return CcRecipient.Name
    }
    
    // 'value' attribute on TextCell (id=CcEmail) at CreateEmailScreen.pcf: line 231, column 53
    function value_58 () : java.lang.String {
      return CcRecipient.EmailAddress
    }
    
    property get CcRecipient () : gw.api.email.EmailContact {
      return getIteratedValue(1) as gw.api.email.EmailContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends CreateEmailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 276, column 66
    function action_71 () : void {
      AddressBookPickerPopup.push(Contact, true, claim)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 276, column 66
    function action_dest_72 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(Contact, true, claim)
    }
    
    // 'autoComplete' attribute on TextCell (id=BccName) at CreateEmailScreen.pcf: line 284, column 45
    function autoComplete_79 () : gw.api.contact.AutocompleteHandler {
      return autoCompleteHandler
    }
    
    // 'value' attribute on TextCell (id=BccName) at CreateEmailScreen.pcf: line 284, column 45
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      BccRecipient.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=BccEmail) at CreateEmailScreen.pcf: line 295, column 54
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      BccRecipient.EmailAddress = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at CreateEmailScreen.pcf: line 287, column 41
    function onChange_74 () : void {
      var emailForName = autoCompleteHandler.getEmailForName(BccRecipient.Name); if (emailForName != null) { BccRecipient.EmailAddress = emailForName }
    }
    
    // 'onPick' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 276, column 66
    function onPick_73 (PickedValue :  Contact) : void {
      BccRecipient.Contact = PickedValue
    }
    
    // 'value' attribute on TextCell (id=BccName) at CreateEmailScreen.pcf: line 284, column 45
    function valueRoot_78 () : java.lang.Object {
      return BccRecipient
    }
    
    // 'value' attribute on TextCell (id=BccName) at CreateEmailScreen.pcf: line 284, column 45
    function value_75 () : java.lang.String {
      return BccRecipient.Name
    }
    
    // 'value' attribute on TextCell (id=BccEmail) at CreateEmailScreen.pcf: line 295, column 54
    function value_80 () : java.lang.String {
      return BccRecipient.EmailAddress
    }
    
    property get BccRecipient () : gw.api.email.EmailContact {
      return getIteratedValue(1) as gw.api.email.EmailContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends CreateEmailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Document) at CreateEmailScreen.pcf: line 366, column 50
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      AttachedDocument.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Document) at CreateEmailScreen.pcf: line 366, column 50
    function valueRoot_119 () : java.lang.Object {
      return AttachedDocument
    }
    
    // 'value' attribute on TextCell (id=Document) at CreateEmailScreen.pcf: line 366, column 50
    function value_116 () : java.lang.String {
      return AttachedDocument.Name
    }
    
    property get AttachedDocument () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CreateEmailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 147, column 65
    function action_27 () : void {
      AddressBookPickerPopup.push(Contact, true, claim)
    }
    
    // 'action' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 147, column 65
    function action_dest_28 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(Contact, true, claim)
    }
    
    // 'autoComplete' attribute on TextCell (id=ToName) at CreateEmailScreen.pcf: line 155, column 44
    function autoComplete_35 () : gw.api.contact.AutocompleteHandler {
      return autoCompleteHandler
    }
    
    // 'value' attribute on TextCell (id=ToName) at CreateEmailScreen.pcf: line 155, column 44
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ToRecipient.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ToEmail) at CreateEmailScreen.pcf: line 167, column 53
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      ToRecipient.EmailAddress = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at CreateEmailScreen.pcf: line 158, column 41
    function onChange_30 () : void {
      var emailForName = autoCompleteHandler.getEmailForName(ToRecipient.Name); if (emailForName != null) { ToRecipient.EmailAddress = emailForName }
    }
    
    // 'onPick' attribute on PickerLink (id=ABPickerLink) at CreateEmailScreen.pcf: line 147, column 65
    function onPick_29 (PickedValue :  Contact) : void {
      ToRecipient.Contact = PickedValue
    }
    
    // 'requestValidationExpression' attribute on TextCell (id=ToEmail) at CreateEmailScreen.pcf: line 167, column 53
    function requestValidationExpression_37 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == null ? DisplayKey.get("Web.Email.Error.AddressForToRecipientRequried") : null
    }
    
    // 'value' attribute on TextCell (id=ToName) at CreateEmailScreen.pcf: line 155, column 44
    function valueRoot_34 () : java.lang.Object {
      return ToRecipient
    }
    
    // 'value' attribute on TextCell (id=ToName) at CreateEmailScreen.pcf: line 155, column 44
    function value_31 () : java.lang.String {
      return ToRecipient.Name
    }
    
    // 'value' attribute on TextCell (id=ToEmail) at CreateEmailScreen.pcf: line 167, column 53
    function value_36 () : java.lang.String {
      return ToRecipient.EmailAddress
    }
    
    property get ToRecipient () : gw.api.email.EmailContact {
      return getIteratedValue(1) as gw.api.email.EmailContact
    }
    
    
  }
  
  
}