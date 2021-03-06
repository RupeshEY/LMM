/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RiggingInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "RiggingInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiggingOperationsDesc = new javax.xml.namespace.QName( "", "RiggingOperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiggingDataInfo = new javax.xml.namespace.QName( "", "RiggingDataInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumHoistsUsed = new javax.xml.namespace.QName( "", "NumHoistsUsed", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TandemLiftInd = new javax.xml.namespace.QName( "", "TandemLiftInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperatorCd = new javax.xml.namespace.QName( "", "OperatorCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossSalesPct = new javax.xml.namespace.QName( "", "GrossSalesPct", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.RiggingInfo_Type" );
    }
  };

  public RiggingInfo_Type() {
    super( 1785944359, TYPE.get() );
  }

  private RiggingInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1785944359, state );
  }

  protected RiggingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RiggingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.RiggingInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.RiggingInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRiggingOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RiggingOperationsDesc" );
  }


  public final void setRiggingOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RiggingOperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiggingOperationsDesc getRiggingOperationsDesc_elem() {
    return (xsd.acord.RiggingOperationsDesc) TYPE.get().getPropertyValue( this, "_RiggingOperationsDesc_elem" );
  }


  public final void setRiggingOperationsDesc_elem( xsd.acord.RiggingOperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_RiggingOperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.RiggingDataInfo> getRiggingDataInfo() {
    return (java.util.List<xsd.acord.RiggingDataInfo>) TYPE.get().getPropertyValue( this, "_RiggingDataInfo" );
  }


  public final void setRiggingDataInfo( java.util.List<xsd.acord.RiggingDataInfo> value ) {
    TYPE.get().setPropertyValue( this, "_RiggingDataInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumHoistsUsed() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumHoistsUsed" );
  }


  public final void setNumHoistsUsed( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumHoistsUsed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumHoistsUsed getNumHoistsUsed_elem() {
    return (xsd.acord.NumHoistsUsed) TYPE.get().getPropertyValue( this, "_NumHoistsUsed_elem" );
  }


  public final void setNumHoistsUsed_elem( xsd.acord.NumHoistsUsed value ) {
    TYPE.get().setPropertyValue( this, "_NumHoistsUsed_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getTandemLiftInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_TandemLiftInd" );
  }


  public final void setTandemLiftInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_TandemLiftInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TandemLiftInd getTandemLiftInd_elem() {
    return (xsd.acord.TandemLiftInd) TYPE.get().getPropertyValue( this, "_TandemLiftInd_elem" );
  }


  public final void setTandemLiftInd_elem( xsd.acord.TandemLiftInd value ) {
    TYPE.get().setPropertyValue( this, "_TandemLiftInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Operator getOperatorCd() {
    return (xsd.acord.enums.Operator) TYPE.get().getPropertyValue( this, "_OperatorCd" );
  }


  public final void setOperatorCd( xsd.acord.enums.Operator value ) {
    TYPE.get().setPropertyValue( this, "_OperatorCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperatorCd getOperatorCd_elem() {
    return (xsd.acord.OperatorCd) TYPE.get().getPropertyValue( this, "_OperatorCd_elem" );
  }


  public final void setOperatorCd_elem( xsd.acord.OperatorCd value ) {
    TYPE.get().setPropertyValue( this, "_OperatorCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getGrossSalesPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_GrossSalesPct" );
  }


  public final void setGrossSalesPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_GrossSalesPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GrossSalesPct getGrossSalesPct_elem() {
    return (xsd.acord.GrossSalesPct) TYPE.get().getPropertyValue( this, "_GrossSalesPct_elem" );
  }


  public final void setGrossSalesPct_elem( xsd.acord.GrossSalesPct value ) {
    TYPE.get().setPropertyValue( this, "_GrossSalesPct_elem", value );
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
