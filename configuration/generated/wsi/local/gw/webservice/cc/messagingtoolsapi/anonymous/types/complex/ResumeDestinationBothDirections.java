/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ResumeDestinationBothDirections extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DestID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "destID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.ResumeDestinationBothDirections" );
    }
  };

  public ResumeDestinationBothDirections() {
    super( -1351077860, TYPE.get() );
  }

  private ResumeDestinationBothDirections( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1351077860, state );
  }

  protected ResumeDestinationBothDirections( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ResumeDestinationBothDirections( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.ResumeDestinationBothDirections> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.ResumeDestinationBothDirections get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDestID() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_DestID" );
  }


  public final void setDestID( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_DestID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.ResumeDestinationBothDirections_DestID getDestID_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.ResumeDestinationBothDirections_DestID) TYPE.get().getPropertyValue( this, "_DestID_elem" );
  }


  public final void setDestID_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.ResumeDestinationBothDirections_DestID value ) {
    TYPE.get().setPropertyValue( this, "_DestID_elem", value );
  }

}