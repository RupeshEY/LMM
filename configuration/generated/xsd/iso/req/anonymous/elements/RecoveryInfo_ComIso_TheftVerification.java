/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RecoveryInfo_ComIso_TheftVerification extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_TheftVerification", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_NCICDt = new javax.xml.namespace.QName( "", "com.iso_NCICDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_PoliceAgency = new javax.xml.namespace.QName( "", "com.iso_PoliceAgency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_OCA = new javax.xml.namespace.QName( "", "com.iso_OCA", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification" );
    }
  };

  public RecoveryInfo_ComIso_TheftVerification() {
    super( -835614781, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification() );
  }

  public RecoveryInfo_ComIso_TheftVerification( xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification typeInstance ) {
    super( -835614781, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RecoveryInfo_ComIso_TheftVerification( gw.internal.xml.XmlElementState state ) {
    super( -835614781, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.RecoveryInfo_ComIso_TheftVerification typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_NCICDt getComIso_NCICDt() {
    return (xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_NCICDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_NCICDt" );
  }


  public final void setComIso_NCICDt( xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_NCICDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_NCICDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_PoliceAgency() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PoliceAgency" );
  }


  public final void setComIso_PoliceAgency( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PoliceAgency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_PoliceAgency getComIso_PoliceAgency_elem() {
    return (xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_PoliceAgency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_PoliceAgency_elem" );
  }


  public final void setComIso_PoliceAgency_elem( xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_PoliceAgency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_PoliceAgency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_OCA() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_OCA" );
  }


  public final void setComIso_OCA( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_OCA", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_OCA getComIso_OCA_elem() {
    return (xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_OCA) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_OCA_elem" );
  }


  public final void setComIso_OCA_elem( xsd.iso.req.anonymous.elements.RecoveryInfo_ComIso_TheftVerification_ComIso_OCA value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_OCA_elem", value );
  }
}
