/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsSvcRq extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPName = new javax.xml.namespace.QName( "", "SPName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimInvestigationAddRq = new javax.xml.namespace.QName( "", "ClaimInvestigationAddRq", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimsSvcRq" );
    }
  };

  public ClaimsSvcRq() {
    super( 1275996388, TYPE.get() );
  }

  private ClaimsSvcRq( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1275996388, state );
  }

  protected ClaimsSvcRq( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsSvcRq( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ClaimsSvcRq> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ClaimsSvcRq get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.RqUID getRqUID_elem() {
    return (xsd.iso.resp.RqUID) TYPE.get().getPropertyValue( this, "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.iso.resp.RqUID value ) {
    TYPE.get().setPropertyValue( this, "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SPName" );
  }


  public final void setSPName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SPName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.SPName getSPName_elem() {
    return (xsd.iso.resp.SPName) TYPE.get().getPropertyValue( this, "_SPName_elem" );
  }


  public final void setSPName_elem( xsd.iso.resp.SPName value ) {
    TYPE.get().setPropertyValue( this, "_SPName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.ClaimInvestigationAddRq> getClaimInvestigationAddRq() {
    return (java.util.List<xsd.iso.resp.ClaimInvestigationAddRq>) TYPE.get().getPropertyValue( this, "_ClaimInvestigationAddRq" );
  }


  public final void setClaimInvestigationAddRq( java.util.List<xsd.iso.resp.ClaimInvestigationAddRq> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimInvestigationAddRq", value );
  }


}
