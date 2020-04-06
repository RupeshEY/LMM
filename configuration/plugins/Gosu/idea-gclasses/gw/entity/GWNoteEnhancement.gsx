package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.util.LocaleUtil
uses gw.api.util.DisplayableException
uses gw.document.TemplatePluginUtils
uses java.io.StringReader
uses java.util.Map
uses java.util.HashSet
uses java.lang.Throwable

@Export
enhancement GWNoteEnhancement : Note {
 
  /** Given a specific template and entities to populate the symbol table, populate the note, with 
   * the values from the template.
   * 
   * @param template the template to use (should have locale set if different then the current users)
   * @param beans, a map of symbolname -> object to initialize the symbol table used by the template 
   * expansion.
   * 
   * This will use the utility library to create a symbol table, then return to this a block to 
   * permit it to be populuated in a product specific manner, and then process the results while still
   * in the locale.
   */
  
  function useTemplate(template : NoteTemplateSearchResults, beans : Map<String,Object>) {
    try {
      var locale = LocaleUtil.toLanguage(template.Language)
      if (locale == null) {
        locale = LocaleUtil.getDefaultLanguage()
      }
      TemplatePluginUtils.resolveTemplates( locale, 
          {new StringReader(template.Subject), new StringReader(template.Body)}, 
          // set up the symbol table for the template processing
          \ iScriptHost -> {
            // load the symbols supplied by the caller
            var seen = new HashSet<String>()
            for (entry in beans.entrySet()) {
              var bean = entry.getValue()
              if (bean != null) {
                iScriptHost.putSymbol(entry.Key, typeof(bean) as String, bean)
                seen.add(entry.Key.toLowerCase())
              }
            }
            // now load (or copy from other possible symbol names) the symbols that could be expected
            if (not seen.contains( "claim" )) {
              var actv = beans.get("Activity")
              if (actv typeis Activity) {
                var claim = actv.Claim
                if (claim != null) {
                  iScriptHost.putSymbol( "Claim", typeof(claim) as String, claim )
                }
              }
            }
          }, 
          // process the result of the template expansion
          \ results -> {
            this.Topic = template.Topic
            this.Language = LocaleUtil.toLanguageType( User.util.CurrentLocale  ) // inside of run in locale
            this.Subject = results[0]
            this.Body = results[1]
          } )
    } catch (e : Throwable ) {
       throw new DisplayableException(DisplayKey.get("Web.Note.UseTemplate.Exception", template.Name, e.Message), e)
    }
  }

}
