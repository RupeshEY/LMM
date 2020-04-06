package gw.solr.mapper

uses gw.xsd.config.solr_search_config.DataProperty
uses gw.xsd.config.solr_search_config.ResultField
uses java.util.Date
uses java.util.List


/**
 * Mapper for building date types in the result.
 */
@Export
class CCBuildDate extends BuildDate implements ISolrQueryResultMapper {

  public static final var DATE_FIELD_SELECTION : String = "DateFieldSelection"

  /**
   * Map single date result field to the selected solr date field
   */
  override function mapSortColumn(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    var chosenResultField : ResultField
    if (criteriaProperties.Count == 1) {
      var selection = dataHolder.lookup<String>(criteriaProperties.get(0))
      chosenResultField = resultFields.firstWhere( \ rf -> rf.Key == selection )
    } else {
      chosenResultField = resultFields.get(0)
    }
    return chosenResultField.SortFieldName
  }

  /**
   * Map the data for the chosen date field (or first specified if none selected in criteria) to
   * the single date result field.
   */
  override function mapQueryResult(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder, solrResult : IResultHolder) : Object {
    var chosenResultField : ResultField
    if (criteriaProperties.Count == 1) {
      var selection = dataHolder.lookup<String>(criteriaProperties.get(0))
      chosenResultField = resultFields.firstWhere( \ rf -> rf.Key == selection )
    } else {
      chosenResultField = resultFields.get(0)
    }
    
    var date = solrResult.lookup<Date>( chosenResultField )
    return date
  }

}
