/** Customize shuttle widget, and fix its ecoding and from submit behavior: */
Ext.define('gw.override.ux.form.ItemSelector', {
    override: 'Ext.ux.form.ItemSelector',
    requires: ['gw.app'],

    delimiter: null, // set the delimiter to null so getSubmitValue will return as an array instead of string
    buttons: ['add', 'remove'],

    initComponent: function () {
        var me = this;
        me.value = gw.Util.decodeValue(me.value);
        me.buttonsText.add = gw.app.localize("ExtJS.Ux.Form.ItemSelector.Add");
        me.buttonsText.remove = gw.app.localize("ExtJS.Ux.Form.ItemSelector.Remove");
        me.suspendCheckChange++;  //suspend change event during bindStore in initComp so checkForInvalid would work
        me.callParent(arguments);
        me.suspendCheckChange--;
        // @UpgradedSencha 5.1 - The store isn't bound until after the toField and fromField items are created by the
        // initComponent() hierarchy of calls... thus the displayField and valueField values aren't bound onto the
        // ItemSelector component until after it's too late to set them onto the toField and fromField MultiSelect
        // components.  So here we sync them up so that things (including the tests) work properly.
        me.fromField.valueField = me.valueField;
        me.toField.valueField = me.valueField;
        me.fromField.displayField = me.displayField;
        me.toField.displayField = me.displayField;
        var lWidth = (me.labelAlign == 'top') ? 0 : me.labelWidth;
        me.width = (me.inputWidth) ? lWidth + me.inputWidth : lWidth + 420;
    },

    //Fix store with no model
    createList: function(title){
        var me = this;

        var storeCfg = {
            data: []
        };

        if(me.store.model){
            storeCfg.model = me.store.model;
        }else{
            storeCfg.fields = [me.valueField || 'value', me.displayField || 'text'];
        }

        return Ext.create('Ext.ux.form.MultiSelect', {
            // We don't want the multiselects themselves to act like fields,
            // so override these methods to prevent them from including
            // any of their values
            submitValue: false,
            gNumRows: me.gNumRows,
            getSubmitData: function(){
                return null;
            },
            getModelData: function(){
                return null;
            },
            flex: 1,
            dragGroup: me.ddGroup,
            dropGroup: me.ddGroup,
            title: title,
            store: storeCfg,
            displayField: me.displayField,
            valueField: me.valueField,
            disabled: me.disabled,
            listeners: {
                boundList: {
                    scope: me,
                    itemdblclick: me.onItemDblClick,
                    drop: me.syncValue
                }
            }
        });
    },

    /**
     * PLWEB-5487 - clear the highlighting on the from field that is automatically done by the super class during the
     * move process
     */
    onRemoveBtnClick: function() {
        this.callParent(arguments);
        this.fromField.boundList.clearHighlight();
    },

    /**
     * PLWEB-5487 - clear the highlighting on the from field that is automatically done by the super class during the
     * move process
     */
    onAddBtnClick: function() {
        this.callParent(arguments);
        this.fromField.boundList.clearHighlight();
    }
});
