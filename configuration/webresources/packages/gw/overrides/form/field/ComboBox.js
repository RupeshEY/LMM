/**
 * When a combobox is opened, the typeAhead function is scheduled to execute with a delay.
 * If you open a combobox inside a grid editor and quickly switch to another row, the previous will be destroyed, leaving
 * the typeAhead task still running. This produces an error, since the typeAhead function will run on a
 * destroy combo.
 *
 * To fix this, let's make sure the task is canceled when we destroy the grid.
 *
 * Sencha 06/21/13
 * Submitted to the framework EXTJSIV-10337
 * //@UpgradedSencha Fixed in 4.2.2.1144 . Leftovers seem that work around another issue.
 *
 * The above problem is fixed in Ext 4.2.2. There now is a onDestroy method in the Sencha implementation that does what was done here
 * in the onDestroy method. I am not sure if the initComponent method is needed for that problem. This files also seems
 * to contain a fix to another Ext bug (see the onKeyUp method).
 *
 * Moved some of the overrides to AutoComplete widget.
 *
 * mstein 4/14/2014
 *
 */
Ext.define('gw.override.form.field.ComboBox', {
    override: 'Ext.form.field.ComboBox',
    uses: ['gw.app'],

    // @UpgradedSencha restores the last valid value if this is an invalid value. Set it to false for Autocomplete and QuickJump
    shouldRestoreLastValidValue: true,

    // @UpgradedSencha Removing the input event from triggering check change due to numerous keypress handling in the
    // the comboboxes that fail to work with an input event since it does not include keypresses. This will probably break
    // chained POCs where field1 modifies field2 and field2 modifies field3, etc. etc. etc.
    checkChangeEvents: Ext.isIE && (!document.documentMode || document.documentMode <= 9) ?
        ['change', 'propertychange', 'keyup'] :
        ['change', 'textInput', 'keyup', 'dragdrop'],

    initComponent: function () {
        var me = this;
        me.on("specialkey", me.handleSpecialKey, me);
        me.on("select", me.handleSelect, me);

        me.on("focus", function () {
            me.flush = true;
        });

        me.callParent(arguments);

        // Setting a property to track the Guidewire "none" value
        // Do not use valueNotFoundRecord since it'll conflict with the actual value not found record
        me.gValueNotFoundRecord = me.findRecordByValue('');
    },

    // EXTJS-17248
    // @UpgradedSencha: Always call checkChange on field mutation or the change event can be dropped due to the
    // queryDelay
    onFieldMutation: function(e) {
        var me = this,
            key = e.getKey(),
            isDelete = key === e.BACKSPACE || key === e.DELETE,
            rawValue = me.inputEl.dom.value,
            len = rawValue.length;

        // Do not process two events for the same mutation.
        // For example an input event followed by the keyup that caused it.
        // We must process delete keyups.
        // Also, do not process TAB event which fires on arrival.
        if (!me.readOnly && (rawValue !== me.lastMutatedValue || isDelete) && key !== e.TAB) {
            me.lastMutatedValue = rawValue;
            me.lastKey = key;
            if (len && (e.type !== 'keyup' || (!e.isSpecialKey() || isDelete))) {
                me.doQueryTask.delay(me.queryDelay);
            } else {
                // We have *erased* back to empty if key is a delete, or it is a non-key event (cut/copy)
                if (!len && (!key || isDelete)) {
                    // This portion of code may end up calling setValue will check for change. But since
                    // it's come from field mutations, we need to respect the checkChangeBuffer, so
                    // we suspend checks here, it will be handled by callParent
                    ++me.suspendCheckChange;
                    // Essentially a silent setValue.
                    // Clear our value, and the tplData used to construct a mathing raw value.
                    if (!me.multiSelect) {
                        me.value = null;
                        me.displayTplData = undefined;
                    }
                    // If the value is blank we can't have a value
                    if (me.clearValueOnEmpty) {
                        me.valueCollection.removeAll();
                    }

                    // Just erased back to empty. Hide the dropdown.
                    me.collapse();

                    // There may have been a local filter if we were querying locally.
                    // Clear the query filter and suppress the consequences (we do not want a list refresh).
                    if (me.queryFilter) {
                        // Must set changingFilters flag for this.checkValueOnChange.
                        // the suppressEvents flag does not affect the filterchange event
                        me.changingFilters = true;
                        me.store.removeFilter(me.queryFilter, true);
                        me.changingFilters = false;
                    }
                    --me.suspendCheckChange;
                }
                me.callSuper([e]);
            }
        }
    },

    // Force change handler on select:
    handleSelect: function (comp) {
        var me = this;
        if (me.flush) {
            comp.flushChange();
        }
    },

    /**
     * Work around ext bug where combo may be expanded when nothing is typed in (when alt or ctrl key is on).
     */
    onKeyUp: function (e) {
        if (e.ctrlKey || e.altKey) {
            Ext.form.field.ComboBox.superclass.onKeyUp.call(this, e);
            return false; // do not invoke combo function
        }
        this.callOverridden(arguments)
    },

    handleSpecialKey: function (field, e) {
        var me = this;

        // Only cares about handling tab key
        if (e.getKey() !== e.TAB) {
            return;
        }

        if (gw.app.isLoadMaskVisible()) {
            e.stopEvent();
            return false;
        }
        me.flush = false;
    },

    //@Might be a separate problem from above. Should be tested once the above ticket has been fixed
    assertValue: function() {
        var me = this,
            value = me.getRawValue(),
            displayValue = me.getDisplayValue(),
            rec;

        if (me.forceSelection) {
            if (me.multiSelect) {
                // For multiselect, check that the current displayed value matches the current
                // selection, if it does not then revert to the most recent selection.
                if (value !== displayValue) {
                    me.setRawValue(displayValue);
                }
            } else {
                // For single-select, match the displayed value to a record and select it,
                // if it does not match a record then revert to the most recent selection.
                rec = me.findRecordByDisplay(value);
                if (rec) {
                    // Prevent an issue where we have duplicate display values with
                    // different underlying values.
                    if (me.getDisplayValue([rec.data]) !== displayValue) {
                        me.select(rec, true);
                    }
                } else if (me.lastSelection) {

                    // PLWEB-5663: Allow user to clear value with keyboard
                    if (value || !me.gValueNotFoundRecord) {
                        // Value is present, but not valid. Reset to previous selection
                        me.setValue(me.lastSelection);
                    } else {
                        // Set value to none if value is absent and we have a value not found record
                        me.setValue(value);
                    }
                } else {
                    // We need to reset any value that could have been set in the dom before or during a store load
                    // for remote combos.  If we don't reset this, then ComboBox#getValue() will think that the value
                    // has changed and will then set `undefined` as the .value for forceSelection combos.  This then
                    // gets changed AGAIN to `null`, which will get set into the model field for editors. This is BAD.
                    me.setRawValue('');
                }
            }
        }
        me.collapse();
    },

    // @UpgradedSencha This is a fully overridden function from 5.1.0
    doTypeAhead: function() {
        var me = this,
            Event = Ext.event.Event;
        if (!me.typeAheadTask) {
            me.typeAheadTask = new Ext.util.DelayedTask(me.onTypeAhead, me);
        }
        if (me.lastKey !== Event.BACKSPACE && me.lastKey !== Event.DELETE) {
            me.typeAheadTask.delay(me.typeAheadDelay);
        } else {
            // @UpgradedSencha Manually highlight the record and select the position if it's a backspace
            // avoid triggering an auto select
            var displayField = me.displayField,
                record = me.store.findRecord(displayField, me.getRawValue()),
                boundList = me.getPicker();

            if (record) {
                boundList.highlightItem(boundList.getNode(record));
                me.getPicker().getNavigationModel().setPosition(record);
            }
            // -- End @UpgradedSencha
        }
    },

    // @UpgradedSencha This is a fully overridden function from 5.1.0
    afterQuery: function(queryPlan) {
        var me = this;
        if (me.store.getCount()) {
            var Event = Ext.event.Event;
            var isDelete = me.lastKey === Event.DELETE || me.lastKey === Event.BACKSPACE;
            if (me.typeAhead) {
                me.doTypeAhead();
            }
            // @UpgradedSencha Do not fire auto-select if it's a backspace, it just selects the previous value
            if (!isDelete) {
                if (queryPlan.rawQuery) {
                    if (me.picker && !me.picker.getSelectionModel().hasSelection()) {
                        me.doAutoSelect();
                    }
                } else {
                    me.doAutoSelect();
                }
            }

        }
        me.startCheckChangeTask();
    },

    onValueCollectionEndUpdate: function() {
        var me = this,
            store = me.store,
            selectedRecords = me.valueCollection.getRange(),
            selectedRecord = selectedRecords[0],
            selectionCount = selectedRecords.length;

        me.updateBindSelection(me.pickerSelectionModel, selectedRecords);

        if (me.isSelectionUpdating()) {
            return;
        }

        Ext.suspendLayouts();

        me.lastSelection = selectedRecords;
        if (selectionCount) {
            // Track the last selection with a value (non blank) for use in
            // assertValue
            me.lastSelectedRecords = selectedRecords;
        }

        me.updateValue();

        // If we have selected a value, and it's not possible to select any more values
        // or, we are configured to hide the picker each time, then collapse the picker.
        if (selectionCount && ((!me.multiSelect && store.contains(selectedRecord)) || me.collapseOnSelect || !store.getCount())) {
            me.updatingValue = true;
            me.collapse();
            me.updatingValue = false;
        }
        Ext.resumeLayouts(true);
        if (selectionCount && !me.suspendCheckChange) {
            if (!me.multiSelect) {
                selectedRecords = selectedRecord;
            }
            me.fireEvent('select', me, selectedRecords);
        }
    },

    doSetValue: function(value /* private for use by addValue */, add) {
        var me = this,
            store = me.getStore(),
            Model = store.getModel(),
            matchedRecords = [],
            valueArray = [],
            autoLoadOnValue = me.autoLoadOnValue,
            isLoaded = store.getCount() > 0 || store.isLoaded(),
            pendingLoad = store.hasPendingLoad(),
            unloaded = autoLoadOnValue && !isLoaded && !pendingLoad,
            forceSelection = me.forceSelection,
            selModel = me.pickerSelectionModel,
            displayIsValue = me.displayField === me.valueField,
            isEmptyStore = store.isEmptyStore,
            lastSelection = me.lastSelection,
            i, len, record, dataObj,
            valueChanged, key;

        //<debug>
        if (add && !me.multiSelect) {
            Ext.Error.raise('Cannot add values to non multiSelect ComboBox');
        }
        //</debug>

        // Called while the Store is loading or we don't have the real store bound yet.
        // Ensure it is processed by the onLoad/bindStore.
        // Even if displayField === valueField, we still MUST kick off a load because even though
        // the value may be correct as the raw value, we must still load the store, and
        // upon load, match the value and select a record sop we can publish the *selection* to
        // a ViewModel.
        if (value != null && (pendingLoad || unloaded || !isLoaded || isEmptyStore)) {

            // If they are setting the value to a record instance, we can
            // just add it to the valueCollection and continue with the setValue.
            // We MUST do this before kicking off the load in case the load is synchronous;
            // this.value must be available to the onLoad handler.
            if (!value.isModel) {
                if (add) {
                    me.value = Ext.Array.from(me.value).concat(value);
                } else {
                    me.value = value;
                }

                me.setHiddenValue(me.value);

                // If we know that the display value is the same as the value, then show it.
                // A store load is still scheduled so that the matching record can be published.
                me.setRawValue(displayIsValue ? value : '');
            }

            // Kick off a load. Doesn't matter whether proxy is remote - it needs loading
            // so we can select the correct record for the value.
            //
            // Must do this *after* setting the value above in case the store loads synchronously
            // and fires the load event, and therefore calls onLoad inline.
            //
            // If it is still the default empty store, then the real store must be arriving
            // in a tick through binding. bindStore will call setValueOnData.
            if (unloaded && !isEmptyStore) {
                store.load();
            }

            // If they had set a string value, another setValue call is scheduled in the onLoad handler.
            // If the store is the defauilt empty one, the setValueOnData call will be made in bindStore
            // when the real store arrives.
            if (!value.isModel || isEmptyStore) {
                return me;
            }
        }

        // This method processes multi-values, so ensure value is an array.
        value = add ? Ext.Array.from(me.value).concat(value) : Ext.Array.from(value);

        // Loop through values, matching each from the Store, and collecting matched records
        for (i = 0, len = value.length; i < len; i++) {
            record = value[i];

            // Set value was a key, look up in the store by that key
            if (!record || !record.isModel) {
                record = me.findRecordByValue(key = record);

                // The value might be in a new record created from an unknown value (if !me.forceSelection).
                // Or it could be a picked record which is filtered out of the main store.
                // Or it could be a setValue(record) passed to an empty store with autoLoadOnValue and aded above.
                if (!record) {
                    record = me.valueCollection.find(me.valueField, key);
                }
            }
            // record was not found, this could happen because
            // store is not loaded or they set a value not in the store
            if (!record) {
                // If we are allowing insertion of values not represented in the Store, then push the value and
                // create a new record to push as a display value for use by the displayTpl
                if (!forceSelection) {

                    // We are allowing added values to create their own records.
                    // Only if the value is not empty.
                    if (!record && value[i]) {
                        dataObj = {};
                        dataObj[me.displayField] = value[i];
                        if (me.valueField && me.displayField !== me.valueField) {
                            dataObj[me.valueField] = value[i];
                        }
                        record = new Model(dataObj);
                    }
                }
                // Else, if valueNotFoundText is defined, display it, otherwise display nothing for this value
                else if (me.valueNotFoundRecord) {
                    record = me.valueNotFoundRecord;
                }
            }
            // record found, select it.
            if (record) {
                matchedRecords.push(record);
                valueArray.push(record.get(me.valueField));
            }
        }

        // If the same set of records are selected, this setValue has been a no-op
        if (lastSelection) {
            len = lastSelection.length;
            if (len === matchedRecords.length) {
                for (i = 0; !valueChanged && i < len; i++) {
                    if (Ext.Array.indexOf(me.lastSelection, matchedRecords[i]) === -1) {
                        valueChanged = true;
                    }
                }
            } else {
                valueChanged = true;
            }
        } else {
            valueChanged = matchedRecords.length;
        }

        if (valueChanged) {
            // beginUpdate which means we only want to notify this.onValueCollectionEndUpdate after it's all changed.
            me.suspendEvent('select');
            me.valueCollection.beginUpdate();
            if (matchedRecords.length) {
                selModel.select(matchedRecords, false);
            } else {
                selModel.deselectAll();
            }
            me.valueCollection.endUpdate();
            me.resumeEvent('select');
        } else {
            me.updateValue();
        }

        return me;
    },

    getDisplayValue: function(tplData) {
        tplData = tplData || this.displayTplData;
        return this.applyDisplayTpl(this.displayTpl).apply(tplData);
    },

    applyDisplayTpl: function(displayTpl) {
        var me = this;

        if (!displayTpl) {
            displayTpl = new Ext.XTemplate(
                '<tpl for=".">' +
                '{[typeof values === "string" ? values : values["' + me.getDisplayField() + '"]]}' +
                '<tpl if="xindex < xcount">' + me.getDelimiter() + '</tpl>' +
                '</tpl>'
            );
        } else if (!displayTpl.isTemplate) {
            displayTpl = new Ext.XTemplate(displayTpl);
        }
        return displayTpl;
    },

    onUnbindStore: function() {
        var me = this,
            picker = me.picker,
            filter = me.queryFilter;

        // If we'd added a local filter, remove it.
        // Listeners are unbound, so we don't need the changingFilters flag
        if (filter && !me.store.isDestroyed) {
            me.changingFilters = true;
            me.getStore().removeFilter(filter, true);
            me.changingFilters = false;
        }
        me.pickerSelectionModel.destroy();
        if (picker) {
            picker.bindStore(null);
        }
    }
});

