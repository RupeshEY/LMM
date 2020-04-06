package gw.acc.iplm.utils

uses javax.xml.namespace.QName

/**
 * Constants related to ACORD Message Standard
 */
class ACORDMessageConstants {

  //Required HEADER Values
  public final static var ACORD_CONTENT_TRANSFER_ENCODING_VALUE: String = "binary"
  public final static var ACORD_SOAP_ACTION_VALUE: String = "\"http://www.ACORD.org/Standards/AcordMsgSvc/Inbox#PostRq\""
  public final static var ACORD_APPLICATION_TYPE: String = "ACORD-Repository"
  public static final var ACORD_SCHEMA_VERSION: String  = "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2"

  //Constant XML values
  public final static var POSTRQ_MESSAGE_TYPE: String = "RepositoryOperationRq"


  //Namespaces
  public final static var ACORD_MSG_SVC: String = "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0"
  public final static var NS_POSTRQ: String = "http://www.ACORD.org/Standards/AcordMsgSvc/Inbox"
  public final static var POSTRQ: String = "PostRq"

  //Qualified Names
  public final static var POST_RQ: QName = new QName(ACORD_MSG_SVC, POSTRQ, "ac")

}