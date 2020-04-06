package gw.webservice.cc

uses gw.api.webservice.exception.SOAPException;
uses gw.api.webservice.templateTools.TemplateImportResults;
uses gw.xml.ws.annotation.WsiWebService
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiGenInToolkit
uses gw.api.util.LocaleUtil
uses java.lang.IllegalArgumentException
uses java.util.Map
uses gw.i18n.ILocale
uses gw.api.webservice.templateTools.validation.NameTypePair
uses java.util.Arrays
uses java.util.List

/**
 * TemplateToolsAPI provides adminstrative and programmer support tools for document
 * templates.
 */
@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI")
@WsiAvailability(MAINTENANCE)
@WsiGenInToolkit
@Export
class TemplateToolsAPI {

  /**
   * Validate that the given document template descriptor is in a valid format, and that all of the Gosu used in the descriptor
   * (for ContextObjects and FormFields) is valid given the current datamodel.
   * Current Validation includes the following items:
   * 1) Check that the Gosu expressions in the descriptor (including ContextObject default and possible
   *    value expressions, which must be defined in terms of the available objects, and FormField expressions, which
   *    must be defined in terms of those objects plus the ContestObjects).
   * 2) Check that the permissionRequired attribute, if specified, is a valid system permission code.
   * 3) Check that the default-security-type attribute, if specified, is a valid document security type code.
   * 4) Check that the type attribute, if specified, is a valid document type code.
   * 5) Check that the section attribute, if specified, is a valid section type code.
   *
   * @param templateID - The ID of the template (e.g. ReservationRights.doc)
   * @return A human-readable string detailing the operations performed and any errors encountered.
   */
  @Throws(SOAPException, "")
  public function validateDocumentTemplate(templateID : String) : String {
    return getDelegate().validateDocumentTemplate( templateID, LocaleUtil.getDefaultLanguage() )
  }

    /**
   * Validate that the given document template descriptor is in a valid format, and that all of the Gosu used in the descriptor
     * (for ContextObjects and FormFields) is valid given the current datamodel.
     * Current Validation includes the following items:
     * 1) Check that the Gosu expressions in the descriptor (including ContextObject default and possible
     *    value expressions, which must be defined in terms of the available objects, and FormField expressions, which
     *    must be defined in terms of those objects plus the ContestObjects).
     * 2) Check that the permissionRequired attribute, if specified, is a valid system permission code.
     * 3) Check that the default-security-type attribute, if specified, is a valid document security type code.
     * 4) Check that the type attribute, if specified, is a valid document type code.
     * 5) Check that the section attribute, if specified, is a valid section type code.
     *
     * @param templateID - The ID of the template (e.g. ReservationRights.doc)
     * @return A human-readable string detailing the operations performed and any errors encountered.
     * @deprecated use validateDocumentTemplate instead
     */
    @Throws(SOAPException, "")
    public function validateTemplate(templateID : String) : String {
      return getDelegate().validateDocumentTemplate( templateID, LocaleUtil.getDefaultLanguage() )
    }

  /**
   * Validate that the given template descriptor is in a valid format, and that all of the Gosu used in the descriptor
   * (for ContextObjects and FormFields) is valid given the current datamodel.
   * Current Validation includes the following items:
   * 1) Check that the Gosu expressions in the descriptor (including ContextObject default and possible
   *    value expressions, which must be defined in terms of the available objects, and FormField expressions, which
   *    must be defined in terms of those objects plus the ContestObjects).
   * 2) Check that the permissionRequired attribute, if specified, is a valid system permission code.
   * 3) Check that the default-security-type attribute, if specified, is a valid document security type code.
   * 4) Check that the type attribute, if specified, is a valid document type code.
   * 5) Check that the section attribute, if specified, is a valid section type code.
   *
   * @param templateID - The ID of the template (e.g. ReservationRights.doc)
   * @param locale - the locale to testing
   * @return A human-readable string detailing the operations performed and any errors encountered.
   */
  @Throws(SOAPException, "")
  public function validateDocumentTemplateInLocale(templateID : String, locale : String) : String {
    return getDelegate().validateDocumentTemplate( templateID, getLocaleByName(locale))
  }

