/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Acknowledgement_CustomEvents extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "Entry", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.Acknowledgement_CustomEvents" );
    }
  };

  public Acknowledgement_CustomEvents() {
    super( -318469367, TYPE.get() );
  }

  private Acknowledgement_CustomEvents( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -318469367, state );
  }

  protected Acknowledgement_CustomEvents( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Acknowledgement_CustomEvents( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.Acknowledgement_CustomEvents> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.Acknowledgement_CustomEvents get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents_Entry>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }


}
