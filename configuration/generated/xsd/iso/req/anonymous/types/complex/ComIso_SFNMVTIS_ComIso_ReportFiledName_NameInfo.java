/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlName = new javax.xml.namespace.QName( "", "CommlName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonName = new javax.xml.namespace.QName( "", "PersonName", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo" );
    }
  };

  public ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo() {
    super( 227916728, TYPE.get() );
  }

  private ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 227916728, state );
  }

  protected ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName getCommlName() {
    return (xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName) TYPE.get().getPropertyValue( this, "_CommlName" );
  }


  public final void setCommlName( xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_CommlName value ) {
    TYPE.get().setPropertyValue( this, "_CommlName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName getPersonName() {
    return (xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName) TYPE.get().getPropertyValue( this, "_PersonName" );
  }


  public final void setPersonName( xsd.iso.req.anonymous.elements.ComIso_SFNMVTIS_ComIso_ReportFiledName_NameInfo_PersonName value ) {
    TYPE.get().setPropertyValue( this, "_PersonName", value );
  }

}
