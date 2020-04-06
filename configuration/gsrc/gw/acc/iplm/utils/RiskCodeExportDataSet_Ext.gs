package gw.acc.iplm.utils

uses com.guidewire.pl.system.exim.ExportDataSet
uses com.guidewire.pl.system.exim.beaniterator.BeanIterator
uses com.google.common.collect.ImmutableList
uses gw.api.database.Queries
uses gw.api.locale.DisplayKey

/**
 * The model for exporting London Market Risk codes
 */
class RiskCodeExportDataSet_Ext implements ExportDataSet {

  override property get BeanIterators(): List<BeanIterator> {
   var list = new ArrayList<BeanIterator>()
    list.add(new BeanIterator(SCMRiskCode_Ext, Queries.createQuery(SCMRiskCode_Ext).select()))
    return ImmutableList.copyOf(list)
  }

  /**
   * @return false, as the risk code list is less than 300 items as of 2017 and unlikely to grow faster than by a
   * few elements per year
   */
  override function couldBeRidiculouslyLarge(): boolean {
    return false
  }

  override property get DisplayName(): String {
    return DisplayKey.get("Accelerator.IPLM.Export.RiskCodeDisplayName")
  }

  override property get ShortName(): String {
    return DisplayKey.get("Accelerator.IPLM.Export.RiskCodeDisplayName")
  }
}