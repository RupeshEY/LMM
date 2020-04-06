package gw.api.databuilder

@Export
class AttorneyBuilder extends CCPersonBuilderBase<Attorney, AttorneyBuilder>
{
  construct() {
    super(entity.Attorney)
  }
  
  public function withAttorneyLicense(license : String) : AttorneyBuilder {
    set(Attorney.Type.TypeInfo.getProperty( "AttorneyLicense" ), license)
    return this
  }
  
  public function withAttorneySpecialty(specialty : LegalSpecialty) : AttorneyBuilder {
    set(Attorney.Type.TypeInfo.getProperty( "AttorneySpecialty" ), specialty)
    return this
  }

  public function withFaxPhone(faxPhone : String) : AttorneyBuilder {
    set(Attorney.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }
}
