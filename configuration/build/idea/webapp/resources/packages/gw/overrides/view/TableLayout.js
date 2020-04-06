/**
 * @SenchUpgrade Referencing private ExtJS method
 *
 * Override the default behavior to handle colSpan columns and to make flex column to work when LV has
 * shrinkWrap=true.
 *
 * This is a complicated override. Most of the complexity is handling cells which span multiple columns.
 * This wasn't needed in Emerald/ExtJS 4, because all rows in an ExtJS table were part of a single HTML
 * table and it was meaningful to put a colspan attribute on a cell. But in ExtJS 5 each table row is
 * a separate HTML table so a colspan on one row has no correspondence with any of the other rows. All
 * the logic to make a colspan cell match the width of 2 or more other cells has to be done explicitly
 * in the layout code.
 *
 * The other part of the override is to handle flex columns in shrink wrap LVs. This override is very
 * similar to the way it was in Emerald/ExtJS 4 except that it now calls the updated "colspan aware"
 * layout code to set the column widths.
 *
 * See also the Table.js override, which implements table rendering. It marks all the elements that
 * represent columns with the data-gwcolspan attribute, which contains the configured colspan. The
 * layout code below uses this attribute to retrieve the colspan value during the layout phase.
 *
 * This code does not attempt to deal with hidden columns because we disable the hidden column feature
 * for any list view containing colspan. This is done on the server side, by setting the hideable
 * property to false on the column descriptors.
 */
