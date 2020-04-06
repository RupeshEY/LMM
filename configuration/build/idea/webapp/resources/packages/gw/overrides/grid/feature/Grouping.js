Ext.define('gw.override.grid.feature.Grouping', {
    override: 'Ext.grid.feature.Grouping',
    uses: ['gw.SimpleGrid'],

    //@UpgradedSencha 5.1 Turn off summary row during expand/collapse
    doCollapseExpand: function (collapsed, groupName, focus) {
        var me = this,
            lockingPartner = me.lockingPartner,
            group = me.groupCache[groupName],
            grid = me.grid, //added
            summaryFeature = grid.view.getFeature(gw.SimpleGrid.SUMMARY_FEATURE_ID), //added
            origShowSummaryRow = false; //added

        //begin -- override
        if (summaryFeature) {
            origShowSummaryRow = summaryFeature.showSummaryRow;
            summaryFeature.showSummaryRow = false;
        }
        //end -- override

        // groupCache is shared between two lockingPartners
        if (group.isCollapsed !== collapsed) {

            // The GroupStore is shared by partnered Grouping features, so this will refresh both sides.
            // We only want one layout as a result though, so suspend layouts while refreshing.
            Ext.suspendLayouts();
            if (collapsed) {
                me.dataSource.collapseGroup(group);
            } else {
                me.dataSource.expandGroup(group);
            }
            Ext.resumeLayouts(true);

            // Sync the group state and focus the row if requested.
            me.afterCollapseExpand(collapsed, groupName, focus);

            // Sync the lockingPartner's group state.
            // Do not pass on focus flag. If we were told to focus, we must focus, not the other side.
            if (lockingPartner) {
                lockingPartner.afterCollapseExpand(collapsed, groupName, false);
            }
        }

        //begin -- override
        if (summaryFeature) {
            summaryFeature.showSummaryRow = origShowSummaryRow;
        }
        //end -- override
    }
});
