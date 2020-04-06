Ext.define('gw.override.dom.Element', {
  override: 'Ext.dom.Element',

  /**
   * @UpgradedSencha - ExtJs 5 stopped supporting the : as an valid identifier.  This override (plus a few others)
   * restores that support.
   */
  validIdRe: /^[a-z_:][a-z0-9\-_:\/]*$/i,
  /**
   * Returns `true` if this element matches the passed simple selector
   * (e.g. 'div.some-class' or 'span:first-child').
   * @param {String/Function} selector The simple selector to test or a function which is passed
   * candidate nodes, and should return `true` for nodes which match.
   * @return {Boolean} `true` if this element matches the selector, else `false`.
   *
   * @UpgradedSencha - ExtJs 5 stopped supporting the : as an valid identifier.  This override (plus a few others)
   * restores that support.
   */
  is: function(selector) {
    var dom = this.dom,
        is;

    if (!selector) {
      // In Ext 4 is() called through to DomQuery methods, and would always
      // return true if the selector was ''.  The new query() method in v5 uses
      // querySelector/querySeletorAll() which consider '' to be an invalid
      // selector and throw an error as a result.  To maintain compatibility
      // with the various users of is() we have to return true if the selector
      // is an empty string.  For example: el.up('') should return the element's
      // direct parent.
      is = true;
    } else if (!dom.tagName) {
      // document and window objects can never match a selector
      is = false;
    } else if (Ext.isFunction(selector)) {
      is = selector(dom);
    } else {
      // @UpgradedSencha - escape the colon and slash in the selector
      is = dom[Ext.supports.matchesSelector](Ext.escapeIdSelector(selector));
    }

    return is;
  }
});
