/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.resp.types.complex.PCCOVERAGE.class)
public class CommlVehInfo_CommlCoverage extends xsd.iso.resp.types.complex.PCCOVERAGE {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverageSupplement = new javax.xml.namespace.QName( "", "CommlCoverageSupplement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IterationNumber = new javax.xml.namespace.QName( "", "IterationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageDesc = new javax.xml.namespace.QName( "", "CoverageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Deductible = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Option = new javax.xml.namespace.QName( "", "Option", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.CommlVehInfo_CommlCoverage" );
    }
  };

  public CommlVehInfo_CommlCoverage() {
    super( 990816852, TYPE.get() );
  }

  private CommlVehInfo_CommlCoverage( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 990816852, state );
  }

  protected CommlVehInfo_CommlCoverage( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlVehInfo_CommlCoverage( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.CommlVehInfo_CommlCoverage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.CommlVehInfo_CommlCoverage get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.CommlCoverageSupplement getCommlCoverageSupplement() {
    return (xsd.iso.resp.CommlCoverageSupplement) TYPE.get().getPropertyValue( this, "_CommlCoverageSupplement" );
  }


  public final void setCommlCoverageSupplement( xsd.iso.resp.CommlCoverageSupplement value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverageSupplement", value );
  }

}