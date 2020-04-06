Ext.define('gw.override.event.publisher.Focus', {
  override: 'Ext.event.publisher.Focus',
  focusTimeout: 0,
  /*
   * PLWEB-4358: Focus should not be lost on a partial re-layout if we are focused on an area that's not being redrawn.
   */
  doDelegatedEvent: function(e, invokeAfter) {
    var me = this,
        relatedTarget;

    // We cannot pass control to the parent since our override is in the middle of the function
    e = me.callSuper([e, false]);

    if (e) {
      if (e.type === 'focusin') {
        clearTimeout(me.focusTimeout);
      }
      if (e.type === 'focusout') {
        if (e.relatedTarget == null) {

          // @UpgradedSencha
          // === begin override ===
          var blurredEl = e.target === window ? document.body : e.target;

          // There might be an upcoming focus event, but if none happens
          // within 1ms, then we treat this as a focus of the body
          me.focusTimeout = setTimeout(function () {
            me.focusTimeout = 0;
            Ext.event.publisher.Focus.previousActiveElement = null;
            me.processFocusIn(e, blurredEl, document.body, invokeAfter);
          }, 0);
          if (e.target === window || e.target === document) {
            Ext.event.publisher.Focus.previousActiveElement = null;
          }
          else {
            Ext.event.publisher.Focus.previousActiveElement = e.target;
          }
          // === end override ===
        }
      }
      else {
        relatedTarget = e.relatedTarget;

        // IE reports relatedTarget as either an inaccessible object which coercively equates to null, or just a blank object in the case of focusing from nowhere.
        // So we can't use a truth test ternary expression to substitute in document.body.
        me.processFocusIn(e, (relatedTarget == null || !relatedTarget.tagName) ? document.body : relatedTarget, e.target, invokeAfter);
      }
    }
  },

  /**
   * This override is needed because of a workaround we use to make keyboard shortcuts work in IE.
   * See the _disableIEMenuShortcut function in App.js for details.
   * @private
   */
  processFocusIn: function(e, fromElement, toElement, invokeAfter) {
    if (gw.app.shouldIgnoreIEFocusEvent()) {
      return;
    }
    this.callParent(arguments);
  }

});
