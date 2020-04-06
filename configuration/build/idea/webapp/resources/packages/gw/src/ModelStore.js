/**
 * A store that communicates to server thru gw.app
 */
//Ext.extend(Ext.data.JsonStore, gw.Util.getStoreExtension())
Ext.define('gw.ModelStore', {
  extend: 'Ext.data.JsonStore',
  alias: 'store.modelstore',
  uses: ['Ext.data.StoreManager', 'Ext.data.ModelManager', 'Ext.ClassManager'],

  autoDestroy: true,
  remoteSort: true, // sort at server side
  pruneModifiedRecords: true, // do not remember modified records after load from server
  constructor: function(config) {
    this.callParent([Ext.apply(config, {
      proxy: Ext.create('gw.ext.ModelProxy', {
        url:'dummy2',
        reader:{
          rootProperty: 'root'
        }
      })
    })]);
  },

  /**
   * Registers the store using the model id, and make sure to pass model id when requesting data from server
   * @param id store id
   * @param argIds ids of other widgets, the value of which needs to be passed to server when fetching store data
   */
  setModelId : function(id, argIds) {
    this.storeId = id;
    Ext.data.StoreManager.register(this);
    this.proxy.extraParams = {'viewRootId': id};

    if (argIds) {
      Ext.apply(this.proxy.extraParams, {'argIds': argIds});
    }
  },

  getGroupString: function(instance) {
    var group = this.groupers.first();
    if (group) {
      var value = instance.get(group.property);
      return (value && value.text != undefined) ? value.text : value;
    }
    return '';
  },

  // @SenchaUpgrade work around bugs in store destruction and implicit model cleanup
  // also removes proxy listeners that ExtJs does not know to remove.
  destroyStore: function() {
    var me = this;

    if (!me.isDestroyed) {
      me.clearListeners();

      // @Guidewire : remove listeners from proxy
      if(me.proxy) {
        me.proxy.clearListeners();
      }

      if (me.storeId) {
        Ext.data.StoreManager.unregister(me);
      }
      me.clearData();
      me.data = me.tree = me.sorters = me.groupers = null;
      if (me.reader) {
        me.reader.destroyReader();
      }
      me.proxy = me.reader = me.writer = null;
      me.isDestroyed = true;

      // @Guidewire : cleanup reader inside model proxy
      var modelProxy = me.model.proxy;
      if(modelProxy && modelProxy.reader) {
        modelProxy.reader.destroyReader();
        modelProxy.reader = null;
      }

      if (me.implicitModel) {
        // @Guidewire : clean up the classmanager & modelmanager references
        // Can't call Ext.destroy() because me.model was not created with the required destroy method
        var modelName = me.model.modelName;
        me.undefineModel(modelName);
        Ext.data.ModelManager.unregister(modelName);
        delete Ext.data.ModelManager.types[modelName];
      } else {
        me.model = null;
      }
    }
  },

  // @SenchaUpgrade : Modified version of ClassManager.undefine() which is unavailable for non-debug
  undefineModel: function(name) {
    var MGR = Ext.ClassManager;

    var classes = MGR.classes,
        maps = MGR.maps,
        aliasToName = maps.aliasToName,
        nameToAliases = maps.nameToAliases,
        alternateToName = maps.alternateToName,
        nameToAlternates = maps.nameToAlternates,
        aliases = nameToAliases[name],
        alternates = nameToAlternates[name],
        parts, partCount, namespace, i;

    delete nameToAliases[name];
    delete nameToAlternates[name];
    delete classes[name];

    if (aliases) {
      for (i = aliases.length; i--;) {
        delete aliasToName[aliases[i]];
      }
    }

    if (alternates) {
      for (i = alternates.length; i--; ) {
        delete alternateToName[alternates[i]];
      }
    }

    parts = MGR.parseNamespace(name);
    // @Guidewire : don't clear the parse cache until after we've split the namespace.
    delete MGR.namespaceParseCache[name];

    partCount = parts.length - 1;
    namespace = parts[0];

    for (i = 1; i < partCount; i++) {
      namespace = namespace[parts[i]];
      if (!namespace) {
        return;
      }
    }

    // Old IE blows up on attempt to delete window property
    try {
      delete namespace[parts[partCount]];
    } catch (e) {
      namespace[parts[partCount]] = undefined;
    }

  },

  // @SenchaUpgrade: Modified the copy from AbstractStore.group() to fix PLWEB-6202
  // In our ExtJs5 grouper is not added to the sorters anymore so we change -
  //
  // change = grouper || me.getSorters().getCount() > 0;
  // to
  // change = grouper || me.getGrouper();
  // so server request could be triggered by attempLoad if  there is a grouping change
  group: function (grouper, direction) {
    var me = this,
        change = grouper || me.getGrouper();

    if (grouper && typeof grouper === 'string') {
      grouper = {
        property: grouper,
        direction: direction || me.getGroupDir()
      };
    }

    me.settingGroups = true;
    me.getData().setGrouper(grouper);
    delete me.settingGroups;
    if (me.isLoadBlocked()) {
      return;
    }

    if (change) {
      if (me.getRemoteSort()) {
        me.attemptLoad({
          scope: me,
          callback: me.fireGroupChange
        });
      } else {
        me.fireEvent('datachanged', me);
        me.fireEvent('refresh', me);
        me.fireGroupChange();
      }
    }
    // groupchange event must fire when group is cleared.
    // The Grouping feature forces a view refresh when changed to a null grouper
    else {
      me.fireGroupChange();
    }
  }

});
