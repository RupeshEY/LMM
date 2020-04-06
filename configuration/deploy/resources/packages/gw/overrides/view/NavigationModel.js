/**
 * ComboBox fixes for Guidewire.
 * This is a combination of fixes from 5.1.1, for use in 5.1.0.
 *
 *
 * Included:
 *
 * EXTJS-16988 - merged on March 9th 2015
 *      setPosition
 * Verified against Fiddle: https://fiddle.sencha.com/#fiddle/j6p
 */

Ext.define('gw.override.view.NavigationModel', {
    override: 'Ext.view.NavigationModel',

    setPosition: function(recordIndex, keyEvent, suppressEvent, preventNavigation) {
        var me = this,
            view = me.view,
            selModel = view.getSelectionModel(),
            dataSource = view.dataSource,
            newRecord,
            newRecordIndex;

        if (recordIndex == null || !view.all.getCount()) {
            me.record = me.recordIndex = null;
        } else {
            if (typeof recordIndex === 'number') {
                newRecordIndex = Math.max(Math.min(recordIndex, dataSource.getCount() - 1), 0);
                newRecord = dataSource.getAt(recordIndex);
            }
            // row is a Record
            else if (recordIndex.isEntity) {
                newRecord = dataSource.getById(recordIndex.id);
                newRecordIndex = dataSource.indexOf(newRecord);

                // Previous record is no longer present; revert to first.
                if (newRecordIndex === -1) {
                    newRecord = dataSource.getAt(0);
                    newRecordIndex = 0;
                }
            }
            // row is a view item
            else if (recordIndex.tagName) {
                newRecord = view.getRecord(recordIndex);
                newRecordIndex = dataSource.indexOf(newRecord);
            }
            else {
                newRecord = newRecordIndex = null;
            }
        }

        // No change; just ensure the correct item is focused and return early.
        // Do not push current position into previous position, do not fire events.
        // We must check record instances, not indices because of store reloads (combobox remote filtering).
        // If there's a new record, focus it. Note that the index may be different even though
        // the record is the same (filtering, sorting)
        if (newRecord === me.record) {
            me.recordIndex = newRecordIndex;
            return me.focusPosition(newRecordIndex);
        }

        if (me.item) {
            me.item.removeCls(me.focusCls);
            if (view.trackOver) {
                // PLWEB-5487 - also clear highlighted element if the view is tracking over
                view.clearHighlight();
            }
        }

        // Track the last position.
        // Used by SelectionModels as the navigation "from" position.
        me.previousRecordIndex = me.recordIndex;
        me.previousRecord = me.record;
        me.previousItem = me.item;

        // Update our position
        me.recordIndex = newRecordIndex;
        me.record      = newRecord;

        // Prevent navigation if focus has not moved
        preventNavigation = preventNavigation || me.record === me.lastFocused;

        // Maintain lastFocused, so that on non-specific focus of the View, we can focus the correct descendant.
        if (newRecord) {
            me.focusPosition(me.recordIndex);
        } else {
            me.item = null;
        }

        if (!suppressEvent) {
            selModel.fireEvent('focuschange', selModel, me.previousRecord, me.record);
        }

        // If we have moved, fire an event
        if (!preventNavigation && keyEvent) {
            me.fireNavigateEvent(keyEvent);
        }
    }
});