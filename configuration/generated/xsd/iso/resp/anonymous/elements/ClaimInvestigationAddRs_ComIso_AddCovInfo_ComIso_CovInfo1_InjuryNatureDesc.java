/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "InjuryNatureDesc", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.complex.AnyType", "gw.xsd.w3c.xmlschema" );
    }
  };

  public ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc() {
    super( 999108368, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.complex.AnyType() );
  }

  public ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc( gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( 999108368, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc( gw.internal.xml.XmlElementState state ) {
    super( 999108368, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.complex.AnyType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.complex.AnyType.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }
}
