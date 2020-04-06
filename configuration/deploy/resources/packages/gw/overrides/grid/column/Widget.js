/**
 * @author Juris Vecvanags
 *
 * Two important properties should come along the widget object,
 * @cfg hasComplexValue This tells widget renderer that field is an object containing multiple properties
 * @cfg defaultBindProperty Which object property to map for rendering.
 *
 * @example

 Ext.define('Cell.store.Simpsons',{
    extend:'Ext.data.Store',
    fields:['cakes','name', 'email', 'phone'],
    autoLoad: true,
    data:{'items':[
        { cakes: {
            xtype:'button',
            text:'abc',
            hasComplexValue: true
        }, 'name': 'Lisa',  "email":"lisa@simpsons.com",  "phone":"555-111-1224"  },
 { cakes:{
     xtype:'textfield',
     value:'Hello',
     hasComplexValue: true
 }, 'name': 'Lisa',  "email":"lisa@simpsons.com",  "phone":"555-111-1224"  },
 { cakes: {
     xtype:'checkbox',
     fieldLabel:'Checkbox',
     hasComplexValue:true,
     defaultBindProperty: 'value',
     value: 1
 }, 'name': 'Bart',  "email":"bart@simpsons.com",  "phone":"555-222-1234" },
 { cakes: {
     xtype:'radio',
     fieldLabel:'Radio',
     hasComplexValue:true,
     defaultBindProperty: 'value',
     value: 0
 }, 'name': 'Bart',  "email":"bart@simpsons.com",  "phone":"555-222-1234" },
 { cakes: {
     xtype: 'component',
     hasComplexValue:true,
     defaultBindProperty: '',
     autoEl: {
         tag: 'a',
         href: 'http://www.example.com/',
         html: 'Example.com'
     }
 }, 'name': 'Homer', "email":"homer@simpsons.com",  "phone":"555-222-1244"  },
 { cakes: 3, 'name': 'Marge', "email":"marge@simpsons.com", "phone":"555-222-1254"  }
 ]},
 proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            rootProperty: 'items'
        }
    }
 });


 Ext.define('Cell.view.main.Main', {
    extend: 'Ext.grid.Panel',

    requires: [
        'Ext.grid.column.Widget',
        'Ext.form.Label',
        'Ext.form.field.Text'
    ],

    title: 'Simpsons',
    store: 'Simpsons',
    columns: [
        {
            text: 'Name',
            dataIndex: 'cakes',
            width: 240,
            xtype: 'widgetcolumn',

            widget: {
                xtype:'label',
                html:'empty',
                handler: function(bt){
                    console.log('clicked:', bt.text);
                }

            }

        },
        { text: 'Email', dataIndex: 'email', flex: 1 },
        { text: 'Phone', dataIndex: 'phone', width: 200 }
    ],
    height: 200,
    width: 400,
    renderTo: Ext.getBody()
});

 */

