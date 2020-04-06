// @UpgradedSencha 5.1
// Correctly implement veto for checkbox row selection on the tree node
// ExtJS ticket issued: EXTJS-16378
Ext.define('gw.override.selection.TreeModel', {
    override: 'Ext.selection.TreeModel',

    vetoSelection: function(e) {
        var view = this.view,
            select = this.selectOnExpanderClick,
            expanderClicked = e.getTarget(view.expanderSelector || (view.lockingPartner && view.lockingPartner.expanderSelector)),
            checkboxClicked = e.getTarget(view.checkboxSelector || (view.lockingPartner && view.lockingPartner.checkboxSelector)),

            veto = !select && e.type === 'click' && (expanderClicked || checkboxClicked);

        return veto || this.callParent([e]);
    }
});