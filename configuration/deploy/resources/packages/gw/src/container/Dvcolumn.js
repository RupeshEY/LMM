Ext.define('gw.container.Dvcolumn', {
    extend: 'gw.container.StretchContainer',
    alias: 'widget.dvcolumn',

    border: false,
    frame: false,
    cls: 'g-dv-column',
    divider: true,

    initComponent:function () {
        var me = this;
        if (!me.divider) {
            me.cls = [me.cls, 'g-no-divider'].join(' ')
        }
        me.callParent(arguments);
    }
});