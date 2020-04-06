Ext.define('gw.CenterPanel', {
    extend: 'gw.container.StretchContainer',
    xtype: 'gcenterpanel',

    scrollable: true,
    id: 'centerPanel',
    region: 'center',

    // @private
    getElConfig: function() {
        var config = this.callParent();
        if (Ext.isGecko) {
            // PLWEB-5814: For some reason firefox allows tabbing to the CenterPanel div via keyboard, so set it's
            // tabindex to -1 to prevent this.
            config.tabindex = "-1";
        }
        return config;
    },
    /**
     * Hook to inject default properties in specific views
     * prior instantiation.
     */
    privates: {
        applyDefaults: function (config) {
            config = this.callParent([config]);

            // Login
            if (config.id === 'Login') {
                Ext.apply(config, {
                    ui: 'login-page',
                    managedHeight: false
                });
            }

            return config;
        }
    },

    /**
     * Hook to inject default properties in specific views
     * post instantiation.
     */
    onAdd: function (component, index) {
        this.callParent(arguments);

        // Login
        if (component.id === 'Login') {
            Ext.each(component.query('field'), function (item) {
                item.labelAlign = 'right';
            });
        }
    }
});
