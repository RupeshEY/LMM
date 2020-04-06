/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCRUCoverage.class)
public class CCVehicleCoverage extends wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCRUCoverage {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCVehicleCoverage", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimAggLimit = new javax.xml.namespace.QName( "", "ClaimAggLimit", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NonmedAggLimit = new javax.xml.namespace.QName( "", "NonmedAggLimit", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PersonAggLimit = new javax.xml.namespace.QName( "", "PersonAggLimit", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ReplaceAggLimit = new javax.xml.namespace.QName( "", "ReplaceAggLimit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CovTerms = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CovTerms", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Currency = new javax.xml.namespace.QName( "", "Currency", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Deductible = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_EffectiveDate = new javax.xml.namespace.QName( "", "EffectiveDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ExpirationDate = new javax.xml.namespace.QName( "", "ExpirationDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ExposureLimit = new javax.xml.namespace.QName( "", "ExposureLimit", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_IncidentLimit = new javax.xml.namespace.QName( "", "IncidentLimit", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LimitsIndicator = new javax.xml.namespace.QName( "", "LimitsIndicator", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Notes = new javax.xml.namespace.QName( "", "Notes", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicySystemID = new javax.xml.namespace.QName( "", "PolicySystemID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_State = new javax.xml.namespace.QName( "", "State", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCVehicleCoverage" );
    }
  };

  public CCVehicleCoverage() {
    super( 1254197794, TYPE.get() );
  }

  private CCVehicleCoverage( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1254197794, state );
  }

  protected CCVehicleCoverage( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCVehicleCoverage( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCVehicleCoverage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCVehicleCoverage get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getClaimAggLimit() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_ClaimAggLimit" );
  }


  public final void setClaimAggLimit( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_ClaimAggLimit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNonmedAggLimit() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NonmedAggLimit" );
  }


  public final void setNonmedAggLimit( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NonmedAggLimit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getPersonAggLimit() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_PersonAggLimit" );
  }


  public final void setPersonAggLimit( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_PersonAggLimit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getReplaceAggLimit() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_ReplaceAggLimit" );
  }


  public final void setReplaceAggLimit( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_ReplaceAggLimit", value );
  }

}