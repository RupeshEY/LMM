/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rs/1", "ErrorCode", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimResponse/rs/1", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponsers.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponsers.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode" );
    }
  };

  public ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode() {
    super( 1624418245, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode() );
  }

  public ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode( gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode typeInstance ) {
    super( 1624418245, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode( gw.internal.xml.XmlElementState state ) {
    super( 1624418245, state );
  }

  public ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode( java.lang.String value ) {
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
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.simple.ClaimResponseRs_ErrorsAndWarnings_Result_ErrorCode typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
