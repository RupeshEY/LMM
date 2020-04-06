Ext.define('gw.overrides.grid.filters.Filters', {
    override: 'Ext.grid.filters.Filters',

    createMenuItem: function(menu, ownerGridId) {
        var menu = this.callParent(arguments);
        menu.on({
            beforecheckchange: function(me, checked) {
                var anyChecked = !checked;
                // For the filter, we only allow checking or unchecking if any of the filter's
                // menu items are actually checked.  If there are no items, the default return value is
                // the NOT of the checked value being passed in.
                if (me.menu && me.menu.items && me.menu.items.items) {
                    anyChecked = Ext.Array.some(me.menu.items.items, function(item) {
                        return item.checked;
                    });
                }
                return anyChecked;
            },
            checkchange: function(me, checked) {
                if (!checked && me.menu && me.menu.items && me.menu.items.items) {
                    // If we are unchecking the filter, then we are going to explicitly uncheck any checked
                    // menu items in the filter's menu
                    Ext.Array.each(me.menu.items.items, function(item) {
                        if (item.checked) {
                            item.setChecked(false);
                        }
                    });
                }
            }
        });
        return menu;
    },

    initColumns: function () {
        var grid = this.grid,
            store = grid.getStore(),
            columns = grid.columnManager.getColumns(),
            len = columns.length,
            i, column,
            filter, filterCollection;

        // We start with filters defined on any columns.
        for (i = 0; i < len; i++) {
            column = columns[i];
            filter = column.filter;

            if (filter && !filter.isGridFilter) {
                if (!filterCollection) {
                    filterCollection = store.getFilters();
                    if(!store.remoteFilter){
                        filterCollection.beginUpdate();
                    }
                }

                // Related to JIRA PLWEB-5068: JS error while trying to add a row in a filtered ListView
                // When a filter is associated with a column, any time the LV is replaced the subsequent
                // recreation of the LV re-initializes all the filters.  Any POST (e.g. clicking the ADD, EDIT, or CANCEL)
                // will cause this re-initialization causing a second POST to the server with the current DATA in the LV.
                // If the ADD is clicked, this will include the contents of a newly created row.  If that LV includes
                // required fields, the row is submitted to the server, the server runs validation and ends up
                // returning a validation error.
                //
                // Prevent this update by setting suppressNextFilter to true only during the time the column filter is
                // being created.  This will ensure changed and refresh events aren't sent (see AbstractStore.js: onFilterEndUpdate)
                //
                // NOTE: suppressNextFilter blocks certain events from being triggered.  It does not mean the filter will
                // not be evaluated.

                // If suppressNextFilter is not defined or set to false, set it to true and then back.
                if (!store.suppressNextFilter) {
                    store.suppressNextFilter = true;
                    this.createColumnFilter(column);
                    store.suppressNextFilter = false;
                } else {
                    // It happens to already be true so just leave it be and assume whoever set it is responsible for
                    // resetting it.
                    this.createColumnFilter(column);
                }
            }
        }

        if (filterCollection && !store.remoteFilter) {
            filterCollection.endUpdate();
        }
    }
});
