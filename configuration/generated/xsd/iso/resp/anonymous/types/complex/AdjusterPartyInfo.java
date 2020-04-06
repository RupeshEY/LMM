/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AdjusterPartyInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignedDt = new javax.xml.namespace.QName( "", "AssignedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseCd = new javax.xml.namespace.QName( "", "LossCauseCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AssignmentRef = new javax.xml.namespace.QName( "", "AssignmentRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.AdjusterPartyInfo" );
    }
  };

  public AdjusterPartyInfo() {
    super( 227199028, TYPE.get() );
  }

  private AdjusterPartyInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 227199028, state );
  }

  protected AdjusterPartyInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AdjusterPartyInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.AdjusterPartyInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.AdjusterPartyInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAssignedDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AssignedDt" );
  }


  public final void setAssignedDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AssignedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_AssignedDt getAssignedDt_elem() {
    return (xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_AssignedDt) TYPE.get().getPropertyValue( this, "_AssignedDt_elem" );
  }


  public final void setAssignedDt_elem( xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_AssignedDt value ) {
    TYPE.get().setPropertyValue( this, "_AssignedDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageCd" );
  }


  public final void setCoverageCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_CoverageCd getCoverageCd_elem() {
    return (xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_CoverageCd) TYPE.get().getPropertyValue( this, "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_CoverageCd value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossCauseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossCauseCd" );
  }


  public final void setLossCauseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_LossCauseCd getLossCauseCd_elem() {
    return (xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_LossCauseCd) TYPE.get().getPropertyValue( this, "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( xsd.iso.resp.anonymous.elements.AdjusterPartyInfo_LossCauseCd value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAssignmentRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_AssignmentRef" );
  }


  public final void setAssignmentRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_AssignmentRef", value );
  }

}