/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class XchangingHeaderType_Receiver_Party extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Id = new javax.xml.namespace.QName( "http://www.xchanging.com/wsdl/ClaimService/", "Id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.wb_header_1_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver_Party" );
    }
  };

  public XchangingHeaderType_Receiver_Party() {
    super( -1390043001, TYPE.get() );
  }

  private XchangingHeaderType_Receiver_Party( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1390043001, state );
  }

  protected XchangingHeaderType_Receiver_Party( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected XchangingHeaderType_Receiver_Party( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver_Party> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.wb_header_1_0.anonymous.types.complex.XchangingHeaderType_Receiver_Party get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party_Id getId_elem() {
    return (gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party_Id) TYPE.get().getPropertyValue( this, "_Id_elem" );
  }


  public final void setId_elem( gw.acc.iplm.xsd.wb_header_1_0.anonymous.elements.XchangingHeaderType_Receiver_Party_Id value ) {
    TYPE.get().setPropertyValue( this, "_Id_elem", value );
  }

}
