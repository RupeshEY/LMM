package gw.solr.mapper

uses gw.xsd.config.solr_search_config.DataProperty
uses java.lang.StringBuilder
uses java.util.List

/**
 * An Index mapper that concatenates the separate address lines into
 * a single String with line delimiters.
 */
@Export
class BuildAddressLines implements ISolrIndexMapper {

  override function mapIndex(inputDataProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    var separator = ", "
    var sb = new StringBuilder()
    for (idp in inputDataProperties) {
      var element = dataHolder.lookup<String>(idp)
      if (element != null && element.trim().length() > 0) {
        if (sb.length() > 0) {
          sb.append(separator)
        }
        sb.append(element)
      }
    }
    return sb.toString()
  }
}