Ext.define('gw.override.view.TableLayout', {
    override: 'Ext.view.TableLayout',

    /**
     * Override of ExtJS method, changed code to handle flex columns in shrink wrap LVs. Without this
     * override flex columns don't use up the rest of the available space.
     */
    finishedLayout: function (ownerContext) {
        var me = this;
        if (ownerContext.widthModel.shrinkWrap) {
            me.setCellWidths(ownerContext, ownerContext.headerContext.getProp('columnsChanged'));
        }
        me.callParent([ ownerContext ]);
    },

    /**
     * @private
     * Override of private ExtJS method, changed code to handle cells spanning multiple columns. Without
     * this override such columns will not be sized correctly; see PLWEB-5330 and PLWEB-5331
     */
    flushColumnWidths: function () {
        // Base implementation, copied from ext/src/view/TableLayout.js. Does not account for colspan
        //
        //var flusher = this,
        //    me = flusher.layout,
        //    ownerContext = flusher.ownerContext,
        //    columnsChanged = flusher.columnsChanged,
        //    owner = ownerContext.target,
        //    len = columnsChanged.length,
        //    column, i, colWidth, lastBox;
        //
        //if (ownerContext.state.columnFlusher !== flusher) {
        //    return;
        //}
        //
        //// Set column width corresponding to each header
        //for (i = 0; i < len; i++) {
        //    if (!(column = columnsChanged[i])) {
        //        continue;
        //    }
        //
        //    colWidth = column.props.width;
        //    owner.body.select(owner.getColumnSizerSelector(column.target)).setWidth(colWidth);
        //
        //    // Enable the next go-round of headerCt's ColumnLayout change check to
        //    // read true, flushed lastBox widths that are in the Table
        //    lastBox = column.lastBox;
        //    if (lastBox) {
        //        lastBox.width = colWidth;
        //    }
        //}
        //
        //flusher.flushed = true;
        //
        //if (!me.pending) {
        //    ownerContext.context.queueLayout(me);
        //}

        // NOTE: The "this" pointer here is the flusher object that was queued.
        var flusher = this,
            me = flusher.layout,
            ownerContext = flusher.ownerContext,
            columnsChanged = flusher.columnsChanged;

        if (ownerContext.state.columnFlusher !== flusher) {
            return;
        }

        me.setCellWidths(ownerContext, columnsChanged);

        flusher.flushed = true;

        if (!me.pending) {
            ownerContext.context.queueLayout(me);
        }
    },

     /**
      * Adjust the actual cell widths. The standard ExtJS implementation just finds the cells for the changed
      * columns and sets them to the width specified in the corresponding column ContextItem. This GW override
      * has to worry about cells spanning multiple columns so it is much more complicated
      *
      * @param tableContextItem layout context for table view, target is the table (grid) itself
      * @param columnsChanged array containing an context item for each column that has changed width. Indexes
      *  into this array match the indexes into the main column array.
      */
    setCellWidths: function(tableContextItem, columnsChanged) {
        var me = this,
            table = tableContextItem.target,
            allColumns = table.getGridColumns(),
            len = allColumns.length,
            column, columnContextItem, i, lastBox;
        for (i = 0; i < len; i++) {
            column = allColumns[i];
            columnContextItem = i < columnsChanged.length && columnsChanged[i] ? columnsChanged[i] : null;

            me.getColumnCells(table, column).each(function(cell) {
                var colSpan = cell.dom.getAttribute("data-gwcolspan");
                if (colSpan && colSpan > 1) {
                    // Cell that spans multiple columns
                    me.possiblySetColSpanWidth(cell, tableContextItem, columnsChanged, i, colSpan);
                } else if (colSpan === '0') {
                    // Special case; col element within colgroup that always has width 0 because it is
                    // enclosed in a colspan. Always leave such elements alone
                } else if (columnContextItem) {
                    // Single column cell, and that column has changed width
                    cell.setWidth(columnContextItem.props.width);
                }
            });

            // Enable the next go-round of headerCt's ColumnLayout change check to
            // read true, flushed lastBox widths that are in the Table
            if (columnContextItem) {
                lastBox = columnContextItem.lastBox;
                if (lastBox) {
                    lastBox.width = columnContextItem.props.width;
                }
            }
        }
    },

    /**
     * Return all the cell elements for a particular column in the table. The cell elements are the actual
     * HTML elements whose width must be changed to change the column width. May also include the special
     * column group entries (col elements) used by the resizing code.
     * @param table the table (grid)
     * @param column a column within the table
     * @returns a CompositeElement containing all the cell elements in the column
     */
    getColumnCells: function (table, column) {
        return table.body.select(table.getColumnSizerSelector(column));
    },

    /**
     * Figure out if the given cell, which spans multiple columns, has been affected by the column size
     * change and, if so, adjust its size accordingly. We cannot just look at the changed columns to
     * figure this out as the cell may span some columns which haven't changed size. We also have to
     * account for columns which are not being changed right now but don't have their original width
     * because they were altered in an earlier layout cycle.
     * @param cell the cell, guaranteed to span multiple columns
     * @param tableContextItem the layout context item for the table
     * @param columnsChanged context items for the columns whose width is changing
     * @param columnIndex the index of the first column within the cell
     * @param colSpan the number of columns in the cell
     */
    possiblySetColSpanWidth: function(cell, tableContextItem, columnsChanged, columnIndex, colSpan) {
        var me = this,
            allColumns = tableContextItem.target.getGridColumns(),
            width = 0,
            changed = false,
            i;
        for (i = columnIndex; i < allColumns.length && i < columnIndex + colSpan; i++) {
            if (i < columnsChanged.length && columnsChanged[i]) {
                width += columnsChanged[i].props.width;
                changed = true;
            } else {
                width += me.getCurrentColumnWidth(tableContextItem, allColumns[i]);
            }
        }
        if (changed) {
          cell.setWidth(width);
        }
    },

    /**
     * Look through the layout context items to see if the column has been given a new width - this can
     * happen even if the column wasn't in the "changed" list, if it happened in an earlier layout cycle.
     * If can't find anything in the layout context items, back off to the column's original cell width.
     * @param tableContextItem layout context item for the entire table
     * @param column the column whose width we need
     * @returns width of column
     */
    getCurrentColumnWidth: function(tableContextItem, column) {
        var columnContextItems = tableContextItem.headerContext.childItems,
            len = columnContextItems ? columnContextItems.length : 0,
            i, columnContextItem;
        for (i = 0; i < len; i++) {
            columnContextItem = columnContextItems[i];
            if (columnContextItem.target === column && typeof columnContextItem.props.width === 'number') {
                return columnContextItem.props.width;
            }
        }
        return column.cellWidth;
    }
});
