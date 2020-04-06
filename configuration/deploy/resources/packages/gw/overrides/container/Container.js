/**
 * Overrides Container to support links and subtitle in the header
 */
Ext.define('gw.override.container.Container', {
  override: 'Ext.container.Container',
  requires: ['Ext.dom.Helper'],

  panelHeaderCls: Ext.baseCSSPrefix + 'panel-header-text',
  panelInlineIconCls: Ext.baseCSSPrefix + 'panel-inline-icon',

  initComponent: function () {
    var me = this;
    if (me.headerItems) {
      if (me.headerItems.length > 0) {
        me.tools = [];
        me.title = [];
        Ext.each(me.headerItems, function (item) {
          if (item.autoEl || item.cls === me.panelHeaderCls || item.subTitle) {
            if (item.autoEl && item.autoEl.cls === me.panelInlineIconCls) {
              // insert title and title icon to the panel TITLE
              var autoEl = item.autoEl;
              if (item.id) {
                autoEl.id = item.id; // apply id
              }
              me.title.push(Ext.core.DomHelper.markup(autoEl));
            } else if (item.cls === me.panelHeaderCls) {
              if (item.xtype === 'glink') {  // title is a link
                me.tools.push({
                  id: item.id,
                  xtype: item.xtype,
                  cls: 'g-title-link',
                  text: item.text
                });
              } else {  // title is plain text
                me.title.push('<span class="g-title" id="' + item.id + '">' + item.text + '</span>');
              }
            }
            if (item.subTitle) {
              me.title.push('<span class="g-subtitle">' + item.subTitle + '</span>');
            }
            return;
          }

          // insert other type of header item as "tools"
          if (item.items) {
            Ext.each(item.items, function(child) {
              me.tools.push(child);
            }, me)
          } else {
            me.tools.push(item);
          }
        }, me);

        if (me.tools.length === 0) {
          delete me.tools;
        }
        if (me.title.length === 0) {
          delete me.title;
        } else {
          me.title = me.title.join('');
        }
      }

      delete me.headerItems;
    } else if (me.subTitle) { // wizard subtitle
      me.title = (me.title ? me.title : '') + '<span class="g-subtitle-wizard">' + me.subTitle + '</span>';
    }

    me.callParent(arguments);
  }
});

