package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.email.Email
uses gw.i18n.ILocale
uses java.util.Map

@Export
enhancement GWClaimEmailEnhancement : entity.Claim {
  public function saveEmailAsDocument( emailToSend : Email, locale : ILocale, extraParams : Map<String, Object>, throwIfTemplateMissing : boolean) {
    var documentToSave : Document
    var templatePlugin = gw.plugin.Plugins.get(gw.plugin.document.IDocumentTemplateSource)
    var template = templatePlugin.getDocumentTemplate("CreateEmailSent.gosu.htm", locale)
    if (template == null and throwIfTemplateMissing) {
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Email.CreateEmailSentTemplateDoesntExist"))
    } else if (template != null) {
      documentToSave = documentToSave != null ? documentToSave : new Document()
      documentToSave.Name  = emailToSend.Subject
      documentToSave.MimeType = template.MimeType
      documentToSave.Type = typekey.DocumentType.get(template.TemplateType)
      documentToSave.Section = typekey.DocumentSection.get(template.getMetadataPropertyValue( "section" ) as String) // assigment will force it to SectionType
      documentToSave.SecurityType = typekey.DocumentSecurityType.get(template.DefaultSecurityType)
      documentToSave.Status = TC_FINAL
      var recp = emailToSend.ToRecipients.first().Name
      documentToSave.Recipient = recp == null ? emailToSend.ToRecipients.first().EmailAddress : recp
      documentToSave.Claim = this
      documentToSave.Author = User.util.CurrentUser.DisplayName
      documentToSave.Inbound = false
      documentToSave.DateCreated = gw.api.util.DateUtil.currentDate()

      var paramMap = new java.util.HashMap()
      paramMap.put("Claim", this)
      paramMap.put("User", User.util.CurrentUser)
      paramMap.put("Email", emailToSend)
      paramMap.put("DateSent", gw.api.util.DateUtil.currentDate())
      
      if (extraParams != null) {
        for (param in extraParams.entrySet()) {
          paramMap.put(param.Key, param.Value)
        }
      }
      
      gw.document.DocumentProduction.createAndStoreDocumentSynchronously(template, paramMap, documentToSave)
      this.addToDocuments( documentToSave )
    }    
  }
}
