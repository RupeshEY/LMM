Ext.define('gw.ext.RowTree', {
    extend: 'Ext.tree.Panel',
    alias: 'widget.rowtree',
    uses: ['Ext.ComponentManager', 'gw.GridUtil', 'gw.SimpleGrid', 'gw.app'],

    rootVisible: false,
    shrinkWrap: true,
    shrinkWrapDock: true,

    // Clear toggle.
    clearFoldersToggled: function () {
        var localToggleState = Ext.ComponentManager.get(this.id + '_toggle');
        if (!localToggleState) {
            return; // No need to collect client folder-toggle state to send to the server
        }
        this.foldersToggled = [];
        localToggleState.setValue('');
    },

    updateFlagged: function () {
        // update button state:
        var checkedNodes = this.getChecked();
        gw.GridUtil.updateFlaggedButtons(this[gw.SimpleGrid.FLAGGED], checkedNodes, this);
    },

    /**
     * Registers events, and sets up store fields
     */
    initComponent: function () {
        var me = this;

        me.on({
            /**
             * Disable row selection, if needed
             */
            beforeselect: function (view, node) {
                //if user selection is disabled, and the node is not pre-selected by server
                if (node.get('disableSelection') && !node.get('selected')) {
                    return false; // cancel selection
                }
            },

            /**
             * Handles row selection for a Tree-Detail panel:
             * @param selModel
             * @param selections
             */
            selectionchange: function (selModel, selections) {
                // show detail
                if (selections.length == 1) {

                    var node = selections[0];
                    var tree = selModel.view.ownerCt;
                    gw.app.requestViewRoot(
                        [tree.id, node.get('id'), '_ViewDetail'].join(":"),
                        {updateData: true}
                    );
                }

            },

            /**
             * Handles node checkbox state change
             */
            checkchange: me.updateFlagged,
            load: me.updateFlagged
        });

        if (!me.viewConfig) {
            me.viewConfig = {}
        }
        me.viewConfig.stripeRows = (me.gStripeRows !== false);
        me.viewConfig.getRowClass = function (record) {
          // :css denotes the highlighted style class
          return record.raw[':css'];
        };

        // Remember the LV grid column resize state from the local cookie store:
        if (!me.stateId) {
            me.stateId = me.id;
        }
        if (me.stateId) {
            me.stateful = true;
        }

        var fields = [
            {name: 'disableSelection', type: 'boolean'},
            'eventParam',
            'selected'
        ];

        if (me.cb) {
            // add fields needed to render node checkbox and post checkbox state to the server
            fields.push({
                name: 'checked',
                type: 'boolean',
                mapping: '_Checkbox',
                convert: function (v) {
                    return Ext.isBoolean(v) ? v : v === 'true' ? true : v === 'false' ? false : null;
                }
            });
            fields.push({name: gw.SimpleGrid.ROW_OFFSET, mapping: 'id'});
            fields.push(':flags');
        }

        for (var i = 0; i < me.columns.length; i++) {
            var col = me.columns[i];
            if (i == 0) {
                col.xtype = 'treecolumn'; // first column contains tree-operation buttons
            } else {
                col.renderer = me.treeColumnRenderer;
            }

            fields.push(col.dataIndex);
            fields.push(col.dataIndex + ':cls');
        }

        me.fields = fields;

        // Create a strut root object to have the super class method load data into.
        me.root = {id: 'root'};
        // If there is no data section from the server, make the root a leaf node
        if (!me.data) {
            Ext.apply(me.root, {expanded: false, expandable: false, leaf: true});
        }
        me.callParent(arguments);

        me.view.on('viewready', me.updateFlagged, /*grid*/me);
      },

  //@SenchaUpgrade This method relies on the dom structure of ExtJs tree column
  doClick: function (tree, nodeModel, evt) {
    var gridCellSelector = '.' + Ext.baseCSSPrefix + 'grid-cell',
        treeColumn = evt.getTarget(gridCellSelector),
    // look up which cellMenu is clicked with the max depth of search set to 4
        cellMenu = evt.getTarget('.' + gw.app.GRID_CELL_MENU_CLASS, 4, true);
    if (cellMenu) {
      evt.stopEvent();
      nodeModel.menus[cellMenu.getAttribute('id')].showMenu();
      return;
    }
    if (treeColumn) {
      var colIndex = Ext.fly(treeColumn).parent().query(gridCellSelector).indexOf(treeColumn);
      var dataColumn = tree.headerCt.getVisibleGridColumns()[colIndex];
      var dataIndex = dataColumn.dataIndex;
      if (nodeModel.get(dataIndex + ':cls') == gw.app.getEventSourceCls()) {
        evt.stopEvent();
        // handling linkCell
        if (dataColumn.dataType == "complexType") {
          var itemElement = nodeModel.get(dataIndex);
          var btnConfig = this.getButtonConfig(itemElement, evt.getTarget().id);
          if (btnConfig.noaction) {
            return false;
          }
          var options = btnConfig.download ? {download: btnConfig.download} : {};
          gw.app.handleAction(null, evt.getTarget().id, options);
        } else {
          // handling action for containerAction(eventParam) or regular action associated to the cell(dataIndex)
          gw.app.handleAction(null, [tree.id, nodeModel.get('id'), (nodeModel.get('eventParam') || dataIndex)].join(':'));
        }
      }
    }
  },

  getButtonConfig: function (itemElement, targetId) {
    if (itemElement.id && itemElement.id == targetId) {
      return itemElement;
    } else if (itemElement.items && itemElement.items.length > 0) {
      for (var j = 0; j < itemElement.items.length; j++) {
        var childItem = itemElement.items[j];
        if (childItem.id && childItem.id == targetId) {
          return childItem;
        }
      }
    }
    return {};
  },

  treeColumnRenderer: function (value, metaData, record, rowIndex, colIndex, store, view) {
    var header = view.headerCt.getHeaderAtIndex(colIndex);
    var fieldName = header.dataIndex;
    if (value && value.items) {
      // rendering for linkCell
      var htmlArray = [];
      for (var i = 0; i < value.items.length; i++) {
        htmlArray.push(this.columns[colIndex]._markupCellLink(value.items[i], null));
      }
      return htmlArray.join('');
    } else {
      return header._renderRegularContent(header, value, store, record, rowIndex, colIndex, fieldName, metaData, undefined, view);
    }
  }

});

