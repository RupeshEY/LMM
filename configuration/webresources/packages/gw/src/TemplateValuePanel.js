/**
 * A panel for encapsulating a template widget.
 */
Ext.define('gw.TemplateValuePanel', {
  extend: 'Ext.Container',
  alias: 'widget.templatevaluepanel',

  layout: 'anchor',
  /**
   * Handle line breaks in template panel.
   */
  initComponent: function () {
    // Look for '-' as the line break indicator.
    // Items between line breaks will be rendered as a composite field.
    var me = this,
        allItems = me.items,
        curItems = [],
        tempItems = [];
    me.items = [];
    Ext.each(allItems, function (it, index) {
      if (it == '-') {
        if (curItems.length == 1) {
          tempItems.push(curItems[0]);
        } else if (curItems.length > 1) {
          tempItems.push({ xtype: 'fieldcontainer', items: curItems});
        }
        curItems = [];
      } else {
        curItems.push(it);
      }
    }, me);

    if (curItems.length == 1) {
      tempItems.push(curItems[0]);
    } else if (curItems.length > 1) {
      tempItems.push({ xtype: 'fieldcontainer', items: curItems});
    }

    // Propagate label information for test purposes.
    var label = me.fieldLabel;
    var fieldLabel = me.fieldLabel;
    var lStyle = me.labelStyle;
    var labelClsExtra = me.labelClsExtra;
    var lWidth = me.labelWidth;
    var needsWrapper = false;
    var defaultFieldLabelConfig = {labelStyle: lStyle, label: label, labelClsExtra: labelClsExtra};
    if (lWidth) {
      defaultFieldLabelConfig.labelWidth = lWidth;
    }

    Ext.apply(me, {fieldLabel: fieldLabel, 'defaults': defaultFieldLabelConfig});

    Ext.each(tempItems, function (item) {
      if (item.xtype) {
        Ext.apply(item, {fieldLabel: fieldLabel, hideEmptyLabel: false, labelClsExtra: labelClsExtra});
        if (item.xtype == 'fieldcontainer') {
          Ext.apply(item, {layout: 'hbox', combineErrors: true, defaults: defaultFieldLabelConfig});
        }
        fieldLabel = "";  // only apply label to the first item
      } else {
        needsWrapper = true;
      }
    });

    // AHK - 5/31/2013 - We need to wrap everything in a fieldcontainer or we could sometimes
    // (depending on the type of child item) end up with no labels showing up
    // See PL-26317
    if (needsWrapper) {
      var containerWrapperConfig = { xtype: 'fieldcontainer', items: tempItems, fieldLabel: me.fieldLabel,
                                vertical: true, labelStyle: me.labelStyle, labelClsExtra: me.labelClsExtra };
      if (me.labelWidth) {
        containerWrapperConfig.labelWidth = me.labelWidth;
      }
      me.items.push(containerWrapperConfig);
    } else {
      me.items = tempItems;
    }

    me.callParent(arguments);//initComponent on super
  }
});

