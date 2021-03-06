/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsInjury_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsInjury_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InjuryNatureCd = new javax.xml.namespace.QName( "", "InjuryNatureCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InjuryNatureDesc = new javax.xml.namespace.QName( "", "InjuryNatureDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseCd = new javax.xml.namespace.QName( "", "LossCauseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseDesc = new javax.xml.namespace.QName( "", "LossCauseDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BodyPartCd = new javax.xml.namespace.QName( "", "BodyPartCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BodyPartDesc = new javax.xml.namespace.QName( "", "BodyPartDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImpairmentPct = new javax.xml.namespace.QName( "", "ImpairmentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InjurySeverityCd = new javax.xml.namespace.QName( "", "InjurySeverityCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClaimsInjury_Type" );
    }
  };

  public ClaimsInjury_Type() {
    super( -1000333308, TYPE.get() );
  }

  private ClaimsInjury_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1000333308, state );
  }

  protected ClaimsInjury_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsInjury_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ClaimsInjury_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ClaimsInjury_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getInjuryNatureCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_InjuryNatureCd" );
  }


  public final void setInjuryNatureCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_InjuryNatureCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InjuryNatureCd> getInjuryNatureCd_elem() {
    return (java.util.List<xsd.acord.InjuryNatureCd>) TYPE.get().getPropertyValue( this, "_InjuryNatureCd_elem" );
  }


  public final void setInjuryNatureCd_elem( java.util.List<xsd.acord.InjuryNatureCd> value ) {
    TYPE.get().setPropertyValue( this, "_InjuryNatureCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInjuryNatureDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InjuryNatureDesc" );
  }


  public final void setInjuryNatureDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InjuryNatureDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InjuryNatureDesc getInjuryNatureDesc_elem() {
    return (xsd.acord.InjuryNatureDesc) TYPE.get().getPropertyValue( this, "_InjuryNatureDesc_elem" );
  }


  public final void setInjuryNatureDesc_elem( xsd.acord.InjuryNatureDesc value ) {
    TYPE.get().setPropertyValue( this, "_InjuryNatureDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getLossCauseCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_LossCauseCd" );
  }


  public final void setLossCauseCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LossCauseCd> getLossCauseCd_elem() {
    return (java.util.List<xsd.acord.LossCauseCd>) TYPE.get().getPropertyValue( this, "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( java.util.List<xsd.acord.LossCauseCd> value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossCauseDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossCauseDesc" );
  }


  public final void setLossCauseDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossCauseDesc getLossCauseDesc_elem() {
    return (xsd.acord.LossCauseDesc) TYPE.get().getPropertyValue( this, "_LossCauseDesc_elem" );
  }


  public final void setLossCauseDesc_elem( xsd.acord.LossCauseDesc value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getBodyPartCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_BodyPartCd" );
  }


  public final void setBodyPartCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BodyPartCd> getBodyPartCd_elem() {
    return (java.util.List<xsd.acord.BodyPartCd>) TYPE.get().getPropertyValue( this, "_BodyPartCd_elem" );
  }


  public final void setBodyPartCd_elem( java.util.List<xsd.acord.BodyPartCd> value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBodyPartDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BodyPartDesc" );
  }


  public final void setBodyPartDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BodyPartDesc getBodyPartDesc_elem() {
    return (xsd.acord.BodyPartDesc) TYPE.get().getPropertyValue( this, "_BodyPartDesc_elem" );
  }


  public final void setBodyPartDesc_elem( xsd.acord.BodyPartDesc value ) {
    TYPE.get().setPropertyValue( this, "_BodyPartDesc_elem", value );
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
  public final java.util.List<java.lang.String> getInjurySeverityCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_InjurySeverityCd" );
  }


  public final void setInjurySeverityCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_InjurySeverityCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InjurySeverityCd> getInjurySeverityCd_elem() {
    return (java.util.List<xsd.acord.InjurySeverityCd>) TYPE.get().getPropertyValue( this, "_InjurySeverityCd_elem" );
  }


  public final void setInjurySeverityCd_elem( java.util.List<xsd.acord.InjurySeverityCd> value ) {
    TYPE.get().setPropertyValue( this, "_InjurySeverityCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
