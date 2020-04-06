/*
    PLWEB-5666: We need to manually destroy the time field store to prevent a memory leak.
    This is similar to the metachange listener leak, but there's one more leak involved.
 */
Ext.define('gw.override.form.field.Time', {
    override: 'Ext.form.field.Time',

    destroy: function() {
        var me = this;
        if(me.store) {
            me.store.destroy();
        }
        me.callParent(arguments);
    }
});