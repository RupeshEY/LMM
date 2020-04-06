//@UpgradedSencha Ticket: EXTJS-16109 Summary feature does not overflow cell, causing out of sync cell widths
//Fix possibly to land in 5.1.1 Override provided on 10 dec 2014.

//Standalone GSummary feature has been added, but we have to keep this override due to original Summary feature being affected too.

Ext.define('EXTJS-16109.grid.feature.Summary', {
    override: 'Ext.grid.feature.Summary',

    renderSummaryRow: function(values, out, parent) {
        var view = values.view,
            me = view.findFeature('summary'),
            record, id;

        if (me.showSummaryRow) {
            // @UpgradedSencha 5.1, previous fix also needs the ID to be specified so that the 
            // Ext.grid.feature.Summary.onStoreUpdate method can find the row appropriately
            record = me.summaryRecord && me.summaryRecord.isModel ? me.summaryRecord : me.createSummaryRecord(view);
            id = view.getRowId(record);

            out.push('<table id="'+ id + '" cellpadding="0" cellspacing="0" class="' +  me.summaryItemCls + '" style="table-layout: fixed; width: 100%;">');
            me.outputSummaryRecord(record, values, out, parent);
            out.push('</table>');
        }
    }
});