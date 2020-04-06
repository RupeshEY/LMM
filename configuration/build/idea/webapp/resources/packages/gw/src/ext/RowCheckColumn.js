Ext.define('gw.ext.RowCheckColumn', {
    extend: 'Ext.grid.column.Check',
    alias: 'widget.rowcheckcolumn',
    uses: ['gw.app'],

    text: '',
    menuDisabled: true,

    initComponent: function () {
        var me = this;

        me.baseHdCheckboxCls = gw.app.ROW_CHECK_COLUMN_CLASS;
        me.checkedHdCheckboxCls = me.baseHdCheckboxCls + '-checked';
        me.hdCheckboxText = '<div style="margin-left: auto; margin-right: auto;" class="' + me.baseHdCheckboxCls + '"/>&#160;</div>';

        me.on({
            /**
             * Update row checkboxes when the header checkbox is clicked
             */
            headerclick: function (ct, column, evt, target) {
                // toggle header checkbox:

                var headerIcon = column.el.down('.' + me.baseHdCheckboxCls);
                // click has to be on the check box image, not just the header to be valid
                headerIcon.toggleCls(column.checkedHdCheckboxCls);
                var checked = headerIcon.hasCls(column.checkedHdCheckboxCls);

                // check (or uncheck) all rows
                var grid = ct.ownerCt;
                grid.store.each(function (record, recordIndex) {
                    column.updateCheckedState(grid, recordIndex, checked);
                    return true;
                });

                // update button state:
                grid.updateFlagged();

                // PLWEB-6024 call refresh to re-sync the row class and data-recordIndex
                grid.getView().refresh();
            },

            /**
             * register event to show or hide header checkbox when store data changes
             * @param column
             */
            beforerender: function (column) {
                var me = this;
                var store = column.getView().getStore(); // Store should be obtained from the view

                store.on('load', function (store) {
                    //Only displays the header checkbox when there is at least one row-level checkbox:
                    var showHeaderCB = store.findBy(function (record) {
                            return record.get(column.dataIndex) !== '';
                        }) >= 0;

                    var text = showHeaderCB ? me.hdCheckboxText : '';
                    if (text != me.text) {
                        me.setText(text);
                    }
                }, column);
            },

            /**
             * Suspend all layout operations while checking a row.
             */
            beforecheckchange: function (checkColumn, rowIndex, checked) {
                var grid = checkColumn.ownerCt.ownerCt;
                gw.app.setActiveLV(grid.id);
                grid.suspendLayouts();
            },

            /**
             * Resume but not flush
             */
            checkchange: function (checkColumn, rowIndex, checked) {
                var grid = checkColumn.ownerCt.ownerCt;
                grid.updateFlagged();
                grid.resumeLayouts();
            }
        });

        me.callParent(arguments);
    },

    renderer: function (value, p) {
        // Do not render the checkbox control when it is not configured; otherwise, it will always render an non-checked checkbox
        if (value === '') {
            return '';
        }

        //@UpgradedSencha 5.1 - At this moment we have to render checkbox. Process it here
        var checked = (value === 'Yes' || value === true || value === 'true' || value.cb === true) ? gw.app.ROW_CHECK_COLUMN_CHECKED_CLASS : '';

        return '<img class="' + gw.app.ROW_CHECK_COLUMN_CLASS + ' ' + checked + '" src="' + Ext.BLANK_IMAGE_URL + '"/>';
    },

    /**
     * @return {Boolean} true, if the checked state is changed
     */
    updateCheckedState: function (grid, recordIndex, checked) {
        var me = this,
            dataIndex = me.dataIndex,
            record = grid.store.getAt(recordIndex),
            value = record.get(dataIndex);

        if (value === '') {
            return false; // checkbox n/a
        }

        if (checked != value) {
            if (me.fireEvent('beforecheckchange', me, recordIndex, checked) !== false) {
                record.set(dataIndex, checked);
                me.fireEvent('checkchange', me, recordIndex, checked);
                return true;
            }
        }

        return false;
    },

    processEvent: function (type, view, cell, recordIndex, cellIndex, e, record, row) {
      var me = this,
          key = type === 'keydown' && e.getKey(),
          mousedown = type === 'mousedown';

      // Make sure process event only when the check box is clicked, not the surrounding whitespace
      if (!me.disabled && (mousedown || key == e.SPACE)) {
        gw.app.setActiveLV(view.ownerCt.id);
        if (cell.innerHTML.toUpperCase().indexOf('IMG') === -1 || (mousedown && e.target.tagName.toUpperCase() !== 'IMG')) {
          return false;
        }
      } else if (!me.disabled && key == e.ENTER) {
        // @UpgradedSencha 5.1, it seems we don't need to explicitly trigger the enter shortcut activated for this
        // component anymore, the default handler seems to work fine now.  So we just stop doing anything for enter
        return false;
      }
      return me.callParent(arguments);
    }

});
