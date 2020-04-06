Ext.define('gw.doc.HiddenFile', {
  extend: 'Ext.form.Hidden',
  alias: 'widget.gHiddenFile',
  tabIndex : -1,
  initComponent : function() {
    var me = this;
    if (me.onloadScript) {
      eval(me.onloadScript);
    }
    me.callParent(arguments);
  }
});

