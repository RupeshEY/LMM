//@UpgradedSencha 5.1 Multisort from UI support
// Added Feature request EXTJS-16870 Column UI should support multi sorting
Ext.define('gw.grid.header.Container', {
    override: 'Ext.grid.header.Container',

    onSortAscClick: function(menuItem, e) {
        var menu = this.getMenu(),
            activeHeader = menu.activeHeader;

        activeHeader.sort('ASC', e);
    },

    // sort desc when clicking on item in menu
    onSortDescClick: function(menuItem,  e) {
        var menu = this.getMenu(),
            activeHeader = menu.activeHeader;

        activeHeader.sort('DESC', e);
    },

    onClearSortClick: function(menuItem,  e){
        var menu = this.getMenu(),
            activeHeader = menu.activeHeader;

        activeHeader.sort(null, null, true);
    },

    /**
     * Returns an array of menu CheckItems corresponding to all immediate children
     * of the passed Container which have been configured as hideable.
     *
     * @UpgradedSencha 5.1 - fixed the column menu to disable any columns that are required
     */
    getColumnMenu: function(headerContainer) {
        var menu = this.callParent(arguments),
            newMenu = [];
        if (menu && menu.length) {
            Ext.Array.each(menu, function(menuitem) {
                var item = headerContainer.getComponent(menuitem.headerId);
                if (item && item.required) {
                    menuitem.disableCheckChange();
                }
            });
        }
        return menu;
    },

    getMenuItems: function() {
        var me = this,
            menuItems = [],
            hideableColumns = me.enableColumnHide ? me.getColumnMenu(me) : null;

        if (me.sortable) {
            menuItems = [{
                itemId: 'ascItem',
                text: me.sortAscText,
                iconCls: me.menuSortAscCls,
                handler: me.onSortAscClick,
                scope: me
            },{
                itemId: 'descItem',
                text: me.sortDescText,
                iconCls: me.menuSortDescCls,
                handler: me.onSortDescClick,
                scope: me
            }];
            if (me.grid && me.grid.multiColumnSort) {
                // Only add the unsort choice if we have multi column sort support
                menuItems.push({
                    itemId: 'clearSort',
                    disabled: true,
                    text: gw.app.localize('ExtJS.Grid.Header.Container.UnsortText'),
                    handler: me.onClearSortClick,
                    scope: me
                })
            }
        }

        if (hideableColumns && hideableColumns.length) {
            if (me.sortable) {
                menuItems.push({
                    itemId: 'columnItemSeparator',
                    xtype: 'menuseparator'
                });
            }
            menuItems.push({
                itemId: 'columnItem',
                text: me.columnsText,
                iconCls: me.menuColsIcon,
                menu: hideableColumns,
                hideOnClick: false
            });
        }
        return menuItems;
    },

    beforeMenuShow: function(menu) {
        var me = this,
            columnItem = menu.child('#columnItem'),
            hideableColumns,
            insertPoint,
            disableNoSort;

        // If a change of column structure caused destruction of the column menu item
        // or the main menu was created without the column menu item because it began with no hideable headers
        // Then create it and its menu now.
        if (!columnItem) {
            hideableColumns = me.enableColumnHide ? me.getColumnMenu(me) : null;

            // Insert after the "Sort Ascending", "Sort Descending" menu items if they are present.
            insertPoint = me.sortable ? 2 : 0;

            if (hideableColumns && hideableColumns.length) {
                menu.insert(insertPoint, [{
                    itemId: 'columnItemSeparator',
                    xtype: 'menuseparator'
                }, {
                    itemId: 'columnItem',
                    text: me.columnsText,
                    iconCls: me.menuColsIcon,
                    menu: {
                        items: hideableColumns
                    },
                    hideOnClick: false
                }]);
            }
        }
        if (me.grid && me.grid.multiColumnSort) {
            // We only need to consider disabling the nosort column when we have multi column sort support
            disableNoSort = !menu.activeHeader.sortState;
            if (!disableNoSort && me.grid.store && me.grid.store.sorters) {
                // If this column is an active sort column and there is only one sorter, then disable it too.
                disableNoSort = me.grid.store.sorters.length <= 1;
            }

            //Ensure we disable Unsort menuItem
            menu.down('#clearSort').setDisabled(disableNoSort);
            me.updateMenuDisabledState(me.menu);
        }
    },

    privates: {
        onHeaderActivate: function (e) {
            var column = this.getFocusableFromEvent(e);

            if (column) {
                // Sort the column is configured that way.
                // sortOnClick may be set to false by SpreadsheelSelectionModel to allow click to select a column.
                if (column.sortable && this.sortOnClick) {
                    column.toggleSortState(e); // changed to pass over the event
                }
                // onHeaderClick is a necessary part of accessibility processing, sortable or not.
                this.onHeaderClick(column, e, column.el);
            }
        }
    }
});