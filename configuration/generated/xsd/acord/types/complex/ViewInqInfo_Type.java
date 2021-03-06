/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ViewInqInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ViewInqInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RequestedViewCd = new javax.xml.namespace.QName( "", "RequestedViewCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EvaluationPeriod = new javax.xml.namespace.QName( "", "EvaluationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDt = new javax.xml.namespace.QName( "", "AsOfDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsParty = new javax.xml.namespace.QName( "", "ClaimsParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ViewTransactionInfo = new javax.xml.namespace.QName( "", "ViewTransactionInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ViewInqInfo_Type" );
    }
  };

  public ViewInqInfo_Type() {
    super( -1445370677, TYPE.get() );
  }

  private ViewInqInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1445370677, state );
  }

  protected ViewInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ViewInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ViewInqInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ViewInqInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.AttachmentType getRequestedViewCd() {
    return (xsd.acord.enums.AttachmentType) TYPE.get().getPropertyValue( this, "_RequestedViewCd" );
  }


  public final void setRequestedViewCd( xsd.acord.enums.AttachmentType value ) {
    TYPE.get().setPropertyValue( this, "_RequestedViewCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RequestedViewCd getRequestedViewCd_elem() {
    return (xsd.acord.RequestedViewCd) TYPE.get().getPropertyValue( this, "_RequestedViewCd_elem" );
  }


  public final void setRequestedViewCd_elem( xsd.acord.RequestedViewCd value ) {
    TYPE.get().setPropertyValue( this, "_RequestedViewCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EvaluationPeriod getEvaluationPeriod() {
    return (xsd.acord.EvaluationPeriod) TYPE.get().getPropertyValue( this, "_EvaluationPeriod" );
  }


  public final void setEvaluationPeriod( xsd.acord.EvaluationPeriod value ) {
    TYPE.get().setPropertyValue( this, "_EvaluationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDt" );
  }


  public final void setAsOfDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AsOfDt getAsOfDt_elem() {
    return (xsd.acord.AsOfDt) TYPE.get().getPropertyValue( this, "_AsOfDt_elem" );
  }


  public final void setAsOfDt_elem( xsd.acord.AsOfDt value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsParty> getClaimsParty() {
    return (java.util.List<xsd.acord.ClaimsParty>) TYPE.get().getPropertyValue( this, "_ClaimsParty" );
  }


  public final void setClaimsParty( java.util.List<xsd.acord.ClaimsParty> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ViewTransactionInfo getViewTransactionInfo() {
    return (xsd.acord.ViewTransactionInfo) TYPE.get().getPropertyValue( this, "_ViewTransactionInfo" );
  }


  public final void setViewTransactionInfo( xsd.acord.ViewTransactionInfo value ) {
    TYPE.get().setPropertyValue( this, "_ViewTransactionInfo", value );
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
