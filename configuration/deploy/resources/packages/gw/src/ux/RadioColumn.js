/**
 * A grid plugin which renders a radio column, which does not allow more than one row to be selected.
 */
Ext.define('gw.ux.RadioColumn', {
  alias: 'widget.radiocolumn',
  extend: 'Ext.grid.column.Column',
  uses: 'gw.GridUtil',
  stopSelection: false,

  _isGridEditorDisabled : function (colIndex, rowIndex, store, view) {
    var column = view.headerCt.getHeaderAtIndex(colIndex);
    var disabled = true;
    gw.GridUtil.processGridEditor(store, rowIndex, column, function (editorByRow) {
      if (!editorByRow[0].disabled) {
        disabled = false;
      }
    });
    return disabled;
  },

  _resetExtraValueForStoreWithGroupName : function(group) {
    Ext.data.StoreManager.each(function(store) {
      if (store.extraValues && store.extraValues[group]) {
        delete store.extraValues[group];
      }
    })
  },

  getFullIdForRadio : function (rIndex, store) {
    return gw.GridUtil.getFullIdForCell(store,store.getAt(rIndex),this.dataIndex)
  },

  /**
   * Registers events to track initial checked row using "extraValues" under the grid store.
   */
  initComponent : function() {
    this.callParent(arguments);

    function initRadioState(store, records, successful, eOpts) {
      store.extraValues = store.extraValues || {};
      var cellID = this.dataIndex;
      var rIndex = store.data.findIndexBy(function(record){
          var radioBtnValue = record.data[cellID];
          return radioBtnValue && radioBtnValue.text;
      });
      if (rIndex >= 0) {
        store.extraValues[this.group] = this.getFullIdForRadio(rIndex, store);
      }
    }

    this.renderer = Ext.bind(this.renderer, this);
    this.on('boxready', function(radioColumn, width, height, eOpts){
      radioColumn.getRootHeaderCt().grid.store.on("load", initRadioState, this);
    });
  },

  /**
   * Updates "extraValues" of the grid store when checked row changes
   */
   //@SenchaUpgrade overriding private method
   processEvent: function(type, view, cell, recordIndex, cellIndex, e, record, row) {
     var me = this,
       group = me.group,
       onWhiteSpace = false,
       key = type === 'keydown' && e.getKey(),
       mousedown = type == 'mousedown';

     onWhiteSpace =  Ext.fly(e.target).query('[class^=' + Ext.baseCSSPrefix + 'grid3-radio-col]').length > 0;

     // boolean cell cannot be disabled
     // if clicked, cannot be clicked on the white space around button, if it is a key it must be a Space
     if (!me.disabled && ((mousedown && !onWhiteSpace) || (key && e.getKey() == e.SPACE))) {
       var store = view.getStore(),
       dataIndex = this.dataIndex,
       grid = view.ownerCt;

       // Note: Disable the cell click if the cell is not editable.
       var disabled = me._isGridEditorDisabled(cellIndex, recordIndex, store, view);
       if (!disabled) {
         gw.GridUtil.processCellClick(me, grid, record, recordIndex, dataIndex, function() {
           me._resetExtraValueForStoreWithGroupName(group);
           store.extraValues = store.extraValues || {};
           store.extraValues[group] = gw.GridUtil.getFullIdForCell(store,record,dataIndex);
           // notify all records updated, after a short timeout
           grid.suspendLayouts();
           store.each(function(rec) {
             if (rec.get(dataIndex) === true) {
               rec.set(dataIndex, false);
             }
           });
           record.set(dataIndex, true);
           grid.resumeLayouts();
         });
       }
     }
     return true;
  },

  /***
   * Renders the check row differently
   */
  renderer : function(value, p, record, rowIndex, colIndex, store, view) {
    var me = this;
    //@SenchaUpgrade AHK - 4/2/2013 - It seems that sometimes (always?) we get passed in something like the GroupingSummary
    // that contains the store, rather than the store itself, as the store parameter.  That seems like it's probably a bug
    // on the ExtJS side.
    store = view.getStore();

    var disabled = me._isGridEditorDisabled(colIndex, rowIndex, store, view);
    if (!disabled) {
      p.tdCls += ' ' + Ext.baseCSSPrefix + 'grid3-radio-col-td';
      // It seems extraValues not yet setup before initial rendering of the cells in some cases
      var v = false;
      if (store.extraValues) {
        v = store.extraValues[this.group] == me.getFullIdForRadio(rowIndex, store);
      } else {
        v = record.get(me.dataIndex);
      }
      return '<div class="' + Ext.baseCSSPrefix + 'grid3-radio-col' + (v ? '-on' : '') + ' ' +
          Ext.baseCSSPrefix + 'grid3-cc-' + me.id + '">&#160;</div>';

    } else {
      return '<div></div>';
    }
  }
});
