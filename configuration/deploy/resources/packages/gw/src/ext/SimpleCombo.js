/**
 * A simple combo box like a HTML select element.
 * Overrides super to
 * <li>Proper encoding for combo box option label. (No HTML is allowed in option label, as of HTML Select)
 * <li>Support option group label
 */
Ext.define('gw.ext.SimpleCombo', {
  extend: 'Ext.form.field.ComboBox',
  alias: 'widget.simplecombo',
  requires: ['Ext.XTemplate', 'Ext.data.schema.Schema', 'Ext.data.Model', 'Ext.data.ArrayStore'],
  uses: ['gw.app'],
  
  typeAhead: true,
  forceSelection: true, // do not allow arbitrary user input
  matchFieldWidth: false, // allow the pull-down menu to auto size
  listConfig: {
    tpl: new Ext.XTemplate(
      '<tpl for=".">',
      // option group label:
        '<tpl if="this.field3 != values.field3">',
        '<tpl exec="this.field3 = values.field3"></tpl>',
        '<h1>{field3}</h1>',
      '</tpl>',

      '<li role="option" class="', Ext.baseCSSPrefix, 'boundlist-item">{field2:htmlEncode}</li>', // fix encoding of special character
      '</tpl>'
    )
  },

  initComponent: function () {
    var me = this;
    // create group field:
    if (!me.store) {
      // @UpgradedSencha - ExtJs5 errors on "default empty" stores which is created when there is no store defined for
      // this component, so generate an array with nothing in it so that we build a proper g-combo-model store
      me.store = [];
    }
    if (Ext.isArray(me.store)) {
      me.queryMode = 'local';
      me.valueField = 'field1';
      me.displayField = 'field2';
      me.groupField = 'field3';

      var modelId = 'g-combo-model';
      // define an explicit model for the array store:
      if (!Ext.data.schema.Schema.hasSchemaWithEntity(modelId)) {
        Ext.define(modelId, {
          extend: 'Ext.data.Model',
          fields: [me.valueField, me.displayField, me.groupField]
        });
      }

      me.store = Ext.create('Ext.data.ArrayStore', {
        autoDestroy: true,
        model: modelId,
        data: me.store
      });
    }

    me.callParent(arguments);

    if (me.value == "" && me.store.getCount() > 0 && me.store.findExact(me.valueField, me.value) < 0) {
      me.setValue(me.store.getAt(0).get(me.valueField)); // select the first option
    }
  },


  onTriggerClick: function() {
    // Do not dropdown menu when load mask is present
    if (gw.app.isLoadMaskVisible()) {
      return;
    }

    this.callParent(arguments);
  },

  initEvents: function () {
    var me = this;
    me.callParent();

    // select cell text and open menu, when clicking on a bounded combo field:
    me.mon(me.inputEl, 'click', function () {
      me.selectText();
      me.onTriggerClick()
    });
  }

});

