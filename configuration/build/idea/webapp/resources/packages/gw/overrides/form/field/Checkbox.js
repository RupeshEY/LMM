// fire onChange event on click, if a checkbox or radio does not belong to a group
Ext.define('gw.override.form.field.Checkbox', {
  override: 'Ext.form.field.Checkbox',
  requires: ['Ext.String', 'Ext.form.CheckboxGroup'],

  initComponent: function () {
    var me = this;

    if (me.boxIcon) {
      me.beforeBoxLabelTextTpl =  Ext.String.format('<img style="vertical-align:middle;margin:0 3px 3px 0;" height="{0}" width="{1}" src="{2}">',
                                                      me.iconHeight, me.iconWidth, me.boxIcon);
    }
    delete me.boxIcon;
    me.callParent(arguments);
    me.un('focus', gw.app.deferChangeTillBlur); // for checkbox and radio, no need to defer change event till blur

    me.on('added', function (comp, container) {
      // if this checkbox belongs to a group, do not handle change event on its own:
      if (container instanceof Ext.form.CheckboxGroup) {
        comp.un('blurchange', gw.app.onChange);
      }
    });

    me.on('specialkey', function (field, e) {
      // PL-32301 We do NOT want the Enter key to toggle boolean controls as it interferes with Default action that is mapped to Enter
      if (e.getKey() == e.ENTER) {
        e.preventDefault();
      }
    });
  }

});
