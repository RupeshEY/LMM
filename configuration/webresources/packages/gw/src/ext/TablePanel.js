/**
 * A table layout panel, it also support pagination
 */
Ext.define('gw.ext.TablePanel', {
  extend: 'gw.ext.PagingPanel',
  alias: 'widget.gtablepanel',
  border: true,  // @UpgradedSencha - the neptune style hides the border in ExtJs5, turn it on here

  initComponent: function () {
    var me = this;
    var gEqualWidth = me.gEqualWidth;
    // adding empty components to the end of the table if elements in the last row is less than the number of columns
    var totalFieldCount = 0;
    if (me.columns && me.columns > 1 && me.items) {
      var tdWidth = 100 / me.columns;
      var tdWidthPercent =  tdWidth.toFixed(0) + "%";
      Ext.each(me.items, function (item) {
        if (!item.hidden) {
          if (item.colspan) {
            totalFieldCount += item.colspan;
          } else {
            if (gEqualWidth == true) {
              item.tdAttrs = {width : tdWidthPercent};
            }
            totalFieldCount++;
          }
        }
      });
      var elementsInLastRow = totalFieldCount % me.columns;
      if (elementsInLastRow > 0) {
        var elementToAdd = me.columns - elementsInLastRow;
        var addItem = (gEqualWidth == true) ?  {xtype:'component', tdAttrs: {width : tdWidthPercent}} :
                                               {xtype:'component'};
        for(var i = 0; i < elementToAdd; i++) {
          me.items.push(addItem);
        }
      }
    }
    me.callParent(arguments);
  },
  // @UpgradedSencha - in ExtJs4, the glayout plugin was initialized before the initComponent() call.  In ExtJs5, it
  // is initialized after the call, so we are needing to defer the layout setup until just before it is rendered
  privates: {
    beforeRender: function() {
      var me = this;
      if (me.columns !== null) {
        me.layout.columns = me.columns;
      }
      Ext.apply(me.layout, {
            tdAttrs: {
              style : {
                padding: '5px',
                'vertical-align' : 'top'
              }
            }}
      );
      me.layout.tableAttrs.border = me.hasBorder === true ? 1 : 0; // draw border for each table cell if border is true
      me.callParent(arguments);
    }
  }
});
