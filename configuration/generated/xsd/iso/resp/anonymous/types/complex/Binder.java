/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Binder extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgencyBinderNumber = new javax.xml.namespace.QName( "", "AgencyBinderNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BinderPurposeCd = new javax.xml.namespace.QName( "", "BinderPurposeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractTerm = new javax.xml.namespace.QName( "", "ContractTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDtTime = new javax.xml.namespace.QName( "", "EffectiveDtTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDtTime = new javax.xml.namespace.QName( "", "ExpirationDtTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormNumber = new javax.xml.namespace.QName( "", "FormNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewBinderInd = new javax.xml.namespace.QName( "", "NewBinderInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonStandardConditionsInd = new javax.xml.namespace.QName( "", "NonStandardConditionsInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.Binder" );
    }
  };

  public Binder() {
    super( -1401391474, TYPE.get() );
  }

  private Binder( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1401391474, state );
  }

  protected Binder( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Binder( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.Binder> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.Binder get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAgencyBinderNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AgencyBinderNumber" );
  }


  public final void setAgencyBinderNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AgencyBinderNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_AgencyBinderNumber getAgencyBinderNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_AgencyBinderNumber) TYPE.get().getPropertyValue( this, "_AgencyBinderNumber_elem" );
  }


  public final void setAgencyBinderNumber_elem( xsd.iso.resp.anonymous.elements.Binder_AgencyBinderNumber value ) {
    TYPE.get().setPropertyValue( this, "_AgencyBinderNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBinderPurposeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BinderPurposeCd" );
  }


  public final void setBinderPurposeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BinderPurposeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_BinderPurposeCd getBinderPurposeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_BinderPurposeCd) TYPE.get().getPropertyValue( this, "_BinderPurposeCd_elem" );
  }


  public final void setBinderPurposeCd_elem( xsd.iso.resp.anonymous.elements.Binder_BinderPurposeCd value ) {
    TYPE.get().setPropertyValue( this, "_BinderPurposeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_ContractTerm getContractTerm() {
    return (xsd.iso.resp.anonymous.elements.Binder_ContractTerm) TYPE.get().getPropertyValue( this, "_ContractTerm" );
  }


  public final void setContractTerm( xsd.iso.resp.anonymous.elements.Binder_ContractTerm value ) {
    TYPE.get().setPropertyValue( this, "_ContractTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDtTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDtTime" );
  }


  public final void setEffectiveDtTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDtTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_EffectiveDtTime getEffectiveDtTime_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_EffectiveDtTime) TYPE.get().getPropertyValue( this, "_EffectiveDtTime_elem" );
  }


  public final void setEffectiveDtTime_elem( xsd.iso.resp.anonymous.elements.Binder_EffectiveDtTime value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDtTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExpirationDtTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExpirationDtTime" );
  }


  public final void setExpirationDtTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDtTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_ExpirationDtTime getExpirationDtTime_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_ExpirationDtTime) TYPE.get().getPropertyValue( this, "_ExpirationDtTime_elem" );
  }


  public final void setExpirationDtTime_elem( xsd.iso.resp.anonymous.elements.Binder_ExpirationDtTime value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDtTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormNumber" );
  }


  public final void setFormNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_FormNumber getFormNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_FormNumber) TYPE.get().getPropertyValue( this, "_FormNumber_elem" );
  }


  public final void setFormNumber_elem( xsd.iso.resp.anonymous.elements.Binder_FormNumber value ) {
    TYPE.get().setPropertyValue( this, "_FormNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNewBinderInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NewBinderInd" );
  }


  public final void setNewBinderInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NewBinderInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_NewBinderInd getNewBinderInd_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_NewBinderInd) TYPE.get().getPropertyValue( this, "_NewBinderInd_elem" );
  }


  public final void setNewBinderInd_elem( xsd.iso.resp.anonymous.elements.Binder_NewBinderInd value ) {
    TYPE.get().setPropertyValue( this, "_NewBinderInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonStandardConditionsInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NonStandardConditionsInd" );
  }


  public final void setNonStandardConditionsInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NonStandardConditionsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.Binder_NonStandardConditionsInd getNonStandardConditionsInd_elem() {
    return (xsd.iso.resp.anonymous.elements.Binder_NonStandardConditionsInd) TYPE.get().getPropertyValue( this, "_NonStandardConditionsInd_elem" );
  }


  public final void setNonStandardConditionsInd_elem( xsd.iso.resp.anonymous.elements.Binder_NonStandardConditionsInd value ) {
    TYPE.get().setPropertyValue( this, "_NonStandardConditionsInd_elem", value );
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