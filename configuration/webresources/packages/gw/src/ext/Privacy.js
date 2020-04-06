/**
 * Privacy widget which never reveals existing value from server.
 * When the value is entered it is visible. When the field is brought up with
 * a pre-existing value, it is rendered as some mask value (e.g. *****).
 *
 * The value can only be edited after going through the associated menu.
 * Selecting a menu choice enables submission of the form data.  When
 * not in this editing mode, submission is explicitly disabled.
 *
 * If there is a pre-existing value, a menu is drawn on the side to allow
 * entering a new value or to delete the contents.
 *
 *
 *
 * How does this component work? What are the collaborators?
 */
Ext.define('gw.ext.privacy', {
  extend: 'Ext.form.field.Text',
  alias: 'widget.privacy',
  requires: ['Ext.ComponentManager','gw.Util'],

  /**
   * resetEncryption places the widget into non-editing mode (i.e. submission
   * of the value is disabled).  It is explicitly exposed as a function to allow
   * triggering outside the widget's direct control - e.g. Post on Change and
   * Reflection.
   */
  resetEncryption: function () {
    this._showMenuButton();
    this._muteField();
  },

  /**
   * initComponent will disable submission if there is an existing value.
   * If no initial value is present, it will start in editing mode.
   */
  initComponent: function () {
    var me = this;

    if (me.value) {
      me._muteField();
    }

    me.menuButtonId = me.id + '_MENU';
    var items = [];
    Ext.each(gw.Util.getPrivacyFieldMenuItems(), function (itemText, index) {
      // Item 0 shall have an ID of menuId+":edit", item 1 ID is undefined.
      items.push({
          text:     itemText,
          handler:  me.deletePrivacyValue,
          compId:   me.id,
          id:       index == 0 ? me.menuButtonId + ':edit' : undefined})
    }, me);

    me.item = [{
      icon:    'images/app/drop_button.png',
      width:   16,
      height:  16,
      xtype:   'button',
      id:      me.menuButtonId,
      menu: {
        items: items
      }
    }];

    // This is a work around to hide the menu button in the case
    // where the initial value is empty.  Adding hidden to the button config
    // doesn't work as the button is a bit of an anomaly -> me.item
    // isn't listed in Sencha documentation
    me.on('afterrender', function(privacyWidget) {
      if (!privacyWidget.value) {
        me._hideMenuButton();
      }
    });

    me.callParent(arguments);
  },

  initRenderData: function () {
    var me = this,
        data = me.callParent();
    if (me.column) {
      // PLWEB-5699: If the field has column data, then we are inside a grid, we want to set the bodyStyle with the
      // width of the column.  Not doing this results in an incorrectly sized editor input field inside of a table grid
      // since the privacy field is rendered using the base field prefix/suffix implementation which has a fixed width
      // defined in the css, UNLESS the bodyStyle attribute is set.  Also without the width being explicitly set, the
      // input field doesn't seem to pick up the width of the containing column properly, so we force it.
      data.bodyStyle = "width: " + me.column.width + "px;";
    }
    return data;
  },

  /**
   * Clears the value and enables editing, submission, and validation.
   * Callback for both delete and edit menu items.
   * @param item menu item
   * @private
   */
  deletePrivacyValue: function (item) {
    var comp = Ext.ComponentManager.get(item.compId);
    comp.setRawValue('');
    comp.setReadOnly(false);
    // Enable validation again, because we're changing the value.
    comp.validateOnBlur = true;
    comp.validateOnChange = true;
    comp.submitValue = true;
    comp._hideMenuButton();
    comp.focus();
  },

  /**
   * Makes the text input field read-only and disables both submission and validation
   */
  _muteField: function() {
    var me = this;
    me.setReadOnly(true);
    me.submitValue = false; // Disable submitting to server.
    // Since the value has been overwritten by a privacy string, we turn off validation here, since
    // we're already not passing the value to the server anyhow. Turn validation back on in deletePrivacyValue() below!
    me.validateOnBlur = false;
    me.validateOnChange = false;
  },

   _hideMenuButton: function () {
      Ext.get(this.menuButtonId).setDisplayed(false);
   },

  _showMenuButton: function () {
      Ext.get(this.menuButtonId).setDisplayed(true);
  }
});
