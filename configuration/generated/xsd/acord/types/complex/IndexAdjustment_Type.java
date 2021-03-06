/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class IndexAdjustment_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "IndexAdjustment_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndexAdjustmentAmt = new javax.xml.namespace.QName( "", "IndexAdjustmentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndexAdjustmentFrequencyCd = new javax.xml.namespace.QName( "", "IndexAdjustmentFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndexAdjustmentDesc = new javax.xml.namespace.QName( "", "IndexAdjustmentDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.IndexAdjustment_Type" );
    }
  };

  public IndexAdjustment_Type() {
    super( -1535156223, TYPE.get() );
  }

  private IndexAdjustment_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1535156223, state );
  }

  protected IndexAdjustment_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected IndexAdjustment_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.IndexAdjustment_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.IndexAdjustment_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IndexAdjustmentAmt getIndexAdjustmentAmt() {
    return (xsd.acord.IndexAdjustmentAmt) TYPE.get().getPropertyValue( this, "_IndexAdjustmentAmt" );
  }


  public final void setIndexAdjustmentAmt( xsd.acord.IndexAdjustmentAmt value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustmentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getRate() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Rate" );
  }


  public final void setRate( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Rate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Rate getRate_elem() {
    return (xsd.acord.Rate) TYPE.get().getPropertyValue( this, "_Rate_elem" );
  }


  public final void setRate_elem( xsd.acord.Rate value ) {
    TYPE.get().setPropertyValue( this, "_Rate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getIndexAdjustmentFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_IndexAdjustmentFrequencyCd" );
  }


  public final void setIndexAdjustmentFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustmentFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IndexAdjustmentFrequencyCd getIndexAdjustmentFrequencyCd_elem() {
    return (xsd.acord.IndexAdjustmentFrequencyCd) TYPE.get().getPropertyValue( this, "_IndexAdjustmentFrequencyCd_elem" );
  }


  public final void setIndexAdjustmentFrequencyCd_elem( xsd.acord.IndexAdjustmentFrequencyCd value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustmentFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIndexAdjustmentDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IndexAdjustmentDesc" );
  }


  public final void setIndexAdjustmentDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustmentDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IndexAdjustmentDesc getIndexAdjustmentDesc_elem() {
    return (xsd.acord.IndexAdjustmentDesc) TYPE.get().getPropertyValue( this, "_IndexAdjustmentDesc_elem" );
  }


  public final void setIndexAdjustmentDesc_elem( xsd.acord.IndexAdjustmentDesc value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustmentDesc_elem", value );
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
