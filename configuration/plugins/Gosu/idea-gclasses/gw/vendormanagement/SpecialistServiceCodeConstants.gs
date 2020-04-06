package gw.vendormanagement

/**
 * This class stores Code values for particular SpecialistServices that are referenced in the configuration.
 * Customers who configure the tree of SpecialistServices should update the values in this class as necessary.
 */
@Export()
class SpecialistServiceCodeConstants {

  private construct() {}

  // The Code values here correspond to those of the SpecialistServices defined in the ClaimCenter sample data.

  public static final var AUTOINSPREPAIRGLASS : String = "autoinsprepairglass"

  public static final var AUTOTOWING : String = "autoothertowing"

  public static final var AUTOBODYREPAIR : String = "autoinsprepairbody"

  public static final var AUTOAPPRAISAL : String = "autoappraise"

  public static final var AUTORENTAL : String = "autootherrental"

  public static final var CONTENTSINSPECTAPPRAISAL : String = "continspectindependent"

  public static final var MEDICALCARE: String = "medicalcare"

  public static final var PROPEMSMAKESAFE : String = "propemergmakesafe"

  public static final var PROPEMSDEBRISREMOVAL : String = "propemergdebrisremoval"

  public static final var PROPINSPECTAPPRAISAL : String = "propinspectappraisal"

}