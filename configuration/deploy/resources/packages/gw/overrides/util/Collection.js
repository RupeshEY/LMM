//@UpgradedSencha 5.1 This is override for grouping ticket EXTJS-16369 (Remote sorting ignored in grouped grid)
// Can be safely removed after ExtJS 5.1.1 or nightlies after jan 16. 2015
Ext.define('EXTJS-16369.util.Collection', {
    override: 'Ext.util.Collection',

    config: {
        autoFilter: true,

        autoSort: true,

        //Added
        /**
         * @cfg {Boolean} autoGroup `true` to sort by the grouper
         * @private
         */
        autoGroup: true,

        decoder: null,

        extraKeys: null,

        filters: null,

        grouper: null,

        groups: null,

        rootProperty: null,

        sorters: null,

        multiSortLimit: 3,

        defaultSortDirection: 'ASC',

        source: null
    },

    updateGrouper: function (grouper) {
        var me = this,
            groups = me.getGroups(),
            sorters = me.getSorters(),
            populate;

        me.onSorterChange();
        me.grouped = !!grouper;

        if (grouper) {
            if (!groups) {
                groups = new Ext.util.GroupCollection({
                    itemRoot: me.getRootProperty()
                });
                groups.$groupable = me;
                me.addObserver(groups);
                me.setGroups(groups);
            }
            groups.setGrouper(grouper);

            populate = true;
        } else {
            if (groups) {
                me.removeObserver(groups);
                groups.destroy();
            }
            me.setGroups(null);
        }

        if (!sorters.updating) {
            me.onEndUpdateSorters(sorters);
        }

        if (populate) {
            groups.onCollectionRefresh(me);
        }
    },

    onEndUpdateSorters: function (sorters) {
        var me = this,
            was = me.sorted,
            is = (me.grouped && me.getAutoGroup()) || (sorters && (sorters.length > 0));

        if (was || is) {
            // ensure flag property is a boolean.
            // sorters && (sorters.length > 0) may evaluate to null
            me.sorted = !!is;
            me.onSortChange(sorters);
        }
    },

    updateAutoGroup: function(autoGroup) {
        var groups = this.getGroups();
        if (groups) {
            groups.setAutoGroup(autoGroup);
        }
        // Important to call this so it can clear the .sorted flag
        // as needed
        this.onEndUpdateSorters(this.getSorters());
    }
});

//@UpgradedSencha 5.1
//EXTJS-15525 - Syncing of newly client-side created records with a server results in the new record being permanently selected
Ext.define('EXTJS-15525.util.Collection', {
    override: 'Ext.util.Collection',
    compatibility: '5.1.0.107',

    updateKey: function (item, oldKey) {
        var me = this,
            map = me.map,
            indices = me.indices,
            source = me.getSource(),
            newKey;

        if (source && !source.updating) {
            // If we are being told of the key change and the source has the same idea
            // on keying the item, push the change down instead.
            source.updateKey(item, oldKey);
        }
        // If there *is* an existing item by the oldKey and the key yielded by the new item is different from the oldKey...
        else if (map[oldKey] && (newKey = me.getKey(item)) !== oldKey) {
            if (oldKey in map || map[newKey] !== item) {
                if (oldKey in map) {
                    //<debug>
                    if (map[oldKey] !== item) {
                        Ext.Error.raise('Incorrect oldKey "' + oldKey +
                        '" for item with newKey "' + newKey + '"');
                    }
                    //</debug>

                    delete map[oldKey];
                }

                // We need to mark ourselves as updating so that observing collections
                // don't reflect the updateKey back to us (see above check) but this is
                // not really a normal update cycle so we don't call begin/endUpdate.
                me.updating++;

                me.generation++;
                map[newKey] = item;
                if (indices) {
                    indices[newKey] = indices[oldKey];
                    delete indices[oldKey];
                }

                me.notify('updatekey', [{
                    item: item,
                    newKey: newKey,
                    oldKey: oldKey
                }]);

                me.updating--;
            }
        }
    }
});