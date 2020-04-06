/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ElectronicFundsTransfer extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FromAcct = new javax.xml.namespace.QName( "", "FromAcct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ToAcct = new javax.xml.namespace.QName( "", "ToAcct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransferAmt = new javax.xml.namespace.QName( "", "TransferAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Fee = new javax.xml.namespace.QName( "", "Fee", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EFTFrequencyCd = new javax.xml.namespace.QName( "", "EFTFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ElectronicFundsTransfer" );
    }
  };

  public ElectronicFundsTransfer() {
    super( -2130575541, TYPE.get() );
  }

  private ElectronicFundsTransfer( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2130575541, state );
  }

  protected ElectronicFundsTransfer( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ElectronicFundsTransfer( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ElectronicFundsTransfer> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ElectronicFundsTransfer get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.FromAcct getFromAcct() {
    return (xsd.iso.req.FromAcct) TYPE.get().getPropertyValue( this, "_FromAcct" );
  }


  public final void setFromAcct( xsd.iso.req.FromAcct value ) {
    TYPE.get().setPropertyValue( this, "_FromAcct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ToAcct getToAcct() {
    return (xsd.iso.req.ToAcct) TYPE.get().getPropertyValue( this, "_ToAcct" );
  }


  public final void setToAcct( xsd.iso.req.ToAcct value ) {
    TYPE.get().setPropertyValue( this, "_ToAcct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_TransferAmt getTransferAmt() {
    return (xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_TransferAmt) TYPE.get().getPropertyValue( this, "_TransferAmt" );
  }


  public final void setTransferAmt( xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_TransferAmt value ) {
    TYPE.get().setPropertyValue( this, "_TransferAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Fee getFee() {
    return (xsd.iso.req.Fee) TYPE.get().getPropertyValue( this, "_Fee" );
  }


  public final void setFee( xsd.iso.req.Fee value ) {
    TYPE.get().setPropertyValue( this, "_Fee", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEFTFrequencyCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EFTFrequencyCd" );
  }


  public final void setEFTFrequencyCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EFTFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EFTFrequencyCd getEFTFrequencyCd_elem() {
    return (xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EFTFrequencyCd) TYPE.get().getPropertyValue( this, "_EFTFrequencyCd_elem" );
  }


  public final void setEFTFrequencyCd_elem( xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EFTFrequencyCd value ) {
    TYPE.get().setPropertyValue( this, "_EFTFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EffectiveDt getEffectiveDt_elem() {
    return (xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.iso.req.anonymous.elements.ElectronicFundsTransfer_EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
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