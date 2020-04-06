/**
 * Paging Tool Bar Manager
 */

Ext.define('gw.PagingToolBarManager', {
  singleton: true,

  _INTER_TOOLBAR_RESUME_DELAY: 10, // in milliseconds
  _toBeLayedOut: [], // the array of paging toolbars that need to be layed out
  _delayedResume : null,

  _suspendLayoutToolbarsAndResumeTask: function () {
    if (!gw.PagingToolBarManager._delayedResume) {
      gw.PagingToolBarManager._delayedResume = new Ext.util.DelayedTask(function (targetList) {
        var layoutList = gw.PagingToolBarManager._toBeLayedOut.slice(0);
        gw.PagingToolBarManager._toBeLayedOut = [];
        Ext.suspendLayouts();
        Ext.Array.each(layoutList, function (paging) {
          if (paging._showPagingToolBarElements) {
            paging._showPagingToolBarElements()
          }
        });
        Ext.resumeLayouts(true);
      })
    }
    return gw.PagingToolBarManager._delayedResume;
  },

  // deferToolBarRender may be called multiple times for the same page if there are
  // multiple ListViews that requiring paging. _toBeLayedOut aggregates the paging
  // bars that need to be layed out.
  deferToolBarRender: function (paging) {
    var otherItems = [paging.first, paging.prev, paging.next, paging.last];
    if (paging.store.pageSize < paging.store.getTotalCount()) { // currently paged
      gw.PagingToolBarManager._toBeLayedOut.push(paging);
      gw.PagingToolBarManager._suspendLayoutToolbarsAndResumeTask().delay(gw.PagingToolBarManager._INTER_TOOLBAR_RESUME_DELAY);
    } else if (paging._hidePagingToolBarElements) { // not yet paged
      paging._hidePagingToolBarElements();
    }
  }

});
