/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ProblemActionType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "ProblemActionType", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2005/08/addressing", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Action = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "Action", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SoapAction = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "SoapAction", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ProblemActionType" );
    }
  };

  public ProblemActionType() {
    super( -68710122, TYPE.get() );
  }

  private ProblemActionType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -68710122, state );
  }

  protected ProblemActionType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ProblemActionType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ProblemActionType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ProblemActionType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAction() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Action" );
  }


  public final void setAction( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Action", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Action getAction_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Action) TYPE.get().getPropertyValue( this, "_Action_elem" );
  }


  public final void setAction_elem( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Action value ) {
    TYPE.get().setPropertyValue( this, "_Action_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSoapAction() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SoapAction" );
  }


  public final void setSoapAction( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SoapAction", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.ProblemActionType_SoapAction getSoapAction_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.ProblemActionType_SoapAction) TYPE.get().getPropertyValue( this, "_SoapAction_elem" );
  }


  public final void setSoapAction_elem( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.ProblemActionType_SoapAction value ) {
    TYPE.get().setPropertyValue( this, "_SoapAction_elem", value );
  }

}
