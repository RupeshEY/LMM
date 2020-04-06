//@UpgradedSencha 5.1
//EXTJS-15855 Cannot read property 'tBodies' of null when navigating between examples on tablets
//Also fixing layout fail when component has scrollable set to true.
//This is hotfix and is not landed in the framework. (4 mar 2015)

//Also merge in changes from ExtJS 5.1.1 for EXTJS-9843: Ext.cache leak in Table Layout (3 Sept 2015)
Ext.define('gw.override.layout.container.Table', {
    override: 'Ext.layout.container.Table',

    childEls: [ 'table', 'tbody' ],

    renderChildren: function() {
        var me = this,
            items = me.getLayoutItems(),
            tbody = me.tbody.dom,
            rows = tbody.rows,
            len = items.length,
            hiddenItems = me.getHiddenItems(),
            cells, curCell, rowIdx, cellIdx, item,
            trEl, tdEl, i, cellId, oldId;

        // Calculate the correct cell structure for the current items
        cells = me.calculateCells(items);

        // Loop over each cell and compare to the current cells in the table, inserting/
        // removing/moving cells as needed, and making sure each item is rendered into
        // the correct cell.
        for (i = 0; i < len; i++) {
            curCell = cells[i];
            rowIdx = curCell.rowIdx;
            cellIdx = curCell.cellIdx;
            item = items[i];
            cellId = item.cellId || '';

            // If no row present, create and insert one
            trEl = rows[rowIdx];
            if (!trEl) {
                trEl = tbody.insertRow(rowIdx);
                if (me.trAttrs) {
                    trEl.set(me.trAttrs);
                }
            }

            // If no cell present, create and insert one
            tdEl = Ext.get(trEl.cells[cellIdx] || trEl.insertCell(cellIdx));

            // Render or move the component into the cell
            if (!item.rendered) {
                me.renderItem(item, tdEl, 0);
            } else if (!me.isValidParent(item, tdEl, rowIdx, cellIdx, tbody)) {
                me.moveItem(item, tdEl, 0);
            }

            // Set the cell properties
            if (me.tdAttrs) {
                tdEl.set(me.tdAttrs);
            }
            if (item.tdAttrs) {
                tdEl.set(item.tdAttrs);
            }

            oldId = tdEl.getAttribute('data-cellId');
            if ((oldId || cellId) && oldId !== cellId) {
                tdEl.setId(cellId || Ext.id());
            }

            tdEl.set({
                colSpan: item.colspan || 1,
                rowSpan: item.rowspan || 1,
                'data-cellId': cellId,
                cls: me.cellCls + ' ' + (item.cellCls || '')
            });

            // If at the end of a row, remove any extra cells
            if (!cells[i + 1] || cells[i + 1].rowIdx !== rowIdx) {
                cellIdx++;
                while (trEl.cells[cellIdx]) {
                    trEl.deleteCell(cellIdx);
                }
            }
        }

        // Delete any extra rows
        rowIdx++;
        while (tbody.rows[rowIdx]) {
            tbody.deleteRow(rowIdx);
        }

        // Check if we've removed any cells that contain a component, we need to move
        // them so they don't get cleaned up by the gc
        for (i = 0, len = hiddenItems.length; i < len; ++i) {
            me.ensureInDocument(hiddenItems[i].getEl());
        }
    },

    ensureInDocument: function(el){
        var dom = el.dom.parentNode;
        while (dom) {
            if (dom.tagName.toUpperCase() === 'BODY') {
                return;
            }
            dom = dom.parentNode;
        }

        Ext.getDetachedBody().appendChild(el);
    },

    calculate: function (ownerContext) {
        if (!ownerContext.hasDomProp('containerChildrenSizeDone')) {
            this.done = false;
        } else {
            var targetContext = ownerContext.targetContext,
                widthShrinkWrap = ownerContext.widthModel.shrinkWrap,
                heightShrinkWrap = ownerContext.heightModel.shrinkWrap,
                shrinkWrap = heightShrinkWrap || widthShrinkWrap,
                table = shrinkWrap && this.table.dom,
                targetPadding = shrinkWrap && targetContext.getPaddingInfo();

            if (widthShrinkWrap) {
                ownerContext.setContentWidth(table.offsetWidth + targetPadding.width, true);
            }

            if (heightShrinkWrap) {
                ownerContext.setContentHeight(table.offsetHeight + targetPadding.height, true);
            }
        }
    },

    getRenderTree: function() {
        var me = this,
            items = me.getLayoutItems(),
            rows = [],
            result = Ext.apply({
                tag: 'table',
                id: me.owner.id + '-table',
                "data-ref": 'table',
                role: 'presentation',
                cls: me.tableCls,
                cellspacing: 0,
                cellpadding: 0,
                cn: {
                    tag: 'tbody',
                    id: me.owner.id + '-tbody',
                    "data-ref": 'tbody',
                    role: 'presentation',
                    cn: rows
                }
            }, me.tableAttrs),
            tdAttrs = me.tdAttrs,
            len = items.length,
            i, cells, item, curCell, tr, rowIdx, cellIdx, cell, cellId, props;

        // Calculate the correct cell structure for the current items
        cells = me.calculateCells(items);

        for (i = 0; i < len; i++) {
            item = items[i];

            curCell = cells[i];
            rowIdx = curCell.rowIdx;
            cellIdx = curCell.cellIdx;
            cellId = item.cellId || '';

            // If no row present, create and insert one
            tr = rows[rowIdx];
            if (!tr) {
                tr = rows[rowIdx] = {
                    tag: 'tr',
                    role: 'presentation',
                    cn: []
                };
                if (me.trAttrs) {
                    Ext.apply(tr, me.trAttrs);
                }
            }

            // If no cell present, create and insert one
            cell = tr.cn[cellIdx] = {
                tag: 'td',
                role: 'presentation'
            };
            if (tdAttrs) {
                Ext.apply(cell, tdAttrs);
            }

            props = {
                colSpan: item.colspan || 1,
                rowSpan: item.rowspan || 1,
                'data-cellId': cellId,
                cls: me.cellCls + ' ' + (item.cellCls || '')
            };

            if (cellId) {
                props.id = cellId;
            }

            Ext.apply(cell, props);

            me.configureItem(item);
            // The DomHelper config of the item is the cell's sole child
            cell.cn = item.getRenderTree();
        }
        return result;
    },

    isValidParent: function(item, target, rowIdx, cellIdx) {
        // If we were called with the 3 arg signature just check that the item is within our table,
        if (arguments.length === 3) {
            return this.table.isAncestor(item.el);
        }
        return item.el.dom.parentNode === this.tbody.dom.rows[rowIdx].cells[cellIdx];
    }
});