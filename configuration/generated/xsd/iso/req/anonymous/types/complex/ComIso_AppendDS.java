/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComIso_AppendDS extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ADSResponseCd = new javax.xml.namespace.QName( "", "ADSResponseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_AppendDS" );
    }
  };

  public ComIso_AppendDS() {
    super( -637183502, TYPE.get() );
  }

  private ComIso_AppendDS( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -637183502, state );
  }

  protected ComIso_AppendDS( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComIso_AppendDS( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ComIso_AppendDS> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ComIso_AppendDS get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getADSResponseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ADSResponseCd" );
  }


  public final void setADSResponseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ADSResponseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_AppendDS_ADSResponseCd getADSResponseCd_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_AppendDS_ADSResponseCd) TYPE.get().getPropertyValue( this, "_ADSResponseCd_elem" );
  }


  public final void setADSResponseCd_elem( xsd.iso.req.anonymous.elements.ComIso_AppendDS_ADSResponseCd value ) {
    TYPE.get().setPropertyValue( this, "_ADSResponseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.GeneralPartyInfo getGeneralPartyInfo() {
    return (xsd.iso.req.GeneralPartyInfo) TYPE.get().getPropertyValue( this, "_GeneralPartyInfo" );
  }


  public final void setGeneralPartyInfo( xsd.iso.req.GeneralPartyInfo value ) {
    TYPE.get().setPropertyValue( this, "_GeneralPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PersonInfo getPersonInfo() {
    return (xsd.iso.req.PersonInfo) TYPE.get().getPropertyValue( this, "_PersonInfo" );
  }


  public final void setPersonInfo( xsd.iso.req.PersonInfo value ) {
    TYPE.get().setPropertyValue( this, "_PersonInfo", value );
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
