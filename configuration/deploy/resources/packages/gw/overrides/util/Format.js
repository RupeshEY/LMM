/**
 * Provides an additional function for XTemplates formatting: decodeMetaTags
 * which decodes three special tags: [i], [b], [hl] and others into
 * <span class="gw-autocomplete-markup x"> where X is the tag name
 *
 */
Ext.define('gw.override.util.Format', {
    override: 'Ext.util.Format',

    decodeMetaTags: function(val) {
      val = val.replace(/\[(\w+)\]/g, '<span class="gw-autocomplete-markup $1">');
      val = val.replace(/\[\/\w+]/g, '</span>');
      return val;
    }
});
