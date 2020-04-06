Ext.define('gw.override.form.field.Date', {
    override: 'Ext.form.field.Date',
    cls: 'g-date-picker',

    initComponent: function () {
        var me = this;
        me.altFormats = calculateAltFormats(me.format);

      function calculateAltFormats(format){

        var YEAR_MARKER = 'A';
        var MONTH_MARKER = 'B';
        var DAY_MARKER = 'C';

        function constructAltFormatWithSpec(dateComponents, separator, yearPattern, monthPattern, dayPattern){
          var componentArray = [];
          Ext.Array.forEach(dateComponents, function(dateComponent){
            var component = dateComponent.replace(YEAR_MARKER, yearPattern);
            component = component.replace(MONTH_MARKER, monthPattern);
            component = component.replace(DAY_MARKER, dayPattern);
            componentArray.push(component);
          });

          return componentArray.join(separator);
        }

        //pick apart month, day, year ordering in the format
        var dateComponents = format.match(/([YyMmndj])/g);

        //if regex fails, disable altFormats
        if (dateComponents === null){
          return format;
        }

        //normalize date components to their respective markers
        Ext.Array.forEach(dateComponents, function(component, index, componentArray){
          component = component.replace(/[Yy]/, YEAR_MARKER);
          component = component.replace(/[Mmn]/, MONTH_MARKER);
          component = component.replace(/[dj]/, DAY_MARKER);
          componentArray[index] = component;
        });

        return [
          constructAltFormatWithSpec(dateComponents, "/", 'Y', 'n', 'j'),
          constructAltFormatWithSpec(dateComponents, ".", 'Y', 'n', 'j'),
          constructAltFormatWithSpec(dateComponents, "-", 'Y', 'n', 'j'),
          constructAltFormatWithSpec(dateComponents, " ", 'Y', 'n', 'j'),
          constructAltFormatWithSpec(dateComponents, "/", 'Y', 'm', 'j'),
          constructAltFormatWithSpec(dateComponents, ".", 'Y', 'm', 'j'),
          constructAltFormatWithSpec(dateComponents, "-", 'Y', 'm', 'j'),
          constructAltFormatWithSpec(dateComponents, " ", 'Y', 'm', 'j'),
          constructAltFormatWithSpec(dateComponents, "/", 'Y', 'n', 'd'),
          constructAltFormatWithSpec(dateComponents, ".", 'Y', 'n', 'd'),
          constructAltFormatWithSpec(dateComponents, "-", 'Y', 'n', 'd'),
          constructAltFormatWithSpec(dateComponents, " ", 'Y', 'n', 'd'),
          constructAltFormatWithSpec(dateComponents, "", 'Y', 'm', 'd'),
          constructAltFormatWithSpec(dateComponents, "/", 'Y', 'm', 'd'),
          constructAltFormatWithSpec(dateComponents, ".", 'Y', 'm', 'd'),
          constructAltFormatWithSpec(dateComponents, "-", 'Y', 'm', 'd'),
          constructAltFormatWithSpec(dateComponents, " ", 'Y', 'm', 'd')
        ].join("|");

      }

      me.on({
          select: function (comp) {
              // force change handler on select the date from date picker
              comp.flushChange();
          }
      });
      me.callParent(arguments);
    },
    // check the submit value first to prevent formatting javascript error. If it's not valid, still
    // send back the value to let server side handle the validation.
    // @SenchaUpgrade override private method
    getSubmitValue: function () {
        var me = this;
        if (!me.isValid()) {
            return me.getValue() || me.getRawValue();
        }
        return me.callParent(arguments);
    }
});

