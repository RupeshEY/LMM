/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TechAccountAmtItem extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TechAccountAmtItem", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DueDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DueDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstalmentNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InstalmentNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrenceYear = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrenceYear", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrencePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrencePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InterestPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAdjustableIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumAdjustableIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredBordereau = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredBordereau", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupportingInformation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SupportingInformation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupportingDocument = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "SupportingDocument", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AmtStatus = new javax.xml.namespace.QName( "", "AmtStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_GeographicalOrigin = new javax.xml.namespace.QName( "", "GeographicalOrigin", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType" );
    }
  };

  public TechAccountAmtItem() {
    super( 112150739, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType() );
  }

  public TechAccountAmtItem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType typeInstance ) {
    super( 112150739, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TechAccountAmtItem( gw.internal.xml.XmlElementState state ) {
    super( 112150739, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TechAccountAmtItemType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TechAccountAmtItem.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmt() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt" );
  }


  public final void setAmt( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt getAmt_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt_elem" );
  }


  public final void setAmt_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDueDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DueDate" );
  }


  public final void setDueDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DueDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate getDueDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DueDate_elem" );
  }


  public final void setDueDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DueDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentNbr getInstalmentNbr() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentNbr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstalmentNbr" );
  }


  public final void setInstalmentNbr( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentNbr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstalmentNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlYear getLossOccurrenceYear() {
    return (gw.xml.date.XmlYear) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossOccurrenceYear" );
  }


  public final void setLossOccurrenceYear( gw.xml.date.XmlYear value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossOccurrenceYear", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear getLossOccurrenceYear_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossOccurrenceYear_elem" );
  }


  public final void setLossOccurrenceYear_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossOccurrenceYear_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod getLossOccurrencePeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossOccurrencePeriod" );
  }


  public final void setLossOccurrencePeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossOccurrencePeriod", value );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate getAsOfDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPeriod getInterestPeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestPeriod" );
  }


  public final void setInterestPeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumAdjustableIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumAdjustableIndicator" );
  }


  public final void setPremiumAdjustableIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumAdjustableIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator getPremiumAdjustableIndicator_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumAdjustableIndicator_elem" );
  }


  public final void setPremiumAdjustableIndicator_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumAdjustableIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau> getReferredBordereau() {
    return (java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredBordereau" );
  }


  public final void setReferredBordereau( java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredBordereau> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredBordereau", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.SupportingInformation> getSupportingInformation() {
    return (java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.SupportingInformation>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupportingInformation" );
  }


  public final void setSupportingInformation( java.util.List<gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.SupportingInformation> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupportingInformation", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.londonmarket.acordrepository.SupportingDocument> getSupportingDocument() {
    return (java.util.List<gw.acc.iplm.xsd.londonmarket.acordrepository.SupportingDocument>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupportingDocument" );
  }


  public final void setSupportingDocument( java.util.List<gw.acc.iplm.xsd.londonmarket.acordrepository.SupportingDocument> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupportingDocument", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TechAccountAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TechAccountAmtItemType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TechAccountAmtItemType_Extension value ) {
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


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGeographicalOrigin() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeographicalOrigin" );
  }


  public final void setGeographicalOrigin( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeographicalOrigin", value );
  }
}