Ext.define('gw.ext.ChoiceRadio', {
  extend: 'Ext.form.field.Radio',
  alias: 'widget.choiceradio',
  requires: ['gw.app'],

  initComponent: function () {
    this.callParent(arguments);//initComponent on super
    this.un('blurchange', gw.app.onChange);
    this.on('blurchange', function (radio, newValue, oldValue) {
      var checkedItemCount = 0;
      var checkedRadioItem;
      //@SenchaUpgrade radio.getManager() is private function in ExtJS, be careful when upgrade since ExtJS could change internal function.
      radio.getManager().getByName(radio.name, radio.getFormId()).each(function (item) {
        if (item.checked) {
          checkedItemCount++;
          checkedRadioItem = item;
        }
      });
      if (checkedItemCount == 1) {
        gw.app.handleChange(checkedRadioItem, true, false)
      }
    });
  }
});
