/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetAliasesByInternalCodeResponse_Return extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "Entry", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.typelisttoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasesByInternalCodeResponse_Return" );
    }
  };

  public GetAliasesByInternalCodeResponse_Return() {
    super( -972244527, TYPE.get() );
  }

  private GetAliasesByInternalCodeResponse_Return( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -972244527, state );
  }

  protected GetAliasesByInternalCodeResponse_Return( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetAliasesByInternalCodeResponse_Return( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasesByInternalCodeResponse_Return> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasesByInternalCodeResponse_Return get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getEntry() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasesByInternalCodeResponse_Return_Entry> getEntry_elem() {
    return (java.util.List<wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasesByInternalCodeResponse_Return_Entry>) TYPE.get().getPropertyValue( this, "_Entry_elem" );
  }


  public final void setEntry_elem( java.util.List<wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasesByInternalCodeResponse_Return_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry_elem", value );
  }


}
