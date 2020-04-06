package gw.acc.iplm.validation.util

uses com.google.common.collect.ImmutableList
uses com.google.common.collect.ImmutableMap
uses gw.acc.iplm.utils.ECFMessageConstants

/**
 * Constant values related to validation of ECF messages
 * such as regular expressions or ID values.
 */
final class ECFValidationConstants {

  private construct(){}

  public static final var LIRMA_SENDER_ID_REGEX: String = "urn:lirma:[a-zA-Z]\\d{4}"
  public static final var LLOYDS_SENDER_ID_REGEX: String = "urn:lloyds:\\d{4}"
  public static final var XCHANGING_SENDER_ID_REGEX: String = "urn:duns:\\d{9}"
  public static final var ILU_SENDER_ID_REGEX: String = "urn:ilu:\\d{6}"


  /**
   * Map of regex for valid sender IDs
   */
  public static final var SENDER_ID_REGEX_MAP: Map<String, String> = ImmutableMap.of(
      "XCHANGING", XCHANGING_SENDER_ID_REGEX,
      "LIRMA", LIRMA_SENDER_ID_REGEX,
      "LLOYDS", LLOYDS_SENDER_ID_REGEX,
      "ILU", ILU_SENDER_ID_REGEX
  )

  /**
   * List of valid message types for Claim Notify messages
   */
  public static final var CLAIM_NOTIFY_MESSAGE_TYPES_LIST: List<String> = ImmutableList.of(
      ECFMessageConstants.CLAIMNOTIFY_HEADER_TYPE,
      ECFMessageConstants.RESPONDERRORNOTIFY_HEADER_TYPE
  )

  /**
   * List of valid message types for Retrieve Claim messages
   */
  public static final var RETRIEVE_CLAIM_MESSAGE_TYPES_LIST: List<String> = ImmutableList.of(
      ECFMessageConstants.CLAIMRETRIEVE_HEADER_TYPE
  )

  /**
   * List of valid message types for Claim Response messages
   */
  public static final var CLAIM_RESPONSE_MESSAGE_TYPES_LIST: List<String> = ImmutableList.of(
      ECFMessageConstants.CLAIMRESPONSE_HEADER_TYPE
  )

  //Regex
  public static final var EMAIL_REGEX: String = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)" //Matches asmith@mactec.com | foo12@foo.edu | bob.smith@foo.tv
  public static final var PHONE_REGEX: String = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$" // Matches: (+44)(0)20-12341234 | 02012341234 | +44 (0) 1234-1234
  public static final var ALPHANUMERIC_REGEX: String = "^[a-zA-Z0-9]*$"
  public static final var NUMERIC_REGEX: String = "^\\d+$"
}