/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetClusterState extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetClusterState" );
    }
  };

  public GetClusterState() {
    super( 309886832, TYPE.get() );
  }

  private GetClusterState( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 309886832, state );
  }

  protected GetClusterState( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetClusterState( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetClusterState> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetClusterState get$TypeInstance() {
    return this;
  }


}