/**
 * Extends Ext PagingToolbar
 */
Ext.define('gw.Paging', {
  extend: 'Ext.toolbar.Paging',
  uses: ['Ext.String'],
  alias: 'widget.gpaging',

  listeners: {
    add: function (pbar, component) {
      if (this.hidden) {
        this.showOrHideToolbar();
      }
    }
  },

  /**
   * Overrides super to do special handling for child items
   */
  initComponent: function () {
    var me = this;
    me.callParent(arguments);

    // set id for the grid record count
    var displayItem = me.child('#displayItem');
    if (displayItem && me.recordCountId) {
      // PLWEB-5650: Do not override the component ID, doing so will cause a memory leak
      // since the component will not be able to remove itself from the component
      // manager now that the component map key is different than the component ID
      displayItem.recordCountId = me.recordCountId;
    }
  },

  /**
   * Gets the standard paging items in the toolbar
   * @private
   */
  getPagingItems: function () {
    var me = this,
        inputListeners = {
          scope: me,
          blur: me.onPagingBlur
        };

    inputListeners[Ext.supports.SpecialKeyDownRepeat ? 'keydown' : 'keypress'] = me.onPagingKeyDown;

    return [
      {
        ui: 'plain-toolbar',
        itemId: 'first',
        tooltip: me.firstText,
        overflowText: me.firstText,
        iconCls: Ext.baseCSSPrefix + 'tbar-page-first',
        disabled: true,
        handler: me.moveFirst,
        scope: me,
        noaction: 1
      },
      {
        ui: 'plain-toolbar',
        itemId: 'prev',
        tooltip: me.prevText,
        overflowText: me.prevText,
        iconCls: Ext.baseCSSPrefix + 'tbar-page-prev',
        disabled: true,
        handler: me.movePrevious,
        scope: me,
        noaction: 1
      },
      '-',
      me.beforePageText,
      {
        xtype: 'numberfield',
        id: me.pagingId,
        itemId: 'inputItem',
        name: 'inputItem',
        cls: Ext.baseCSSPrefix + 'tbar-page-number',
        allowDecimals: false,
        minValue: 1,
        hideTrigger: true,
        enableKeyEvents: true,
        keyNavEnabled: false,
        selectOnFocus: true,
        submitValue: false,
        // mark it as not a field so the form will not catch it when getting fields
        isFormField: false,
        width: me.inputItemWidth,
        margin: '-1 2 3 2',
        listeners: inputListeners // added special key support above at start of the method
      },
      {
        xtype: 'tbtext',
        itemId: 'afterTextItem',
        text: Ext.String.format(me.afterPageText, 1)
      },
      '-',
      {
        ui: 'plain-toolbar',
        itemId: 'next',
        tooltip: me.nextText,
        overflowText: me.nextText,
        iconCls: Ext.baseCSSPrefix + 'tbar-page-next',
        disabled: true,
        handler: me.moveNext,
        scope: me,
        noaction: 1
      },
      {
        ui: 'plain-toolbar',
        itemId: 'last',
        tooltip: me.lastText,
        overflowText: me.lastText,
        iconCls: Ext.baseCSSPrefix + 'tbar-page-last',
        disabled: true,
        handler: me.moveLast,
        scope: me,
        noaction: 1
      }
    ];
  },

  // @UpgradedSencha 5.1 Fix Layout fail, see the notes inline
  // @private
  onLoad : function() {
    var me = this,
        pageData,
        currPage,
        pageCount,
        afterText,
        count,
        isEmpty,
        item;

    count = me.store.getCount();
    isEmpty = count === 0;
    if (!isEmpty) {
      pageData = me.getPageData();
      currPage = pageData.currentPage;
      pageCount = pageData.pageCount;

      // Check for invalid current page.
      if (currPage > pageCount) {
        me.store.loadPage(pageCount);
        return;
      }

      afterText = Ext.String.format(me.afterPageText, isNaN(pageCount) ? 1 : pageCount);
    } else {
      currPage = 0;
      pageCount = 0;
      afterText = Ext.String.format(me.afterPageText, 0);
    }

    Ext.suspendLayouts();

    item = me.child('#afterTextItem');
    if (item) {
      item.setText(afterText);
    }
    item = me.getInputItem();
    if (item) {
      item.setDisabled(isEmpty).setValue(currPage);
    }
    me.setChildDisabled('#first', currPage === 1 || isEmpty);
    me.setChildDisabled('#prev', currPage === 1 || isEmpty);
    me.setChildDisabled('#next', currPage === pageCount  || isEmpty);
    me.setChildDisabled('#last', currPage === pageCount  || isEmpty);
    me.updateInfo();

    // GW override code
    me.inputItem = me.getInputItem();

    me.first = me.getComponent('first');
    me.prev = me.getComponent('prev');
    me.next = me.getComponent('next');
    me.last = me.getComponent('last');

    //@Sencha This code executes during initial refresh and layout of the view
    // showing items at this time is too late for the parent layout which is already initialized
    // If we do this now they become visible in the DOM but they don't participate in the layout.
    gw.PagingToolBarManager.deferToolBarRender(me);

    if (me.pagingDisabled) {
      me.inputItem.disable();

      var otherItems = [me.first, me.prev, me.next, me.last];
      Ext.each(otherItems, function (item) {
        item.disable();
      });
    }
    //--- end override

    Ext.resumeLayouts(true);

    if (!me.calledInternal) {
      me.fireEvent('change', me, pageData || me.emptyPageData);
    }
  },

  // Helper method
  _showPagingToolBarElements: function () {
    this._applyCommandPagingToolBarElements("show");
    this.showOrHideToolbar();
  },

  _hidePagingToolBarElements : function() {
    this._applyCommandPagingToolBarElements("hide");
    this.showOrHideToolbar();
  },

  _applyCommandPagingToolBarElements: function (commandString) {
    var me = this;
    var inputIndex = me.items.indexOf(me.inputItem);
    var otherItems = [me.first, me.prev, me.next, me.last];

    Ext.each(me.items.getRange(inputIndex - 2, inputIndex + 2), function (item) {
      item[commandString]();
    });
    Ext.each(otherItems, function (item) {
      item[commandString]();
    });
  },

  showOrHideToolbar: function () {
    var me = this;

    var allHidden = true;
    me.items.each(function (item) {
      if (!item.hidden) {
        allHidden = false;
      }
    });

    if (allHidden) {
      me.hide();
    } else {
      me.show();
    }
  }
});