package gw.plugin.credentials.impl

uses gw.api.util.ConfigAccess
uses gw.pl.logging.LoggerCategory
uses gw.plugin.InitializablePlugin
uses gw.plugin.credentials.UsernamePasswordPairBase
uses gw.xsd.credentials.CredentialsArray
uses gw.xsd.credentials.CredentialsElem
uses org.slf4j.Logger

uses java.io.FileNotFoundException
uses java.io.IOException

@Export
class CredentialsPlugin implements gw.plugin.credentials.CredentialsPlugin, InitializablePlugin {
  private var _logger : Logger = null;
  private var CREDENTIALS_FILE_PROPERTY : String = "credentialsFile";

  var credentialsFile : String

  construct() {
    _logger = LoggerCategory.PLUGIN;
    _logger.info("*** CredentialsPlugin is initialized.***");
  }


  override function setParameters(properties : Map<Object,Object>) : void {
    credentialsFile = properties.get(CREDENTIALS_FILE_PROPERTY) as String
  }

 /**
  * Return a username and password for a given key.
  *
  * @param key a key identifying which username/password pair is desired
  * @return UsernamePasswordPairBase contains the username and password to use
  */
  override function retrieveUsernameAndPassword(key : String) : UsernamePasswordPairBase {
    try {
      var configFile = ConfigAccess.getConfigFile(credentialsFile)
      if(configFile != null) {
        var credentialsArray = CredentialsArray.parse(configFile)
        var credentials = credentialsArray.getChildren(credentialsArray.$Namespace.qualify("CredentialsElem")).firstWhere(\x -> x.getAttributeValue("key") == key) as CredentialsElem
        if (credentials != null && credentials.Username != null && !credentials.Username.trim().equals("") && credentials.Password != null && !credentials.Password.trim().equals("")) {
          return new UsernamePasswordPairBase(credentials.Username, credentials.Password);
        }
      } else {
        throw new FileNotFoundException("No credentials configuration found at " + credentialsFile);
      }
    } catch ( e : IOException) {
      var msg = "Problem obtaining username/password for key " + key + "."
      _logger.error(msg);
      throw new RuntimeException(msg + " " + e.toString());
    }
    return null
  }

}
