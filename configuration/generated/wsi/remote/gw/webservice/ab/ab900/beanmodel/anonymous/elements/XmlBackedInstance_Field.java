/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class XmlBackedInstance_Field extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ctc/beanmodel", "field", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ctc/beanmodel", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "name", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Value = new javax.xml.namespace.QName( "", "value", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OrigValue = new javax.xml.namespace.QName( "", "origValue", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "type", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.beanmodel.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.elements.XmlBackedInstance_Field" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.beanmodel.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field" );
    }
  };

  public XmlBackedInstance_Field() {
    super( 2005778265, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field() );
  }

  public XmlBackedInstance_Field( wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field typeInstance ) {
    super( 2005778265, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private XmlBackedInstance_Field( gw.internal.xml.XmlElementState state ) {
    super( 2005778265, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.elements.XmlBackedInstance_Field> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.beanmodel.anonymous.types.complex.XmlBackedInstance_Field typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Value" );
  }


  public final void setValue( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOrigValue() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OrigValue" );
  }


  public final void setOrigValue( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OrigValue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final javax.xml.namespace.QName getType() {
    return (javax.xml.namespace.QName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( javax.xml.namespace.QName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }
}
