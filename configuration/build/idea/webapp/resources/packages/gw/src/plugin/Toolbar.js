Ext.define('gw.plugin.Toolbar', {
  extend: 'Ext.AbstractPlugin',
  alias: 'plugin.gtbconfig',

  /**
   * Overrides the owner container layout, before initComponent is invoked on the owning container.
   */
  constructor: function (config) {
    var cmp = config.cmp;
    Ext.apply(cmp, {
      enableOverflow: true, // do not cut off toolbar content
      defaultType: cmp.defaultType === 'button' ? 'gbutton' : cmp.defaultType
    });

    this.callParent(arguments);
  }
});