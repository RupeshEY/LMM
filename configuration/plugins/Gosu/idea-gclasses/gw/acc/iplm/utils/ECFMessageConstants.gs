package gw.acc.iplm.utils

uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs

/**
 * Constants related to ECF Message Standard
 */
class ECFMessageConstants {

  //ECF Message Types
  public static final var CLAIM_NOTIFY_EVENT_RQ_QNAME_LP: String = ClaimNotifyEventRq.$QNAME.LocalPart
  public static final var CLAIM_RESPONSE_RQ_QNAME_LP: String = ClaimResponseRq.$QNAME.LocalPart
  public static final var CLAIM_RESPONSE_RS_QNAME_LP: String = ClaimResponseRs.$QNAME.LocalPart
  public static final var CLAIM_RETRIEVE_RQ_QNAME_LP: String = RetrieveClaimRq.$QNAME.LocalPart
  public static final var CLAIM_RETRIEVE_RS_QNAME_LP: String = RetrieveClaimRs.$QNAME.LocalPart
  public static final var REPOSITORY_OPERATION_RQ_QNAME_LP: String = RepositoryOperationRq.$QNAME.LocalPart
  public static final var REPOSITORY_OPERATION_RS_QNAME_LP: String = RepositoryOperationRs.$QNAME.LocalPart

  //Party Roles
  public final static var INSURER_ROLE: String = "Insurer"
  public static final var SERVICEPROVIDER_ROLE: String = "ServiceProvider"
  public static final var SERVICEPROVIDER_NAME: String = "Xchanging"

  //ECF Header Message Types
  public static final var CLAIMNOTIFY_HEADER_TYPE: String = "ClaimNotify"
  public static final var CLAIMRETRIEVE_HEADER_TYPE: String = "RetrieveClaim"
  public static final var CLAIMRESPONSE_HEADER_TYPE: String = "ClaimRespond"

  public static final var RESPONDERRORNOTIFY_HEADER_TYPE: String = "RespondErrorNotify"
  //IMR Operation Types
  public static final var DocumentDownloadType: String = "RepositoryDownload"
  public static final var DocumentUploadType: String = "RepositoryUpload"
  public static final var DocumentSearchType: String = "RepositorySearch"

  //IMR PostRq Message Type
  public static final var POSTRQ_MESSAGE_TYPE : String = "RepositoryOperationRq"

  //IMR Operation Schema
  public static final var APPLICATION_CD: String  = "Jv-Ins-Reinsurance"

  //ClaimAdviceInitialOrSubsequentIndicator values
  public final static var FNOL_TYPES: ECFClaimTransactionType_Ext[] = {
      ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
      ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT}

  public final static var FILE_SIZE_UNIT: String = "KB"

  public final static var DEFAULT_CONTACT_ROLES: List<typekey.ContactRole> = {
      ContactRole.TC_EXTERNALADJUSTER_EXT,
      ContactRole.TC_ATTORNEY,
      ContactRole.TC_BUREAULEADINSURERORREINSURER_EXT,
      ContactRole.TC_BROKER_EXT,
      ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT,
      ContactRole.TC_CLAIMANT}

  public static final var CID: String = "cid:"
  public static final var BASE64: String = "base64"

  //Bureau Codes
  public static final var LLOYDS_CODE: String = "SY"
  public static final var LIRMA_CODE: String = "LR"
  public static final var ILU_CODE: String = "IL"

  //Transaction Error Codes
  public static final var CLAIM_TRANSACTION_IS_DELETED: String = "Z001"
  public static final var CLAIM_TRANSACTION_IN_ERROR: String = "Z002"
  public static final var CLAIM_TRANSACTION_IN_ERROR_DUE_TO_PREVIOUS_TRANSACTION_CHANGE: String = "Z003"
}