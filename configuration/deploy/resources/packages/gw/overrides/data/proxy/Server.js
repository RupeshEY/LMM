Ext.define('gw.override.data.proxy.Server', {
    override: 'Ext.data.proxy.Server',

    encodeFilters: function(filters) {
        var out = [],
            length = filters.length,
            i;

        for (i = 0; i < length; i++) {
            out[i] = filters[i].serialize();

            //@UpgradedSencha 5.1
            //Tweak filters, so the GW serverside would understand.
            //TODO PLWEB-6006: instead, fix serverside and remove this hotfix

            out[i].field = filters[i].getProperty();
            out[i].type = filters[i].type || 'list';
            delete out[i].operator;
            delete out[i].property;

            //---End hotfix
        }

        return this.applyEncoding(out);
    }
});
