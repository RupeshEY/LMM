/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SalvageInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SalvageInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalvageDt = new javax.xml.namespace.QName( "", "SalvageDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemAppraisedValueAmt = new javax.xml.namespace.QName( "", "ItemAppraisedValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValuePriorToLossAmt = new javax.xml.namespace.QName( "", "ItemValuePriorToLossAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValueReceivedAmt = new javax.xml.namespace.QName( "", "ItemValueReceivedAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OwnerRetainingSalvageInd = new javax.xml.namespace.QName( "", "OwnerRetainingSalvageInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ItemRef = new javax.xml.namespace.QName( "", "ItemRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SalvageAgencyRef = new javax.xml.namespace.QName( "", "SalvageAgencyRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_BuyerRef = new javax.xml.namespace.QName( "", "BuyerRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SalvageInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SalvageInfo_Type" );
    }
  };

  public SalvageInfo() {
    super( -2025371391, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SalvageInfo_Type() );
  }

  public SalvageInfo( xsd.acord.types.complex.SalvageInfo_Type typeInstance ) {
    super( -2025371391, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SalvageInfo( gw.internal.xml.XmlElementState state ) {
    super( -2025371391, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SalvageInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SalvageInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SalvageInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SalvageInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SalvageInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SalvageInfo.class );
  }

  public static xsd.acord.SalvageInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SalvageInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSalvageDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalvageDt" );
  }


  public final void setSalvageDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalvageDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalvageDt getSalvageDt_elem() {
    return (xsd.acord.SalvageDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalvageDt_elem" );
  }


  public final void setSalvageDt_elem( xsd.acord.SalvageDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalvageDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemAppraisedValueAmt getItemAppraisedValueAmt() {
    return (xsd.acord.ItemAppraisedValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemAppraisedValueAmt" );
  }


  public final void setItemAppraisedValueAmt( xsd.acord.ItemAppraisedValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemAppraisedValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemValuePriorToLossAmt getItemValuePriorToLossAmt() {
    return (xsd.acord.ItemValuePriorToLossAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValuePriorToLossAmt" );
  }


  public final void setItemValuePriorToLossAmt( xsd.acord.ItemValuePriorToLossAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValuePriorToLossAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemValueReceivedAmt getItemValueReceivedAmt() {
    return (xsd.acord.ItemValueReceivedAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValueReceivedAmt" );
  }


  public final void setItemValueReceivedAmt( xsd.acord.ItemValueReceivedAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValueReceivedAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOwnerRetainingSalvageInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OwnerRetainingSalvageInd" );
  }


  public final void setOwnerRetainingSalvageInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OwnerRetainingSalvageInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OwnerRetainingSalvageInd getOwnerRetainingSalvageInd_elem() {
    return (xsd.acord.OwnerRetainingSalvageInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OwnerRetainingSalvageInd_elem" );
  }


  public final void setOwnerRetainingSalvageInd_elem( xsd.acord.OwnerRetainingSalvageInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OwnerRetainingSalvageInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getItemRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemRef" );
  }


  public final void setItemRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSalvageAgencyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalvageAgencyRef" );
  }


  public final void setSalvageAgencyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalvageAgencyRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getBuyerRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BuyerRef" );
  }


  public final void setBuyerRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BuyerRef", value );
  }
}
