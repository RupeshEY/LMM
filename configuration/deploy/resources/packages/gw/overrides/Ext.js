/**
 * @UpgradedSencha - ExtJs 5 stopped supporting the : and / as valid identifiers.  This override (plus a few others)
 * restores that support.
 */
Ext.define('gw.override.Ext', {
  override: 'Ext',
  uses: ['Ext.Error'],

  validIdRe: /^[a-z_:][a-z0-9\-_:\/]*$/i,
  makeIdSelector: function(id) {
    //<debug>
    if (!Ext.validIdRe.test(id)) {
      Ext.Error.raise('Invalid id selector: "' + id + '"');
    }
    //</debug>
    return '#' + Ext.escapeIdSelector(id);
  },
  escapeIdSelector: function(id) {
    if (id.indexOf(":") >= 0) {
      id = id.replace(/:/g, '\\:');
    }
    if (id.indexOf("/") >= 0) {
      id = id.replace(/\//g, '\\/');
    }
    return id;
  }
});
