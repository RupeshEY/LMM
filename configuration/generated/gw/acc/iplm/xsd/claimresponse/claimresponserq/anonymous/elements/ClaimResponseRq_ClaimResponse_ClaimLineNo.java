/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimResponseRq_ClaimResponse_ClaimLineNo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "ClaimLineNo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimResponse/rq/1", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_ClaimLineNo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo" );
    }
  };

  public ClaimResponseRq_ClaimResponse_ClaimLineNo() {
    super( 1623985785, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo() );
  }

  public ClaimResponseRq_ClaimResponse_ClaimLineNo( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo typeInstance ) {
    super( 1623985785, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimResponseRq_ClaimResponse_ClaimLineNo( gw.internal.xml.XmlElementState state ) {
    super( 1623985785, state );
  }

  public ClaimResponseRq_ClaimResponse_ClaimLineNo( java.math.BigInteger value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_ClaimLineNo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.simple.ClaimResponseRq_ClaimResponse_ClaimLineNo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getValue() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger get$Value() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
