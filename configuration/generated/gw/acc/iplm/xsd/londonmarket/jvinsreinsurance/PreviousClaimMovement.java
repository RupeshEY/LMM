/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PreviousClaimMovement extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PreviousClaimMovement", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType" );
    }
  };

  public PreviousClaimMovement() {
    super( 1581551205, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType() );
  }

  public PreviousClaimMovement( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType typeInstance ) {
    super( 1581551205, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PreviousClaimMovement( gw.internal.xml.XmlElementState state ) {
    super( 1581551205, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PreviousClaimMovementType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PreviousClaimMovement.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUUId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UUId" );
  }


  public final void setUUId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCedentReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CedentReference" );
  }


  public final void setCedentReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CedentReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference getCedentReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CedentReference_elem" );
  }


  public final void setCedentReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CedentReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrokerReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrokerReference" );
  }


  public final void setBrokerReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrokerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference getBrokerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrokerReference_elem" );
  }


  public final void setBrokerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrokerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceProviderReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceProviderReference" );
  }


  public final void setServiceProviderReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceProviderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference getServiceProviderReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceProviderReference_elem" );
  }


  public final void setServiceProviderReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceProviderReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReinsurerReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReinsurerReference" );
  }


  public final void setReinsurerReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReinsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference getReinsurerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReinsurerReference_elem" );
  }


  public final void setReinsurerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReinsurerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerReference" );
  }


  public final void setInsurerReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference getInsurerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerReference_elem" );
  }


  public final void setInsurerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PreviousClaimMovementType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PreviousClaimMovementType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PreviousClaimMovementType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
