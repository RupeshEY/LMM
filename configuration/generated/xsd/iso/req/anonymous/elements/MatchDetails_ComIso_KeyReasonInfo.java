/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MatchDetails_ComIso_KeyReasonInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_KeyReasonInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_KeyReasonCd = new javax.xml.namespace.QName( "", "com.iso_KeyReasonCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsParty2Ref = new javax.xml.namespace.QName( "", "ClaimsParty2Ref", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo" );
    }
  };

  public MatchDetails_ComIso_KeyReasonInfo() {
    super( 2008870336, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo() );
  }

  public MatchDetails_ComIso_KeyReasonInfo( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo typeInstance ) {
    super( 2008870336, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MatchDetails_ComIso_KeyReasonInfo( gw.internal.xml.XmlElementState state ) {
    super( 2008870336, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_KeyReasonInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo_ComIso_KeyReasonCd> getComIso_KeyReasonCd() {
    return (java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo_ComIso_KeyReasonCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_KeyReasonCd" );
  }


  public final void setComIso_KeyReasonCd( java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo_ComIso_KeyReasonCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_KeyReasonCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClaimsPartyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsPartyRef" );
  }


  public final void setClaimsPartyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsPartyRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClaimsParty2Ref() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsParty2Ref" );
  }


  public final void setClaimsParty2Ref( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsParty2Ref", value );
  }
}
