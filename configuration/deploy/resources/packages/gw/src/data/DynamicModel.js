/**
 * @UpgradedSencha - Refactored from SimpleGrid since it makes sense to have it's own class file.`
 */
Ext.define('gw.data.DynamicModel', {
  extend: 'Ext.data.Model',
  uses: ['gw.app', 'gw.GridUtil'],

  _updateSum: function (grid, field, record) {
    var column = grid.getColumnById(field),
        me = this;

    if (column && column.summaryType && column.summaryType.indexOf('reflect') >= 0) {
      var store = grid.getStore();
      var grp = store.grouper ? record.get(store.grouper.getProperty()) : '';
      var fieldMapping = column.mapping || column.dataIndex;

      if (column.summaryType == 'noreflect') {
        // do not call server
        var getSumHTML = '<span class="' + gw.app.getEventSourceCls() + '">' +
            gw.app.localize('Java.ListView.GetSum') + '</span>';
        var oldSum = me._findSummaryForField(store, fieldMapping, grp);
        oldSum = oldSum.text;
        if (oldSum.match('^<div[^>]+altVal')) {
          getSumHTML = ['<div class="' + gw.Util.getAltValueClass() + '">', getSumHTML, '</div>'].join('')
        }
        var data = {};
        data[fieldMapping] = {};
        data[fieldMapping].text = getSumHTML;
        grid.updateSummaryData(grp, data);

      } else {
        // calculate new sum value at server side:
        var params = {};
        var fullId;
        store.each(function (record) {
          if ((grp === '' || record.get(store.grouper.getProperty()) === grp) && record.isModified(field)) {
            var value = record.get(field);
            if (value && value.text !== undefined) {
              value = value.text; // unbox composite value
            }
            fullId = gw.GridUtil.getFullIdForCell(store, record, field);
            params[fullId] = value;
          }
        });
        gw.app.requestViewRoot(fullId.replace(/(^.+:)[0-9]+:(.+)$/, '$1$2Footer'),
            {calSum: params},
            'NO_MASK_ELEM',
            {gridId: store.storeId, grouper: grp, fieldMapping: fieldMapping})
      }
    }
  },

  _findSummaryForField: function _findSummaryForField(store, fieldMapping, grp) {
    var summaryData = store.getProxy().getReader().rawData.summaryData;
    if (grp !== '') {
      for (var i = 0; i < summaryData.length; i++) {
        if (summaryData[i][":grp"] === grp) {
          return summaryData[i][fieldMapping];
        }
      }
    }
    return summaryData[0][fieldMapping];
  },

  // overrides getting data from checkbox or radio
  get: function (fieldName) {
    var result = this.callParent(arguments);
    if (Ext.isObject(result) && (result.xtype === 'checkbox' || result.xtype === 'radio')) {
      return result.value;
    }
    return result;
  },

  set: function (fieldName, value) {
    var me = this;
    if (!(arguments.length === 1 && Ext.isObject(fieldName))) {
      var oldValue = me.data[fieldName];
      var dvInput = gw.GridUtil.getFirstInputInTemplateCell(oldValue);
      if ((oldValue && oldValue.text !== undefined && oldValue.cb === undefined) || dvInput) {
        if (value && value.value !== undefined) {
          //footer cells and reflection seem to be the only cases where value come in as an object
          value.text = value.value;
          value = Ext.apply({}, value, oldValue);
        } else if (!Ext.isObject(value)) {
          value = Ext.apply({}, {text: Ext.htmlEncode(value.toString()), value: value}, oldValue);
        }

      }
      // For single dv input in cell.
      var item = gw.GridUtil.getFirstInputInTemplateCell(value);
      if (item && value.text !== undefined) {
        item.value = item.text = value.text;
      }
    }

    // update record field:
    me.callParent(arguments);

    if (me.store && me.store.storeId) {
      if (value && value.altVal) {
        // update alt footer value, which may cause updating record field again:
        gw.app.requestViewRoot(gw.GridUtil.getFullIdForCell(me.store, me, fieldName),
            {calcAltModelValue: (value && value.text !== undefined) ? value.text : value},
            'NO_MASK_ELEM',
            {altValRec: [this, fieldName]});
      }
      var grid = Ext.ComponentManager.get(me.store.storeId);
      if (grid) {
        me._updateSum(grid, fieldName, me);
      }
    }
  },

  unjoin: function (store) {
    var me = this;
    if (me.menus) {
      Ext.iterate(me.menus, function (mId, item) {
        item.menu.destroy();
      });
      delete me.menus;
    }

    me.callParent(arguments);
  }
});