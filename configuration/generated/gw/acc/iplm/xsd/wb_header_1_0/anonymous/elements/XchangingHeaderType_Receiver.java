/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class XchangingHeaderType_Receiver extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/wsdl/ClaimService/", "Receiver", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/wsdl/ClaimService/", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.xchanging.com/wsdl/ClaimService/", "Party", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.wb_header_1_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.wb_header_1_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver" );
    }
  };

  public XchangingHeaderType_Receiver() {
    super( -121053554, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver() );
  }

  public XchangingHeaderType_Receiver( gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver typeInstance ) {
    super( -121053554, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private XchangingHeaderType_Receiver( gw.internal.xml.XmlElementState state ) {
    super( -121053554, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party getParty() {
    return (gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Party", value );
  }
}