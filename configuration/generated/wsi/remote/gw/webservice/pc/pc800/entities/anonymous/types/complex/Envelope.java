/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Envelope extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCAddress = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCAddress", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCBuilding = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCBuilding", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCClassCode = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCClassCode", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCContact = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCContact", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCPolicyLocation = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPolicyLocation", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCPropertyOwner = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPropertyOwner", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CCPolicy = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPolicy", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.anonymous.types.complex.Envelope" );
    }
  };

  public Envelope() {
    super( 275115683, TYPE.get() );
  }

  private Envelope( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 275115683, state );
  }

  protected Envelope( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Envelope( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.anonymous.types.complex.Envelope> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.entities.anonymous.types.complex.Envelope get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCAddress> getCCAddress() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCAddress>) TYPE.get().getPropertyValue( this, "_CCAddress" );
  }


  public final void setCCAddress( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCAddress> value ) {
    TYPE.get().setPropertyValue( this, "_CCAddress", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCBuilding> getCCBuilding() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCBuilding>) TYPE.get().getPropertyValue( this, "_CCBuilding" );
  }


  public final void setCCBuilding( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCBuilding> value ) {
    TYPE.get().setPropertyValue( this, "_CCBuilding", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCClassCode> getCCClassCode() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCClassCode>) TYPE.get().getPropertyValue( this, "_CCClassCode" );
  }


  public final void setCCClassCode( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCClassCode> value ) {
    TYPE.get().setPropertyValue( this, "_CCClassCode", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCContact> getCCContact() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCContact>) TYPE.get().getPropertyValue( this, "_CCContact" );
  }


  public final void setCCContact( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCContact> value ) {
    TYPE.get().setPropertyValue( this, "_CCContact", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicyLocation> getCCPolicyLocation() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicyLocation>) TYPE.get().getPropertyValue( this, "_CCPolicyLocation" );
  }


  public final void setCCPolicyLocation( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicyLocation> value ) {
    TYPE.get().setPropertyValue( this, "_CCPolicyLocation", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPropertyOwner> getCCPropertyOwner() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPropertyOwner>) TYPE.get().getPropertyValue( this, "_CCPropertyOwner" );
  }


  public final void setCCPropertyOwner( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPropertyOwner> value ) {
    TYPE.get().setPropertyValue( this, "_CCPropertyOwner", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicy getCCPolicy() {
    return (wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicy) TYPE.get().getPropertyValue( this, "_CCPolicy" );
  }


  public final void setCCPolicy( wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Envelope_CCPolicy value ) {
    TYPE.get().setPropertyValue( this, "_CCPolicy", value );
  }

}
