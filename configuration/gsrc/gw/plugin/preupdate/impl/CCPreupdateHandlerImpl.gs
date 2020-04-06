package gw.plugin.preupdate.impl
uses gw.api.preupdate.PreUpdateContext
uses gw.plugin.SharedBundlePlugin

/**
 * The default ClaimCenter implementation of the IPreUpdateHandler plugin.
 * The plugin is run during every bundle commit, before the PreUpdate rules are run.
 * Any new entities that you need to create during commit should be created in this plugin,
 * so that PreUpdate and Validation rules will be run on those new entities.
 * Please see the documentation for more information.
 * <p>
 * You can add to this plugin implementation, but executePreUpdate(b) must call the superclass
 * implementation or ALL the methods that it calls, in the same order, to ensure proper system behavior.
 */
@Export
class CCPreupdateHandlerImpl extends CCPreupdateAbstractHandlerImpl implements SharedBundlePlugin {

  construct() {

  }

  override function executePreUpdate( b : PreUpdateContext ) {
    super.executePreUpdate(b)
  }
}
