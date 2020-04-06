package gw.api.databuilder
uses java.lang.Integer

@Export
class ContactCategoryScoreBuilder extends DataBuilder<ContactCategoryScore, ContactCategoryScoreBuilder> {

  construct() {
    super(entity.ContactCategoryScore);
  }

  function withAddressBookUID(abuid : String ) : ContactCategoryScoreBuilder  {
    set(ContactCategoryScore#AddressBookUID, abuid);
    return self();
  }

  function withReviewCategory(reviewCategory : ReviewCategory ) : ContactCategoryScoreBuilder  {
    set(ContactCategoryScore#ReviewCategory, reviewCategory);
    return self();
  }

  function  withScore(score : Integer) : ContactCategoryScoreBuilder {
    set(ContactCategoryScore#Score, score);
    return self();
  }
}
