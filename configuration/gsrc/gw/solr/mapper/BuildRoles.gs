package gw.solr.mapper

uses gw.entity.TypeKey
uses gw.solr.utils.CCSolrUtils
uses gw.xsd.config.solr_search_config.DataProperty
uses gw.xsd.config.solr_search_config.ResultField
uses org.json.simple.JSONArray

uses java.util.Arrays
uses java.util.List


/**
 * Mapper for building a list of roles for a claim contact.
 */
@Export
class BuildRoles implements ISolrIndexMapper, ISolrQueryMapper<String>, ISolrQueryResultMapper {

  /**
   * Role list needs to be formatted as a JSON Array.
   */
  override function mapIndex(inputDataProperties : List<DataProperty>, dataHolder : IDataHolder) : JSONArray {
    CCSolrUtils.validate( inputDataProperties.Count == 1, "Role index mapper only supports a single target field.")
    
    var idp = inputDataProperties.get(0)
    var roles = Arrays.asList( dataHolder.lookup<ClaimContactRole[]>(idp))
    // must add referenced beans for consistency version tracking
    dataHolder.addReferences(roles)
    var result : JSONArray = null
    if(roles != null && !roles.Empty) {
      result = new JSONArray()
      roles.each(\ role -> result.add(role.DisplayName))
    }
    return result
  }
  
  /**
   * Map selected role as single query field.
   */
  override function mapQuery(queryDataProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    CCSolrUtils.validate( queryDataProperties.Count == 1, "Role query mapper only supports a single criterion.")
    
    var qdp = queryDataProperties.get(0)
    var rawValue = dataHolder.lookup(qdp)
    var processedValue : String = null
    
    if(rawValue typeis TypeKey) {
      var roleCode = rawValue.Code
      if("any" != roleCode) {
        processedValue = rawValue.DisplayName
      }
    }
    
    return processedValue == null ? "" : processedValue
  }
  
  /**
   * Roles column is not sortable
   */
  override function mapSortColumn(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    return null
  }

  /**
   * Roles are returned as a JSON array.  Map into a single string as a comma
   * separated list for display.
   */
  override function mapQueryResult(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder, solrResult : IResultHolder) : Object {
    CCSolrUtils.validate( resultFields.Count == 1, "Role query result mapper only supports a single target field.")
    
    var roles : Object = null
    var roleList = solrResult.lookup<List>(resultFields.get(0))
    if(roleList?.HasElements) {
      roles = roleList.join(", ")
    }
    return roles    
  }

}
