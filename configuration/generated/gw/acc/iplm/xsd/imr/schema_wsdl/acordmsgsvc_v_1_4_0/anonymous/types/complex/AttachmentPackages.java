/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AttachmentPackages extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentPackage = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "AttachmentPackage", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.anonymous.types.complex.AttachmentPackages" );
    }
  };

  public AttachmentPackages() {
    super( 1647398449, TYPE.get() );
  }

  private AttachmentPackages( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1647398449, state );
  }

  protected AttachmentPackages( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AttachmentPackages( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.anonymous.types.complex.AttachmentPackages> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.anonymous.types.complex.AttachmentPackages get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage> getAttachmentPackage() {
    return (java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage>) TYPE.get().getPropertyValue( this, "_AttachmentPackage" );
  }


  public final void setAttachmentPackage( java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage> value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentPackage", value );
  }


}