package gw.plugin.contact.ab800

uses java.lang.IllegalArgumentException

uses gw.plugin.contact.ContactSystemLinkPlugin
uses gw.plugin.contact.ContactSystemPlugin
uses gw.api.contact.LinkResult
uses gw.api.contact.DuplicateContactMatch
uses gw.api.contact.DuplicateContactMatchImpl
uses gw.api.system.CCLoggerCategory
uses gw.api.graph.GraphVisitor
uses gw.api.contact.graph.ContactSubgraphTraverser
uses gw.api.graph.traverse.TraversalType
uses gw.plugin.contact.ContactSystemPluginException
uses gw.api.contact.ContactSystemUtil

uses java.util.ArrayList
uses gw.api.database.Query
uses gw.api.contact.ContactSystemPluginAdapter

/**
 * Implementation of <code>ContactSystemLinkPlugin</code> for link integration with Guidewire ContactManager.
 * @deprecated Since 9.0.0 use gw.plugin.contact.ABContactSystemLinkPlugin instead
 */
@Export
class ABContactSystemLinkPlugin implements ContactSystemLinkPlugin {

  static var _logger = CCLoggerCategory.CONTACT_SYSTEM_LINK_PLUGIN
  var _contactSystemPlugin : ContactSystemPlugin

  construct() {
    _contactSystemPlugin = ContactSystemPluginAdapter.getAdapter()
  }

  override function linkContact(contact: Contact, commit : boolean): LinkResult {
    var result : LinkResult;

    // if this contact was already linked (link may be broken) then unlink before linking again
    if (contact.AddressBookUID != null) {
      link(contact, null)
    }

    var match : DuplicateContactMatch
    match = new DuplicateContactMatchImpl(contact, false);

    // we check for exact matches first, followed by potential matches, ending with no matches
    if (match.hasExact()){
      _logger.trace(">>> Found Exact Match: " + match.ExactMatch.AddressBookUID)
      link(contact, match.ExactMatch.AddressBookUID)
      if (commit)
        contact.Bundle.commit()
      result = LinkResult.exact(match.ExactMatch.AddressBookUID)
    } else if (match.hasMatches()) {
      _logger.trace(">>> Found Potential Match")
      result = LinkResult.potential(match)
    } else {
        try {
          var createResult = _contactSystemPlugin.createContact(contact);

          if (createResult.PendingCreate) {
            _logger.trace (">>> No Match Found, No Create Permission, Contact Pending Create")
            result = LinkResult.pendingCreate(createResult.Contact.AddressBookUID)
          } else {
            _logger.trace (">>> No Match Found, Has Create Permission, Contact Created")
            result = LinkResult.created(createResult.Contact.AddressBookUID)
          }

          if (createResult.Contact.AddressBookUID != null) {
            link (contact, createResult.Contact.AddressBookUID)
          }
          if (commit)
            contact.Bundle.commit()

        } catch(e : ContactSystemPluginException) {
          result = LinkResult.error(e.getLocalizedMessage())
        }
    }
    return result
  }

  override function link (contact: Contact, abuid: String) {
    //unlink the ccContact if the provided abuid is null
    if (abuid == null) {
      unlink(contact)
      return;
    }

    if (contact.AddressBookUID != null && not(abuid == contact.AddressBookUID)) {
      throw new IllegalArgumentException("Contact is already linked to " + contact.AddressBookUID + ". Cannot link to " + abuid + ". The contact must be unlink()-ed first.")
    }
    _logger.trace (">>> Linking Contact to " + abuid)
    contact.AddressBookUID = abuid
    ContactSystemUtil.INSTANCE.syncToContactSystem(contact)
  }

  private function unlink (contact : Contact) {
    _logger.trace (">>> Unlinking contact: " + contact.AddressBookUID)

    // To unlink, we clear the fingerprint, and then null out the AddressBookUID on this and every sub-object of the contact
    ContactSystemUtil.clearContactFingerprint(contact)
    //Create new graph visitor to traverse the contact and set all ABUID to null to unlink
    var visitor = new GraphVisitor<KeyableBean>() {
      private var contactContacts = new ArrayList<String>()

      override function visit(node: entity.KeyableBean) {
        if (node.PublicID != null && (node typeis AddressBookLinkable || node typeis AddressBookConvertable) && !contactContacts.contains(node.getFieldValue("AddressBookUID"))) {
          node.setFieldValue("AddressBookUID", null)
        }
      }
      override function edgeTraversed(source: entity.KeyableBean, target: entity.KeyableBean, weight: java.lang.Object) {
      }

      public function setSkippedPublicID (vals : ArrayList<String>) {
        contactContacts = vals
      }
    }

    var ignoredABUID = new ArrayList<String>()
    for (cc in contact.AllContactContacts) {
      if (cc.SourceContact.AddressBookUID != null and not(cc.SourceContact.AddressBookUID == contact.AddressBookUID) and isPartOfClaim(cc.SourceContact.PublicID)) {
        ignoredABUID.add(cc.SourceContact.AddressBookUID)
      }

      if (cc.RelatedContact.AddressBookUID != null and not(cc.RelatedContact.AddressBookUID == contact.AddressBookUID) and isPartOfClaim(cc.RelatedContact.PublicID)) {
        ignoredABUID.add(cc.RelatedContact.AddressBookUID)
      }
    }
    visitor.setSkippedPublicID(ignoredABUID)

    var traverser = new ContactSubgraphTraverser(contact)
        .withTraversalType(TraversalType.BREADTH_FIRST)
    traverser.traverse({visitor})
  }

  private function isPartOfClaim(id : String) : boolean {
    var cc = Query.make(ClaimContact).join("Contact").compare("PublicID", Equals, id).select()
    return cc.Count > 0
  }
}