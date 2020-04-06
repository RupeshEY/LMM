/**
 * Make the splitter respond to keyboard navigation commands
 */
Ext.define('gw.override.resizer.Splitter', {
  override: 'Ext.resizer.Splitter',

  renderTpl: [
    '<tpl if="collapsible===true">',
      // Override the renderTpl from the Ext.resizer.Splitter to change the <div> to <a> and add tabIndex="0"
      //
      // '<div id="{id}-collapseEl" data-ref="collapseEl" role="presentation" class="', Ext.baseCSSPrefix, 'collapse-el ',
      //    Ext.baseCSSPrefix, 'layout-split-{collapseDir}{childElCls}">&#160;',
      // '</div>',
      '<a id="{id}-collapseEl" data-ref="collapseEl" tabIndex="0" role="presentation" class="', Ext.baseCSSPrefix, 'collapse-el ',
          Ext.baseCSSPrefix, 'layout-split-{collapseDir}{childElCls}">&#160;',
      '</a>',
      // end - override
    '</tpl>'
  ],

  onRender: function() {
    var me = this;

    me.callParent(arguments);

    // Add listeners on the mini-collapse tool unless performCollapse is set to false
    if (me.performCollapse !== false && me.renderData.collapsible) {
      me.mon(me.collapseEl, 'keydown', me.toggleViaKey, me);
    }
  },

  toggleViaKey: function(e) {
    var k = e.getKey(),
        me = this;

    if (k === e.SPACE || k === e.ENTER) {
      me.toggleTargetCmp(e);
      if (me.collapseEl) {
        // toggling seems to lose focus, restore it to this control after a delay to account for the redraw
        me.collapseEl.focus(500);
      }
    }
  }
});
