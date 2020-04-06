/**
 * Override tree panel, so that the change can be inherited by TreeGrid sub class
 */
Ext.define('gw.override.tree.Panel', {
    override: 'Ext.tree.Panel',

    uses: ['Ext.ComponentManager', 'gw.app'],

    scrollable: true,

    border: false,
    //PL-23195: May consider setting back to default animation once fixed by Ext JS.
    animate: false,

    autoSelectionPath: null,

    autoSelectionRecord: null,

    listeners: {
        /**
         * After the tree is fully rendered:
         * <li> starts tracking toggled nodes
         * <li> Selects the default "selected" node
         */
        afterrender: function (tree) {
            this.foldersToggled = []; // resets toggled nodes after loading the tree from server
        },

        afterlayout: function (tree) {
            // Perform visual tree node selection
            var record,
                path = tree.autoSelectionPath,
                autoRecord = tree.autoSelectionRecord,
                model = tree.getSelectionModel();

            if(path){
                record = tree.store.findNode('eventId', path, false, false, true);

                if(record && model.getSelection()[0] !== record){
                    tree.preselectRecord(record);
                }
            }

            if(autoRecord){
                tree.preselectRecord(autoRecord);
            }
        },

        beforeselect: function(view, node) {
            var trees;

            //PLWEB-6093 Clear selection for all tree instances
            trees = Ext.getCmp('westPanel').query('treepanel');
            trees.forEach(function(panel) {
                // Only need to de-select in all panels except target
                if (view.view.panel.id !== panel.id) {
                    panel.getSelectionModel().deselectAll();
                }
            });
        },

        /**
         * Tracks nodes toggled locally
         */
        beforeitemexpand: function (nodeModel) {
            this._onToggle(this, nodeModel.get('id'))
        },
        /**
         * Tracks nodes toggled locally
         */
        beforeitemcollapse: function (nodeModel) {
            this._onToggle(this, nodeModel.get('id'))
        },

        /**
         * Undos "toggled at client" state, when a node is loaded from server side
         */
        load: function (store, nodeModel) {
            if (nodeModel.isRoot() && !this.rootVisible) {
                return; // invisible root node doesn't have toggle state at client side
            }
            this._onToggle(this, nodeModel.get('id'))
        },

        /**
         * Triggers action on click:
         */
        itemclick: function (treeView, nodeModel, elem, index, evt) {
            return this.doClick(this, nodeModel, evt);
        }
    },

    preselectRecord: function(rec) {
        var me = this;
        me.suspendEvents(); // fire no events during preselection
        me.selectPath(rec.getPath(), rec.getIdProperty(), '/',
            function(success, selectedNode) {
                me.getNavigationModel().setPosition(selectedNode);
                me.autoSelectionPath = null;
                me.autoSelectionRecord = null;
                me.resumeEvents();
            }
        );
    },

    /**
     * Sets up loader to load inline data
     */
    initComponent: function () {
        var me = this;

        // @UpgradedSencha - data is living now inside config object, so get it from there if we don't have it
        me.data = me.data || me.config.data;
        var establishAutoSelectionRecord = function(store) {
          store.getRoot().cascadeBy(function (node) {
            if (node.get('selected')) {
              me.autoSelectionRecord = node;
            }
          });
        };

        me.store = {
            remoteSort: true,  // sort at server side
            storeId: me.id, // set up store id

            listeners: {
                /**
                 * Checks for pre-selected node from server, when the store reload
                 */
                load: function (store, node, records, successful) {
                    if (successful) {
                        store.ownerTree.ownerCt.checksum = 'checksumInvalidated';  //5.1
                        establishAutoSelectionRecord(store);
                    }
                }
            }
        };

        if (me.fields) { // grid like Tree
            // @UpgradedSencha - a variation of fixup code, putting data into the children of the store's root
            me.store.root = {
                expanded: true,
                children: me.data
            };
            delete me.data;
            me.store.fields = me.fields;
        } else { // Basic Tree
            // @UpgradedSencha - moved fixup code from above, putting the data into the children of the root.
            if (me.data && me.root) {
                me.root.children = me.data;
                delete me.data;
            }
            me.store.model = me.modelId ? me.modelId : 'gw.model.TreeModel';
        }

        // Use gw proxy for the TreeStore
        me.store.proxy = Ext.create('gw.ext.ModelProxy', {
            reader: {}, // work around JS error when there's no reader specified
            url: 'dummy2',
            extraParams: {viewRootId: me.dataUrl || me.id}
        });

        me.callParent(arguments);
        establishAutoSelectionRecord(me.getStore());
        // add a hidden input to store folders toggled at client side:
        me.add({
            id: me.id + '_toggle',
            xtype: 'hidden',
            hidden: true
        });
    },

    /**
     * Remembers nodes toggled at browser side
     */
    _onToggle: function (tree, nodeId) {
        if (!tree.foldersToggled) {
            return; // not ready yet
        }
        var localToggleState = Ext.ComponentManager.get(tree.id + '_toggle');
        if (!localToggleState) {
            return; // No need to collect client folder-toggle state to send to the server
        }

        if (Ext.Array.indexOf(tree.foldersToggled, nodeId) >= 0) {
            Ext.Array.remove(tree.foldersToggled, nodeId);
        } else {
            tree.foldersToggled.push(nodeId)
        }
        localToggleState.setValue(tree.foldersToggled.toString());
    },

    getDataIndex: function (colIndex) {
        return this.columns[colIndex].dataIndex
    },

    /**
     * Handles click on a tree node
     */
    doClick: function (tree, nodeModel, evt) {
        if (!nodeModel.get('disabled')) {
            evt.stopEvent();
            gw.app.handleAction(null, tree.dataUrl || tree.id, {param: nodeModel.get('id')})
        }
    }
});
