package gw.api.iso
uses java.util.regex.Pattern

@Export
interface ISOValidationConstants {
  
  /** VINs (vehicle identification numbers) must be 17 alphanumeric digits */
  public final var VIN_PATTERN : Pattern = Pattern.compile("^[A-Z0-9]{17}$")

  /** Model year in which VIN numbers started being required */
  public final var YEAR_VIN_REQUIRED : int = 1981

  /** HINs (hull identification numbers) must be 12 digits, first 3 letters, next 5 digits */
  public final var HIN_PATTERN : Pattern = Pattern.compile("^[A-Z]{3}[0-9]{5}[A-Z0-9]{4}")

  /** Year in which HIN numbers started being required */
  public final var YEAR_HIN_REQUIRED : int = 1973
}
