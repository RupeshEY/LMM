package gw.acc.iplm.utils.pcf.messagedetails

final class ECFMessageDetailsFinancialsPCFHelper {

    /**
     * Regular Expression to identify the different parts of a Lloyds OSND: NNNNNDDMMYYYY
     */
    private static final var LLOYDS_OSND_UI_FORMAT_REGEX = "(\\d{5})(\\d{2})(\\d{2})(\\d{4})"
    /**
     * Format to display Lloyds OSND on the UI from output of above regex: "NNNNN - DD/MM/YYYY"
     */
    private static final var LLOYDS_OSND_UI_FORMAT = "$1 - $2/$3/$4"
    /**
     * Regular Expression to identify the different parts of a LIRMA OSND: YYMMDDNNNNNNN
     */
    private static final var LIRMA_OSND_UI_FORMAT_REGEX = "(\\d{2})(\\d{2})(\\d{2})(\\d{7})"
    /**
     * Format to display LIRMA OSND on the UI from output of above regex: "NNNNNNN - DD/MM/YY"
     */
    private static final var LIRMA_OSND_UI_FORMAT = "$4 - $3/$2/$1"
    /**
     * Regular Expression to identify the different parts of a ILU OSND: PMHYYNNNNNNDDMM
     */
    private static final var ILU_OSND_UI_FORMAT_REFEX = "(\\S{2})(\\S{1})(\\d{2})(\\d{6})(\\d{2})(\\d{2})"
    /**
     * Format to display ILU OSND on the UI from output of above regex: "PM H NNNNNN - DD/MM/YY"
     */
    private static final var ILU_OSND_UI_FORMAT = "$1 $2 $4 - $5/$6/$3"

    internal var _claimDataMsg: ECFMessageClaimData_Ext

    construct(claimDataMsg: ECFMessageClaimData_Ext) {
      _claimDataMsg = claimDataMsg
    }

    /**
     * Converts a comma separated string of Original Signing Number & Date (OSND) values into a new line separated string
     * of OSND values which have been formatted for display on the UI
     * If the OSND value cannot be formatted, the original value is returned instead
     * @param csv
     * @return
     */
    public function convertOSNDCsvToFormattedOSNDs(csv: String): String {
      var osnds = csv?.split(",")
      osnds = osnds?.map(\osnd -> formattedOSND(osnd))
      return osnds?.join("\r\n")
    }

    /**
     * Utility function to convert the Original Signing Number & Date (OSND) from an ECF Message to the formatted
     * string to display on the UI<br>
     * Lloyd’s display format is NNNNNDDMMYYYY<br>
     * ILU's display format is PMHYYNNNNNNDDMM<br>
     * LIRMA's display format is YYMMDDNNNNNNN<br>
     * For example Lloyd's 1234505102016 converts to "12345 - 05/10/2016"<br>
     *
     * If the OSND value cannot be formatted, the original value is returned instead
     *
     * @param osnd - The OSND from an ECF Message
     * @return OSND formatted for display on the UI
     */
    public function formattedOSND(osnd: String): String {
      switch(_claimDataMsg.BureauType){
        case ECFBureauType_Ext.TC_LLOYDS :
          return osnd.replaceFirst(LLOYDS_OSND_UI_FORMAT_REGEX, LLOYDS_OSND_UI_FORMAT)
        case ECFBureauType_Ext.TC_LIRMA :
          return osnd.replaceFirst(LIRMA_OSND_UI_FORMAT_REGEX, LIRMA_OSND_UI_FORMAT)
        case ECFBureauType_Ext.TC_ILU :
          return osnd.replaceFirst(ILU_OSND_UI_FORMAT_REFEX, ILU_OSND_UI_FORMAT)
        default:
          return osnd
      }
    }

    /**
     * Checks if the InsurerSharePercentage value for this Claim Notify message is less than 100%
     */
    public function isLessThanFullShare() : boolean {
      return _claimDataMsg.InsurerSharePercentage?.compareTo(100) < 0
    }

    property get HasFinancial1(): boolean {
      return _claimDataMsg.Financials.isHasElements() && _claimDataMsg.Financials.length >= 1
    }

    property get Financial1(): ECFMessageClaimDataFinancial_Ext {
      return HasFinancial1 ? _claimDataMsg.FinancialsSortedByCurrency[0] : null
    }

    property get HasFinancial2(): boolean {
      return _claimDataMsg.Financials.isHasElements() && _claimDataMsg.Financials.length >= 2
    }

    property get Financial2(): ECFMessageClaimDataFinancial_Ext {
      return HasFinancial2 ? _claimDataMsg.FinancialsSortedByCurrency[1] : null
    }

    property get HasFinancial3(): boolean {
      return _claimDataMsg.Financials.isHasElements() && _claimDataMsg.Financials.length >= 3
    }

    property get Financial3(): ECFMessageClaimDataFinancial_Ext {
      return HasFinancial3 ? _claimDataMsg.FinancialsSortedByCurrency[2] : null
    }
  }