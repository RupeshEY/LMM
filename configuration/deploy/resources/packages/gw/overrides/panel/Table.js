Ext.define('gw.override.panel.Table', {
  override: 'Ext.panel.Table',
  _allColInfo: {},

  /**
   * PL-29294 Newly added LV column appears at the extreme right until layout preferences are reset
   * this happens like a reload after editing the PCF, the JSON items and the state will be out of sync
   * Hence do not try to restore state, need to override here to work in rowtree and grid
   */
  initComponent: function () {
    var me = this;
    // Returns an associative array keyed by column state id of all the visible columns
    // from panel.  This only contains a map keyed by stateid and does not include how the
    // columns are related to each other.
    function _getFilteredColumnMap(panel) {
      var filteredColumnMap = {};
      var columnsState = panel.headerCt.getColumnsState();
      if (columnsState) {
        Ext.Array.each(columnsState, function (colState) {
          _getFilteredColumns(colState, filteredColumnMap);
        });
      }
      return filteredColumnMap;
    }

    function _getFilteredColumns(colState, filteredColumnMap) {
      if (!colState) {
        return;
      }
      // Include if it's visible (!hidden) or it's hideable
      // i.e. - don't include internal columns.

      if (!colState.hidden || (colState.hideable !== false)) {
        filteredColumnMap[colState.id] = colState;
        if (colState.columns) {
          Ext.Array.each(colState.columns, function (subCol) {
            _getFilteredColumns(subCol, filteredColumnMap);
          });
        }
      }
    }

    // Recursive method that returns the state columns that exist in filteredColumnMap
    function _getFilteredStateCols(stateColArray, filteredColumnMap) {
      var filteredColumns = [];
      Ext.Array.each(stateColArray, function(currentCol) {
        if (filteredColumnMap[currentCol.id]) {
          filteredColumns.push(currentCol);
          if (currentCol.columns) {
            currentCol.columns = _getFilteredStateCols(currentCol.columns, filteredColumnMap);
          }
        }
      });
      return filteredColumns;
    }

    //// --- Keep Me --- //
    //// This method is useful for debugging.
    //
/*
    function _printStoredColumnStateInfo(state) {
      console.log("===== Stored Table Information =====")
      var tables = state.allTables;
      for (var key in tables) {
        console.log("  Table ID: " + key);
        var columnInfo = tables[key];
        for (var colKey in columnInfo) {
          var col = columnInfo[colKey];
          console.log("    ColKey: " + colKey + "-> width: " + col.width + ", hidden: " + col.hidden + ", hideable: " + col.hideable)
        }
      }
      console.log("===== END =====")
    }
*/
    //
    //// --- END (Keep Me) --- //

    // Recursive method that stores column information for both visible and currently hidden columns.
    function _storeColumnStateInfo(sourceColumns, storeColumnMap) {
      if (!sourceColumns) {
        return;
      }
      Ext.Array.each(sourceColumns, function(currentCol) {
        storeColumnMap[currentCol.id] = currentCol;
        _storeColumnStateInfo(currentCol.columns, storeColumnMap);
      });
    }

    // Used to directly update the columns in the panel.  Attempts to update the panel based on
    // values stored on the object during beforestatesave.
    function _updatePanelFromSaveColumnData(panel, savedColumnMap) {
      if (savedColumnMap && panel.headerCt && panel.headerCt.items && panel.headerCt.items.items) {
        var panelColumns = panel.headerCt.items.items;
        _restoreColumnTree(panelColumns, savedColumnMap);
      }
    }

    // Attempt to apply saved column state from savedColumnMap
    function _restoreColumnTree(panelColumns, savedColumnMap) {
      if (!panelColumns.length) {
        return;
      }

      Ext.Array.each(panelColumns, function(col) {
        // Include if it's visible (!hidden) or it's hideable
        // i.e. - don't include internal columns.
        if (!col.isHidden() || col.isHideable()) {
          var saveColumnState = savedColumnMap[col.getStateId()];
          if (saveColumnState) {
            col.applyColumnState(saveColumnState);
            if (col.items && col.items.items) {
              _restoreColumnTree(col.items.items, savedColumnMap);
            }
          }
        }
      });
    }

    me.on({
      beforestatesave: function (panel, state) {
          if (state.columns) {

              // Grab which columns to save for the panel
              var saveColumnMap = _getFilteredColumnMap(panel);
              // Apply map to filter the current state columns to those we want to save
              state.columns = _getFilteredStateCols(state.columns, saveColumnMap);

              // Init the associative array used to keep a handle on saved grid info if it
              // doesn't already exist.
              if (!state.allTables) {
                  state.allTables = this._allTableInfo || {};
              }

              // Accumulate all the currently accessible columns for a given table.
              // This allows preferences to be stored for columns that might not be
              // rendered for a given table due to visibility logic.
              var storeColumns = state.allTables[this.id] || {};
              _storeColumnStateInfo(state.columns, storeColumns);
              state.allTables[this.id] = storeColumns;

              // --- Uncomment lines below and referenced method for debugging --- //
              /*
               console.log("===== beforestatesave: state.allTables[" + this.id + "] state.columns =====")
               var collInfo = state.columns;
               for (var key in collInfo) {
               console.log("  state.columns[" + key + "]: stateId=[" + collInfo[key].id + "], width=[" + collInfo[key].width + "], hidden=[" + collInfo[key].hidden + "]");
               }
               console.log("===== END beforestatesave ===[" + this.id + "]");
               _printStoredColumnStateInfo(state);
               */
          }
      },

      beforerender: function (panel, opts) {
          if (this._allTableInfo) {
              var storedColumnInfo = this._allTableInfo[this.id];
              if (storedColumnInfo) {
                  // Uncomment for debugging
                  /*
                   console.log("Table.beforerender: Updating panel from saved column data.");
                   */
                  _updatePanelFromSaveColumnData(panel, storedColumnInfo);
              }
          }
      },

      staterestore: function (panel, state) {
          // Squirrel away all table and cols on the table object.
          // (See this.on('beforestatesave') above to see when state.allTables is generated)
          // This is used in 'beforerender' to update column data with the saved column state.
          this._allTableInfo = state.allTables || {};
      }
    });

    // add filters to panel toolbar
    if (me.filters) {
      gw.GridUtil.addFiltersToPanel(me, me.filters);
      delete me.filters;
    }

    me.callParent(arguments);

    // PLWEB-4763 - make the height 1px if it comes back from the parent set to zero and we are hiding headers.
    // This allows for the border at the top of the table to be visible since the headers (which are being hidden) is
    // used to generate that border.
    if (me.hideHeaders && me.headerCt && me.headerCt.height === 0) {
        me.headerCt.height = 1;
    }
  }

});
