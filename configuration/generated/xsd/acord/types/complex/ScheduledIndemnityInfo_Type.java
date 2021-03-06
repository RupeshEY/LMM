/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ScheduledIndemnityInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ScheduledIndemnityInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BodyPartCd = new javax.xml.namespace.QName( "", "BodyPartCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImpairmentPct = new javax.xml.namespace.QName( "", "ImpairmentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WeeklyIndemnityAmt = new javax.xml.namespace.QName( "", "WeeklyIndemnityAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeIndemnityPay = new javax.xml.namespace.QName( "", "LengthTimeIndemnityPay", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDt = new javax.xml.namespace.QName( "", "AsOfDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndemnityIncurredLossAmt = new javax.xml.namespace.QName( "", "IndemnityIncurredLossAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumWeeks = new javax.xml.namespace.QName( "", "NumWeeks", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ScheduledIndemnityInfo_Type" );
    }
  };

  public ScheduledIndemnityInfo_Type() {
    super( 873772714, TYPE.get() );
  }

  private ScheduledIndemnityInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 873772714, state );
  }

  protected ScheduledIndemnityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ScheduledIndemnityInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ScheduledIndemnityInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ScheduledIndemnityInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBodyPartCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BodyPartCd" );
  }


  public final void setBodyPartCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BodyPartCd getBodyPartCd_elem() {
    return (xsd.acord.BodyPartCd) TYPE.get().getPropertyValue( this, "_BodyPartCd_elem" );
  }


  public final void setBodyPartCd_elem( xsd.acord.BodyPartCd value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getImpairmentPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_ImpairmentPct" );
  }


  public final void setImpairmentPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_ImpairmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ImpairmentPct getImpairmentPct_elem() {
    return (xsd.acord.ImpairmentPct) TYPE.get().getPropertyValue( this, "_ImpairmentPct_elem" );
  }


  public final void setImpairmentPct_elem( xsd.acord.ImpairmentPct value ) {
    TYPE.get().setPropertyValue( this, "_ImpairmentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WeeklyIndemnityAmt getWeeklyIndemnityAmt() {
    return (xsd.acord.WeeklyIndemnityAmt) TYPE.get().getPropertyValue( this, "_WeeklyIndemnityAmt" );
  }


  public final void setWeeklyIndemnityAmt( xsd.acord.WeeklyIndemnityAmt value ) {
    TYPE.get().setPropertyValue( this, "_WeeklyIndemnityAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeIndemnityPay getLengthTimeIndemnityPay() {
    return (xsd.acord.LengthTimeIndemnityPay) TYPE.get().getPropertyValue( this, "_LengthTimeIndemnityPay" );
  }


  public final void setLengthTimeIndemnityPay( xsd.acord.LengthTimeIndemnityPay value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeIndemnityPay", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDt" );
  }


  public final void setAsOfDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AsOfDt getAsOfDt_elem() {
    return (xsd.acord.AsOfDt) TYPE.get().getPropertyValue( this, "_AsOfDt_elem" );
  }


  public final void setAsOfDt_elem( xsd.acord.AsOfDt value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IndemnityIncurredLossAmt getIndemnityIncurredLossAmt() {
    return (xsd.acord.IndemnityIncurredLossAmt) TYPE.get().getPropertyValue( this, "_IndemnityIncurredLossAmt" );
  }


  public final void setIndemnityIncurredLossAmt( xsd.acord.IndemnityIncurredLossAmt value ) {
    TYPE.get().setPropertyValue( this, "_IndemnityIncurredLossAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumWeeks() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumWeeks" );
  }


  public final void setNumWeeks( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumWeeks", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumWeeks getNumWeeks_elem() {
    return (xsd.acord.NumWeeks) TYPE.get().getPropertyValue( this, "_NumWeeks_elem" );
  }


  public final void setNumWeeks_elem( xsd.acord.NumWeeks value ) {
    TYPE.get().setPropertyValue( this, "_NumWeeks_elem", value );
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
  public final gw.xml.XmlElement getClaimsPartyRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ClaimsPartyRef" );
  }


  public final void setClaimsPartyRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRef", value );
  }

}
