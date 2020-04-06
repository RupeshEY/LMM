package gw.policy.notification

uses java.util.List

/**
 * Configurable list of all policy system notifications. Adding a notification to
 * this list makes it known to the policy system notification event messaging
 * rules and to the PolicySystemNotificationMessageTransport.
 * <p>
 * Customers cannot add new notifications to the IPolicySystemNotificationPlugin
 * interface, but they can add new notifications to this list and override the
 * notification send method to directly call whatever mechanism is used for
 * calling the policy system (e.g. if the plugin implementation uses SOAP, then
 * the send method can use SOAP directly).
 * <p>
 * Guidewire added notifications should always use the plugin interface, so that
 * customers can implement just the plugin interface if all they need are the out
 * of box notifications.
 */
@Export
class PolicySystemNotificationList {

  /** List of all available notifications */
  public static var ALL : List<PolicySystemNotificationBase>
          = { LargeLossPolicySystemNotification.INSTANCE }.freeze()

  /** Never instantiated */
  construct() {}

}
