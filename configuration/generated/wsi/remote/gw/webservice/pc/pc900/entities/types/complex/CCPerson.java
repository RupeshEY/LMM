/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCContact.class)
public class CCPerson extends wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCContact {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPerson", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Employer = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Employer", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Guardian = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Guardian", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Wards = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Wards", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CellPhoneCountry = new javax.xml.namespace.QName( "", "CellPhoneCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CellPhone = new javax.xml.namespace.QName( "", "CellPhone", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CellPhoneExtension = new javax.xml.namespace.QName( "", "CellPhoneExtension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DateOfBirth = new javax.xml.namespace.QName( "", "DateOfBirth", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FirstName = new javax.xml.namespace.QName( "", "FirstName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FirstNameKanji = new javax.xml.namespace.QName( "", "FirstNameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FormerName = new javax.xml.namespace.QName( "", "FormerName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Gender = new javax.xml.namespace.QName( "", "Gender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LastName = new javax.xml.namespace.QName( "", "LastName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LastNameKanji = new javax.xml.namespace.QName( "", "LastNameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LicenseNumber = new javax.xml.namespace.QName( "", "LicenseNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LicenseState = new javax.xml.namespace.QName( "", "LicenseState", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_MaritalStatus = new javax.xml.namespace.QName( "", "MaritalStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_MiddleName = new javax.xml.namespace.QName( "", "MiddleName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NumDependents = new javax.xml.namespace.QName( "", "NumDependents", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NumDependentsU18 = new javax.xml.namespace.QName( "", "NumDependentsU18", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NumDependentsU25 = new javax.xml.namespace.QName( "", "NumDependentsU25", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Occupation = new javax.xml.namespace.QName( "", "Occupation", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Particle = new javax.xml.namespace.QName( "", "Particle", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Prefix = new javax.xml.namespace.QName( "", "Prefix", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Suffix = new javax.xml.namespace.QName( "", "Suffix", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TaxFilingStatus = new javax.xml.namespace.QName( "", "TaxFilingStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllAddresses = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "AllAddresses", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactAddresses = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "ContactAddresses", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactCompany = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "ContactCompany", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OfficialIDs = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "OfficialIDs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryAddress = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PrimaryAddress", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryContact = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PrimaryContact", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ID = new javax.xml.namespace.QName( "", "ID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressBookUID = new javax.xml.namespace.QName( "", "AddressBookUID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_BureauIDOfficialID = new javax.xml.namespace.QName( "", "BureauIDOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DOLIDOfficialID = new javax.xml.namespace.QName( "", "DOLIDOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DUNSOfficialID = new javax.xml.namespace.QName( "", "DUNSOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_EmailAddress1 = new javax.xml.namespace.QName( "", "EmailAddress1", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_EmailAddress2 = new javax.xml.namespace.QName( "", "EmailAddress2", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FEINOfficialID = new javax.xml.namespace.QName( "", "FEINOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FaxPhoneCountry = new javax.xml.namespace.QName( "", "FaxPhoneCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FaxPhone = new javax.xml.namespace.QName( "", "FaxPhone", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FaxPhoneExtension = new javax.xml.namespace.QName( "", "FaxPhoneExtension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_HomePhoneCountry = new javax.xml.namespace.QName( "", "HomePhoneCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_HomePhone = new javax.xml.namespace.QName( "", "HomePhone", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_HomePhoneExtension = new javax.xml.namespace.QName( "", "HomePhoneExtension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NCCIIDOfficialID = new javax.xml.namespace.QName( "", "NCCIIDOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "Name", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NameKanji = new javax.xml.namespace.QName( "", "NameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Notes = new javax.xml.namespace.QName( "", "Notes", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OrganizationType = new javax.xml.namespace.QName( "", "OrganizationType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicySystemID = new javax.xml.namespace.QName( "", "PolicySystemID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Preferred = new javax.xml.namespace.QName( "", "Preferred", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PreferredCurrency = new javax.xml.namespace.QName( "", "PreferredCurrency", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryLanguage = new javax.xml.namespace.QName( "", "PrimaryLanguage", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryPhone = new javax.xml.namespace.QName( "", "PrimaryPhone", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Score = new javax.xml.namespace.QName( "", "Score", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SSNOfficialID = new javax.xml.namespace.QName( "", "SSNOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_STAXOfficialID = new javax.xml.namespace.QName( "", "STAXOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_STUNOfficialID = new javax.xml.namespace.QName( "", "STUNOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SpecialtyType = new javax.xml.namespace.QName( "", "SpecialtyType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TUNSOfficialID = new javax.xml.namespace.QName( "", "TUNSOfficialID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TaxID = new javax.xml.namespace.QName( "", "TaxID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TaxStatus = new javax.xml.namespace.QName( "", "TaxStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_VendorNumber = new javax.xml.namespace.QName( "", "VendorNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_VendorType = new javax.xml.namespace.QName( "", "VendorType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_W9Received = new javax.xml.namespace.QName( "", "W9Received", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_W9ReceivedDate = new javax.xml.namespace.QName( "", "W9ReceivedDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_W9ValidFrom = new javax.xml.namespace.QName( "", "W9ValidFrom", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_W9ValidTo = new javax.xml.namespace.QName( "", "W9ValidTo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WithholdingRate = new javax.xml.namespace.QName( "", "WithholdingRate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WorkPhoneCountry = new javax.xml.namespace.QName( "", "WorkPhoneCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WorkPhone = new javax.xml.namespace.QName( "", "WorkPhone", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WorkPhoneExtension = new javax.xml.namespace.QName( "", "WorkPhoneExtension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPerson" );
    }
  };

  public CCPerson() {
    super( 1378642536, TYPE.get() );
  }

  private CCPerson( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1378642536, state );
  }

  protected CCPerson( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCPerson( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPerson> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPerson get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getEmployer() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_Employer" );
  }


  public final void setEmployer( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_Employer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Employer getEmployer_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Employer) TYPE.get().getPropertyValue( this, "_Employer_elem" );
  }


  public final void setEmployer_elem( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Employer value ) {
    TYPE.get().setPropertyValue( this, "_Employer_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getGuardian() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_Guardian" );
  }


  public final void setGuardian( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_Guardian", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Guardian getGuardian_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Guardian) TYPE.get().getPropertyValue( this, "_Guardian_elem" );
  }


  public final void setGuardian_elem( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Guardian value ) {
    TYPE.get().setPropertyValue( this, "_Guardian_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getWards() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_Wards" );
  }


  public final void setWards( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_Wards", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Wards> getWards_elem() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Wards>) TYPE.get().getPropertyValue( this, "_Wards_elem" );
  }


  public final void setWards_elem( java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPerson_Wards> value ) {
    TYPE.get().setPropertyValue( this, "_Wards_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCellPhoneCountry() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CellPhoneCountry" );
  }


  public final void setCellPhoneCountry( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CellPhoneCountry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCellPhone() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CellPhone" );
  }


  public final void setCellPhone( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CellPhone", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCellPhoneExtension() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CellPhoneExtension" );
  }


  public final void setCellPhoneExtension( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CellPhoneExtension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getDateOfBirth() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_DateOfBirth" );
  }


  public final void setDateOfBirth( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_DateOfBirth", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FirstName" );
  }


  public final void setFirstName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FirstName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstNameKanji() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FirstNameKanji" );
  }


  public final void setFirstNameKanji( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FirstNameKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormerName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormerName" );
  }


  public final void setFormerName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormerName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGender() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Gender" );
  }


  public final void setGender( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Gender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LastName" );
  }


  public final void setLastName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LastName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastNameKanji() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LastNameKanji" );
  }


  public final void setLastNameKanji( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LastNameKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLicenseNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LicenseNumber" );
  }


  public final void setLicenseNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LicenseNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLicenseState() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LicenseState" );
  }


  public final void setLicenseState( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LicenseState", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMaritalStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MaritalStatus" );
  }


  public final void setMaritalStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MaritalStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMiddleName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MiddleName" );
  }


  public final void setMiddleName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MiddleName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDependents() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDependents" );
  }


  public final void setNumDependents( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDependents", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDependentsU18() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDependentsU18" );
  }


  public final void setNumDependentsU18( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDependentsU18", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDependentsU25() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDependentsU25" );
  }


  public final void setNumDependentsU25( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDependentsU25", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOccupation() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Occupation" );
  }


  public final void setOccupation( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Occupation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getParticle() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Particle" );
  }


  public final void setParticle( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Particle", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrefix() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Prefix" );
  }


  public final void setPrefix( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Prefix", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSuffix() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Suffix" );
  }


  public final void setSuffix( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Suffix", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxFilingStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TaxFilingStatus" );
  }


  public final void setTaxFilingStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TaxFilingStatus", value );
  }

}
