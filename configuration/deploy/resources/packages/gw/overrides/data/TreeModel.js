// @UpgradedSencha 5.1 - Override the tree model to implement the isSelected and hasDisabledSelection
// to work in conjuction with the NodeInterface.js override changes
Ext.define('gw.override.data.TreeModel', {
    override: 'Ext.data.TreeModel',

    isSelected: function() {
        return this.get('selected') === true;
    },

    hasDisabledSelection: function() {
        return this.get('disableSelection') === true;
    }
});