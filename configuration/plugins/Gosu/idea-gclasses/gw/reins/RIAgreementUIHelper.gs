package gw.reins

@Export
class RIAgreementUIHelper {

  /**
   * Treaty subtypes of RIAgreement, in the order they will appear
   * in the Add Agreement -> Treaty  submenu on the RI Summary page.
   */
  public static property get TreatySubtypes() : Type[] {
    return {QuotaShareRITreaty, SurplusRITreaty, AnnualAggregateRITreaty, ExcessOfLossRITreaty, NetExcessOfLossRITreaty, PerEventRITreaty}
  }

  /**
   * Facultative subtypes of RIAgreement, in the order they will appear
   * in the Add Agreement -> Facultative  submenu on the RI Summary page.
   */
  public static property get FacultativeSubtypes() : Type[] {
    return {FacProportionalRIAgreement, FacExcessOfLossRIAgreement, FacNetExcessOfLossRIAgreement}
  }

}
