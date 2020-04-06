package gw.api.databuilder

@Export
class DoctorBuilder extends CCPersonBuilderBase<Doctor, DoctorBuilder>
{
  construct() {
    super(entity.Doctor)
  }
  
  public function withSpecialtyType(specialtyType : SpecialtyType) : DoctorBuilder {
    set(Doctor.Type.TypeInfo.getProperty( "SpecialtyType" ), specialtyType)
    return this
  }

  public function withDoctorSpecialty(specialtyType : SpecialtyType) : DoctorBuilder {
    set(Doctor.Type.TypeInfo.getProperty( "DoctorSpecialty" ), specialtyType)
    return this
  }

  public function withMedicalLicense(license : String) : DoctorBuilder {
    set(Doctor.Type.TypeInfo.getProperty( "MedicalLicense" ), license)
    return this
  }


  public function withFaxPhone(faxPhone : String) : DoctorBuilder {
    set(Doctor.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }
}