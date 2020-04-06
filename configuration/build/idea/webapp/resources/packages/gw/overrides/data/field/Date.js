// @UpgradedSencha 5.1 This is a workaround for the bug PLWEB-6121.
// We have a variable Ext.Date.useStrict set to true globally. Here, we provide possibility to override the value
// of this variable for chart fields.
Ext.define('gw.override.data.field.Date',{
    override: 'Ext.data.field.Date',
    useStrict:undefined,
    convert: function(v) {
        if (!v) {
            return null;
        }

        // instanceof check ~10 times faster than Ext.isDate. Values here will not be
        // cross-document objects
        if (v instanceof Date) {
            return v;
        }

        var dateFormat = this.dateReadFormat || this.dateFormat,
            useStrict = Ext.isDefined(this.useStrict) ? this.useStrict : Ext.Date.useStrict,
            parsed;

        if (dateFormat) {
            return Ext.Date.parse(v, dateFormat, useStrict);
        }

        parsed = Date.parse(v);
        return parsed ? new Date(parsed) : null;
    }
});