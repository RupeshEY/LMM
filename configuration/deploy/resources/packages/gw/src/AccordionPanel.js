/**
 * A special tree panel:
 *  - only allow expanding the selected path
 *  - selecting a folder will auto expand the first child
 */
Ext.define('gw.AccordionPanel', {
    extend: 'Ext.tree.Panel',
    uses: 'gw.app',
    alias: 'widget.accordionpanel',

    displayField: 'title',
    anchor: '100%',
    ui: 'tree-navigation',
    manageHeight: false,
    animate: false,
    useArrows: true,
    singleExpand: true,
    scrollable: true,
    rootVisible: false,
    keyMaps: [],

    initComponent: function() {
        var me = this;

        me.footerId = me.id + '-footer';

        // events
        me.on({
            beforeitemcollapse  : me.onBeforeItemCollapse,
            itemcollapse        : me.onItemCollapse,
            beforeselect        : me.onBeforeSelect,
            selectionchange     : me.onSelectionChange
        });

        if(Array.isArray(me.items)) {
            for (var i = 0; i < me.items.length; i++) {
                var item = me.items[i];
                if (typeof item.shortcut == "string") {
                    keyMap = me.addKeyMap(item.shortcut, Ext.getDoc(), {
                        alt: true,
                        defaultEventAction: 'stopEvent',
                        target: Ext.getDoc(),
                        key: item.shortcut,
                        fn: gw.app.handleAction.bind(null, null, item.eventId.slice(), {}, {}),
                        scope: me
                    }, me)
                    me.keyMaps.push({key: item.shortcut, map: keyMap});
                }
            }
        }

        // config
        me.addCls('g-accordion');
        me.modelId = 'gw.model.AccordionModel';

        // Disallow mouse events and hover style for expander,
        // because we can't allow expanding/collapsing independently from selection change:
        // Also we want to use the new AccordionNavigationModel as defined by the 'accordion' alias
        me.viewConfig = Ext.apply(me.viewConfig || {}, {
            expanderSelector: '.does-not-match-anything',
            navigationModel: 'accordion'
        });

        // define root
        if (me.items) {
            me.root = {
                expanded: true,
                items: me.items,
              // @UpgradedSencha 5.1 - The selectPath logic now needs the 'eventId' to be on the root node.
                eventId: ''
            };
            delete me.items;

            var inputFields = [];
            me.transformData(me.root, inputFields);

            if (inputFields.length > 0) { // dock form inputs to the bottom
                me.dockedItems = [{
                    dock    : 'bottom',
                    layout  : 'anchor',
                    xtype   : 'panel',
                    items   : inputFields,
                    defaults: {
                        labelWidth: 63,
                        anchor: '100%'
                    }
                }];
            }
        }
        else {
            me.root = {
                leaf: true,
                expanded: false
            };
            me.hidden = true;
        }

        // super
        me.callParent(arguments);
    },

    // AHK - 3-18-2103 - @SenchaUpgrade temporarily set animate to true in expand and collapse, since otherwise you can't
    // re-expand the panel after it's been collapsed.  I attempted to debug the underlying problem, but failed:  I got
    // as far as the fact the finishedLayout on the Dock layout doesn't correctly call afterCollapse like it should
    // since the animation comes back as true (since it's been temporarily enabled), so the callback doesn't happen.
    // I also attempted to set animCollapse to false, which lead to a different problem whereby the panel doesn't
    // re-expand properly (though expand() does get called in that case).  Ugh.
    expand : function() {
      var me = this;
      var footer = Ext.getCmp(me.id + '-footer');
      me.animate = true;

      if (footer != undefined) {
        footer.setVisible(false);
      }
      me.callParent(arguments);
      me.animate = false;
    },

    collapse : function() {
      var me = this;
      me.animate = true;
      me.callParent(arguments);
      me.animate = false;
    },

    preselectRecord: function(rec) {
        var me = this;
        me.getSelectionModel().deselectAll(); // First deselect all so that the collapse all won't find a selection during the event processing
        me.collapseAll(); // Now collapse the tree.  The properly selected node will auto expand if necessary
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
     * Prevents collapsing a node which is on the selected path, or has 'collapsible' equal to false.
     * @param node the node to collapse
     */
    onBeforeItemCollapse: function(node) {
        var selected = this.getSelectionModel().getSelection()[0];

        if (selected && node.contains(selected)) { // node on the selected path
            return false;
        }

        // a node that is marked as not collapsible
        // children of this node may still be collapsible, pass on the event
        if (this.nonCollapsingNodes && this.nonCollapsingNodes[node.get('eventId')]) {
            node.collapseChildren();
            return false;
        }
    },

    /**
     * Collapses children when a node is collapsed
     * @param node the node to collapse
     */
    onItemCollapse: function(node) {
        // to prevent error when the node is opened for the next time
        node.collapseChildren();
    },

    /**
     * Do nothing in this inherited method since all actions are performed in selectionchange handler
     */
    doClick: function (tree, nodeModel, evt) {
    },

    /**
     * Disallows selecting a disabled node
     */
    onBeforeSelect: function(view, node) {
        if (node.get('cls') === gw.app.ACCORDION_DISABLED_CLASS) {
            return false;
        }
    },

    /**
     * Selects the first child recursively, when a node is selected
     */
    onSelectionChange: function(model, selections) {
        var me = this,
            newSelection = selections[0],
            currentSelection = newSelection,
            //selModel,
            view = me.getView(),
            grid = view.ownerGrid;

        if (selections.length === 0) {
            if (me.root.isNode) {
                me.root.collapseChildren();
            }
            return true;
        } else { // this selected node is leaf
            // collapse unselected path (because "singleExpand" doesn't collapse expanded nodes when you select a leaf node)
            // if the node is leaf or marked as not collapsible, collapse all siblings
            for (var node = newSelection; node !== null; node = node.parentNode) {
                if (!node.isExpandable() || node.get('collapsible') === false) {
                    view.ensureSingleExpand(node);
                }
            }

            //@UpgradedSencha 5.1
            if (grid.ui === 'tree-navigation') {
                if (newSelection.isExpandable()) {
                    //Handle GW edge case where we have to expand the node in regular tree that is not navigation tree
                    newSelection.expand();
                    if (newSelection.firstChild) {
                        model.deselectAll(true);
                        currentSelection = newSelection.firstChild;
                        grid.getNavigationModel().setPosition(currentSelection);
                    }
                } else {
                    // It just makes sense to update the navigation model with the current position since we know it
                    grid.getNavigationModel().setPosition(newSelection);
                }
            }
            // ----

            // call server, when the selection is triggered by the user:
            if (me.preventHandleAction !== true) {
                gw.app.handleAction(null, currentSelection.get('eventId'));
            }
        }
    },

    /**
     * Deals with transforming the hierarchical accordion data into the proper form for ExtJS.  As much as we would like
     * to do this on the server properly, the non-collapsing node issue that is noted below makes that rather impossible
     * @param node a node in the hierarchical menu
     * @param inputFields an array to collect all input fields removed from the tree
     */
    transformData: function(node, inputFields) {
        var me = this;

        if (node.items) {
            if (node.xtype == 'noncollapsingpanel') { // a tree node that is ALWAYS expanded
                node.expanded = true;
                // AHK - 4/10/2013 - There's no decent way that I've found to propagate a custom property through to the
                // wrapper object ExtJS creates for the node.  We used to set a 'collapsible' property on the node, but
                // that property disappears by the time we try to check it in onBeforeCollapse.  So instead, we keep a map
                // of the event ids that shouldn't be collapsed, and check it in onBeforeCollapse
                // See PL-23909
                if (!me.nonCollapsingNodes) {
                  me.nonCollapsingNodes = {};
                }
                me.nonCollapsingNodes[node.eventId] = true;
            }

            // rename "items" to "children":
            node.children = node.items;
            delete node.items;

            for (var i = node.children.length - 1; i >= 0; i--) {
                var child = node.children[i];
                if (child.xtype == 'noncollapsingpanel' && child.layout) {
                    // remove any form field from the tree
                    Ext.Array.remove(node.children, child);
                    Ext.Array.insert(inputFields, 0, child.items);
                } else {
                    // recursive call:
                    me.transformData(child, inputFields);
                }
            }
        } else {
            // mark leaf node:
            node.leaf = true;
        }

        if (node.disabled == true) {
            node.cls = gw.app.ACCORDION_DISABLED_CLASS; // class for a disabled item
        }
    },

    onDestroy: function() {
      var me = this;
        for(var i = 0; i < me.keyMaps.length; i++) {
            me.removeKeyMap(me.keyMaps[i].key, me.keyMaps[i].map);
        }
        me.keyMaps.length = 0;
//      Ext.cacheLogger.log("onDestroy() for accordionPanel, " + (this.store ? this.store.storeId : " no store field"))
      if (me.store) {
        if (me.store.getProxy()) {
          me.store.getProxy().clearListeners();
        }
        me.unbindStore();
      }
      me.callParent();
    }

});