/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ContractPeriodType_Extension extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.ContractPeriodType_Extension" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType" );
    }
  };

  public ContractPeriodType_Extension() {
    super( 1238950806, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType() );
  }

  public ContractPeriodType_Extension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType typeInstance ) {
    super( 1238950806, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ContractPeriodType_Extension( gw.internal.xml.XmlElementState state ) {
    super( 1238950806, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.ContractPeriodType_Extension> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.ContractPeriod_ExtensionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }
}
