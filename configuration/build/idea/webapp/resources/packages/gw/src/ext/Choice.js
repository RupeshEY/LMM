Ext.define('gw.ext.Choice', {
  extend: 'Ext.panel.Panel',
  requires: 'Ext.layout.container.Column',
  alias: 'widget.choice',
  layout: 'column',
  border: false,
  cls: 'g-choice',
  defaults: {
    bodyStyle: 'padding:5px'
  },
  initComponent: function () {
    var me = this;
    if (me.items) {
      var inputs = {
        layout: 'anchor',
        border: false,
        frame: false,
        items: me.items
      };
      if (me.initialConfig.id) {
        var id = me.initialConfig.id;
        me.id = id + '_Panel';
        me.items = [
          {
            border: false,
            items: [
              {
                xtype: 'choiceradio',
                name: me.name,
                id: id,
                checked: me.checked,
                eventParam: id,
                inputValue: id,
                postOnChange: true
              }
            ]
          },
          inputs
        ]
      } else {
        // For read-only mode, we don't render the radio buttons.
        me.items = [inputs]
      }
    } else {
      me.hidden = true; // do not show choice that has no content
    }
    me.callParent(arguments);//initComponent on super
  }
});
