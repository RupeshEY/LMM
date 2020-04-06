Ext.define('gw.MenuItem', {
  extend: 'Ext.menu.CheckItem',
  uses: 'gw.Util',
  alias: 'widget.gmenuitem',

  // @UpgradedSencha 5.1 - Workaround for Sencha bug EXTJS-13775 (preventDefault on click event
  // of component's element does not work on IE10/11).  Copied the Ext.menu.Item renderTpl and changed one line so that
  // no 'href="#"' is generated when hasHref is false.  This effectively solves the issue where the UI is being sent
  // to the resources home page.
  renderTpl:
      '<tpl if="plain">' +
      '{text}' +
      '<tpl else>' +
      '<a id="{id}-itemEl" data-ref="itemEl"' +
      ' class="{linkCls}<tpl if="hasHref"> {linkHrefCls}</tpl>{childElCls}"' +
//      ' href="{href}" role="menuitem" ' + // - overridden with the line below to only generates href when there is one
      '<tpl if="hasHref"> href="{href}"</tpl> role="menuitem" ' +
      '<tpl if="hrefTarget"> target="{hrefTarget}"</tpl>' +
      ' hidefocus="true"' +
    // For most browsers the text is already unselectable but Opera needs an explicit unselectable="on".
      ' unselectable="on"' +
      '<tpl if="tabIndex != null">' +
      ' tabindex="{tabIndex}"' +
      '</tpl>' +
      '>' +
      '<span id="{id}-textEl" data-ref="textEl" class="{textCls} {textCls}-{ui} {indentCls}{childElCls}" unselectable="on">{text}</span>' +
      '<tpl if="hasIcon">' +
      '<div role="presentation" id="{id}-iconEl" data-ref="iconEl" class="{baseIconCls}-{ui} {baseIconCls}' +
      '{[values.rightIcon ? "-right" : ""]} {iconCls}' +
      '{childElCls} {glyphCls}" style="<tpl if="icon">background-image:url({icon});</tpl>' +
      '<tpl if="glyph && glyphFontFamily">font-family:{glyphFontFamily};</tpl>">' +
      '<tpl if="glyph">&#{glyph};</tpl>' +
      '</div>' +
      '</tpl>' +
      '<tpl if="showCheckbox">' +
      '<div role="presentation" id="{id}-checkEl" data-ref="checkEl" class="{baseIconCls}-{ui} {baseIconCls}' +
      '{[(values.hasIcon && !values.rightIcon) ? "-right" : ""]} ' +
      '{groupCls} {checkboxCls}{childElCls}">' +
      '</div>' +
      '</tpl>' +
      '<tpl if="hasMenu">' +
      '<div role="presentation" id="{id}-arrowEl" data-ref="arrowEl" class="{arrowCls} {arrowCls}-{ui}{childElCls}"></div>' +
      '</tpl>' +
      '</a>' +
      '</tpl>',

  /**
   * Registers the handler on each item, because menu item does not bubble click event to the global handler.
   */
  initComponent: function () {
    if (!this.handler) {
      this.setHandler(gw.app.onCompAction);
    } else if (Ext.isString(this.handler)) { // convert string to JS function
      this.ghandler = this.handler;
      this.hideOnClick = true;
      this.handler = function () {
        eval(this.ghandler)
      }
    }

    // menu item created by overflow toolbar doesn't have a predictable ID, use eventId for action:
    if (this.eventId) {
      this.on('render', function (item) {
        item.getEl().dom.setAttribute('eventId', this.eventId)
      })
    }
    // remove the empty menu if there is no items inside so it doesn't render the arrow
    if (this.menu && !this.menu.items && !this.ondemandmenu) {
      delete this.menu;
    }

    // @SenchaUpgrade Modify private "showCheckbox" field.
    if (this.checked) {
      // PL-29008 - Don't display the checkbox if it's unchecked.
      this.showCheckbox = true;
    } else {
      this.showCheckbox = false;
    }

    this.callParent(arguments);
  },

  // @SenchaUpgrade override private API: menu onDemand
  doExpandMenu: function () {
    gw.Util.createAndShowOnDemandMenuIfNeeded(this);
    this.callParent(arguments);
  }
});
