/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class UnderwritingRuleInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "UnderwritingRuleInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnderwritingDecisionCd = new javax.xml.namespace.QName( "", "UnderwritingDecisionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnderwritingRuleCd = new javax.xml.namespace.QName( "", "UnderwritingRuleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnderwritingScoreNumber = new javax.xml.namespace.QName( "", "UnderwritingScoreNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.UnderwritingRuleInfo_Type" );
    }
  };

  public UnderwritingRuleInfo_Type() {
    super( -1589998556, TYPE.get() );
  }

  private UnderwritingRuleInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1589998556, state );
  }

  protected UnderwritingRuleInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected UnderwritingRuleInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.UnderwritingRuleInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.UnderwritingRuleInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.UnderwritingDecision getUnderwritingDecisionCd() {
    return (xsd.acord.enums.UnderwritingDecision) TYPE.get().getPropertyValue( this, "_UnderwritingDecisionCd" );
  }


  public final void setUnderwritingDecisionCd( xsd.acord.enums.UnderwritingDecision value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingDecisionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnderwritingDecisionCd getUnderwritingDecisionCd_elem() {
    return (xsd.acord.UnderwritingDecisionCd) TYPE.get().getPropertyValue( this, "_UnderwritingDecisionCd_elem" );
  }


  public final void setUnderwritingDecisionCd_elem( xsd.acord.UnderwritingDecisionCd value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingDecisionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUnderwritingRuleCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UnderwritingRuleCd" );
  }


  public final void setUnderwritingRuleCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingRuleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnderwritingRuleCd getUnderwritingRuleCd_elem() {
    return (xsd.acord.UnderwritingRuleCd) TYPE.get().getPropertyValue( this, "_UnderwritingRuleCd_elem" );
  }


  public final void setUnderwritingRuleCd_elem( xsd.acord.UnderwritingRuleCd value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingRuleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getUnderwritingScoreNumber() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_UnderwritingScoreNumber" );
  }


  public final void setUnderwritingScoreNumber( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingScoreNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnderwritingScoreNumber getUnderwritingScoreNumber_elem() {
    return (xsd.acord.UnderwritingScoreNumber) TYPE.get().getPropertyValue( this, "_UnderwritingScoreNumber_elem" );
  }


  public final void setUnderwritingScoreNumber_elem( xsd.acord.UnderwritingScoreNumber value ) {
    TYPE.get().setPropertyValue( this, "_UnderwritingScoreNumber_elem", value );
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
