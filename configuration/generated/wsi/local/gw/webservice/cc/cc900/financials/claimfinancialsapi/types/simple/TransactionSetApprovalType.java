/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class TransactionSetApprovalType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/cc/financials", "TransactionSetApprovalType", "pogo13" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/cc/financials", "pogo13" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.TransactionSetApprovalType" );
    }
  };

  public TransactionSetApprovalType() {
    super( -1064302526, TYPE.get() );
  }

  public TransactionSetApprovalType( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType value ) {
    this();
    setValue( value );
  }

  private TransactionSetApprovalType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1064302526, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.TransactionSetApprovalType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.TransactionSetApprovalType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType getValue() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.TransactionSetApprovalType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
