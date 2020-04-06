package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Claim {
  static function assign (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.ASSIGN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function close (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CLOSE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function closeexposure (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CLOSEEXPOSURE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function closematter (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CLOSEMATTER.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createactivity (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEACTIVITY.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createanytransaction (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEANYTRANSACTION.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createdocument (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEDOCUMENT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createevaluation (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEEVALUATION.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createexposure (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEEXPOSURE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createincident (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEINCIDENT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createmanualpayment (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEMANUALPAYMENT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function creatematter (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEMATTER.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createnegotiation (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATENEGOTIATION.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createnote (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATENOTE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createpayment (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEPAYMENT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createrecovery (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATERECOVERY.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createrecoveryreserve (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATERECOVERYRESERVE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function createreserve (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATERESERVE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function manageclaimusers (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.MANAGECLAIMUSERS.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function managepartiesinvolved (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.MANAGEPARTIESINVOLVED.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function print (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.PRINT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function removeflag (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.REMOVEFLAG.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function reopen (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.REOPEN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function reopenmatter (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.REOPENMATTER.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function retrymessage (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.RETRYMESSAGE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function selectpolicy (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.SELECTPOLICY.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function validate (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VALIDATE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewconfidentialnotes (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWCONFIDENTIALNOTES.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewnettotalincurred (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWNETTOTALINCURRED.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewpayments (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWPAYMENTS.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewrecoveries (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWRECOVERIES.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewrecoveryreserves (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWRECOVERYRESERVES.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewreserves (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWRESERVES.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewsyncstatus (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWSYNCSTATUS.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewtransactiondetails (object :  Object) : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.VIEWTRANSACTIONDETAILS.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get archive () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.ARCHIVE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get createassociation () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.CREATEASSOCIATION.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassign () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICASSIGN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignowned () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICASSIGNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignunowned () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICASSIGNUNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericedit () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICEDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericremoveflag () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICREMOVEFLAG.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewactivity () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWACTIVITY.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewclaim () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWCLAIM.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewexposure () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWEXPOSURE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewmatter () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWMATTER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewnettotalincurred () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWNETTOTALINCURRED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewpayments () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWPAYMENTS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewrecoveries () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWRECOVERIES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewrecoveryreserves () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWRECOVERYRESERVES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewreserves () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWRESERVES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericviewtransactions () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.GENERICVIEWTRANSACTIONS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get own () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.OWN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get purge () : boolean {
    return com.guidewire._generated.security.ClaimPermKeys.PURGE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}