package gw.entity
uses gw.api.admin.BaseAdminUtil

/**
 * An enhancement that provides a Country property on PolicySearchCriteria so that
 * the country specific search fields on the criteria (such as tax identifier and vehicle
 * identification number) will have the correct field validators
 */
@Export
enhancement GWPolicySearchCriteriaCountryEnhancement : entity.PolicySearchCriteria {
  
  /**
   * Use the insured address country or, failing that, the default country
   */
  property get Country() : Country {
    return this.InsuredAddress.Country != null ? this.InsuredAddress.Country : BaseAdminUtil.getDefaultCountry()
  }
}
