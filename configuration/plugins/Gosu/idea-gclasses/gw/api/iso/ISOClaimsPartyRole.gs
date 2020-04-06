package gw.api.iso
uses java.util.HashMap

/**
 * Enumeration of ISO ClaimsParty role codes. Every ClaimsParty in an ISO
 * ClaimSearch message must have a role. There are two broad classes of role:
 * "individual" which can just be specified with a stand alone ClaimsParty
 * and "service provider" roles which must be attached to a ClaimsParty with
 * an individual role, via a ClaimsPartyRelationship aggregate. In addition
 * there are special individual roles to do with the claimant and insured.
 * <p>
 * A ClaimsParty can only appear once in the search request and can only
 * have one role so there is an ordering of the roles, from most to
 * least important. If a ClaimsParty could appear with either of two (or
 * more) roles then it should appear with just the most important. The
 * importance ordering is:
 * <ul>
 * <li>CI - Both claimant and insured; always used if party is both claimant
 *     and insured
 * <li>CD, CP, CE - More specific versions of the claimant role
 * <li>ID, IP, IE - More specific versions of the insured role
 * <li>CL, INS - Claimant or insured (can't be both or we'd use CI)
 * <li>Any other individual role
 * <li>Any service provider role
 * </ul>
 */ 
@Export
enum ISOClaimsPartyRole {

  CL("CL", "Claimant"),
  CI("CI", "Both Claimant and Insured"),
  CD("CD", "Claimant Driver"),
  CP("CP", "Claimant Passenger"),
  CE("CE", "Claimant Pedestrian"),
  ID("ID", "Insured Driver"),
  IP("IP", "Insured Passenger"),
  IE("IE", "Insured Employee"),
  INS("IN", "Insured"), // Unfortunately IN is a reserved word in Gosu
  OW("OW", "Owner"),
  PT("PT", "Partner"),
  TN("TN", "Tenant"),
  WT("WT", "Witness"),
  BE("BE", "Body Shop Employee"),
  BO("BO", "Body Shop Manager"),
  BS("BS", "Body Shop"),
  CO("CO", "Corporate Officer"),
  CT("CT", "Contractor"),
  EM("EM", "Employer"),
  FM("FM", "First Mortgagee"),
  IA("IA", "Independent Appraiser"),
  IB("IB", "Agent/Broker"),
  II("II", "Independent Adjuster"),
  IO("IO", "Other Insurance Personnel"),
  IR("IR", "Staff Appraiser"),
  IS("IS", "Staff Adjuster"),
  IY("IY", "Insurance Employee"),
  LC("LC", "Claimant Lawyer"),
  LI("LI", "Insured Lawyer"),
  LM("LM", "Law Office Manager"),
  LO("LO", "Law Office"),
  LP("LP", "Loss Payee"),
  LR("LR", "Paralegal"),
  LW("LW", "Lawyer - Other"),
  MA("MA", "Physician's Assistant"),
  MC("MC", "Chiropractor"),
  MD("MD", "Medical Doctor"),
  ME("ME", "Emergency Care Facility"),
  MF("MF", "Hospital"),
  MG("MG", "Radiologist"),
  MK("MK", "Medical Clinic"),
  ML("ML", "Licensed Vocational/Practical Nurse"),
  MM("MM", "Other Medical Personnel"),
  MN("MN", "Nurse"),
  MO("MO", "Other Doctor"),
  MR("MR", "Laboratory"),
  MS("MS", "Dentist"),
  MT("MT", "Physical Therapist"),
  MX("MX", "X-Ray Lab"),
  MY("MY", "Other Medical Provider"),
  MZ("MZ", "Office Administrator"),
  NP("NP", "Other Non-Professional"),
  OP("OP", "Other Professional"),
  OS("OS", "Osteopath"),
  PA("PA", "Public Adjuster"),
  PH("PH", "Pharmacy"),
  PS("PS", "Psychologist"),
  SM("SM", "Second Mortgagee"),
  TW("TW", "Towing Company"),
  DeathMaster("DeathMaster", "Death Master"),
  Alias("Alias", "Alias"),
  PortOrigin("PortOrigin", "Port Origin"),
  Emergency("Emergency", "Emergency Agency"),
  Appraiser("Appraiser","Appraiser"),
  ImpoundFac("ImpoundFac", "Impounding Facility"),
  ImpouundAgcy("ImpouundAgcy", "Impounding Agency"),
  SalvageBuyer("SalvageBuyer", "Salvage Buyer"),
  RecoveringAgency("RecoveringAgency", "Recovering Agency")
  
  
  final static var INSURED_ROLES = new ISOClaimsPartyRole[] {
    CI, ID, IP, IE, INS
  }.toSet()
    
  final static var CLAIMANT_ROLES = new ISOClaimsPartyRole[] {
    CL, CI, CD, CP, CE
  }.toSet()
    
  final static var INDIVIDUAL_ROLES = new ISOClaimsPartyRole[] {
    CL, CI, CD, CP, CE, ID, IP, IE, INS, OW, PT, TN, WT
  }.toSet()
  
  final static var ACORD_STANDARD_ROLES = new ISOClaimsPartyRole[] {
    DeathMaster, Alias, PortOrigin, Emergency, Appraiser,ImpoundFac,
    ImpouundAgcy, SalvageBuyer, RecoveringAgency
  }.toSet()

  final static var ROLES_BY_CODE = createByCodeMap()
  
    /** The code of the role, as used in the ISO payload XML */    
  var _code : String as readonly InternalCode

  /** The name of the role, briefly describes what the role is */    
  var _name : String as readonly InternalName

  private construct(inCode : String, inName : String) {
    _code = inCode
    _name = inName
  }

  /** Return the role with the given code */
  static function byCode(code : String) : ISOClaimsPartyRole {
    return ROLES_BY_CODE[code]
  }
  
  /**
   * Is this one of the roles used for the insured, for example Insured,
   * Both Claimant and Insured or Insured Driver?
   */
  property get IsInsured() : boolean {
    return INSURED_ROLES.contains(this)
  }
  
  /**
   * Is this one of the roles used for the claimant, for example Claimant,
   * Both Claimant and Insured or Claimant Driver?
   */
  property get IsClaimant() : boolean {
    return CLAIMANT_ROLES.contains(this)
  }
  
  /**
   * Is this one of the roles that can be added as an individual ClaimsParty?
   * All other roles (service provider roles) have to be linked to a ClaimsParty
   * with an individual role via a ClaimsPartyRelationship aggregate
   */
  property get IsIndividual() : boolean {
    return INDIVIDUAL_ROLES.contains(this)
  }
  
  /**
   * Is this one of the ACORD standard role types?
   */
  property get IsAcordStandard() : boolean {
    return ACORD_STANDARD_ROLES.contains(this)
  }
  
  private static function createByCodeMap() : HashMap<String,ISOClaimsPartyRole> {
    var all = ISOClaimsPartyRole.AllValues
    var result = new HashMap<String,ISOClaimsPartyRole>(all.Count)
    for (role in all) {
      result[role.InternalCode] = role
    }
    return result
  }
}
