Ext.define('gw.override.view.Table', {
    override: 'Ext.view.Table',

    //@UpgradedSencha 5.1 - Has column spanning feature added.
    cellTpl: [
        //Template changed next line as following
        '<tpl if="insertCell">', // added
        '<td class="{tdCls}" {tdAttr} {[Ext.aria ? "id=\\"" + Ext.id() + "\\"" : ""]} style="width:{cellWidth}px;<tpl if="tdStyle">{tdStyle}</tpl>" tabindex="-1" {ariaCellAttr} data-columnid="{[values.column.getItemId()]}">',
        //'<td class="{tdCls}" {tdAttr} {[Ext.aria ? "id=\\"" + Ext.id() + "\\"" : ""]} style="width:{column.cellWidth}px;<tpl if="tdStyle">{tdStyle}</tpl>" tabindex="-1" {ariaCellAttr} data-columnid="{[values.column.getItemId()]}">',
        '<div {unselectableAttr} class="' + Ext.baseCSSPrefix + 'grid-cell-inner {innerCls}" ',
        'style="text-align:{align};<tpl if="style">{style}</tpl>" {ariaCellInnerAttr}>{value}</div>',
        '</td>',
        '</tpl>', // added
        {
            priority: 0
        }
    ],
    markDirty: false, // We don't care about dirty cells so don't bother to mark them.  Marked cells have the wrong styling

    gwEditorTags: ['INPUT', 'TEXTAREA'],

    // @UpgradedSencha 5.1 - overrode renderColumnSizer to add support for Column Spans
    renderColumnSizer: function (values, out) {

        var columns = values.columns || this.getGridColumns(),
            len = columns.length, i,
            store = this.getStore(), // override
            colspan = false, //override
            colspanHtml, // override
            tempspan = 0, // override
            column, width, widthString,
            n, nLen, fieldValue;

        out.push('<colgroup role="presentation">');

        if(values.recordIndex < 0){ // grouped grid row
            for (i = 0; i < len; i++) {
                column = columns[i];
                width = column.cellWidth ? column.cellWidth : Ext.grid.header.Container.prototype.defaultWidth;
                out.push('<col role="presentation" class="', Ext.baseCSSPrefix, 'grid-cell-', columns[i].getItemId(), '" style="width:' + width + 'px">');
            }
        }else{
            for (i = 0; i < len; i++) {
                if(values.recordIndex < 0){
                    continue;
                }
                column = columns[i];
                //-- begin override
                width = 0;
                fieldValue = store.getAt(values.recordIndex).data[column.mapping || column.dataIndex];
                colspan = (fieldValue && fieldValue.colspan) || false;

                if (colspan) {
                    tempspan = colspan;
                    colspanHtml = ' data-gwcolspan="' + colspan + '"';
                    //calculate spanned width
                    for(n = i, nLen = i + colspan; n < nLen; n++){
                        width += columns[n].cellWidth;
                    }
                } else {
                    if (tempspan > 0) {
                        width = 0;
                        tempspan--;
                        colspanHtml = ' data-gwcolspan="0"';
                    } else {
                        width = column.cellWidth ? column.cellWidth : Ext.grid.header.Container.prototype.defaultWidth;
                        colspanHtml = '';
                    }
                }

                widthString = width > 0 ? 'width:' + width + 'px' : 'width:0.000000001px'; //trick in to sizing

                out.push('<col role="presentation" class="', Ext.baseCSSPrefix, 'grid-cell-', columns[i].getItemId(), '" style="' + widthString + '"', colspanHtml, '">');
                //-- end override
            }
        }

        out.push('</colgroup>');
    },

    // @UpgradedSencha 5.1 - overrode renderCell to add support for Column Spans
    renderCell: function (column, record, recordIndex, rowIndex, columnIndex, out) {
        var me = this,
            fullIndex,
            selModel = me.selectionModel,
            cellValues = me.cellValues,
            classes = cellValues.classes,
            fieldValue = record.data[column.dataIndex],
            cellTpl = me.cellTpl,
            value, clsInsertPoint,
            width = 0, i, tempColumn, // Override
            colSpan = (fieldValue && fieldValue.colspan) || false,// Override
            lastFocused = me.navigationModel.getPosition();

        // GW -------------- Add column spanning for 5.1

        cellValues.insertCell = true;

        if (colSpan) {
            // need cell data from next colSpan columns
            for (i = columnIndex; i < columnIndex + colSpan; i++) {
                tempColumn = me.getHeaderAtIndex(i);
                if (!tempColumn) {
                    break;
                }
                width += tempColumn.cellWidth;
                if (i > columnIndex) {
                    tempColumn.colSpan = true;
                }
            }
        }
        cellValues.cellWidth = colSpan ? width : column.cellWidth;

        //column was spanned in this row, do not render the cell and remove the flag for next row
        if (column.colSpan) {
            delete column.colSpan;
            cellValues.insertCell = false;
        }

        //If flex is used we have to adjust sizing based on the dimensions that are calculated after cells are rendered
        if (!me.requestRefresh && column.flex) {
            me.requestRefresh = true;

            //Seems that refresh is called internally somewhere on GW code and this is causing infinite loop!
            //me.up().on('afterlayout',
            //    function(){
            //      delete me.requestRefresh;
            //      me.refresh();
            //    }, me, {
            //      single:true
            //    }
            //);
        }

        //------------- end override

        cellValues.record = record;
        cellValues.column = column;
        cellValues.recordIndex = recordIndex;
        cellValues.rowIndex = rowIndex;
        cellValues.columnIndex = columnIndex;
        cellValues.cellIndex = columnIndex;
        cellValues.align = (fieldValue && fieldValue.align) || column.align; // Override: bring in alignment for text
        cellValues.innerCls = column.innerCls;
        cellValues.tdCls = cellValues.tdStyle = cellValues.tdAttr = cellValues.style = "";
        cellValues.unselectableAttr = me.enableTextSelection ? '' : 'unselectable="on"';

        //Override: Restore field value if being an object
        //Used for rendering purposes

        if (Ext.isObject(fieldValue)) {
            if (fieldValue.tdStyle) {
                cellValues.tdStyle = fieldValue.tdStyle;
            }
            //fieldValue = fieldValue.text; // @UpgradedSencha - not needed for GW.
        }

        // GW -------------- Add column spanning for 5.1

        // Setting colSpan doesn't really affect the cell, as each grid row is its own table. But
        // it allows TableLayout to spot which cells should span multiple columns
        if (colSpan && colSpan > 1) {
            cellValues.tdAttr += ' data-gwcolspan="' + colSpan + '"';
        }

        //------------- end override

        // Begin setup of classes to add to cell
        classes[1] = column.getCellId();

        // On IE8, array[len] = 'foo' is twice as fast as array.push('foo')
        // So keep an insertion point and use assignment to help IE!
        clsInsertPoint = 2;

        if (column.renderer && column.renderer.call) {
            fullIndex = me.ownerCt.columnManager.getHeaderIndex(column);
            value = column.renderer.call(column.usingDefaultRenderer ? column : column.scope || me.ownerCt, fieldValue, cellValues, record, recordIndex, fullIndex, me.dataSource, me);

            if (cellValues.css) {
                // @UpgradedSencha 5.1 - the below lines are copied directly from the overridden ExtJS code
                // This warning attribute is used by the compat layer
                // TODO: remove when compat layer becomes deprecated
                record.cssWarning = true;
                cellValues.tdCls += ' ' + cellValues.css;
                cellValues.css = null;
            }

            // Add any tdCls which was added to the cellValues by the renderer.
            if (cellValues.tdCls) {
                classes[clsInsertPoint++] = cellValues.tdCls;
            }
        } else {
            value = fieldValue;
        }

        cellValues.value = (value == null || value === '') ? column.emptyCellText : value;

        if (column.tdCls) {
            classes[clsInsertPoint++] = column.tdCls;
        }
        if (me.markDirty && record.dirty && record.isModified(column.dataIndex)) {
            classes[clsInsertPoint++] = me.dirtyCls;
        }
        if (column.isFirstVisible) {
            classes[clsInsertPoint++] = me.firstCls;
        }
        if (column.isLastVisible) {
            classes[clsInsertPoint++] = me.lastCls;
        }
        if (!me.enableTextSelection) {
            classes[clsInsertPoint++] = me.unselectableCls;
        }
        if (selModel && (selModel.isCellModel || selModel.isSpreadsheetModel) && selModel.isCellSelected(me, recordIndex, column)) {
            classes[clsInsertPoint++] = me.selectedCellCls;
        }
        if (lastFocused && lastFocused.record.id === record.id && lastFocused.column === column) {
            classes[clsInsertPoint++] = me.focusedItemCls;
        }

        // Chop back array to only what we've set
        classes.length = clsInsertPoint;

        cellValues.tdCls = classes.join(' ');

        cellTpl.applyOut(cellValues, out);

        // Dereference objects since cellValues is a persistent var in the XTemplate's scope chain
        cellValues.column = null;
    },

    // @UpgradedSencha 5.1 - Fixed syncContent failure on redrawn cells.  Basically Guidewire command processing
    // can cause double rendering which caused an issue with an old cell disappearing.  This override handles that
    updateColumns: function(oldRowDom, newRowDom, columnsToUpdate) {
        var me = this,
            newAttrs, attLen, attName, attrIndex,
            colCount = columnsToUpdate.length,
            colIndex,
            column,
            oldCell, newCell,
            cellSelector = me.getCellSelector();

        // Copy new row attributes across. Use IE-specific method if possible.
        // Must do again at this level because the row DOM passed here may be the nested row in a row wrap.
        if (oldRowDom.mergeAttributes) {
            oldRowDom.mergeAttributes(newRowDom, true);
        } else {
            newAttrs = newRowDom.attributes;
            attLen = newAttrs.length;
            for (attrIndex = 0; attrIndex < attLen; attrIndex++) {
                attName = newAttrs[attrIndex].name;
                if (attName !== 'id') {
                    oldRowDom.setAttribute(attName, newAttrs[attrIndex].value);
                }
            }
        }

        // Replace changed cells in the existing row structure with the new version from the rendered row.
        for (colIndex = 0; colIndex < colCount; colIndex++) {
            column = columnsToUpdate[colIndex];

            // Pluck out cells using the column's unique cell selector.
            // Becuse in a wrapped row, there may be several TD elements.
            cellSelector = me.getCellSelector(column);
            oldCell = Ext.fly(oldRowDom).selectNode(cellSelector);
            newCell = Ext.fly(newRowDom).selectNode(cellSelector);

            // Carefully replace just the *contents* of the cell.
            // @UpgradedSencha - Begin Override here, ensuring that old one still exists.
            if (oldCell && newCell) {
                Ext.fly(oldCell).syncContent(newCell);
            }
            // End override

        }
    },

    // @private
    getLastFocused: function() {
        var lastFocused = this.callParent(arguments),
            sm = this.getSelectionModel(),
            selection = sm ? sm.getSelection() : null;
        if (!lastFocused && selection && sm.isLocked()) {
            // If there is no last focused element and the selection model is locked, then we want the last focus
            // to be on the selection
            lastFocused = Array.isArray(selection) ? selection[0] : selection;
        }
        return lastFocused;
    },

    /**
     * Called when focus enters this Component's hierarchy
     *
     * This override adjusts the lastFocused element on the table based on certain conditions that can be sleuthed
     * from the event object associated with the 'e' variable
     *
     * @param e
     * @protected
     */
    onFocusEnter: function(e) {
        var me = this,
            lastRecord, count, targetView, columns,
            relatedTarget = e.event.getRelatedTarget(null, null, true);
        // Check to see if this is an relevant focus transition because if it is NOT, the last focused element is just
        // fine.
        if (me._isRelevantFocusTransition(relatedTarget)) {
            if (e.event.forwardTab) {
                // If forward tab is true, then we are NOT coming backwards into the end of the table, we are moving
                // forward into it... Reset the last focused element so that the first element in the table is focused.
                // clear last focused so that the auto-select first element logic in the parent calls does it's thing
                me.lastFocused = null;
            } else if (me.all.getCount() && me.dataSource.getCount()) {
                // Otherwise, then we are navigating back to the table via SHIFT-TAB, so get the last focusable element
                // in the table.  Most of this was adapted from the parent onFocusEnter() logic used to get the
                // "firstRecord" from the table.
                count = me.dataSource.getCount() - 1;
                do {
                    lastRecord = me.dataSource.getAt(count);
                } while (me._isNullDisabledOrNonDataRecord(lastRecord) && --count >= 0);
                // A summary record isNonData, so we don't want to use one of them
                if (!me._isNullDisabledOrNonDataRecord(lastRecord)) {
                    // Same logic for fetching the targetView as the parent onFocusEnter() method
                    targetView = me.isLockingView ? (me.lockedGrid.isVisible() ? me.lockedView : me.normalView) : me;
                    // Get the visible grid columns from the header
                    columns = me.headerCt.getVisibleGridColumns();
                    // And create a position from the lastRecord, last column
                    me.lastFocused = new Ext.grid.CellContext(targetView).setPosition({
                        row: lastRecord,
                        column: me._lastVisibleColumnIndex(lastRecord)
                    });
                }
            }
        }
        me.callParent(arguments);
    },

    _isNullDisabledOrNonDataRecord: function (record) {
        if (record) {
            if (record.isNonData) {
                return true;
            }
            return record.data ? record.data.cls === gw.app.ACCORDION_DISABLED_CLASS : false;
        }
        return true;
    },

    _isRelevantFocusTransition: function(relatedTarget) {
        // Only keyboard events that contain a TAB in them are considered relevant
        if (Ext.EventObject && Ext.EventObject.type &&
            (Ext.EventObject.type.indexOf("key") < 0 || Ext.EventObject.keyCode !== Ext.EventObject.TAB)) {
            return false;
        }
        // If the related target is a grid editor or a link in a message box then this isn't relevant either.
        // This happens when an editor or message box is closed and the focus for it is being returned back to the table.
        if (this._isGridEditorOrMessageBox(relatedTarget)) {
            return false;
        }
        // if it is coming from restoreLastFocusedCell call then this isn't relevant.
        if (this._isRestoringFocus) {
            return false;
        }
        return true;
    },

    _isGridEditorOrMessageBox: function(relatedTarget) {
        var dom = relatedTarget ? relatedTarget.dom : null;
        if (dom && relatedTarget.findParent) {
            // Check to see if it is either an editor node AND the parent of the node is a grid-editor OR
            // an '<a>' node AND the parent of the node is a message box
            if ((Ext.Array.contains(this.gwEditorTags, dom.nodeName) &&
                relatedTarget.findParent('.' + Ext.baseCSSPrefix + 'grid-editor')) ||
                (dom.nodeName === 'A' && relatedTarget.findParent('.' + Ext.baseCSSPrefix + 'message-box'))) {
                return true;
            }
        }
        return false;
    },

    _lastVisibleColumnIndex: function(record) {
        var columns = this.headerCt.getVisibleGridColumns(),
            count = columns.length - 1,
            i, fieldValue, column;
        for (i = 0; i <= count; i++) {
            column = columns[i];
            fieldValue = record.data[column.dataIndex];
            // We need to account for colspans in the record, so if this fieldValue has one...
            if (fieldValue && fieldValue.colspan) {
                if ((i + fieldValue.colspan) >= count) {
                    // Either return the current index if the colspan covers the remaining columns in the list
                    return i;
                } else {
                    // Or bump the index by the colspan size (-1 since it increments at the end of the loop) to skip
                    // over the column data in between this column and the next one.
                    i += fieldValue.colspan - 1;
                }
            }
        }
        // No colspans of note, return the last column
        return count;
    }
});
