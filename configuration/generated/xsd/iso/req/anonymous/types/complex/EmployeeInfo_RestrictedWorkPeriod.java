/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.req.types.complex.DURATION.class)
public class EmployeeInfo_RestrictedWorkPeriod extends xsd.iso.req.types.complex.DURATION {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartTime = new javax.xml.namespace.QName( "", "StartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndTime = new javax.xml.namespace.QName( "", "EndTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocalStandardTimeInd = new javax.xml.namespace.QName( "", "LocalStandardTimeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DurationPeriod = new javax.xml.namespace.QName( "", "DurationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContinuousInd = new javax.xml.namespace.QName( "", "ContinuousInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GB_BothDaysInclusiveInd = new javax.xml.namespace.QName( "", "GB.BothDaysInclusiveInd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.EmployeeInfo_RestrictedWorkPeriod" );
    }
  };

  public EmployeeInfo_RestrictedWorkPeriod() {
    super( 578198910, TYPE.get() );
  }

  private EmployeeInfo_RestrictedWorkPeriod( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 578198910, state );
  }

  protected EmployeeInfo_RestrictedWorkPeriod( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EmployeeInfo_RestrictedWorkPeriod( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.EmployeeInfo_RestrictedWorkPeriod> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.EmployeeInfo_RestrictedWorkPeriod get$TypeInstance() {
    return this;
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
