/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.beanmodel.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class XmlBackedInstance_Fk extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XmlBackedInstance = new javax.xml.namespace.QName( "http://guidewire.com/ctc/beanmodel", "xmlBackedInstance", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "name", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OrigValue = new javax.xml.namespace.QName( "", "origValue", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.beanmodel.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.beanmodel.anonymous.types.complex.XmlBackedInstance_Fk" );
    }
  };

  public XmlBackedInstance_Fk() {
    super( -784364696, TYPE.get() );
  }

  private XmlBackedInstance_Fk( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -784364696, state );
  }

  protected XmlBackedInstance_Fk( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected XmlBackedInstance_Fk( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.beanmodel.anonymous.types.complex.XmlBackedInstance_Fk> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab801.beanmodel.anonymous.types.complex.XmlBackedInstance_Fk get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance getXmlBackedInstance() {
    return (wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance) TYPE.get().getPropertyValue( this, "_XmlBackedInstance" );
  }


  public final void setXmlBackedInstance( wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance value ) {
    TYPE.get().setPropertyValue( this, "_XmlBackedInstance", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOrigValue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OrigValue" );
  }


  public final void setOrigValue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OrigValue", value );
  }

}