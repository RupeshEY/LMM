package gw.acc.iplm.security

uses gw.acc.iplm.utils.ECFConstants

uses java.io.FileInputStream
uses java.security.KeyStore

final class ECFKeystoreLoader {

  private static var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _keyStore = initializeKeystore()

  /**
   * Getter for the KeyStore.
   * @return KeyStore
   */
  property get KeyStore() : KeyStore {
    return _keyStore
  }

  private static function initializeKeystore() : KeyStore {
    var keystore : KeyStore

    try {
      keystore = KeyStore.getInstance(KeyStore.getDefaultType())
      keystore.load(new FileInputStream(ECFConstants.KEYSTORE_FILE), ECFConstants.KEYSTORE_PASSWORD.toCharArray())
    } catch (e: Exception) {
      LOGGER.error("Unable to initialize keystore ", e)
      throw e
    }

    return keystore
  }
}