/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MatchDetails_ComIso_SumReasonInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_SumReasonInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SumIdentifier = new javax.xml.namespace.QName( "", "com.iso_SumIdentifier", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalLossType = new javax.xml.namespace.QName( "", "com.iso_TotalLossType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalSIUInvolvement = new javax.xml.namespace.QName( "", "com.iso_TotalSIUInvolvement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalName = new javax.xml.namespace.QName( "", "com.iso_TotalName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalAddress = new javax.xml.namespace.QName( "", "com.iso_TotalAddress", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalSSN = new javax.xml.namespace.QName( "", "com.iso_TotalSSN", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalPhone = new javax.xml.namespace.QName( "", "com.iso_TotalPhone", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalDriversLic = new javax.xml.namespace.QName( "", "com.iso_TotalDriversLic", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalVIN = new javax.xml.namespace.QName( "", "com.iso_TotalVIN", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TotalLicPlate = new javax.xml.namespace.QName( "", "com.iso_TotalLicPlate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SumReasonCd = new javax.xml.namespace.QName( "", "com.iso_SumReasonCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsParty2Ref = new javax.xml.namespace.QName( "", "ClaimsParty2Ref", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo" );
    }
  };

  public MatchDetails_ComIso_SumReasonInfo() {
    super( 432484318, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo() );
  }

  public MatchDetails_ComIso_SumReasonInfo( xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo typeInstance ) {
    super( 432484318, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MatchDetails_ComIso_SumReasonInfo( gw.internal.xml.XmlElementState state ) {
    super( 432484318, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.MatchDetails_ComIso_SumReasonInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumIdentifier> getComIso_SumIdentifier() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumIdentifier>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_SumIdentifier" );
  }


  public final void setComIso_SumIdentifier( java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumIdentifier> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_SumIdentifier", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLossType getComIso_TotalLossType() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLossType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalLossType" );
  }


  public final void setComIso_TotalLossType( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLossType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalLossType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSIUInvolvement getComIso_TotalSIUInvolvement() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSIUInvolvement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalSIUInvolvement" );
  }


  public final void setComIso_TotalSIUInvolvement( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSIUInvolvement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalSIUInvolvement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalName getComIso_TotalName() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalName" );
  }


  public final void setComIso_TotalName( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalAddress getComIso_TotalAddress() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalAddress) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalAddress" );
  }


  public final void setComIso_TotalAddress( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalAddress value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalAddress", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSSN getComIso_TotalSSN() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSSN) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalSSN" );
  }


  public final void setComIso_TotalSSN( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalSSN value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalSSN", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalPhone getComIso_TotalPhone() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalPhone) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalPhone" );
  }


  public final void setComIso_TotalPhone( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalPhone value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalPhone", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalDriversLic getComIso_TotalDriversLic() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalDriversLic) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalDriversLic" );
  }


  public final void setComIso_TotalDriversLic( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalDriversLic value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalDriversLic", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalVIN getComIso_TotalVIN() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalVIN) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalVIN" );
  }


  public final void setComIso_TotalVIN( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalVIN value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalVIN", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLicPlate getComIso_TotalLicPlate() {
    return (xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLicPlate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TotalLicPlate" );
  }


  public final void setComIso_TotalLicPlate( xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_TotalLicPlate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TotalLicPlate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumReasonCd> getComIso_SumReasonCd() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumReasonCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_SumReasonCd" );
  }


  public final void setComIso_SumReasonCd( java.util.List<xsd.iso.resp.anonymous.elements.MatchDetails_ComIso_SumReasonInfo_ComIso_SumReasonCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_SumReasonCd", value );
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
