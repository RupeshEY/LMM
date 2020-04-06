package gw.api.contact
uses java.util.HashSet

/**
 * Helper for the address book and normal contact detail screens. These screens have four cards - Activities,
 * Claims, Exposures and Matters - which show related entities for linked contacts. For example if a contact
 * is linked to multiple claims then the Exposures card shows all the exposures which have claim contacts
 * linked to the current contact. Some contacts can be very "highly linked" - for example a contact
 * representing a car rental company might be linked to tens of thousands of claims. For such highly linked
 * contacts the queries to find related activities, claims etc. can be very expensive. Unfortunately, by
 * default, all the list view queries on a page are executed on entry to the page, even if the list views
 * are on cards that are not visible at the moment. So if the contact detail screens were implemented in
 * a straightforward way then a user trying to see basic contact details could end up executing several
 * extremely expensive queries (these queries have taken several minutes at some customer sites).
 * <p>
 * This helper maintains extra state that is used to hide and show sections of the screen such that:
 * <ul>
 * <li>The queries for the Activities, Claims, Exposures and Matters cards are not executed unless the user
 *     specifically selects the appropriate tab.
 * <li>For highly linked contacts, a warning is displayed before the user can view the contents of the
 *     Activities, Claims, Exposures or Matters cards. The user is warned that viewing the contents of
 *     the card may be expensive and they have to hit a button before proceeding to the actual card contents.
 * </ul>
 * This helper class is tightly linked with the AddressBookContactDetailScreen and ContactDetailScreen PCF
 * files that use it. For example, every card on those screens must have an onSelect attribute that sets
 * helper.CurrentCard to the correct card. It is not intended for use with any other PCFs.
 */
@Export
class ContactDetailHelper {

  /**
   * Enumeration of the available cards on the contact details screens
   */
  enum Card { BASICS, ADDRESSES, RELATED_CONTACTS, ACTIVITIES, CLAIMS, EXPOSURES, MATTERS, REVIEWS }
  
  /**
   * The current card; initially "Basics" but is set (via the card's onSelect attribute) whenever the current
   * card changes.
   */
  var _currentCard : Card as CurrentCard = BASICS

  var _isHighlyLinked : boolean
  var _revealed = new HashSet<Card>();
  
  
  /**
   * Create a new helper. The boolean parameter indicates whether the contact being displayed is highly
   * linked. Only highly linked contacts require a warning before their content is displayed.
   */
  construct(isHighlyLinked : boolean) {
    _isHighlyLinked = isHighlyLinked
  }

  /**
   * Should the warning be visible for the given card? True if the given card is the current card, the
   * contact is highly linked and the user has never pressed the button to explicitly reveal the content.
   */
  function isWarningVisible(card : Card) : boolean {
    return card == CurrentCard and contentShouldBeHidden(card)
  }

  /**
   * Should the content be visible for the given card? True if the given card is the
   * current card, and either the contact is not highly linked or the user has pressed the button to explicitly
   * reveal the content.
   */
  function isContentVisible(card : Card) : boolean {
    return card == CurrentCard and not contentShouldBeHidden(card)
  }
  
  /**
   * Reveal the content for the given card; called by the button if the user viewing a highly linked contact
   * decides that they do want to view the contents of the card.
   */
  function revealContent(card : Card) {
    _revealed.add(card)
  }
  
  private function contentShouldBeHidden(card : Card) : boolean {
    return _isHighlyLinked and not _revealed.contains(card)
  }
}
