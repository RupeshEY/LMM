/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ACORD_BaseSvcRs extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseInqRs = new javax.xml.namespace.QName( "", "PendingResponseInqRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ACORD_BaseSvcRs" );
    }
  };

  public ACORD_BaseSvcRs() {
    super( -958894690, TYPE.get() );
  }

  private ACORD_BaseSvcRs( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -958894690, state );
  }

  protected ACORD_BaseSvcRs( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ACORD_BaseSvcRs( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ACORD_BaseSvcRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ACORD_BaseSvcRs get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PendingResponseInqRs getPendingResponseInqRs() {
    return (xsd.iso.req.PendingResponseInqRs) TYPE.get().getPropertyValue( this, "_PendingResponseInqRs" );
  }


  public final void setPendingResponseInqRs( xsd.iso.req.PendingResponseInqRs value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseInqRs", value );
  }

}
