Ext.define('gw.override.tab.Panel', {
  override: 'Ext.tab.Panel',

  shrinkWrap: true,
  shrinkWrapDock: true,

  defaultType: 'gcontainer' // recursion
});
