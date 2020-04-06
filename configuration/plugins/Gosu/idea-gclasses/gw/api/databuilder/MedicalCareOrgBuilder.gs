package gw.api.databuilder

@Export
class MedicalCareOrgBuilder extends CompanyBuilderBase<MedicalCareOrg, MedicalCareOrgBuilder>
{
  construct()
  {
    super(entity.MedicalCareOrg, 0)
  }
  
  public function withVendorType(vendorType : VendorType) : MedicalCareOrgBuilder {
    set(MedicalCareOrg.Type.TypeInfo.getProperty( "VendorType" ), vendorType)
    return this
  }
  
  public function withName(name : String) : MedicalCareOrgBuilder {
    set(MedicalCareOrg.Type.TypeInfo.getProperty( "Name" ), name)
    return this
  }

  public function withFaxPhone(faxPhone : String) : MedicalCareOrgBuilder {
    set(MedicalCareOrg.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }

  public function withMedicalOrgSpecialty(specialty : SpecialtyType) : MedicalCareOrgBuilder {
    set(MedicalCareOrg.Type.TypeInfo.getProperty( "MedicalOrgSpecialty" ), specialty)
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
  public function withPrimaryAddressSetEarly(address : Address) : MedicalCareOrgBuilder {
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
  public function withPrimaryAddressSetEarly(address : ValueGenerator< Address >) : MedicalCareOrgBuilder {
    this.set(DataBuilder.DEFAULT_ORDER - 1, MedicalCareOrg#PrimaryAddress, address);
    return this
  }
}
