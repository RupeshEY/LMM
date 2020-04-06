/**
 * A container which render the paging control in the title bar.
 */
Ext.define('gw.ext.PagingPanel', {
  extend: 'Ext.panel.Panel', // TODO: use container to reduce overhead, when there's no pagination
  alias: 'widget.gpagingpanel',

  constructor: function() {
    var me = this;
    me.plugins = me.plugins || [];
    me.plugins.push({ ptype: 'glayout' });

    return me.callParent(arguments);
  },

  initComponent: function () {
    var me = this;
    if (me.options) {
      var currPage = me.options.start / me.options.limit + 1;
      me.tbar = {
        pageSize: me.options.limit,
        total: me.options.total,
        currentPage: currPage,
        viewRootId: me.id,
        // This id is needed for testing and updating the page count.
        pagingId: me.id + ':_ListPaging',
        recordCountId: me.id + ':_RecordCount',
        pagingDisabled: me.options.pagingDisabled,
        xtype: 'gpanelpaging',
        //@UpgradedSencha 5.1, use the plain style for the buttons in this paging panel
        defaultButtonUI: 'plain-toolbar'
      };
    }
    me.callParent(arguments);
  }
});
