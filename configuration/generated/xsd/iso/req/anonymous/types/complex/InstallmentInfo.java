/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class InstallmentInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentAmt = new javax.xml.namespace.QName( "", "InstallmentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentDueDt = new javax.xml.namespace.QName( "", "InstallmentDueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentNumber = new javax.xml.namespace.QName( "", "InstallmentNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstInstallmentPct = new javax.xml.namespace.QName( "", "FirstInstallmentPct", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.InstallmentInfo" );
    }
  };

  public InstallmentInfo() {
    super( -1176114219, TYPE.get() );
  }

  private InstallmentInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1176114219, state );
  }

  protected InstallmentInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected InstallmentInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.InstallmentInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.InstallmentInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentAmt getInstallmentAmt() {
    return (xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentAmt) TYPE.get().getPropertyValue( this, "_InstallmentAmt" );
  }


  public final void setInstallmentAmt( xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentAmt value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInstallmentDueDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InstallmentDueDt" );
  }


  public final void setInstallmentDueDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentDueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentDueDt getInstallmentDueDt_elem() {
    return (xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentDueDt) TYPE.get().getPropertyValue( this, "_InstallmentDueDt_elem" );
  }


  public final void setInstallmentDueDt_elem( xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentDueDt value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInstallmentNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InstallmentNumber" );
  }


  public final void setInstallmentNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentNumber getInstallmentNumber_elem() {
    return (xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentNumber) TYPE.get().getPropertyValue( this, "_InstallmentNumber_elem" );
  }


  public final void setInstallmentNumber_elem( xsd.iso.req.anonymous.elements.InstallmentInfo_InstallmentNumber value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstInstallmentPct() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FirstInstallmentPct" );
  }


  public final void setFirstInstallmentPct( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FirstInstallmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InstallmentInfo_FirstInstallmentPct getFirstInstallmentPct_elem() {
    return (xsd.iso.req.anonymous.elements.InstallmentInfo_FirstInstallmentPct) TYPE.get().getPropertyValue( this, "_FirstInstallmentPct_elem" );
  }


  public final void setFirstInstallmentPct_elem( xsd.iso.req.anonymous.elements.InstallmentInfo_FirstInstallmentPct value ) {
    TYPE.get().setPropertyValue( this, "_FirstInstallmentPct_elem", value );
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
