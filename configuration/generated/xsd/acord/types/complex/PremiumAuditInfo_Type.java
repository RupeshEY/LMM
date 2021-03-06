/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PremiumAuditInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PremiumAuditInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AuditInfo = new javax.xml.namespace.QName( "", "AuditInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAuditWorkCompInfo = new javax.xml.namespace.QName( "", "PremiumAuditWorkCompInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAuditLiabilityInfo = new javax.xml.namespace.QName( "", "PremiumAuditLiabilityInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignatureInfo = new javax.xml.namespace.QName( "", "SignatureInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalExposureInfo = new javax.xml.namespace.QName( "", "TotalExposureInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PremiumAuditInfo_Type" );
    }
  };

  public PremiumAuditInfo_Type() {
    super( -1127949952, TYPE.get() );
  }

  private PremiumAuditInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1127949952, state );
  }

  protected PremiumAuditInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PremiumAuditInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PremiumAuditInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PremiumAuditInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AuditInfo getAuditInfo() {
    return (xsd.acord.AuditInfo) TYPE.get().getPropertyValue( this, "_AuditInfo" );
  }


  public final void setAuditInfo( xsd.acord.AuditInfo value ) {
    TYPE.get().setPropertyValue( this, "_AuditInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumAuditWorkCompInfo getPremiumAuditWorkCompInfo() {
    return (xsd.acord.PremiumAuditWorkCompInfo) TYPE.get().getPropertyValue( this, "_PremiumAuditWorkCompInfo" );
  }


  public final void setPremiumAuditWorkCompInfo( xsd.acord.PremiumAuditWorkCompInfo value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAuditWorkCompInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumAuditLiabilityInfo getPremiumAuditLiabilityInfo() {
    return (xsd.acord.PremiumAuditLiabilityInfo) TYPE.get().getPropertyValue( this, "_PremiumAuditLiabilityInfo" );
  }


  public final void setPremiumAuditLiabilityInfo( xsd.acord.PremiumAuditLiabilityInfo value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAuditLiabilityInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SignatureInfo> getSignatureInfo() {
    return (java.util.List<xsd.acord.SignatureInfo>) TYPE.get().getPropertyValue( this, "_SignatureInfo" );
  }


  public final void setSignatureInfo( java.util.List<xsd.acord.SignatureInfo> value ) {
    TYPE.get().setPropertyValue( this, "_SignatureInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TotalExposureInfo> getTotalExposureInfo() {
    return (java.util.List<xsd.acord.TotalExposureInfo>) TYPE.get().getPropertyValue( this, "_TotalExposureInfo" );
  }


  public final void setTotalExposureInfo( java.util.List<xsd.acord.TotalExposureInfo> value ) {
    TYPE.get().setPropertyValue( this, "_TotalExposureInfo", value );
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
