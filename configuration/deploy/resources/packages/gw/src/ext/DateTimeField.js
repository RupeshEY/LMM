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
 * Date time field
 *
 * The date time field shows a formatted date and time.
 */
Ext.define('gw.ext.DateTimeField', {
    extend: 'Ext.form.field.Date',
    alias: 'widget.datetimefield', // Referenced by server side
    requires: ['gw.ext.DateTimePicker'],
    uses: ['Ext.form.field.Date'],

    dateFormat: 'd-m-Y',  // default datetime format
    timeFormat: 'H:i',
    altTimeFormats: [
      ' hia',
      ' hiA'
    ],

    initComponent: function () {
      var self = this;
      this.format = this.dateFormat + ' ' + this.timeFormat;

      this.callParent();
      // Add dateFormat to the altFormats list to support entering a date without a time in the date/time field
      this.altFormats = this.dateFormat + '|' + this.altFormats;

      var dateAltFormats = this.altFormats.split('|');
      var computedAltFormats = [];
      var timeAltFormats = self.altTimeFormats;
      timeAltFormats.push(' ' + self.timeFormat);
      Ext.each(dateAltFormats, function(altFormat) {
        computedAltFormats.push(altFormat);
        Ext.each(timeAltFormats, function(timeFormat) {
          computedAltFormats.push(altFormat + timeFormat);
        });
      });
      this.altFormats = computedAltFormats.join('|');
    },

    getValue: function () {
        return this.parseDate(Ext.form.field.Date.superclass.getValue.call(this)) || '';
    },

    onSelectTime: function(m, d) {
      var me = this;

      me.setValue(d);
    },

    //@SenchaUpgrade: Check if event originated in the AM/PM combo box, Picker.js is listening
    //for mousedown events on Ext.dom() and the standard origin check fails since the picker dom
    //is technically not a child of combo box element
    collapseIf: function(e) {
      var me = this;

      if (!me.isDestroyed
        && !e.within(me.bodyEl, false, true)
        && !e.within(me.picker.el, false, true)
        && !e.within(me.picker.timefield.amPmCombo.getPicker().el, false, true)) {
        me.collapse();
      }

    },

    // overwrite
    createPicker: function () {
        var me = this,
            format = Ext.String.format;

        return Ext.create('gw.ext.DateTimePicker', {
            ownerCt: me.ownerCt,
            renderTo: document.body,
            floating: true,
            hidden: true,
            focusOnShow: true,
            minDate: me.minValue,
            maxDate: me.maxValue,
            disabledDatesRE: me.disabledDatesRE,
            disabledDatesText: me.disabledDatesText,
            disabledDays: me.disabledDays,
            disabledDaysText: me.disabledDaysText,
            format: me.format,
            timeFormat: this.timeFormat,
            dateFormat: this.dateFormat,
            showToday: me.showToday,
            startDay: me.startDay,
            hideOnClick: false,
            minText: format(me.minText, me.formatDate(me.minValue)),
            maxText: format(me.maxText, me.formatDate(me.maxValue)),
            listeners: {
                scope: me,
                select: me.onSelect,
                select_time: me.onSelectTime,
                beforehide: me.onBeforeHide
            }
          }
        );
    },

    /**
     * Prevent the onFocusLeave from collapsing the DateTimePicker when transitioning
     * from the date portion of the widget to the time portion.
     */
    onFocusLeave: function(e) {
      var me = this;
      if (e.fromComponent && e.toComponent &&
          e.fromComponent.timefield &&
          e.fromComponent.timefield.container.contains(e.toComponent.id)) {
        return;
      }
      me.callParent(arguments);
    },

  /**
   * Time value is set to the input upon datetime picker being dismissed
   * Not doing so will send multiple server calls if the field is configured as POC
   */
    onBeforeHide: function(m) {
        this.setValue(m.fillDateTime(new Date(m.value))); // overwrite: fill time before setValue
    }

});

