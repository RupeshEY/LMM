/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ACORD_SignonRs_Status_StatusDesc extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "StatusDesc", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StatusDescShort = new javax.xml.namespace.QName( "", "StatusDescShort", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StatusDescCode = new javax.xml.namespace.QName( "", "StatusDescCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StatusDescDetail = new javax.xml.namespace.QName( "", "StatusDescDetail", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc" );
    }
  };

  public ACORD_SignonRs_Status_StatusDesc() {
    super( -689304850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc() );
  }

  public ACORD_SignonRs_Status_StatusDesc( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc typeInstance ) {
    super( -689304850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ACORD_SignonRs_Status_StatusDesc( gw.internal.xml.XmlElementState state ) {
    super( -689304850, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc.class );
  }

  public final void set$TypeInstance( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_Status_StatusDesc typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatusDescShort() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescShort" );
  }


  public final void setStatusDescShort( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescShort", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescShort getStatusDescShort_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescShort) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescShort_elem" );
  }


  public final void setStatusDescShort_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescShort value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescShort_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatusDescCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescCode" );
  }


  public final void setStatusDescCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescCode getStatusDescCode_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescCode_elem" );
  }


  public final void setStatusDescCode_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatusDescDetail() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescDetail" );
  }


  public final void setStatusDescDetail( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescDetail", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescDetail getStatusDescDetail_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescDetail) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatusDescDetail_elem" );
  }


  public final void setStatusDescDetail_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status_StatusDesc_StatusDescDetail value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatusDescDetail_elem", value );
  }
}
