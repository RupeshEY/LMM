Ext.define('gw.GridUtil', function() {
  /**
   * Counts checked flags
   * @param checkedItems an array of checked items
   * @param flagName
   * @param includeUnchecked
   */
  function countCheckedFlags(checkedItems, flagName, includeUnchecked, grid) {
    var count = 0;

    function _recContainsFlag(item) {
      var flagsProp = gw.SimpleGrid.FLAGS;
      var flags = item.get ? item.get(flagsProp) : item[flagsProp];
      return flags && (Ext.Array.indexOf(flags, flagName) != -1);
    }

    if (includeUnchecked) {
      grid.store.queryBy(function(record) {
        if (_recContainsFlag(record)) {
          // If we find just one record with this flag defined, we are done.
          count++;
          return false
        }
      })
    } else {
      Ext.each(checkedItems, function(item) {
        if (_recContainsFlag(item)) {
          count++
        }
      });
    }
    return count;
  }

  /**
   * Evaluates flags based of checkbox state
   * @param {Ext.data.Model[]} checkedItems an array of checked items
   * @param flags flags
   */
  function evalCheckboxFlags(checkedItems, flags, grid) {
    var totalFlags = checkedItems.length;
    var conditions = flags.split(',');
    for (var i = 0; i < conditions.length; i++) {
      var condition = conditions[i];
      while (condition.substr(0, 1) == ' ') { // Remove initial space
        condition = condition.substr(1);
      }
      var parts = condition.split(' ');
      var countFlags = countCheckedFlags(checkedItems, parts[1], parts[0] == 'exists', grid);
      if (parts[0] == 'one' && (countFlags != 1 || totalFlags != 1) ||
          parts[0] == 'two' && (countFlags != 2 || totalFlags != 2) ||
          parts[0] == 'any' && countFlags == 0 ||
          parts[0] == 'no' && countFlags > 0 ||
          parts[0] == 'all' && (countFlags != totalFlags || countFlags == 0) ||
          parts[0] == 'exists' && countFlags == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Adjusts the given column index for any columns that might be hidden before it
   * @param grid
   * @param columnIndex
   * @returns {*}
   */
  function adjustIndexForHiddenColumns(grid, columnIndex) {
    // Get the column by index from the list of all columns
    var columnManager = grid.getColumnManager(),
        column = columnManager.getHeaderAtIndex(columnIndex);
    if (!column) {
      // No column found, assume the index is out of range and pick the first or last
      if (columnIndex >= columnManager.getColumns().length) {
        column = columnManager.getLast();
      } else if (columnIndex < 0) {
        column = columnManager.getFirst();
      } else {
        // Worst case scenario we just live with the index they gave us since it is in range but the column info is null
        return columnIndex;
      }
    }
    // return the index of the column that is contained within the list of visible columns
    return grid.getVisibleColumnManager().getHeaderIndex(column);
  }

  /**
   * Returns the editor configuration for the specific cell in the grid, given it's row and column indexes.
   * We use the processGridEditor() helper method to find and return it.
   * @param grid
   * @param rowIndex
   * @param columnIndex
   * @returns {*}
   */
  function getEditorConfigForRowColumnInGrid(grid, rowIndex, columnIndex) {
    var editorCfg = null;
    gw.GridUtil.processGridEditor(grid.getStore(), rowIndex, columnIndex, function (editorByRow) {
      if (editorByRow[0]) {
        editorCfg = editorByRow[0];
        return false;
      }
    });
    return editorCfg;
  }

  /**
   * Returns the column index from the eventOrPosition object.  First check container for a 'column' and use it's
   * 'fullColumnIndex', otherwise look for 'colIdx', and finally default to the 'columnIndex'.
   * @param eventOrPosition
   * @returns {*}
   */
  function getColumnIndex(eventOrPosition) {
    if (eventOrPosition.column) {
      // If we have a column, then it's fullColumnIndex is the most accurate piece of information so use it
      return eventOrPosition.column.fullColumnIndex;
    }
    // Position information and some events store the column index in colIdx.  Worst case, columnIndex is sometimes
    // available on the event.
    return eventOrPosition.colIdx !== undefined ? eventOrPosition.colIdx : eventOrPosition.columnIndex;
  }

  return {
    singleton: true,
    requires: ['Ext.ComponentManager', 'Ext.Array', 'Ext.data.Model', 'gw.app'],

    /**
     * Based on cellConfig, returns true if the cell config points to a format cell
     * @param cellConfig
     * @returns {boolean}
     */
    isFormatCell: function(cellConfig) {
      return (cellConfig && cellConfig.xtype === 'gfieldset');
    },

    /**
     * Based on cellConfig, returns true if the cell config points to a link cell
     * @param cellConfig
     * @returns {boolean}
     */
    isLinkCell: function(cellConfig) {
      return (cellConfig && cellConfig.xtype === 'fieldcontainer' && cellConfig.defaultType === 'glink');
    },

    getGridById: function(gridId) {
      var grid = Ext.isString(gridId) ? Ext.ComponentManager.get(gridId) : gridId;

      // Check whether this is a valid grid component
      if (grid && (!grid.xtype || grid.xtype != "simplegrid")) {
        grid = null;
      }

      return grid;
    },

    /**
     * Marks the confirming state of the grid
     * @param grid
     * @param confirmed
     */
    confirmingFocusedCell: function (grid, confirmed) {
      if (grid.keepSelection) {
        if (gw.app._gridNavigation && gw.app._gridNavigation.gridId === grid.id) {
          gw.app._gridNavigation.confirming = !confirmed;
        }
      }
    },
    /**
     * Returns true if the grid is currently in confirmation mode for the focused cell
     * @param grid
     * @returns {boolean|*}
     */
    isConfirmingFocusedCell: function (grid) {
      if (grid.keepSelection) {
        if (gw.app._gridNavigation && gw.app._gridNavigation.gridId === grid.id) {
          return gw.app._gridNavigation.confirming;
        }
      }
    },
    /**
     * Record the cell navigation model position
     * @param grid
     * @param event
     * @param position
     */
    recordFocusedCell: function (grid, event, position, aboutToEdit) {
      if (grid.keepSelection) {
        event = event || {}; // Use an empty object if event is not specified so that it will fallback to position
        position = position || {colIdx: 0, rowIdx: 0}; // Default to (0,0) for unspecified position
        var oldNav = gw.app._gridNavigation,
            editingPlugin = grid.view.editingPlugin,
            editing = editingPlugin ? editingPlugin.editing : false,
            columnIndex = getColumnIndex(event) || getColumnIndex(position),
            record = event.record || position.record,
            row = event.recordIndex || position.rowIdx;
        if (!editing && aboutToEdit && oldNav && grid.id === oldNav.gridId) {
          if (aboutToEdit.rowIdx === oldNav.recordIndex && getColumnIndex(aboutToEdit) === oldNav.columnIndex) {
            editing = true;
          }
        }
        gw.app._gridNavigation = {
          gridId: grid.id,
          columnIndex: columnIndex,
          recordId: record ? record.id : "",
          recordIndex: row,
          editing: editing,
          wasEditing: grid.view.wasEditing,
          actionMode: grid.getNavigationModel().actionMode
        };
        if (oldNav && grid.id === oldNav.gridId && oldNav.confirming) {
          // If we are in the middle of confirming, we want to restore the old nav
          // confirming, editing, wasEditing and actionMode states to the new one
          gw.app._gridNavigation.confirming = oldNav.confirming;
          gw.app._gridNavigation.editing = oldNav.editing;
          gw.app._gridNavigation.wasEditing = oldNav.wasEditing;
          gw.app._gridNavigation.actionMode = oldNav.actionMode;
        }
      }
    },

    /**
     * Try to restore the cell navigation model position
     * @param grid
     * @param oldNav
     */
    restoreLastFocusedCell: function (grid, oldNav) {
      if (!oldNav || (!grid.keepSelection || oldNav.confirming)) {
        // If we aren't keeping the selection OR we are confirming, skip
        return;
      }
      var nav = grid.getNavigationModel(),
          view = grid.view,
          store = grid.getStore(),
          length = store.count(),
          editing = false,
          rec,
          pos,
          columnIndex;

      if ((oldNav.gridId === grid.id) && length) {
        rec = oldNav.recordId ? store.getById(oldNav.recordId) : null; // is this record still available?

        // refocus same record, if the record is not found focus position that is at the same location of previous
        // record. If that value is out of store bounds, focus on the last one
        if (rec) {
          pos = store.indexOf(rec);
        } else {
          pos = oldNav.recordIndex < length ? oldNav.recordIndex : length - 1;
        }
        // Adjust the column index based on the any hidden columns
        columnIndex = adjustIndexForHiddenColumns(grid, oldNav.columnIndex);

        oldNav.recordIndex = pos;
        grid.view._isRestoringFocus = true;
        nav.setPosition(pos, columnIndex, null, true);
        delete grid.view._isRestoringFocus;
        view.wasEditing = oldNav.wasEditing;
        if (oldNav.editing) {
          pos = nav.getPosition();
          if (pos && pos.column && pos.column.getEditor(pos.record)) {
            editing = view.editingPlugin.startEditByPosition(pos);
          }
          // record the newly restored editing and wasEditing states
          oldNav.editing = editing;
          oldNav.wasEditing = !editing;
          // Also, set actionMode as well.  If editing failed, then it will activate action mode below if needed
          oldNav.actionMode = !editing;
        }
        if (oldNav.actionMode) {
          // Record whether actionMode actually initiated.
          oldNav.actionMode = nav.initiateSpecialActionMode();
          // Store this as the new value
          gw.app._gridNavigation = oldNav;
        }
      }
    },

    /**
     * Get the column id for the matching cell id. This assumes that the cell data in the record explicitly
     * declares a cell id with gwCellId. The column id is the grid's canonical column identifier c0|c1...cn
     * @param {Ext.data.Model} record the grid's row record
     * @param {String} cellId
     * @return {String} the column id or null if none
     */
    getColumnIdForCellId: function(record, cellId) {
      var data = record.data;
      if (data) {
        for (var columnId in data) {
          if (data.hasOwnProperty(columnId)) {
            var cellData = data[columnId];
            if (cellData && cellData.gwCellId && cellData.gwCellId === cellId) {
              return columnId;
            }
          }
        }
      }

      return null;
    },

    /**
     * Returns the value of the Cell that comes from a template widget.
     */
    getTemplateCell:function (value) {
      if (value && value.xtype == 'templatevaluepanel') {
        return value
      }
      return undefined
    },

    getFQRowOffset: function(fqRowOffsetRepr) {
      var cm = fqRowOffsetRepr.split('#');
      var offsetAndIndex = {};
      offsetAndIndex.offset = cm[0]; // Identifies the column map entry for the matching column configuration for the given row
      offsetAndIndex.index = (cm[1] ? Number(cm[1]) : 0); // Identifies the cell column config entry for the row
      return offsetAndIndex;
    },

    getFQRowOffsetFromRow: function(row) {
      var fqRowOffsetRepr = gw.GridUtil.getFQRowOffsetReprFromRow(row);
      return gw.GridUtil.getFQRowOffset(fqRowOffsetRepr);
    },

    getFQRowOffsetReprFromRow: function(row) {
      return row.get(gw.SimpleGrid.ROW_OFFSET);
    },

    getModeInsensitiveRowOffset : function (rOffset) {
      return rOffset ? rOffset.replace(/\([^\(]+\)/g, '') : rOffset
    },

    /**
     *
     * @param {gw.simplegrid} grid the grid component
     * @param {String} rowOffset The row offset declaration (relative row iteration declaration with iterated indices)
     * @return {Integer} the row index or -1 if none
     */
    getRowIdxForRowOffset:function (grid, rowOffset) {
      return grid.store.findBy(function (record) {
        var fqRowOffsetRepr = gw.GridUtil.getFQRowOffsetReprFromRow(record);
        var fqRowOffset = gw.GridUtil.getFQRowOffset(fqRowOffsetRepr);
        if (gw.GridUtil.getModeInsensitiveRowOffset(fqRowOffset.offset) === rowOffset) {
          return true;
        }
      });
    },

    getFullIdForCell:function (store, record, fieldName) {
      if (store.type == 'tree') {
        // fix the Id to be posted to server for RowTree checkbox
        if (fieldName === 'checked' && record.fieldsMap[fieldName].mapping === '_Checkbox') {
          fieldName = '_Checkbox';
        }
        return [store.storeId, record.id, fieldName].join(':');
      }

      var offsetAndIndex = gw.GridUtil.getFQRowOffset(record.get(gw.SimpleGrid.ROW_OFFSET));
      var rOffset = offsetAndIndex.offset;

      // @SenchaUpgrade Call base get method to get the entire object so we can retrieve cell id's for boolean types
      var value = Ext.data.Model.prototype.get.call(record, fieldName);

      var templateCell = gw.GridUtil.getTemplateCell(value);
      if (templateCell) {
        return templateCell.items[0].id
      }

      var rowId = gw.GridUtil.getModeInsensitiveRowOffset(rOffset);
      if (rowId == null) {
        rowId = store.indexOf(record)
      }

      var colName = fieldName;
      var serverId = store.storeId;

      var grid = Ext.ComponentManager.get(store.storeId);

      // The serverId is the base id for the fully qualified cell id.
      // The storeId for an LV is typically the component id that is not part of the fully qualified cell id
      // in particular if the LV  does not have an explicit id defined.
      if (grid && grid.gwBaseId) {
        serverId = grid.gwBaseId;
      }

      // The relative cell id is given explicitly by the cell id configuration
      if (value && value.gwCellId) {
        colName = value.gwCellId;
      }

      return (rowId ? [serverId, rowId, colName] : [serverId, colName]).join(':');
    },

    getFirstInputInTemplateCell:function (value) {
      var templateCell = gw.GridUtil.getTemplateCell(value);
      if (templateCell) {
        var items = templateCell.items;
        if (items && items.length == 1) {
          return items[0];
        }
      }

      return null;
    },

    /**
     * Evaluate the new record model value based on the existing value.
     * If the new value is a simple type and the existing value is an object type, then
     * the updated value will keep the existing object value meta properties like id.
     * If the new value is an object type, then they take precedence over the old ones.
     * @param record the record to base the new update value on. The record will not be modified.
     * @param fieldName the record field name (cell value)
     * @param newValue the new value to evaluate. This object will not be modified.
     * @param newValueProps object with key/value pairs to add to the final object or null if nothing to add
     * @param keepValuePropsOnly optional: if indicated as array of property strings, keep old value properties only.
     * If not indicated, all old value properties are kept
     * @param removeValueProps optional: if indicated, remove the given value properties from the old value object
     * @return the new value as a record object or simple value based on the existing record value
     */
    getRecordUpdateValue: function (record, fieldName, newValue, newValueProps, keepValuePropsOnly, removeValueProps) {
      // Leave the original newValue object the same
      var updateValue = Ext.isObject(newValue) ? Ext.apply({}, newValue) : newValue;

      // If the old value is an object, merge the new value object properties in.
      var oldValue = record.get(fieldName);
      if (Ext.isObject(oldValue) && (oldValue.hasOwnProperty("value") || oldValue.hasOwnProperty("text"))) {
        // Convert new value to object value if it is a simple value
        if (!Ext.isObject(updateValue)) {
          updateValue = {};
          updateValue.value = newValue;
          updateValue.text = newValue;
        }

        if (keepValuePropsOnly && Ext.isArray(keepValuePropsOnly)) {
          Ext.copyTo(updateValue, oldValue, keepValuePropsOnly);

        } else {
          // Remove specific properties from the old value object
          if (Ext.isArray(removeValueProps) && Ext.isObject(updateValue)) {
            var updatedOldValue = Ext.apply({}, oldValue);
            Ext.Array.forEach(removeValueProps, function (removeValueProp) {
              delete updatedOldValue[removeValueProp];
            });
            oldValue = updatedOldValue;
          }

          // Copy only value properties that are not declared in the new value yet.
          updateValue = Ext.applyIf(updateValue, oldValue);
        }
      }

      // Mix in new properties
      if (newValueProps && Ext.isObject(newValueProps)) {
        if (!Ext.isObject(updateValue)) {
          updateValue = {value:updateValue};
        }
        Ext.apply(updateValue, newValueProps);
      }

      return updateValue;
    },

    getTextForRadioGroupCell: function(editor, value) {
      var text;
      var items = editor instanceof Ext.form.Field ? editor.initialConfig.items : editor.items;
      Ext.each(items, function(i) {
        if (i.inputValue == value) {
          text = i.boxLabel;
          return false
        }
      });
      return text
    },

    /**
     * Update button state based on checked items
     * @param {String[]} flagged an array of button IDs
     * @param {Ext.data.Model[]} checkedItems an array of checked items
     * @param {Ext.grid.Panel} grid the grid
     */
    updateFlaggedButtons: function(flagged, checkedItems, grid) {
      Ext.each(flagged, function(btnId) {
        var btn = Ext.ComponentManager.get(btnId);
        if (btn && !btn.initialConfig.disabled) {
          var buttonFlags = btn.buttonFlags;
          var enabled;
          if (buttonFlags) {
            enabled = evalCheckboxFlags(checkedItems, buttonFlags, grid);
          } else {
            enabled = checkedItems.length > 0;
          }
          if (enabled) {
            btn.enable();
          } else {
            btn.disable();
          }
        }
      })
    },

    /**
     * Addes filters to bottom toolbar for the panel
     */
    addFiltersToPanel: function (panel, filters) {
      if (!panel.tbar) {
        panel.tbar = {xtype:'gtoolbar'}
      }
      panel.tbar.items = filters.concat(['-']).concat(panel.tbar.items || []);
    },

    /*
     * This method executes the callback method against each row after finding the appropriate editor
     * for the column passed in.
     */
    processGridEditor: function(store, fqRowOffsetRepr, column, callback, inclEmptyEditor, scope) {
      // e.g.: summary row
      if (fqRowOffsetRepr === -1) {
        return false;
      }

      if (store && store.getProxy() && store.getProxy().getReader() && store.getProxy().getReader().rawData) {
       /*
        Editor information is sent back to us in the JSON.  The grid supports the ability
        to define a different editor for every cell.  However, to save bandwidth, rather than
        send editor information for each cell, we send the editor info with the references
        for which that editor should be used for.
       */
        var editorInfo = store.getProxy().getReader().rawData.editors;
        //@UpgradedSencha 5.1 Add check for column existance
        if (editorInfo && column) {
          var editorInfoArray = editorInfo[column.mapping || column.dataIndex];
          if (editorInfoArray) { // if the column has dynamic editors
            if (Ext.isNumeric(fqRowOffsetRepr)) {
              fqRowOffsetRepr = gw.GridUtil.getFQRowOffsetReprFromRow(store.getAt(parseInt(fqRowOffsetRepr)));
            }
           /*
            For a given column, go through the array of editors that are used in that column
            and apply the callback function using the applicable editor.
            */
            Ext.each(editorInfoArray, function(editorByRow) {
              var storeAndXType = editorByRow[0];
              var offsetArray = editorByRow[1];
              if (Ext.Array.indexOf(offsetArray, fqRowOffsetRepr) >= 0) {
                if (inclEmptyEditor || storeAndXType) {
                  callback.apply(scope || this, [editorByRow, editorInfoArray])
                }
                //TODO: when an iteration contains multiple row configs, all of them have the same rowOffset?
                return false; // break out of the loop
              }
            })
          }
        }
      }
    },

    processCellClickViaMouse: function (gridView, td, cellIndex, record, tr, rowIndex, evt) {
      // Mouse clicks return the absolute cellIndex that includes hidden columns, so adjust for any
      // before processing the cell action.
      cellIndex = adjustIndexForHiddenColumns(gridView.ownerGrid, cellIndex);
      return this.processCellAction(gridView, td, cellIndex, record, tr, rowIndex, evt);
    },

    processCellAction: function (gridView, td, cellIndex, record, tr, rowIndex, evt) {
      // First attempt to get the header column directly from the view (needed to get radiogroups working), and if that
      // doesn't work, then get it from the view's headerCt like it used to do all the time prior to ExtJs 5.1 upgrade.
      var column = gridView.getHeaderAtIndex(cellIndex) || gridView.headerCt.getHeaderAtIndex(cellIndex),
          fieldName = column.dataIndex,
          t = evt.getTarget(),
          gridPanel = gridView.ownerGrid,
          editorCfg;

      // cell checkbox:
      if (fieldName != '_Checkbox' && t.className.indexOf(gw.app.ROW_CHECK_COLUMN_CLASS) != -1) {
        evt.stopEvent();
        gridPanel.suspendLayouts();
        this.processCheckBoxCellAction(gridPanel, record, column, rowIndex);
        gridPanel.resumeLayouts();

        // update flagged buttons:
        var bCellLevelCB = gridView.panel._updateFlaggedButtonsForRecord(record);
        if (!bCellLevelCB) {
          // this checkbox is associated with the containing gridView:
          gridView.panel.updateFlagged();
        }

      } else if (t.type == 'button') {
        //evt.stopEvent();

        // TODO tpollinger: Card 372: The whole of the radio group needs to be refactored and consolidated with
        // gw.GridUtil.processRadioCellClick. That latter utility does some of the unchecking of grouped
        // radio controls too (although they are not cell radio groups), but it would be good to unify this a bit.
        // Refactor: Create a Radio Group, Checkbox Group, Radio column, checkbox column class and delegate
        // rendering and click processing from ExtGrid to these classes.
        // Refactor: Normalize server JSON response to one type for a given radio/checkbox group control
        var radioGroup = record.get(fieldName);
        if (radioGroup && radioGroup.xtype != 'radiogroup') {
          // Is there a DV input group with a radio group?
          radioGroup = gw.GridUtil.getFirstInputInTemplateCell(radioGroup);
          if (radioGroup && radioGroup.xtype != 'radiogroup') {
            radioGroup = null;
          }
        }

        // Handle a radio group cell: Get the currently selected radio (for instance ask for change confirmation),
        // handle the change and update the store.
        if (radioGroup) {
          // Use the editorCfg to figure out if there is a POC or confirmation, otherwise use the radioGroup
          editorCfg = getEditorConfigForRowColumnInGrid(gridPanel, rowIndex, column) || radioGroup;
          var processRadioClick = function (column, grid, record, rowIndex, columnId, oldValue, value, clickCallback) {
            if (!grid.radioField) {
              grid.radioField = new Ext.form.field.Base();
            }
            grid.radioField.column = column; // Remember the column so that we can restore the focused cell
            grid.radioField.eventParam = gw.GridUtil.getFullIdForCell(grid.getStore(), record, columnId);
            grid.radioField.completeEdit = clickCallback;
            Ext.apply(grid.radioField, {postOnChange: editorCfg.postOnChange, confirm: editorCfg.confirm});
            grid.suspendLayouts();
            gw.app.handleChange(grid.radioField, value, oldValue, clickCallback);
            grid.resumeLayouts(false);
          };

          var oldValue = record.get(fieldName);
          var value = t.attributes.inputValue.value;

          processRadioClick(column, gridView.panel, record, rowIndex, fieldName, oldValue, value, function () {
            for (var i = 0; i < radioGroup.items.length; i++) {
              radioGroup.items[i].checked = (radioGroup.items[i].inputValue == value);
            }
            record.set(fieldName, value);
          });

        } else {
          column = gridPanel.getColumnById(fieldName);

          // Handle the change event for this radio input field. Don't handle if this is a radio column configuration
          if (column.xtype != 'radiocolumn') {
            gw.GridUtil.processRadioCellClick(true, column, gridPanel, record, rowIndex, fieldName);
          }
        }

      } else {
        // The column editor is set here as otherwise "beforeedit" is not being called. startEdit
        // checks whether a column editor is set and will terminate if none is available.
        if (column.getEditor && !column.getEditor()) {
          var grid = gridView.panel;
          editorCfg = getEditorConfigForRowColumnInGrid(grid, rowIndex, column);
          // Editor configurations may be declared in an inputDV
          if (!editorCfg) {
            var fieldValue = grid.getStore().getAt(rowIndex).get(column.dataIndex);
            editorCfg = gw.GridUtil.getFirstInputInTemplateCell(fieldValue);
          }
          if (editorCfg) {
            grid.setEditorCfg(editorCfg, rowIndex, column.dataIndex);
          }
        }

        // links are treated like buttons
        var cellButton = gw.GridUtil.getClickedCellButton(evt);

        // dynamic menu in cell
        var cellMenu = gw.GridUtil.getClickedCellMenu(evt);

        if (cellButton || cellMenu) {
          // tpollinger: stopEvent does not hinder an event propagation to activate a combo box next to
          // a menu opener. Added evt.suspendEvents(false) below.
          // Reproduction steps:
          // Start PX | Administration | Under Organization Tree, select: Org Tree > Default Org > Western Auto Group >
          //    Auto - Level1 > Auto - TeamA > Edit > Click on the menu opener next to Betty Baker for instance. Notice
          //    that both the menu opens and the combo box is set in edit mode. The Ext JS handleEvents still keeps
          //    the second listener for the beforeedit Ext Grid method, event though stopEvent below has been called.
          // tpollinger: Not adding the stop event will fail the following:
          // Start PX | Editable LV | Click the toggle date button in the cell.
          // Notice that when removing stop event, two toggle events are sent to the server cancelling the first toggle.
          evt.stopEvent();

          // look up config from the record:
          var cellConfig = record.get(fieldName);

          // look up the child item, if any
          // Menu button
          if (cellMenu) {
            record.menus[cellMenu.getAttribute('id')].showMenu();
          } else {
            var itemIndex = cellButton.getAttribute('itemIndex');
            if (itemIndex) {
              var nestedIndices = itemIndex.split(':');

              if (nestedIndices.length > 1) {
                for (var i = 0; i < nestedIndices.length; i++) {
                  itemIndex = nestedIndices[i];
                  cellConfig = cellConfig.items[itemIndex];
                }
              } else {
                if (cellConfig.xtype === 'templatevaluepanel' || gw.GridUtil.isFormatCell(cellConfig)) {
                  //FormatCell render items
                  cellConfig = record.get(fieldName).items;
                } else if (gw.GridUtil.isLinkCell(cellConfig)) {
                  // Link cell's links are stored as an array inside a fieldcontainer
                  cellConfig = cellConfig.items[itemIndex];
                } else {
                  // Defensive code: leave the existing catchall.  It seems like 'cellConfig.item' should
                  // actually be 'cellConfig.items'.
                  cellConfig = (Ext.isArray(cellConfig) ? cellConfig : cellConfig.item)[itemIndex];
                }
              }
            }
            gw.app.handleCompAction(cellConfig || {}, evt, cellButton);
          }

          // tpollinger: stopEvent: see comment above under stopEvent
          // Call suspendEvents only if it is defined. Seems some events (browser click) don't have this defined
          if (evt.suspendEvents) {
            evt.suspendEvents(false);
          } else {
            // @SenchaUpgrade: One particular test with combobox and menu in a cell would activate the combobox
            // when trying to open the menu. See test: withTest("gw.smoketest.px.webb.TemplateWidgetTest", "testTemplateWidgetInLVCell")
            // Forcing further event processing to end.
            return false;
          }
        }
      }
    },

    processCheckBoxCellAction: function(grid, record, column, rowIndex) {
      var fieldName = column.dataIndex;
      var val = record.get(fieldName);
      var newData;
      if (Ext.isObject(val)) {
        //val is an object when the cell has a value AND a checkbox
        if (val.cb !== undefined) {
          newData = {};
          Ext.apply(newData, record.get(fieldName));
          newData.cb = !val.cb;
        }
      } else {
        newData = !val;
      }

      // set the correct editor before processCellClick if this is a mixed grid column configuration
      var checkBoxEditorCfg = getEditorConfigForRowColumnInGrid(grid, rowIndex, column);
      if (checkBoxEditorCfg) {
        column.setEditor(checkBoxEditorCfg);
      }

      gw.GridUtil.processCellClick(column, grid, record, rowIndex, fieldName,
          function () {
            record.set(fieldName, newData);
          }
      );
    },

    processCellClick:function (column, grid, record, rowIndex, columnId, clickCallback) {
      var field = {};
      var editor;
      if (column.getEditor) {
        editor = column.getEditor();
      }
      Ext.apply(field, editor);
      field.eventParam = gw.GridUtil.getFullIdForCell(grid.getStore(), record, columnId);
      field.completeEdit = clickCallback;
      gw.app.handleChange(field);
    },

    processRadioCellClick: function(radioCheckStatus, column, grid, record, rowIndex, columnId) {
      // Check that this field is a radio input. Do not update if this is not a radio input field
      var store = grid.getStore(),
          editorCfg = getEditorConfigForRowColumnInGrid(grid, rowIndex, column),
          radioGroup;

      if (editorCfg && editorCfg.xtype == 'radio') {
        radioGroup = editorCfg.group;
        var oldValue = record.get(columnId);
        if (oldValue != radioCheckStatus) {
          // Update the record for the radio input field and handle the change event
          record.set(columnId, radioCheckStatus);

          if (radioCheckStatus) {
            // A radio input field does not have an editor. Handle the change event
            // The change event only needs to tell which radio input is now checked in the same radio group
            var radioField = {};
            Ext.apply(radioField, {postOnChange: editorCfg.postOnChange}, null);
            radioField.eventParam = gw.GridUtil.getFullIdForCell(store, record, columnId);
            var extraParams = {};
            if (radioCheckStatus && radioGroup) {
              // Add the check box id for the group for which the radio input has been checked
              extraParams[radioGroup] = radioField.eventParam;
              store.extraValues = store.extraValues || {};
              store.extraValues[radioGroup] = radioField.eventParam;
            }
            gw.app.handleChange(radioField, radioCheckStatus, oldValue, null, extraParams);

            // Update all radio input fields for the same group in the same column if this column has been checked.
            var len = store.getCount();
            for (var i = 0; i < len; i++) {
              if (i != rowIndex) {
                var groupRecord = store.getAt(i);
                // Uncheck radio input fields in the same group
                gw.GridUtil.processRadioCellClick(false, column, grid, groupRecord, i, columnId);
              }
            }
          }
        }
      }
    },

    getClickedCellButton: function (evt) {
      return evt.getTarget('.' + gw.app.getEventSourceCls(), 4, true);
    },

    getClickedCellMenu: function (evt) {
      return evt.getTarget('.' + gw.app.GRID_CELL_MENU_CLASS, 4, true);
    },

    /**
     * Commits Grid cell editor to the model, without dismissing the editor (otherwise it may break tabbing and focus behavior).
     * @SenchaUpgrade: mimic private method of ExtJs.
     * @param ed: if specified, only commit the editor that matches this one
     */
    commitGridEditorValue: function(ed) {
      var grid;

      // PL-29858 Need to suspend layout while setting the record, resumes after record is set
      if (ed) {
        grid = ed.grid;
        grid.suspendLayouts();
      }

      Ext.ComponentManager.each(function(id, comp) {
        if (comp instanceof gw.SimpleGrid) {
          var cellEditingPlugin = comp.getCellEditingPlugin();
          var activeEd = cellEditingPlugin.getActiveEditor();
          if (activeEd) {
            if (!ed || ed === activeEd ) {

              var context = cellEditingPlugin.context;
              var record = context.record;
              var value = activeEd.getValue();
              context.value = value;
              if (!cellEditingPlugin.validateEdit()) {
                return false;
              }

              // Only update the record if the new value is different than the
              // startValue. When the view refreshes its el will gain focus
              if (!record.isEqual(value, activeEd.startValue)) {
                var activeColumn = cellEditingPlugin.getActiveColumn();
                record.set(activeColumn.dataIndex, value);
                activeEd.startValue = value;
              }
            }
            return false;
          }
        }
      });

      if (grid) {
        grid.resumeLayouts();
      }
    },

    hasEditor: function (editorType) {
      return !(editorType == 'radiogroup' ||
          editorType == 'checkbox' ||
          editorType == 'radio');
    },

    /**
     * Format the summary data and apply style classes if given
     * @param {Object} summaryData summary data
     * @param {String} summaryData.id optional summary data id, mandatory if cls given
     * @param {String} summaryData.text summary data text
     * @param {String} summaryData.cls optional summary data style classes
     * @private
     */
    formatSummaryData: function (summaryData) {
      var summaryText = null;
      if (Ext.isString(summaryData.cls)) {
        summaryText = '<A class="' + summaryData.cls + '" id="' + summaryData.id + '">' + summaryData.text + '</A>';
      } else {
        summaryText = summaryData.text;
      }
      return summaryText;
    },
    /**
     * Given a cell in a grid, will return the menu element if it exists
     * @param cell
     * @returns {*}
     */
    menuForCellInGrid: function(cell) {
      return Ext.fly(cell).query('[class=' + gw.app.GRID_CELL_MENU_CLASS + ']')[0];
    },
    //@UpgradedSencha 5.1 Some refactoring now enables showing menu to be straightforward.
    processMenuViaKey: function (record, cellMenu) {
      if (record && cellMenu) {
        record.menus[cellMenu.getAttribute('id')].showMenu();
      }
    },
    /**
     * Returns the header for the visible column at the given column index
     * @param view
     * @param columnIndex
     * @returns {*}
     */
    headerForVisibleColumnAtIndex: function(view, columnIndex) {
      if (view && view.headerCt) {
        // There might be invisible columns in the grid, so get the visible columns
        // and compute the index of the visible column at the given column index, then find the
        // header using that index
        var column = view.headerCt.getVisibleGridColumns()[columnIndex];
        if (column) {
          var visibleIndex = view.headerCt.getHeaderIndex(column);
          return view.headerCt.getHeaderAtIndex(visibleIndex);
        }
      }
      return null;
    },
    /**
     * Given a column or column index, determines what the index of that column is in the list
     * of visible columns.  Returns the mapped index or -1 if that column is not in the list
     * @param view
     * @param column
     * @returns {number}
     */
    indexOfColumnInVisibleColumnList: function(view, column) {
      if (view && view.headerCt) {
        // There might be invisible columns in the middle of the grid.  Since these invisible columns
        // will never be generated into the dom, we get the columns and find the index of the current
        // column within the list of visible columns
        var visibleColumns = view.headerCt.getVisibleGridColumns();
        if (typeof(column) === 'number') {
          column = view.headerCt.getGridColumns()[column];
        }
        return visibleColumns.indexOf(column);
      }
      return null;
    },

    /**
     * This function is checking if the cell is in this temporary state when show edit is called but starEdit is not been
     * invoke yet. It is used to workaround an IE issue when startEdit is deferred in showEdit.
     *
     * @param cellFullId
     * @param store
     * @returns {boolean}
     */
    isCellInTemporaryEditingState: function(cellFullId, store) {
      var editPlugin = Ext.ComponentManager.get(store.storeId).editingPlugin;
      var activeEditor =  editPlugin ? editPlugin.activeEditor : null;
      if (activeEditor && !activeEditor.editing && activeEditor.field) {
        // full cell id is stored as eventParam in field during processCellClick
        if (cellFullId == activeEditor.field.eventParam) {
          return true;
        }
      }
      return false;
    },

    getColumnById: function (grid, dataIndex) {
      var cols = grid.view.headerCt.getGridColumns();
      for (var i = 0; i < cols.length; i++) {
        // @UpgradedSencha 5.1 - look for mapping first
        if (dataIndex === cols[i].mapping || dataIndex === cols[i].dataIndex) {
          return cols[i];
        }
      }
    },

    /*
     * This function tries to find the matching column by cell id. It is currently used in CmdProc during the time
     * when grid Model is not fully constructed so we search the data from grid.data.root.
     * It first searches from the grid columns definition. If it cannot find the match in grid columns then it will
     * search from the data; this is for the mix column editors use case.
     *
     * @param grid
     * @param targetRow
     * @param cellId
     * @returns the position of the column
     */
    getColumnPosition: function (grid, targetRow, cellId) {
      var columns = grid.getVisibleColumnManager().getColumns(),
          found = false,
          columnPos = 0, i;
      // try to find the columnPosition from the columns definition first.
      if (columns) {
        var lens = columns.length;
        for (i = 0; i < lens; i++) {
          var column = columns[i];
          if (!column.hidden && cellId == column.dataIndex) {
            columnPos = i;
            found = true;
            break;
          }
        }
      }
      // if columnPosition is not found, try finding it in the data.
      if (!found) {
        var rows = grid.data.root;
        if (rows && targetRow < rows.length) {
          var rowData = rows[targetRow];
          for (var columnCell in rowData) {
            if (rowData.hasOwnProperty(columnCell)) {
              var cellData = rowData[columnCell];
              if (cellData && cellData.gwCellId && cellData.gwCellId === cellId) {
                // if we find the matching column, make sure the columnCell id is in the pattern of c0, c1.. etc
                if (/c\d+$/.test(columnCell)) {
                  // get the column number from columnCell
                  columnPos = parseInt(columnCell.substr(1), 10);
                }
              }
            }
          }
        }
      }
      return columnPos;
    }

  };

});
