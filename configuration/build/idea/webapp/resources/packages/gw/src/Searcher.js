/**
 * Provides a textbox with a search icon
 */
Ext.define('gw.Searcher', {
  extend: 'Ext.form.field.Text',
  alias: 'widget.searcher',
  uses: 'gw.app',

  initComponent: function () {
   // create menu:
    var me = this;
    if (me.gClearEnabled) {
      me.extraFieldBodyCls = gw.Util.appendCls(me.extraFieldBodyCls, 'g-clear-enabled');
      var clearItem = {
        icon: "images/app/calendar_close.png",
        compId: me.id,
        handler: function () {
          this.setValue('');
        },
        xtype: "button",
        id: me.id + '_CLEAR'
      };

      if (!me.item) {
        me.item = [clearItem]
      } else if (!me.item.menu) { // if there are menuItems, clear button will be combined with the menuItem
        // only one item
        var items = [];
        var item = null;
        items.push(clearItem);
        // TODO : make it work with multiple menuItems
        items.push(me.item[0]);
        item = [
          {
            icon: "images/app/drop_button.png",
            width: 16,
            height: 16,
            xtype: "button",
            id: me.getId() + '_MENU',
            menu: {items: items}
          }
        ];
        delete me.item;
        me.item = item;
      }
    }

    me.on('specialkey', function (field, e) {
      if (e.getKey() == e.ENTER) {
        this.performSearch();
      }
    });
    // @UpgradedSencha - set in the search trigger with the appropriately proscribed triggerId for the domId
    me.setTriggers({
      search: {
        domId: me.triggerId,  // for testing purpose
        cls: Ext.baseCSSPrefix + 'form-search-trigger', // default to search icon
        handler: function(field) {
          field.performSearch();
        }
      }
    });

    me.callParent(arguments);
  },

  performSearch: function() {
    gw.app.handleAction(null, this.triggerId,
      {postCallback: function () {
        // searcher may have been removed, so dom won't be available.
        if (this.el && this.el.dom) {
          this.setValue('')
        }
      }, postCallbackScope: this})
  }
});
