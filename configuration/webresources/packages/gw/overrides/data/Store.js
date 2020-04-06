//@UpgradedSencha 5.1 This is override for grouping ticket EXTJS-16369 (Remote sorting ignored in grouped grid)
// Can be safely removed after ExtJS 5.1.1 or nightlies after jan 16. 2015

Ext.define('EXTJS-16369.data.Store', {
    override: 'Ext.data.Store',

    updateRemoteSort: function (remote) {
        var data = this.getData(),
            sorters = this.getSorters(); // ensure applySorters is called

        if (remote) {
            data.setSorters(null);
        } else {
            data.setSorters(sorters);
        }
        data.setAutoGroup(!remote);
        this.callParent(arguments);
    }
});