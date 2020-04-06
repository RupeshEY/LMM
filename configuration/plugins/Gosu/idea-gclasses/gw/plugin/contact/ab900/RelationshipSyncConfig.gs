package gw.plugin.contact.ab900


/**
 *  This <b>class</b> controls which Contact relationships are included from the Address Book. By default, no relationships
 *  are included. Care should be taken when including relationships here, particularly with zero-or-more relationships.
 *  Since such relationships can grow in an unbounded way, there is the potential to pull down many Contacts from the
 *  Address Book.
 *
 *  Generally, those Contact relationships included from the Address Book are those that are reflected on the
 *  Contact "Basics" detail screen in the UI. So, it usually makes sense for the relationships configured here to match
 *  those that are explicitly shown on the main Contact UI.
 *
 *  Customers may edit the init() method below.  Add includeRelationship() and excludeRelationship()
 *  calls to add or remove relationships for a Contact subtype.  See ths GosuDoc for includeRelationship
 *  and excludeRelationship in RelationshipSyncConfigBase
 */
@Export
class RelationshipSyncConfig extends RelationshipSyncConfigBase {
  private static final var _instance : gw.plugin.contact.ab900.RelationshipSyncConfig as readonly Instance = init()
  private construct() {}


  private static function init() : gw.plugin.contact.ab900.RelationshipSyncConfig {

    return new RelationshipSyncConfigBuilder<gw.plugin.contact.ab900.RelationshipSyncConfig>(new gw.plugin.contact.ab900.RelationshipSyncConfig())

        .includeRelationship(Contact, TC_PRIMARYCONTACT, true)

        .includeRelationship(Person, TC_EMPLOYER, false)
        .includeRelationship(Person, TC_GUARDIAN, false)
        .excludeRelationship(Person, TC_PRIMARYCONTACT, false)

        .includeRelationship(Adjudicator, TC_EMPLOYER, true)

        .excludeRelationship(UserContact, TC_PRIMARYCONTACT, true)

        .create()

  }

}

