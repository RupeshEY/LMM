package gw.acc.iplm.utils

uses com.guidewire.cc.system.exim.CCExportDataSetFactoryImpl
uses com.guidewire.pl.system.dependency.PLDependencies;
uses com.google.common.collect.ImmutableList

/**
 * Factory for London Market specific export data sets
 */
class LMExportDataSetFactoryImpl_Ext extends CCExportDataSetFactoryImpl {

  static function init():void{
    PLDependencies.setExportDataSetFactory(new LMExportDataSetFactoryImpl_Ext());
  }

  override property get AdditionalDataSets():List{
    var list = new ArrayList();
    list.addAll(super.getAdditionalDataSets())
    list.add(new RiskCodeExportDataSet_Ext())
    return ImmutableList.copyOf(list)
  }
}
