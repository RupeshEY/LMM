package gw.api.heatmap
uses gw.api.locale.DisplayKey
uses java.util.HashMap

@Export
class BingMap implements IHeatMapTemplate {

  var bingLocaleMap : HashMap = new HashMap<String, String>() {
    "en_AU" -> "en-AU",
    "en_CA" -> "en-CA",
    "en_GB" -> "en-GB",
    // en_NZ not available
    "en_US" -> "en-US",
    "fr_FR" -> "fr-FR",
    "fr_CA" -> "fr-CA",
    "ja_JP" -> "ja-JP",
    "de_DE" -> "de-DE",
    "es_MX" -> "es-MX",
    "es_ES" -> "es-ES",
    "it_IT" -> "it-IT",
    "cs_CZ" -> "cs-CZ",
    "da_DK" -> "da-DK",
    "nl_BE" -> "nl-BE",
    "nl_NL" -> "nl-NL",
    "fi_FI" -> "fi-FI",
    "nb_NO" -> "nb-NO",
    "pt_BR" -> "pt-BR",
    "pt-PT" -> "pt-PT",
    "sv_SE" -> "sv-SE"
  }

  /**
   * Translate the current CC locale string to a Bing Maps locale string.
   * The list of Bing supported languages is here: http://msdn.microsoft.com/en-us/library/cc469974.aspx
   *
   * @return the closest equivalent Bing locale string, or US English if no close equivalent
   */
  function getBingMapsLocale() : String {
    var locale = bingLocaleMap.get(User.util.CurrentLocale.Code) as String
    return locale != null ? locale : "en-US"
  }

  override property get MapScriptHTML() : String {
    return "<script type=\"text/javascript\" src=\"http://www.bing.com/api/maps/mapcontrol\"></script>"
  }

  override property get LoadingMessage() : String {
    return DisplayKey.get("Web.HeatMap.LoadingBingMaps")
  }

  override public function renderJavaScriptTemplate(heatMap : HeatMapGenerator, mapOption : String) : String {
    return BingMapJavaScript.renderToString(heatMap, this, mapOption)
  }

  override function javaScriptFileNames() : String[] {
    return { "./resources/javascript/heatmap/BingMap.js" }
  }

}
