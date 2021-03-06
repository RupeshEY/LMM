/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompErrorSummary_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompErrorSummary_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MediaTypeCd = new javax.xml.namespace.QName( "", "MediaTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdministrationNumberId = new javax.xml.namespace.QName( "", "AdministrationNumberId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DataGradeCd = new javax.xml.namespace.QName( "", "DataGradeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompErrorInfo = new javax.xml.namespace.QName( "", "WorkCompErrorInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompErrorSummary_Type" );
    }
  };

  public WorkCompErrorSummary_Type() {
    super( 124925108, TYPE.get() );
  }

  private WorkCompErrorSummary_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 124925108, state );
  }

  protected WorkCompErrorSummary_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompErrorSummary_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompErrorSummary_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompErrorSummary_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.MediaType getMediaTypeCd() {
    return (xsd.acord.enums.MediaType) TYPE.get().getPropertyValue( this, "_MediaTypeCd" );
  }


  public final void setMediaTypeCd( xsd.acord.enums.MediaType value ) {
    TYPE.get().setPropertyValue( this, "_MediaTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MediaTypeCd getMediaTypeCd_elem() {
    return (xsd.acord.MediaTypeCd) TYPE.get().getPropertyValue( this, "_MediaTypeCd_elem" );
  }


  public final void setMediaTypeCd_elem( xsd.acord.MediaTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_MediaTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAdministrationNumberId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AdministrationNumberId" );
  }


  public final void setAdministrationNumberId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AdministrationNumberId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdministrationNumberId getAdministrationNumberId_elem() {
    return (xsd.acord.AdministrationNumberId) TYPE.get().getPropertyValue( this, "_AdministrationNumberId_elem" );
  }


  public final void setAdministrationNumberId_elem( xsd.acord.AdministrationNumberId value ) {
    TYPE.get().setPropertyValue( this, "_AdministrationNumberId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDataGradeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DataGradeCd" );
  }


  public final void setDataGradeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DataGradeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DataGradeCd getDataGradeCd_elem() {
    return (xsd.acord.DataGradeCd) TYPE.get().getPropertyValue( this, "_DataGradeCd_elem" );
  }


  public final void setDataGradeCd_elem( xsd.acord.DataGradeCd value ) {
    TYPE.get().setPropertyValue( this, "_DataGradeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompErrorInfo> getWorkCompErrorInfo() {
    return (java.util.List<xsd.acord.WorkCompErrorInfo>) TYPE.get().getPropertyValue( this, "_WorkCompErrorInfo" );
  }


  public final void setWorkCompErrorInfo( java.util.List<xsd.acord.WorkCompErrorInfo> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompErrorInfo", value );
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
