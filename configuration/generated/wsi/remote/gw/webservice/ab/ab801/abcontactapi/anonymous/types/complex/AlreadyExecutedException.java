/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AlreadyExecutedException extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.AlreadyExecutedException" );
    }
  };

  public AlreadyExecutedException() {
    super( -513764094, TYPE.get() );
  }

  private AlreadyExecutedException( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -513764094, state );
  }

  protected AlreadyExecutedException( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AlreadyExecutedException( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.AlreadyExecutedException> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.AlreadyExecutedException get$TypeInstance() {
    return this;
  }


}
