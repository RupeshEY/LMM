/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SignoffRs extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustId = new javax.xml.namespace.QName( "", "CustId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.SignoffRs" );
    }
  };

  public SignoffRs() {
    super( 239439119, TYPE.get() );
  }

  private SignoffRs( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 239439119, state );
  }

  protected SignoffRs( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SignoffRs( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.SignoffRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.SignoffRs get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.Status getStatus() {
    return (xsd.iso.resp.Status) TYPE.get().getPropertyValue( this, "_Status" );
  }


  public final void setStatus( xsd.iso.resp.Status value ) {
    TYPE.get().setPropertyValue( this, "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.CustId getCustId() {
    return (xsd.iso.resp.CustId) TYPE.get().getPropertyValue( this, "_CustId" );
  }


  public final void setCustId( xsd.iso.resp.CustId value ) {
    TYPE.get().setPropertyValue( this, "_CustId", value );
  }

}
