/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ValidatorResultsType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ValidatorResultsType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValidatorExecution = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ValidatorExecution", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acordmsgsvc.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.ValidatorResultsType" );
    }
  };

  public ValidatorResultsType() {
    super( -357180741, TYPE.get() );
  }

  private ValidatorResultsType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -357180741, state );
  }

  protected ValidatorResultsType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ValidatorResultsType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.ValidatorResultsType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.ValidatorResultsType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.londonmarket.acordmsgsvc.ValidatorExecution> getValidatorExecution() {
    return (java.util.List<gw.acc.iplm.xsd.londonmarket.acordmsgsvc.ValidatorExecution>) TYPE.get().getPropertyValue( this, "_ValidatorExecution" );
  }


  public final void setValidatorExecution( java.util.List<gw.acc.iplm.xsd.londonmarket.acordmsgsvc.ValidatorExecution> value ) {
    TYPE.get().setPropertyValue( this, "_ValidatorExecution", value );
  }


}
