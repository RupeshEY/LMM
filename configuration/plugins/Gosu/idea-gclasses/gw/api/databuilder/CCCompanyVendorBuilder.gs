package gw.api.databuilder

@Export
class CCCompanyVendorBuilder extends CompanyBuilderBase<CompanyVendor, CCCompanyVendorBuilder>
{
  construct()
  {
    super( CompanyVendor, 0 )
  }
  
  public function withCategoryScore(catScore : ContactCategoryScore) : CCCompanyVendorBuilder {
    withCategoryScore(ExistingBean.wrap(catScore))
    return this 
  }
  
  public function withCategoryScore(catScore : ValueGenerator< ContactCategoryScore >) : CCCompanyVendorBuilder {
    this.addArrayElement(CompanyVendor#CategoryScores, catScore)
    return this 
  }


  public function withFaxPhone(faxPhone : String) : CCCompanyVendorBuilder {
    set(CompanyVendor.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }
  
  public function withName(name : String) : CCCompanyVendorBuilder {
    set(CompanyVendor.Type.TypeInfo.getProperty( "Name" ), name)
    return this
  }

  /**
   * Sets the primary address on the company and also sets the initialization order of the address so
   * it will be set up before other fields on the company. This is useful because the country of the
   * primary address is used to determine the validators for other fields on the contact (such as
   * phone number and tax identification number) so the primary address should typically be one of the
   * first fields to be set.
   * @param address the desired primary address
   * @return the modified builder
   */
  public function withPrimaryAddressSetEarly(address : Address) : CCCompanyVendorBuilder {
    return withPrimaryAddressSetEarly(ExistingBean.wrap(address))
  }

  /**
   * Sets the primary address on the company and also sets the initialization order of the address so
   * it will be set up before other fields on the company. This is useful because the country of the
   * primary address is used to determine the validators for other fields on the contact (such as
   * phone number and tax identification number) so the primary address should typically be one of the
   * first fields to be set.
   * @param address a generator that will return the desired primary address
   * @return the modified builder
   */
  public function withPrimaryAddressSetEarly(address : ValueGenerator< Address >) : CCCompanyVendorBuilder {
    this.set(DataBuilder.DEFAULT_ORDER - 1,CompanyVendor#PrimaryAddress, address);
    return this
  }
}
