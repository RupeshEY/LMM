/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BillingInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BillingInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountNumber = new javax.xml.namespace.QName( "", "BillingAccountNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondNumber = new javax.xml.namespace.QName( "", "BondNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingPeriod = new javax.xml.namespace.QName( "", "BillingPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BalanceInfo = new javax.xml.namespace.QName( "", "BalanceInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentInfo = new javax.xml.namespace.QName( "", "InstallmentInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingActivityInfo = new javax.xml.namespace.QName( "", "BillingActivityInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountStatusCd = new javax.xml.namespace.QName( "", "BillingAccountStatusCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BillingInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BillingInfo_Type" );
    }
  };

  public BillingInfo() {
    super( -354998315, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BillingInfo_Type() );
  }

  public BillingInfo( xsd.acord.types.complex.BillingInfo_Type typeInstance ) {
    super( -354998315, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BillingInfo( gw.internal.xml.XmlElementState state ) {
    super( -354998315, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BillingInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BillingInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BillingInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BillingInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BillingInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BillingInfo.class );
  }

  public static xsd.acord.BillingInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BillingInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBillingAccountNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber" );
  }


  public final void setBillingAccountNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingAccountNumber getBillingAccountNumber_elem() {
    return (xsd.acord.BillingAccountNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem" );
  }


  public final void setBillingAccountNumber_elem( xsd.acord.BillingAccountNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyNumber getPolicyNumber_elem() {
    return (xsd.acord.PolicyNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.acord.PolicyNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondNumber" );
  }


  public final void setBondNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondNumber getBondNumber_elem() {
    return (xsd.acord.BondNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondNumber_elem" );
  }


  public final void setBondNumber_elem( xsd.acord.BondNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingPeriod getBillingPeriod() {
    return (xsd.acord.BillingPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingPeriod" );
  }


  public final void setBillingPeriod( xsd.acord.BillingPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BalanceInfo getBalanceInfo() {
    return (xsd.acord.BalanceInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BalanceInfo" );
  }


  public final void setBalanceInfo( xsd.acord.BalanceInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BalanceInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InstallmentInfo> getInstallmentInfo() {
    return (java.util.List<xsd.acord.InstallmentInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentInfo" );
  }


  public final void setInstallmentInfo( java.util.List<xsd.acord.InstallmentInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BillingActivityInfo> getBillingActivityInfo() {
    return (java.util.List<xsd.acord.BillingActivityInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingActivityInfo" );
  }


  public final void setBillingActivityInfo( java.util.List<xsd.acord.BillingActivityInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingActivityInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BillingAccountStatus getBillingAccountStatusCd() {
    return (xsd.acord.enums.BillingAccountStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountStatusCd" );
  }


  public final void setBillingAccountStatusCd( xsd.acord.enums.BillingAccountStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingAccountStatusCd getBillingAccountStatusCd_elem() {
    return (xsd.acord.BillingAccountStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountStatusCd_elem" );
  }


  public final void setBillingAccountStatusCd_elem( xsd.acord.BillingAccountStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountStatusCd_elem", value );
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