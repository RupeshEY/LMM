/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ApplicationType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ApplicationType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApplicationCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ApplicationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SchemaVersion = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "SchemaVersion", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ApplicationType" );
    }
  };

  public ApplicationType() {
    super( -803967616, TYPE.get() );
  }

  private ApplicationType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -803967616, state );
  }

  protected ApplicationType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ApplicationType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ApplicationType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ApplicationType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getApplicationCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ApplicationCd" );
  }


  public final void setApplicationCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ApplicationCd getApplicationCd_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ApplicationCd) TYPE.get().getPropertyValue( this, "_ApplicationCd_elem" );
  }


  public final void setApplicationCd_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ApplicationCd value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSchemaVersion() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SchemaVersion" );
  }


  public final void setSchemaVersion( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SchemaVersion", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.SchemaVersion getSchemaVersion_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.SchemaVersion) TYPE.get().getPropertyValue( this, "_SchemaVersion_elem" );
  }


  public final void setSchemaVersion_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.SchemaVersion value ) {
    TYPE.get().setPropertyValue( this, "_SchemaVersion_elem", value );
  }

}