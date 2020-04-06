/**
 * A composite field for entering Japanese Imperial Calendar data.
 */
Ext.define('gw.ext.JapaneseImperialDate', {
  extend: 'Ext.form.FieldContainer',
  alias: 'widget.gjicdate',
  requires: ['gw.app'],
  layout: {
    type: 'table'
  },
  defaults: {
    typeAhead: true,
    xtype: 'combo', // most child elements are bounded combo box
    submitValue: false // most child elements don't submit value directly
  },

  items: [
    { // ERA element
      width: 70,
      emptyText: 'G',
      store: [''],
      forceSelection: true
    },
    { // YEAR IN ERA element
      store: [''],
      forceSelection: true,
      emptyText: 'yy',
      width: 55
    },
    { // YEAR symbol
      xtype: 'component',
      autoEl: {
        tag: 'span'
      }
    },
    { // MONTH IN YEAR element
      store: ['', '01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'], // hard code months here
      forceSelection: true,
      emptyText: 'MM',
      width: 55
    },
    { // MONTH symbol
      xtype: 'component',
      autoEl: {
        tag: 'span'
      }
    },
    { // 3: day in month
      width: 35,
      maskRe: /\d/,
      enforceMaxLength: true,
      emptyText: 'dd',
      maxLength: 2,
      validator: function () {
        return this.ownerCt.validateDay.apply(this.ownerCt, arguments);
      },
      xtype: 'textfield'
    },
    { // DAY symbol
      xtype: 'component',
      autoEl: {
        tag: 'span'
      }
    },
    { // 4: time
      forceSelection: false,
      width: 90,
      xtype: 'timefield'
    },
    { // 5: a hidden input to submit value to the server
      submitValue: true,
      getSubmitValue: function () {
        return this.ownerCt.getValue();
      },
      getName: function () {
        return this.ownerCt.id;
      },
      tdAttrs: {style: {width: '0px'}}, // do not consume any space
      xtype: 'hidden'
    }
  ],

  validateDay: function (day) {
    if (day) {
      if (Number(day) < 1 || Number(day) > 31) {
        return this.invalidText; // day > 31 is obviously invalid
      }
    }

    // TODO: validation based on current month context  (e.g. 29th of Feb on non-leap year)

    return true;// valid
  },

  /**
   * Updated range of years, when the era changes
   */
  updateYearsInEra: function () {
    var me = this;
    var era = me.eraElem.getValue();
    var yearElem = me.yearElem;
    var yearArray = gw.app.getJICYearsInEra(era);

    if (!Ext.Array.contains(yearArray, yearElem.getValue())) { // clear out of range year value:
      yearElem.suspendEvents(false);
      yearElem.setValue('');
      yearElem.resumeEvents();
    }

    // update range
    yearElem.store.loadData(yearArray.map(function (v) {
      var rec = {};
      rec[yearElem.valueField] = v;
      return rec
    }));
  },

  /**
   * @return {Boolean} true, if all fields are empty, or all fields are filled (i.e. the data is complete)
   */
  isValid: function () {
    var me = this;
    var hasValue = null;
    var valid = true;
    Ext.Array.each(me.inputItems, function (item) {
      if (item == me.timeElem && !me.timeFormat) {
        return;
      }

      if (!item.isValid()) {
        valid = false;
        return false;
      }

      if (hasValue == null) {
        hasValue = !!item.getSubmitValue();
      } else {
        if (hasValue != !!item.getSubmitValue()) {
          valid = false;
          return false;  // abort iteration
        }
      }
    }, me);

    return valid;
  },

  /**
   * Invokes change event handler, when value changes, ONLY if the value is complete
   */
  onChange: function (comp, newValue, oldValue) {
    var me = this;
    if (!comp.isValid() ||
      comp.forceSelection && !comp.findRecordByDisplay(newValue)) { // ignore out-of-range value, it'll be reverted soon. @SenchaUpgrade Is it a bug that ExtJs fires change event in me case?
      return;
    }

    if (comp == me.eraElem) { // update year range after era changes
      me.updateYearsInEra();
    }

    if (me.isValid()) {
      gw.app.onChange(me, me.getValue())
    }
  },

  /**
   * @return JIC date value as string; or '', when the value is incomplete
   */
  getValue: function () {
    var me = this;
    if (!me.isValid()) {
      return null; // value incomplete, do not submit
    }

    // date value:
    var hasValue = false;
    var args = [gw.app.getJICInputDateFormatTokenized()]; // The tokenized string to be formatted
    Ext.Array.each(me.inputItems, function (item) {
      if (item != me.timeElem) {
        var value = item.getSubmitValue();
        if (!hasValue && value) {
          hasValue = true;
        }
        args.push(value);
      }
    }, me);
    if (!hasValue) {
      return '';
    }
    var value = Ext.String.format.apply(me, args);

    // time value:
    if (me.timeFormat) {
      value = [value, me.timeElem.getSubmitValue()].join(' ');
    }
    return value;
  },

  /**
   * Sets value to the components.
   * @param value JIC data string
   */
  setValue: function (value) {
    var matches = value.match(gw.app.getJICInputPatternRegex());
    // Result array format: 0:full-value, 1:era, 2:year, 3:month: 4:day, 5:<ignore>, 6:(optional)time
    if (!matches) {
      // set time value to null if empty so it doesn't cause validation error for combobox
      this.setJICValue('', '', '', '', null);
    } else {
      this.setJICValue(matches[1], matches[2], matches[3], matches[4], matches[6]);
    }
  },

  /**
   * Sets JIC date value onto the elements
   * @param era '' or a valid era
   * @param yearInEra '' or a valid year in the given era
   * @param monthInYear '' or a valid month in year
   * @param dayInMonth '' or a valid day in year
   * @param time null or a valid time string
   */
  setJICValue: function (era, yearInEra, monthInYear, dayInMonth, time) {
    var me = this;
    var i = 0, args = arguments;
    Ext.Array.each(me.inputItems, function (item) {
      if (item == me.timeElem && !me.timeFormat) {
        return; // no time element
      }
      item.setValue(args[i]);
      if (item == me.eraElem) {
        // update year range in era:
        me.updateYearsInEra(); // refresh range of years
      }

      i++;
    }, me);
  },

  initComponent: function () {
    var me = this;

    //
    // Updates child item config before the children are instantiated:
    //
    if (me.timeFormat) {
      // override format before store is instantiated:
      me.items[7].format = me.timeFormat;
    }

    me.callParent(arguments);

    //
    // Updates instantiated child item instances:
    //
    // insert year symbol:
    me.items.get(2).autoEl.html = gw.app.getJICYearSymbol();
    // insert month symbol:
    me.items.get(4).autoEl.html = gw.app.getJICMonthSymbol();
    // insert day symbol:
    me.items.get(6).autoEl.html = gw.app.getJICDaySymbol();

    me.inputItems = [
      me.eraElem = me.items.get(0),
      me.yearElem = me.items.get(1),
      me.monthElem = me.items.get(3),
      me.dayElem = me.items.get(5),
      me.timeElem = me.items.get(7)
    ];

    me.timeElem.hidden = !me.timeFormat;  // show time element only when there's a time part
    me.timeElem.emptyText = me.emptyText;

    // set up range or eras:
    me.eraElem.store.loadData(gw.app.getJICEras().map(function (v) {
      var record = {};
      record[this.valueField] = v;
      return record;
    }, me.eraElem));

    // update initial value from the server without firing change event:
    me.setValue(me.value);

    Ext.Array.each(me.inputItems, function (item) {
      // set up change listener on visible chile elements, AFTER setting up initial values:
      item.on({
        blurchange: me.onChange,
        scope: me
      });

      item.invalidText = me.invalidText;
      item.tooltip = item.emptyText;

      // update "invalid" state from the server
      if (me.invalid) {
        item.markInvalid(item.invalidText);
      }
    }, me);

  }
});
