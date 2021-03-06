/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PollutionLiabilityInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PollutionLiabilityInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonTaxIdentity = new javax.xml.namespace.QName( "", "NonTaxIdentity", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnderlyingGeneralLiabilityCd = new javax.xml.namespace.QName( "", "UnderlyingGeneralLiabilityCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PollutionLiabilityInfo_Type" );
    }
  };

  public PollutionLiabilityInfo_Type() {
    super( -1934520863, TYPE.get() );
  }

  private PollutionLiabilityInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1934520863, state );
  }

  protected PollutionLiabilityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PollutionLiabilityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PollutionLiabilityInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PollutionLiabilityInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonTaxIdentity getNonTaxIdentity() {
    return (xsd.acord.NonTaxIdentity) TYPE.get().getPropertyValue( this, "_NonTaxIdentity" );
  }


  public final void setNonTaxIdentity( xsd.acord.NonTaxIdentity value ) {
    TYPE.get().setPropertyValue( this, "_NonTaxIdentity", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.UnderlyingGeneralLiability getUnderlyingGeneralLiabilityCd() {
    return (xsd.acord.enums.UnderlyingGeneralLiability) TYPE.get().getPropertyValue( this, "_UnderlyingGeneralLiabilityCd" );
  }


  public final void setUnderlyingGeneralLiabilityCd( xsd.acord.enums.UnderlyingGeneralLiability value ) {
    TYPE.get().setPropertyValue( this, "_UnderlyingGeneralLiabilityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnderlyingGeneralLiabilityCd getUnderlyingGeneralLiabilityCd_elem() {
    return (xsd.acord.UnderlyingGeneralLiabilityCd) TYPE.get().getPropertyValue( this, "_UnderlyingGeneralLiabilityCd_elem" );
  }


  public final void setUnderlyingGeneralLiabilityCd_elem( xsd.acord.UnderlyingGeneralLiabilityCd value ) {
    TYPE.get().setPropertyValue( this, "_UnderlyingGeneralLiabilityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_OtherOrPriorPolicyRef", value );
  }

}
