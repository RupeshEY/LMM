/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReferredBordereau extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredBordereau", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchangeReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingExchangeReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauSectionSequenceNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauSectionSequenceNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauSectionItemSequenceNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauSectionItemSequenceNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationChannel = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CommunicationChannel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType" );
    }
  };

  public ReferredBordereau() {
    super( 724675117, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType() );
  }

  public ReferredBordereau( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType typeInstance ) {
    super( 724675117, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReferredBordereau( gw.internal.xml.XmlElementState state ) {
    super( 724675117, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredBordereauType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau.class );
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
  public final java.lang.String getCoverHolderReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverHolderReference" );
  }


  public final void setCoverHolderReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverHolderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference getCoverHolderReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverHolderReference_elem" );
  }


  public final void setCoverHolderReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverHolderReference_elem", value );
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
  public final java.lang.String getPlacingExchangeReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PlacingExchangeReference" );
  }


  public final void setPlacingExchangeReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PlacingExchangeReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference getPlacingExchangeReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PlacingExchangeReference_elem" );
  }


  public final void setPlacingExchangeReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PlacingExchangeReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBordereauSectionSequenceNbr() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauSectionSequenceNbr" );
  }


  public final void setBordereauSectionSequenceNbr( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauSectionSequenceNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionSequenceNbr getBordereauSectionSequenceNbr_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionSequenceNbr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauSectionSequenceNbr_elem" );
  }


  public final void setBordereauSectionSequenceNbr_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionSequenceNbr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauSectionSequenceNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBordereauSectionItemSequenceNbr() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauSectionItemSequenceNbr" );
  }


  public final void setBordereauSectionItemSequenceNbr( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauSectionItemSequenceNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionItemSequenceNbr getBordereauSectionItemSequenceNbr_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionItemSequenceNbr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauSectionItemSequenceNbr_elem" );
  }


  public final void setBordereauSectionItemSequenceNbr_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauSectionItemSequenceNbr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauSectionItemSequenceNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreationDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreationDate" );
  }


  public final void setCreationDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBordereauType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauType" );
  }


  public final void setBordereauType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauType getBordereauType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BordereauType_elem" );
  }


  public final void setBordereauType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BordereauType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BordereauType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommunicationChannel() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommunicationChannel" );
  }


  public final void setCommunicationChannel( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommunicationChannel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CommunicationChannel getCommunicationChannel_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CommunicationChannel) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommunicationChannel_elem" );
  }


  public final void setCommunicationChannel_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CommunicationChannel value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommunicationChannel_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredBordereauType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredBordereauType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredBordereauType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}