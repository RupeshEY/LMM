/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_KeyFields", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields" );
    }
  };

  public ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields() {
    super( -1718813078, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields() );
  }

  public ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields typeInstance ) {
    super( -1718813078, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields( gw.internal.xml.XmlElementState state ) {
    super( -1718813078, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber getPolicyNumber_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt" );
  }


  public final void setLossDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt getLossDt_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt_elem" );
  }


  public final void setLossDt_elem( xsd.iso.req.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt_elem", value );
  }
}