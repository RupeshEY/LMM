//UpgradedSencha 5.1 EXTJS-16784 Moving item from toolbar overflow back to visible position disables menu on buttons with menu
Ext.define('EXTJS-16784.util.Floating', {
    override: 'Ext.util.Floating',

    constructor: function () {
        var me = this,
            el = me.el,
            shadow = me.shadow,
            shadowOffset, shadowConfig;

        if (shadow) {
            shadowConfig = {
                mode: (shadow === true) ? 'sides' : shadow
            };
            shadowOffset = me.shadowOffset;
            if (shadowOffset) {
                shadowConfig.offset = shadowOffset;
            }
            shadowConfig.animate = me.animateShadow;
            shadowConfig.fixed = me.fixed;
            el.enableShadow(shadowConfig, false);
        }

        if (me.shim || Ext.useShims) {
            el.enableShim({
                fixed: me.fixed
            }, false);
        }

        el.setVisibilityMode(me._visModeMap[me.hideMode]);

        // If modal, and focus navigation not being handled by the FocusManager,
        // catch tab navigation, and loop back in on tab off first or last item.
        if (me.modal && !(Ext.enableFocusManager)) {
            me.el.on('keydown', me.onKeyDown, me);
        }

        // mousedown brings to front
        // Use capture to see the event first before any contained DD instance stop the event.
        me.el.on({
            mousedown: me.onMouseDown,
            scope: me,
            capture: true
        });

        // Register with the configured ownerCt.
        // With this we acquire a floatParent for relative positioning, and a zIndexParent which is an
        // ancestor floater which provides zIndex management.
        me.registerWithOwnerCt();

        me.initHierarchyEvents();
    }
});