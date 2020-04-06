/**
 * An Ext container that renders each child in a separate table column.
 */
Ext.define('gw.container.Columns', {
    extend: 'Ext.container.Container',
    alias: 'widget.gcolumns',
    border: false,

    constructor: function() {
        var me = this;
        me.plugins = me.plugins || [];
        me.plugins.push({ptype:'multicolumnlayout'});
        return me.callParent(arguments);
    },
    initComponent: function() {
        var me = this;
        if (me.divider) {
            me.cls = [me.cls || '', 'g-divider'].join(' ')
        }
        me.callParent(arguments);
    }
});