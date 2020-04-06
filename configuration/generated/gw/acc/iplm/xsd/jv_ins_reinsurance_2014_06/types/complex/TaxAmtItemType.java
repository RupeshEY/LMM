/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TaxAmtItemType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxAmtItemType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_GeographicalOrigin = new javax.xml.namespace.QName( "", "GeographicalOrigin", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxAmtItemType" );
    }
  };

  public TaxAmtItemType() {
    super( 696649795, TYPE.get() );
  }

  private TaxAmtItemType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 696649795, state );
  }

  protected TaxAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TaxAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxAmtItemType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxAmtItemType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmt() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Amt" );
  }


  public final void setAmt( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt getAmt_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt) TYPE.get().getPropertyValue( this, "_Amt_elem" );
  }


  public final void setAmt_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt value ) {
    TYPE.get().setPropertyValue( this, "_Amt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxAmtItemType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxAmtItemType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGeographicalOrigin() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GeographicalOrigin" );
  }


  public final void setGeographicalOrigin( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GeographicalOrigin", value );
  }

}