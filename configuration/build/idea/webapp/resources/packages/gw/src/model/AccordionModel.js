/**
 * Defines the hierarchical menu links in the left nav bar
 */
Ext.define('gw.model.AccordionModel', {
    extend: 'Ext.data.Model',
    fields: ['title', 'eventId', {
        name: 'collapsible',
        type: 'boolean',
        convert: function(v) {
            return v == "";
        }
    }]
});
