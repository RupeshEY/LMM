/**
 * Util class for common ExtJs operations. This file needs to be included before other ExtJs files.
 * @UpgradedSencha  Cleanup class implementation, refactor namespace and related files.
 */
Ext.define('gw.Util',  {
    singleton: true,
    requires: [
        'Ext.menu.MenuMgr',
        'Ext.form.CheckboxGroup',
        'Ext.JSON',
        'Ext.form.field.Display',
        'Ext.util.TextMetrics',
        'Ext.ComponentManager'
    ],
    uses: ['gw.app'],

    getTabBarLinksId : function() {
        return ':tblinks';
    },

    getTabsId : function() {
        return ':tabs';
    },

    getInfoBarId : function() {
        return 'infoBar';
    },

    getSystemAlertBarId : function() {
        return 'systemAlertBar';
    },

    eachDescendentRec: function(id, fn, depth) {
        if (id) {
            if (!fn(id, depth)) {
                return false;
            }

            if (id.children) {
                for (var i = 0; i < id.children.length; i++) {
                    var child = id.children[i];
                    if (!this.eachDescendentRec(child, fn, depth + 1)) {
                        return false;
                    }
                }
            }
        }

        return true;
    },

    /**
     * check whether the menuitems are loaded to the menu yet.
     * ExtJs sometimes still renders the items as containers even the menuitem is not loaded to the menu.
     *
     * @param owner
     * @return {Boolean}
     */
    hasMenuItem: function(owner) {
        var hasMenuItem = false;
        Ext.each(owner.menu.items.items, function (item) {
            if (item.xtype == 'gmenuitem' || item.xtype == 'menu') {
                hasMenuItem = true;
                return false;
            }
        });
        return hasMenuItem;
    },
    /**
     * Set the value of a radio group, given a string value. Normally the string value matches the
     * input value of one of the radio buttons and that button is set (implicitly clearing the others).
     * But null handling is tricky because the radio group setValue call cannot be used to clear all
     * values from the group. To make things worse our reflection arrays represent null by the empty
     * string which is ambiguous in the (very rare) case where the empty string is a valid input value
     * for a button in the radio group. So if the value is the empty string and the radio group does not
     * have the empty string as a valid input value we clear all radio buttons. Otherwise we set the
     * radio button with the given input value, implicitly clearing all the others.
     * @param comp a radio group
     * @param value string input value of the radio button in the group that is to be set
     */
    setRadioGroupValue: function(comp, value) {
        if (value == "" && !gw.Util.radioGroupContainsEmptyValue(comp)) {
            comp.eachBox(function(box) {
              box.setValue(false);
            });
        } else {
            // setValue expects { radioGroupId:value }; it sets just the button with the matching input value
            var radioValue = {};
            radioValue[comp.id] = value;
            comp.setValue(radioValue);
        }
    },

    radioGroupContainsEmptyValue: function(comp) {
        var containsEmpty = Ext.Array.some(comp.getBoxes(), function(box) {
            return box.inputValue === "";
        });
        return containsEmpty;
    },

    /**
     * appends an item and child items under its menu to the array
     * @param item item with menu
     * @param to an array
     */
    appendAndFlattenMenu : function(item, to) {
        to.push(item);
        if (item.menu) {
            var subMenu = Ext.isArray(item.menu) ? item.menu : item.menu.items;
            if (subMenu) {
                Ext.each(subMenu, function(sub) {
                    to.push(sub)
                });
                delete item.menu;
                item.menu = undefined;

                // apply header style to "componentCls", to avoid overriding default "cls" at Class level which indicates server action
                if (item.componentCls) {
                    item.componentCls += ' g-menu-header'
                } else {
                    item.componentCls = 'g-menu-header'
                }
                if (item.noaction) {
                    item.canActivate = false; // do not active an item that does not have submenu or server action
                }
            }
        }
    },

    menuLoaded : function(owner) {
        // if there is any item has xtype=='gmenuitem', it means menuItems are already loaded.
        if (!(owner.ondemandmenu && owner.menu &&
            (owner.menu.items == null || owner.menu.items.length == 0 || !this.hasMenuItem(owner) ))) {
            return true;
        }
        return false;
    },

    /**
     * fetches menu content when expanding for the first time
     * @param owner owner of the menu
     */
    createAndShowOnDemandMenuIfNeeded : function(owner) {
        if (this.menuLoaded(owner)) {
            return; // no ondemand menu
        }

        var menu = owner.menu;
        if (menu.el && menu.el.hasCls(gw.app.getPanelLoadingCls()) ||
            menu.cls && menu.cls.indexOf(gw.app.getPanelLoadingCls()) >= 0) {
            return;
        }
        // Add a container, this is used for menupanel,
        // it's essentially removed in other cases because
        // we reconstruct the menu.
        menu.add({xtype:'container'});

        var p = menu.items.get(0);
        p.addCls(gw.app.getPanelLoadingCls());

        // AHK - 1/31/2013 - Once an on-demand menu has been opened, we need to invalidate the checksum so that
        // it will be re-rendered on future requests.  Otherwise, the menu items will be cached client-side, even
        // if they should be changed
        owner.checksum = 'checksumInvalidated';
        gw.app.requestViewRoot(owner.id, undefined, undefined, {callback:function(options, success, response) {
            if (gw.app.wasUnsuccessfulAjaxStatusHandled(success, response)) {
                return;
            }

            p.removeCls(gw.app.getPanelLoadingCls());
            var oldMenu = owner.menu,
                props = Ext.decode(response.responseText);
            if (oldMenu.isVisible()) {
                oldMenu.hide();  // hide the fake sub menu, before override it with real content
            }

            oldMenu.destroy(); // Now destroy this menu since we are about to build the proper one

            // Need to construct a new menu with the same ID because the initComponent
            // logic in the menu override determines the layout.
            // @UpgradeSencha - Use the proper name of the menu manager class
            owner.menu = Ext.applyIf(Ext.menu.Manager.get(menu.cloneConfig({id: oldMenu.id,
                items: props.items || [{text:gw.app.localize('ExtJS.Menu.Empty'), disabled: true}]
            })), {openerId: oldMenu.openerId});

            var opener = owner.menuOpener || owner;

            if (opener.showMenu) {
                if (owner.menuOpener && owner.menuOpener.cmp) {
                    // this menu created by helperitem, so call with the right scope
                    opener.showMenu.call(owner.menuOpener.cmp);
                } else {
                    opener.showMenu();
                }
            } else if (owner.expandMenu) {
                owner.expandMenu(0);
            }
        }}, /*bChildrenOnly*/true)
    },
    /**
     * Get the field value in the display format.
     * This function gets called for UI string display and client reflection.
     * @param comp extjs component
     */
    getFieldValue : function(comp) {
        // TODO PL-18534: It seems that the client display format is also the posted server format (though not
        // by calling this function). For instance, the submitted date is 11/23/2011 for 23 Nov 2011.
        // The server should communicate in a canonical data format, for instance the ISO 8601 date format would be
        // a sensible choice for canonical date formats: 2011-11-23
        var value = comp.getValue();
        if (value) {
            if (comp instanceof Ext.form.CheckboxGroup) {
                value = comp.id in value ? value[comp.id] : ''; // unbox
            } else if (value instanceof Date) {
                value = comp.getRawValue(); // to avoid date being formatted using browser's default format
            } else if (comp.xtype == 'multiselect' || comp.toMultiselect) { // shuttle
                if (Ext.isString(value)) {
                    value = Ext.JSON.decode(value);
                }
            }
        }
        return value === null ? '' : value;
    },

    /**
     * Decode the value from string to object
     * @param value
     * @returns decoded value as an object
     */
    decodeValue : function(value) {
        if(value && Ext.isString(value)) {
            value = Ext.JSON.decode(value)
        }
        return value;
    },

    /**
     * Replaces content of a component.  The callers of this method are responsible for wrapping calls to this
     * method with suspendLayouts()/resumeLayouts() appropriately
     * @param comp component
     * @param props new properties of the component
     */
    replaceItems : function(comp, props) {
        // Replace all items.
        comp.removeAll();

        // If there are items to add, add them
        if (props.items) {
            comp.add(props.items);
        }

        // Then update other properties
        gw.Util.updateProp(comp, props);
    },

    /**
     * Updates component properties and force layout
     * @param comp component
     * @param props properties
     */
    updateProp : function(comp, props) {
        // Process non-children attributes which may depend on new child items:
        if (comp.updateProps) {
            comp.updateProps(props); // the comp wishes to process all props in a certain order
        } else {
            Ext.iterate(props, function(key, value) {
                if (key != "items") {
                    // capitalize the first char, but retain case of rest of the string:
                    var setter = comp['set' + key.charAt(0).toUpperCase() + key.substr(1)];
                    if (Ext.isFunction(setter)) {
                        setter.apply(comp, [value])
                    }
                }
            })
        }

        if (!comp.isVisible()) {
            comp.show();
            if (comp.height && comp.height != comp.getHeight()) {
                comp.setHeight(comp.height)
            }
        }
    },

    /**
     * Walk each descendent (child and grand children) of the given element
     * @param {String/Element/HTMLElement} id locator string id, element or dom node.
     * @param {Function} fn function to call: fn(dom, depth): boolean. Return false to
     * stop iteration, true to keep iterating
     * @param {HTMLElement} fn.dom is the currently visited dom node
     * @param {Integer} depth the current depth to root node
     */
    eachDescendent: function(id, fn) {
        if (!fn) {
            return;
        }

        if (Ext.isString(id)) {
            id = Ext.ComponentManager.get(id);
        }
        if (id && id.el) {
            id = id.el;
        }
        if (id && id.dom) {
            id = id.dom;
        }

        if (id) {
            this.eachDescendentRec(id, fn, 0);
        }
    },

    /**
     * Clears all gw- style classes from the given element
     * @param {Element/HTMLElement} element
     */
    clearStyleClasses: function(element) {
        if (element && element.el) {
            element = element.el;
        }
        if (element && element.dom) {
            var styles = element.dom.className;
            if (styles) {
                styles = styles.split(" ");
            }
            for (var i = 0; i < styles.length; i++) {
                var style = styles[i];
                if (style.indexOf("gw-") == 0) {
                    element.removeCls(style);
                }
            }
        }
    },

    /**
     * Clear all gw- style classes from the given element and its descendents
     * @param {Element/HTMLElement} element
     */
    clearDescendentStyleClasses: function(element) {
        var self = this;
        this.eachDescendent(element, function(descendent, depth) {
            descendent = Ext.Element.get(descendent);
            self.clearStyleClasses(descendent);
            return true;
        });
    },

    getValueByIds : function(ids) {
        var values = [];
        Ext.each(ids, function(id) {
            var comp = Ext.ComponentManager.get(id);
            values.push(gw.Util.getFieldValue(comp))
        });
        return values
    },

    /**
     * Sets the value for the component, and fires change event if value changes
     * @param {Ext.Component} comp the component to set the value to
     * @param {Object/String} value the simple display value or complex value object to set.
     * The simple value should be available as value.value
     */
    setValue : function(comp, value) {
        var complexValue = value,
            i;

        if (value && value.value !== undefined) {
            value = value.value;
        }

        if (comp.toField) { // shuttle
            // remove all selected items:
            var toList = comp.toField.boundList;
            var fromList = comp.fromField.boundList;

            toList.getSelectionModel().selectAll();
            comp.onRemoveBtnClick();
            // items removed from toList still remained selected in fromList. so need to deselect from fromList
            fromList.getSelectionModel().deselectAll();
            // add new values:
            var indexes = [];
            for (i = 0; i < value.length; i ++) {
                indexes.push(fromList.getStore().find(comp.valueField, value[i]));
            }
            for (i = 0; i < indexes.length; i ++) {
                fromList.getSelectionModel().select(indexes[i], true, true);
            }
            comp.onAddBtnClick();

        } else {
            // Change the component style if any. Clear any gw- styles that have been set
            if (comp instanceof Ext.form.field.Display && comp.inputEl) {
                // Clear also all styles from the full form field, not just the input element
                this.clearDescendentStyleClasses(comp);
                if (complexValue && complexValue.cls) {
                    comp.inputEl.addCls(complexValue.cls);
                }
            }

            // Update editValue if it has already been set.
            // editValue represents the modal value (smoke test value).
            // All other fields like text, value, rawValue are variations on the display value (smoke test display text)
            if (comp.editValue != null) {
                comp.editValue = value;
            }

            if (comp instanceof Ext.form.field.Date && Ext.isString(value) && comp.valueToRaw(value) != value) {
                comp.setRawValue(value); // bypass validation to allow invalid user value
            } else if (comp instanceof Ext.form.RadioGroup && Ext.isString(value)) {
                gw.Util.setRadioGroupValue(comp, value);
            } else {
                comp.setValue(value); // fires change event
            }
        }
    },

    /**
     * Get or create a dependent field menu given the menu's owner component's id. If there is no menu
     * for the matching menu, one is created from the given menu configuration
     * @param {String} openerId the menu owner's id
     * @param {Object} menuCfg the menu configuration object
     * @return {Ext.menu.Menu} existing or newly created Ext.menu.Menu component
     */
    getOrCreateFieldMenu: function(openerId, menuCfg) {
        var menuId = openerId + "-fieldMenu";
        var menu = Ext.ComponentManager.get(menuId);

        if (!menu) {
            menuCfg.id = menuId;
            menu = new Ext.menu.Menu(menuCfg);
        }

        return menu;
    },

    limitSortListToGridSortLimit: function(sortList, grid) {
        if (sortList) {
            var numSortColumnsSupported = 1;
            if (grid && grid.multiColumnSort) {
                numSortColumnsSupported = Ext.util.Sortable.multiSortLimit;
            }
            // PLWEB-5855: To be compatible with Emerald, when multiple sorters are provided by the server,
            // but the grid does not support that many sorters (either single or multiple with a limit),
            // we slice out the supported number of sort columns from the original sortList
            return sortList.slice(0, numSortColumnsSupported);
        } else {
            return sortList;
        }
    },
    /**
     * Updates store data and options
     * @SenchaUpgrade This method mimics the TreeStore/Store onProxyLoad() method only with a lot more
     *                specialized code.  Keep it in sync with these two versions of the method on upgrade
     * @param store store
     * @param value data
     * @param operation [optional] the data operation
     */
    updateStore : function (store, value, operation) {
        var val = value.options ? Ext.clone(value.options) : {},
            reader = store.getProxy().getReader(),
            i, len;

        if(!store){
            return false;
        }
        var cmp = Ext.ComponentManager.get(store.storeId);

        if(val.sort){
            // PLWEB-5855: limit the sort list provided from the server to that supported by the grid (or 1 if the
            // component does not have an ownerGrid)
            val.sort = gw.Util.limitSortListToGridSortLimit(val.sort, cmp ? cmp.ownerGrid : null);

            var sorters = store.getSorters(),
                n = 0,
                nLen = val.sort.length,
                arr = [],
                prev, next;

            // in the case of sorting a grouped column, group information is in value.grouper and it is not part of the val.sort.
            // We need to add group information to val.sort so it can be compared with the client side sorters.
            if (nLen < sorters.length && val.grouper) {
                nLen = val.sort.unshift(val.grouper);
            }

            for(; n < nLen; n++) {
                prev = sorters.items[n]; // Sorting that user wants
                next = val.sort[n]; //Sorting that server enforces after POC

                //resort only if different order of sorters is important
                if( !(prev && prev.getDirection() === next.direction && prev.getProperty() === next.property) ) {
                    arr.push(next);
                }
            }

            if(arr.length > 0) {
                store.sort(arr);
            }

            delete val.sort;
        }

        if(val.limit) {
            val.pageSize = val.limit;
            delete val.limit;
        }

        //there is no property start on store
        if(val.start) {
            delete val.start;
        }

        Ext.apply(store, val);

        //---------

        // load data and retain options
        if (store.root && !value[store.root]) {
            value[store.root] = []
        }

        var r = reader.readRecords(value);
        // @SenchaUpgrade force sync up sort state from server before load records (in case sort changed by server):

        var bTreeStore = store.fillNode != null; // Is this a TreeStore?

        if (bTreeStore) {
            var treePanel = Ext.ComponentManager.get(store.storeId);
            var node = operation && operation.config ? operation.config.node : treePanel.getRootNode();
            node.set('loading', false);
            // @UpgradedSencha 5.1 - Fix issue with timing issues when emptying and reloading tree nodes from the
            // server.  This issue appeared when we upgraded 5.1
            if (store.getClearOnLoad()) { // entire tree loaded from the server:
                // Seems to be bad timing going on here as removing all nodes and adding new ones works just fine.
                // Can't reproduce using Sencha Fiddle either so we can't file a bug.
                // As a workaround we will be removing all nodes and then adding new ones in

                // First, recursively remove all nodes with layouts suspended
                Ext.suspendLayouts();

                for (i = 0, len = node.childNodes.length; i < len; i++) {
                    node.removeChild(node.getChildAt(0), false, false); // prevent events each node from firing
                }
                // Then, add new ones
                for (i = 0, len = r.records.length; i < len; i++) {
                    node.appendChild(r.records[i], true); // prevent events from each node from firing
                }
                // Finally, resume layouts
                Ext.resumeLayouts(true);

            } else {
                r.records = store.fillNode(node, r.records);
            }

            store.fireEvent('read', store, node, r.records, true);
            store.fireEvent('load', store, node, r.records, true);
            if (!operation) {
                // clear client toggle state when entire RowTree is updated from server.
                // perform this after firing events.
                treePanel.clearFoldersToggled();
            }
        } else {
            if (reader.rawData && reader.rawData.summaryData) {
                var sumData = reader.rawData.summaryData;
                var fakeFld = ':grp';
                var newSummaryData = [];
                for (var grpItem in sumData) {
                    if(grpItem === 'gSummaryType'){
                        newSummaryData[grpItem] = sumData[grpItem];
                    } else {
                        var summary = {};
                        summary[fakeFld] = grpItem;
                        for (var columnName in sumData[grpItem]) {
                            var s = sumData[grpItem][columnName];
                            var summaryText = gw.GridUtil.formatSummaryData(s);
                            var summaryValue = {};
                            summaryValue.text = summaryText;
                            if (s.align) {
                                summaryValue.align = s.align;
                            }
                            summary[columnName] = summaryValue;
                        }
                        newSummaryData.push(summary);
                    }
                }
                reader.rawData.summaryData = newSummaryData;
                reader.rawData.origSummaryData = sumData;
            }

            // PL-23558 When there is no summary data, do not show footer
            if (cmp && cmp.xtype == 'simplegrid') {
                var summaryFeature = cmp.getSummaryFeature();
                if (summaryFeature !== undefined) {
                    summaryFeature.showSummaryRow = (r.total > 0);
                }
            }

            store.totalCount = r.total;
            //http://docs-devel.sencha.com/extjs/5.1/5.1.0-apidocs/#!/api/Ext.data.Store-method-loadRecords
            store.loadRecords(r.records, value.options);

            store.loading = false;
            store.fireEvent('load', store, r.records, true);
            store.fireEvent('read', store, r.records, true);
        }

        // additional handling after loading data from the server:
        if (operation && operation.config) {
            var opConfig = operation.config;
            // since updateStore mimics TreeStore.OnProxyLoad method it should be updated as well.
            // in Ext JS 5 they moved the code into the operation.config.OnChildNodesAvailable()
            if (opConfig.onChildNodesAvailable) {
                Ext.callback(opConfig.onChildNodesAvailable, opConfig.scope || store, [r.records, operation, true]);
            }
            if (opConfig.callback) {
                Ext.callback(opConfig.callback, opConfig.scope || store, [r.records, operation, true]);
            }
        }
    },

    getFlaggedProperty : function() {
        return ':flagged'
    },

    getAltValueClass : function() {
        return 'altVal'
    },

    /**
     *
     * @returns {*[]} names of the menu items on a gw.ext.privacy text field.
     */
    getPrivacyFieldMenuItems : function() {
        return [
            gw.app.localize('Button.Delete'),
            gw.app.localize('Button.EnterNew')
        ]
    },

    /**
     * Calculate the width of the element
     * @param element element to get the width
     */
    getElementWidth:function (element) {
        if (element.dom.nodeName !== "IMG") {
            return Ext.util.TextMetrics.measure(element, element.dom.innerHTML).width + 5;
        } else {
            // image, return the default image size if width is not defined
            return (element.dom.width && element.dom.width > 0) ? element.dom.width : gw.Util.getDefaultImageSize();
        }
    },

    /**
     * @Return the default size for image which is rendered next to the value widget
     */
    getDefaultImageSize:function () {
        return 30;
    },

    /**
     * @Return the label width set by the display key
     */
    getLabelWidth:function () {
        var labelWidth = 150;
        var width = parseInt(gw.app.localize("ExtJS.Form.LabelWidth"));

        if (Ext.isNumber(width)) {
            labelWidth = width;
        }

        return labelWidth;
    },


    /**
     * Toggles the availability of the field
     */
    setDisabled: function (field, disabled) {
        if (field instanceof Ext.form.Field ||
            field instanceof Ext.form.RadioGroup) {
            field.setDisabled(disabled)
        } else {
            field.disabled = disabled
        }

        // show or hide helper icons:
        if (field.item && field.item.el) {
            // Use "visibility" instead of "display", so that it will not shift the page layout:
            field.item.el.setVisible(!disabled);
        }
    },

    /**
     * Gets the inner text for an element. Works for IE and Firefox
     */
    getInnerText:function (e) {
        return Ext.String.trim(e.innerText !== undefined ? e.innerText : e.textContent);
    },

    /**
     * Get the outer HTML for the given element. This works around the missing field outerHTML in Firefox.
     * @param {HTMLElement} e HTML element
     * @return {String} outer HTML representation of element
     *
     */
    getOuterHTML:function (e) {
        if (e.outerHTML) {
            return e.outerHTML;
        }
        if (e.parentNode) {
            return e.parentNode.innerHTML;
        }
        // Rarely is the outer most element asked for, so sending back "<ROOT>" in this case.
        // One could construct a temporary outer div and add e as child, however this is rarely needed.
        return "<ROOT>...</ROOT>";
    },

    /**
     * Renders the bar input UI
     * @param value - the value to render
     * @param suffix - (optional) the suffix to add to the ID for the component.  Provided by the component but not by
     *                 the list rendering code.  If not provided, no suffix will be used.
     * @returns {*}
     */
    renderBarInput:function (value, suffix) {
        suffix = typeof(suffix) !== 'string' ? "" : "-" + suffix;
        var tpl = new Ext.XTemplate(
            '<div>',
            '<div class="gbarinput-wrap" id="{id}' + suffix + '" title="{title}">',
            '<tpl if="styleoverride">',
            '<div class="{styleclass}" style="{styleoverride}; height:100%;"></div>',
            '<tpl else>',
            '<div class="{styleclass}" style="width:0; height:100%;"></div>',
            '</tpl>',
            '</div>',
            '<tpl if="status">',
            '<div style="display:inline;">{status}</div>',
            '</tpl>',
            '</div>');

        return tpl.apply(value);
    },

    getLabelableRenderTpl: function() {
        // @UpgradedSencha - use the new Labelable template copied from the class with some modifications
        return [
            '{beforeLabelTpl}',
            '<label id="{id}-labelEl" data-ref="labelEl" class="{labelCls} {labelCls}-{ui} {labelClsExtra} ',
                   '{unselectableCls}" style="{labelStyle}"<tpl if="inputId">',
                   ' for="{inputId}"</tpl> {labelAttrTpl}>',
                '<span class="{labelInnerCls} {labelInnerCls}-{ui}" style="{labelInnerStyle}">',
                    '{beforeLabelTextTpl}',
                    '<tpl if="fieldLabel">{fieldLabel}',
                        '<tpl if="labelSeparator">{labelSeparator}</tpl>',
                    '</tpl>',
                    '{afterLabelTextTpl}',
                '</span>',
            '</label>',
            '{afterLabelTpl}',
            // Begin Override
            // Overrode following 7 lines to add the prefix/suffix/altValue implementation to match what was in emerald
            // but done differently using divs and spans instead of tables.
            // '<div id="{id}-bodyEl" data-ref="bodyEl" class="{baseBodyCls} {baseBodyCls}-{ui}<tpl if="fieldBodyCls">',
            //    ' {fieldBodyCls} {fieldBodyCls}-{ui}</tpl> {growCls} {extraFieldBodyCls}"',
            //    '<tpl if="bodyStyle"> style="{bodyStyle}"</tpl>>',
            //    '{beforeBodyEl}',
            //    '{beforeSubTpl}',
            //    '{[values.$comp.getSubTplMarkup(values)]}',
            //    '{afterSubTpl}',
            //    '{afterBodyEl}',
            '<div id="{id}-bodyEl" data-ref="bodyEl" class="g-input-prefix-suffix-body {baseBodyCls} {baseBodyCls}-{ui} {growCls} {extraFieldBodyCls}">',
                '<div class="g-input-main-row">',
                    '<div class="g-input-prefix">{beforeBodyEl}{beforeSubTpl}</div>',
                    '<div ',
                        '<tpl if="bodyStyle">style="{bodyStyle}" class="g-input-prefix-suffix-field-inherit"',
                        '<tpl else>class="g-input-prefix-suffix-field"</tpl>',
                        '>',
                        '{[values.$comp.getSubTplMarkup(values)]}</div>',
                    '<div class="g-input-suffix">{afterSubTpl}{afterBodyEl}</div>',
                '</div>',
                //altVal implementation
                '<tpl if="altVal"><div class="g-input-altVal-row">',
                    '<div class="g-altVal-prefix"></div>',
                        '<span class="g-form-altVal" id="{altId}" value="{altVal.value}">{altVal.text}</span>',
                        '<div class="g-altVal-suffix"></div>',
                    '</div>',
                '</tpl>',
            // End Override
            '</div>',
            '<tpl if="renderError">',
                '<div id="{id}-errorWrapEl" data-ref="errorWrapEl" class="{errorWrapCls} {errorWrapCls}-{ui}',
                ' {errorWrapExtraCls}" style="{errorWrapStyle}">',
                    '<div role="alert" aria-live="polite" id="{id}-errorEl" data-ref="errorEl" ',
                        'class="{errorMsgCls} {invalidMsgCls} {invalidMsgCls}-{ui}" ',
                        'data-anchorTarget="{id}-inputEl">',
                    '</div>',
                '</div>',
            '</tpl>',
            {
                disableFormats: true
            }
        ]
    },
    // @UpgradedSencha - The render data now has a separate item for unselectableCls unlike before which just appended
    // it in the getLabelCls() method.  Now we just override the Ext.form.Labelable class and reset the unselectableCls
    // data item to be an empty string.
    makeLabelableDataSelectable: function(data) {
        data.unselectableCls = '';
        return data;
    },

    // @UpgradedSencha - respect when the current labelWidth matches the one provided as part of the initial
    // configuration of the base field otherwise, we want to set the labelWidth to be the gw.Util.getLabelWidth().
    setDefaultLabelWidth: function(component) {
        if (!component.labelWidth || !component.initialConfig || !component.initialConfig.labelWidth ||
            component.labelWidth != component.initialConfig.labelWidth) {
            component.labelWidth = gw.Util.getLabelWidth();
        }
    },

    appendCls: function(clsList, cls) {
        var classes = [];

        if (clsList && clsList.length > 0) {
            clsList = clsList.trim();
            classes = clsList.split(' ');
        }

        classes.push(cls);
        return (classes.join(' '));
    }
});
