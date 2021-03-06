/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Jv_Ins_ReinsuranceType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Jv-Ins-ReinsuranceType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Placing = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Placing", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TechAccount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TechAccount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Settlement = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Settlement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimMovement = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClaimMovement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Bordereau = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Bordereau", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Acknowledgement = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Acknowledgement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Codes = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Codes", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegulatoryReporting = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RegulatoryReporting", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Version = new javax.xml.namespace.QName( "", "Version", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Jv_Ins_ReinsuranceType" );
    }
  };

  public Jv_Ins_ReinsuranceType() {
    super( 1434313974, TYPE.get() );
  }

  private Jv_Ins_ReinsuranceType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1434313974, state );
  }

  protected Jv_Ins_ReinsuranceType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Jv_Ins_ReinsuranceType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Jv_Ins_ReinsuranceType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Jv_Ins_ReinsuranceType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Placing getPlacing() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Placing) TYPE.get().getPropertyValue( this, "_Placing" );
  }


  public final void setPlacing( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Placing value ) {
    TYPE.get().setPropertyValue( this, "_Placing", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccount getTechAccount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccount) TYPE.get().getPropertyValue( this, "_TechAccount" );
  }


  public final void setTechAccount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccount value ) {
    TYPE.get().setPropertyValue( this, "_TechAccount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Settlement getSettlement() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Settlement) TYPE.get().getPropertyValue( this, "_Settlement" );
  }


  public final void setSettlement( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Settlement value ) {
    TYPE.get().setPropertyValue( this, "_Settlement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovement getClaimMovement() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovement) TYPE.get().getPropertyValue( this, "_ClaimMovement" );
  }


  public final void setClaimMovement( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovement value ) {
    TYPE.get().setPropertyValue( this, "_ClaimMovement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Bordereau getBordereau() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Bordereau) TYPE.get().getPropertyValue( this, "_Bordereau" );
  }


  public final void setBordereau( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Bordereau value ) {
    TYPE.get().setPropertyValue( this, "_Bordereau", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Acknowledgement getAcknowledgement() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Acknowledgement) TYPE.get().getPropertyValue( this, "_Acknowledgement" );
  }


  public final void setAcknowledgement( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Acknowledgement value ) {
    TYPE.get().setPropertyValue( this, "_Acknowledgement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Codes getCodes() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Codes) TYPE.get().getPropertyValue( this, "_Codes" );
  }


  public final void setCodes( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Codes value ) {
    TYPE.get().setPropertyValue( this, "_Codes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryReporting getRegulatoryReporting() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryReporting) TYPE.get().getPropertyValue( this, "_RegulatoryReporting" );
  }


  public final void setRegulatoryReporting( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryReporting value ) {
    TYPE.get().setPropertyValue( this, "_RegulatoryReporting", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.Jv_Ins_ReinsuranceType_Version getVersion() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.Jv_Ins_ReinsuranceType_Version) TYPE.get().getPropertyValue( this, "_Version" );
  }


  public final void setVersion( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.Jv_Ins_ReinsuranceType_Version value ) {
    TYPE.get().setPropertyValue( this, "_Version", value );
  }

}
