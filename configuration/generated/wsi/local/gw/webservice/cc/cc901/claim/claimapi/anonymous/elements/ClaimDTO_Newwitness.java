/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimDTO_Newwitness extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "Newwitness", "pogo6" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "pogo6" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "Entry", "pogo6" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness" );
    }
  };

  public ClaimDTO_Newwitness() {
    super( -1683021554, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness() );
  }

  public ClaimDTO_Newwitness( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness typeInstance ) {
    super( -1683021554, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimDTO_Newwitness( gw.internal.xml.XmlElementState state ) {
    super( -1683021554, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }

}