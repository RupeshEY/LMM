//TODO: This override introduces Layout breaks in IE!. Investigate (after 5.1 upgrade is this still true?!)
Ext.define('gw.override.form.FieldContainer', {
  override: 'Ext.form.FieldContainer',
  uses: ['gw.Util'],

  hideEmptyLabel: true,
  labelSeparator: '', // do not add ':' after the label

  // adding table layout to avoid flow drop
  layout: {
    type: 'table'
  },

  constructor: function () {
    var me = this;
    me.plugins = me.plugins || [];
    me.plugins.push({ptype: 'helperitem', pluginId: 'helper'});
    return me.callParent(arguments);
  },

  initComponent: function () {
    var me = this;

    // @UpgradedSencha - set the default label width if necessary
    gw.Util.setDefaultLabelWidth(me);

    if (me.gDateCriterion) {
      me.cls = me.cls || '';
      me.cls = gw.Util.appendCls(me.cls, 'g-dateCriterion');
      // The date field labels in Date Criterion widget are too long
      Ext.iterate(me.items, function (item, index) {
        if (item.xtype == 'choice') {
          for (var i = 0; i < item.items.length; i++) {
            item.items[i].labelWidth = 80;
          }
        }
      });
    }

    if (me.required) {
      me.cls = me.cls || '';
      me.cls = gw.Util.appendCls(me.cls, 'g-required');
      if (me.getFieldLabel() == '' && !me.hideEmptyLabel) {
        me.setFieldLabel('&#160;');
      }
    }

    me.callParent(arguments);

    if (me.vertical) {
      me.layout.columns = 1;
    }

    me.on('beforeRender', function () {
      if (me.item) {
        me.add({
          xtype: 'container',
          style: 'margin-bottom: 2px;',
          html: me.afterContainer
        });
      }
    });
  },
  // @UpgradedSencha - make the labelable data selectable
  initRenderData: function() {
    var data = this.callParent();
    return gw.Util.makeLabelableDataSelectable(data);
  }
});
