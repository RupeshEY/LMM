/**
 * A plugin to make the owning container to size to its content, and let only the outermost panel to scroll.
 * The owning container will have a single column layout, vertical flow, and child items stretched horizontally
 * to fill the width of the container.
 */
Ext.define('gw.plugin.ShrinkWrapLayout', {
    extend: 'Ext.AbstractPlugin',
    alias: 'plugin.glayout',

    /**
     * Overrides the owner container layout, before initComponent is invoked on the owning container.
     */
    constructor:function(config) {
        this.callParent(arguments);

        var container = config.cmp;
        Ext.apply(container, {
            layout:{
                columns:1,
                tableAttrs: {
                    style: {width:'100%'}
                },
                type:'table'
            }
        });

        if (!container.defaultType || container.defaultType == 'panel') {
            container.defaultType = 'gcontainer'; //recursion
        }
    }
});