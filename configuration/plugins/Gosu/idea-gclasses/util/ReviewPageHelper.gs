package util
uses gw.api.contact.ReviewUtil

@Export
class ReviewPageHelper {

  construct() {
  }

  static function contactHasReviews(c : Contact) : boolean {
    var reviews = c.Reviews;
    return reviews != null and !reviews.IsEmpty
  }
  
  static function shouldDisplayReviewTab(c : Contact) : boolean { 
    return contactHasReviews(c)
            or ReviewUtil.haveReviewTypeForContactSubtype(c.Subtype)
  }
}
