/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SalesReceiptAppraisal extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SalesReceiptAppraisal", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ACORDAppraisalFormInd = new javax.xml.namespace.QName( "", "ACORDAppraisalFormInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptAppraisalAmt = new javax.xml.namespace.QName( "", "SalesReceiptAppraisalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptAppraisalDt = new javax.xml.namespace.QName( "", "SalesReceiptAppraisalDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PhotoAvailableInd = new javax.xml.namespace.QName( "", "PhotoAvailableInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptAppraisalTypeCd = new javax.xml.namespace.QName( "", "SalesReceiptAppraisalTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptNumber = new javax.xml.namespace.QName( "", "SalesReceiptNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AppraisalInd = new javax.xml.namespace.QName( "", "AppraisalInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SalesReceiptAppraisal" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SalesReceiptAppraisal_Type" );
    }
  };

  public SalesReceiptAppraisal() {
    super( 864671685, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SalesReceiptAppraisal_Type() );
  }

  public SalesReceiptAppraisal( xsd.acord.types.complex.SalesReceiptAppraisal_Type typeInstance ) {
    super( 864671685, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SalesReceiptAppraisal( gw.internal.xml.XmlElementState state ) {
    super( 864671685, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SalesReceiptAppraisal> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SalesReceiptAppraisal_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SalesReceiptAppraisal_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SalesReceiptAppraisal_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }

  public static xsd.acord.SalesReceiptAppraisal parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SalesReceiptAppraisal.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getACORDAppraisalFormInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ACORDAppraisalFormInd" );
  }


  public final void setACORDAppraisalFormInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ACORDAppraisalFormInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ACORDAppraisalFormInd getACORDAppraisalFormInd_elem() {
    return (xsd.acord.ACORDAppraisalFormInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ACORDAppraisalFormInd_elem" );
  }


  public final void setACORDAppraisalFormInd_elem( xsd.acord.ACORDAppraisalFormInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ACORDAppraisalFormInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalesReceiptAppraisalAmt getSalesReceiptAppraisalAmt() {
    return (xsd.acord.SalesReceiptAppraisalAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalAmt" );
  }


  public final void setSalesReceiptAppraisalAmt( xsd.acord.SalesReceiptAppraisalAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSalesReceiptAppraisalDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalDt" );
  }


  public final void setSalesReceiptAppraisalDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalesReceiptAppraisalDt getSalesReceiptAppraisalDt_elem() {
    return (xsd.acord.SalesReceiptAppraisalDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalDt_elem" );
  }


  public final void setSalesReceiptAppraisalDt_elem( xsd.acord.SalesReceiptAppraisalDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPhotoAvailableInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhotoAvailableInd" );
  }


  public final void setPhotoAvailableInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhotoAvailableInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PhotoAvailableInd getPhotoAvailableInd_elem() {
    return (xsd.acord.PhotoAvailableInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PhotoAvailableInd_elem" );
  }


  public final void setPhotoAvailableInd_elem( xsd.acord.PhotoAvailableInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PhotoAvailableInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SalesReceiptAppraisals getSalesReceiptAppraisalTypeCd() {
    return (xsd.acord.enums.SalesReceiptAppraisals) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalTypeCd" );
  }


  public final void setSalesReceiptAppraisalTypeCd( xsd.acord.enums.SalesReceiptAppraisals value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalesReceiptAppraisalTypeCd getSalesReceiptAppraisalTypeCd_elem() {
    return (xsd.acord.SalesReceiptAppraisalTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalTypeCd_elem" );
  }


  public final void setSalesReceiptAppraisalTypeCd_elem( xsd.acord.SalesReceiptAppraisalTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisalTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSalesReceiptNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptNumber" );
  }


  public final void setSalesReceiptNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalesReceiptNumber getSalesReceiptNumber_elem() {
    return (xsd.acord.SalesReceiptNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptNumber_elem" );
  }


  public final void setSalesReceiptNumber_elem( xsd.acord.SalesReceiptNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAppraisalInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AppraisalInd" );
  }


  public final void setAppraisalInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AppraisalInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AppraisalInd getAppraisalInd_elem() {
    return (xsd.acord.AppraisalInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AppraisalInd_elem" );
  }


  public final void setAppraisalInd_elem( xsd.acord.AppraisalInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AppraisalInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
