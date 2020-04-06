//@UpgradedSencha 5.1 New class for Sencha charts package
Ext.define('gw.chart.CartesianChart', {
    extend: 'Ext.chart.CartesianChart',
    alias: 'widget.gcartesianchart',

    constructor: function (config) {
        if (config.axes) {
            Ext.Array.each(config.axes, function (axis) {

                if (axis.type === 'time') {
                    if (axis.step) {
                        axis.step[0] = eval(axis.step[0]); // get the value for an ExtJS const (e.g. Ext.Date.MONTH)
                    }
                }

                if (axis.gLabelRotate) {
                    axis.label = axis.label || {};
                    axis.label.rotate = {degrees: axis.gLabelRotate};
                    delete axis.gLabelRotate;
                }

                if (axis.gUseWholeNumbers) {
                    // round up to whole number
                    // @SenchaUpgrade Using "decimals: 0" from ExtJs may cause duplicate tick labels for the axis. Use a
                    //                custom renderer function for now, to (1) round to whole number, and (2) omit duplicates.
                    axis.label = axis.label || {};
                    Ext.applyIf(axis.label, {
                        renderer: function (v) {
                            var val = Math.round(v); // round up to whole number
                            var val2 = Math.round(v * 10) / 10; // round up to 1 decimal
                            return val == val2 ? val : ''; // only show each whole number ONCE
                        }
                    });
                }

            })
        }

        if (config.series) {
            Ext.Array.each(config.series, function (item) {
                item.highlight = true;
                item.tooltip = {
                    trackMouse: true,
                    renderer: function (storeItem, item) {
                        for (var i = 0, iLen = item.series.getYField().length; i < iLen; i++) {
                            var dataField = (iLen === 1) ?
                                item.series.getYField()[i] :
                                item.field;
                            if (item.series.getYField()[i] === dataField) {
                                this.setHtml(item.series.getTitle()[i] + ': ' + storeItem.get(dataField));
                                break;
                            }
                        }
                    }
                };

                if (item.type === 'area') {
                    item.marker =  Ext.apply(item.marker || {}, {
                        opacity: 0,
                        scaling: 0.01,
                        fx: {
                            duration: 200,
                            easing: 'easeOut'
                        }
                    });

                    item.highlightCfg = Ext.apply(item.highlightCfg || {}, {
                        opacity: 1,
                        scaling: 1.5
                    });

                    item.style = Ext.apply(item.style || {}, {
                        opacity: 0.6
                    });

                } else if (item.type === 'line' || item.type === 'scatter') {

                    item.marker = true;

                } else if (item.type === 'bar') {
                    if(!item.stacked){
                        item.stacked = false; //stacked now defaults to true , reverting
                    }
                    item.column = true; // column instead of bar

                }

            });
        }

        this.callParent(arguments);
    }
});
