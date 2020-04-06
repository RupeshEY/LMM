Ext.define('gw.override.grid.column.Column', {
    override: 'Ext.grid.column.Column',

    statics: {
        //Templates for FormatCell.  We should try using Template column with XTemplate instead.
        INPUT_TPL: new Ext.Template(
            '<tr>',
            '   <td>',
            '       <label for="{id}" style="{labelStyle}" class="', Ext.baseCSSPrefix, 'form-item-label">{fieldLabel}</label>',
            '   </td>',
            '   <td>',
            '       <div class="', Ext.baseCSSPrefix, 'form-item-cell {itemCls}" id="', Ext.baseCSSPrefix, 'form-el-{id}" style="{fieldStyle}">{itemValue}</div>',
            '   </td>',
            '</tr>'
        ),

        INPUT_TPL_EMPTY_LABEL: new Ext.Template(
            '<tr>',
            '   <td style="margin: 0; padding: 0"></td>',
            '   <td>',
            '       <div class="', Ext.baseCSSPrefix, 'form-item-cell {itemCls}" id="', Ext.baseCSSPrefix, 'form-el-{id}" style="{fieldStyle}">{itemValue}</div>',
            '   </td>',
            '</tr>'
        ),

        NO_LABEL_INPUT_TPL: new Ext.Template(
            '<tr>',
            '   <td colspan="2">',
            '       <div class="', Ext.baseCSSPrefix, 'form-item-cell {itemCls}" id="', Ext.baseCSSPrefix, 'form-el-{id}" style="{fieldStyle}">{itemValue}</div>',
            '   </td>',
            '</tr>'
        ),

        LABEL_ABOVE_INPUT_TPL: new Ext.Template(
            '<tr>',
            '   <td colspan="2">',
            '       <label for="{id}" style="{labelStyle}" class="', Ext.baseCSSPrefix, 'form-item-label">{fieldLabel}</label>',
            '   </td>',
            '</tr>',
            '<tr>',
            '   <td colspan="2">',
            '       <div class="', Ext.baseCSSPrefix, 'form-item-cell {itemCls}" id="', Ext.baseCSSPrefix, 'form-el-{id}" style="{fieldStyle}">{itemValue}</div>',
            '   </td>',
            '</tr>'
        ),

        LABEL_TPL: new Ext.Template(
            '<tr>',
            '   <td colspan="2">',
            '       <div class="', Ext.baseCSSPrefix, 'form-item-cell {itemCls}" tabIndex="-1">',
            '           <label style="{labelStyle}" class="', Ext.baseCSSPrefix, 'form-item-label">{html}</label>',
            '       </div>',
            '   </td>',
            '</tr>'
        )
    },

    outerDivCls: Ext.baseCSSPrefix +'field ' + Ext.baseCSSPrefix + 'form-item ' + Ext.baseCSSPrefix + 'form-item-default ' +
                 Ext.baseCSSPrefix + 'form-type-radio ' + Ext.baseCSSPrefix + 'field-default ' +
                 Ext.baseCSSPrefix + 'checkboxgroup-form-item ' + Ext.baseCSSPrefix + 'form-item-no-label',
    inputCls: Ext.baseCSSPrefix + 'form-field ' + Ext.baseCSSPrefix + 'form-radio ' + Ext.baseCSSPrefix + 'form-radio-default ' +
              Ext.baseCSSPrefix + 'form-cb ' + Ext.baseCSSPrefix + 'form-cb-default',
    cbWrapperCls: Ext.baseCSSPrefix + 'form-item-body ' + Ext.baseCSSPrefix + 'form-item-body-default ' +
                  Ext.baseCSSPrefix + 'form-cb-wrap ' + Ext.baseCSSPrefix + 'form-cb-wrap-default',
    labelCls: Ext.baseCSSPrefix + 'form-cb-label ' + Ext.baseCSSPrefix + 'form-cb-label-default ' + Ext.baseCSSPrefix + 'form-cb-label-after',
    cbCheckedCls: Ext.baseCSSPrefix + 'form-cb-checked',

    initComponent: function () {
        var me = this;

        if (me.dataType === 'complexType') {
            me.groupable = false;
        } else {
            me.groupable = me.sortable; // disallow group-by-this-column if the column is not sortable
        }

        if (me.sortable && (me.colspan === undefined || me.colspan === 1)) {
            me.addCls('g-header-sort');
        }

        if (me.required) { // add required column indicator
            me.addCls('gw-required-column');
        }

        me.callParent(arguments);
    },

    // renderer is 'interceptor' method and allows the underlying store value to be transformed before being
    // displayed in the grid.  This function returns markup to be rendered in to the current cell.
    //
    // @UpgradedSencha 5.1 - We can fully eliminate this method by moving rendering pipeline to Widgets and
    // Template columns.  Regular content rendering(_renderRegularContent) must be moved (and revisited) to this
    // method where we should ignore any cells that have template and Widget rendering types

    /**
     * Adds row-sensitive cell content.
     * IMPORTANT: Avoid creating Ext Component in cell, which will be very expensive.
     * <ul>
     * <li>Adds row-sensitive style class and id before rendering the cell
     * <li>Appends helper icon or menu
     * </ul>
     */
    renderer: function (value, metaData, record, rowIndex, colIndex, dataSource, view) {
        // Note: 'this' in this context is the grid object, not the column or header object
        // Work with the header variable below for referring to the column object.

        var header = view.headerCt.getHeaderAtIndex(colIndex);
        var fieldName = header.dataIndex;
        var ret = '';
        var complexItem = gw.GridUtil.getTemplateCell(value);
        var store = view.ownerCt.getStore();
        var invalidCellCls = 'g-invalid-cell';

        if (gw.GridUtil.isFormatCell(value)) {
            return header._renderFormatCell(header, value.items, store, record, rowIndex, colIndex, fieldName, metaData, view);
        } else if (gw.GridUtil.isLinkCell(value)) {
            return header._renderRegularContent(header, value.items, store, record, rowIndex, colIndex, fieldName, metaData, undefined, view);
        }

        if (complexItem) {
            ret = header._renderTemplateValuePanel(header, complexItem, store, record, rowIndex, colIndex, fieldName, metaData, view);
        } else {
            if (value && value.xtype === 'gbarinput') {
                ret = gw.Util.renderBarInput(value);
            } else if (value && value.xtype == 'radiogroup') {
                ret = header._formatRadioGroup(value.items);
                // show cell error indicator
                if (value.invalid) {
                    if (ret.indexOf(header.cbCheckedCls) === -1) {
                        metaData.tdCls += ' ' + invalidCellCls;
                    } else {
                        metaData.tdCls = metaData.tdCls.replace(invalidCellCls, '');
                    }
                }
            } else {
                if (header.xtype !== 'radiocolumn') {
                    // Render an inline radio input field if this is a mixed grid column configuration
                    gw.GridUtil.processGridEditor(store, rowIndex, header, function (editorByRow) {
                        var editorCfg = editorByRow[0];
                        if (!editorCfg.disabled && editorCfg.xtype == 'radio') {
                            ret = header._formatSingleRadioInGroup(record.get(fieldName), editorCfg.group);
                        }
                    });
                }
                if (ret == '') {
                    ret = header._renderRegularContent(header, value, store, record, rowIndex, colIndex, fieldName, metaData, undefined, view);
                }
            }
        }
        return ret;
    },

    /**
     * Instantiates menu of the owner object into Ext Menu Component,
     * and remembers the menu on the record to be destroyed later.
     * (NOTE: This method is called to instantiate menu during rendering,
     *  in order for SmokeTest to be able to find menu item.)
     * @param owner owner object
     * @param openerId id of the HTML element that will open the menu
     * @param record store record backing the cell
     */
    _instantiateCellMenu: function (owner, openerId, record) {
        var me = this;
        if (owner.menu) {
            record.menus = record.menus || {};

            record.menus[openerId] = {
                id: owner.id,
                menu: Ext.apply(gw.Util.getOrCreateFieldMenu(openerId, owner.menu), {openerId: openerId}),
                showMenu: function () {
                    gw.Util.createAndShowOnDemandMenuIfNeeded(this);

                    function restoreFocus() {
                        var grid = me.up('tablepanel');
                        if (grid) {
                            gw.GridUtil.restoreLastFocusedCell(grid, gw.app._gridNavigation);
                        }
                    }
                    // register the event listener on menu hide event to re-focus on the LV cell. showMenu is also called in
                    // the callback for onDemandMenu server request so this listener will attach to the correct menu with menuOnDemand.
                    if (gw.Util.menuLoaded(this)) {
                        this.menu.on('hide',
                            restoreFocus,
                            this,
                            {single: true});
                    }
                    this.menu.showAt(Ext.fly(this.menu.openerId).getAnchorXY('bl'));
                    this.menu.focus(); // Set focus once the new menu is shown
                }
            };

            if (owner.ondemandmenu) {
                record.menus[openerId].ondemandmenu = owner.ondemandmenu;
            }
        }
    },

    _wrapCellContent: function (value, metaData, store, record, fieldName, ret) {
        var me = this;
        // wrap cell content inside an action or menu button, if needed
        var menu = value.menu;

        var cellCls = value.cls ? value.cls.split(' ') : [];
        var oldLength = cellCls.length;
        Ext.Array.remove(cellCls, gw.app.getEventSourceCls()); // remove marker cls
        if (cellCls.length > 0) {
            metaData.tdCls += ' ' + cellCls.join(' ');
        }

        if (menu || oldLength > cellCls.length/*value cls contains event source cls*/) {
            var linkId = value.id || gw.GridUtil.getFullIdForCell(store, record, fieldName);
            me._instantiateCellMenu(value, linkId, record);
            return me._markupCellLink({id: linkId, menu: menu, text: ret, disabled: value.disabled}, {tabindex: -1});
        }

        // handle email link
        if (value.text) {
            var divElement = document.createElement('div');
            divElement.innerHTML = value.text;
            var linkElements = divElement.getElementsByTagName('a');
            if (linkElements) {
                var linkElement = linkElements[0];
                if (linkElement) {
                    var hrefValue = linkElement.getAttribute('href');
                    if (hrefValue) {
                        var firstColonIndex = hrefValue.indexOf(':');
                        if (firstColonIndex != -1) {
                            var mailtoString = hrefValue.substring(0, firstColonIndex).trim();
                            if (mailtoString === 'mailto') {
                                var emailAddress = hrefValue.substring(firstColonIndex + 1, hrefValue.length).trim();
                                if (emailAddress !== "") {
                                    return Ext.core.DomHelper.markup({
                                        tag: 'a',
                                        href: 'mailto:' + emailAddress,
                                        html: linkElement.childNodes[0].textContent,
                                        tabindex: -1
                                    });
                                }
                            }
                        }
                    }
                }
            }
        }

        if (value.id) {
            // PL-27795 - Need to insert space to stretch the inner div of the cell if value is empty
            if (ret === '') {
                ret = '&#160;';
            }
            // renders id for the cell:
            return Ext.core.DomHelper.markup({tag: 'span', id: value.id, html: ret});
        }

        return ret;
    },

    /**
     * Gets HTML markup for a link within a grid cell. We don't generate component for cell links for perf reason.
     * @param linkConfig config
     * @param options additional attributes for the the html element
     * @return html
     */
    _markupCellLink: function (linkConfig, options) {
        var config;

        config = Ext.apply(
            linkConfig.text ? {
                tag: linkConfig.disabled ? 'span' : 'a',
                html: linkConfig.text + (linkConfig.html || '')
            } :
            {tag: 'img', src: (linkConfig.icon ? linkConfig.icon : Ext.BLANK_IMAGE_URL)},
            options);

        // css classes:
        var cls = [];
        if (!linkConfig.disabled) {
            cls.push(linkConfig.menu ? gw.app.GRID_CELL_MENU_CLASS : gw.app.getEventSourceCls()); // cls to indicate action or menu
        }
        if (linkConfig.cls) {
            cls.push(linkConfig.cls); // other cls from base config
        }
        if (cls.length > 0) {
            config.cls = cls.join(' ');
        }

        Ext.copyTo(config, linkConfig, ['id']);
        if (linkConfig.tooltip) {
            config['title'] = linkConfig.tooltip;
        }

        if (linkConfig.hidden) {
            config.style = 'display:none';
        }

        if (linkConfig.handler) {
            config.onclick = linkConfig.handler;
        }
        return Ext.core.DomHelper.markup(config)
    },

    /**
     * Given a (possibly null) list of child items, appends the HTML for them
     * to the ret value passed in.
     */
    _appendHtmlForChildItems: function (childItems, record, ret) {
        var me = this;
        if (childItems) {
            Ext.each(childItems, function (childItem, i) {
                me._instantiateCellMenu(childItem, childItem.id, record);
                ret += me._markupCellLink(childItem, {itemIndex: i});
            });
        }
        return ret;
    },

    _renderFormatCell: function (column, items, store, record, rowIndex, colIndex, fieldName, metaData, view) {
        var me = this;
        var htmlArray = [];
        Ext.iterate(items, function (item, index) {
            if (item.html) {
                htmlArray.push(Ext.grid.column.Column.LABEL_TPL.apply(item))
            } else {
                var itemValue;
                if (gw.GridUtil.isLinkCell(item)) {
                    itemValue = item.items;
                } else {
                    itemValue = item.value;
                }

                if (item.xtype == 'templatevaluepanel') {
                    itemValue = me._renderTemplateValuePanel(column, item, store, record, rowIndex, colIndex, fieldName, metaData, view)
                }
                itemValue = me._renderRegularContent(column, itemValue, store, record, rowIndex, colIndex, fieldName, metaData, true, view, index);
                itemValue = me._appendHtmlForChildItems(item.item, record, itemValue);
                item.itemValue = itemValue;
                if (item.hideLabel) {
                    htmlArray.push(Ext.grid.column.Column.NO_LABEL_INPUT_TPL.apply(item));
                } else if (item.labelAlign == "top") {
                    htmlArray.push(Ext.grid.column.Column.LABEL_ABOVE_INPUT_TPL.apply(item));
                } else if (!item.fieldLabel) {
                    htmlArray.push(Ext.grid.column.Column.INPUT_TPL_EMPTY_LABEL.apply(item));
                } else {
                    htmlArray.push(Ext.grid.column.Column.INPUT_TPL.apply(item));
                }
            }
        });
        var tableContents = htmlArray.join('');

        // Defaults implicit left alignment
        var tableStartTag = '<table>';
        var cellAlign = metaData.align;
        if (cellAlign == 'right') {
          tableStartTag = '<table style="margin-left: auto">';
        } else if (cellAlign == 'center') {
          tableStartTag = '<table style="margin-left: auto; margin-right: auto">';
        }

        return tableStartTag + tableContents + '</table>'
    },

    _renderTemplateValuePanel: function (column, complexItem, store, record, rowIndex, colIndex, fieldName, metaData, view) {
        var me = this;
        var htmlArray = [];
        // We are assuming a read-only composite field.
        for (var i = 0; i < complexItem.items.length; i++) {
            var compositeItem = complexItem.items[i];
            var compositeVal;
            if (compositeItem == '-') {
                compositeVal = '<br>'
            } else {
                compositeVal = me._renderRegularContent(column, compositeItem, store, record, rowIndex, colIndex,
                    fieldName, metaData, undefined, view);
            }
            htmlArray.push(compositeVal);
        }
        if (htmlArray.length > 0) {
            metaData.innerCls = 'g-template-spacer';
        }
        return htmlArray.join('');
    },

    _renderRegularContent: function (column, value, store, record, rowIndex, colIndex, fieldName, metaData, skipFurtherRendering, view, outerIndex) {
        var me = this,
            htmlArray = [],
            ret = '';


        if (value === undefined) {
            return ret;
        }

        if (Ext.isArray(value)) {
            var itemIndexPrefix = (outerIndex !== undefined ? outerIndex + ':' : '');
            // multiple links under a content cell
            for (var i = 0; i < value.length; i++) {
                htmlArray.push(me._markupCellLink(value[i], {itemIndex: itemIndexPrefix + i, tabindex: -1}));
            }
            ret = htmlArray.join('');

        } else {
            var cellValue = (value && value.text != undefined) ? value.text : value;

            if (value && value.align) {
                //TODO PLWEB-6007: Sencha ticket pending: column-level align overrides cell-level align by default
                metaData.style += 'text-align:' + value.align + ' !important';
            }
            if (value && value.fontColor) {
                var colorStyle = 'color:' + value.fontColor;
                metaData.style = (metaData.style) ? metaData.style + '; ' + colorStyle : colorStyle;
            }
            if (value && value.invalid && !record.isModified(fieldName)) { // invalid cell
                metaData.tdCls += ' g-invalid-cell';
            }
            if (value && value.editable) {
                metaData.tdCls += ' g-cell-edit'; // mark cell editable
            }

            // Get the current default column editor
            var editor;
            if (column.getEditor) {
                editor = column.getEditor();
            }

            var rowEditor;
            // Process row sensitive row editors that may be different than the current column editor
            gw.GridUtil.processGridEditor(store, rowIndex, column, function (editorByRow) {
                rowEditor = editorByRow[0];

                // If the column does not have an editor, set a default editor.
                if (column.getEditor) {
                    var colEditor = column.getEditor();
                    if (!colEditor) {
                        column.setEditor(rowEditor);
                    }
                }

                // Combo box cell editor
                if (rowEditor.xtype == 'simplecombo') {
                    if (rowEditor instanceof Ext.form.Field) {
                        editor = rowEditor;
                    } else {
                        // The editor config isn't an actual instanceof
                        // form.Field - i.e. it is derived from a JSON
                        // payload from the server.  Manually pull the
                        // cell value from the store value passed in the
                        // JSON.
                        editor = null;
                        Ext.each(rowEditor.store, function (data) {
                            if (data[0] == cellValue) {
                                cellValue = Ext.String.htmlEncode(data[1]);
                                return false;
                            }
                        });
                    }

                    // Multiselect control
                } else if (rowEditor.xtype == 'multiselect') {
                    var cellValueObj = gw.Util.decodeValue(cellValue);
                    if (cellValueObj != null && Ext.isArray(cellValueObj)) {
                        cellValue = "";
                        for (var i = 0; i < cellValueObj.length; i++) {
                            cellValue += cellValueObj[i];
                            if (i + 1 < cellValueObj.length) {
                                cellValue += ", ";
                            }
                        }
                    }

                    // Privacy cell editor: Obfuscate the cell value
                } else if (rowEditor.xtype == 'privacy') {

                    if (value && !record.isModified(fieldName)) { // encrypt non-empty value from server
                        if (Ext.isString(value)) {
                            value = {text: value}; // box simple text
                        }

                        // Deletes the server value and starts editing the cell. The privacy field should now be visible.
                        function deletePrivacyCellValue() {
                            // @SenchaUpgrade: Call base get method. TODO Refactor inheritance
                            Ext.data.Model.prototype.set.call(record, fieldName,
                                gw.GridUtil.getRecordUpdateValue(record, fieldName, '', {
                                        xtype: "textfield",
                                        privacyEdited: "true"
                                    },
                                    ["gwCellId"], null));
                            var grid = Ext.ComponentManager.get(store.storeId);
                            grid.getCellEditingPlugin().startEdit(record, grid.view.headerCt.getHeaderAtIndex(colIndex));
                        }

                        // TODO: @SenchaUpgrade: Check whether the menu gets destroyed when the containing grid is destroyed
                        // Add a cell menu to allow the user clearing the privacy field value.
                        // Do not add menu items if this privacy field has already been edited or it has no text value
                        // since they can simply just edit the field without the need for the menu to let them do so.
                        if (!value.privacyEdited && value.text) {
                            var menuId = gw.GridUtil.getFullIdForCell(store, record, fieldName) + '_MENU';
                            var items = [];
                            Ext.each(gw.Util.getPrivacyFieldMenuItems(), function (itemText, index) {
                                items.push({
                                    text: itemText,
                                    handler: deletePrivacyCellValue,
                                    id: index == 0 ? menuId + ':edit' : undefined
                                });
                            });
                            value.item = [{
                                icon: "images/app/drop_button.png",
                                xtype: "button",
                                id: menuId,
                                width: 16,
                                height: 16,
                                menu: {items: items}
                            }];
                        }
                    }

                    // update record field, without firing events
                    record.data[fieldName] =
                        gw.GridUtil.getRecordUpdateValue(record, fieldName, value, null, ["gwCellId"], null);

                    // Radio group in a cell: Render the radio group as editable control
                } else if (rowEditor.xtype == 'radiogroup') {
                    cellValue = gw.GridUtil.getTextForRadioGroupCell(editorByRow[0], value);
                }

                // TODO: @SenchaUpgrade: We should check the disabled check for all editor types, not just checkboxes
                if (!rowEditor.disabled) {
                    if (!metaData.tdCls || metaData.tdCls.indexOf('g-cell-edit') == -1) {
                        if (editorByRow[0].xtype == 'checkbox' && column.getEditor) {
                            column.setEditor(rowEditor);
                            editor = column.getEditor();

                            //@SenchaUpgrade: based on Ext.grid.column.CheckColumn

                            var cls = [gw.app.ROW_CHECK_COLUMN_CLASS],
                                checkedValue = record.get(fieldName);

                            metaData.innerCls = Ext.baseCSSPrefix + 'grid-cell-inner-checkcolumn';

                            // A canonical true/false should be used for these cases.
                            if (checkedValue === 'Yes' || checkedValue === 'true' || checkedValue.cb === true || checkedValue === true) {
                                cls.push(gw.app.ROW_CHECK_COLUMN_CHECKED_CLASS);
                            }

                            ret = '<img class="' + cls.join(' ') + '" src="' + Ext.BLANK_IMAGE_URL + '"/>';
                            return ret;
                        }
                        else {
                            metaData.tdCls += ' g-cell-edit'; // mark cell editable, not needed for boolean types
                        }
                    }
                }
            });

            // editor defaults to the editor associated with the column.  However, if we have row specific editor,
            // we should use that instead.
            if (rowEditor) {
                editor = rowEditor;
            }

            // PL-22644 xtype is checkbox only denotes default editor, other editors can exist in this column
            if (editor && editor.xtype == 'checkbox' && ret != '') {
                return ret;
            }

            //PLWEB-6216 Cell value populated from post on change while other column values are non-editable
            if (editor && editor.displayField) { // lookup display text for combo field
                var idx = editor.store.findExact(editor.valueField, cellValue);
                // Autocomplete are combos, but there may not be an exact match.
                if (idx != -1 && value.editable){
                    cellValue = editor.store.getAt(idx).get(editor.displayField);
                }
            }

            ret = cellValue;
            if (!skipFurtherRendering) {
                ret = cellValue;
            }
        }

        if (!skipFurtherRendering && value) {
            if (!Ext.isEmpty(value.text)) { // show prefix/suffix if value not blank
                if (value.prefix) {
                    ret = value.prefix + ret;
                }
                if (value.suffix) {
                    ret += value.suffix;
                }
            }

            ret = me._wrapCellContent(value, metaData, store, record, fieldName, ret);

            // insert cell checkbox, if any:
            if (value.cb != null) {

                //@SenchaUpgrade: based on Ext.grid.column.CheckColumn
                var cls = [gw.app.ROW_CHECK_COLUMN_CLASS];

                if (value == 'Yes' || value.cb === true) {
                    cls.push(gw.app.ROW_CHECK_COLUMN_CHECKED_CLASS);
                }
                cls = cls.join(' ');

                ret = Ext.String.format(
                    '<div style="width:15px; float:left;" class="' + cls + '" id="{0}">&#160;</div><span>' + ret + '</span>',
                    gw.GridUtil.getFullIdForCell(store, record, fieldName) + 'CB');
            }

            // append helper icons, if any
            var items = value.item;
            var links = '';
            if (items) {
                Ext.each(items, function (item, i) {
                    me._instantiateCellMenu(item, item.id, record);
                    links += me._markupCellLink(item, {itemIndex: i});
                });
                ret = '<div class="' + gw.app.HELPER_CELL_ICON_CLASS + '">' + links + '</div>' +
                      '<div class="g-helper-cell-text">' + ret + '</div>';
            }

            if (value.altVal) {
                ret += Ext.core.DomHelper.markup({
                    tag: 'div', cls: gw.Util.getAltValueClass(),
                    html: value.altVal.text,
                    value: value.altVal.value
                });
            }
        }

        return ret;
    },

    _formatRadioGroup: function (items) {
        var me = this,
            ret = '<table class="' + gw.app.GW_RADIO_GROUP_CELL_CLASS + '"><tr>',
            iLen = items.length,
            i = 0,
            checked,
            item,
            id;

        for (; i < iLen; i++) {
            id = Ext.id(null, 'radio-');
            item = items[i];
            checked = items[i].checked ? ' ' + me.cbCheckedCls : '';

            ret += Ext.String.format(
                '<td class="' + Ext.baseCSSPrefix + 'form-radio-group" valign="top" role="presentation">' +
                '   <div class="' + me.outerDivCls + ' {1}" id="{0}">' +
                '       <div id="{0}-bodyEl" data-ref="bodyEl" class="' + me.cbWrapperCls + '">' +
                '           <div class="' + Ext.baseCSSPrefix + 'form-cb-wrap-inner " role="presentation">' +
                '              <input type="button" id="{0}-inputEl" inputValue="{2}" data-ref="inputEl" role="radio" tabindex="0" class="' + me.inputCls + '" autocomplete="off" hidefocus="true" componentid="{0}">' +
                '              <label id="{0}-boxLabelEl" data-ref="boxLabelEl" class="' + me.labelCls + '" for="{0}-inputEl">{3}</label>' +
                '           </div>' +
                '       </div>' +
                '   </div>' +
                '</td>',
                id, checked, item.inputValue, item.boxLabel
            );
        }

        ret += '</tr></table>';
        return ret;

    },

    _formatSingleRadioInGroup: function (checked, groupName) {
        var sChecked = checked ? 'class="' + this.cbCheckedCls + '"' : '';

        return Ext.String.format('<div style="text-align: center" {0}><input class="' + Ext.baseCSSPrefix + 'form-field ' +
                                 Ext.baseCSSPrefix + 'form-radio-default" type="button">&#160;</div>', sChecked);
    },

    // Override for Selenium browser testing purpose, Selenium click will not send correct mouse position
    // Resulting in the OnLeftEdge or OnRightEdge test to fail and hence, skipping the header click
    // @SenchaUpgrade
    onTitleElClick: function (e, t, sortOnClick) {
        var me = this,
            activeHeader,
            prevSibling,
            xy = e.getXY(),
            pt = new Ext.util.Point(xy[0], xy[1]);

        // Tap on the resize zone triggers the menu
        if (Ext.supports.Touch) {
            prevSibling = me.previousSibling(':not([hidden])');

            // Tap on right edge, activate this header
            if (!me.menuDisabled && me.isOnRightEdge(e, parseInt(me.triggerEl.getStyle('width')))) {
                if (!me.menuDisabled) {
                    activeHeader = me;
                }
            }

            // Tap on left edge, activate previous header
            else if (prevSibling && !prevSibling.menuDisabled && me.isOnLeftEdge(e)) {
                activeHeader = prevSibling;
            }
        }
        else {
            // Firefox doesn't check the current target in a within check.
            // Therefore we check the target directly and then within (ancestors)
            activeHeader = me.triggerEl && (e.target === me.triggerEl.dom || t === me.triggerEl || e.within(me.triggerEl)) ? me : null;
        }

        // If it's not a click on the trigger or extreme edges. Or if we are called from a key handler, sort this column.
        if (sortOnClick !== false && (!activeHeader && !me.isOnLeftEdge(e) && !me.isOnRightEdge(e) || e.getKey() || me.el.getRegion().isOutOfBound(pt))) {
            //@UpgradedSencha 5.1 Multisort from UI support
            me.toggleSortState(e);
            // Clear cell position as it may have changed due to sorting.
            var grid = me.up('tablepanel');
            if (grid) {
              grid.getNavigationModel().setPosition(null, null);
            }
        }
        return activeHeader;
    },

    //@UpgradedSencha 5.1 Multisort from UI support
    // We tweak how the filters are being added via Shift key:
    // If Shift key is pressed we add Sorters, if not, all sorters are replaced with the newly selected one
    // Added Feature request EXTJS-16870 Column UI should support multi sorting

    toggleSortState: function (event) { // changed
        if (this.isSortable()) {
            this.sort(null, event); // changed
        }
    },
    /**
     * This method is reimplemented.
     * @param direction
     * @param event
     * @param clear removes current sorter
     */
    sort: function (direction, event, clear) {
        var me = this,
            event = event || {},
            grid = me.up('tablepanel'),
            store = grid.store,
            removing = false,
            mode;

        // Maintain backward compatibility.
        // If the grid is NOT configured with multi column sorting, then specify "replace".
        // Only if we are doing multi column sorting do we insert it as one of a multi set.
        // Suspend layouts in case multiple views depend upon this grid's store (eg lockable assemblies)
        Ext.suspendLayouts();
        me.sorting = true;

        if (event.ctrlKey || clear) { // This should work in grid that is both with single and multiple sort enabled
            // CTRL/COMMAND on a MAC toogles sorting for selected column

            // if we are sorting on this column already - > remove sorter
            var sorters = store.getSorters(),
                items = sorters.getRange(),
                i = 0, iLen = items.length;

            for (; i < iLen; i++) {
                if (items[i].getProperty() === me.getSortParam()) {
                    //remove the sorter
                    sorters.remove(sorters.items[i]);
                    grid.getView().refresh();
                    removing = true;
                    break;
                }
            }

            //Prevent from reenabling the sorting if Clear requested
            if (clear) {
                removing = true;
            }
        }

        //Nothing removed, continue
        if (!removing) {
            //mode = grid.multiColumnSort && (event && event.shiftKey) ? 'multi' : 'replace';
            mode = grid.multiColumnSort ? 'multi' : 'replace';

            //Figure out direction if it is not provided
            if (!direction) {
                //is already sorted, should we flip it ?
                if (me.sortState) {
                    direction = me.sortState === 'DESC' ? 'ASC' : 'DESC';
                }
            }

            store.sort(me.getSortParam(), direction, mode);
        }

        delete me.sorting;
        Ext.resumeLayouts(true);
    },
    //--- end of multisort

    // @UpgradedSencha - ADDED. Output is controlled by summaryRenderer function
    summaryRenderer: function (value, summaryData, field) {
        var val = value ? value.text : '',
            align = value ? value.align : 'left';

        return align === 'left' ? val : '<div style="text-align: ' + align + '">' + val + '</div>';
    }

});
