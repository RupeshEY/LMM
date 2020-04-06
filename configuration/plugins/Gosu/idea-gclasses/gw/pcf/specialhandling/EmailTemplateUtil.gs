package gw.pcf.specialhandling
uses gw.api.locale.DisplayKey
uses java.util.Map
uses java.util.HashMap
uses java.util.Collections
uses gw.api.util.Logger
uses gw.plugin.Plugins
uses gw.plugin.email.IEmailTemplateSource
uses java.lang.Exception
uses gw.api.util.DisplayableException
uses java.util.List

@Export
class EmailTemplateUtil {

  public static function getEmailTemplateDisplayName(templateFilename : String)  : String {

    if (templateFilename == null) {
      return null
    }
  
    var template = EmailTemplatePlugin.getEmailTemplate(templateFilename)
    if (template == null) {
      Logger.logError(DisplayKey.get("Web.Email.TemplateNotFound") + " - " + templateFilename)
      return DisplayKey.get("Web.Email.TemplateNotFound")
    }
  
    return template.getName()
  }
  
  public static function buildEmailTemplateDisplayNameMap(templateNames : List<String>) : Map<String, String> {
    if (templateNames == null or templateNames.Empty) {
      return Collections.emptyMap<String, String>();
    }
    
    var templateFileNamesToTemplateNameMap = new HashMap<String, String>()

    for (templateToLookup in templateNames) {
      if (null != templateToLookup) {
        var template = EmailTemplatePlugin.getEmailTemplate(templateToLookup)
        templateFileNamesToTemplateNameMap.put(templateToLookup, (null != template ? template.Name : DisplayKey.get("Web.Email.TemplateNotFound")))
      }
    }

    return templateFileNamesToTemplateNameMap
  }

  static property get EmailTemplatePlugin() : IEmailTemplateSource {
    try {
      return Plugins.get(IEmailTemplateSource)
    } catch (e : Exception) {
      throw new DisplayableException(DisplayKey.get("Web.Email.NoTemplateSourcePlugin"), e);
    }
  }
}
