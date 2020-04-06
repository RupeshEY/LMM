Ext.define('gw.override.window.Window', {
    override: 'Ext.window.Window',

    afterHide: function() {
        this.callOverridden(arguments);

        // Try to restore grid position after window is closed/hidden
        var oldNav = gw.app._gridNavigation;

        //do we have this grid in view?
        if(oldNav && oldNav.gridId){
            var grid = Ext.getCmp(oldNav.gridId);

            //Yes, let's restore position
            if(grid){
                //are we in the actionable mode?
                var navModel = grid.getNavigationModel();
                if(navModel.actionMode){
                    navModel.focusChild(0, true);
                }else{
                    gw.GridUtil.restoreLastFocusedCell(grid, oldNav);
                }
            }
        }
    }
});