package gw.entity
uses gw.api.locale.DisplayKey
uses gw.plugin.note.INoteTemplateSource
uses gw.api.util.DisplayableException
uses java.util.ArrayList
uses java.util.HashMap
uses gw.api.util.LocaleUtil
uses java.lang.Throwable
uses gw.api.system.PLLoggerCategory

@Export
enhancement GWNoteTemplateSearchCriteriaEnhancement : entity.NoteTemplateSearchCriteria
{
  function performSearch() : NoteTemplateSearchResults[] {
    var nts : INoteTemplateSource = null
    try {
      nts = gw.plugin.Plugins.get(INoteTemplateSource)
    } catch (e : Throwable) {
      throw new DisplayableException(DisplayKey.get("Java.Note.Template.Plugin.Exception"))
    }
    
    // populate values to match
    var valuesToMatch = new HashMap<String, Object>()
    for (prop in (NoteTemplateSearchCriteria.Type as IEntityType).EntityProperties) {
      if (prop.Name == "ID" or prop.Name == "PublicId" or prop.Name == "BeanVersion") {
        // skip
      }
      else {
        var value = this[prop.Name]
        if (value == null) {
          // skip
        }
        else if (value typeis TypeKey) { 
          valuesToMatch.put(prop.Name, value.Code)
        }
        else {
          valuesToMatch.put(prop.Name, value)
        }
      }
    }
    
    // perform the search
    var templates = nts.getNoteTemplates(LocaleUtil.toLanguage(this.getLanguage()), valuesToMatch)
    var resultsList = new ArrayList<NoteTemplateSearchResults>(templates.Count)
    
    //Convert results from INoteTemplateDescriptor to NoteTemplateSearchResults (non-persistent bean)
    for (template in templates) {
      var searchResults = new NoteTemplateSearchResults()
      try {
        searchResults.Name = template.Name
        searchResults.Topic = typekey.NoteTopicType.get(template.Topic)
        searchResults.Type = typekey.NoteType.get(template.Type)
        searchResults.LossTypes = template.LobTypes.map( \ s -> (typekey.LossType.get(s)).DisplayName).join( ", " )
        searchResults.Body = template.Body
        searchResults.Subject = template.Subject
        searchResults.Language = LocaleUtil.toLanguageType( template.Locale )
        resultsList.add(searchResults)
      } catch (e : Throwable) {
        PLLoggerCategory.PLUGIN.error("Failed to load a template (" + template.getName() + ") due to exception: ", e);
        continue;
      }
    }
    return resultsList?.toTypedArray()
  }
}
