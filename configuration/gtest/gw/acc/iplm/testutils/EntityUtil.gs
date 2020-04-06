package gw.acc.iplm.testutils

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.api.testdata.TestDataUtil
uses gw.transaction.Transaction
uses gw.xml.XmlElement

/**
 * Utility for entity creation during integration tests that require objects in the database
 */
class EntityUtil {

  /**
   * A method to provide a standard way of allowing a user to run a
   * block in a non-persistent bundle as an unrestricted user.
   *
   * @param transactionBlock
   */
  public static function runAsUnrestrictedUserNoCommit(transactionBlock: Transaction.BlockRunnable) {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        transactionBlock.run(bundle)
      })
    })
  }

  public static function runAsUnrestrictedUserNoCommit(transactionBlock: Runnable) {
    runAsUnrestrictedUserNoCommit(\bundle -> transactionBlock.run())
  }

  public static function persistMessageLogEntity(xmlContent: String) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var ecfMessageLog = new EntityMapperService().createEntity(ECFXmlFileReader.getTypedXmlElement(XmlElement.parse(xmlContent)))
      bundle.add(ecfMessageLog)
    }, "su")
  }
}