/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PlacingEntryType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "PlacingEntryType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchangeReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "PlacingExchangeReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.PlacingEntryType" );
    }
  };

  public PlacingEntryType() {
    super( 1998309192, TYPE.get() );
  }

  private PlacingEntryType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1998309192, state );
  }

  protected PlacingEntryType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PlacingEntryType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.PlacingEntryType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.PlacingEntryType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCedentReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CedentReference" );
  }


  public final void setCedentReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CedentReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CedentReference getCedentReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CedentReference) TYPE.get().getPropertyValue( this, "_CedentReference_elem" );
  }


  public final void setCedentReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CedentReference value ) {
    TYPE.get().setPropertyValue( this, "_CedentReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrokerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BrokerReference" );
  }


  public final void setBrokerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BrokerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.BrokerReference getBrokerReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.BrokerReference) TYPE.get().getPropertyValue( this, "_BrokerReference_elem" );
  }


  public final void setBrokerReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.BrokerReference value ) {
    TYPE.get().setPropertyValue( this, "_BrokerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReinsurerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReinsurerReference" );
  }


  public final void setReinsurerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReinsurerReference getReinsurerReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReinsurerReference) TYPE.get().getPropertyValue( this, "_ReinsurerReference_elem" );
  }


  public final void setReinsurerReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReinsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerReference" );
  }


  public final void setInsurerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.InsurerReference getInsurerReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.InsurerReference) TYPE.get().getPropertyValue( this, "_InsurerReference_elem" );
  }


  public final void setInsurerReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.InsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_InsurerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlacingExchangeReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlacingExchangeReference" );
  }


  public final void setPlacingExchangeReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchangeReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.PlacingExchangeReference getPlacingExchangeReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.PlacingExchangeReference) TYPE.get().getPropertyValue( this, "_PlacingExchangeReference_elem" );
  }


  public final void setPlacingExchangeReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.PlacingExchangeReference value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchangeReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.PlacingEntryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.PlacingEntryType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.PlacingEntryType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
