/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CertificateInqInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CertificateInqInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialPolicy = new javax.xml.namespace.QName( "", "PartialPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncludeAllHoldersInd = new javax.xml.namespace.QName( "", "IncludeAllHoldersInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LiabilityCoverageLimits = new javax.xml.namespace.QName( "", "LiabilityCoverageLimits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RecipientInfo = new javax.xml.namespace.QName( "", "RecipientInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CertificateInqInfo_Type" );
    }
  };

  public CertificateInqInfo_Type() {
    super( 235131727, TYPE.get() );
  }

  private CertificateInqInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 235131727, state );
  }

  protected CertificateInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CertificateInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CertificateInqInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CertificateInqInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PartialPolicy> getPartialPolicy() {
    return (java.util.List<xsd.acord.PartialPolicy>) TYPE.get().getPropertyValue( this, "_PartialPolicy" );
  }


  public final void setPartialPolicy( java.util.List<xsd.acord.PartialPolicy> value ) {
    TYPE.get().setPropertyValue( this, "_PartialPolicy", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Location getLocation() {
    return (xsd.acord.Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( xsd.acord.Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIncludeAllHoldersInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_IncludeAllHoldersInd" );
  }


  public final void setIncludeAllHoldersInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_IncludeAllHoldersInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IncludeAllHoldersInd getIncludeAllHoldersInd_elem() {
    return (xsd.acord.IncludeAllHoldersInd) TYPE.get().getPropertyValue( this, "_IncludeAllHoldersInd_elem" );
  }


  public final void setIncludeAllHoldersInd_elem( xsd.acord.IncludeAllHoldersInd value ) {
    TYPE.get().setPropertyValue( this, "_IncludeAllHoldersInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalInterest> getAdditionalInterest() {
    return (java.util.List<xsd.acord.AdditionalInterest>) TYPE.get().getPropertyValue( this, "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( java.util.List<xsd.acord.AdditionalInterest> value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalInterest", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Form> getForm() {
    return (java.util.List<xsd.acord.Form>) TYPE.get().getPropertyValue( this, "_Form" );
  }


  public final void setForm( java.util.List<xsd.acord.Form> value ) {
    TYPE.get().setPropertyValue( this, "_Form", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LiabilityCoverageLimits> getLiabilityCoverageLimits() {
    return (java.util.List<xsd.acord.LiabilityCoverageLimits>) TYPE.get().getPropertyValue( this, "_LiabilityCoverageLimits" );
  }


  public final void setLiabilityCoverageLimits( java.util.List<xsd.acord.LiabilityCoverageLimits> value ) {
    TYPE.get().setPropertyValue( this, "_LiabilityCoverageLimits", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.RecipientInfo> getRecipientInfo() {
    return (java.util.List<xsd.acord.RecipientInfo>) TYPE.get().getPropertyValue( this, "_RecipientInfo" );
  }


  public final void setRecipientInfo( java.util.List<xsd.acord.RecipientInfo> value ) {
    TYPE.get().setPropertyValue( this, "_RecipientInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}