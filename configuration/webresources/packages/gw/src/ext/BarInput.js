Ext.define('gw.ext.BarInput', {
  extend: 'Ext.form.field.Display',
  alias: 'widget.gbarinput',
  uses: ['gw.Util'],

  getDisplayValue: function () {
    return gw.Util.renderBarInput(this, 'display');
  }
});
