/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimInvestigationAddRq_ComIso_AddCovInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CovInfo1 = new javax.xml.namespace.QName( "", "com.iso_CovInfo1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CovInfo2 = new javax.xml.namespace.QName( "", "com.iso_CovInfo2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CMS = new javax.xml.namespace.QName( "", "com.iso_CMS", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRq_ComIso_AddCovInfo" );
    }
  };

  public ClaimInvestigationAddRq_ComIso_AddCovInfo() {
    super( -193509591, TYPE.get() );
  }

  private ClaimInvestigationAddRq_ComIso_AddCovInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -193509591, state );
  }

  protected ClaimInvestigationAddRq_ComIso_AddCovInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimInvestigationAddRq_ComIso_AddCovInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRq_ComIso_AddCovInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ClaimInvestigationAddRq_ComIso_AddCovInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo1> getComIso_CovInfo1() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo1>) TYPE.get().getPropertyValue( this, "_ComIso_CovInfo1" );
  }


  public final void setComIso_CovInfo1( java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo1> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CovInfo1", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo2> getComIso_CovInfo2() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo2>) TYPE.get().getPropertyValue( this, "_ComIso_CovInfo2" );
  }


  public final void setComIso_CovInfo2( java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CovInfo2> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CovInfo2", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CMS> getComIso_CMS() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CMS>) TYPE.get().getPropertyValue( this, "_ComIso_CMS" );
  }


  public final void setComIso_CMS( java.util.List<xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRq_ComIso_AddCovInfo_ComIso_CMS> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CMS", value );
  }


}