/**
 * A labellable container which contains a Grid panel. Supported properties:
 * <li> fieldLabel
 * <li> labelAlign: top or left
 * <li> hideLabel
 * <li> labelWidth
 * <li> labelCls
 * <li> labelStyle
 * <li> colspan (pass-through)
 */
Ext.define('gw.form.LvInput', {
  extend: 'Ext.container.Container',
  alias: 'widget.glvinput',
  uses: ['gw.Util'],

  layout: {
    type: 'table',
    tableAttrs: {
      style: {width: '100%'}
    }
  },

  constructor: function () {
    var me = this;
    me.callParent(arguments);
  },

  initComponent: function () {
    var me = this;

    me.labelWidth = gw.Util.getLabelWidth();
    me.layout.columns = (me.labelAlign === 'top' || me.hideLabel) ? 1 : 2;

    if (!me.hideLabel) { // insert a label component as the first child item:
      var theLabel = [
        {
          xtype: 'label',
          html: me.fieldLabel,
          style: me.labelStyle,
          cls: me.labelCls,
          tdAttrs: {
            width: me.labelWidth,
            style: {'vertical-align': 'top'}
          }
        }
      ];
      if (me.items) {
        Ext.Array.insert(me.items, 0, theLabel);
      } else {
        me.items = theLabel;
      }
    }

    this.callParent(arguments);
  }

});
