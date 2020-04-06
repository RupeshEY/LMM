Ext.define('gw.override.grid.plugin.CellEditing', {
    override: 'Ext.grid.plugin.CellEditing',
    uses: ['Ext.Msg', 'Ext.util.KeyNav', 'gw.GridUtil'],

    _isCellEditable: function (record, column, grid) {
        var disabled = null;
        var bPrivacy = false;

        var rowIdx = grid.store.indexOf(record);
        var cellValue = record.get(column.dataIndex);
        var fieldValue = cellValue;
        var dvInput = gw.GridUtil.getFirstInputInTemplateCell(fieldValue);
        if (dvInput) {
            return dvInput.editable
        }
        if (fieldValue && fieldValue.text != undefined) {
            fieldValue = fieldValue.text;
        }

        gw.GridUtil.processGridEditor(grid.store, rowIdx, column, function (editorByRow) {
            if (editorByRow[0]) {
                disabled = editorByRow[0].disabled || false;
                bPrivacy = (editorByRow[0].xtype == 'privacy');
            } else {
                disabled = true;
            }
        }, true);
        if (disabled != null) {
            if (!disabled && bPrivacy && fieldValue && Ext.isObject(cellValue) && cellValue.hasOwnProperty("item")) {
                disabled = true;
            }
            return !disabled;
        }

        if (column.getEditor && column.getEditor() != null && column.getEditor().disabled) {
            return false;
        }
    },

    init: function () {
        this.callParent(arguments);

        this.on({
          //PL-31403: If anyone has a better idea...
          edit: function (editor, editEvt) {
            var me = this;
            var column = editEvt.column;

            //If this is Internet Explorer, fire the blur event manually on the field after receiving an edit finish event from the editor
            if (Ext.isIE) {
              var field = this.getColumnField(column);
              field.fireEvent('blur', field);
            }
          },

          beforeedit: function (editor, editEvt) {
            var me = this;
            var column = editEvt.column;

            // If a Confirmation Msg Box is present, do not allow edit to continue
            if (!me._isCellEditable(editEvt.record, column, editEvt.grid) || Ext.MessageBox.isVisible()) {
              return false;
            }

            // If this is a single dv input.
            var fieldValue = editEvt.record.get(editEvt.field);
            var dvInput = gw.GridUtil.getFirstInputInTemplateCell(fieldValue);
            if (dvInput) {
              editEvt.grid.setEditorCfg(dvInput, editEvt.rowIdx, editEvt.column.dataIndex);

              // Stop normal Ext JS editor processing if the editor is a radio cell and the column is not configured as
              // a radio column.
            } else if (column.xtype != 'radiocolumn') {
              var beginEdit = true;

              gw.GridUtil.processGridEditor(editor.grid.store, editEvt.rowIdx, column, function (editorByRow) {
                var editorCfg = editorByRow[0];
                var editorType = editorCfg.xtype;

                // If the editor is a radio input, don't add an editor configuration as an implicit
                // editor has already been created. Stop the normal Ext JS editor processing
                if (!gw.GridUtil.hasEditor(editorType)) {
                  beginEdit = false;
                } else if (editorCfg.xtype !== 'fieldcontainer') {
                  editorCfg.eventParam = gw.GridUtil.getFullIdForCell(editor.grid.store, editEvt.record, editEvt.field);
                  if (!(editorCfg instanceof Ext.form.Field)) {
                    if (editor.editing) {
                      editor.completeEdit();
                    }
                    column.setEditor(editorCfg);

                    return false;
                  }
                }
              });

              // Checking for Confirmation Msg Box again because tabbing out produces confirmation dialog later
              if (!beginEdit || Ext.MessageBox.isVisible()) {
                return false;
              }
            }
          }
        });
    },

    /**
     * Special handling for ENTER key on cell editor - Some LVs are configured to navigate through rows/cells on ENTER key.
     * @SenchaUpgrade: override private method
     */
    onSpecialKey: function (ed, field, e) {
        // Let alt-enter pass through.  Used in CellEditor.js to allow
        // selecting action on single item menu.
        if (e.getKey() === e.ENTER && !e.altKey) {
            var grid = this.getCmp(),
                view = grid.getView(),
                record = this.getActiveRecord(),
                position = view.getPosition(record, this.getActiveColumn()),
                bQuickAdd = grid.gQuickAdd,
                bCellNav = bQuickAdd || grid.gCellNavOnEnter,
                bRowNav = bCellNav || grid.gRowNavOnEnter,
                cellData;

            var direction = bCellNav ? (e.shiftKey ? 'left' : 'right') : // navigate horizontally
                bRowNav ? (e.shiftKey ? 'up' : 'down') : // navidate vertically
                    null;

            if (direction) {
                e.stopEvent();

                // @SenchaUpgrade mimic the "Tab" behavior in super class, by calling non-public methods:
                do {
                    if (bCellNav &&
                        (cellData = grid.getStore().getAt(position.rowIdx).get(view.headerCt.getHeaderAtIndex(position.colIdx).dataIndex)) &&
                        cellData.endOfCellNav) { // if this cell is marked as end of cell-nav, force wrapping to the next row:
                        position.column = grid.headerCt.getGridColumns().length - 1;
                    }

                    position = view.walkCells(position, direction, e, /*preventWrap*/false);
                } while (position && (!view.headerCt.getHeaderAtIndex(position.colIdx).getEditor(grid.getStore().getAt(position.rowIdx)) || !this.startEditByPosition(position)));

                if (position) {
                    return; // we have navigated to a different row or cell
                }
            }

            if (bQuickAdd) { // No more cell to navigate to, add a new row:
                gw.app.requestViewRoot(grid.id, {quickAdd: true, updateData: true}, undefined, {
                    postCallback: function () {
                        // start at the beginning of the last row:
                        var position = view.getPosition(grid.getStore().last(), grid.headerCt.getGridColumns()[0]);

                        while (position && (!view.headerCt.getHeaderAtIndex(position.colIdx).getEditor(grid.getStore().getAt(position.rowIdx)) || !this.startEditByPosition(position))) {
                            position = view.walkCells(position, 'right', e, /*preventWrap*/false);
                        }
                    }, postCallbackScope: this
                });

                return; // we are done
            }
        }
        // @UpgradedSencha 5.1 - PLWEB-5486 we need to not stop the event here.  It will be stopped properly in
        // our onEditorTab override later except in the one special case when we want to leave a grid where we need
        // the event to propogate.  The code below was copied from the super class
        var sm;
        if (e.getKey() === e.TAB) {
            // -- Begin override
            //e.stopEvent();
            // -- end override
            if (ed) {
                // Allow the field to act on tabs before onEditorTab, which ends
                // up calling completeEdit. This is useful for picker type fields.
                ed.onEditorTab(e);
            }
            sm = ed.getRefOwner().getSelectionModel();
            return sm.onEditorTab(ed.editingPlugin, e);
        }
    },

    showEditor: function (ed, context, value) {
        /**
         * AHK - 4/10/2013 - We want text areas to expand to fill the entire cell, while using the configured
         * number of rows as a minimum size.  The best way that I've found to do that is to override the code
         * that shows the editor so that we explicitly set the height on the textarea at that time.
         * See PL-23772
         * @SenchaUpgrade Ideally there would be some more supported way of doing this
         */
        if (ed.field && ed.field.xtype == 'textarea') {
            var configuredHeight = (ed.field.rows * 17) + 8; // AHK - line-height is 17, vertical padding is 6px total, cell border is 2px total
            var rowHeight = context.row.offsetHeight;
            ed.field.height = (rowHeight > configuredHeight ? rowHeight : configuredHeight);
        }
        // AHK - 5/30/2013
        // In some odd cases involving check boxes, the call to showEditor will fail in Table.getCell (Table.js line 522)
        // because the row can't be found.  So as a total hack, if we know the parent call will fail, just don't make it,
        // since right now the only cases it fails in are cases where we don't even have an editor to show
        // @SenchaUpgrade
        var row = this.grid.getView().getNode(context.record, true);
        if (row) {
            this.callParent(arguments);
        }
    },

  // @UpgradedSencha porting old Emerald behavior forward
  //  return false for radiocolumns since show editor does not do anything for them.
  //
  //  if (isRadio) {
  //    return false;
  //  }
  startEdit: function (record, columnHeader) {
    if (columnHeader && columnHeader.xtype === 'radiocolumn') {
      return false;
    }
    return this.callParent(arguments);
  },

  // @UpgradedSencha: keep the previous editing state and turn it off on edit completion
  cancelEdit: function() {
    var me = this,
        view = me.grid.getView();

    view.wasEditing = false;
    // PLWEB-5585 - cancelEdit is called by the drag/drop column manager via an event even if there is no editor active
    // so we only want to set positions while the editing flag is actually true
    if (me.context && me.editing) {
      // we need to explicitly set the position on a cancel (while editing) since there's a 100ms delay in the parent
      // and we are still on a previous cell according to the navigation model. This will remove the brief 100ms
      // timespan where we are selecting an incorrect cell. It's a visual annoyance and will break tests on faster
      // machines and browsers
      view.getNavigationModel().setPosition(me.context.rowIdx, me.context.colIdx);
    }
    me.callParent(arguments);
  },

  // @UpgradedSencha: keep the previous editing state and turn it off on edit completion
  completeEdit: function() {
    this.grid.getView().wasEditing = false;
    this.callParent(arguments);
  },

  // @UpgradedSencha: PLWEB-5560. Remove the editor from the floatingItems array if present to remove a memory leak from
  // retaining old editors in the floating item array. This memory leak is the result of us calling setEditor for every
  // editor instantiation
  setColumnField: function(column, field) {
    var me = this,
        editorOwner = me.grid.ownerLockable || me.grid,
        ed = me.editors.getByKey(column.getItemId());

    // Remove memory leak
    if (editorOwner) {
        editorOwner.remove(ed);
    }
    // -- end remove memory leak

    Ext.destroy(ed, column.field);
    me.editors.removeAtKey(column.getItemId());

    // call super to bypass broken function
    me.callSuper(arguments);
  },

  /*
   getEditor initializes editor.  This method follows the same logic but
   does not cause any "side effects"
   */
  hasEditor: function (record, column) {
      var _editor = this.editors.getByKey(column.getItemId());
      if (!_editor && column.getEditor) {
          _editor = column.getEditor(record);
      }
      return _editor
  },

  /*
   This method checks to see if a cell is editable without
   causing side-effects.

   (This can be used instead of isCellEditable which uses me.getEditor.  me.getEditor may lazily instantiate the editor
   field causing causing inEditor to be initialized to true.
   */
  checkCellEditable: function (record, columnHeader) {
      var me = this,
          context = me.getEditingContext(record, columnHeader);

      if (me.grid.view.isVisible(true) && context) {
          columnHeader = context.column;
          record = context.record;
          if (columnHeader && me.hasEditor(record, columnHeader) &&
              me._isCellEditable(record, columnHeader, me.grid)) {
              return true;
          }
      }
      return false;
  }

});
