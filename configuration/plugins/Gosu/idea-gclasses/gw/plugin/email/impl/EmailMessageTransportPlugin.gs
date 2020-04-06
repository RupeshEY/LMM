package gw.plugin.email.impl

uses gw.api.locale.DisplayKey
uses gw.api.email.AbstractEmailMessageTransport
uses javax.mail.MessagingException
uses java.lang.Throwable
uses gw.api.email.Email
uses java.util.Date

@Export
class EmailMessageTransportPlugin extends AbstractEmailMessageTransport
{
  override protected function handleMessageException(message:Message, email:Email, messageException: MessagingException) : boolean {
    createActivity(message, email, messageException)
    return false
  }

  override protected function handleGeneralException(message:Message, email:Email, exception:Throwable) {
    createActivity(message, email, exception)
  }

  private function createActivity(message:Message, email:Email, exception:Throwable) {
    message.ErrorDescription = exception.Message;
    message.reportError();
    if (message.Claim == null) {
      return
    }
    var pattern = ActivityPattern.finder.getActivityPatternByCode( "general_reminder" )
    var claim = message.Claim
    var activity = claim.createActivityFromPattern( null, pattern )
    activity.Subject = DisplayKey.get("Email.Error.Sending", email.Subject)
    activity.Description = DisplayKey.get("Email.Error.Description")
    activity.Priority = Priority.TC_URGENT
    activity.Importance = ImportanceLevel.TC_TOP
    activity.Mandatory = true
    activity.TargetDate = Date.CurrentDate
  }

}
