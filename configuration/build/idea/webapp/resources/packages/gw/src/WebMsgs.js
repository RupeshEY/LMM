Ext.define('gw.WebMsgs', {
  extend: 'Ext.view.View',
  requires: ['Ext.XTemplate'],
  uses: ['gw.model.MsgModel'],

  alias: 'widget.webmsgs',

  itemSelector: 'a', // handles click on anchors
  focusable: false, // @UpgradeSencha - this component is not focusable.

  listeners: {
    itemclick: function (dv, record, htmlElem) {
      var entryKey = htmlElem.getAttribute('entryKey');
      if (entryKey) {
        gw.app.handleAction(null, this.id, {param: entryKey})
      } else {
        gw.app.handleAction(null, htmlElem.getAttribute('refId'))
      }
    }
  },

  tpl: new Ext.XTemplate(
    // @UpgradedSencha - cleaned up the template and used the if/else logic to make it work properly with ExtJs 5
    '<tpl for=".">',
      '<div class="{cls}">',
      '<img class="{iconCls}" src="', Ext.BLANK_IMAGE_URL, '"/>',
      '<tpl if="linkText">',
        '{text} ', // write text outside link, if the link has its own text
      '</tpl>',
      '<tpl if="entryKey"><a entryKey="{entryKey}"></tpl>', // link START
      '<tpl if="refId"><a refId="{refId}"></tpl>',          // link START
      '<tpl if="linkText">',
        '{linkText}',
      '<tpl else>',
        '{text}',
      '</tpl>',
      // @UpgradeSencha, use values. to avoid warnings around the entryKey or refId no being specified
      '<tpl if="values.entryKey||values.refId"></a></tpl>', // link END
      '<tpl if="details"><div class="error_details">{details}</div></tpl>', // more details
      '</div>',
    '</tpl>'
  ),

  /**
   * Applies default store configs before init comp
   */
  initComponent: function () {
    var me = this,
        storeConfig = {
      storeId: me.id,
      model: 'gw.model.MsgModel',
      xtype: 'modelstore'
    };

// @UpgradedSencha a store now can be denoted as an empty-store string
    if (!me.store || me.store === 'ext-empty-store') {
      me.store = storeConfig;
    } else {
      Ext.apply(me.store, storeConfig);
    }

    me.callParent(arguments);
  },

  // @UpgradedSencha: PLWEB-5561 - Destroy the store to trigger the removal
  // of the metachange listener.
  destroy: function() {
    var me = this;
    if(me.store) {
      me.store.destroy();
    }
    me.callParent(arguments);
  }
});
