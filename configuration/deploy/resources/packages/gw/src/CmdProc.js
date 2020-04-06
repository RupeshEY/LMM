/**
 * Process any command from the server
 */
Ext.define('gw.CmdProc', {
    singleton: true,
    requires: ['Ext.ComponentManager', 'gw.app', 'Ext.data.StoreManager'],
    uses: [
        'Ext.ux.form.MultiSelect', 'Ext.ux.form.ItemSelector', 'Ext.form.CheckboxGroup', 'gw.doc.Management', 'Ext.JSON',
        'gw.reflection'
    ],

    /**
     * Internal function used by replaceMatches and hideMatches; which have very similar logic for
     * finding the matches
     *
     * @param cmdInfo
     * @param isReplace the flag to indicate whether the matches should be replaced with the items defined in cmdInfo or not
     */
    replaceOrHideMatches: function(cmdInfo, isReplace) {
        var target = cmdInfo.target,
            comp = Ext.ComponentManager.get(target),
            targetEndId = target + "::end",
            endComp = Ext.ComponentManager.get(targetEndId),
            owner = comp.ownerCt,
            items = comp.ownerCt.items,
            compIndex = -1;

        items.each(function (item, index) {
            if (compIndex == -1) {
                if (item.id == target) {
                    compIndex = index;
                    if (isReplace) {
                        owner.remove(item);
                    } else {
                        item.hide();
                    }
                    // if there is no end marker, then there is no item inside the inputSet
                    if (!endComp) {
                        return false;
                    }
                }
            } else {
                owner.remove(item);
                if (item.id == targetEndId) {
                    return false;
                }
            }
            return true;
        });

        // Add the items.
        if (isReplace) {
            Ext.each(cmdInfo.items, function (item) {
                owner.insert(compIndex++, item);
            })
        }
    },

    //
    // public methods:
    //
    updateAppConfig : function(cmdInfo) {
        gw.app.updateConfig(cmdInfo.config);
    },

    exitPoint : function(cmdInfo) {
        if (cmdInfo.popup) {
            gw.app.openPopup(cmdInfo.url, cmdInfo.target, cmdInfo.features);
        } else if (cmdInfo.method == 'POST') {
            var form = document.createElement('form');
            form.action = cmdInfo.url;
            form.method = 'POST';
            form.target = '_top';

            for (var name in cmdInfo.parameters) {
                if (cmdInfo.parameters.hasOwnProperty(name)) {
                    var input = document.createElement('input');
                    input.type = 'hidden';
                    input.name = name;
                    input.value = cmdInfo.parameters[name];
                    form.appendChild(input);
                }
            }

            document.body.appendChild(form);
            form.submit();
        } else {
            gw.app.replaceLocation(cmdInfo.url);
        }
    },

    showErrors : function(cmdInfo) {
        gw.app.showAlert(cmdInfo.errors.join('\n'));
    },

    /**
     * Replaces all child items of the target component
     * @param cmdInfo command info
     */
    replaceItems : function(cmdInfo) {
        var comp = Ext.ComponentManager.get(cmdInfo.target);
        gw.Util.replaceItems(comp, cmdInfo);
    },

    /**
     * Update comp properties
     * @param cmdInfo
     */
    updateProp : function(cmdInfo) {
        var comp = Ext.ComponentManager.get(cmdInfo.target);
        gw.Util.updateProp(comp, cmdInfo);
    },

    /**
     * Replaces the given target item.
     * @param cmdInfo
     */
    replace : function (cmdInfo) {
        var comp = Ext.ComponentManager.get(cmdInfo.target);
        if (comp == null) {
            gw.app.showAlert(gw.app.localize("ExtJS.Alert.WidgetReplaceFailed", cmdInfo.target));
            return;
        }
        var owner = comp.ownerCt;
        var index = owner.items.indexOf(comp);

        if (!cmdInfo.items) {
            gw.Debug.log("Received 'replace' cmd but no items were included to replace");
        } else if (cmdInfo.items.length != 1) {
            gw.Debug.log("Received 'replace' cmd but more than one item was sent (#items: " +
                cmdInfo.items.length + ")");
        } else {

            //@UpgradedSencha 5.1
            //Break out of from callback loop and start layouts fresh on a separate cycle

            //Changed due to charts not rendering in GW
            //There is no bug in Ext as it works fine in the fiddle, as such we can't fill any ticket
            //Changing chart type dynamically works in fiddle
            //https://fiddle.sencha.com/#fiddle/igr
            Ext.defer(function() {
                // Remove the old component
                owner.remove(comp);

                // Put the new component in the same place
                owner.insert(index, cmdInfo.items[0]);
                owner.updateLayout(); //@UpgradedSencha 5.1 Should be no longer needed, but it seems to be
            }, gw.ThemingConstants.cmdProcLayoutDelay);
        }
    },

    /**
     * Hides the target component
     * @param cmdInfo command info
     */
    hide : function(cmdInfo) {
        var comp = Ext.ComponentManager.get(cmdInfo.target);

        if (comp.isVisible()) {
            if (comp.height) {
                comp.height = comp.getHeight(); // remember the latest height
            }
            comp.hide();
            if (comp.removeAll && !cmdInfo.keepContent) {
                comp.removeAll(); // remove child items
            }
        }
    },

    /**
     * Replaces target and items between the target begin marker and end marker.
     * @param cmdInfo command info
     */
    replaceMatches : function(cmdInfo) {
        this.replaceOrHideMatches(cmdInfo, true);

    },

    /**
     * Hides target and items between the target begin marker and end marker.
     * @param cmdInfo command info
     */
    hideMatches : function(cmdInfo) {
        this.replaceOrHideMatches(cmdInfo, false);
    },

    /**
     * Updates store data
     * @param cmdInfo command info
     * @param response response
     * @param requestOptions request options
     */
    updateData : function(cmdInfo, response, requestOptions) {
        // retrieve the data operation from the request, if any:
        var operation = requestOptions ? requestOptions.operation : undefined;
        Ext.iterate(cmdInfo.data, function(key, value){
            var comp = Ext.ComponentManager.get(key);    // the current component
            var store = Ext.data.StoreManager.get(key);  // again, the current component
            gw.Util.updateStore(
                store,
                value,
                // The "operation" only applies to the store which triggered the original request: TODO! This may be different from the current component!!
                (operation && operation.viewRootId == (comp ? (comp.dataUrl || comp.id) : store.storeId)) ? operation : null
            );
        })
    },

    /**
     * Removes a component by id
     * @param cmdInfo
     */
    remove : function (cmdInfo) {
        var comp = Ext.ComponentManager.get(cmdInfo.id);
        comp.ownerCt.remove(comp);
    },

    disable : function(cmdInfo){
        var comp = Ext.ComponentManager.get(cmdInfo.id);
        if (comp.hideMenu) {
            comp.hideMenu();
        }
        if(cmdInfo.invalidateOwnerCtChecksum && comp.ownerCt.checksum){
            comp.ownerCt.checksum = 'checksumInvalidated';
        }
        comp.setDisabled(true);
    },

    updateProgBar : function(cmdInfo) {
        if (cmdInfo.target) {
            var comp = Ext.ComponentManager.get(cmdInfo.target);
            if (comp && comp.updateProgBar) {
                comp.updateProgBar(cmdInfo);
            }
        }
    },

    focusId : function(cmdInfo) {
        gw.app.onFocus(cmdInfo.target);
    },

    /**
     * handle selection and focus for a newly added row in a LV
     * @param cmdInfo The command, containing the row to focus on and the container ID
     */
    focusDataRecordIndex: function(cmdInfo){
        var targetRow = parseInt(cmdInfo.rowIndex, 10);
        var cellId = cmdInfo.gwCellId,
            rowParentId = cmdInfo.id,
            columnPos = 0;

        //isNaN is safe to use here due to the parseInt call
        targetRow = isNaN(targetRow) ? -1 : targetRow;

        if (rowParentId && targetRow >= 0) {
            if (cellId) {
                var grid = gw.GridUtil.getGridById(rowParentId);
                // find the column position based on the gwCellId.
                columnPos = gw.GridUtil.getColumnPosition(grid, targetRow, cellId);
            }
            gw.app.onFocusDataRecordIndex(targetRow, columnPos, rowParentId);
        }

    },

    updateValues : function(cmdInfo, response) {
        if (!cmdInfo.items) {
            return;
        }
        for (var i = 0; i < cmdInfo.items.length;i++) {
            var item = cmdInfo.items[i];
            var comp = Ext.ComponentManager.get(item.id);
            if (comp == null) {
                gw.app.showAlert(gw.app.localize("ExtJS.Alert.WidgetUpdateFailed", item.id));
                continue;
            }
            if (item.value !== undefined) {
                // ExtJS4 upgrade: do not fire change events when value is set form the server.
                // @SenchaUpgrade setRawValue() as suggested in ExtJS4 doc won't work for combo, any other way?
                comp.suspendEvents(false);
                if (comp instanceof Ext.ux.form.MultiSelect || comp instanceof Ext.ux.form.ItemSelector) {
                    comp.setValue(gw.Util.decodeValue(item.value));
                } else {
                    if (comp.xtype == 'privacy' && item.value.length > 0) {
                        comp.resetEncryption();
                    }
                    comp.setValue(item.value)
                }
                comp.resumeEvents();
            }
            if (item.store) {
                if (comp.store) {
                    comp.suspendEvents(false);
                    var curValue;
                    if (comp instanceof Ext.ux.form.MultiSelect) {
                        curValue = comp.getValue()
                    }
                    gw.Util.updateStore(comp.store, item.store);
                    if (comp instanceof Ext.ux.form.MultiSelect) {
                        comp.setValue(curValue)
                    }
                    comp.resumeEvents();
                } else {
                    gw.Debug.log("Cannot update the store for " + item.id + ", whose xtype is " + comp.xtype)
                }
            }

            if (comp instanceof Ext.form.CheckboxGroup && item.items) {
                var ownerCt = comp.ownerCt;
                var index = ownerCt.items.indexOf(comp);
                ownerCt.remove(comp);
                ownerCt.insert(index,item);
            }
        }
    },

    /**
     * Updates sum value of a grid column
     */
    updateSum : function(cmdInfo, response, requestOptions) {
        // The alt text formatting and other formatting should happen in one place in Ext Grid, like in ExtGrid#_updateSum.
        var sumHTML = [cmdInfo.sum || ''];
        if (cmdInfo.altSum) {
            sumHTML.push('<div class="');
            sumHTML.push(gw.Util.getAltValueClass());
            sumHTML.push('">');
            sumHTML.push(cmdInfo.altSum);
            sumHTML.push('</div>');
        }

        var data = {};
        var columnName = requestOptions.fieldMapping;
        data[columnName] = {};
        data[columnName].text = sumHTML.join('');
        if (cmdInfo.cls) {
            data[columnName].cls = cmdInfo.cls;
        }
        var grid = Ext.ComponentManager.get(requestOptions.gridId);
        grid.updateSummaryData(requestOptions.grouper, data);
    },

    reflectionInit : function(cmdInfo) {
        gw.reflection.init(cmdInfo.metaMap, cmdInfo.append, cmdInfo.lvIds);
    },

    warnUnsavedWork : function(cmdInfo) {
        gw.app.setWarnUnsavedWork(cmdInfo.unsavedWork);
    },

    /**
     * Updates footer alt value
     * @param cmdInfo
     */
    updateAlt : function(cmdInfo, response, requestOptions) {
        if (requestOptions.altValRec) { // grid cell
            var record = requestOptions.altValRec[0];
            var name = requestOptions.altValRec[1];

            var value = Ext.apply({}, record.get(name));
            value.altVal = {text:cmdInfo.text, value:cmdInfo.value};
            // Delete existing styles, add body style as cell style
            if (value.cls) {
                delete value.cls;
            }
            if (cmdInfo.fieldBodyCls) {
                value.cls = cmdInfo.fieldBodyCls;
            }

            // @SenchaUpgrade Call base get method:
            Ext.data.Model.prototype.set.call(record, name, value);

        } else if (requestOptions.altValComp) { // form field
            var comp = requestOptions.altValComp;
            comp.setAltValue(cmdInfo.text, cmdInfo.value);
            // Update form style class
            gw.Util.clearDescendentStyleClasses(comp);
            if (cmdInfo.fieldBodyCls) {
                comp.addCls(cmdInfo.fieldBodyCls);
            }
        }
    },

    /**
     * Notifies the app to restore previous scroll position at the end of processing this response.
     *
     * NOTE: Has to wait till after resumeLayouts() at the end of processing, before restore scrolling. Otherwise, it's ignored by ExtJs.
     */
    restoreScroll : function(cmdInfo, response, requestOptions) {
        requestOptions.scrollPositions = gw.Util.decodeValue(Ext.String.htmlDecode(cmdInfo.scrollPositions)); // use requestOptions to track "request scope"
    },

    /**
     * Document command
     */
    docCmd : function(cmdInfo, response, requestOptions) {
        gw.doc.Management.handleResponse(cmdInfo, response, requestOptions);
    },

    /**
     * Records the response time sent from the server
     */
    serverResponseTime : function(cmdInfo, response, requestOptions) {
        gw.app.setServerRequestId(cmdInfo.serverRequestId);
    },

    /**
     * Checks that server version matches client version
     */
    serverVersion: function(cmdInfo, response, requestOptions) {
        gw.app.checkVersion(cmdInfo.serverVersion);
    },

    /**
     * Forward the user to a static html.
     *
     * PLWEB-6201
     * @param cmdInfo
     */
    serverDown : function(cmdInfo) {
      window.location.replace(cmdInfo.url)
    }
});
