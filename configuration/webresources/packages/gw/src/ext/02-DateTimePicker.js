/**
 * Created by hchiavettone on 12/4/14.
 *//*
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
 * Date time picker.
 *
 * Extends the date picker to add a time picker to the date picker.
 */
Ext.define('gw.ext.DateTimePicker', {
  extend: 'Ext.picker.Date',
  alias: 'widget.udatetimepicker',  // prefix ux class with "u" to avoid conflict with base ExtJs class
  requires: ['gw.ext.TimePickerField', 'Ext.util.KeyNav', 'Ext.ClassManager', 'gw.app'],
  uses: ['Ext.Date', 'Ext.DomQuery', 'Ext.core.DomHelper'],

  twelveHourMode: true,

  amSymbol : 'AM',
  pmSymbol : 'PM',

  hideOnClick : false,

  initComponent: function () {
    var me = this;
    me.todayText = gw.app.localize("Button.Now");
    me.timeLabel = gw.app.localize("ExtJS.Picker.Date.TimeLabel");
    // keep time part for value
    var value = me.value || new Date();
    me.callParent();
    me.value = value;
  },

  initEvents: function() {
    var me = this;
    me.callParent();

    // Add enter and escape handlers to the datetime picker
    me.keyNavContainer = new Ext.util.KeyNav(me.getEl(), {
      enter: {
        handler: function(e){
          var me2 = this;
          // If we're in the hours spinner, the minutes spinner, or the AM/PM combo box,
          // simulate date click on enter with selected date cell
          if (e.within(me2.timefield.hoursSpinner.el, false, true) ||
              e.within(me2.timefield.minutesSpinner.el, false, true) ||
              (me2.timefield.amPmCombo && e.within(me2.timefield.amPmCombo.el, false, true))) {
            me2.handleDateClick(e, me2.getSelectedDate(me2.getValue()));
          }
        }
      },
      esc: {
        handler: function(e){
          // Esc should not commit the time value
          me.suspendEvent('beforehide');
          me.hide();
          me.resumeEvent('beforehide');
        }
      },
      scope: me
    });

    //attach key listener for spacebar to main element
    if (me.showToday) {
      if (me.todayKeyListener){
        Ext.destroy(me.todayKeyListener);
      }
      me.todayKeyListener = me.el.addKeyListener(Ext.event.Event.SPACE, me.selectToday,  me);
    }

  },

  beforeDestroy : function(){
    var me = this;

    if (me.rendered) {
      Ext.destroy(me.keyNavContainer);
      Ext.destroy(me.todayKeyListener);
    }

    me.callParent();
  },

  //@SenchaUpgrade: need to clear the time component to match the correct date cell
    selectedUpdate: function(date){
      var me        = this,
        t         = Ext.Date.clearTime(date, true).getTime(),
        cells     = me.cells,
        cls       = me.selectedCls,
        cellItems = cells.elements,
        c,
        cLen      = cellItems.length,
        cell;

      cell = me.activeCell;
      if (cell) {
        Ext.fly(cell).removeCls(cls);
        cell.setAttribute('aria-selected', false);
      }

      for (c = 0; c < cLen; c++) {
        cell = cells.item(c);

        if (me.textNodes[c].dateValue == t) {
          me.activeCell = cell.dom;
          me.eventEl.dom.setAttribute('aria-activedescendant', cell.dom.id);
          cell.dom.setAttribute('aria-selected', true);
          cell.addCls(cls);
          me.fireEvent('highlightitem', me, cell);
          break;
        }
      }
    },

  //@SenchaUpgrade: Override the default tab click to stop the event and transfer the time component
  //from the current modelValue to a new date object. Also, should set focus to the hour spinner
  handleTabClick:function (e) {
    var me = this,
        t = me.getSelectedDate(me.activeDate),
        handler = me.handler;

    e.stopEvent();

    if (t &&!me.disabled && t.dateValue && !Ext.fly(t.parentNode).hasCls(me.disabledCellCls)) {
      me.doCancelFocus  = true;

      me.suspendEvents(false);
      me.setValue(me.fillDateTime(new Date(t.dateValue)));
      me.resumeEvents();

      delete me.doCancelFocus;
      if (handler) {
        handler.call(me.scope || me, me, me.value);
      }
    }
    //focus on the hoursSpinner, when tabbing out from the date picker cells
    if (me.timefield.hoursSpinner) {
      me.timefield.hoursSpinner.inputEl.focus();
    }

  },

  //@SenchaUpgrade: Need to clear time component to match correct date cell
  getSelectedDate:function (date) {
    var me = this,
        t = Ext.Date.clearTime(date, true).getTime(),
        cells = me.cells,
        cls = me.selectedCls,
        cellItems = cells.elements,
        c,
        cLen = cellItems.length,
        cell;

    cells.removeCls(cls);

    for (c = 0; c < cLen; c++) {
      cell = Ext.fly(cellItems[c]);

      if (cell.dom.firstChild.dateValue == t) {
        return cell.dom.firstChild;
      }
    }
    return null;
  },

  onRender: function (container, position) {
    var me = this;
    if (!me.timefield) {
      me.timefield = Ext.create('gw.ext.TimePickerField', {
        fieldLabel: me.timeLabel,
        labelWidth: 50,
        value: Ext.Date.format(me.value, 'H:i')  // 'H:i' is the format used by time picker for split
      });
    }
    me.timefield.ownerCt = me;

    me.callParent(arguments);

    var table = Ext.get(Ext.DomQuery.selectNode('table', me.el.dom));
    Ext.core.DomHelper.insertAfter(table, {
      tag: 'div',
      style: 'border:0px;',
      children: [
        {
          tag: 'div',
          cls: Ext.baseCSSPrefix + 'datepicker-footer ux-timefield'
        }
      ]
    }, true);
    me.timefield.render(me.el.child('div div.ux-timefield'));

    var p = me.getEl().parent('div.' + Ext.baseCSSPrefix + 'layer');
    if (p) {
      p.setStyle("height", p.getHeight() + 31);
    }
    me.timefield.on('change', me.timeChange, me);

  },
  // listener , timefield change
  timeChange: function (tf, time, rawtime) {
    var me = this;
    me.value = me.fillDateTime(me.value);
    me.fireEvent('select_time', me, me.value);
  },

  // @private
  fillDateTime: function (value) {
    if (this.timefield) {
      var rawtime = this.timefield.getRawValue();
      value.setHours(rawtime.h);
      value.setMinutes(rawtime.m);
    }
    return value;
  },

  // @private
  changeTimeFiledValue: function (value) {
    var me = this;
    me.timefield.un('change', me.timeChange, me);
    me.timefield.setValue(me.value);
    me.timefield.on('change', me.timeChange, me);
  },

  // override  -- note this is modified and is different from ux 4.1.1 version
  getValue: function () {
    var me = this,
        value = me.callParent();

    // value should have the time field set. Setting it in case the super class might have cleared it out
    // me is only set if the caller is not the super class date picker.
    if (me.timefield && !me.isDatePickerCalling(me.getValue)) {
      var rawValue = me.timefield.getRawValue();

      value.setHours(rawValue.h);
      value.setMinutes(rawValue.m);
    }

    return value;
  },

  // override  -- note this is modified and is different from ux 4.1.1 version
  setValue: function (value) {
    var me = this;
    me.callParent(arguments);

    if (me.timefield) {
      // If the caller is not the super class date picker, save the time value from the passed in value.
      if (!me.isDatePickerCalling(me.setValue)) {
        // suspend the event so onChange will not be trigger by setValue to the spinner
        me.suspendEvents(false);
        if (me.twelveHourMode) {
          var hours = value.getHours();
          if (value.getHours() >= 12) {
            me.timefield.amPmCombo.setValue('pm');
            hours = hours === 12 ? 12 : hours - 12;
          } else {
            me.timefield.amPmCombo.setValue('am');
            hours = hours === 0 ? 12 : hours;
          }
          me.timefield.hoursSpinner.setValue(hours);
          me.timefield.minutesSpinner.setValue(value.getMinutes());

        } else {
          me.timefield.hoursSpinner.setValue(value.getHours());
          me.timefield.minutesSpinner.setValue(value.getMinutes());
        }
        me.resumeEvents();
        //me.timefield.setRawValue({h: value.getHours(), m: value.getMinutes()});
      }
      // In any case, set the current time from the time picker field for value.
      var rawValue = me.timefield.getRawValue();
      me.value.setHours(rawValue.h);
      me.value.setMinutes(rawValue.m);
    }
  },

  isDatePickerCalling: function (boundFunction) {
    // TODO Hack: getValue / setValue callers can either be the date picker, where the time field is erased.
    // Other callers are date time picker callers where the time field is expected.
    // Internally, the value stores the date and the time. The super class date picker expects the value
    // field to have the time cleared.
    var callingClassName = Ext.ClassManager.getName(boundFunction.caller.$owner);
    return (callingClassName == "Ext.picker.Date");
  },

  // overwrite : fill time before setValue
  handleDateClick: function (e, t) {
    var me = this,
        handler = me.handler;

    e.stopEvent();
    if (t && !me.disabled && t.dateValue && !Ext.fly(t.parentNode).hasCls(me.disabledCellCls)) {
      me.doCancelFocus = me.focusOnSelect === false;
      me.setValue(this.fillDateTime(new Date(t.dateValue))); // overwrite: fill time before setValue
      delete me.doCancelFocus;
      me.fireEvent('select', me, me.value);
      if (handler) {
        handler.call(me.scope || me, me, me.value);
      }
      me.onSelect();
    }
  },

  // overwrite : fill time before setValue
  selectToday: function () {
    var me = this,
        btn = me.todayBtn,
        handler = me.handler;

    if (btn && !btn.disabled) {
      // me.setValue(Ext.Date.clearTime(new Date())); //src
      me.setValue(new Date());// overwrite: fill time before setValue
      me.fireEvent('select', me, me.value);
      if (handler) {
        handler.call(me.scope || me, me, me.value);
      }
      me.onSelect();
    }
    return me;
  },

  // PLWEB-4936 Date picker is dismissed when timefield controls are clicked
  // When any time field controls are clicked, need to forward event
  // Otherwise, call parent to ignore the click and hence dismiss datetimepicker
  onMouseDown: function(e) {
    if (e.within(this.timefield.getEl()) && e.getTarget().type === 'text') {
      e.target.click();
    } else {
      this.callParent(arguments);
    }
  }
});

