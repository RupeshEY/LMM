Ext.define('gw.override.form.CheckboxGroup', {
  override: 'Ext.form.CheckboxGroup',
  requires: ['gw.app'],

  invalidCls: Ext.baseCSSPrefix + 'form-invalid',

  activeErrorsTpl: [
    '<tpl if="errors && errors.length">',
    '<ul class="{listCls}"><tpl for="errors"><li role="alert">{.}</li></tpl></ul>',
    '</tpl>'
  ],

  //@SenchaUpgrade ask Sencha to provide convenient syntax for typical checkbox group config (all checkboxes have the same name)
  setValue: function (value) {
    var me = this;
    if (value != null && !Ext.isObject(value)) {
      var temp = {};
      temp[me.id] = value;
      value = temp;
    }
    me.callOverridden([value]);
  },

  initComponent: function () {
    var me = this;
    me.allowBlank = !me.required;

    if (me.invalid) {
      me.addCls(me.invalidCls);
      me.markInvalid(me.invalidText);
    } else {
      me.removeCls(me.invalidCls);
      me.clearInvalid();
    }

    // Override default layout of check/radio group, to workaround ExtJs bug that radios are spread out too much
    // @SenchaUpgrade Still an issue in ExtJs 4.1.1
    me.layout = {type: 'table'};
    if (me.columns != null) {
      me.layout.columns = me.columns;
    }

    // checkbox value is set at individual checkbox level; no need to set value still in json for smoketest
    if (me.value) {
      me.value = null;
    }

    me.callParent(arguments);
    me.initField();
    me.on({

      change: gw.app.onChange,

      // Can't create tooltip until after component has been created and registered.
      // Don't create tooltip if component is invalid
      afterrender: function (group) {
        if (!group.invalid) {
          group.createTooltipComponent();
        }
      },

      // Ensure tooltip is cleaned up when checkbox group is destroyed
      beforedestroy: function (group) {
        group.destroyTooltipComponent();
      },

      // Remove tooltip if group just became invalid, create it if group just became valid
      validitychange: function (group, isValid) {
        if (isValid) {
          group.createTooltipComponent();
        } else {
          group.destroyTooltipComponent();
        }
      }

    })
  },

  createTooltipComponent: function () {
    var me = this;
    if (me.tooltip && !me.tooltipComponent) {
      me.tooltipComponent = Ext.create('Ext.tip.ToolTip', {
        target: me.el,
        html: me.tooltip
      })
    }
  },

  destroyTooltipComponent: function () {
    var me = this;
    if (me.tooltipComponent) {
      Ext.destroy(me.tooltipComponent);
      me.tooltipComponent = null;
    }
  }
});
