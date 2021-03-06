/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BordereauAmtItem extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauAmtItem", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AmountSplitType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AmountSplitType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType" );
    }
  };

  public BordereauAmtItem() {
    super( -963830380, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType() );
  }

  public BordereauAmtItem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType typeInstance ) {
    super( -963830380, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BordereauAmtItem( gw.internal.xml.XmlElementState state ) {
    super( -963830380, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauAmtItemType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmtItem.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.math.BigDecimal> getAmt() {
    return (java.util.List<java.math.BigDecimal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt" );
  }


  public final void setAmt( java.util.List<java.math.BigDecimal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt> getAmt_elem() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt_elem" );
  }


  public final void setAmt_elem( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Amt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDate" );
  }


  public final void setAsOfDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate getAsOfDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmountSplitType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AmountSplitType" );
  }


  public final void setAmountSplitType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AmountSplitType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AmountSplitType getAmountSplitType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AmountSplitType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AmountSplitType_elem" );
  }


  public final void setAmountSplitType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AmountSplitType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AmountSplitType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauAmtItemType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauAmtItemType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }
}
