//@UpgradedSencha 5.1 This is override for grouping ticket EXTJS-16369 (Remote sorting ignored in grouped grid)
// Can be safely removed after ExtJS 5.1.1 or nightlies after jan 16. 2015

Ext.define('EXTJS-16369.util.GroupCollection', {
    override: 'Ext.util.GroupCollection',

    updateGrouper: function(grouper) {
        var me = this;
        me.grouped = !!(grouper && me.$groupable.getAutoGroup());
        me.onSorterChange();
        me.onEndUpdateSorters(me.getSorters());
    },

    destroy: function() {
        this.$groupable = null;
        this.callParent();
    }
});