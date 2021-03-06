/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ElectronicFundsTransfer_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ElectronicFundsTransfer_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FromAcct = new javax.xml.namespace.QName( "", "FromAcct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ToAcct = new javax.xml.namespace.QName( "", "ToAcct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransferAmt = new javax.xml.namespace.QName( "", "TransferAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Fee = new javax.xml.namespace.QName( "", "Fee", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EFTFrequencyCd = new javax.xml.namespace.QName( "", "EFTFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EFTTrackingId = new javax.xml.namespace.QName( "", "EFTTrackingId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ElectronicFundsTransfer_Type" );
    }
  };

  public ElectronicFundsTransfer_Type() {
    super( -360629149, TYPE.get() );
  }

  private ElectronicFundsTransfer_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -360629149, state );
  }

  protected ElectronicFundsTransfer_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ElectronicFundsTransfer_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ElectronicFundsTransfer_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ElectronicFundsTransfer_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FromAcct getFromAcct() {
    return (xsd.acord.FromAcct) TYPE.get().getPropertyValue( this, "_FromAcct" );
  }


  public final void setFromAcct( xsd.acord.FromAcct value ) {
    TYPE.get().setPropertyValue( this, "_FromAcct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ToAcct getToAcct() {
    return (xsd.acord.ToAcct) TYPE.get().getPropertyValue( this, "_ToAcct" );
  }


  public final void setToAcct( xsd.acord.ToAcct value ) {
    TYPE.get().setPropertyValue( this, "_ToAcct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransferAmt getTransferAmt() {
    return (xsd.acord.TransferAmt) TYPE.get().getPropertyValue( this, "_TransferAmt" );
  }


  public final void setTransferAmt( xsd.acord.TransferAmt value ) {
    TYPE.get().setPropertyValue( this, "_TransferAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Fee getFee() {
    return (xsd.acord.Fee) TYPE.get().getPropertyValue( this, "_Fee" );
  }


  public final void setFee( xsd.acord.Fee value ) {
    TYPE.get().setPropertyValue( this, "_Fee", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getEFTFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_EFTFrequencyCd" );
  }


  public final void setEFTFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_EFTFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EFTFrequencyCd getEFTFrequencyCd_elem() {
    return (xsd.acord.EFTFrequencyCd) TYPE.get().getPropertyValue( this, "_EFTFrequencyCd_elem" );
  }


  public final void setEFTFrequencyCd_elem( xsd.acord.EFTFrequencyCd value ) {
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
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEFTTrackingId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EFTTrackingId" );
  }


  public final void setEFTTrackingId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EFTTrackingId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EFTTrackingId getEFTTrackingId_elem() {
    return (xsd.acord.EFTTrackingId) TYPE.get().getPropertyValue( this, "_EFTTrackingId_elem" );
  }


  public final void setEFTTrackingId_elem( xsd.acord.EFTTrackingId value ) {
    TYPE.get().setPropertyValue( this, "_EFTTrackingId_elem", value );
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
