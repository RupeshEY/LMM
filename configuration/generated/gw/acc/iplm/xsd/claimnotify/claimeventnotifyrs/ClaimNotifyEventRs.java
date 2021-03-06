/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rs/1", "ClaimNotifyEventRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rs/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AcknowledgementTransactionType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AcknowledgementTransactionType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reinsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Reinsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Insurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Insurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProvider = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProvider", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredMessage = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rs/1", "ReferredMessage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Response = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Response", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorsandWarnings = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rs/1", "ErrorsandWarnings", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Sender = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Receiver = new javax.xml.namespace.QName( "", "Receiver", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs" );
    }
  };

  public ClaimNotifyEventRs() {
    super( 721595891, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs() );
  }

  public ClaimNotifyEventRs( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs typeInstance ) {
    super( 721595891, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRs( gw.internal.xml.XmlElementState state ) {
    super( 721595891, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
  }

  public static gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs.class );
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
  public final java.lang.String getAcknowledgementTransactionType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementTransactionType" );
  }


  public final void setAcknowledgementTransactionType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementTransactionType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AcknowledgementTransactionType getAcknowledgementTransactionType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AcknowledgementTransactionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementTransactionType_elem" );
  }


  public final void setAcknowledgementTransactionType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AcknowledgementTransactionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementTransactionType_elem", value );
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
  public final gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage getReferredMessage() {
    return (gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredMessage" );
  }


  public final void setReferredMessage( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredMessage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response getResponse() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Response" );
  }


  public final void setResponse( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Response", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ErrorsandWarnings getErrorsandWarnings() {
    return (gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ErrorsandWarnings) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorsandWarnings" );
  }


  public final void setErrorsandWarnings( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ErrorsandWarnings value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorsandWarnings", value );
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
