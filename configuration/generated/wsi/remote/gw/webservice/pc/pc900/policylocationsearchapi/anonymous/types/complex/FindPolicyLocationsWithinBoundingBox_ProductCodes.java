/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FindPolicyLocationsWithinBoundingBox_ProductCodes extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/PolicyLocationSearchAPI", "Entry", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationsWithinBoundingBox_ProductCodes" );
    }
  };

  public FindPolicyLocationsWithinBoundingBox_ProductCodes() {
    super( -1644562839, TYPE.get() );
  }

  private FindPolicyLocationsWithinBoundingBox_ProductCodes( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1644562839, state );
  }

  protected FindPolicyLocationsWithinBoundingBox_ProductCodes( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FindPolicyLocationsWithinBoundingBox_ProductCodes( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationsWithinBoundingBox_ProductCodes> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationsWithinBoundingBox_ProductCodes get$TypeInstance() {
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
  public final java.util.List<wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements.FindPolicyLocationsWithinBoundingBox_ProductCodes_Entry> getEntry_elem() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements.FindPolicyLocationsWithinBoundingBox_ProductCodes_Entry>) TYPE.get().getPropertyValue( this, "_Entry_elem" );
  }


  public final void setEntry_elem( java.util.List<wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements.FindPolicyLocationsWithinBoundingBox_ProductCodes_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry_elem", value );
  }


}
