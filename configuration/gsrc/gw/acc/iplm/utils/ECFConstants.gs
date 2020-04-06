package gw.acc.iplm.utils

uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.api.util.ConfigAccess
uses org.apache.commons.lang3.StringEscapeUtils
uses org.slf4j.Logger
uses org.slf4j.LoggerFactory

uses java.io.File
uses java.lang.invoke.MethodHandles
uses java.text.SimpleDateFormat

/**
 * Constants used in ECF-WB accelerator
 */
final class ECFConstants {

  public static var LOGGER_BLOCK: block(): Logger = (\-> LoggerFactory.getLogger(MethodHandles.lookup().lookupClass()))

  //Queue Parameters
  public static final var ECF_SUPER_USER: String = "su"

  //Xchanging information
  public static final var XCHANGING_ID: String = "urn:duns:236196817"
  public static final var XCHANGING_ROLE: String = "ServiceProvider"
  public static final var XCHANGING_NAME: String = "Xchanging"
  public static final var XCHANGING_AGENCY: String = "Xchanging"

  // These are configuration points for when setting up a keystore file for holding certificates
  public static final var KEYSTORE_FILE: File = ConfigAccess.getConfigFile("config/iplm/keystore/ecfkeystore.jks")
  public static final var KEYSTORE_PASSWORD: String = "ecfkeystore"
  public static final var CERTIFICATE_ALIAS: String = "ecf"

  // ECF Configuration Data Loader
  public static final var BUREAU_ATTRIBUTE:String = "bureau"
  public static final var COMPANY_PARENT_NODE:String = "company"
  public static final var NAME_CHILD_NODE:String= "name"
  public static final var ID_CHILD_NODE:String = "id"

  //ECF Date Format Constant
  public final static var DATE_PATTERN_YEAR_ONLY: String = "yyyy"
  public final static var DATE_PATTERN_YEAR_MONTH_ONLY: String = "yyyy-MM"
  public final static var DATE_PATTERN_YEAR_MONTH_DAY_ONLY: String = "yyyy-MM-dd"
  public final static var DATE_PATTERN_TIMESTAMP_ONLY: String = "yyyy-MM-dd'T'HH:mm:ssXXX"
  public final static var DATE_PATTERN_TIMESTAMP_MILLISECONDS_ONLY: String = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"

  public final static var ECF_DATE_FORMAT_YEAR_ONLY: ThreadLocal<SimpleDateFormat> = new ThreadLocal<SimpleDateFormat>() {
    protected function initialValue(): SimpleDateFormat {
      return new SimpleDateFormat(DATE_PATTERN_YEAR_ONLY)
    }
  }

  public final static var ECF_DATE_FORMAT_YEAR_MONTH_ONLY: ThreadLocal<SimpleDateFormat> = new ThreadLocal<SimpleDateFormat>() {
    protected function initialValue(): SimpleDateFormat {
      return new SimpleDateFormat(DATE_PATTERN_YEAR_MONTH_ONLY)
    }
  }

  public final static var ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY: ThreadLocal<SimpleDateFormat> = new ThreadLocal<SimpleDateFormat>() {
    protected function initialValue(): SimpleDateFormat {
      return new SimpleDateFormat(DATE_PATTERN_YEAR_MONTH_DAY_ONLY)
    }
  }

  public final static var ECF_XML_PAYLOAD_DATETIME_FORMAT: ThreadLocal<ECFDateTimeParser> = new ThreadLocal<ECFDateTimeParser>() {
    protected function initialValue(): ECFDateTimeParser {
      return new ECFDateTimeParser({DATE_PATTERN_TIMESTAMP_ONLY, DATE_PATTERN_TIMESTAMP_MILLISECONDS_ONLY})
    }
  }

  //Default Exposure ID
  public static final var ECF_CLAIMANT_NOT_FOUND: String = "ECF_CLAIMANT_NOT_FOUND"

  public static final var IMAGE_EXTENSIONS: String[] = new String[]{"jpeg", "jpg", "png"}
  public final static var FILE_TEMP_DIRECTORY: File = new File("/tmp/tempECFUploadFiles")

  public final static var IMR_MAX_FILE_SIZE_BYTES: long = Long.valueOf(20971520)

  //Default decimal scale for monetary amounts
  public static final var DEFAULT_MONETARY_AMOUNT_SCALE: int = 2

  public static final var ECF_COMPANY_CONFIG: File = ConfigAccess.getConfigFile("config/iplm/iplm-company-config.xml")

  public static final var IMR_SUPPORTED_ENVELOPE_BODY_MESSAGE_TYPES: String[] = new String[]{
      PostRq.$QNAME.LocalPart,
      PostRs.$QNAME.LocalPart
  }

  //Default ECF Claim ActivityPattern Code
  public static final var ECF_CLAIM_ACTIVITY_PATTERN_CODE: String = "ecf_activity"
  //Conflict of interest activity pattern code
  public static final var ECF_COI_ACTIVITY_PATTERN_CODE:String = "ecf_coi_activity"
  //New catastrophe activity pattern code
  public static final var ECF_CATASTROPHE_ACTIVITY_PATTERN_CODE:String = "ecf_catastrophe_activity"
  public static final var ECF_TRANSACTION_APPROVAL_PATTERN:String = "approve_ecf_transaction"
  //OOTB activity pattern codes
  public static final var OOTB_APPROVAL_DENIED : String = "approval_denied"


  public static final var PUBLIC_COMMENTS_LIMIT: byte = 15
  public static final var PRIVATE_COMMENTS_LIMIT: byte = 15
  public static final var LIRMA_COMMENTS_LIMIT: byte = 6
  public static final var COMMENT_LINE_CHAR_LIMIT: byte = 70
  public static final var PRIVATE_COMMENTS_LIMIT_LIRMA : byte = 0
  public static final var COMMENTS_XML_CHARACTERS_WEIGHT: HashMap<String, Integer> = {"<" -> StringEscapeUtils.escapeXml("<").size,
                                                                                      ">" -> StringEscapeUtils.escapeXml(">").size,
                                                                                      "&" -> StringEscapeUtils.escapeXml("&").size}
  public static final var QUERY_REASON_LIMIT: byte = 10
  public static final var CHASE_UP_INDICATOR_DEFAULT: byte = 12
  public static final var CHASE_UP_PERIOD_MONTHS: List<Integer> = (1..100).where(\ i -> i%3 == 0)
  /**
   * Because the New Line used by PCF does not match System.LineSeperator()
   */
  public static final var PCF_COMMENT_LINE_SEPERATOR: String = "\r?\n"

  // London Market Messages
  public static final var LM_MESSAGE_POLICY_NUMBER_SEPARATOR : String = "/"
}