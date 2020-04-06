/**
 * An Ext container sizes to its content, and let only the outermost panel to scroll.
 * This container has a single column, vertical flow, and child items stretched horizontally to fill the width container.
 */
Ext.define('gw.container.StretchContainer', {
    extend:'Ext.container.Container',
    requires:'Ext.tab.Panel',
    alias:'widget.gcontainer',

    /**
     * Registers the plugin which handles sizing and layout
     */
    constructor: function() {
        var me = this;
        me.plugins = me.plugins || [];
        me.plugins.push({ptype:'glayout'});
        return me.callParent(arguments);
    },

    initComponent: function() {
        var me = this;

        // mimic the panel logic, where the header is hidden if
        // the panel is one of the tab in a tab panel
        me.on({
            added: function(comp, container) {
                if (container instanceof Ext.tab.Panel && container.removePanelHeader) {
                    if (me.items && me.items.length > 0 && me.items.get(0).xtype == 'header') {
                        var header = me.items.removeAt(0);
                        header.ownerCt = null; // prevents remove() call on owner by Ext.destroy()
                        Ext.destroy(header);
                    }
                }
            }
        });

        me.callParent(arguments);

        // include the toolbar, and disable toolbar overflow:
        if (me.tbar) {
            me.shrinkWrapDock = true;
            me.shrinkWrap = true;
            me.insert(0, Ext.apply(me.tbar, {xtype:'toolbar', layout:'hbox'}))
        }
        // include the header as the very first child:
        if (me.title || me.tools) {
            me.insert(0, {
                xtype: 'header',
                cls: me.ui == 'page' ? 'g-page-header' : 'g-panel-header',
                title: me.title,
                tools: me.tools
            });
        }
    }
});