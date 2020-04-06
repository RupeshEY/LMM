package gw.solr.mapper

uses gw.solr.utils.CCSolrUtils
uses gw.pl.persistence.core.Key
uses gw.xsd.config.solr_search_config.DataProperty
uses gw.xsd.config.solr_search_config.ResultField
uses org.json.simple.JSONArray

uses java.lang.StringBuilder
uses java.util.List

/**
 * Builds the Access Control list information necessary for restricting the viewing of Claims in the
 * Free Text search.
 */
@Export
class BuildACLInfo implements ISolrIndexMapper, ISolrQueryMapper<String>, ISolrQueryResultMapper {

  /**
   * Role list needs to be formatted as a JSON Array.
   */
  override function mapIndex(inputDataProperties : List<DataProperty>, dataHolder : IDataHolder) : JSONArray {
    CCSolrUtils.validate(inputDataProperties.Count == 1, "ACL index mapper only supports a single target field.")
    
    var idp = inputDataProperties.get(0)
    var keys = dataHolder.lookup<Key[]>(idp)
    var result : JSONArray = null
    if(keys != null && keys.length > 0) {
      result = new JSONArray()
      keys.each(\ key -> result.add(key.getValue()))
    }
    return result
  }
  
  /**
   * Map selected role as single query field.
   */
  override function mapQuery(queryDataProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    CCSolrUtils.validate(queryDataProperties.Count == 1, "ACL query mapper only supports a single criterion.")
    
    var qdp = queryDataProperties.get(0)
    var aclData = dataHolder.lookup<Object>(qdp)
    if(aclData typeis Key[]) {
      if(aclData.Count > 1) {
        var sb = new StringBuilder()
        sb.append("(")
        var first = true
        for (key in aclData) {
          if (first) {
            first = false
          } else {
            sb.append(" OR ")
          }
          sb.append(key.toString())
        }
        sb.append(")")
        return sb.toString()
      } else if(aclData.Count > 0 && aclData[0] != null) {
        return aclData[0].toString()
      } else {
        return null
      }
    } else if(aclData typeis Boolean) {
      return aclData.toString()
    } else {
      return null
    }
  }
  
  /**
   * ACL columns are not sortable
   */
  override function mapSortColumn(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    return null
  }

  /**
   * ACL info is not returned.
   */
  override function mapQueryResult(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder, solrResult : IResultHolder) : Object {
    return null    
  }
}