  /**
   * Validate that the given document template descriptor is in a valid format, and that all of the Gosu used in the descriptor
   * (for ContextObjects and FormFields) is valid given the current datamodel.
   * Current Validation includes the following items:
   * 1) Check that the Gosu expressions in the descriptor (including ContextObject default and possible
   *    value expressions, which must be defined in terms of the available objects, and FormField expressions, which
   *    must be defined in terms of those objects plus the ContestObjects).
   * 2) Check that the permissionRequired attribute, if specified, is a valid system permission code.
   * 3) Check that the default-security-type attribute, if specified, is a valid document security type code.
   * 4) Check that the type attribute, if specified, is a valid document type code.
   * 5) Check that the section attribute, if specified, is a valid section type code.
   *
   * @param templateID - The ID of the template (e.g. ReservationRights.doc)
   * @param locale - the locale to testing
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @deprecated use validateDocumentTemplateInLocale instead
   */
  @Throws(SOAPException, "")
  public function validateTemplateInLocale(templateID : String, locale : String) : String {
    return getDelegate().validateDocumentTemplate( templateID, getLocaleByName(locale))
  }

  /**
   * Performs the validation done in validateDocumentTemplate for all of the template descriptors the server can find
   * @return A human-readable string detailing the operations performed and any errors encountered.
   */
  @Throws(SOAPException, "")
  public function validateAllDocumentTemplates() : String {
    return getDelegate().validateAllDocumentTemplates( LocaleUtil.getDefaultLanguage() )
  }

  /**
   * Performs the validation done in validateTemplate for all of the document template descriptors the server can find
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @deprecated use validateAllDocumentTemplates instead
   */
  @Throws(SOAPException, "")
  public function validateAllTemplates() : String {
    return getDelegate().validateAllDocumentTemplates( LocaleUtil.getDefaultLanguage() )
  }

  /**
   * Performs the validation done in validateDocumentTemplate for all of the template descriptors the server can find
   * @return A human-readable string detailing the operations performed and any errors encountered.
   */
  @Throws(SOAPException, "")
  public function validateAllDocumentTemplatesInLocale(locale : String) : String {
    return getDelegate().validateAllDocumentTemplates( getLocaleByName(locale) )
  }

  /**
   * Performs the validation done in validateTemplate for all of the document template descriptors the server can find
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @deprecated use validateAllDocumentTemplatesInLocale instead
   */
  @Throws(SOAPException, "")
  public function validateAllTemplatesInLocale(locale : String) : String {
    return getDelegate().validateAllDocumentTemplates( getLocaleByName(locale) )
  }

  /**
   * Performs validation of all available email templates for default locale.
   * @param beanByNameMap map of placeholder replacements by their names
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @throws SOAPException
   */
   @Throws(SOAPException, "")
   public function  validateAllEmailTemplates(beanNamesAndTypes : NameTypePair[]) : String {
     return getDelegate().validateAllEmailTemplates(beanNamesAndTypes?.toList());
   }
  /**
   * Performs validation of all available email templates for specified locale.
   * @param beanByNameMap map of placeholder replacements by their names
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @throws SOAPException
   */
   @Throws(SOAPException, "")
   public function  validateAllEmailTemplatesInLocale(beanNamesAndTypes : NameTypePair[], locale : String) : String {
     return getDelegate().validateAllEmailTemplates(beanNamesAndTypes?.toList(), getLocaleByName(locale));
   }

  /**
   * Validating a particular email template by name for default locale
   *
   * @param templateFileName file name of the template to validate
   * @param beanByNameMap
   * @return validation result
   */
   @Throws(SOAPException, "")
   public function validateEmailTemplate(templateFileName : String, beanNamesAndTypes : NameTypePair[]) : String {
     return getDelegate().validateEmailTemplate(templateFileName, beanNamesAndTypes?.toList())
   }
  /**
   * Validating a particular email template by name and locale
   *
   * @param locale locale of the template
   * @param templateFileName file name of the template to validate
   * @param beanByNameMap
   * @return validation result
   */
   @Throws(SOAPException, "")
   public function validateEmailTemplateInLocale(templateFileName : String, beanNamesAndTypes : NameTypePair[], locale : String) : String {
     return getDelegate().validateEmailTemplate(templateFileName, beanNamesAndTypes?.toList(), getLocaleByName(locale))
   }

