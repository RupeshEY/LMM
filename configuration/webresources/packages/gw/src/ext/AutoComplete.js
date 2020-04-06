/**
 * A textbox with auto-complete suggestions
 */
Ext.define('gw.ext.AutoComplete', {
  extend: 'Ext.form.field.ComboBox',
  alias: 'widget.autocomplete',
  requires: ['Ext.XTemplate', 'Ext.data.schema.Schema', 'gw.ModelStore', 'Ext.data.Model'],
  minChars: 0,
  typeAhead: true,
  hideTrigger: true,// hide dropdown arrow
  forceSelection: false,
  triggerAction: 'query',

  defaultListConfig: {loadingText: ''},// hide loading text
  valueField: 'text', // default value field

  shouldRestoreLastValidValue: false, // autocomplete is not a combobox, valid is relative

  listConfig: {
    tpl: '<tpl for="."><div class="' + Ext.baseCSSPrefix + 'boundlist-item">{listText}</div></tpl>'
  },

  /**
   * <li>Sets up store with special data loading
   * <li>If "displayField" is specified, don't ever set it into the textbox, since it may contain HTML tags
   */
  initComponent: function () {
    var me = this;
    // do not allow displayField to differ from valueField, otherwise the displayField will be set into the textbox
    me.textField = me.displayField;
    me.displayField = me.valueField;
    me.on("beforedestroy", me.handleBeforeDestroy, me);

    if (!me.modelId) { // default model config
      me.modelId = 'g-model-autocomplete';
      if (!Ext.data.schema.Schema.hasSchemaWithEntity(me.modelId)) {
        Ext.define(me.modelId, {
          extend: 'Ext.data.Model',
          fields: [me.valueField, 'listText']
        });
      }
    }

    // Set up the store fields before instantiating the store (i.e., before calling super):
    me.store = { model: me.modelId };

    // @SenchaUpgrade workaround ExtJs bug where xtype in the store config is ignored:
    me.store = Ext.create('gw.ModelStore', me.store);

    me.callParent(arguments);

    // Sets up model info after the store is instantiated.
    me.store.setModelId(me.eventParam || me.id, me.argWidgets);

    /**
     * Do not cache query result, if the query depends on additional args
     * @param evt query event
     */
    me.on('beforequery', function (evt) {
      if (evt.combo.argWidgets) {
        delete evt.combo.lastQuery;
      }
      Ext.apply(evt.combo.store.proxy.extraParams, {'caretPosition': this.getCaretPosition()});
    });

    // un-register the default blur event handler. Add blur event handler to handle caret Position.
    me.un('blur', gw.app.onBlurChange);
    me.on('blur', me.onBlurOrSelect);

    // Add event handler to handle caret Position when selection changed.
    me.un("select", me.handleSelect, me);
    me.on('select', function (comp) {
      if (me.gChangeOnBlur && me.gchanged) {
        me.onBlurOrSelect(comp);
      }
    });
    },

  onBlurOrSelect: function(comp, blurEvent) {
    var me = this,
        params = {},
        viewRootId = me.eventParam || me.id,
        hasPostedToServer,
        hasCaretPositionChanged;

    params[viewRootId + '_caretPosition'] = blurEvent ?  me.getCaretPosition() : comp.newValueBlur.length;
    params.blur_event = blurEvent;

    me.doQueryTask.cancel();
    me.checkChange();

    if (comp.gchanged) {
      comp.gchanged = false;
      if (!comp.isEqual(comp.newValueBlur, comp.lastValueBlur)) {
        gw.app.handleChange(me, comp.newValueBlur, comp.lastValueBlur, function (options, success, response) {

          // checking postedToServer and lastCaretPosition to determine if a separate request should be made.
          hasPostedToServer = options && options.postedToServer;
          hasCaretPositionChanged =  !me.lastCaretPosition || me.lastCaretPosition !== me.getCaretPosition();

          if ( !hasPostedToServer && hasCaretPositionChanged) {
            // Make a separate call to set caret position if no postOnChange is sending back to the server
            gw.app.requestViewRoot(viewRootId, params)
          }
        }, params)
      }
    } else if (!me.lastCaretPosition || me.lastCaretPosition !== me.getCaretPosition()) {
      // make a request back to the server to set Caret Position even if the value is not changed
      gw.app.requestViewRoot(viewRootId, params)
    }

    // stash the last caret position so we won't have to continually post the same data to the server
    me.lastCaretPosition = me.getCaretPosition();
  },

  checkChange: function() {
    var me = this,
        newVal, oldVal;
    if (!me.suspendCheckChange) {
      // Since autoCompete is derived from comboBox; me.getValue could return null if no match is found in the store.
      // In that case we want to use empty string as newVal. Also me.lastValue might not be set if this autoComplete is
      // in the LV. In that case we want to use me.originalValue as oldVal to check the change.
      newVal = me.getValue() || '';
      oldVal = me.lastValue || me.originalValue;
      // end of modification
      if (!me.isDestroyed && me.didValueChange(newVal, oldVal)) {
        me.lastValue = newVal;
        me.fireEvent('change', me, newVal, oldVal);
        me.onChange(newVal, oldVal);
      }

    }
  },

  /*
   Make sure every task is cancelled when the component is destroyed. This can lead to NPE exceptions
   when an XHR query returns after destruction. This is handled for typeAhead in the Sencha code, but
   not for the queryTask.
   */
  handleBeforeDestroy: function () {
    var me = this;
    if (me.doQueryTask) {
      me.doQueryTask.cancel();
    }
  },

  // override getSubmitValue so it returns empty string instead of null when the field is set empty
  getSubmitValue: function () {
    var submitValue = this.callOverridden(arguments);
    return (submitValue != null) ? submitValue : this.getRawValue();
  },

  getCaretPosition: function () {
    var el = this.inputEl.dom;
    if (typeof(el.selectionStart) === "number") {
      return el.selectionStart;
    } else if (document.selection && el.createTextRange) {
      var range = document.selection.createRange();
      range.collapse(true);
      range.moveStart("character", -el.value.length);
      return range.text.length;
    } else {
      return -1;
    }
  }

});
