/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRq extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rq/1", "RetrieveClaimRq", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reinsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Reinsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Insurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Insurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProvider = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProvider", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredObjects = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rq/1", "ReferredObjects", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Sender = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Receiver = new javax.xml.namespace.QName( "", "Receiver", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq" );
    }
  };

  public RetrieveClaimRq() {
    super( -1120192798, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq() );
  }

  public RetrieveClaimRq( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq typeInstance ) {
    super( -1120192798, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRq( gw.internal.xml.XmlElementState state ) {
    super( -1120192798, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.types.complex.RetrieveClaimRq typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq.class );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UUId_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference getReinsurerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReinsurerReference_elem" );
  }


  public final void setReinsurerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference value ) {
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference getInsurerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerReference_elem" );
  }


  public final void setInsurerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerReference_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer getReinsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Reinsurer" );
  }


  public final void setReinsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Reinsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer getInsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Insurer" );
  }


  public final void setInsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Insurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider getServiceProvider() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceProvider" );
  }


  public final void setServiceProvider( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceProvider", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects getReferredObjects() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredObjects" );
  }


  public final void setReferredObjects( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredObjects", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSender() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Sender" );
  }


  public final void setSender( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Sender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReceiver() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Receiver" );
  }


  public final void setReceiver( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Receiver", value );
  }
}
