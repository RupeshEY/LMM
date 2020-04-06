/**
 * An anchor that calls server on click
 */
Ext.define('gw.ext.Link', {
  extend: 'Ext.Component',
  alias: 'widget.glink',
  uses: ['gw.app'],
  cls: 'g-link', // default cls
  disabledCls: '', // show link without action as plain text

  initComponent: function () {
    var me = this;
    me.autoEl = {
      tag: me.disabled ? 'span' : 'a',
      id: me.id,
      href: me.disabled ? undefined : 'javascript:void(0)',
      handler: me.disabled ? me.handler : undefined,
      cls: me.cls, //gw.app.getEventSourceCls(),
      cn: me.iconCls ? {
        tag: 'img',
        src: Ext.BLANK_IMAGE_URL,
        cls: Ext.baseCSSPrefix + 'panel-inline-icon ' + me.iconCls
      } : me.icon ? {
        tag: 'img',
        src: me.icon
      } : undefined,
      html: me.text
    };

    if (me.eventId) {
      me.autoEl.eventId = me.eventId
    }
    if (me.eventParam) {
      me.autoEl.eventParam = me.eventParam
    }

    if (me.tooltip) {
      me.autoEl['data-qtip'] = Ext.util.Format.htmlEncode(me.tooltip);
    }

    me.disabled = undefined; // remove "disabled" property to prevent grayed-out look for a Link without action

    me.callParent(arguments);
  },

  /**
   * Mimics the same function of ext Button, used for underlying shortcut key in the link text
   */
  setText: function (text) {
    text = text || '';
    var me = this,
      oldText = me.text || '';

    if (text != oldText) {
      me.text = text;
      if (me.rendered) {
        me.getEl().update(text || '&#160;');
        me.updateLayout();
      }
      me.autoEl.html = me.text;
    }
    return me;
  },

  /**
   * Registers click handler, after DOM is rendered
   */
  afterRender: function () {
    var me = this;
    me.callParent(arguments);
    if (me.autoEl.tag == 'a') {
      var e = me.getEl();
      if (e) {
        e.on('click', function (evt) {
          gw.app.handleCompAction(this, evt)
        }, me, {stopEvent: true})
      }
    }
  }

});
