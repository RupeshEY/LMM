/*
 * DateTime field extension
 * Original code from Sencha community forum:
 * http://www.sencha.com/forum/showthread.php?137242-Ext.ux.DateTimeField-DateTimePicker-for-ext4-also-DateTimeMenu-TimePickerField
 *
 * Note: These classes have been customized. In particular, no need to override the height style and initializing the
 * spinner field did not work in the original.
 *  update Ext - 4.1 2012/04/27
 *
 *  Note (cliu): The current implementation with the hour and minute spinners leaves a hole in the POC logic where a user can
 *  avoid a POC by only using the keyboard to operate the spinner and hitting escape to set the model value but not trigger a change
 *  event.
 *
 *  This custom implementation creates some hour and minute spinners in the date time footer. The AM/PM combo will also be available
 *  if localization.xml or the PCF configured for a 12-hour format.
 *
 *  Some internal Sencha functions and properties were overridden to handle the extra time-component present in the modelValue.
 *
 *  Behaviors:
 *  Tabbing inside the date picker cell will move the focus to the hour spinner.
 *  Hitting enter in the date picker cells will simulate a click on the currently selected cell
 *  Hitting enter in the time picker spinners will also simulate a click on the currently selected cell
 */

/**
 * Time picker field. Hour/minute spinner fields for selecting hour/minutes.
 */
