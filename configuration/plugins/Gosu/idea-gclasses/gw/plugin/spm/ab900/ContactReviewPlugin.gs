package gw.plugin.spm.ab900

uses gw.api.contact.ContactSystemUtil
uses gw.api.system.PLLoggerCategory
uses gw.api.util.LocaleUtil
uses gw.plugin.InitializablePlugin
uses gw.plugin.contact.IContactReviewPlugin
uses gw.webservice.contactapi.ContactAPIUtil
uses gw.xml.ws.WsdlConfig
uses org.slf4j.Logger
uses wsi.remote.gw.webservice.ab.ab900.abvendorevaluationapi.ABVendorEvaluationAPI
uses wsi.remote.gw.webservice.ab.ab900.abvendorevaluationapi.types.complex.ABVendorEvaluationAPIReviewSummary

uses java.lang.Integer
uses java.rmi.RemoteException
uses java.util.Calendar
uses java.util.Map
uses java.util.UUID

uses entity.Contact

@Export
class ContactReviewPlugin implements IContactReviewPlugin, InitializablePlugin {
  private var _logger : Logger as readonly LOGGER = gw.api.util.Logger.forCategory(PLLoggerCategory.PLUGIN, "ContactReview")
  private var _username = ""
  private var _password = ""

  construct() {

  }

  /**
   * Scores the review for a given set of answers.
   * NOTE: If using category scores, this should create/update those scores on the
   *       Review object as necessary.
   *
   * @param review
   * @return the overall score for the review
   */
  override function scoreReview(review: Review): Integer {
    // By default, we simply call the internal "default" scoring mechanism.
    return review.updateAndGetSimpleScores()
  }

  /**
   * Submits a summary of the completed Review to ContactManager.
   *
   * @param review
   * @return the addressBookUID for the submitted ReviewSummary
   * @throws RemoteException if there is a problem connecting to the ContactManager server.
   */
  override function submitReview(review: Review) : String {
    var result = ""
    var reviewCategoryScores = review.SortedCategoryScores
    var numCatScores = reviewCategoryScores.length
    var reviewCategories = new String[numCatScores]
    var categoryScores = new int[numCatScores]
    var reviewScore = review.Score

    if (reviewScore == null) {
      reviewScore = Integer.MIN_VALUE
    }
    for (var i in 0..|numCatScores) {
      var reviewCategory = reviewCategoryScores[i].ReviewCategory.Code
      var catScore = reviewCategoryScores[i].Score
      reviewCategories[i] = reviewCategory
      categoryScores[i] = catScore
    }

    var serviceType = review.ServiceType.Code

    var cal : Calendar

    if (review.ServiceDate != null) {
      cal = Calendar.getInstance()
      cal.Time = review.ServiceDate
    }

    var api = getContactAPI()

    // Check to see if review contact is valid before adding summary,
    // if not throw and exception
    var linkstatus = ContactSystemUtil.INSTANCE.generateLinkStatus(review.Contact)

    if (linkstatus.Linked and not linkstatus.Broken) {
      var reviewrequest = new ABVendorEvaluationAPIReviewSummary() {
          :AssociatedContact = review.Contact.AddressBookUID,
          :ClaimCenterUID = review.PublicID,
          :ClaimNumber = review.Claim.ClaimNumber,
          :Comments = review.Comments,
          :Description = review.Description,
          :LinkID = null,
          :Name = review.Name,
          :RelatedTo = review.RelatedTo,
          :ReviewedBy = review.ReviewedBy.DisplayName,
          :ReviewType = review.ReviewType.Name,
          :Score = review.Score,
          :ServiceDate = cal.Time,
          :ServiceType = serviceType,
          :SubContact = review.Subcontact
      }

      var categoryScore = new wsi.remote.gw.webservice.ab.ab900.abvendorevaluationapi.anonymous.elements.ABVendorEvaluationAPIReviewSummary_CategoryScores()
      var category = new wsi.remote.gw.webservice.ab.ab900.abvendorevaluationapi.anonymous.elements.ABVendorEvaluationAPIReviewSummary_ReviewCategories()
      for (i in 0..|reviewCategories.length){
        categoryScore.Entry.add(categoryScores[i])
        category.Entry.add(reviewCategories[i])
      }
      reviewrequest.CategoryScores = categoryScore
      reviewrequest.ReviewCategories = category

      setTransactionId(api)
      var rs = api.addNewReviewSummary(reviewrequest)

      result = rs.LinkID
    } else {
      // log message if review can't be generate because the contact is unlinked and/or the link is broken
      LOGGER.error("Could not generate review for broken or unlinked contact " + review.Contact
          + "(" + review.Contact.AddressBookUID + ") on claim " + review.Claim.ClaimNumber)
    }

    return result
  }

  /**
   * Deletes the summary corresponding to a completed Review from ContactManager.
   *
   * @param review
   * @throws RemoteException if there is a problem connecting to the ContactManager server.
   */
  override function deleteReview(review: Review ) {
    //Below should be an assert.
    if (review.AddressBookUID == null) {
      throw new RemoteException("Shouldn't call plugin if not linked.")
    }
    var api = getContactAPI()
    setTransactionId(api)
    api.deleteReviewSummary( review.AddressBookUID )
  }

  /** Indicated to ContactManager that it should update the scores for a given Contact.
   *
   * @param contact - a contact, which must be linked to ContactManager
   * @throws RemoteException if there is a problem connecting to the ContactManager server.
   */
  override function updateScores(contact : Contact ) {
    if (!ContactSystemUtil.INSTANCE.contactIsLinked(contact)) return
    var abUID = contact.AddressBookUID
    var api = getContactAPI()
    setTransactionId(api)
    api.updateReviewScoresForContact( abUID )
  }


  override function setParameters( params: Map ) : void
  {
    _username = params.get("username") as String
    _password = params.get("password") as String
  }


  //
  //  Private
  //

  private property get ContactAPI() : ABVendorEvaluationAPI {
    var config = new WsdlConfig()
    config.Guidewire.Authentication.Username = _username == null ? "su" : _username
    config.Guidewire.Authentication.Password = _password == null ? "gw" : _password
    var api = new ABVendorEvaluationAPI(config)
    api.Config.Guidewire.Locale = LocaleUtil.CurrentLanguage.toString()
    return api
  }


  /**
   *  Set the transaction id before calling AB's ABVendorEvaluationAPI.  This plugin isn't called from the
   *  messaging system so we don't have to worry about retried messages so I think it's OK just to use
   *  a UUID.
   */
  private function setTransactionId(api : ABVendorEvaluationAPI) {
    ContactAPIUtil.setTransactionId(api.Config, UUID.randomUUID().toString())
  }
}
