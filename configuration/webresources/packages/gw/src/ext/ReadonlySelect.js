Ext.define('gw.ext.ReadonlySelect', {
  extend: 'Ext.form.field.Display',
  alias: 'widget.readonlyselect',
  requires: ['Ext.data.schema.Schema', 'Ext.data.ArrayStore', 'Ext.data.Model'],

  initComponent: function () {
    var me = this;
    if (me.store) {
      var modelId = 'g-model-ReadonlySelect';
      if (!Ext.data.schema.Schema.hasSchemaWithEntity(modelId)) {
        Ext.define(modelId, {
          extend: 'Ext.data.Model',
          fields: ['value', 'text']
        });
      }
      me.store = Ext.create('Ext.data.ArrayStore', {
        autoDestroy: true,
        model: modelId,
        data: me.store
      });
    }
    me.callParent(arguments);
  },
  setValue: function (value) {
    var me = this,
        copy_arg = Ext.Array.clone(arguments);
    if (value && me.store) {
      var index = me.store.findExact('value', value);
      if (index != -1) {
        value = me.store.getAt(index).get('text');
      }
      copy_arg[0] = value;
    }
    me.callParent(copy_arg);
  },
  getValue: function () {
    var me = this,
        value = me.callParent(arguments);
    if (me.store) {
      var index = me.store.findExact('text', value);
      if (index != -1) {
        value = me.store.getAt(index).get('value');
      }
    }
    return value
  }
});
