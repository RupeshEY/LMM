//@UpgradedSencha 5.1 EXTJS-15282 Center layout fails in some cases when shrink wrapping
//Merged in to nightlies 26 feb. 2015 Can be safely removed after upgrade to 5.1.1
Ext.define('EXTJS-15282.layout.container.Fit', {
    override: 'Ext.layout.container.Fit',
    calculate: function (ownerContext) {
        var me = this,
            childItems = ownerContext.childItems,
            length = childItems.length,
            containerSize = me.getContainerSize(ownerContext),
            info = {
                length: length,
                ownerContext: ownerContext,
                targetSize: containerSize
            },
            shrinkWrapWidth = ownerContext.widthModel.shrinkWrap,
            shrinkWrapHeight = ownerContext.heightModel.shrinkWrap,
            overflowX = ownerContext.overflowX,
            overflowY = ownerContext.overflowY,
            scrollbars, scrollbarSize, padding, i, contentWidth, contentHeight;

        ownerContext.state.info = info;
        if (overflowX || overflowY) {
            // If we have children that have minHeight/Width, we may be forced to overflow
            // and gain scrollbars. If so, we want to remove their space from the other
            // axis so that we fit things inside the scrollbars rather than under them.
            scrollbars = me.getScrollbarsNeeded(
                overflowX && containerSize.width, overflowY && containerSize.height,
                ownerContext.maxChildMinWidth, ownerContext.maxChildMinHeight);

            if (scrollbars) {
                scrollbarSize = Ext.getScrollbarSize();
                if (scrollbars & 1) { // jshint ignore:line
                    // if we need the hscrollbar, remove its height
                    containerSize.height -= scrollbarSize.height;
                }
                if (scrollbars & 2) { // jshint ignore:line
                    // if we need the vscrollbar, remove its width
                    containerSize.width -= scrollbarSize.width;
                }
            }
        }

        // If length === 0, it means we either have no child items, or the children are hidden
        if (length > 0) {
            // Size the child items to the container (if non-shrinkWrap):
            for (i = 0; i < length; ++i) {
                info.index = i;
                me.fitItem(childItems[i], info);
            }
        } else {
            info.contentWidth = info.contentHeight = 0;
        }

        if (shrinkWrapHeight || shrinkWrapWidth) {
            padding = ownerContext.targetContext.getPaddingInfo();

            if (shrinkWrapWidth) {
                if (overflowY && !containerSize.gotHeight) {
                    // if we might overflow vertically and don't have the container height,
                    // we don't know if we will need a vscrollbar or not, so we must wait
                    // for that height so that we can determine the contentWidth...
                    me.done = false;
                } else {
                    contentWidth = info.contentWidth + padding.width;
                    // the scrollbar flag (if set) will indicate that an overflow exists on
                    // the horz(1) or vert(2) axis... if not set, then there could never be
                    // an overflow...
                    if (scrollbars & 2) { // jshint ignore:line
                        // if we need the vscrollbar, add its width
                        contentWidth += scrollbarSize.width;
                    }
                    if (!ownerContext.setContentWidth(contentWidth)) {
                        me.done = false;
                    }
                }
            }

            if (shrinkWrapHeight) {
                if (overflowX && !containerSize.gotWidth) {
                    // if we might overflow horizontally and don't have the container width,
                    // we don't know if we will need a hscrollbar or not, so we must wait
                    // for that width so that we can determine the contentHeight...
                    me.done = false;
                } else {
                    contentHeight = info.contentHeight + padding.height;
                    // the scrollbar flag (if set) will indicate that an overflow exists on
                    // the horz(1) or vert(2) axis... if not set, then there could never be
                    // an overflow...
                    if (scrollbars & 1) { // jshint ignore:line
                        // if we need the hscrollbar, add its height
                        contentHeight += scrollbarSize.height;
                    }
                    if (!ownerContext.setContentHeight(contentHeight)) {
                        me.done = false;
                    }
                }
            }
        }
    }
});
