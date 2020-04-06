Ext.define('gw.override.layout.component.Component', {
    override: 'Ext.layout.component.Component',

    finishedLayout: function (ownerContext) {
        var me = this,
            elementChildren = ownerContext.children,
            owner = me.owner,
            len, i, elContext, lastBox, props;

        // NOTE: In the code below we cannot use getProp because that will generate a layout dependency

        // Set lastBox on managed child Elements.
        // So that ContextItem.constructor can snag the lastBox for use by its undo method.
        if (elementChildren) {
            len = elementChildren.length;
            for (i = 0; i < len; i++) {
                elContext = elementChildren[i];
                elContext.el.lastBox = elContext.props;
            }
        }

        // Cache the size from which we are changing so that notifyOwner can notify the owningComponent with all essential information
        ownerContext.previousSize = me.lastComponentSize;

        // @private -- fix memory leak PLWEB-5559
        // previous size is holding on the columnsChanged array, which in turns holds onto detached DOM objects. Removing this property seems
        // harmless.
        if (ownerContext.previousSize && ownerContext.previousSize.columnsChanged) {
            delete ownerContext.previousSize.columnsChanged;
        }
        // --end override

        // Cache the currently layed out size
        me.lastComponentSize = owner.el.lastBox = props = ownerContext.props;

        // lastBox is a copy of the defined props to allow save/restore of these (panel
        // collapse needs this)
        lastBox = owner.lastBox || (owner.lastBox = {});
        lastBox.x = props.x;
        lastBox.y = props.y;
        lastBox.width = props.width;
        lastBox.height = props.height;
        lastBox.invalid = false;

        me.callSuper(arguments);
    }
});