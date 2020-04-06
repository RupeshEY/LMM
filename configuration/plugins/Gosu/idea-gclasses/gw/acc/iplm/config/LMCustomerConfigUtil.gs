package gw.acc.iplm.config

uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party

class LMCustomerConfigUtil {

  /**
   * Evaluates if a given ID and Bureau are one of the companies in the list of Lloyd's, LIRMA and ILU companies
   * @param bureau Bureau identifier
   * @param id ID
   * @return ID and Bureau are a registered member company
   */
  public static function isInsurerRegisteredMember(bureau: String, id: String): boolean {
    var isLloydsMember = isLloydsMember(bureau, id)
    var isLirmaMember = isLirmaMember(bureau, id)
    var isIluMember = isIluMember(bureau, id)

    return isLloydsMember or isLirmaMember or isIluMember
  }

  /**
   * Evaluates if a given ID and Bureau are part of the list of Lloyd's companies
   * @param bureau Bureau identifier
   * @param id ID
   * @return ID and Bureau are a Lloyd's company
   */
  public static function isLloydsMember(bureau: String, id: String): Boolean {
    return companyHasMatch(LMConfigStartablePlugin.LLOYDS_COMPANIES, bureau, id)
  }

  /**
   * Evaluates if a given ID and Bureau are part of the list of LIRMA companies
   * @param bureau Bureau identifier
   * @param id ID
   * @return ID and Bureau are a LIRMA company
   */
  public static function isLirmaMember(bureau: String, id: String): Boolean {
    return companyHasMatch(LMConfigStartablePlugin.LIRMA_COMPANIES, bureau, id)
  }

  /**
   * Evaluates if a given ID and Bureau are part of the list of ILU companies
   * @param bureau Bureau identifier
   * @param id ID
   * @return ID and Bureau are a ILU company
   */
  public static function isIluMember(bureau: String, id: String): Boolean {
    return companyHasMatch(LMConfigStartablePlugin.ILU_COMPANIES, bureau, id)
  }

  private static function companyHasMatch(companies: List<Party>, bureau: String, id: String): boolean {
    return companies.hasMatch(\company -> company.FirstAgency == bureau and company.FirstId == id)
  }
}