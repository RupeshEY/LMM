/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCCOVERAGE.class)
public class CommlCoverage_Type extends xsd.acord.types.complex.PCCOVERAGE {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlCoverage_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverageSupplement = new javax.xml.namespace.QName( "", "CommlCoverageSupplement", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IterationNumber = new javax.xml.namespace.QName( "", "IterationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageDesc = new javax.xml.namespace.QName( "", "CoverageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Deductible = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Option = new javax.xml.namespace.QName( "", "Option", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeAmt = new javax.xml.namespace.QName( "", "NetChangeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodZoneCd = new javax.xml.namespace.QName( "", "FloodZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CategoryCd = new javax.xml.namespace.QName( "", "CategoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremAmt = new javax.xml.namespace.QName( "", "MinPremAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProRateFactor = new javax.xml.namespace.QName( "", "ProRateFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingClassificationCd = new javax.xml.namespace.QName( "", "RatingClassificationCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlCoverage_Type" );
    }
  };

  public CommlCoverage_Type() {
    super( -815699368, TYPE.get() );
  }

  private CommlCoverage_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -815699368, state );
  }

  protected CommlCoverage_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlCoverage_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CommlCoverage_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CommlCoverage_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverageSupplement> getCommlCoverageSupplement() {
    return (java.util.List<xsd.acord.CommlCoverageSupplement>) TYPE.get().getPropertyValue( this, "_CommlCoverageSupplement" );
  }


  public final void setCommlCoverageSupplement( java.util.List<xsd.acord.CommlCoverageSupplement> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverageSupplement", value );
  }


}