/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ExposureDTO_NewNotes extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/ExposureDTO", "Entry", "pogo11" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ExposureDTO_NewNotes" );
    }
  };

  public ExposureDTO_NewNotes() {
    super( 739578818, TYPE.get() );
  }

  private ExposureDTO_NewNotes( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 739578818, state );
  }

  protected ExposureDTO_NewNotes( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ExposureDTO_NewNotes( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ExposureDTO_NewNotes> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ExposureDTO_NewNotes get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ExposureDTO_NewNotes_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ExposureDTO_NewNotes_Entry>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ExposureDTO_NewNotes_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }


}