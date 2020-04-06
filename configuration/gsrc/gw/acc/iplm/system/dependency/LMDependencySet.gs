package gw.acc.iplm.system.dependency

uses gw.acc.iplm.utils.LMExportDataSetFactoryImpl_Ext

/**
 * Set of dependencies specific to the London Market accelerator.
 * Called from preload.txt
 */
public class LMDependencySet {
  public static function init()
  {
    LMExportDataSetFactoryImpl_Ext.init()
  }
}