Ext.define('gw.ext.TimePickerField', {
  extend: 'Ext.form.field.Base',
  alias: 'widget.utimepicker', // prefix ux class with "u" to avoid conflict with base ExtJs class
  alternateClassName: 'Ext.form.field.TimePickerField',
  requires: ['Ext.form.field.Number', 'Ext.data.Store', 'Ext.form.ComboBox'],
  uses: ['Ext.dom.Query', 'Ext.core.DomHelper'],

  // hidden basefield's input
  inputType: 'hidden',

  style: 'padding:4px 0 0 0;margin-bottom:0px',

  twelveHourMode: true,

  amSymbol: 'AM',

  pmSymbol: 'PM',

  /**
   * @cfg {String} value
   * initValue, format: 'H:i:s'
   */
  value: null,

  /**
   * @cfg {Object} spinnerCfg
   *  number input config
   */
  spinnerCfg: {
    width: 45
  },

  /** Override. */
  initComponent: function () {
    var me = this;
    // value already passed in from DateTimePicker
    //me.value = me.value || Ext.Date.format(new Date(), 'H:i:s');

    me.callParent(arguments);// called setValue

    me.spinners = [];

    me.amPmStore = Ext.create('Ext.data.Store', {
      fields: ['code', 'value'],
      data: [
        {'code': 'am', 'value': me.amSymbol},
        {'code': 'pm', 'value': me.pmSymbol}
      ]
    });

    var cfg = Ext.apply({}, me.spinnerCfg, {
      ownerCt: me,
      readOnly: me.readOnly,
      disabled: me.disabled,
      style: 'float: left'
    });

    var comboConfig = Ext.apply({}, {
      width: 50
    }, {
      readOnly: me.readOnly,
      disabled: me.disabled,
      style: 'float: left',
      ownerCt: me
    });


    me.hoursSpinner = Ext.create('Ext.form.field.Number', Ext.apply({}, cfg, {
      minValue: me.twelveHourMode ? 1 : 0,
      maxValue: me.twelveHourMode ? 12 : 23
    }));
    me.minutesSpinner = Ext.create('Ext.form.field.Number', Ext.apply({}, cfg, {
      minValue: 0,
      maxValue: 59
    }));
    me.amPmCombo = Ext.create('Ext.form.ComboBox', Ext.apply({}, comboConfig, {
      store: me.amPmStore,
      displayField: 'value',
      valueField: 'code'
    }));

    me.spinners.push(me.hoursSpinner, me.minutesSpinner);
  },

  /**
   * @private
   * Override.
   */
  onRender: function () {
    var me = this, spinnerWrapDom, spinnerWrap;
    me.callParent(arguments);

    // render to original BaseField input td
    spinnerWrapDom = Ext.dom.Query.select('div', me.getEl().dom);
    spinnerWrap = Ext.get(spinnerWrapDom);
    me.callSpinnersFunction('render', spinnerWrap);

    if (me.twelveHourMode){
      me.callComboFunction('render', spinnerWrap);
    }

    Ext.core.DomHelper.append(spinnerWrap, {
      tag: 'div',
      cls: Ext.baseCSSPrefix + 'form-clear-left'
    });

    me.setRawValue(me.value);
  },

  _valueSplit: function (v) {
    if (Ext.isDate(v)) {
      v = Ext.Date.format(v, 'H:i');
    }
    var split = v.split(':');
    return {
      h: split.length > 0 ? split[0] : 0,
      m: split.length > 1 ? split[1] : 0
    };
  },
  // , call each spinner's function
  callSpinnersFunction: function (funName, args) {
    for (var i = 0; i < this.spinners.length; i++) {
      this.spinners[i][funName](args);
    }
  },
  callComboFunction: function(funName, args){
    this.amPmCombo[funName](args);
  },
  // @private get time as object,
  getRawValue: function () {
    var me = this;
    if (!me.rendered) {
      var date = me.value || new Date();
      return me._valueSplit(date);
    } else {
      if(me.twelveHourMode) {
        var a = me.amPmCombo.getValue();
        var spinnerH = me.hoursSpinner.getValue();
        var realH = spinnerH;

        if (a === 'am' && spinnerH === 12) {
          realH = 0;
        } else if (a === 'pm' && spinnerH != 12) {
          realH += 12;
        }

        return {
          h: realH,
          m: me.minutesSpinner.getValue()
        }
      }

      return {
        h: me.hoursSpinner.getValue(),
        m: me.minutesSpinner.getValue()
      };
    }
  },

  // private
  setRawValue: function (value) {
    var me = this;
    value = me._valueSplit(value);
    if (me.hoursSpinner) {
      if (me.twelveHourMode){
        value.h >= 12 ? me.amPmCombo.setValue(me.pmSymbol) : me.amPmCombo.setValue(me.amSymbol);
        if (value.h === 0){
          me.hoursSpinner.setValue(12);
        }else if (value.h > 12){
          me.hoursSpinner.setValue(value.h - 12);
        }else{
          me.hoursSpinner.setValue(value.h);
        }

      }else{
        me.hoursSpinner.setValue(value.h);
      }
      me.minutesSpinner.setValue(value.m);
    }
  },
  // overwrite
  getValue: function () {
    return this.getRawValue();
  },
  // overwrite
  setValue: function (value) {
    var me = this;
    me.value = Ext.isDate(value) ? Ext.Date.format(value, 'H:i') : value;
    if (!me.rendered) {
      return;
    }
    me.setRawValue(me.value);
    me.validate();
  },
  // overwrite
  disable: function () {
    var me = this;
    me.callParent(arguments);
    me.callSpinnersFunction('disable', arguments);
    me.callComboFunction('disable', arguments);
  },
  // overwrite
  enable: function () {
    var me = this;
    me.callParent(arguments);
    me.callSpinnersFunction('enable', arguments);
    me.callComboFunction('enable', arguments);
  },
  // overwrite
  setReadOnly: function () {
    var me = this;
    me.callParent(arguments);
    me.callSpinnersFunction('setReadOnly', arguments);
    me.callComboFunction('setReadOnly', arguments);
  },
  // overwrite
  clearInvalid: function () {
    var me = this;
    me.callParent(arguments);
    me.callSpinnersFunction('clearInvalid', arguments);
    me.callComboFunction('clearInvalid', arguments);
  },
  // overwrite
  isValid: function (preventMark) {
    var me = this;
    return me.hoursSpinner.isValid(preventMark) && me.minutesSpinner.isValid(preventMark) && me.amPmCombo.isValid(preventMark);
  },
  // overwrite
  validate: function () {
    var me = this;
    return me.hoursSpinner.validate() && me.minutesSpinner.validate() && me.amPmCombo.validate();
  }
});
