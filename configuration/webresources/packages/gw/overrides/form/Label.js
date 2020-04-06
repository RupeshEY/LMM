Ext.define('gw.override.form.label', {
  override: 'Ext.form.Label',
  requires: ['Ext.XTemplate'],

  initComponent: function () {
    var me = this;

    if (me.labelClsExtra) {
      me.addCls(me.labelClsExtra);
    }
    me.callParent(arguments);
  }
});
