/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields" );
    }
  };

  public ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields() {
    super( 1575268790, TYPE.get() );
  }

  private ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1575268790, state );
  }

  protected ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber getPolicyNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.resp.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.resp.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossDt" );
  }


  public final void setLossDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt getLossDt_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt) TYPE.get().getPropertyValue( this, "_LossDt_elem" );
  }


  public final void setLossDt_elem( xsd.iso.resp.anonymous.elements.ComIso_Update_ComIso_OriginalFields_ComIso_KeyFields_LossDt value ) {
    TYPE.get().setPropertyValue( this, "_LossDt_elem", value );
  }

}
