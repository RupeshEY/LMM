/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class AssignmentCommand extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/plugin/assignment", "AssignmentCommand", "pogo16" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/plugin/assignment", "pogo16" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.AssignmentCommand" );
    }
  };

  public AssignmentCommand() {
    super( -1283260347, TYPE.get() );
  }

  public AssignmentCommand( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand value ) {
    this();
    setValue( value );
  }

  private AssignmentCommand( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1283260347, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.AssignmentCommand> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.claim.claimapi.types.simple.AssignmentCommand get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand getValue() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.claim.claimapi.enums.AssignmentCommand value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}