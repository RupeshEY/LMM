Ext.define('gw.doc.readOnlyFile', {
    requires: ['gw.app'],
    extend: 'Ext.form.field.Display',
    alias: 'widget.gfileReadOnly',

    listeners: {
        afterrender: function( cmp ) {
            var el = cmp.getEl();
            el.on( {
                click: {
                    fn: function(evt) { gw.app.handleCompAction(cmp, evt, el) },
                    stopEvent: true
                }
            });
        }
    }
});