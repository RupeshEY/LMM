/**
 * A menu which contains a DataView and reloads DetailView store right before show.
 * It is currently only used in UnsavedWorkButton.
 */
Ext.define('gw.DataviewMenu', {
    extend: 'Ext.menu.Menu',
    alias: 'widget.dataviewmenu',

    showSeparator: false,
    plain: true,

    initComponent: function () {
        var me = this;

        me.border = false;
        me.addCls(Ext.baseCSSPrefix + 'dataviewmenu');
        me.callParent(arguments);
        me.add({
            xtype: 'component',
            itemId: 'loading-indicator',
            html: 'Loading...',
            cls: Ext.baseCSSPrefix + 'dataviewmenu-loading-indicator'
        });
    },

    getDataComponent: function () {
        return this.child('component[store]');
    },

    beforeShow: function () {
        var me = this,
            dataview = me.getDataComponent(),
            store = dataview.store;

        me.callParent(arguments);

        // clear store
        store.removeAll();

        // show loading indicator
        dataview.hide();
        me.child('#loading-indicator').show();

        // make sure the button id is used as store id
        if (!store.storeId) {
            store.setModelId(me.getBubbleTarget().el.id);
        }

        // load store
        store.load(function () {
            me.child('#loading-indicator').hide();
            dataview.show();

            // realign menu
            // the ajax response (processCommands) suspends layouts. We have to
            // wait until layout is ready to realign.
            me.on('afterlayout', me.realignMenu, me, {single: true});
        });
    },

    realignMenu: function () {
        var refOwner = this.getRefOwner();
        this.showBy(refOwner, refOwner.menuAlign || 'tr-br?');
    }
});