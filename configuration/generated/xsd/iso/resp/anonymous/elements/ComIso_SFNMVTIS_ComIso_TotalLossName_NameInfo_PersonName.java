/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PersonName", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Surname = new javax.xml.namespace.QName( "", "Surname", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GivenName = new javax.xml.namespace.QName( "", "GivenName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherGivenName = new javax.xml.namespace.QName( "", "OtherGivenName", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName" );
    }
  };

  public ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName() {
    super( -1970692050, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName() );
  }

  public ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName( xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName typeInstance ) {
    super( -1970692050, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName( gw.internal.xml.XmlElementState state ) {
    super( -1970692050, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSurname() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Surname" );
  }


  public final void setSurname( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Surname", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_Surname getSurname_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_Surname) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Surname_elem" );
  }


  public final void setSurname_elem( xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_Surname value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Surname_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGivenName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GivenName" );
  }


  public final void setGivenName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GivenName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_GivenName getGivenName_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_GivenName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GivenName_elem" );
  }


  public final void setGivenName_elem( xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_GivenName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GivenName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherGivenName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherGivenName" );
  }


  public final void setOtherGivenName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherGivenName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_OtherGivenName getOtherGivenName_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_OtherGivenName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherGivenName_elem" );
  }


  public final void setOtherGivenName_elem( xsd.iso.resp.anonymous.elements.ComIso_SFNMVTIS_ComIso_TotalLossName_NameInfo_PersonName_OtherGivenName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherGivenName_elem", value );
  }
}