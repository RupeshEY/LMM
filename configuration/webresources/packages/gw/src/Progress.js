/**
 * The gw.Progress bar extends Ext.ProgressBar to add the following:
 * - Show a spinning/busy image when the progress cannot be estimated.
 * - Show a detailed status text for progress steps outside the progress bar
 * - Server polling and refresh on complete.
 *
 * Some methods are overridden because the template customization is not supported.
 */
Ext.define('gw.Progress', {
  extend: 'Ext.ProgressBar',
  requires: 'Ext.ProgressBar',
  uses: ['gw.progressfunction', 'gw.app'],
  alias: 'widget.gprogress',

  width: 200,

  /**
   * Uses the template from the standard Sencha progress bar but wraps it in an additional
   * div and precedes it by another div we use to display a separate status message. The
   * original Sencha template works by rendering two divs on top of each other. The background
   * div displays just the text (e.g. "20%") centered in a box. The foreground div renders on
   * top but has a width proportional to the current progress value, so it is truncated as long
   * as the value is less than 1.0 (100%). The foreground div also displays the centered text,
   * so it will still show up as the foreground div grows and hides the background.
   * @SenchaUpgrade Need to verify the default renderTpl is still defined as an array
   */
  renderTpl: function () {
    return [
      '<div class="{baseCls}-status">{status}</div>',
      '<div class="{baseCls}-wrap">'
    ].concat(

        // @SenchaUpgrade copied from Ext.ProgressBar#renderTpl:
        [
          '<tpl if="internalText">',
              '<div class="{baseCls}-text {baseCls}-text-back">{text}</div>',
          '</tpl>',
          '<div id="{id}-bar" data-ref="bar" class="{baseCls}-bar {baseCls}-bar-{ui}" role="presentation" style="width:{percentage}%">',
              '<tpl if="internalText">',
                  '<div class="{baseCls}-text">',
                      '<div>{text}</div>',
                  '</div>',
              '</tpl>',
          '</div>'
        ],

        ['</div>']
      )
  }(),

  initRenderData: function() {
    return Ext.apply(this.callParent(), {
      status : this.status
    });
  },

  /**
   * Get the value of this progress bar. The value is a fractional from 0 to 1, 1 is 100%
   */
  getValue: function () {
    return this.value;
  },

  /**
   * Update the status we display above the progress bar or by the spinner
   */
  updateStatus: function(status) {
    var me = this;
    me.status = status || '';
    if (me.rendered) {
      me.statusEl.update(me.status);
    }
  },

  /**
   * Shows the manual progress bar if progress steps can be determined.
   * Shows the spinner if animation is enabled and the progress steps are not known (progress duration unknown).
   * The spinner is on the outer wrap element and the bar is inside the outer wrap element.
   */
  updateProgress: function (value, text, animate) {
    var me = this;
    if (me.rendered && !me.isDestroyed) {
      me.showOrHideProgressBar(value);
      me.showOrHideSpinner(value);
    }
    return me.callParent(arguments);
  },

  afterRender: function () {
    var me = this;
    // Declare a reference to the status text element
    if (!me.statusEl) {
      me.statusEl = me.el.select('.' + me.baseCls + '-status');
    }
    if (!me.wrapEl) {
      me.wrapEl = me.el.select('.' + me.baseCls + '-wrap');

      // Push the root class for the root element down to the wrapped progress bar
      Ext.get(me.el).removeCls(me.baseCls);
      Ext.get(me.wrapEl).removeCls(me.baseCls + '-wrap');
      Ext.get(me.wrapEl).addCls(me.baseCls);
    }

    me.showOrHideProgressBar(me.value);
    me.showOrHideSpinner(me.value);

    me.callParent(arguments);

    // Register poller
    if (me.value < 1) {
      if (me.actionOnComplete) {
        gw.app.showBusy()
      }
      gw.progressfunction.registerToPoll(me.id);
    } else if (me.actionOnComplete) {
      gw.app.handleAction(null, me.target)
    }
  },

  showOrHideProgressBar : function(value) {
    var me = this;
    if (me.hideAnimation || value < 0) {
      Ext.get(me.wrapEl).hide();
      // AHK - 5-28-2013 - The height on the containing element is set to 44px in the CSS, so we need to size it down
      // if the progress bar div is hidden
      Ext.get(me.el).setHeight("18px");
    } else {
      Ext.get(me.wrapEl).show();
      Ext.get(me.el).setHeight("44px");
    }
  },

  showOrHideSpinner : function(value) {
    var me = this;
    if (!me.hideAnimation && value < 0) {
      Ext.get(me.statusEl).addCls("g-progress-spinner");
    } else {
      Ext.get(me.statusEl).removeCls("g-progress-spinner");
    }
  },

  /**
   * Update the progress bar state based on the progress bar command information.
   * This calls the progress bar's updateProgress function
   * @param cmdInfo progress bar command information data structure
   * @see updateProgress
   */
  updateProgBar: function (cmdInfo) {
    var me = this;
    me.hideAnimation = cmdInfo.hideAnimation;

    // Updating the progress bar
    if (cmdInfo.value) {
      me.updateProgress(cmdInfo.value, cmdInfo.text);
      me.updateStatus(cmdInfo.status);
    }

    if (cmdInfo.value < 1) {
      gw.progressfunction.registerToPoll(cmdInfo.target);
    } else {
      if (cmdInfo.actionOnComplete) {
        gw.app.handleAction(null, cmdInfo.target);
      }
    }
  }
});
