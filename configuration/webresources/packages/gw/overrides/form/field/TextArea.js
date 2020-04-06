/**
 * @UpgradedSencha - internally convert rows/cols which are deprecated (and ignored) in ExtJs5 to
 * width and height by computing them from rows/cols using the pixel dimensions of the M character.
 */
Ext.define('gw.override.form.field.TextArea', {
  override: 'Ext.form.field.TextArea',
  requires: ['gw.app'],

  constructor: function(config) {
    var me = this,
        dimensions = gw.app.dimensionsOfMCharInPixels();
    if (config.rows) {
      config.height = config.rows * dimensions.height;
      delete config.rows;
    }
    if (config.cols) {
      config.width = config.cols * dimensions.width;
      delete config.cols;
    }
    me.callParent([config]);
  }
});