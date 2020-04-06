/**
 * A special view NavigationModel implementation built specifically to support proper keyboard navigation on an
 * accordion panel.  It extends the tree NavigationModel and overrides a few methods to enable a keyboard navigation
 * that is consistent with the mouse navigation behavior.
 */
Ext.define('gw.tree.AccordionNavigationModel', {
  extend: 'gw.tree.TreeNavigationModel',

  alias: 'view.navigation.accordion',

  /**
   * The only way to expand an accordion panel element via mouse is to click on it (which expands AND selects
   * the first child item).  In order to keep the keyboard navigation consistent with the mouse, we override the
   * default tree left navigation to do nothing at all.
   *
   * @param keyEvent
   */
  onKeyLeft: function(keyEvent) {
    // do nothing explicitly
  },

  /**
   * The only way to expand an accordion panel element via mouse is to click on it (which expands AND selects
   * the first child item).  In order to keep the keyboard navigation consistent with the mouse, we override the
   * default tree right navigation to do nothing at all.
   *
   * @param keyEvent
   */
  onKeyRight: function(keyEvent) {
    // do nothing explicitly
  },

  /**
   * Enter selects the current item.  To get the selection we are going to explicitly allow the navigation by
   * passing false to our version of the setPosition method.
   *
   * @param keyEvent
   */
  onKeyEnter: function(keyEvent) {
    var position = this.getPosition().clone();
    this.setPosition(null, null, null, false, false, false);
    this.setPosition(position, null, keyEvent, false, false, false);
  },

  /**
   * Space selects the current item.  To get the selection we are going to explicitly allow the navigation by
   * passing false to our version of the setPosition method.
   *
   * @param keyEvent
   */
  onKeySpace: function(keyEvent) {
    var position = this.getPosition().clone();
    this.setPosition(null, null, null, false, false, false);
    this.setPosition(position, null, keyEvent, false, false, false);
  }

});