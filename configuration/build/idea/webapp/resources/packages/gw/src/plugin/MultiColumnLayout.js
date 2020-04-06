/**
 * A plugin similar to the gw.plugin.ShrinkWrapLayout, but renders each child item in a separate table column.
 */
Ext.define('gw.plugin.MultiColumnLayout', {
    extend: 'gw.plugin.ShrinkWrapLayout',
    alias: 'plugin.multicolumnlayout',

    constructor:function(config) {
        this.callParent(arguments);
        var container = config.cmp;

        Ext.apply(container.layout, {
                tdAttrs: {
                    style : {"vertical-align" : "top"}
                }
            }
        );
        delete container.layout.columns; // allow multiple columns
    }
});