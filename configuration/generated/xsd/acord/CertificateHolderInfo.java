/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CertificateHolderInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CertificateHolderInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancel = new javax.xml.namespace.QName( "", "NumDaysCancel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeliveryMethodCd = new javax.xml.namespace.QName( "", "DeliveryMethodCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CertificateHolderInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CertificateHolderInfo_Type" );
    }
  };

  public CertificateHolderInfo() {
    super( -334626691, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CertificateHolderInfo_Type() );
  }

  public CertificateHolderInfo( xsd.acord.types.complex.CertificateHolderInfo_Type typeInstance ) {
    super( -334626691, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CertificateHolderInfo( gw.internal.xml.XmlElementState state ) {
    super( -334626691, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CertificateHolderInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CertificateHolderInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CertificateHolderInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CertificateHolderInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CertificateHolderInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CertificateHolderInfo.class );
  }

  public static xsd.acord.CertificateHolderInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CertificateHolderInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdditionalInterest getAdditionalInterest() {
    return (xsd.acord.AdditionalInterest) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( xsd.acord.AdditionalInterest value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalInterest", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancel() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancel" );
  }


  public final void setNumDaysCancel( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancel getNumDaysCancel_elem() {
    return (xsd.acord.NumDaysCancel) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancel_elem" );
  }


  public final void setNumDaysCancel_elem( xsd.acord.NumDaysCancel value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancel_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DeliveryMethod getDeliveryMethodCd() {
    return (xsd.acord.enums.DeliveryMethod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeliveryMethodCd" );
  }


  public final void setDeliveryMethodCd( xsd.acord.enums.DeliveryMethod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeliveryMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DeliveryMethodCd getDeliveryMethodCd_elem() {
    return (xsd.acord.DeliveryMethodCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeliveryMethodCd_elem" );
  }


  public final void setDeliveryMethodCd_elem( xsd.acord.DeliveryMethodCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeliveryMethodCd_elem", value );
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