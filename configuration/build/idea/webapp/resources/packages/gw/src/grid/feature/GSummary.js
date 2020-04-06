// Standalone grid feature GSummary.
// This way differences are placed in custom component rather than overriding existing functionality of the Summary feature.
// Doing so allows both features to coexist

Ext.define('gw.grid.feature.GSummary', {
    extend: 'Ext.grid.feature.Summary',
    alias: 'feature.gsummary',

    getSummary: function (store, type, field, group) {
        var isGrouped = !!group,
            item = isGrouped ? group : store;

        if (type) {
            if (Ext.isFunction(type)) {
                if (isGrouped) {
                    return item.aggregate(field, type);
                } else {
                    return item.aggregate(type, null, false, [field]);
                }
            }

            switch (type) {
                case 'count':
                    return item.count(field);
                case 'min':
                    return item.min(field);
                case 'max':
                    return item.max(field);
                case 'sum':
                    return item.sum(field);
                case 'average':
                    return item.average(field);

                //GW ----
                case 'no-op':

                    var gridColumns = this.grid.view.headerCt.getGridColumns();
                    var matchingColumn = Ext.Array.findBy(gridColumns, function(item, index){
                        return item.dataIndex === field;
                    });

                    var rawData = store.getProxy().getReader().rawData;

                    return (rawData && rawData.summaryData && rawData.summaryData[0][matchingColumn.mapping] ) || '';
                //-------

                default:
                    return '';
            }
        }
    },

    // @UpgradedSencha 5.1 - Override generateSummaryData so that it appropriately handles the GW specialization
    // of having multiple lines
    generateSummaryData: function (groupField) {
        var me = this,
            reader = me.view.store.getProxy().getReader(),
            convertedSummaryRow = {},
            remoteData = {},
            i, len, root, summaryRows;

        // reset reader root and rebuild extractors to extract summaries data
        root = reader.getRootProperty();
        reader.setRootProperty(me.remoteRoot);
        reader.buildExtractors(true);
        summaryRows = reader.getRoot(reader.rawData);

        if (summaryRows) {
            if (!Ext.isArray(summaryRows)) {
                summaryRows = [summaryRows];
            }

            len = groupField ? summaryRows.length : 1; //Override: GW has 2 lines, where it should be just 1

            for (i = 0; i < len; ++i) {
                // Convert a raw data row into a Record's hash object using the Reader.
                convertedSummaryRow = reader.extractRecordData(summaryRows[i], me.readDataOptions);
                if (groupField) {
                    remoteData[convertedSummaryRow[groupField]] = convertedSummaryRow;
                }
            }
        }

        // Restore initial reader configuration.
        reader.setRootProperty(root);
        reader.buildExtractors(true);

        return groupField ? remoteData : convertedSummaryRow;
    },

    // @UpgradedSencha 5.1 - Override outputSummaryRecord so that renders both the summaryRowCls and the grid row class.
    // This is needed so that the onStoreUpdate call can find the TR associated with the summary row
    outputSummaryRecord: function(summaryRecord, contextValues, out) {
        var view = contextValues.view,
            savedRowValues = view.rowValues,
            columns = contextValues.columns || view.headerCt.getVisibleGridColumns(),
            colCount = columns.length, i, column,
        // Set up a row rendering values object so that we can call the rowTpl directly to inject
        // the markup of a grid row into the output stream.
            values = {
                view: view,
                record: summaryRecord,
                rowStyle: '',
                // Begin override - add grid-row first, then row summary cls
                rowClasses: [ Ext.baseCSSPrefix + 'grid-row', this.summaryRowCls ],
                // End override
                itemClasses: [],
                recordIndex: -1,
                rowId: view.getRowId(summaryRecord),
                columns: columns
            };

        // Because we are using the regular row rendering pathway, temporarily swap out the renderer for the summaryRenderer
        for (i = 0; i < colCount; i++) {
            column = columns[i];
            column.savedRenderer = column.renderer;

            if (column.summaryType || column.summaryRenderer) {
                column.renderer = this.createRenderer(column, summaryRecord);
            } else {
                column.renderer = Ext.emptyFn;
            }
        }

        // Use the base template to render a summary row
        view.rowValues = values;
        view.self.prototype.rowTpl.applyOut(values, out, parent);
        view.rowValues = savedRowValues;

        // Restore regular column renderers
        for (i = 0; i < colCount; i++) {
            column = columns[i];
            column.renderer = column.savedRenderer;
            column.savedRenderer = null;
        }
    },

    //@UpgradedSencha Ticket: EXTJS-16109 Summary feature does not overflow cell, causing out of sync cell widths
    //Fix possibly to land in 5.1.1 Override provided on 10 dec 2014.

    renderSummaryRow: function(values, out, parent) {
        var view = values.view,
            me = view.findFeature('gsummary'),
            record, id;

        if (me.showSummaryRow) {
            // @UpgradedSencha 5.1, previous fix also needs the ID to be specified so that the
            // Ext.grid.feature.GSummary.onStoreUpdate method can find the row appropriately
            record = me.summaryRecord && me.summaryRecord.isModel ? me.summaryRecord : me.createSummaryRecord(view);
            id = view.getRowId(record);

            out.push('<table id="'+ id + '" cellpadding="0" cellspacing="0" class="' +  me.summaryItemCls + '" style="table-layout: fixed; width: 100%;">');
            me.outputSummaryRecord(record, values, out, parent);
            out.push('</table>');
        }
    }
});