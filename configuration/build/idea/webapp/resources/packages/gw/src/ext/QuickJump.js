/**
 * Extends auto-complete with ENTER key behavior
 */
Ext.define('gw.ext.QuickJump', {
  extend: 'gw.ext.AutoCompleteWithMetaTags',
  alias: 'widget.quickjump',
  requires: ['gw.app'],

  shortcut: '/',
  typeAhead: true,
  typeAheadDelay: 10,
  queryDelay: 500,
  queryCaching : false,

  initComponent: function () {
    var me = this;
    me.emptyText = gw.app.localize('Web.QuickJump') + ' (Alt+/)';
    me.callParent(arguments);
    /**
     * call server when the ENTER key is pressed
     */
    me.on('specialkey', function (field, e) {
      if (e.getKey() == e.ENTER) {
        // select the highlighted item first if there is any
        me.selectHighlighted();
        // post to server
        gw.app.handleAction(e, field.getEl().dom,
          {postCallback: function () {
            field.clearValue()
          }, postCallbackScope: field})
      }
    });

    /**
     * PLWEB-6197 Quick Jump list behavior is not always consistent
     *
     * QuickJump changes depending on the page context and the quick-jump widget is rarely destroyed so always force a
     * remoteQuery
     */
     me.queryMode = "remote";
  },

  // @UpgradedSencha 5.1 - The bounded list key nav that was used to select the highlighted item in 4.x was removed
  // in 5.1.  So now we use the picker to find the highlighted item and get its associated record, then have that
  // record selected in the combo-box
  selectHighlighted: function() {
    var me = this,
        highlighted = me.picker ? me.picker.highlightedItem : null,
        record = highlighted ? me.picker.getRecord(highlighted) : null;
    if (record) {
      me.select(record);
    }
  },

  updateEmptyText: function () {
    this.emptyText = gw.app.localize('Web.QuickJump') + ' (Alt+/)';
    this.applyEmptyText();
  }
});
