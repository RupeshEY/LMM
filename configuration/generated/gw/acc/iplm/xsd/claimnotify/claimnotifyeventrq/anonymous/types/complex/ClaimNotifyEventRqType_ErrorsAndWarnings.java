/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimNotifyEventRqType_ErrorsAndWarnings extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Result = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "Result", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ErrorsAndWarnings" );
    }
  };

  public ClaimNotifyEventRqType_ErrorsAndWarnings() {
    super( -324002121, TYPE.get() );
  }

  private ClaimNotifyEventRqType_ErrorsAndWarnings( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -324002121, state );
  }

  protected ClaimNotifyEventRqType_ErrorsAndWarnings( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimNotifyEventRqType_ErrorsAndWarnings( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ErrorsAndWarnings> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ErrorsAndWarnings get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result> getResult() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result>) TYPE.get().getPropertyValue( this, "_Result" );
  }


  public final void setResult( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result> value ) {
    TYPE.get().setPropertyValue( this, "_Result", value );
  }


}