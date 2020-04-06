package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.RelinkHandler

/**
 * Custom relink handler for ClaimContactRole that handles relinking
 * to the ClaimContact.
 */
@Export
class ClaimContactRoleRelinkHandler implements RelinkHandler<ClaimContactRole> {

  delegate _handler represents RelinkHandler<ClaimContactRole>

  construct() {
    /**
     * Ignores since the role will be deleted from the ClaimContact.
     */
    _handler = new RelinkHandlerBuilder<ClaimContactRole>(ClaimContactRole)
                .withIgnoreRemovedTargetHandler("ClaimContact")
                .build()
  }
}
