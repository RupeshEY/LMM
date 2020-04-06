/**
 * A textbox with auto-complete suggestions
 */
Ext.define('gw.ext.AutoCompleteWithMetaTags', {
  extend: 'gw.ext.AutoComplete',
  alias: 'widget.autocompletewithmetatags',

  listConfig: {
    tpl: '<tpl for="."><div class="' + Ext.baseCSSPrefix + 'boundlist-item">{listText:decodeMetaTags}</div></tpl>'
  }
});
