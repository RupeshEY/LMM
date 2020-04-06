/**
 * HelperItem Plugin which helps render helper and hook up links
 */
Ext.define('gw.plugin.HelperItem', {
    alias: 'plugin.helperitem',
    extend: 'Ext.AbstractPlugin',
    uses: ['gw.Util', 'gw.app'],

    // ORIGINAL
    /**
     * Shows helper menu next to the helper icon
     */
    showMenu: function () {
        var item = this.item;

        if (item && item.menu) {
            if (item.menu.isHidden()) {
                gw.Util.createAndShowOnDemandMenuIfNeeded(item);
                item.menu.showAt(item.el.getAnchorXY('bl'));
                item.menu.focus();
            }
        } else {
            gw.Debug.log("No menu available for field " + this.id);
        }
    },

    // NEW
    destroy: function () {
        var cmp = this.getCmp();

        if (cmp.item) {
            Ext.destroyMembers(cmp.item, 'menu');
            delete cmp.item.menuOpener;
            delete cmp.item;
        }

        Ext.destroyMembers(cmp,
            'suffix',
            'prefix',
            'beforeSubTpl',
            'afterSubTpl',
            'afterContainer'
        );
    },

    init: function (cmp) {
        var me = this,
            suffix,
            item,
            alt = '',
            title = '',
            iconHeight = '',
            iconWidth = '';

        cmp.beforeSubTpl = cmp.prefix;
        cmp.afterSubTpl = cmp.suffix;

        //unbox items
        if (cmp.item) {
            if (cmp.item.length > 0) {
                item = cmp.item[0];
            } else if (cmp.item) {
                item = cmp.item;
            }
        }

        if (item) {

            if (item.text) {
                suffix = '<span class="g-link-button">' + item.text + '</span>';
            } else {
                if (item.altText) {
                    alt = '" alt="' + item.altText;
                    title = '" title="' + item.altText;  // tooltip for image
                }
                if (item.iconWidth) {
                    iconWidth = '" width="' + item.iconWidth;
                    iconHeight = '" height="' + item.iconHeight;
                }
                suffix = '<img src="' + item.icon + iconWidth + iconHeight + alt + title + '">';
            }
            // wrap inside an anchor to allow focusing onto this element:
            suffix = '<a href="javascript:void(0)" id="' + item.id + '" class="' + gw.app.getEventSourceCls() + '">' + suffix + '</a>';

            if (item.menu) { // create menu component
                var menu = item.menu;
                delete item.menu;

                item.menu = gw.Util.getOrCreateFieldMenu(item.id, menu);
                item.menuOpener = this;
            }

            if (cmp.afterSubTpl) {
                cmp.afterSubTpl += suffix;
            } else {
                cmp.afterSubTpl = suffix;
            }

            if (cmp instanceof Ext.form.FieldContainer) {
                cmp.afterContainer = cmp.afterSubTpl;
                cmp.afterSubTpl = null;
            }

            if (Ext.isString(item.handler)) {   // convert string to JS function
                item.ghandler = item.handler;
                item.handler = function () {
                    eval(item.ghandler);
                }
            }

            cmp.on('afterrender', me.onCmpBoxReady, me, {single: true});
        }
    },

    onCmpBoxReady: function (field) {
        var me = this,
            focusable,
            item;

        if (field.item[0] !== undefined) {
            field.item = field.item[0];
        }

        item = field.item;
        if (item) {
            item.el = Ext.get(item.id);
            focusable = false; // if there is a click listener - then focusable
            if (item.menu) { // show menu when the helper icon is clicked
                field.mon(item.el, 'click', me.showMenu, field, {scope: me, stopEvent: true});
                focusable = true;
            } else if (field.item.handler) { // custom handler
                field.mon(item.el, 'click', item.handler, field, {stopEvent: true});
                focusable = true;
            } else if (item.xtype == "gbutton") {
                focusable = true;
            }

            if (focusable) {
                field.mon(item.el, 'focus', me.onItemFocus, item.el);
                field.mon(item.el, 'blur', me.onItemBlur, item.el);
            }

            if (field.disabled) {
                item.el.setVisible(false);
            }
        }
    },

    onItemFocus: function () {
        gw.app.onFocus(this.id);
    },

    onItemBlur: function () {
        gw.app.onBlur(this.id);
    }
});
