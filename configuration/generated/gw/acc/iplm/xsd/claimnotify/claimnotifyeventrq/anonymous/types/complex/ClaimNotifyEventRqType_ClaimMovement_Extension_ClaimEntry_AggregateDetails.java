/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DescriptionLineNo = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "DescriptionLineNo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails() {
    super( -1609602676, TYPE.get() );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1609602676, state );
  }

  protected ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getDescriptionLineNo() {
    return (java.math.BigInteger) TYPE.get().getPropertyValue( this, "_DescriptionLineNo" );
  }


  public final void setDescriptionLineNo( java.math.BigInteger value ) {
    TYPE.get().setPropertyValue( this, "_DescriptionLineNo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails_DescriptionLineNo getDescriptionLineNo_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails_DescriptionLineNo) TYPE.get().getPropertyValue( this, "_DescriptionLineNo_elem" );
  }


  public final void setDescriptionLineNo_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_AggregateDetails_DescriptionLineNo value ) {
    TYPE.get().setPropertyValue( this, "_DescriptionLineNo_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }

}