Ext.define('Ext.override.form.field.ComboBox.PLWEB-4758',{
    override: 'Ext.form.field.ComboBox',
    doLocalQuery: function(queryPlan) {
        var me = this,
            queryString = queryPlan.query,
            store = me.getStore(),
            filter = me.queryFilter;

        me.queryFilter = null;

        // Must set changingFilters flag for this.checkValueOnChange.
        // the suppressEvents flag does not affect the filterchange event
        me.changingFilters = true;
        if (filter) {
            store.removeFilter(filter, true);
        }

        // Querying by a string...
        if (queryString) {
            filter = me.queryFilter = new Ext.util.Filter({
                id: me.id + '-filter',
                anyMatch: me.anyMatch,
                caseSensitive: me.caseSensitive,
                root: 'data',
                property: me.displayField,
                value: me.enableRegEx ? new RegExp(queryString) : queryString
            });
            store.addFilter(filter, true);
        }
        me.changingFilters = false;

        // Expand after adjusting the filter if there are records or if emptyText is configured.
        if (me.store.getCount() || me.getPicker().emptyText) {
            // The filter changing was done with events suppressed, so
            // refresh the picker DOM while hidden and it will layout on show.
            me.getPicker().refresh();
            me.expand();
        } else {
            me.collapse();
        }

        me.afterQuery(queryPlan);
    },

    updateValue: function() {
        var me = this,
            selectedRecords = me.valueCollection.getRange(),
            len = selectedRecords.length,
            valueArray = [],
            displayTplData = me.displayTplData || (me.displayTplData = []),
            inputEl = me.inputEl,
            i, record;


        if (me.shouldRestoreLastValidValue && selectedRecords.length === 0 && me.lastSelectedRecords && me.lastSelectedRecords.length > 0) {
            selectedRecords = me.lastSelectedRecords;
            len = selectedRecords.length;
        }

        // Loop through values, matching each from the Store, and collecting matched records
        displayTplData.length = 0;
        for (i = 0; i < len; i++) {
            record = selectedRecords[i];
            displayTplData.push(record.data);

            // There might be the bogus "value not found" record if forceSelect was set. Do not include this in the value.
            if (record !== me.valueNotFoundRecord) {
                valueArray.push(record.get(me.valueField));
            }
        }

        // Set the value of this field. If we are multiselecting, then that is an array.
        me.setHiddenValue(valueArray);
        me.value = me.multiSelect ? valueArray : valueArray[0];
        if (!Ext.isDefined(me.value)) {
            me.value = undefined;
        }
        me.displayTplData = displayTplData; //store for getDisplayValue method

        if (inputEl && me.emptyText && !Ext.isEmpty(me.value)) {
            inputEl.removeCls(me.emptyCls);
        }

        // Calculate raw value from the collection of Model data
        me.setRawValue(me.getDisplayValue());
        me.checkChange();

        me.applyEmptyText();
    }
});
