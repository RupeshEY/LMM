/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class ActivityCategory extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/typekey", "ActivityCategory", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/typekey", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.simple.ActivityCategory" );
    }
  };

  public ActivityCategory() {
    super( 254580069, TYPE.get() );
  }

  public ActivityCategory( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory value ) {
    this();
    setValue( value );
  }

  private ActivityCategory( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 254580069, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.simple.ActivityCategory> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.types.simple.ActivityCategory get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory getValue() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory get$Value() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ActivityCategory value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
