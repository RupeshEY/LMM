package gw.api.specialhandling

uses entity.AutomatedNotificationHandler
uses gw.lang.Export
uses typekey.NotificationType

@Export
class SpecialHandlingHelper {
  
  private construct() {}

  /**
   * In CC7.0.0, email address is a non-nullable field in the database. Our new notification methods
   * (Email by contact role, email multiple addresses) do not look at this field. Because of the DB
   * constraint, we need to populate the field with dummy data when it's not used and clear the field
   * if we re-select the OOTB notification method.
   */
  public static function refreshEmailAddressField(handler : AutomatedNotificationHandler) {
    if (handler.NotificationType == NotificationType.TC_EMAIL) {
        handler.EmailAddress = ""
    } else {
        handler.EmailAddress = "noemail@guidewire.com"
    }
  }

}
