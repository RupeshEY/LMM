/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimMovementAmtItem extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClaimMovementAmtItem", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractLimitAndRetentionBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractLimitAndRetentionBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpenseIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ExpenseIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AmtStatus = new javax.xml.namespace.QName( "", "AmtStatus", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType" );
    }
  };

  public ClaimMovementAmtItem() {
    super( -942569610, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType() );
  }

  public ClaimMovementAmtItem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType typeInstance ) {
    super( -942569610, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimMovementAmtItem( gw.internal.xml.XmlElementState state ) {
    super( -942569610, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimMovementAmtItemType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem.class );
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
  public final java.lang.String getContractLimitAndRetentionBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractLimitAndRetentionBasis" );
  }


  public final void setContractLimitAndRetentionBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractLimitAndRetentionBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractLimitAndRetentionBasis getContractLimitAndRetentionBasis_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractLimitAndRetentionBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractLimitAndRetentionBasis_elem" );
  }


  public final void setContractLimitAndRetentionBasis_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractLimitAndRetentionBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractLimitAndRetentionBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExpenseIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpenseIndicator" );
  }


  public final void setExpenseIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpenseIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExpenseIndicator getExpenseIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExpenseIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpenseIndicator_elem" );
  }


  public final void setExpenseIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExpenseIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpenseIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimMovementAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimMovementAmtItemType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimMovementAmtItemType_Extension value ) {
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


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmtStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AmtStatus" );
  }


  public final void setAmtStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AmtStatus", value );
  }
}
