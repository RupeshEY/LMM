/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Fee_FeeAmt extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FeeAmt", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ConversionRateRef = new javax.xml.namespace.QName( "", "ConversionRateRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.Fee_FeeAmt" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt" );
    }
  };

  public Fee_FeeAmt() {
    super( 1473040129, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt() );
  }

  public Fee_FeeAmt( xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt typeInstance ) {
    super( 1473040129, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Fee_FeeAmt( gw.internal.xml.XmlElementState state ) {
    super( 1473040129, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.Fee_FeeAmt> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.Fee_FeeAmt typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt" );
  }


  public final void setAmt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CURRENCY_Amt getAmt_elem() {
    return (xsd.iso.resp.anonymous.elements.CURRENCY_Amt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt_elem" );
  }


  public final void setAmt_elem( xsd.iso.resp.anonymous.elements.CURRENCY_Amt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCurCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurCd" );
  }


  public final void setCurCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CURRENCY_CurCd getCurCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CURRENCY_CurCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurCd_elem" );
  }


  public final void setCurCd_elem( xsd.iso.resp.anonymous.elements.CURRENCY_CurCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getConversionRateRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConversionRateRef" );
  }


  public final void setConversionRateRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConversionRateRef", value );
  }
}