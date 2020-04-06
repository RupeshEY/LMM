Ext.define('gw.override.tab.Tab', {
  override: 'Ext.tab.Tab',
  uses: ['gw.app'],

  margin: '2 0 0 1', // @UpgradedSencha 5.1 - add a little margin on the top and left to match Emerald look

  fetchRequested: false,  // @UpgradedSencha - need flag to prevent multiple fetches when activating
  initComponent: function () {
    var me = this;
    me.callOverridden(arguments);

    if (me.card && me.card.tabId) {
      me.id = me.card.tabId;
    }
  },

  listeners: {
    /**
     * Fetch new tab content when user clicks on a different tab
     */
    // @UpgradedSencha - switched from click handling to activate handling since click now happens after active.
    // The previous logic of fetching on not active needed to be replaced by code to fetch only once since the activate
    // event seems to be called twice
    activate: function () {
      var me = this;
      if (me.rendered && me.card.tabId && !me.fetchRequested) {
        me.fetchRequested = true;
        gw.app.handleAction(null, me.card.tabId, {postCallback: function() {
          // PLWEB-5823 - restore the focus to the tab after processing the action.
          // NOTE: the current tab (me) was destroyed by the action, so we need to fly() to the new one via it's id
          var newTab = Ext.fly(me.id);
          if (newTab) {
            newTab.focus();
          }
        }});
      }
    },
    // @UpgradedSencha - on deactivate, turn of fetchRequested flag so that the next activate will re-fetch
    deactivate: function() {
      var me = this;
      if (me.rendered && me.card.tabId) {
        me.fetchRequested = false;
      }
    }
  }
});
