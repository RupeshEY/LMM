/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_Update_ComIso_OriginalFields extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_OriginalFields", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_KeyFields = new javax.xml.namespace.QName( "", "com.iso_KeyFields", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlName = new javax.xml.namespace.QName( "", "CommlName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonName = new javax.xml.namespace.QName( "", "PersonName", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields" );
    }
  };

  public ComIso_Update_ComIso_OriginalFields() {
    super( -1120638734, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields() );
  }

  public ComIso_Update_ComIso_OriginalFields( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields typeInstance ) {
    super( -1120638734, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_Update_ComIso_OriginalFields( gw.internal.xml.XmlElementState state ) {
    super( -1120638734, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields getComIso_KeyFields() {
    return (xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_KeyFields" );
  }


  public final void setComIso_KeyFields( xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_KeyFields", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.CommlName getCommlName() {
    return (xsd.iso.req.CommlName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlName" );
  }


  public final void setCommlName( xsd.iso.req.CommlName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PersonName getPersonName() {
    return (xsd.iso.req.PersonName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersonName" );
  }


  public final void setPersonName( xsd.iso.req.PersonName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersonName", value );
  }
}