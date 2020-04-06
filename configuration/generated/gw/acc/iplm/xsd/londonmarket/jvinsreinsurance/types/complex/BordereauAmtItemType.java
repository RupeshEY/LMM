/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BordereauAmtItemType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauAmtItemType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AmountSplitType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AmountSplitType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.BordereauAmtItemType" );
    }
  };

  public BordereauAmtItemType() {
    super( -1158291126, TYPE.get() );
  }

  private BordereauAmtItemType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1158291126, state );
  }

  protected BordereauAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BordereauAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.BordereauAmtItemType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.BordereauAmtItemType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.math.BigDecimal> getAmt() {
    return (java.util.List<java.math.BigDecimal>) TYPE.get().getPropertyValue( this, "_Amt" );
  }


  public final void setAmt( java.util.List<java.math.BigDecimal> value ) {
    TYPE.get().setPropertyValue( this, "_Amt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt> getAmt_elem() {
    return (java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt>) TYPE.get().getPropertyValue( this, "_Amt_elem" );
  }


  public final void setAmt_elem( java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt> value ) {
    TYPE.get().setPropertyValue( this, "_Amt_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDate" );
  }


  public final void setAsOfDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate getAsOfDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate) TYPE.get().getPropertyValue( this, "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmountSplitType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AmountSplitType" );
  }


  public final void setAmountSplitType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AmountSplitType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AmountSplitType getAmountSplitType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AmountSplitType) TYPE.get().getPropertyValue( this, "_AmountSplitType_elem" );
  }


  public final void setAmountSplitType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AmountSplitType value ) {
    TYPE.get().setPropertyValue( this, "_AmountSplitType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.BordereauAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.BordereauAmtItemType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.BordereauAmtItemType_Extension value ) {
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

}