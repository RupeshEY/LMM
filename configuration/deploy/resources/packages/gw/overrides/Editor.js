Ext.define('gw.override.Editor', {
  override: 'Ext.Editor',
  requires: ['gw.ext.SimpleCombo', 'Ext.event.Event', 'Ext.form.field.Text'],
  uses: ['gw.app', 'gw.Util', 'gw.Debug', 'gw.GridUtil'],

  completeOnEnter: false, // Do not dismiss editor or lose focus on ENTER key

  _unboxCellValue:function (value) {
    var item = gw.GridUtil.getFirstInputInTemplateCell(value);
    if (item) {
      value = item['value']
    }

    if (value) {
      // unbox composite value
      if (value.value !== undefined) {
        return value.value; // use editValue if any
      } else if (value.text !== undefined) {
        return value.text;
      }
    }
    return value
  },

  initComponent: function () {

    /** Do not complete edit yet, if we need to confirm the value change */
    this.on('beforecomplete', function (editor, value, startValue) {

      var field = editor.field;
      if (field.skipConfirm) {
        if (Ext.MessageBox.isVisible()) {
          return false; // If the message box is visible, then we return false to prevent editing from "completing"
        }
        return; // Otherwise, we are completing the edit from below, so bail out
      }

      // show confirmation dialog, if value has changed:
      if (field.confirm && value !== startValue) {
        // do not confirm again for this change, set the value now before the dialog is put up to prevent duplicates
        field.skipConfirm = true;
        if (editor.grid) {
          // We need to tell the GridUtil that we are doing a confirmation on this grid.  Normally the closing
          // of a message box window attempts to restore the last grid position.  This defers it to after the confirm
          // If we don't do this, then exceptions occur in the UI as the restore happens BEFORE the callback for the
          // confirm, and the editor no longer has it's field and things go boom
          gw.GridUtil.confirmingFocusedCell(editor.grid, false);
        }

        gw.app.confirm('', field.confirm, function (btn) {
          if (btn == 'yes' || btn == 'ok') { // confirmed
            editor.completeEdit(); // This also calls 'beforecomplete' but we will bail out above
            field.fireEvent('blurchange', field, value, startValue);
          } else { // cancelled:
            editor.cancelEdit();
          }
          if (editor.grid) {
            // We need to tell the GridUtil that we are done with a confirmation on this grid.  And we also need to
            // restore the last focused cell too
            gw.GridUtil.confirmingFocusedCell(editor.grid, true);
            gw.GridUtil.restoreLastFocusedCell(editor.grid, gw.app._gridNavigation);
          }
          // we are done confirming, so clear the flag.
          delete field.skipConfirm;
        });

        return false;
      }
    });

    //
    // When click to edit a bounded dropdown cell, open menu
    // When tab to edit a text cell, select all text.
    //
    this.on('startedit', function (ed) {
      // @SenchaUpgrade what's the best way to distinguish "clicking" vs "tabbing" into a cell editor?
      if (Ext.EventObject.type === 'click') { // click to edit

        if (ed.field instanceof gw.ext.SimpleCombo) {
          ed.field.on('focus', function () { // wait till the field gets focus
            ed.field.selectText();
            ed.field.onTriggerClick();
          }, null, {single: true})
        }

      } else if (Ext.EventObject.type === 'blur') { // tab to edit

        if (ed.field instanceof Ext.form.field.Text) {
          ed.field.on('focus', function () { // wait till the field gets focus
            ed.field.selectText();
          }, null, {single: true});
        }
      }
    });

    this.callParent(arguments);
  },

  /**
   * Extends base implementation to remember editor on the field
   */
  onRender: function () {
    this.callParent(arguments);
    this.field.editor = this;
  },

  /**
   * Overrides super to only edit the "text" part of a composite field
   */
  startEdit: function (el, value) {
    var me = this,
        unboxedValue = this._unboxCellValue(value);
    // Do not start extjs editor for radiogroup, radiogroups use custom rendering
    var type = me.field.xtype;

    if (!gw.GridUtil.hasEditor(type)) {
      return false;
    }

    me.callParent([el, unboxedValue]);
    // extra checking to un-register the tooltip if the field is invalid so the error message doesn't overlap with tooltip.
    // Event fired was suspended during cell start edit so validitychange event didn't get fired.
    if (me.field.tooltip) {
      if (me.field.isValid()) {
        me.field.setTooltip(me.field.tooltip, /*initial*/true);
      } else {
        me.field.clearTip();
      }
    }

    //PLWEB-3140: The default startEdit calls setValue() on the field with the cell's
    //value, but if the field is a datefield and the value does not parse, this
    //does not work. If the RawValue is not set, but there is a previous value,
    //set it directly
    if(type === "datefield" && unboxedValue && !this.field.getRawValue()) {
      this.field.setRawValue(unboxedValue);
    }
  },

  /**
   * Overrides original to return raw value which is always a string.
   * To preserve the date format after editing
   */
  getValue: function () {
    return gw.Util.getFieldValue(this.field);
  }
});
