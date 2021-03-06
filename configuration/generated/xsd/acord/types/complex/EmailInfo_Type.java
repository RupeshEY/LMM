/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EmailInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EmailInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationUseCd = new javax.xml.namespace.QName( "", "CommunicationUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmailAddr = new javax.xml.namespace.QName( "", "EmailAddr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DoNotContactInd = new javax.xml.namespace.QName( "", "DoNotContactInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PreferredContactRef = new javax.xml.namespace.QName( "", "PreferredContactRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EmailInfo_Type" );
    }
  };

  public EmailInfo_Type() {
    super( -541827690, TYPE.get() );
  }

  private EmailInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -541827690, state );
  }

  protected EmailInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EmailInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.EmailInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.EmailInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.CommunicationUse> getCommunicationUseCd() {
    return (java.util.List<xsd.acord.enums.CommunicationUse>) TYPE.get().getPropertyValue( this, "_CommunicationUseCd" );
  }


  public final void setCommunicationUseCd( java.util.List<xsd.acord.enums.CommunicationUse> value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationUseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommunicationUseCd> getCommunicationUseCd_elem() {
    return (java.util.List<xsd.acord.CommunicationUseCd>) TYPE.get().getPropertyValue( this, "_CommunicationUseCd_elem" );
  }


  public final void setCommunicationUseCd_elem( java.util.List<xsd.acord.CommunicationUseCd> value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationUseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEmailAddr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EmailAddr" );
  }


  public final void setEmailAddr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EmailAddr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EmailAddr getEmailAddr_elem() {
    return (xsd.acord.EmailAddr) TYPE.get().getPropertyValue( this, "_EmailAddr_elem" );
  }


  public final void setEmailAddr_elem( xsd.acord.EmailAddr value ) {
    TYPE.get().setPropertyValue( this, "_EmailAddr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDoNotContactInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_DoNotContactInd" );
  }


  public final void setDoNotContactInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_DoNotContactInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DoNotContactInd getDoNotContactInd_elem() {
    return (xsd.acord.DoNotContactInd) TYPE.get().getPropertyValue( this, "_DoNotContactInd_elem" );
  }


  public final void setDoNotContactInd_elem( xsd.acord.DoNotContactInd value ) {
    TYPE.get().setPropertyValue( this, "_DoNotContactInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getPreferredContactRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_PreferredContactRef" );
  }


  public final void setPreferredContactRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_PreferredContactRef", value );
  }

}
