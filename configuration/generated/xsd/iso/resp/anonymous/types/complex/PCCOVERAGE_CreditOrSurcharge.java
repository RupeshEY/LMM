/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.resp.types.complex.PCCREDITSURCHARGE.class)
public class PCCOVERAGE_CreditOrSurcharge extends xsd.iso.resp.types.complex.PCCREDITSURCHARGE {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeDt = new javax.xml.namespace.QName( "", "CreditSurchargeDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeCd = new javax.xml.namespace.QName( "", "CreditSurchargeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumericValue = new javax.xml.namespace.QName( "", "NumericValue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondaryCd = new javax.xml.namespace.QName( "", "SecondaryCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.PCCOVERAGE_CreditOrSurcharge" );
    }
  };

  public PCCOVERAGE_CreditOrSurcharge() {
    super( 888462568, TYPE.get() );
  }

  private PCCOVERAGE_CreditOrSurcharge( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 888462568, state );
  }

  protected PCCOVERAGE_CreditOrSurcharge( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PCCOVERAGE_CreditOrSurcharge( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.PCCOVERAGE_CreditOrSurcharge> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.PCCOVERAGE_CreditOrSurcharge get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
