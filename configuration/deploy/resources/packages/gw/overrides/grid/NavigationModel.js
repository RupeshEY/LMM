Ext.define('gw.override.grid.NavigationModel', {
    override: 'Ext.grid.NavigationModel',
    // As per WAI-ARIA requirements, a grid should support two modes: Navigable (default),
    // and Actionable. In Navigable mode, pressing Tab key inside the grid should move focus
    // to the next tabbable element outside the grid. In Actionable mode, pressing Tab key
    // should move focus to the next tabbable/actionable element within the grid, wrapping over
    // row end to the next row, and over last row end to the first row.
    // See http://www.w3.org/TR/2013/WD-wai-aria-practices-20130307/#grid
    // In this method we implement the first (Navigable) part, which is shared between
    // Grids and Views.

    //GW has it's own requirements that does not directly follow WAI-ARIA.

    /**
     * enableTabKeyNavigation {Boolean} Enable Navigation between the cells using TAB key
     * This property must be set to false on ARIA theme to disable GW specific tweaks
     */
    enableTabKeyNavigation : true,

    /**
     * actionMode {Boolean} private Toggles between navigation between cells and their tabbable content
     */
    actionMode : false,

    lastFocusedChildIdx: null,

    childOutlineCls: 'gw-child-outline',

    parentOutlineCls: 'gw-parent-outline',

    cellCache: {}, // hold important parts

    initKeyNav: function(view) {
        var me = this;

        me.position = new Ext.grid.CellContext(view);

        // Drive the KeyNav off the View's itemkeydown event so that beforeitemkeydown listeners may veto.
        // By default KeyNav uses defaultEventAction: 'stopEvent', and this is required for movement keys
        // which by default affect scrolling.
        me.keyNav = new Ext.util.KeyNav({
            target: view,
            ignoreInputFields: true,
            eventName: 'itemkeydown',
            defaultEventAction: 'stopPropagation', // changed

            // Every key event is tagged with the source view, so the NavigationModel is independent.
            processEvent: function(view, record, row, recordIndex, event) {
                return event;
            },
            esc:  me.onEscapeKey,   //Add Esc key to the mix
            up: me.onKeyUp,
            down: me.onKeyDown,
            right: me.onKeyRight,
            left: me.onKeyLeft,
            pageDown: me.onKeyPageDown,
            pageUp: me.onKeyPageUp,
            home: me.onKeyHome,
            end: me.onKeyEnd,
            tab: me.onKeyTab,
            space: me.onKeySpace,
            enter: me.onKeyEnter,
            A: {
                ctrl: true,
                // Need a separate function because we don't want the key
                // events passed on to selectAll (causes event suppression).
                handler: me.onSelectAllKeyPress
            },
            scope: me
        });

        me.on('navigate', function(event, eOpts){
            var position = event.position || {};
            me.clearActionOutline(me.cellCache.cell || event.previousItem);

            if (me.lastChildNode){
                me.lastChildNode.style.outline = '';
            }

            me.actionMode = false;
            me.cellCache = {};

            //to restore position after grid is rerendered, e.g. click Edit -> navigate away-> save/cancel->return-> restore position
            //GW specific
            gw.GridUtil.recordFocusedCell(me.view.ownerGrid, event, position);
        });
    },

    clearAndSetPosition: function (recordIndex, columnIndex) {
        var me = this,
            // If we are given this navigation model's position as the record index, clone it to remember the info.
            // Without the clone, the clearing of the position has the side effect of emptying the me.position of the
            // information that is needed to restore the position.
            position = recordIndex.isCellContext && me.position === recordIndex ? recordIndex.clone() : null;
        // clear the old position before setting the new one, passing in null, null sets clearing to true.
        me.setPosition(null, null);
        me.setPosition(position || recordIndex, columnIndex);
        // we want to record this new position
        gw.GridUtil.recordFocusedCell(me.view.ownerGrid, {}, me.getPosition());
    },

    onKeyLeft: function(keyEvent){
        if(this.actionMode){
            //GW specific code
            this.focusChild(-1);
        }else{
            this.callOverridden(arguments);
        }
    },

    onKeyRight: function(keyEvent){
        if(this.actionMode){
            //GW specific code
            this.focusChild(1);
        }else{
            this.callOverridden(arguments);
        }
    },

    onKeyUp: function(keyEvent){
        var me = this,
            newPosition;

        if(!this.actionMode){
          if(me.enableTabKeyNavigation){

            newPosition = me.move('up', keyEvent);

            if (newPosition) {
              me.setPosition(newPosition, null, keyEvent);
              keyEvent.stopEvent();
            }else{
              me.view.toggleChildrenTabbability(false);
            }
          }else{
            me.callOverridden(arguments);
          }
        }
    },

    onKeyEnd: function(keyEvent){
        if(!this.actionMode){
            this.callOverridden(arguments);
        }
    },

    onKeyHome: function(keyEvent){
        if(!this.actionMode){
            this.callOverridden(arguments);
        }
    },

    onKeyPageDown: function(keyEvent){
        if(!this.actionMode){
            this.callOverridden(arguments);
        }
    },

    onKeyPageUp: function(keyEvent){
        if(!this.actionMode){
            this.callOverridden(arguments);
        }
    },

    onKeyTab: function(keyEvent) {
        var me = this;
        // GW override.
        // Ctrl + Tab toggles between browser tabs -> not an option
        // Alt + Tab toggles between open applications

        // handle left /right navigation with tab
        if(me.enableTabKeyNavigation){
          return me._handleTabKeyNavigation(keyEvent);
        }

        // To prevent Tab key from moving focus to the next element inside the grid
        // in Navigable mode, we make all elements untabbable so the focus flows out
        // following the natural tab order.
        me.view.toggleChildrenTabbability(false);

        return true;
    },

    //@UpgradedSencha 5.1 Add menu invoke on alt + down keys
    onKeyDown: function(keyEvent) {
        var me = this;

        if (me.actionMode) {
            return false;
        }

        if (keyEvent.altKey) {
            var menu = gw.GridUtil.menuForCellInGrid(me.cell);
            if (menu) {
                gw.GridUtil.processMenuViaKey(me.record, menu);
                return false; // Finished processing
            }
        } else {
            // If we are in the middle of an animated node expand, jump to next sibling.
            // The first child record is in a temp animation DIV and will be removed, so will blur.
            var newPosition = keyEvent.record.isExpandingOrCollapsing ? null : me.move('down', keyEvent);

            if (newPosition) {
              me.setPosition(newPosition, null, keyEvent);
              keyEvent.stopEvent();
            } else {
              me.view.toggleChildrenTabbability(false);
            }
        }
    },

    //Handle Enter key to step in to Cells that does not have editor defined
    onKeyEnter: function(keyEvent){
        var me = this;

        if(me.actionMode){
            if (me._processBoolRadioOrRadioRangeCell(keyEvent)) {
              me._processNativeOnClick(keyEvent);
              return true;
            }
            return false;
        }else{
            me.initiateSpecialActionMode();

            // Stop the keydown event so that an ENTER keyup does not get delivered to
            // any element which focus is transferred to in a click handler.
            keyEvent.stopEvent();

            // Do not refire the event to prevent cells from taking actions on the enter key PLWEB-4381
            // But we need to handle actionMode, therefore the onEnterKey handler is still needed.
            // keyEvent.view.fireEvent('itemclick', keyEvent.view, keyEvent.record, keyEvent.item, keyEvent.recordIndex, keyEvent);
        }
    },

    onKeySpace: function(keyEvent) {
        var me = this;

        if(me.actionMode){
            me.onChildAction(keyEvent);
        }

        me._processCheckboxOrSimpleRadioCell(keyEvent);
    },

    onEscapeKey: function(keyEvent){
        this._endActionMode();
    },

    _endActionMode: function() {
        var me = this;

        me.clearActionOutline();

        if (me.lastChildNode) {
            me.lastChildNode.style.outline = '';
        }

        me.setPosition(me.getLastFocused());
        me.actionMode = false;
        me.cellCache = {};
        me.view.wasEditing = false;
    },

    clearActionOutline: function(item){
        var me = this;
        item = item || me.item || me.previousItem;

        if (item) {
            var el = Ext.get(item).hasCls(me.parentOutlineCls) ? item :
                Ext.get(item).down('td.'+ me.parentOutlineCls); //cell || row ?

            if (el) {
                el.removeCls(me.parentOutlineCls);
            }
        }
    },

    onChildAction: function(keyEvent){
        var me = this,
            column = me.cellCache.column,
            record = me.cellCache.record,
            recordIndex = me.cellCache.recordIndex,
            columnIndex = me.cellCache.columnIndex;

        if(!record){
            return false;
        }

        var btnConfig = record.get(column.dataIndex),
            cellButton = me.lastChildNode,
            tagName = cellButton ? cellButton.tagName.toLowerCase() : null;

        if (btnConfig) { // GW specific item found
            var wasSpecialActionMode = me.actionMode;
            gw.GridUtil.processCellAction(me.view, me.cell, columnIndex, record, me.view.getNode(record), recordIndex, keyEvent);
            if (wasSpecialActionMode) {
              me.initiateSpecialActionMode(); // turn on action mode again if necessary.
            }
        } else { // implement regular DOM if needed here
            if (tagName === 'button') {

            }

            if (tagName === 'span' || tagName === 'a') {

            }

            if (tagName === 'input') {

            }
        }
        return true;
    },

    focusChild: function(direction, restart){ //1 right, -1 left, no value start on zero position

        var me = this,
            nodes = me._actionableNodesForCell(me.cellCache.cell),
            cellCfg = me.cellCache.record.get(me.cellCache.column.dataIndex),
            radioButtons,
            currentNode,
            idx,
            i;

        if(nodes.length){

            switch(direction){
                case 1:
                    idx = me.lastFocusedChildIdx < nodes.length - 1 ? ++me.lastFocusedChildIdx : 0;
                    break;
                case -1:
                    idx = me.lastFocusedChildIdx > 0 ? --me.lastFocusedChildIdx : nodes.length -1;
                    break;
                default:
                    // For radio group we focus on selected one

                    if (cellCfg.xtype === 'radiogroup') {
                        radioButtons = cellCfg.items;
                        idx = 0; // Focus on the first item if there is no selection
                        for (i = 0; i < radioButtons.length; i++) {
                            if (radioButtons[i].checked) {
                                idx = i;
                                break;
                            }
                        }
                    }else{
                        if(restart && me.lastFocusedChildIdx){
                            idx = me.lastFocusedChildIdx;
                        }else{
                            idx = 0;
                        }
                    }
            }

            if(me.lastChildNode){
                me.lastChildNode.classList.remove(me.childOutlineCls);
            }

            me.lastChildNode = currentNode = nodes[idx];

            currentNode.focus();
            currentNode.classList.add(me.childOutlineCls);
            me.lastFocusedChildIdx = idx;
        }
    },

  /**
   * Filters out all nodes with a tab index so that only ones that are considered actionable elements are returned
   *
   * @param cell
   * @returns {Array}
   * @private
   */
    _actionableNodesForCell: function (cell) {
      var me = this,
          tabIndexNodes = Ext.get(cell).query('*[tabindex]'),
          actionableNodes = [];
      Ext.Array.forEach(tabIndexNodes, function(node) {
        if (me._hasAnActionableTag(node)) {
          actionableNodes.push(node);
        }
      });
      return actionableNodes;
    },

    move: function(dir, keyEvent) {
      var me = this,
          position = me.getPosition();

      if (position && position.record) {
        // Calculate the new row and column position.
        // walkCells makes assumptions about event ctrlKey modifier, so do not pass it.

        // --- return position.view.walkCells(position, dir, null, me.preventWrap);
        // --- override begin
        // @UpgradedSencha 5.1 - deal with the colspan feature added by guidewire
        // The right move can jump directly to correct cell based on the colspan property
        // Other directions have to search for the nearest valid cell by testing colIdx - 1
        if (dir === 'right') {
          var cellData = position.record.data[position.column.dataIndex] || {};
          var colspan = cellData.colspan || 1;
          for (var i = 0; i < colspan && position; i++) {
            position = position.view.walkCells(position, dir, null, me.preventWrap);
          }
        } else {
          position = position.view.walkCells(position, dir, null, me.preventWrap);
          if (position && position.record) {
            var cellData = position.record.data[position.column.dataIndex];
            while ((typeof(cellData) === 'undefined') && !(position.rowIdx === 0 && position.colIdx === 0)) {
              position = position.view.walkCells(position, 'left', null, me.preventWrap);
              cellData = position.record.data[position.column.dataIndex];
            }
          }
        }
        // --- end override


        return position;
      }
      // <debug>
      // Enforce code correctness in unbuilt source.
      return null;
      // </debug>
    },

  /**
   * This method checks to see if the current cell is 'actionable' in some way based on the cell's column's dataType.
   * If it is, then the navigation model is switched to the special action mode.  Once in this mode, the user can use
   * the arrow keys to navigate between and space key to activate the 'actionable' elements.
   *
   * @returns {boolean} true if the special action mode was initiated or false if not
   * @private
   */
    initiateSpecialActionMode: function() {
      var me = this;
      if (me.column && me.cell) {
        // Pass something as the dataType, even if it is an empty string.  It differentiates the tab behavior from the
        // 'special action' one
        if (me._isCellActionableInSomeWay(me.cell, me.column.dataType || '')) {
          // Turn on the navigation panel's action mode
          me.actionMode = true;
          // Also make sure the view is set to wasEditing as appropriate.  It will be true either because it already
          // was true, or the grid is in a context where it has editors defined in the config.  When true, it allows
          // tabbing to the next cell to restore the 'editing' mode (or special action mode) for that next cell.
          me.view.wasEditing = me.view.wasEditing ||
              (me.view.grid && me.view.grid.hasEditorsInConfig && me.view.grid.hasEditorsInConfig());
          // Make sure we store the updated focused cell status information
          gw.GridUtil.recordFocusedCell(me.view.grid, null, me.position);

          //Fill cache
          me.cellCache.cell = me.cell;
          me.cellCache.column = me.column;
          me.cellCache.record = me.record;
          me.cellCache.recordIndex = me.recordIndex;
          me.cellCache.columnIndex = me.columnIndex;

          if (me.item) {
            var el = Ext.get(me.item).down('td.' + Ext.baseCSSPrefix + 'grid-item-focused');

            if (el) {
              // Switch from the focus class to the parent outline class for this cell.
              el.removeCls(me.focusCls);
              el.addCls(me.parentOutlineCls);
            }
          }

          me.focusChild();
          return true;
        }
      }
      return false;
    },

  /**
   * Some cells are actionable, but not special. It's usually a non-editable cell with a menu
   * @param cell
   * @returns {boolean}
   * @private
   */
    _isCellSelectableInSomeWay: function (cell) {
      return cell.down('.' + gw.app.HELPER_CELL_ICON_CLASS) !== null;
    },

    /**
     * Some cells (that do not have built-in editors) can be considered actionable in some way.  Sometimes they are
     * 'valid' actionable DOM elements tagged with the 'Event Source' class which have a dataType that is also
     * considered actionable.  Sometimes they contain an element which is tagged with the 'Radio Group Cell' class.
     * Sometimes they are 'valid' actionable DOM elements which are tagged with the 'Grid Cell Menu' class. And
     * sometimes they contain an element which is tagged with the 'Row Check Column' class which has a defined dataType.
     *
     * @param cell
     * @param dataType
     * @returns {boolean|*} true if it is actionable, false otherwise
     * @private
     */
    _isCellActionableInSomeWay: function (cell, dataType) {
      var isNonActionableDataType = Ext.Array.contains(['radioButtons', 'boolCheckBox'], dataType);

      if (cell.down('.' + gw.app.GW_RADIO_GROUP_CELL_CLASS) !== null) {
        return true;
      }

      // Make sure that the 'Grid Cell Menu' class element has an 'actionable' tag name
      if (this._hasDomWithAnActionableTag(cell.down('.' + gw.app.GRID_CELL_MENU_CLASS))) {
        return true;
      }

      // Make sure that the 'Event Source' class element has an 'actionable' tag name AND that the datatype of the
      // cell is also NOT considered non-actionable.
      if (this._hasDomWithAnActionableTag(cell.down('.' + gw.app.getEventSourceCls())) && !isNonActionableDataType) {
        return true;
      }

      // If we have a row check column class and it's dataType is 'undefined' then we are good
      return !!(cell.down('.' + gw.app.ROW_CHECK_COLUMN_CLASS) !== null && dataType === undefined);
    },

    /**
     * Determines whether the given element's DOM is associated with a 'valid' actionable tag name.
     *
     * @param element
     * @returns {*}
     * @private
     */
    _hasDomWithAnActionableTag: function (element) {
      if (element !== null && element.dom) {
        return this._hasAnActionableTag(element.dom);
      }
      return false;
    },

    /**
     * Determines whether the given DOM is associated with a 'valid' actionable tag name.
     *
     * @param dom element
     * @returns {*}
     * @private
     */
    _hasAnActionableTag: function (dom) {
      return Ext.Array.contains(['A', 'INPUT'], dom.tagName);
    },

    /**
     * This method handles the special Guidewire tab key navigation for the grid.  It differentiates between the editing
     * and non-editing states that the grid can be in.  When in the editing state, it is designed to skip over any cells
     * that are neither editable or actionable AND it also attempts to make sure the next cell's editor or special
     * action mode is activated.  When not in editing state, it just moves the focus to the next cell in the
     * grid.
     *
     * @param keyEvent
     * @param editingPlugin
     * @private
     */
    _handleTabKeyNavigation: function(keyEvent, editingPlugin) {
        var me = this,
            isInEditMode = editingPlugin || me.view.wasEditing,
            direction = keyEvent.shiftKey ? 'left' : 'right',
            position = me.getPosition(),
            lastPosition,
            // avoids the a = b, c = b problem just in case there's only one valid position
            lastValidPosition = position ? position.clone() : null,
            isCurrentCellActionable,
            isCurrentCellSelectable,
            isCurrentPositionEditable,
            currentCell,
            currentEditableCell,
            currentCellDisabled = false,

            safeEditingPlugin = !editingPlugin && isInEditMode ? me.view.editingPlugin : editingPlugin;

      // We want to continue looping while:
      // 1) We were given an editingPlugin
      // 2) We have a valid position
      // 3) There is no editor at that position
      // 4) There is an editor, but editing has been cancelled (veto event)
      // 5) If the cell is present and disabled
        do {
          if (lastPosition) {
            // If we looped around, set the position for the navigation model explicitly so that we move from this one
            me.setPosition(position, null, keyEvent, true); // Suppress events!
          }
          lastPosition = position;
          position = me.move(direction, keyEvent);

          currentCell = me.view.getCellByPosition(position);
          currentCellDisabled = currentCell ? currentCell.hasCls(gw.app.ACCORDION_DISABLED_CLASS) : false;
          currentEditableCell = isInEditMode ? currentCell : null;

          if (position && currentEditableCell) {
            // Don't pass dataType here on purpose.  It differentiates the tab behavior from the 'special action' one
            isCurrentCellActionable = me._isCellActionableInSomeWay(currentEditableCell);
            isCurrentCellSelectable = me._isCellSelectableInSomeWay(currentEditableCell);
            isCurrentPositionEditable = safeEditingPlugin.checkCellEditable(position.record, position.column);
          }

          // Store the last valid position if we landed on a focusable or actionable cell
          if (position && (isCurrentCellActionable || isCurrentPositionEditable || !currentCellDisabled)) {
            lastValidPosition = position.clone();
          }

          if (lastPosition && lastPosition.isEqual(position)) {
            // If we end up with the same result twice, it means that we weren't able to progress
            // via walkCells, for example if the remaining records are non-record rows, so gracefully
            // fall out here.

            position = false;
          }
        } while ((position
            && isInEditMode
            && !isCurrentCellActionable
            && !isCurrentCellSelectable
            && !isCurrentPositionEditable)
            || currentCellDisabled
            );

        if (position) {
          me.setPosition(position, null, keyEvent);
          keyEvent.stopEvent();
          position = me.getPosition();  // Refetch just in case the set above caused a reset
          if (position) {
            // Restart the editor if we are in edit mode
            if (isInEditMode) {
                // if we don't have a plug in, check to make sure the column has an editor first
                if (!editingPlugin && position.column.getEditor(position.record)) {
                    // if it does, then use the view's editing plugin
                    editingPlugin = me.view.editingPlugin;
                }
                if (editingPlugin && editingPlugin.startEditByPosition(position)) {
                    // if we had an editing plugin and it's start editing worked, clear the view's wasEditing flag
                    me.view.wasEditing = false;
                    me.actionMode = false;
                }
                // If we are confirming, start editing doesn't work, so skip below in that situation
                else if (!gw.GridUtil.isConfirmingFocusedCell(me.view.ownerGrid)) {
                    // Otherwise, If we could not restore editing...
                    // bring the cell into view.
                    // Set a flag that we should go back into editing mode upon next tab navigation call
                    if (editingPlugin) {
                        editingPlugin.completeEdit();
                    }
                    me.view.wasEditing = true;
                    me.clearAndSetPosition(position);
                    me.view.scrollCellIntoView(me.getPosition(), true);
                    me.initiateSpecialActionMode();
                }
            }
          }
        } else {
          if (editingPlugin) {
            editingPlugin.completeEdit();
          } else if (me.actionMode) {
              me._endActionMode();
          }

          me.view.toggleChildrenTabbability(false);
          // reset position to last focusable element in case we tabbed through some disabled items
          if (lastValidPosition) {
              me.setPosition(lastValidPosition);
          }

          return true;
        }
        return false;
    },

    _processBoolRadioOrRadioRangeCell: function (e) {
      var pos = this.getPosition();
      if (pos && pos.column && e.getKey() === e.ENTER) {
        var fieldType = pos.column.dataType;
        if (fieldType === 'boolRadio' || fieldType === 'rangeRadio') {
          // Stopping the event for the boolean radio and range radio types is needed to prevent the selection
          // of a radio button with the enter key and/or losing the actionMode styling
          e.stopEvent();
          return false;
        }
      }
      return true;
    },

    _processNativeOnClick: function (e) {
      if (e.getKey() === e.ENTER && e.target && e.target.tagName === 'A' && e.target.onclick) {
        e.target.click();
      }
    },

    _processCheckboxOrSimpleRadioCell: function (e) {
        var pos = this.getPosition(),
            radioCls = '.' + Ext.baseCSSPrefix + 'form-radio-default';
        // check if a cell is actually highlighted
        // summary row does not get highlighted
        if (pos && pos.record) {
            var view = pos.view,
                fieldName = pos.column.dataIndex,
                val = pos.record.get(fieldName),
                cell = view.getCell(pos.record, pos.column);

            // Only invoke space bar to change value for check box cell
            // Other components have its own space bar handler (i.e., rowcheckcolumn, radiocolumn)
            // Must check for check box class existence since a check box cell can be read only
            if (fieldName !== '_Checkbox' &&
                Ext.fly(cell).query('[class^=' + gw.app.ROW_CHECK_COLUMN_CLASS + ']').length > 0) {
                gw.GridUtil.processCheckBoxCellAction(view.panel, pos.record, pos.column, pos.rowIdx);
                // update flagged buttons
                var bCellLevelCB =  view.panel._updateFlaggedButtonsForRecord(pos.record);
                if (!bCellLevelCB) {
                    // this checkbox is associated with the containing gridView:
                    view.panel.updateFlagged();
                }
            } else if (pos.column.xtype !== 'radiocolumn' &&  cell.el.down(radioCls) !== null && !val) {
                // complex Type that is not a radio column, just a radio inside a cell
                gw.GridUtil.processRadioCellClick(true, pos.column, view.panel, pos.record, pos.rowIdx, fieldName);
            }
        }
    },

    onCellMouseDown: function(view, cell, cellIndex, record, row, recordIndex, mousedownEvent) {
      if (this.skipMouseProcessingInSpecialView(view, mousedownEvent)) {
        return true;
      }
      this.callParent(arguments);
    },

    /** This method is called when a cell in a grid is clicked. The skipMouseProcessingInSpecial view was designed to
     *     detect a bunch of cases where the default super.onCellClick() behavior wanted to be skipped. One of those
     *     cases included the fact that we are on the list detail panel (when the view.panel.hasSelection flag is true).
     *     Generally, for navigation purposes, we wanted to set the position on the grid to the cell that was
     *     clicked (part of what happens during the default processing we are skipping). But for a list detail panel we
     *     don't because selecting a checkbox should not select the whole row.
     */
    onCellClick: function (view, cell, cellIndex, record, row, recordIndex, clickEvent) {
      if (this.skipMouseProcessingInSpecialView(view, clickEvent)) {
        if (cell && cell.cellIndex !== undefined) {
          // Defer to the index contained within the cell since it is relative to the hidden columns
          cellIndex = cell.cellIndex;
        }
        if (!view.panel || !view.panel.hasSelection) {
          // Navigate (select) row if not in ListDetailPanel.
          this.setPosition(recordIndex, cellIndex, clickEvent, true); // Suppress events!
        }
        return true;
      }
      this.callParent(arguments);
    },

    // @UpgradedSencha 5.1 - Fix an issue where focus isn't properly being restored to the grid
    beforeViewRefresh: function() {
      var me = this,
          position = me.getPosition();
      // Override
      // fix the position restore code to properly compare the VIEW of the position against the VIEW of the nav-model
      //if (position && position.view === this) {
      //  me.focusRestorePosition = position;
      if (position && position.view === me.view) {
        // Without the clone, if the position is cleared it has the side effect of emptying the me.position of the
        // information that is needed to restore the position, causing an exception
        me.focusRestorePosition = position.clone();
        // End override
      } else {
        me.focusRestorePosition = null;
      }
    },

    skipMouseProcessingInSpecialView: function(view, mouseEvent) {
      // @UpgradedSencha 5.1 - We also need to stop processing the mouse event that occurs inside of a special cell
      // within the simplegrid.  NOTE: A list detail panel has the hasSelection flag set to true OR if the navigation
      // model is disabled.
      return this.disabled || (view.panel && this.isEventInsideSpecialCell(mouseEvent, view.panel.hasSelection));
    },

    isEventInsideSpecialCell: function (e, isListDetail) {
      var target = e ? e.target : null;
      if (!target || !target.tagName) {
        return undefined;
      }
      while (!target.classList.length) {
        // Find the parent node that has some classes
        target = target.parentNode;
      }
      if (target.tagName.toUpperCase() === 'IMG') {
        // For the case of list detail panels, we want to skip over an event inside of an image with the row check class
        return isListDetail && Ext.Array.contains(target.classList, gw.app.ROW_CHECK_COLUMN_CLASS) ||
            this.hasSpecialClass(target.classList);
      }
      if (target.tagName.toUpperCase() === 'A') {
        return this.hasSpecialClass(target.classList);
      }
      return false;
    },

    hasSpecialClass: function(classList) {
      return Ext.Array.contains(classList, gw.app.getEventSourceCls()) ||
          Ext.Array.contains(classList, gw.app.GRID_CELL_MENU_CLASS);
    }

});