/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.zoneimportapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClearStagingTables extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountryCode = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ZoneImportAPI", "countryCode", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.zoneimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.zoneimportapi.anonymous.types.complex.ClearStagingTables" );
    }
  };

  public ClearStagingTables() {
    super( -823699805, TYPE.get() );
  }

  private ClearStagingTables( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -823699805, state );
  }

  protected ClearStagingTables( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClearStagingTables( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.zoneimportapi.anonymous.types.complex.ClearStagingTables> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.zoneimportapi.anonymous.types.complex.ClearStagingTables get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountryCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CountryCode" );
  }


  public final void setCountryCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CountryCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements.ClearStagingTables_CountryCode getCountryCode_elem() {
    return (wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements.ClearStagingTables_CountryCode) TYPE.get().getPropertyValue( this, "_CountryCode_elem" );
  }


  public final void setCountryCode_elem( wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements.ClearStagingTables_CountryCode value ) {
    TYPE.get().setPropertyValue( this, "_CountryCode_elem", value );
  }

}
