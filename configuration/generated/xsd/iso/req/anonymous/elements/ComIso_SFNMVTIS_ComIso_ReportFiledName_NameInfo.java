/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NameInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlName = new javax.xml.namespace.QName( "", "CommlName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonName = new javax.xml.namespace.QName( "", "PersonName", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo" );
    }
  };

  public ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo() {
    super( -386894830, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo() );
  }

  public ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo( xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo typeInstance ) {
    super( -386894830, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo( gw.internal.xml.XmlElementState state ) {
    super( -386894830, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName getCommlName() {
    return (xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlName" );
  }


  public final void setCommlName( xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName getPersonName() {
    return (xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersonName" );
  }


  public final void setPersonName( xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersonName", value );
  }
}