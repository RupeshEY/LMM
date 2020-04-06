/**
 * @UpgradedSencha 5.1
 * To support different constant values for regular vs touch devices, we are introducing this class so that
 * these constants are located in one easily override-able location.  This class contains the values for all non-touch
 * based components.
 */
Ext.define('gw.ThemingConstants', {
  singleton: true,

  westPanelWidth: 200,
  northPanelBarHeight: 30,
  cmdProcLayoutDelay: 1
});