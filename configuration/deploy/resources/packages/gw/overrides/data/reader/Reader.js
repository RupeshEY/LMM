// @UpgradedSencha 5.1 Match data object properties with ExtJS 4.2 implementation

// Now it also incorporates logic to restore Ext 4 where only mapped fields would present in the data property.
// Ext 5 copies all fields from raw to data and this causes some GW logic to fail.
Ext.define('gw.data.reader.Reader', {
    override: 'Ext.data.reader.Reader',

    extractData: function(root, readOptions) {
        var me = this,
            entityType = readOptions && readOptions.model ? Ext.data.schema.Schema.lookupEntity(readOptions.model) : me.getModel(),
            schema = entityType.schema,
            includes = schema.hasAssociations(entityType) && me.getImplicitIncludes(),
            fieldExtractorInfo = me.getFieldExtractorInfo(entityType.fieldExtractors),
            length = root.length,
            records = new Array(length),
            typeProperty = me.getTypeProperty(),
            reader, node, nodeType, record, i, isDirty;

        if (!length && Ext.isObject(root)) {
            root = [root];
            length = 1;
        }

        for (i = 0; i < length; i++) {
            record = root[i];
            isDirty = false;
            if (!record.isModel) {
                // If we're given a model instance in the data, just push it on
                // without doing any conversion. Otherwise, create a record.
                node = record;

                // This Reader may be configured to produce different model types based on
                // a differentiator field in the incoming data:
                // typeProperty name be a string, a function which yields the child type, or an object: {
                //     name: 'mtype',
                //     namespace: 'MyApp'
                // }
                if (typeProperty && (nodeType = me.getChildType(schema, node, typeProperty))) {

                    reader = nodeType.getProxy().getReader();

                    record = reader.extractRecord(node, readOptions, nodeType,
                        schema.hasAssociations(nodeType) && reader.getImplicitIncludes(),
                        reader.getFieldExtractorInfo(nodeType.fieldExtractors));
                } else {
                    record = me.extractRecord(node, readOptions, entityType, includes,
                        fieldExtractorInfo);
                }

                if (record.isModel) {
                    // Trees need to be able to access the raw data (the XML node) in order to process its children.
                    record.raw = node;
                }
            }
            if (record.onLoad) {
                record.onLoad();
            }

            //@UpgradedSencha 5.1 Match data object properties with ExtJS 4.2 implementation
            // Create temporal data object
            var tempData = Ext.clone(record.data);

            // Loop ordinals and remove from data object
            for (var p in tempData){
                if(!record.fieldOrdinals.hasOwnProperty(p) && p !== ':grp'){
                    delete tempData[p];
                    isDirty = true;
                }
            }

            if(isDirty){
                record.data = tempData;
            }
            // end override
            records[i] = record;

        }

        return records;
    }
});