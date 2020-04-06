/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class NonOwnedInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NonOwnedInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonOwnedClassCd = new javax.xml.namespace.QName( "", "NonOwnedClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonOwnedGroupTypeCd = new javax.xml.namespace.QName( "", "NonOwnedGroupTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumNonOwned = new javax.xml.namespace.QName( "", "NumNonOwned", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonOwnedPct = new javax.xml.namespace.QName( "", "NonOwnedPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.NonOwnedInfo_Type" );
    }
  };

  public NonOwnedInfo_Type() {
    super( -386559892, TYPE.get() );
  }

  private NonOwnedInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -386559892, state );
  }

  protected NonOwnedInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected NonOwnedInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.NonOwnedInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.NonOwnedInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonOwnedClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NonOwnedClassCd" );
  }


  public final void setNonOwnedClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonOwnedClassCd getNonOwnedClassCd_elem() {
    return (xsd.acord.NonOwnedClassCd) TYPE.get().getPropertyValue( this, "_NonOwnedClassCd_elem" );
  }


  public final void setNonOwnedClassCd_elem( xsd.acord.NonOwnedClassCd value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.NonOwnedAutoCategory getNonOwnedGroupTypeCd() {
    return (xsd.acord.enums.NonOwnedAutoCategory) TYPE.get().getPropertyValue( this, "_NonOwnedGroupTypeCd" );
  }


  public final void setNonOwnedGroupTypeCd( xsd.acord.enums.NonOwnedAutoCategory value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedGroupTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonOwnedGroupTypeCd getNonOwnedGroupTypeCd_elem() {
    return (xsd.acord.NonOwnedGroupTypeCd) TYPE.get().getPropertyValue( this, "_NonOwnedGroupTypeCd_elem" );
  }


  public final void setNonOwnedGroupTypeCd_elem( xsd.acord.NonOwnedGroupTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedGroupTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumNonOwned() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumNonOwned" );
  }


  public final void setNumNonOwned( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumNonOwned", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumNonOwned getNumNonOwned_elem() {
    return (xsd.acord.NumNonOwned) TYPE.get().getPropertyValue( this, "_NumNonOwned_elem" );
  }


  public final void setNumNonOwned_elem( xsd.acord.NumNonOwned value ) {
    TYPE.get().setPropertyValue( this, "_NumNonOwned_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNonOwnedPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NonOwnedPct" );
  }


  public final void setNonOwnedPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonOwnedPct getNonOwnedPct_elem() {
    return (xsd.acord.NonOwnedPct) TYPE.get().getPropertyValue( this, "_NonOwnedPct_elem" );
  }


  public final void setNonOwnedPct_elem( xsd.acord.NonOwnedPct value ) {
    TYPE.get().setPropertyValue( this, "_NonOwnedPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPE.get().getPropertyValue( this, "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPE.get().setPropertyValue( this, "_CreditOrSurcharge", value );
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