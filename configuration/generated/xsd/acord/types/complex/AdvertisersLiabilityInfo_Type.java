/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AdvertisersLiabilityInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AdvertisersLiabilityInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdMediaCd = new javax.xml.namespace.QName( "", "AdMediaCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualCostAmt = new javax.xml.namespace.QName( "", "AnnualCostAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AdvertisersLiabilityInfo_Type" );
    }
  };

  public AdvertisersLiabilityInfo_Type() {
    super( -1676277729, TYPE.get() );
  }

  private AdvertisersLiabilityInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1676277729, state );
  }

  protected AdvertisersLiabilityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AdvertisersLiabilityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AdvertisersLiabilityInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AdvertisersLiabilityInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.AdMedia getAdMediaCd() {
    return (xsd.acord.enums.AdMedia) TYPE.get().getPropertyValue( this, "_AdMediaCd" );
  }


  public final void setAdMediaCd( xsd.acord.enums.AdMedia value ) {
    TYPE.get().setPropertyValue( this, "_AdMediaCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdMediaCd getAdMediaCd_elem() {
    return (xsd.acord.AdMediaCd) TYPE.get().getPropertyValue( this, "_AdMediaCd_elem" );
  }


  public final void setAdMediaCd_elem( xsd.acord.AdMediaCd value ) {
    TYPE.get().setPropertyValue( this, "_AdMediaCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualCostAmt getAnnualCostAmt() {
    return (xsd.acord.AnnualCostAmt) TYPE.get().getPropertyValue( this, "_AnnualCostAmt" );
  }


  public final void setAnnualCostAmt( xsd.acord.AnnualCostAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualCostAmt", value );
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