  /**
   * Performs validation of all available note templates for default locale.
   * @param beanByNameMap map of placeholder replacements by their names
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @throws SOAPException
   */
   @Throws(SOAPException, "")
   public function  validateAllNoteTemplates(beanNamesAndTypes : NameTypePair[]) : String {
     return getDelegate().validateAllNoteTemplates(beanNamesAndTypes?.toList())
   }

  /**
   * Performs validation of all available email templates for specified locale.
   * @param beanByNameMap map of placeholder replacements by their names
   * @return A human-readable string detailing the operations performed and any errors encountered.
   * @throws SOAPException
   */
   @Throws(SOAPException, "")
   public function  validateAllNoteTemplatesInLocale(beanNamesAndTypes : NameTypePair[], locale : String) : String {
     return getDelegate().validateAllNoteTemplates(beanNamesAndTypes?.toList(), getLocaleByName(locale))
   }

  /**
   * Validating a particular note template by name for default locale
   *
   * @param customLocale
   * @param templateFileName file name of the template to validate
   * @param beansByNameMap
   * @return validation result
   */
   @Throws(SOAPException, "")
   public function  validateNoteTemplate(templateFileName : String, beanNamesAndTypes : NameTypePair[]) : String {
     return getDelegate().validateNoteTemplate(templateFileName, beanNamesAndTypes?.toList())
   }

  /**
   * Validating a particular note template by name and locale
   * @param locale locale of the template
   * @param templateFileName file name of the template to validate
   * @return validation result
   */
   @Throws(SOAPException, "")
   public function  validateNoteTemplateInLocale(templateFileName : String, beanNamesAndTypes : NameTypePair[], locale : String) : String {
     return getDelegate().validateNoteTemplate(templateFileName, beanNamesAndTypes?.toList(), getLocaleByName(locale))
   }

   /**
     * List the document templates which the server currently knows about. Useful for sanity-checking arguments to
     * the validation commands.
     * @return A human-readable string detailing the templates available to the server.
     * @deprecated use listDocumentTemplates instead
     */
    @Throws(SOAPException, "")
    public function listTemplates() : String {
      return getDelegate().listDocumentTemplates()
    }

  /**
   * List the document templates which the server currently knows about. Useful for sanity-checking arguments to
   * the validation commands.
   * @return A human-readable string detailing the templates available to the server.
   */
  @Throws(SOAPException, "")
  public function listDocumentTemplates() : String {
    return getDelegate().listDocumentTemplates()
  }

  /**
   * List the email templates which the server currently knows about. Useful for sanity-checking arguments to
   * the validation commands.
   * @return A human-readable string detailing the templates available to the server.
   */
  @Throws(SOAPException, "")
  public function listEmailTemplates() : String {
    return getDelegate().listEmailTemplates()
  }

  /**
   * List the note templates which the server currently knows about. Useful for sanity-checking arguments to
   * the validation commands.
   * @return A human-readable string detailing the templates available to the server.
   */
  @Throws(SOAPException, "")
  public function listNoteTemplates() : String {
    return getDelegate().listNoteTemplates()
  }

  /**
   * Imports context objects, field groups, and fields from the provided .csv file contents into the corresponding
   * template descriptor file.
   * @param contextObjectFileContents The contents of a file containing the context objects to be imported, in CSV format
   * @param fieldGroupFileContents The contents of a file contianing the field groups to be imported, in CSV format
   * @param fieldFileContents The contents of a file containing the fields to be imported, in CSV format.
   * @param descriptorFileContents The contents of the descriptor file.
   * @return A results object with fields for the new contents of the descriptor file, and a human-readable string detailing
   * the operations performed and any errors encountered.
   */
  @Throws(SOAPException, "")
  public function importFormFields(contextObjectFileContents : String, fieldGroupFileContents : String, fieldFileContents : String, descriptorFileContents : String) : TemplateImportResults {
    return getDelegate().importFormFields(contextObjectFileContents, fieldGroupFileContents, fieldFileContents, descriptorFileContents)
  }

  //----------------------------------------------------------------- private helper methods

  private function getDelegate() : gw.api.webservice.cc.templateTools.CCTemplateToolsImpl {
    return new gw.api.webservice.cc.templateTools.CCTemplateToolsImpl()
  }

  private function getLocaleByName(name : String) : ILocale {
    var localeType = LocaleType.get(name)
    if (localeType == null) {
      throw new IllegalArgumentException(name + " not defined")
    }
    return LocaleUtil.toLocale(localeType)
  }

}
