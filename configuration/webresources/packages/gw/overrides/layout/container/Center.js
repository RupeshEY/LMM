//@UpgradedSencha 5.1 EXTJS-15282 Center layout fails in some cases when shrink wrapping
//Merged in to nightlies 26 feb. 2015 Can be safely removed after upgrade to 5.1.1
Ext.define('EXTJS-15282.layout.container.Center', {
    override: 'Ext.layout.container.Center',
    type: 'center',

    childEls: [
        'targetEl'
    ],

    renderTpl: [
        '<div id="{ownerId}-targetEl" data-ref="targetEl" class="{targetElCls}" role="presentation">' +
        '{%this.renderBody(out, values)%}' +
        '</div>'
    ],

    beginLayout: function(ownerContext) {
        var me = this,
            percentRe = me.percentRe,
            childItems, len, i, itemContext, item,
            widthModel, heightModel;

        me.callParent([ownerContext]);

        childItems = ownerContext.childItems;
        for (i = 0, len = childItems.length; i < len; ++i) {
            itemContext = childItems[i];
            item = itemContext.target;
            widthModel = itemContext.widthModel;
            heightModel = itemContext.heightModel;
            if (percentRe.test(item.width)) {
                item.getEl().setStyle('width', '');
            }
            if (percentRe.test(item.height)) {
                item.getEl().setStyle('height', '');
            }
        }

        ownerContext.targetElContext = ownerContext.getEl('targetEl', me);
    },

    beginLayoutCycle: function(ownerContext, firstCycle) {
        var targetEl = this.targetEl;
        this.callParent([ownerContext, firstCycle]);
        targetEl.setStyle('width', '');
        targetEl.setStyle('height', '');
    },

    getRenderTarget: function() {
        return this.targetEl;
    },

    isItemBoxParent: function (itemContext) {
        return true;
    },

    isItemShrinkWrap: function(item) {
        return true;
    },

    calculate: function(ownerContext) {
        var targetElContext = ownerContext.targetElContext,
            info;

        this.callParent([ownerContext]);
        info = ownerContext.state.info;
        if (ownerContext.widthModel.shrinkWrap) {
            targetElContext.setWidth(info.contentWidth);
        }

        if (ownerContext.heightModel.shrinkWrap) {
            targetElContext.setHeight(info.contentHeight);
        }
    },

    getPos: function (itemContext, info, dimension) {
        var modelName = dimension + 'Model',
            size = itemContext.props[dimension],
            pos = 0;

        if (!itemContext[modelName].calculated) {
            size += info.margins[dimension];
        }

        if (!info.ownerContext[modelName].shrinkWrap) {
            pos = Math.round((info.targetSize[dimension] - size) / 2);
            if (isNaN(pos)) {
                this.done = false;
            }
        }
        return Math.max(pos, 0);
    }
});
