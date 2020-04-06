package gw.api.databuilder
uses java.util.Date

@Export
class AdjudicatorBuilder extends CCPersonBuilderBase<Adjudicator, AdjudicatorBuilder>
{
  construct() {
    super(entity.Adjudicator)
  }
    
  public function withFaxPhone(faxPhone : String) : AdjudicatorBuilder {
    set(Adjudicator.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }

  public function withAdjuticatorLicense(license : String) : AdjudicatorBuilder {
    set(Adjudicator.Type.TypeInfo.getProperty( "AdjudicatorLicense" ), license)
    return this
  }
  
  public function withAdjudicativeDomain(domain : AdjudicativeDomain) : AdjudicatorBuilder {
    set(Adjudicator.Type.TypeInfo.getProperty( "AdjudicativeDomain" ), domain)
    return this
  }

  public function withDateOfBirth(dob : Date) : AdjudicatorBuilder {
    set(Adjudicator.Type.TypeInfo.getProperty( "DateOfBirth" ), dob)
    return this
  }
  
}
