/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CheckValid_ValidationLevel extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "validationLevel", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.CheckValid_ValidationLevel" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel" );
    }
  };

  public CheckValid_ValidationLevel() {
    super( 945618600, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel() );
  }

  public CheckValid_ValidationLevel( wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel typeInstance ) {
    super( 945618600, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CheckValid_ValidationLevel( gw.internal.xml.XmlElementState state ) {
    super( 945618600, state );
  }

  public CheckValid_ValidationLevel( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.CheckValid_ValidationLevel> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.ValidationLevel typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel getValue() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.ValidationLevel value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
