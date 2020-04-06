/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AccountPeriodType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AccountPeriodType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PeriodNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PeriodNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AccountPeriodType" );
    }
  };

  public AccountPeriodType() {
    super( -1094969978, TYPE.get() );
  }

  private AccountPeriodType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1094969978, state );
  }

  protected AccountPeriodType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AccountPeriodType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AccountPeriodType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AccountPeriodType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StartDate" );
  }


  public final void setStartDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StartDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate getStartDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate) TYPE.get().getPropertyValue( this, "_StartDate_elem" );
  }


  public final void setStartDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate value ) {
    TYPE.get().setPropertyValue( this, "_StartDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndDate" );
  }


  public final void setEndDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate getEndDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate) TYPE.get().getPropertyValue( this, "_EndDate_elem" );
  }


  public final void setEndDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate value ) {
    TYPE.get().setPropertyValue( this, "_EndDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getPeriodNbr() {
    return (java.lang.Long) TYPE.get().getPropertyValue( this, "_PeriodNbr" );
  }


  public final void setPeriodNbr( java.lang.Long value ) {
    TYPE.get().setPropertyValue( this, "_PeriodNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PeriodNbr getPeriodNbr_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PeriodNbr) TYPE.get().getPropertyValue( this, "_PeriodNbr_elem" );
  }


  public final void setPeriodNbr_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PeriodNbr value ) {
    TYPE.get().setPropertyValue( this, "_PeriodNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AccountPeriodType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AccountPeriodType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AccountPeriodType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}