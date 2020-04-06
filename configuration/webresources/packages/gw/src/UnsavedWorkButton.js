/**
* A button with an AJAX menu that displays unsaved work entries
*/
Ext.define("gw.UnsavedWorkButton", {
    extend: 'Ext.button.Button',
    alias: 'widget.unsavedworkbutton',
    cls: 'g-no-menu-icon',
    iconCls: 'g-unsavedwork-icon',
    menuAlign: 'tr-br?',
    menu: {
        xtype: 'dataviewmenu',
        items: [
            {xtype: 'unsavedworklist'}
        ]
    }
});