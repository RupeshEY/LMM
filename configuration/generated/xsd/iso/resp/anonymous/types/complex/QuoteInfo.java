/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class QuoteInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanysQuoteNumber = new javax.xml.namespace.QName( "", "CompanysQuoteNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IterationNumber = new javax.xml.namespace.QName( "", "IterationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredFullToBePaidAmt = new javax.xml.namespace.QName( "", "InsuredFullToBePaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteDeclinedInd = new javax.xml.namespace.QName( "", "QuoteDeclinedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteDeclinationReason = new javax.xml.namespace.QName( "", "QuoteDeclinationReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteConditionsInd = new javax.xml.namespace.QName( "", "QuoteConditionsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteConditionsReason = new javax.xml.namespace.QName( "", "QuoteConditionsReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageDeclinedInd = new javax.xml.namespace.QName( "", "CoverageDeclinedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageDeclinationReason = new javax.xml.namespace.QName( "", "CoverageDeclinationReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageConditionsInd = new javax.xml.namespace.QName( "", "CoverageConditionsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageConditionsReason = new javax.xml.namespace.QName( "", "CoverageConditionsReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InitialQuoteRequestDt = new javax.xml.namespace.QName( "", "InitialQuoteRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuotePreparedDt = new javax.xml.namespace.QName( "", "QuotePreparedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteValidUntilDt = new javax.xml.namespace.QName( "", "QuoteValidUntilDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.QuoteInfo" );
    }
  };

  public QuoteInfo() {
    super( 1965014502, TYPE.get() );
  }

  private QuoteInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1965014502, state );
  }

  protected QuoteInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected QuoteInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.QuoteInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.QuoteInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanysQuoteNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CompanysQuoteNumber" );
  }


  public final void setCompanysQuoteNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CompanysQuoteNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_CompanysQuoteNumber getCompanysQuoteNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_CompanysQuoteNumber) TYPE.get().getPropertyValue( this, "_CompanysQuoteNumber_elem" );
  }


  public final void setCompanysQuoteNumber_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_CompanysQuoteNumber value ) {
    TYPE.get().setPropertyValue( this, "_CompanysQuoteNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.resp.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.resp.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIterationNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IterationNumber" );
  }


  public final void setIterationNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IterationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_IterationNumber getIterationNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_IterationNumber) TYPE.get().getPropertyValue( this, "_IterationNumber_elem" );
  }


  public final void setIterationNumber_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_IterationNumber value ) {
    TYPE.get().setPropertyValue( this, "_IterationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_InsuredFullToBePaidAmt getInsuredFullToBePaidAmt() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_InsuredFullToBePaidAmt) TYPE.get().getPropertyValue( this, "_InsuredFullToBePaidAmt" );
  }


  public final void setInsuredFullToBePaidAmt( xsd.iso.resp.anonymous.elements.QuoteInfo_InsuredFullToBePaidAmt value ) {
    TYPE.get().setPropertyValue( this, "_InsuredFullToBePaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuoteDeclinedInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuoteDeclinedInd" );
  }


  public final void setQuoteDeclinedInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuoteDeclinedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinedInd getQuoteDeclinedInd_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinedInd) TYPE.get().getPropertyValue( this, "_QuoteDeclinedInd_elem" );
  }


  public final void setQuoteDeclinedInd_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinedInd value ) {
    TYPE.get().setPropertyValue( this, "_QuoteDeclinedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuoteDeclinationReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuoteDeclinationReason" );
  }


  public final void setQuoteDeclinationReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuoteDeclinationReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinationReason getQuoteDeclinationReason_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinationReason) TYPE.get().getPropertyValue( this, "_QuoteDeclinationReason_elem" );
  }


  public final void setQuoteDeclinationReason_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteDeclinationReason value ) {
    TYPE.get().setPropertyValue( this, "_QuoteDeclinationReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuoteConditionsInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuoteConditionsInd" );
  }


  public final void setQuoteConditionsInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuoteConditionsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsInd getQuoteConditionsInd_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsInd) TYPE.get().getPropertyValue( this, "_QuoteConditionsInd_elem" );
  }


  public final void setQuoteConditionsInd_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsInd value ) {
    TYPE.get().setPropertyValue( this, "_QuoteConditionsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuoteConditionsReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuoteConditionsReason" );
  }


  public final void setQuoteConditionsReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuoteConditionsReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsReason getQuoteConditionsReason_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsReason) TYPE.get().getPropertyValue( this, "_QuoteConditionsReason_elem" );
  }


  public final void setQuoteConditionsReason_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteConditionsReason value ) {
    TYPE.get().setPropertyValue( this, "_QuoteConditionsReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageDeclinedInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageDeclinedInd" );
  }


  public final void setCoverageDeclinedInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageDeclinedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinedInd getCoverageDeclinedInd_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinedInd) TYPE.get().getPropertyValue( this, "_CoverageDeclinedInd_elem" );
  }


  public final void setCoverageDeclinedInd_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinedInd value ) {
    TYPE.get().setPropertyValue( this, "_CoverageDeclinedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageDeclinationReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageDeclinationReason" );
  }


  public final void setCoverageDeclinationReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageDeclinationReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinationReason getCoverageDeclinationReason_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinationReason) TYPE.get().getPropertyValue( this, "_CoverageDeclinationReason_elem" );
  }


  public final void setCoverageDeclinationReason_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageDeclinationReason value ) {
    TYPE.get().setPropertyValue( this, "_CoverageDeclinationReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageConditionsInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageConditionsInd" );
  }


  public final void setCoverageConditionsInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageConditionsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsInd getCoverageConditionsInd_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsInd) TYPE.get().getPropertyValue( this, "_CoverageConditionsInd_elem" );
  }


  public final void setCoverageConditionsInd_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsInd value ) {
    TYPE.get().setPropertyValue( this, "_CoverageConditionsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageConditionsReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageConditionsReason" );
  }


  public final void setCoverageConditionsReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageConditionsReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsReason getCoverageConditionsReason_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsReason) TYPE.get().getPropertyValue( this, "_CoverageConditionsReason_elem" );
  }


  public final void setCoverageConditionsReason_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_CoverageConditionsReason value ) {
    TYPE.get().setPropertyValue( this, "_CoverageConditionsReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInitialQuoteRequestDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InitialQuoteRequestDt" );
  }


  public final void setInitialQuoteRequestDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InitialQuoteRequestDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_InitialQuoteRequestDt getInitialQuoteRequestDt_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_InitialQuoteRequestDt) TYPE.get().getPropertyValue( this, "_InitialQuoteRequestDt_elem" );
  }


  public final void setInitialQuoteRequestDt_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_InitialQuoteRequestDt value ) {
    TYPE.get().setPropertyValue( this, "_InitialQuoteRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuotePreparedDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuotePreparedDt" );
  }


  public final void setQuotePreparedDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuotePreparedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuotePreparedDt getQuotePreparedDt_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuotePreparedDt) TYPE.get().getPropertyValue( this, "_QuotePreparedDt_elem" );
  }


  public final void setQuotePreparedDt_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuotePreparedDt value ) {
    TYPE.get().setPropertyValue( this, "_QuotePreparedDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuoteValidUntilDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QuoteValidUntilDt" );
  }


  public final void setQuoteValidUntilDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QuoteValidUntilDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteValidUntilDt getQuoteValidUntilDt_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteValidUntilDt) TYPE.get().getPropertyValue( this, "_QuoteValidUntilDt_elem" );
  }


  public final void setQuoteValidUntilDt_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_QuoteValidUntilDt value ) {
    TYPE.get().setPropertyValue( this, "_QuoteValidUntilDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.QuoteInfo_Description getDescription_elem() {
    return (xsd.iso.resp.anonymous.elements.QuoteInfo_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( xsd.iso.resp.anonymous.elements.QuoteInfo_Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
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
