//@UpgradedSencha 5.1 EXTJS-16850
//Merged in to nightlies 26 feb. 2015 CAn be safely removed after upgrade to 5.1.1
//Ext.view.View can leave layouts suspending when destroying during a begin/endUpdate cycle
Ext.define('EXTJS-16850.view.AbstractView', {
    override: 'Ext.view.AbstractView',

    updateSuspendCounter: 0,

    onBeginUpdate: function() {
        ++this.updateSuspendCounter;
        Ext.suspendLayouts();
    },

    onEndUpdate: function() {
        var me = this;

        if (me.updateSuspendCounter) {
            --me.updateSuspendCounter;
        }

        Ext.resumeLayouts(true);
        if (me.refreshSizePending) {
            me.refreshSize(true);
            me.refreshSizePending = false;
        }
    },

    onDestroy: function() {
        var me = this,
            count = me.updateSuspendCounter;

        me.all.clear();
        me.emptyEl = null;
        me.callParent();
        me.bindStore(null);
        Ext.destroy(me.navigationModel, me.selectionModel);

        // We have been destroyed during a begin/end update, which means we're
        // suspending layouts, must forcibly do it here.
        while (count--) {
            Ext.resumeLayouts(true);
        }
    }
});