/**
 * Override default implementation to unbox field value
 */
Ext.define('gw.override.util.Grouper', {
    override: 'Ext.util.Grouper',
    /**
     * Returns the value for grouping to be used.
     * @param {Ext.data.Model} item The Model instance
     * @return {String}
     */
    getGroupString: function (item) {
        var group = this._groupFn(item);
        return (group !== null) ? (Ext.isString(group) ? group : group.text) : '';
    }

});