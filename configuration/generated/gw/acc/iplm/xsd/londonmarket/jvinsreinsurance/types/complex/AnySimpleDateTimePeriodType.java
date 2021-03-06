/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AnySimpleDateTimePeriodType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AnySimpleDateTimePeriodType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnySimpleDateTimePeriodType" );
    }
  };

  public AnySimpleDateTimePeriodType() {
    super( -1316484270, TYPE.get() );
  }

  private AnySimpleDateTimePeriodType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1316484270, state );
  }

  protected AnySimpleDateTimePeriodType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AnySimpleDateTimePeriodType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnySimpleDateTimePeriodType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnySimpleDateTimePeriodType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StartDateTime" );
  }


  public final void setStartDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StartDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDateTime getStartDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDateTime) TYPE.get().getPropertyValue( this, "_StartDateTime_elem" );
  }


  public final void setStartDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDateTime value ) {
    TYPE.get().setPropertyValue( this, "_StartDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndDateTime" );
  }


  public final void setEndDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDateTime getEndDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDateTime) TYPE.get().getPropertyValue( this, "_EndDateTime_elem" );
  }


  public final void setEndDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDateTime value ) {
    TYPE.get().setPropertyValue( this, "_EndDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnySimpleDateTimePeriodType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnySimpleDateTimePeriodType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnySimpleDateTimePeriodType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
