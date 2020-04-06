package util.document;
uses gw.document.DocumentContentsInfo
uses java.util.Map

uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentProduction
uses gw.plugin.document.IDocumentTemplateSource

/**
 * The DocumentProduction class contains methods which can be used in both.pcf configuration
 * and from rules to create Document entities from Document Templates.
 * @deprecated use gw.document.DocumentProduction
 */
@Export
@Deprecated("use gw.document.DocumentProduction")
class DocumentProduction extends gw.document.DocumentProduction
{
   /**
    * Create a document synchronously. Does not persist the newly generated content.
    * This method should be used when the generated content is desired for display in the UI, and when a
    * Document entity is not going to be created (for example, when simply printing some content).
    *
    * @deprecated use gw.document.DocumentProduction.createDocumentSynchronously that takes IDocumentTemplateDescriptor for I18N support
    * @param templateName the id of the template to be used to create the document
    * @param parameters the set of objects, keyed by name, which will be supplied to the template generation process to create the document
    * @return A DocumentContentsInfo object with the metadata of the Document Contents, and possibly the contents themselves
    */
   @Deprecated("use gw.document.DocumentProduction.createDocumentSynchronously that takes IDocumentTemplateDescriptor for I18N support")
    public static function createDocumentSynchronously(templateName : String, parameters : Map) : DocumentContentsInfo {
     var docTemplateSource : IDocumentTemplateSource = Plugins.get(IDocumentTemplateSource);
     var documentProductionPlugin : IDocumentProduction = Plugins.get(IDocumentProduction);

     var documentContentsInfo = documentProductionPlugin.createDocumentSynchronously(docTemplateSource.getDocumentTemplate(templateName, null), parameters);

     return documentContentsInfo;
    }


}
