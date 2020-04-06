/**
 * Helper functions for the W3C perf API. Most of it is a straight pass-through, but handles non-supported browsers gracefully
 *
 * Can be used manually, but enableProfiling() and disableProfiling() will turn on auto-mode
 */
Ext.define('gw.Performance', function() {

  var performanceMetricsEnabled = false;
  var performanceApiSupported = !!window.performance;
  var getEntriesSupported = !!window.performance.getEntries;

  var layoutMark = function() {
    window.performance.mark("afterlayout");
    window.performance.measure("layoutTime", "gwProcessCommandsStart", "afterlayout");
  };

  return {
    singleton: true,

    disableProfiling: function() {
      performanceMetricsEnabled = false;

      if (performanceApiSupported) {
        Ext.un('afterlayout', layoutMark);
      }
    },

    enableProfiling: function() {
      performanceMetricsEnabled = true;

      if (performanceApiSupported) {
        Ext.on('afterlayout', layoutMark);
      }
    },

    mark: function(name) {
      if (performanceApiSupported && performanceMetricsEnabled) {
        window.performance.mark(name);
      }
    },

    clearMarks: function() {
      if (performanceApiSupported && performanceMetricsEnabled) {
        window.performance.clearMarks();
      }
    },

    measure: function(name, start, end) {
      if (performanceApiSupported && performanceMetricsEnabled) {
        window.performance.measure(name, start, end);
      }
    },

    clearMeasure: function(name) {
      if (performanceApiSupported && performanceMetricsEnabled) {
        window.performance.clearMeasures(name);
      }
    },

    getEntries: function() {
      return getEntriesSupported && performanceMetricsEnabled ? window.performance.getEntries() : [];
    },

    getEntriesByType: function(type) {
      return getEntriesSupported && performanceMetricsEnabled ? window.performance.getEntriesByType(type) : [];
    },

    getEntriesByName: function(name) {
      return getEntriesSupported && performanceMetricsEnabled ? window.performance.getEntriesByName(name) : [];
    },

    getBackEndProcessingEntries: function() {
      return getEntriesSupported && performanceMetricsEnabled ?
          window.performance.getEntries().filter(function(entry) {
            return entry.initiatorType === 'xmlhttprequest';
          }) : [];
    },

    getFrontEndProcessingEntries: function() {
      return this.getEntriesByName("layoutTime");
    },

    getTotalBackEndProcessingTime: function() {
      return getEntriesSupported && performanceMetricsEnabled ?
          this.getBackEndProcessingEntries().map(function(entry) {
            return entry.duration;
          }).reduce(function(previousValue, currentValue) {
            return previousValue + currentValue;
          }, 0) : -1;
    },

    getTotalFrontEndProcessingTime: function() {
      return getEntriesSupported && performanceMetricsEnabled ?
          this.getFrontEndProcessingEntries().map(function(entry) {
            return entry.duration;
          }).reduce(function(previousValue, currentValue) {
            return previousValue + currentValue;
          }, 0) : -1;
    },

    /**
     * for use with the D3 gnatt chart plugin
     */
    getD3GnattChart: function() {

      var frontEndTimings = {
        'class': 'front_end_class',
        'label': 'Front-End Layout',
        'times': this.getFrontEndProcessingEntries().map(function(entry){
          return {
            starting_time: entry.startTime,
            ending_time: entry.startTime + entry.duration
          }
        })
      };

      var backEndTimings = {
        'class': 'back_end_class',
        'label': 'Back-End Processing',
        'times': this.getBackEndProcessingEntries().map(function(entry){
          return {
            starting_time: entry.startTime,
            ending_time: entry.startTime + entry.duration
          }
        })
      };

      return JSON.stringify([frontEndTimings, backEndTimings]);

    }
  }

});