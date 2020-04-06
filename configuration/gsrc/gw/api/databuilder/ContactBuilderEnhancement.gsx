package gw.api.databuilder
uses java.math.BigDecimal
uses java.util.Date

@Export
enhancement ContactBuilderEnhancement<T extends Contact, B extends ContactBuilder<T, B>> : gw.api.databuilder.ContactBuilder<T, B> {
  
  public function withEFTRecord(eftData : EFTData) : B {
    withEFTRecord(ExistingBean.wrap(eftData))
    return this as B
  }
  
  public function withEFTRecord(eftData : ValueGenerator< EFTData >) : B {
    this.addArrayElement(T#EFTRecords, eftData)
    return this as B
  }
  
   /**
   * Creates a random Tax ID that is localized to the default country.
   */
  public function withLocalizedTaxID() : B {
    ContactBuilderUtil.setTaxIdGenerator(this, new TaxIdGenerator())
    return this as B
  }
  
  /**
   * Creates a random Tax ID that is localized to the given country.
   */
  public function withLocalizedTaxID(country:Country) : B {
    ContactBuilderUtil.setTaxIdGenerator(this, new TaxIdGenerator(country))
    return this as B
  }

  public function withScore(score : int) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "Score" ), score)
    return this as B
  }
  
  public function withTaxStatus(status : TaxStatus) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "TaxStatus" ), status)
    return this as B
  }

  public function withVendorNumber(vendorNumber : String) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "VendorNumber" ), vendorNumber)
    return this as B
  }

  public function withW9Received(received : boolean) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "W9Received" ), received)
    return this as B
  }

  public function withW9ReceivedDate(receivedDate : Date) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "W9ReceivedDate" ), receivedDate)
    return this as B
  }

  public function withW9ValidFrom(validFromDate : Date) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "W9ValidFrom" ), validFromDate)
    return this as B
  }

  public function withW9ValidTo(validToDate : Date) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "W9ValidTo" ), validToDate)
    return this as B
  }

  public function withWithholdingRate(rate : BigDecimal) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "WithholdingRate" ), rate)
    return this as B
  }

  public function withPolicySystemId(policySystemId : String) : B {
    this.set(Contact.Type.TypeInfo.getProperty( "PolicySystemId" ), policySystemId)
    return this as B
  }
}
