/**
 * @class Ext.chart.overrides.AbstractChart
 */
Ext.define('gw.chart.overrides.AbstractChart', {
    override: 'Ext.chart.AbstractChart',

    initComponent: function() {
      var me = this;
      me.callParent();

      if (me.legend && me.disableLegendClicks) {
          me.legend.on('beforeitemclick',
          function (record, item, index, e) {
            // Disables clicking on the legend
            return false;
          }
        );
      }
    },

    /*
     @UpgradedSencha PLWEB-5645: Charts is leaking axes and series objects into the ComponentManager
     We need to manually destroy the series and axes when the chart is destroyed
     */
    destroy: function() {
        var me = this;

        if (me.axes) {
            Ext.Array.each(me.axes, function(axes) {
                axes.destroy();
            });
        }

        if (me.series) {
            Ext.Array.each(me.series, function(series) {
                series.destroy();
            });
        }

        me.callParent(arguments);
    }
});