// @UpgradedSencha 5.1 - Override the default ExtJs decorate method to implement the Guidewire
// specific disabled tree node functionality by adding additional fields
Ext.define('gw.override.data.NodeInterface', {
    override: 'Ext.data.NodeInterface',

    statics:{
        decorate: function (modelClass) {
            var model = Ext.data.schema.Schema.lookupEntity(modelClass),
                proto = model.prototype,
                idName, idField, idType;

            if (!model.prototype.isObservable) {
                model.mixin(Ext.mixin.Observable.prototype.mixinId, Ext.mixin.Observable);
            }
            if (proto.isNode) { // if (already decorated)
                return;
            }

            idName  = proto.idProperty;
            idField = model.getField(idName);
            idType  = idField.type;

            model.override(this.getPrototypeBody());

            model.addFields([
                { name : 'parentId',   type : idType,    defaultValue : null,  allowNull : idField.allowNull            },
                { name : 'index',      type : 'int',     defaultValue : -1,    persist : false          , convert: null },
                { name : 'depth',      type : 'int',     defaultValue : 0,     persist : false          , convert: null },
                { name : 'expanded',   type : 'bool',    defaultValue : false, persist : false          , convert: null },
                { name : 'expandable', type : 'bool',    defaultValue : true,  persist : false          , convert: null },
                { name : 'checked',    type : 'auto',    defaultValue : null,  persist : false          , convert: null },
                { name : 'leaf',       type : 'bool',    defaultValue : false                            },
                { name : 'cls',        type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'iconCls',    type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'icon',       type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'root',       type : 'boolean', defaultValue : false, persist : false          , convert: null },
                { name : 'isLast',     type : 'boolean', defaultValue : false, persist : false          , convert: null },
                { name : 'isFirst',    type : 'boolean', defaultValue : false, persist : false          , convert: null },
                { name : 'allowDrop',  type : 'boolean', defaultValue : true,  persist : false          , convert: null },
                { name : 'allowDrag',  type : 'boolean', defaultValue : true,  persist : false          , convert: null },
                { name : 'loaded',     type : 'boolean', defaultValue : false, persist : false          , convert: null },
                { name : 'loading',    type : 'boolean', defaultValue : false, persist : false          , convert: null },
                { name : 'href',       type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'hrefTarget', type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'qtip',       type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'qtitle',     type : 'string',  defaultValue : '',    persist : false          , convert: null },
                { name : 'qshowDelay', type : 'int',     defaultValue : 0,     persist : false          , convert: null },
                { name : 'children',   type : 'auto',    defaultValue : null,  persist : false          , convert: null },
                { name : 'visible',    type : 'boolean', defaultValue : true,  persist : false },
                { name : 'text',       type : 'string',                        persist : false },

                // @UpgradedSencha - Override begin
                // Add 2 more fields used across the application (GW specific)
                { name : 'disableSelection', type : 'boolean', defaultValue : false, persist : false, convert: null },
                { name : 'selected',   type : 'boolean', defaultValue : false, persist : false, convert: null }
                // Override end
            ]);
        }
    }
});