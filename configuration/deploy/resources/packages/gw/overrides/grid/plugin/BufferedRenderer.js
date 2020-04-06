//@UpgradedSencha 5.1
//EXTJS-16666 Scroll area does not resize when grid dimensions are changed on mobile only
// Can be removed in 5.1.1 Nightlies. Merged 20 feb 2015
Ext.define('EXTJS-16666.grid.plugin.BufferedRenderer', {
    override: 'Ext.grid.plugin.BufferedRenderer',
    refreshSize: function () {
        var me = this,
            view = me.view,
            nodeCache = view.all,
        // Calculates scroll range.
        // Also calculates rowHeight if we do not have an own rowHeight property.
            newScrollHeight = me.getScrollHeight();

        // We are displaying the last row, ensure the scroll range finishes exactly at the bottom of the view body.
        if (nodeCache.count && nodeCache.endIndex === (me.store.getCount()) - 1) {
            newScrollHeight = me.scrollHeight = me.bodyTop + view.body.dom.offsetHeight;
        }
        // Stretch the scroll range according to calculated data height.
        else if (newScrollHeight !== me.scrollHeight) {
            me.scrollHeight = newScrollHeight;
        }

        me.stretchView(view, newScrollHeight);
    },

    onViewResize: function (view, width, height, oldWidth, oldHeight) {
        var me = this,
            newViewSize;

        // Only process first layout (the boxready event) or height resizes.
        if (!oldHeight || height !== oldHeight) {

            // Recalculate the view size in rows now that the grid view has changed height
            newViewSize = Math.ceil(height / me.rowHeight) + me.trailingBufferZone + me.leadingBufferZone;
            me.viewSize = me.setViewSize(newViewSize);
            me.viewClientHeight = view.el.dom.clientHeight;
        }

        // TouchScroller needs to know about its viewport size.
        if (view.touchScroll) {
            view.getScrollable().setElementSize(null);
        }
    }
});