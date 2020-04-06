/**
 * Better fix from Sencha for the boundlist putting focus back on the input after collapse
 */
Ext.define('EXTJS-17372.view.BoundList', {
    override: 'Ext.view.BoundList',

    onShow: function() {
        var field = this.pickerField;
        this.callSuper();

        if (field && field.rendered && !field.hasFocus) {
            field.focus();
        }
    },

    onHide: function() {

        /*
        * EXTJS-17372
        * Do not refocus on the inputEl after a bound list collapses because this can steal focus when the collapse event
        * is triggered by a user action to focus on a new element
        *

        var inputEl = this.pickerField.inputEl.dom;


         // If we're hiding a focused picker, focus must move to  the input field unless the instigating
        // browser event is a touch. In that case, the input only focuses when they touch it -
        // we want to avoid an appearing keyboard.
        if (Ext.Element.getActiveElement() !== inputEl && Ext.EventObject.pointerType !== 'touch') {
            inputEl.focus();
        }


         *--- end override
         */

        // Call parent (hide the element) *after* focus has been moved out.
        // Maintainer: Component#onHide takes parameters.
        this.callSuper(arguments);
    },

    afterComponentLayout: function(width, height, oldWidth, oldHeight) {
        var field = this.pickerField;

        this.callSuper([width, height, oldWidth, oldHeight]);

        if (field && field.alignPicker) {
            field.alignPicker();
        }
    },

    onItemClick: function(record) {
        var me = this,
            field = me.pickerField,
            valueField, selected;

        if (!field) {
            return;
        }

        valueField = field.valueField;
        selected = me.getSelectionModel().getSelection();

        if (!field.multiSelect && selected.length) {
            selected = selected[0];

            if (selected && field.isEqual(record.get(valueField), selected.get(valueField)) && field.collapse) {
                field.collapse();
            }
        }
    },

    onContainerClick: function(e) {
        var toolbar = this.pagingToolbar;
        if (toolbar && toolbar.rendered && e.within(toolbar.el)) {
            return false;
        }
    }

});