/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ACORD_SignonRs_ClientApp extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Org = new javax.xml.namespace.QName( "", "Org", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Name = new javax.xml.namespace.QName( "", "Name", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Version = new javax.xml.namespace.QName( "", "Version", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_ClientApp" );
    }
  };

  public ACORD_SignonRs_ClientApp() {
    super( -1454496674, TYPE.get() );
  }

  private ACORD_SignonRs_ClientApp( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1454496674, state );
  }

  protected ACORD_SignonRs_ClientApp( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ACORD_SignonRs_ClientApp( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_ClientApp> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs_ClientApp get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOrg() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Org" );
  }


  public final void setOrg( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Org", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Org getOrg_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Org) TYPE.get().getPropertyValue( this, "_Org_elem" );
  }


  public final void setOrg_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Org value ) {
    TYPE.get().setPropertyValue( this, "_Org_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Name getName_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Name) TYPE.get().getPropertyValue( this, "_Name_elem" );
  }


  public final void setName_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Name value ) {
    TYPE.get().setPropertyValue( this, "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVersion() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Version" );
  }


  public final void setVersion( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Version", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Version getVersion_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Version) TYPE.get().getPropertyValue( this, "_Version_elem" );
  }


  public final void setVersion_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp_Version value ) {
    TYPE.get().setPropertyValue( this, "_Version_elem", value );
  }

}