// @UpgradedSencha 5.1 - added overrides to widget to support heterogeneous list of components in a column within
//                       the grid.
Ext.define('gw.overrides.grid.column.Widget',{
    override:'Ext.grid.column.Widget',
    privates:{
        // SenchaUpgrade - override of getFreeWidget(), that takes an additional record to determine whether
        //                 a widget is customized
        getFreeWidget: function(record) {
            var me = this,
                customWidget = record ? record.data[me.dataIndex] : false, // Override
                // Override: Do not use freeWidgetStack, because we are rendering per cell
                // result = me.freeWidgetStack ? me.freeWidgetStack.pop() : null;
                result =  null;

            if (!result) {
                //result = Ext.widget(me.widget);
                //Override: If cell field has xtype defined we create widget based on that spec, otherwise use default one
                result = customWidget && customWidget.hasOwnProperty('xtype') ?
                    Ext.widget(customWidget) : Ext.widget(me.widget);

                result.resolveListenerScope = me.listenerScopeFn;
                result.getWidgetRecord = me.widgetRecordDecorator;
                result.getWidgetColumn = me.widgetColumnDecorator;
                result.dataIndex = me.dataIndex;
                result.measurer = me;
                result.ownerCmp = me;
            }
            return result;
        },

      // SenchaUpgrade - override of onItemAdd(), that passes record to getFreeWidget() and uses
      //                 the appropriate config if the widget has a complex value
        onItemAdd: function(records, index, items) {
            var me = this,
                view = me.getView(),
                hasAttach = !!me.onWidgetAttach,
                dataIndex = me.dataIndex,
                isFixedSize = me.isFixedSize,
                len = records.length, i,
                record,
                row,
                cell,
                widget,
                el,
                width;

            // Loop through all records added, ensuring that our corresponding cell in each item
            // has a Widget of the correct type in it, and is updated with the correct value from the record.
            if (me.rendered && !me.hidden) {
                for (i = 0; i < len; i++) {
                    record = records[i];
                    if (record.isNonData) {
                        continue;
                    }

                    row = view.getRowFromItem(items[i]);

                    // May be a placeholder with no data row
                    if (row) {
                        cell = row.cells[me.getVisibleIndex()].firstChild;
                        if (!isFixedSize && !width) {
                            width = me.lastBox.width - parseInt(me.getCachedStyle(cell, 'padding-left'), 10) - parseInt(me.getCachedStyle(cell, 'padding-right'), 10);
                        }
                      // Override: we should pass the record as argument
                      // widget = me.liveWidgets[record.internalId] = me.getFreeWidget();
                        widget = me.liveWidgets[record.internalId] = me.getFreeWidget(record);

                        // Render/move a widget into the new row
                        Ext.fly(cell).empty();

                        // Call the appropriate setter with this column's data field
                        if (widget.defaultBindProperty && dataIndex) {
                          // Override: if widget specify 'hasComplexValue' we bind default property from the complex
                          // object rather than field itself
                          // widget.setConfig(widget.defaultBindProperty, record.get(dataIndex));
                            widget.setConfig(widget.defaultBindProperty,
                                widget.hasComplexValue ?
                                    record.get(dataIndex)[widget.defaultBindProperty] :
                                    record.get(dataIndex));
                        }
                        widget.$widgetColumn = me;
                        widget.$widgetRecord = record;
                        if (hasAttach) {
                            Ext.callback(me.onWidgetAttach, me.scope, [me, widget, record], 0, me);
                        }

                        if (el = (widget.el || widget.element)) {
                            cell.appendChild(el.dom);
                            if (!isFixedSize) {
                                widget.setWidth(width);
                            }
                        } else {
                            if (!isFixedSize) {
                                widget.width = width;
                            }
                            widget.render(cell);
                        }
                    }
                }
            }
        },

      // SenchaUpgrade - override of onViewRefresh(), that passes record to getFreeWidget() and uses
      //                 the appropriate config if the widget has a complex value
        onViewRefresh: function(view, records) {
            var me = this,
                rows = view.all,
                hasAttach = !!me.onWidgetAttach,
                oldWidgetMap = me.liveWidgets,
                dataIndex = me.dataIndex,
                isFixedSize = me.isFixedSize,
                cell, widget, el, width, recordId,
                itemIndex, recordIndex, record, id, lastBox, dom;

            if (me.rendered && !me.hidden) {
                me.liveWidgets = {};
                Ext.suspendLayouts();
                for (itemIndex = rows.startIndex, recordIndex = 0; itemIndex <= rows.endIndex; itemIndex++, recordIndex++) {
                    record = records[recordIndex];
                    if (record.isNonData) {
                        continue;
                    }

                    recordId = record.internalId;
                    cell = view.getRow(rows.item(itemIndex)).cells[me.getVisibleIndex()].firstChild;

                    // Attempt to reuse the existing widget for this record.
                    // Override: Pass the record when getting the free widget
                    // widget = me.liveWidgets[recordId] = oldWidgetMap[recordId] || me.getFreeWidget();
                    widget = me.liveWidgets[recordId] = oldWidgetMap[recordId] || me.getFreeWidget(record);
                    delete oldWidgetMap[recordId];

                    lastBox = me.lastBox;
                    if (lastBox && !isFixedSize && width === undefined) {
                        width = lastBox.width - parseInt(me.getCachedStyle(cell, 'padding-left'), 10) - parseInt(me.getCachedStyle(cell, 'padding-right'), 10);
                    }

                    // Call the appropriate setter with this column's data field
                    if (widget.defaultBindProperty && dataIndex) {
                      // Override: if widget specify 'hasComplexValue' we bind default property from the complex
                      // object rather than field itself
                      // widget.setConfig(widget.defaultBindProperty, records[recordIndex].get(dataIndex));
                        widget.setConfig(widget.defaultBindProperty,
                            widget.hasComplexValue ?
                                records[recordIndex].get(dataIndex)[widget.defaultBindProperty] :
                                records[recordIndex].get(dataIndex));
                    }
                    widget.$widgetRecord = record;
                    widget.$widgetColumn = me;
                    if (hasAttach) {
                        Ext.callback(me.onWidgetAttach, me.scope, [me, widget, record], 0, me);
                    }

                    if (el = (widget.el || widget.element)) {
                        dom = el.dom;
                        if (dom.parentNode !== cell) {
                            Ext.fly(cell).empty();
                            cell.appendChild(el.dom);
                        }
                        if (!isFixedSize) {
                            widget.setWidth(width);
                        }
                    } else {
                        if (!isFixedSize) {
                            widget.width = width;
                        }
                        Ext.fly(cell).empty();
                        widget.render(cell);
                    }
                }

                Ext.resumeLayouts(true);

                // Free any unused widgets from the old live map.
                // Move them into detachedBody.
                for (id in oldWidgetMap) {
                    widget = oldWidgetMap[id];
                    widget.$widgetRecord = widget.$widgetColumn = null;
                    me.freeWidgetStack.unshift(widget);
                    Ext.detachedBodyEl.dom.appendChild((widget.el || widget.element).dom);
                }
            }
        }
    }
});