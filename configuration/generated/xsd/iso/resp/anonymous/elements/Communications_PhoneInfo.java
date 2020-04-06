/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Communications_PhoneInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PhoneInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PhoneTypeCd = new javax.xml.namespace.QName( "", "PhoneTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationUseCd = new javax.xml.namespace.QName( "", "CommunicationUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PhoneNumber = new javax.xml.namespace.QName( "", "PhoneNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmailAddr = new javax.xml.namespace.QName( "", "EmailAddr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_PhoneName = new javax.xml.namespace.QName( "", "com.iso_PhoneName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_PublishedInd = new javax.xml.namespace.QName( "", "com.iso_PublishedInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.Communications_PhoneInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo" );
    }
  };

  public Communications_PhoneInfo() {
    super( 1995349472, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo() );
  }

  public Communications_PhoneInfo( xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo typeInstance ) {
    super( 1995349472, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Communications_PhoneInfo( gw.internal.xml.XmlElementState state ) {
    super( 1995349472, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.Communications_PhoneInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.Communications_PhoneInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getPhoneTypeCd() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhoneTypeCd" );
  }


  public final void setPhoneTypeCd( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhoneTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneTypeCd> getPhoneTypeCd_elem() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhoneTypeCd_elem" );
  }


  public final void setPhoneTypeCd_elem( java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhoneTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getCommunicationUseCd() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommunicationUseCd" );
  }


  public final void setCommunicationUseCd( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommunicationUseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_CommunicationUseCd> getCommunicationUseCd_elem() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_CommunicationUseCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommunicationUseCd_elem" );
  }


  public final void setCommunicationUseCd_elem( java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_CommunicationUseCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommunicationUseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getPhoneNumber() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhoneNumber" );
  }


  public final void setPhoneNumber( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhoneNumber", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneNumber> getPhoneNumber_elem() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneNumber>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhoneNumber_elem" );
  }


  public final void setPhoneNumber_elem( java.util.List<xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_PhoneNumber> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhoneNumber_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEmailAddr() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EmailAddr" );
  }


  public final void setEmailAddr( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EmailAddr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_EmailAddr getEmailAddr_elem() {
    return (xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_EmailAddr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EmailAddr_elem" );
  }


  public final void setEmailAddr_elem( xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_EmailAddr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EmailAddr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_PhoneName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PhoneName" );
  }


  public final void setComIso_PhoneName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PhoneName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PhoneName getComIso_PhoneName_elem() {
    return (xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PhoneName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PhoneName_elem" );
  }


  public final void setComIso_PhoneName_elem( xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PhoneName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PhoneName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_PublishedInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PublishedInd" );
  }


  public final void setComIso_PublishedInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PublishedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PublishedInd getComIso_PublishedInd_elem() {
    return (xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PublishedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PublishedInd_elem" );
  }


  public final void setComIso_PublishedInd_elem( xsd.iso.resp.anonymous.elements.Communications_PhoneInfo_ComIso_PublishedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PublishedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}