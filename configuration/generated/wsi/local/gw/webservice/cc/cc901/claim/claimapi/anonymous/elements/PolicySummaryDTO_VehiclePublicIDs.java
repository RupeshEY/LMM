/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PolicySummaryDTO_VehiclePublicIDs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/PolicySummaryDTO", "VehiclePublicIDs", "pogo14" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/PolicySummaryDTO", "pogo14" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/PolicySummaryDTO", "Entry", "pogo14" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.PolicySummaryDTO_VehiclePublicIDs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs" );
    }
  };

  public PolicySummaryDTO_VehiclePublicIDs() {
    super( -1573440400, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs() );
  }

  public PolicySummaryDTO_VehiclePublicIDs( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs typeInstance ) {
    super( -1573440400, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PolicySummaryDTO_VehiclePublicIDs( gw.internal.xml.XmlElementState state ) {
    super( -1573440400, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.PolicySummaryDTO_VehiclePublicIDs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.PolicySummaryDTO_VehiclePublicIDs typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getEntry() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.PolicySummaryDTO_VehiclePublicIDs_Entry> getEntry_elem() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.PolicySummaryDTO_VehiclePublicIDs_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry_elem" );
  }


  public final void setEntry_elem( java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.PolicySummaryDTO_VehiclePublicIDs_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry_elem", value );
  }

}
