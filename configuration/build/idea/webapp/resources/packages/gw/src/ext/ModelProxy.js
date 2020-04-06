/**
 * A http proxy that delegates to gw.app
 */
Ext.define('gw.ext.ModelProxy', {
    extend: 'Ext.data.proxy.Ajax',
    alias: 'proxy.gw',
    uses: ['Ext.ComponentManager', 'gw.Util'],
    url: 'dummy',
    groupParam: 'grouper',

    /**
     * Let gw.app handle the request, eventually routing to the Ext.Ajax.request() method
     *
     * @UpgradedSencha - kept in sync with super class implementation, which removed
     * the callback and scope parameters from the call
     */
    doRequest: function (operation) {
        //
        // remove the fake-group-field from sort and group spec:
        //
        function removeFakeGroupField(sorters) {
            return Ext.Array.filter(sorters, function (sorter) {
                return !(Ext.isString(sorter.getProperty()) && sorter.getProperty() === ":grp");
            }, this);
        }

        if (operation._sorters) {
            operation._sorters = removeFakeGroupField(operation._sorters);
        }
        if (operation._grouper) {
            var grouper = operation._grouper;
            if (grouper && grouper.getProperty() === ":grp") {
              delete operation._grouper;
            }
        }

        var me = this,
            writer = me.getWriter(),
            request = me.buildRequest(operation);

        if (operation.allowWrite()) {
            request = writer.write(request);
        }

        Ext.apply(request, {
            binary: me.getBinary(),
            headers: me.getHeaders(),
            timeout: me.getTimeout(),
            scope: me,
            callback: me.createRequestCallback(request, operation),
            method: me.getMethod(request),
            useDefaultXhrHeader: me.getUseDefaultXhrHeader(),
            disableCaching: false // explicitly set it to false, ServerProxy handles caching
        });

        // @UpgradedSencha - copied from super class method
        if (me.getWithCredentials()) {
            request.setWithCredentials(true);
            request.setUsername(me.getUsername());
            request.setPassword(me.getPassword());
        }

        var params = request.getParams();
        if (params.argIds) { // collect arg values
            var ids = params.argIds.split(',');
            var argValues = [];
            for (var i = 0; i < ids.length; i++) {
                var argId = ids[i];
                var comp = argId ? Ext.ComponentManager.get(argId) : null;
                argValues[i] = comp ? gw.Util.getFieldValue(comp) : '';
            }
            params.additionalArgs = argValues;
        }
        if (params.node == 'root') {
            delete params.node; // remove id for the "invisible root" node
        }

        // @UpgradedSencha - adapted from the super class's sendRequest(request) method
        request.setRawRequest(
            gw.app.requestViewRoot(params.viewRootId, params, undefined,
                {operation: Ext.apply(operation, {viewRootId: params.viewRootId})}) // attach the data operation to be used during callback
        );
        me.lastRequest = request;

        return request;
    }
});
