/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CommlDriverInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlDriverInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HiredDt = new javax.xml.namespace.QName( "", "HiredDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurchargeFactor = new javax.xml.namespace.QName( "", "SurchargeFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlExperience = new javax.xml.namespace.QName( "", "CommlExperience", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriveOtherCarInd = new javax.xml.namespace.QName( "", "DriveOtherCarInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BroadenedPIPAppliesInd = new javax.xml.namespace.QName( "", "BroadenedPIPAppliesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludedInd = new javax.xml.namespace.QName( "", "ExcludedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCd = new javax.xml.namespace.QName( "", "ClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialResponsibilityFiling = new javax.xml.namespace.QName( "", "FinancialResponsibilityFiling", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlDriverInfo_Type" );
    }
  };

  public CommlDriverInfo_Type() {
    super( 1901483594, TYPE.get() );
  }

  private CommlDriverInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1901483594, state );
  }

  protected CommlDriverInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlDriverInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CommlDriverInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CommlDriverInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHiredDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HiredDt" );
  }


  public final void setHiredDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HiredDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HiredDt getHiredDt_elem() {
    return (xsd.acord.HiredDt) TYPE.get().getPropertyValue( this, "_HiredDt_elem" );
  }


  public final void setHiredDt_elem( xsd.acord.HiredDt value ) {
    TYPE.get().setPropertyValue( this, "_HiredDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getSurchargeFactor() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_SurchargeFactor" );
  }


  public final void setSurchargeFactor( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_SurchargeFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SurchargeFactor getSurchargeFactor_elem() {
    return (xsd.acord.SurchargeFactor) TYPE.get().getPropertyValue( this, "_SurchargeFactor_elem" );
  }


  public final void setSurchargeFactor_elem( xsd.acord.SurchargeFactor value ) {
    TYPE.get().setPropertyValue( this, "_SurchargeFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlExperience getCommlExperience() {
    return (xsd.acord.CommlExperience) TYPE.get().getPropertyValue( this, "_CommlExperience" );
  }


  public final void setCommlExperience( xsd.acord.CommlExperience value ) {
    TYPE.get().setPropertyValue( this, "_CommlExperience", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDriveOtherCarInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_DriveOtherCarInd" );
  }


  public final void setDriveOtherCarInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_DriveOtherCarInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DriveOtherCarInd getDriveOtherCarInd_elem() {
    return (xsd.acord.DriveOtherCarInd) TYPE.get().getPropertyValue( this, "_DriveOtherCarInd_elem" );
  }


  public final void setDriveOtherCarInd_elem( xsd.acord.DriveOtherCarInd value ) {
    TYPE.get().setPropertyValue( this, "_DriveOtherCarInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBroadenedPIPAppliesInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_BroadenedPIPAppliesInd" );
  }


  public final void setBroadenedPIPAppliesInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_BroadenedPIPAppliesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BroadenedPIPAppliesInd getBroadenedPIPAppliesInd_elem() {
    return (xsd.acord.BroadenedPIPAppliesInd) TYPE.get().getPropertyValue( this, "_BroadenedPIPAppliesInd_elem" );
  }


  public final void setBroadenedPIPAppliesInd_elem( xsd.acord.BroadenedPIPAppliesInd value ) {
    TYPE.get().setPropertyValue( this, "_BroadenedPIPAppliesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcludedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ExcludedInd" );
  }


  public final void setExcludedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcludedInd getExcludedInd_elem() {
    return (xsd.acord.ExcludedInd) TYPE.get().getPropertyValue( this, "_ExcludedInd_elem" );
  }


  public final void setExcludedInd_elem( xsd.acord.ExcludedInd value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ClassCd" );
  }


  public final void setClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassCd getClassCd_elem() {
    return (xsd.acord.ClassCd) TYPE.get().getPropertyValue( this, "_ClassCd_elem" );
  }


  public final void setClassCd_elem( xsd.acord.ClassCd value ) {
    TYPE.get().setPropertyValue( this, "_ClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FinancialResponsibilityFiling> getFinancialResponsibilityFiling() {
    return (java.util.List<xsd.acord.FinancialResponsibilityFiling>) TYPE.get().getPropertyValue( this, "_FinancialResponsibilityFiling" );
  }


  public final void setFinancialResponsibilityFiling( java.util.List<xsd.acord.FinancialResponsibilityFiling> value ) {
    TYPE.get().setPropertyValue( this, "_FinancialResponsibilityFiling", value );
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
