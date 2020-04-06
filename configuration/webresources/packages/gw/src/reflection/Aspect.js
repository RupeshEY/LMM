/**
 * The aspect of the reflection (data changes, availability.. etc)
 */
Ext.define('gw.reflection.Aspect', {
  uses: ['Ext.ComponentManager', 'Ext.String', 'gw.reflection', 'gw.GridUtil'],

  constructor: function (reflector, name, args) {
    if (arguments.length == 0) {
      return;
    }
    this.reflector = reflector;
    this.name = name;
    this.method = args[0];
    this.tIds = args[1];
    if (args.length > 2) {
      this.args = args[2];
    }
  },

  isTriggered: function (e) {
    return Ext.Array.indexOf(this.tIds, gw.reflection.getIdForReflection(e)) != -1;
  },
  getRangeTriggers: function () {
    return this.name == 'OPTIONS' ? this.tIds : null;
  },

  addNewReflectorValue: function (e, newValues, index) {
    var me = this,
        ajaxParams = null;
    if (me.method == 'map') {
      ajaxParams = gw.reflection.getPrerequisiteAjaxParam(e); // if this is forced to be ajax reflection
    }

    var triggerId = gw.reflection.getIdForReflection(e);
    if (ajaxParams == null) {
      ajaxParams = me[me.method](e, newValues, index);
    } else {
      gw.reflection.addAjaxParams(ajaxParams, me.name, me.tIds, triggerId, index); // if we are sending an ajax request, append aspect type and other trigger values
    }
    if (ajaxParams) {
      gw.Debug.log('Request reflector value from server for "' + me.reflector.id + '", trigger("' + triggerId + '") - ' + me.name);
      return {viewRootId: me.reflector.id, paramMap: ajaxParams}
    } else {
      return null;
    }
  },

  splitEditor: function (editors, editorByRow, row, additionalConfig) {
    var rowIndexes = editorByRow[1];
    rowIndexes.splice(Ext.Array.indexOf(rowIndexes, row), 1);
    var editorConfig = {xtype: editorByRow[0].xtype};
    if (additionalConfig) {
      Ext.apply(editorConfig, additionalConfig)
    }
    editors.push([editorConfig, [row]]);
    return editorConfig
  },

  createNewEditor: function (rE) {
    // The editor is defined on the column.
    // Create the editor.
    var rowIndexes = [],
        store = rE.getGrid().getStore();
    // Create array of row indexes.
    for (var i = 0; i < store.getCount(); i++) {
      rowIndexes.push("" + i)
    }
    var column = rE.getGrid().getColumnById(rE.dataIndex);
    var editorsForColumn = [
      [column.getEditor(), rowIndexes]
    ];

    if (!store.reader.jsonData.editors) {
      store.reader.jsonData.editors = {}
    }
    store.reader.jsonData.editors[column.mapping || column.dataIndex] = editorsForColumn;
    return this.splitEditor(editorsForColumn, editorsForColumn[0], rE.row)
  },

  /**
   * Update reflector to the given value
   */
  updateReflector: function(value) {
    // The value object may be a simple value or complex value object with value attributes
    // Splitting into simple value and value holder if so
    var me = this,
        complexValue = value;
    if (value && value.value != undefined) {
      value = value.value;
    }

    if (value == gw.reflection.getNoChangeString()) {
      return; // no op
    }

    var id = me.reflector.id;
    var rE = Ext.ComponentManager.get(id);
    if (rE == null) {
      // Assume the id belongs to an LV. Try to find a matching LV cell definition.
      // TODO: Refactor: rE should be a component. In case of an LV, we get a wrapper over a grid component that
      // represents the cell for the reflection. A possible refactor would be to have a reflector wrapper for
      // all components (including fields) that abstracts this logic away
      rE = gw.reflection.getGridInfoByCellId(id);
    }

    if (rE == null) {
      gw.Debug.log("Could not find reflector with id " + id);
    }

    var editor;

    function handleReflection() {
      gw.reflection.reflect(rE);
      // Currently we control submission to the server by state in the UI.  In the case
      // where the values are not changed directly in the UI (e.g. - reflection) we need
      // to reset the control manually.
      if (rE.xtype == 'privacy') {
          rE.resetEncryption();
          rE.validate();
      }
    }
    var cellValue;
    switch (me.name) {
      case 'VALUE':
        if (rE.getGrid) {
          cellValue = rE.getCellValue();
          if (((cellValue && cellValue.text != undefined) ? cellValue.text : cellValue) != value) {
            // set cell value calls beginEdit on the record that does not emit change events, hence no suspendEvents
            // TODO: Refactor: Put in reflector wrapper
            rE.setCellValue(complexValue);
            gw.GridUtil.processGridEditor(rE.getGrid().getStore(), rE.row, rE.getColumn(), function (editorByRow) {
              rE.postOnChange = editorByRow[0].postOnChange;
            });
            handleReflection(rE);
          }
        } else {
          if (rE.getValue() != value) {
            rE.suspendEvents();
            if (rE instanceof Ext.form.field.Display && Ext.isString(complexValue)){
              complexValue = Ext.String.htmlEncode(complexValue);
            }
            gw.Util.setValue(rE, complexValue);
            handleReflection(rE);
            rE.resumeEvents();
          }
        }

        break;

      case 'OPTIONS':
        if (rE.getGrid) {
          cellValue = rE.getCellValueText();
          gw.GridUtil.processGridEditor(rE.getGrid().getStore(), rE.row, rE.getColumn(), function (editorByRow, editors) {
            if (editorByRow[1].length > 1) {
              editor = me.splitEditor(editors, editorByRow, rE.row);
            } else {
              editor = editorByRow[0];
            }
          }, false, this);

          // This should not happen with the configuration we currently have,
          // we always define an editor in the store and not on the column.
          if (!editor) {
            editor = me.createNewEditor(rE);
          }

          if (editor.store && editor.store.reader) {
            gw.Util.updateStore(editor.store, complexValue);
          } else {
            editor.store = complexValue;
          }
          var defaultValue = null;
          if (editor.displayField) { // lookup display text for combo field
            var idx = editor.store.findExact(editor.valueField, cellValue);
            if (idx == -1) {
              defaultValue = editor.store.getAt(0).get(editor.valueField);
            }
          } else {
            defaultValue = editor.store[0][0];
            Ext.each(editor.store, function (data) {
              if (data[0] == cellValue) {
                defaultValue = null;
                return false;
              }
            });
          }
          if (defaultValue !== null) {
            rE.setCellValue(defaultValue);
          }
        } else if (rE.store) {
          gw.Util.updateStore(rE.store, complexValue);
        } else {
          gw.Debug.log("ERROR!!! Cannot reflect options, no store defined on " + id);
        }

        break;

      case 'AVAILABLE':
        var disabled = (value == true || value == 1 || value == "true" || value == "1") ? false : true;

        if (rE.getGrid) {
          gw.GridUtil.processGridEditor(rE.getGrid().getStore(), rE.row, rE.getColumn(), function (editorByRow, editors) {
            var rowIndexes = editorByRow[1];
            if (rowIndexes.length > 1) {
              editor = me.splitEditor(editors, editorByRow, rE.row);
            } else {
              editor = editorByRow[0];
            }
          }, false, this);
          if (!editor) {
            editor = me.createNewEditor(rE);
          }
          gw.Util.setDisabled(editor, disabled);

        } else {
          gw.Util.setDisabled(rE, disabled);
        }
        break;

      case 'MASK':
        if (rE.getGrid) {
          // no-op: deprecated feature, use TPOC instead
        } else {
          // update tooltip:
          if (rE.tooltip == rE.emptyText && rE.setTooltip != null) {
            rE.setTooltip(value);
          }
          // update regex:
          if (value) {
            if (value.lastIndexOf('#') >= 0) {
              // @SenchaUpgrade The regex property is a config-time-only option; there's no officially-supported
              rE.regex = eval('/^' + value
                   .replace(/[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g, "\\$&") //escape special char for regex
                   .replace(/#/g, '.')
                 + '$/');
            }
          } else {
            delete rE.regex;
          }
          // update invalidText:
          if (rE.emptyText && rE.invalidText && rE.invalidText.lastIndexOf(rE.emptyText) >= 0) {
            rE.invalidText = rE.invalidText.replace(rE.emptyText, value);
          }
          // At last, update emptyText:
          rE.emptyText = value;
          rE.inputEl.dom.placeholder = value;

          // If the element is encrypted, don't validate;
          // encrypted validation occurs when the value is set.
          if (rE.xtype != 'privacy') {
            rE.validate();
          }
        }
        break;

      case 'CUSTOM':
        // no-op
        break;

      default:
        gw.Debug.log("Unknown aspect: " + me.name);
        break;
    }
  },

  maybePostToServer: function() {
    if (this.name == 'VALUE') {
      var reflector = Ext.ComponentManager.get(this.reflector.id);
      return reflector && reflector.postOnChange;
    }
    return false;
  },

  /**
   * Get trigger value
   */
  tv: function (e, newValues, index) {
    newValues[index] = e.eventParam ? gw.reflection.getFieldValueById(e.eventParam) : gw.Util.getFieldValue(e);
  },

  contentsEqual: function (a1, a2) {
    if (a1 == a2) {
      return true;
    }
    if (!a1 || !a2) {
      return (!a1 && !a2);
    }
    if (a1.length != a2.length) {
      return false;
    }
    for (var i = 0; i < a1.length; i++) {
      if (a1[i] != a2[i]) {
        return false;
      }
    }
    return true;
  },
  /**
   * Calculates new value from map:
   */
  map: function (e, newValues, index) {
    var me = this;
    if (me.args != null) {
      for (var i = 0; i < me.args.length; i++) {
        var valueByIds = [];
        Ext.each(me.tIds, function (tId) {
          valueByIds.push(gw.reflection.getFieldValueById(tId));
        });

        if (me.contentsEqual(me.args[i][0], valueByIds)) {
          newValues[index] = me.args[i][1];
          return null;
        }
      }
      newValues[index] = gw.reflection.getNoChangeString();
      return null;
    } else { // value on server:
      return gw.reflection.addAjaxParams({}, me.name, me.tIds, gw.reflection.getIdForReflection(e), index); // returns params to fetch new value from server thru AJAX
    }
  },

  filter: function (e, newValues, index) {
    var me = this,
        result = [];
    for (var i = 0; i < me.args.length; i++) {
      var item = me.args[i][0];
      var ok = true;

      // check each trigger
      if (me.args[i].length > 1) {
        var conditions = this.args[i][1];

        Ext.each(me.tIds, function (tId) {
          var tValue = gw.reflection.getFieldValueById(tId);
          if (tValue != '') { // value specified
            var expected = conditions[tId];
            var inArray = expected && (Ext.Array.indexOf(expected, tValue) != -1);
            if (!(inArray)) {
              ok = false;
              return false;
            }
          }
        });
      }

      if (ok) {
        result.push(item);
      }
    }

    newValues[index] = result;
  },
  /**
   * Evaluate client side reflection expression.
   * This method gets called through the aspect method name (see gw.reflection.Aspect).
   * This name is set on the server. In this case, it is gwEval for any client reflection side reflection
   * expression javascript:[JavaScript expression]
   */
  gwEval: function (e, newValues, index) {
    // set up global variables before evaluate expression:
    window.VALUE = gw.reflection.getFieldValueById(e.id);
    // VALUE1, VALUE2, ..., and trigger index
    var numtIds = this.tIds.length;
    Ext.each(this.tIds, function (tId, idx) {
      window['VALUE' + (idx + 1)] = gw.reflection.getFieldValueById(tId);
      if (numtIds > 1 && gw.reflection.getIdForReflection(e) == tId) {
        window[gw.reflection.getTriggerIndexParamString()] = idx + 1;
      }
    });

    // REFLECTOR: - the INPUT element
    // REFLECTOR is a variable that the client side reflection code can access.
    // Note: This is not working for cell ids as they are not components.
    // TODO: This is only used in PX, not in app code. Consider removing this (deprecating)
    var reflectorField = Ext.ComponentManager.get(this.reflector.id);
    window.REFLECTOR = reflectorField ? reflectorField.inputEl.dom : null;

    newValues[index] = eval(this.args[0]);
  }
});
