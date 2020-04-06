Ext.define('gw.overrides.data.schema.Schema', {
  override: 'Ext.data.schema.Schema',
  statics: {
    /**
     * @UpgradedSencha 5.0 - ModelManager.getModel() was deprecated and its replacement lookupEntity raises an exception
     * This override provides a hasSchemaWithEntity() method that does the same thing as lookupEntity, except it doesn't raise
     */
    hasSchemaWithEntity: function(entity) {
      var ret = Ext.data.schema.Schema.entityInSchema(entity);
      return !!ret;
    },
    /**
     * @UpgradedSencha 5.0 - ModelManager.getModel() was deprecated and its replacement lookupEntity raises an exception
     * This override provides a entityInSchema() method that does the same thing as lookupEntity, except it doesn't raise
     */
    entityInSchema: function (entity) {
      var ret = null,
          instances = this.instances,
          match, name, schema;

      if (entity) {
        if (entity.isEntity) {
          ret = entity.self; // a record
        } else if (Ext.isFunction(entity)) {
          // A function (assume that a constructor is the Class).
          ret = entity;
        } else if (Ext.isString(entity)) {
          ret = Ext.ClassManager.get(entity);

          // If we've found a singleton or non-Entity class by that name, ignore it.
          if (ret && (!ret.prototype || !ret.prototype.isEntity)) {
            ret = null;
          }
          if (!ret) {
            for (name in instances) {
              schema = instances[name];
              match = schema.getEntity(entity);
              if (match) {
                if (ret) {
                  Ext.Error.raise('Ambiguous entity name "' + entity +
                      '". Defined by schema "' + ret.schema.type +
                      '" and "' + name + '"');
                }
                ret = match;
              }
            }
          }
        }
      }

      return ret;
    },
    /**
     * Ext.data.ModelManager.unregisterType was completely removed in ExtJs 5... this is it's replacement
     */
    removeEntityFromSchema: function(entityName) {
      var entity = Ext.data.schema.Schema.entityInSchema(entityName),
          schema = entity.schema;
      if (entity && schema && schema.entities) {
        var associations = schema.associations,
            name, association;
        if (schema.entities[entityName] && (schema.entities[entityName].cls === entity)) {
          schema.entityClasses[entity.$className] = null;
          schema.entities[entityName] = null;
          --schema.entityCount;
          if (schema.associationEntityMap[entityName]) {
            schema.associationEntityMap[entityName] = null;
            for (name in associations) {
              if (associations.hasOwnProperty(name)) {
                association = associations[name];
                if (association.definedBy && association.definedBy.entityName === entityName) {
                  associations[name] = null;
                  schema.assocCount--;
                }
              }
            }
          }
        }
      }
    }
  }
});
