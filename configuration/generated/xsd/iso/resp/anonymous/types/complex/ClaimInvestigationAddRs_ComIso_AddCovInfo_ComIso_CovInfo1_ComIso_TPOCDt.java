/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt" );
    }
  };

  public ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt() {
    super( -1212112868, TYPE.get() );
  }

  private ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1212112868, state );
  }

  protected ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt get$TypeInstance() {
    return this;
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