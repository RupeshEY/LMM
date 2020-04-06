/**
 * Key config parameters for gw grid:
 * <li> id - The ExtJs component id, i.e., the server renderId of the corresponding ListView widget
 * <li> gwBaseId - Id of the nearest naming container of the server ListView widget (may be the ListView
 *                   itself or a containing widget)
 * <li> dataUrl - the fully qualified id (i.e., server renderId) of the dominant RowIterator widget, used
 *                   for pagination, sorting, etc.
 */
Ext.define('gw.SimpleGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.simplegrid',
    requires: [
        'Ext.grid.plugin.CellEditing',
        'Ext.grid.feature.Summary',
        'Ext.grid.plugin.BufferedRenderer',
        'Ext.grid.feature.GroupingSummary',
        'Ext.data.schema.Schema',
        'Ext.ComponentManager',
        'Ext.grid.filters.Filters'
    ],
    uses: [
        'gw.app',
        'gw.Util',
        'gw.GridUtil'
    ],

    statics: {
        SELECTED: ':selected',
        SUMMARY_FEATURE_ID: 'gsummary',
        GROUPING_FEATURE_ID: 'ggrouping',
        FILTER_FEATURE_ID: 'gfitlers',
        GROUPINGSUMMARY_FEATURE_ID: 'ggroupingsummary',
        ROW_CSS: ':css',
        ROW_OFFSET: ':offset',
        FLAGS: ':flags',
        FLAGGED: ':flagged'
    },

    border: true, //@UpgradedSencha Restore grid border
    stateful: true,
    disableSelection: true, // this property conflicts with cell model, we re-enable based on model later in initComponent
    deferRowRender: false,
    columnLines: true,
    shrinkWrap: true,  // IMPORTANT: to avoid grid content being cut off without a scroll bar in ExtJS 4.2
    shrinkWrapDock: true,  // IMPORTANT: to avoid grid content being cut off without a scroll bar in ExtJS 4.2

    multiColumnSort: false, //When true, enables multi sorting on the grid

    viewConfig: {
        trackOver: false, // do not highlight the row while mouse hover over
        loadMask: false,
        stripeRows: true, // alternate row style
        getRowClass: function (record) {
            return record.get(':css');
        }
    },

    initComponent: function () {
        var me = this;

        //@UpgradedSencha - data is living now inside config object.
        me.data = me.config.data;

        if (!me.stateId) {
            me.stateId = me.id;
        }

        if (me.gStripeRows === false) {
            var newViewConfig = {};
            Ext.apply(newViewConfig, me.viewConfig);
            newViewConfig.stripeRows = false;
            me.viewConfig = newViewConfig;
        }

        // Add default row fields: offset, flags & css field:
        var fields = me.fields;
        fields.push(
            gw.SimpleGrid.ROW_OFFSET,
            gw.SimpleGrid.FLAGS,
            gw.SimpleGrid.FLAGGED,
            gw.SimpleGrid.ROW_CSS
        );

        if (!me.plugins) {
            // for list detail view, only allow two clicks to invoke the editor so it's not confused with row selection
            var numberOfClicksToEdit = (me.hasSelection === true) ? 2 : 1;
            me.plugins = [
                {
                    ptype: 'cellediting',
                    pluginId: 'gridCellEditing', // GW require
                    clicksToEdit: numberOfClicksToEdit,
                    // @UpgradedSencha 5.1 - we want to record the grid id of the active LV on edit.  This restores
                    // code that was removed from the override of the startEdit() on the CellEditing
                    listeners: {
                        beforeedit: function(editor, context, options) {
                            // set the active LV so after page refresh the focus will be on the correct listView
                            gw.app.setActiveLV(context.grid.id);
                            return true;
                        }
                    }
                },
                // @UpgradedSencha - http://docs-devel.sencha.com/extjs/5.1/5.1.0-apidocs/#!/api/Ext.grid.filters.Filters
                'gridfilters'
            ];
        }

        // When disableSelection is true, user can't change selected row;
        // However, server may still mark some rows as pre-selected (i.e., hasSelection will be true).
        me.trackMouseOver = !me.disableSelection;

        if (me.hasSelection) {
            fields.push({name: gw.SimpleGrid.SELECTED, type: 'bool'});
            // Hookup selection change listener
            if (!me.selModel) {
                me.selModel = {
                    listeners: {select: me.rowSelectHandler, scope: me}
                }
            }
        } else {
            /**
             * Set to true to restore selected cell after grid is re-rendered
             * @type {boolean}
             */
            me.keepSelection = true;
        }

        me._createFeatures(fields);

        me.gDynamicModelName = me.id + '-model';
        me.store = me._createStore(fields);
        Ext.apply(me.store.proxy, {
            extraParams: {
                viewRootId: me.dataUrl || me.id,
                updateData: true
            }
        });

        //Add paging control to grid, if needed. Don't add a paging control if the grid does not page
        if (me.data && me.data.options && me.data.options.limit != undefined) {

            var dominantRowIteratorId = (me.id == me.gwBaseId ? me.id : me.dataUrl);
            me.tbar = Ext.apply(me.tbar || {}, {
                store: me.store,
                gridId: me.id,
                // The paging/record count display id is <lvId>:_ListPaging.
                // This id is needed for testing and updating the LV page count. lvId is the grid's LV
                // id or the dataUrl (dominant row iterator) if the LV has a render id only (no explicit id)
                pagingId: dominantRowIteratorId + ':_ListPaging',
                recordCountId: dominantRowIteratorId + ':_RecordCount',
                pagingDisabled: me.data.options.pagingDisabled,
                displayInfo: me.displayInfo,
                prependButtons: true, // add other buttons before the pagination
                plugins: {ptype: 'gtbconfig'}, // default config for gw toolbar
                xtype: 'gpaging'
            });

            if (me.tbar.items) {
                me.tbar.items.push('-'); // a divider between pagination and other controls
            }

            // TODO: Refactor:  The servers should send these ids.
            me.gwPagingId = me.tbar.pagingId;
        }

        me.callParent(arguments);

        // If after we've fully initialize the grid, when it hasSelection AND the selection model is locked,
        // we want to disable the navigation model so that focusing doesn't happen on the locked grid
        if (me.hasSelection && me.getSelectionModel().isLocked()) {
            me.getNavigationModel().disable();
        }

        me.view.on({
            /**
             * Cancels mousedown to stop row-section, if a button or menu in cell is clicked
             */
            beforeitemmousedown: function (gridview, record, item, index, e, eOpts) {
                if ('mousedown' === e.type && (gw.GridUtil.getClickedCellButton(e) || gw.GridUtil.getClickedCellMenu(e))) {
                    return false;
                }
            },

            /**
             * @SenchaUpgrade It's problematic to update store data when the grid has an active editor.
             * For example, when tabbing off a data-only PostOnChange cell after change, and the data or data range
             * the next cell is changed due to POC. Keeping the old editor around could show stale data and cause subsequent
             * problem.
             * The workaround is to dismiss editor before refresh, and reactivate the editor after the refresh.
             */
            beforerefresh: function (view) {
                var comp = view.ownerCt;
                var editingPlugin = comp.getCellEditingPlugin();

                if (editingPlugin.editing && editingPlugin.context) {
                    var gPosition = {
                        row: editingPlugin.context.rowIdx,
                        column: editingPlugin.context.colIdx
                    };

                    // cancel editor
                    editingPlugin.cancelEdit();

                    // restore editor:
                    function restoreEditor() {
                        var listDetailPanel = comp.hasSelection;
                        var currentPosition = comp.getPosition();

                        // Do not restore the editor in a list detail panel if the editor is not in the currently selected row
                        // This condition indicates some sort of validation error that kicked the selection to the previous row
                        // on the first click, while the 2nd click is trying to activate the editor on a different row. Restoring
                        // the editor will cause an infinite loop of POSTs.
                        if (!listDetailPanel || (currentPosition && gPosition && gPosition.row === currentPosition.rowIdx)) {
                            comp.getCellEditingPlugin().startEditByPosition(gPosition);
                        }
                    }

                    if (Ext.AbstractComponent.layoutSuspendCount) {
                        Ext.globalEvents.on('afterlayout', restoreEditor, undefined, {single: true})
                    } else {
                        view.on('refresh', restoreEditor, undefined, {single: true})
                    }
                }
            },

            viewready: function () {
                me.updateRowSelections();

                // load data after toolbars are rendered and paging toolbar is bound to the store, to update toolbar state
                if (me.data && me.data.root) {
                    gw.Util.updateStore(me.store, me.data);
                    delete me.data;
                }

                // Restore navigation position if one was previously stored and we are not in in a list detail list
                // view (i.e. - row selection mode)
                // This applies to use cases where you click to edit grid, navigate away and then return back.
                var oldNav = gw.app._gridNavigation;
                if(oldNav && !me.hasSelection) {
                    gw.GridUtil.restoreLastFocusedCell(me, oldNav);
                }
            }
        });

        me.on({
          // Handle open-menu or action inside a cell
          cellclick: function (gridView, td, cellIndex, record, tr, rowIndex, evt) {
            // Return the result of processing the cell click via mouse, this will impact how the event is handled,
            // especially in regards to menu items and buttons clicked in cells
            return gw.GridUtil.processCellClickViaMouse(gridView, td, cellIndex, record, tr, rowIndex, evt);
          },

          // Handle recording the editing mode on a cell
          beforeedit: function (editor, editingInfo) {
            gw.GridUtil.recordFocusedCell(me, {}, editingInfo, editingInfo);
          }
        });
    },

    /**
     * Loops through each hidden column in the grid, and unhide it if it contains errors
     * @private
     */
    _unhideInvalidOrRequiredColumns: function () {
        var me = this,
            columns = me.headerCt.getGridColumns(),
            i, rIndex, column;

        for (i = 0; i < columns.length; i++) {
            column = columns[i];
            if (column.hidden && column.hideable) {
                rIndex = me.store.findBy(function (r) {
                    var columnData = r.get(column.dataIndex);
                    if (columnData && columnData.invalid) {
                        return true;
                    }
                });
                if (rIndex >= 0 || column.required) {
                    column.show();
                }
            }
        }
    },

    _generateDynamicModel: function (fields) {
        //@UpgradedSencha moved implementation to it's own class and extending that one instead
        return Ext.define(this.gDynamicModelName, {
            extend: 'gw.data.DynamicModel',
            fields: fields
        })
    },

    // unregisters and destroys model
    _destroyDynamicModel: function () {
        var name = this.gDynamicModelName;
        Ext.undefine(name);
        Ext.data.schema.Schema.removeEntityFromSchema(name);
    },

    _createStore: function (fields) {
        var me = this;
        var data = me.data;
        var checkboxField, storeConfig;

        checkboxField = Ext.Array.findBy(fields, function (item, index) {
            return item.name === '_Checkbox';
        });

        if (checkboxField) {
            Ext.apply(checkboxField, {
                convert: function (v) {

                    if (Ext.isBoolean(v)) {
                        return v;
                    }

                    if (Ext.isObject(v)) {
                        return v.value;
                    }

                    // @UpgradedSencha: Previous version did not check for undefined, only null and empty string.
                    // !v should catch all falsey conditions
                    return !v ? '' : v === 'true';
                }
            });
        }

        storeConfig = {
            model: me._generateDynamicModel(fields),
            remoteSort: true, // sort at server side
            // @UpgradedSencha 5.1 Enable remote filtering, which defaults to false
            remoteFilter: true, // We filter remotely
            storeId: me.id,

            listeners: {
                load: me.storeLoaded,
                scope: me
            }
        };

        if (data) {
            storeConfig.root = 'root'; // root property

            // remember initial sorting and paging info:
            if (data.options) {
                // Paging option. Set the pageSize if limit is set
                if (data.options.limit !== undefined) {
                    storeConfig.pageSize = data.options.limit;
                }

                // Sorting options
                if (data.options.sort) {
                    // PLWEB-5855: To be compatible with Emerald, when multiple sorters are provided by the server,
                    // but the grid does not support that many sorters (either single or multiple with a limit),
                    // we set storeConfig.sorters to be limited sort list for this grid
                    storeConfig.sorters = gw.Util.limitSortListToGridSortLimit(data.options.sort, me);
                }

                if (data.options.grouper) {
                    storeConfig.grouper = data.options.grouper;
                    storeConfig.grouper.direction = storeConfig.grouper.direction || 'ASC';
                }
            }

            // Set the pageSize to 0 if no paging has been configured. The default for paging configuration is no paging
            if (storeConfig.pageSize === undefined) {
                storeConfig.pageSize = 0;
            }

            if (data.summaryData && data.summaryData.gSummaryType === 'groupingsummary') {
                var fakeFld = ':grp';
                // create a fake grouping, which is required for displaying summary row:
                Ext.apply(storeConfig,
                    {
                        grouper: {
                            property: fakeFld,
                            direction: 'ASC'
                        }
                    }
                );
            }
        }

        return Ext.create('gw.ModelStore', storeConfig);
    },

    // sets filters, grouping summary/summary
    _createFeatures: function (fields) {
        var me = this,
            columnFilters = me.columnFilters,
            data = me.data,
            features = me.features || [],
            hasGroupingFeature = me.enableGrouping;

        if (columnFilters) {
            //Specify filter defaults and remove properties that no longer exist
            Ext.each(columnFilters, function (filter) {
                filter.property = filter.dataIndex;
                delete filter.dataIndex;

                Ext.apply(filter, {type: 'list', single: true});

                //GW serverside expects array so let's retain it that way
                var val = filter.value;
                if(val && val !== ''){
                    filter.value = Ext.isArray(val) ? val : [val];
                } else {
                    delete filter.value;
                }

                //Mix in to column
                for (var i = 0, iLen = me.columns.length; i < iLen; i++) {
                    if (me.columns[i].dataIndex === filter.property) { //Enable rendering of disabled filter
                        me.columns[i].filter = Ext.clone(filter);
                        break;
                    }
                }
            });
        }

        if (data) {
            var summaryData = me.data.summaryData;
            if (summaryData) {
                if (summaryData.gSummaryType === 'groupingsummary') {
                    var fakeFld = ':grp';
                    hasGroupingFeature = false;
                    fields.push(fakeFld); // fake store field
                    // Also set the stateId otherwise retrieval on refresh for the fake column from the local store fails
                    // and it looks like it hoses retrieving data for the other columns.
                    me.columns.push({stateId: fakeFld, dataIndex: fakeFld, hideable: false}); // fake column, and disallow users from toggling its visibility
                    // css to hide the fake group
                    me.columns[me.columns.length - 1].hidden = true;
                    me.cls = (me.cls || '') + ' g-no-group';

                    features.push({
                        id: gw.SimpleGrid.GROUPINGSUMMARY_FEATURE_ID,
                        ftype: 'groupingsummary',
                        showSummaryRow: true,
                        enableGroupingMenu: false,
                        hideGroupedHeader: false,
                        remoteRoot: 'summaryData',
                        groupHeaderTpl: '{name}'
                    });
                } else if (summaryData.gSummaryType === 'gsummary') {
                    features.push({
                        id: gw.SimpleGrid.SUMMARY_FEATURE_ID,
                        ftype: 'gsummary',
                        showSummaryRow: (data.root !== undefined),
                        remoteRoot: 'summaryData'
                    });
                }
            }

            if (hasGroupingFeature) {
                features.push({
                    id: gw.SimpleGrid.GROUPING_FEATURE_ID,
                    ftype: 'grouping',
                    enableGroupingMenu: true,
                    hideGroupedHeader: false,
                    groupHeaderTpl: '{name}'
                })
            }
        }

        me.features = features;
    },

    /**
     * Updates state for buttons flagged only to this record.
     * @param record data record
     * @return Returns true, if the record contains cell-iterator flags
     */
    _updateFlaggedButtonsForRecord: function (record) {
        var recordFlagged = record.get(gw.SimpleGrid.FLAGGED);
        if (recordFlagged) { // the record contains cell-iterator
            // find all "checked" fields of the same record:
            var checkedCells = [];


            Ext.Array.each(record.fields,
                function (field) {
                    var cellValue = record.data[field.mapping || field.name];
                    if (cellValue && cellValue.cb === true) {
                        checkedCells.push(cellValue)
                    }
                }
            );

            // @UpgradedSencha - get the store id from either the store (if one) or the first of the stores
            gw.GridUtil.updateFlaggedButtons(recordFlagged, checkedCells, Ext.ComponentManager.get(record.store.storeId || record.stores[0].storeId));
            return true;
        }
        return false;
    },

    getCellEditingPlugin: function () {
        return this.getPlugin('gridCellEditing');
    },

    getGridTotalCount: function () {
        var store = this.getStore(),
            count;

        // There seems to be a bug in the Ext JS data store. The totalCount variable is not initialized if there
        // are no records loaded. This happens if the store is empty, see Ext.data.Store#onProxyLoad.
        // Calling getCount() in this instance.
        count = store.getTotalCount();
        if (count == undefined) {
            count = store.getCount();
        }

        return count;
    },

    getColumnById: function (dataIndex) {
        return gw.GridUtil.getColumnById(this, dataIndex);
    },

    /**
     * Updates row selections, if the grid has been rendered.
     */
    updateRowSelections: function () {
        var me = this;
        if (me.hasSelection && me.rendered) {
            var selectedIndex = me.store.findBy(function (record) {
                if (record.get(gw.SimpleGrid.SELECTED) === true) {
                    return true;
                }
            });
            if (selectedIndex >= 0) {
                var sm = me.getSelectionModel(),
                    nm = me.getNavigationModel(),
                    wasLocked = sm.locked;
                // Suspend events in order to avoid a server callback. The server has this already selected
                sm.suspendEvents(false);
                // If we have a selection, we want to make sure the row selections are processed EVEN if the grid is locked
                // so we temporarily unlock the table before doing the update
                sm.locked = false;
                sm.select(selectedIndex, false);
                // Now restore the previous locked state
                sm.locked = wasLocked;
                sm.resumeEvents();
                nm.setPosition(sm.getSelection());
            }
        }
    },

    /**
     * Updates state for buttons depending row selection
     */
    updateFlagged: function () {
        var me = this;
        if (me[gw.SimpleGrid.FLAGGED]) {
            var bRowCB = false;
            var fields = me.store.model.prototype.fields.items;
            for (var i = 0; i < fields.length; i++) {
                if (fields[i] == '_Checkbox' || fields[i].name == '_Checkbox') {
                    bRowCB = true;
                    break;
                }
            }
            var checkedRows = me.store.queryBy(function (record) {
                if (bRowCB) { // the record has a row checkbox column:
                    return record.get('_Checkbox') == true;
                } else { // the record doesn't have a record-level checkbox:
                    var cellWithCheckbox = Ext.Array.findBy(record.fields, function (fld, key) {
                        var value = record.data[fld.mapping] || record.data[fld.name];
                        return value && value.cb != null;
                    });

                    return cellWithCheckbox != null && record.get(cellWithCheckbox.name).cb == true;
                }
            });

            gw.GridUtil.updateFlaggedButtons(me[gw.SimpleGrid.FLAGGED], checkedRows.getRange(), me);
        }
    },

    storeLoaded: function (store, records, successful, eOpts) {
        var me = this,
            sorters = store.getSorters(),
            sorter, col, i = 0, iLen = sorters.length;

        if (me.hasSelection) {
            // update row selection
            me.updateRowSelections()
        }

        // @UpgradedSencha 5.1, attempting to unhide columns at this point causes awful looking side effects to the
        // header. So instead, we register a one-shot event handler on 'boxready' so that the unhiding happens once
        // the grid is fully layed out.
        me.on('boxready', me._unhideInvalidOrRequiredColumns, me, {single: true});

        // update button state
        me.updateFlagged(); // grid level
        store.each(me._updateFlaggedButtonsForRecord); // cell level

        // Update the pager control values
        // Bind the pager store to the grid store and have
        // the server send the current page number ready for the client.
        if (me.gwPagingId) {
            var pager = Ext.ComponentManager.get(me.gwPagingId);
            var gridOptions = store.getProxy().getReader().rawData.options;
            // If there is no paging, put the default paging option to none
            if (!gridOptions || gridOptions.limit == undefined) {
                gridOptions = {
                    start: 1,
                    limit: 0
                };
            }
            if (pager && gridOptions) {
                var start = gridOptions.start;
                var limit = gridOptions.limit;
                var page = start / limit + 1;

                // Update the toolbar store (pager's owning component)
                if (pager.ownerCt) {
                    pager.ownerCt.store.pageSize = limit;
                    pager.ownerCt.store.currentPage = page;
                    pager.ownerCt.store.totalCount = me.getGridTotalCount();
                }

                // Update the drop down pager if it has already been updated before the grid store is loaded
                pager.suspendEvents(false);
                pager.setValue(page);
                pager.resumeEvents();
            }
        }

        var summaryFeature = me.getSummaryFeature();
        if (summaryFeature !== undefined) {
            summaryFeature.showSummaryRow = (me.store.totalCount > 0);
        }
    },

    rowSelectHandler: function (sm, record, rowIndex) {
        var me = this,
            position = me.getNavigationModel().getPosition(),
            columnIndex = position && position.colIdx ? position.colIdx : 0;
        gw.app.requestViewRoot(gw.GridUtil.getFullIdForCell(me.getStore(), record, '_ViewDetail'),
            {updateData: true}, undefined, {postCallback: function() {
                // PLWEB-5761 - restore the focus back to the current row after changing the underlying data,
                // since we only really want the focus, we pass true for the last two parameters to skip events
                me.getNavigationModel().setPosition(rowIndex, columnIndex, null, true, true);
            }});
    },

    /**
     * @SenchaUpgrade
     * Do not save state for store. This will lead to extra Ajax requests since we have
     * remoteSort, remoteGroup and etc
     */
    getState: function () {
        var state = this.callParent(arguments);
        delete state.storeState;

        return state;
    },

    applyState: function (state) {
        delete state.storeState;
        this.callParent(arguments);
    },

    /**
     * Sets the editor or editor configuration for a column in a row.
     * @param {Object} editor editor component or editor configuration
     * @param {String} rowIndex row index for a row sensitive editor
     * @param {String} dataIndex data index for the grid column
     */
    setEditorCfg: function (editor, rowIndex, dataIndex) {
        var column = this.getColumnById(dataIndex);

        // See whether the current column editor is the same as the passed in editor
        var editorCfg = editor;
        editor = column.getEditor();
        if (editor && editor.id == editorCfg.id) {
            return;
        }

        // Strip the editor configuration from non editor related configurations
        if (!(editorCfg instanceof Ext.Component)) {
            // Remove menu opener and other auxiliary editor decorators
            if (editorCfg.item || editorCfg.id) {
                editorCfg = Ext.apply({}, editorCfg);
                delete editorCfg.item;
                delete editorCfg.id;
            }
        }

        // Set the new editor. If the editor is a configuration object, a new editor component is created
        column.setEditor(editorCfg);
    },

    onDestroy: function () {
        var me = this;
        me.callParent(arguments);
        me._destroyDynamicModel();
    },

    /**
     * Update the summary data store with summary details from data.<br/>
     * The data needs to follow the following structure:
     * <pre>
     * {
     *   c&lt;i&gt;: {
     *     text: &lt;Display value&gt;
     *     cls: &lt;Style class to apply for summary data value&gt;
     *     ... (other summary data properties)
     *   }
     * }
     * </pre>
     * where i is the index into the column index (c1, c2, c3, ...)
     * @param {String} groupValue the summary group value key
     * @param {Object} data the summary data to update
     */
    updateSummaryData: function (groupValue, data) {
        var me = this;
        var store = me.getStore();

        var summaryData = store.getProxy().getReader().rawData.summaryData;
        for (var i = 0; i < summaryData.length; i++) {
            if (summaryData[i][":grp"] == groupValue) {

                Ext.Object.each(data, function (columnName, value) {
                    var record = store.last(false); // any record in the store
                    summaryData[i][columnName].text = gw.GridUtil.formatSummaryData(value);

                    //
                    // Force updating the summary row, by fake an edit event on the trigger data cell.
                    // @SenchaUpgrade TODO: Any better way to update the summary row?
                    //
                    var fldName = Ext.Array.findBy(record.fields, function (item) {
                        if (item.mapping == columnName) {
                            return true
                        }
                    }).name;

                    if (summaryData.gSummaryType === 'groupingsummary' && summaryData[i][":grp"] == groupValue) {
                        record = store.findRecord(':grp', groupValue); // find a record in this group
                    }
                    store.fireEvent('update', store, record, Ext.data.Model.EDIT, [fldName]);

                }, store);

                break;
            }
        }
    },

    getSummaryFeature: function () {
        var me = this,
            view = me.view;
        return view.getFeature(gw.SimpleGrid.GROUPINGSUMMARY_FEATURE_ID) || view.getFeature(gw.SimpleGrid.SUMMARY_FEATURE_ID);
    },

    hasEditorsInConfig: function () {
        var config = this.config,
            editors = config && config.data && config.data.editors;
        if (editors) {
            for (var prop in editors) {
                if (editors.hasOwnProperty(prop)) {
                    return true;
                }
            }
        }
        return false;
    }

});
