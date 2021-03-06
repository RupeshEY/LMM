/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PremiumAuditWorkCompInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PremiumAuditWorkCompInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnniversaryRatingDt = new javax.xml.namespace.QName( "", "AnniversaryRatingDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompIndividuals = new javax.xml.namespace.QName( "", "WorkCompIndividuals", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubcontractorInfo = new javax.xml.namespace.QName( "", "SubcontractorInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompAuditExposure = new javax.xml.namespace.QName( "", "WorkCompAuditExposure", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PremiumAuditWorkCompInfo_Type" );
    }
  };

  public PremiumAuditWorkCompInfo_Type() {
    super( -683806048, TYPE.get() );
  }

  private PremiumAuditWorkCompInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -683806048, state );
  }

  protected PremiumAuditWorkCompInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PremiumAuditWorkCompInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PremiumAuditWorkCompInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PremiumAuditWorkCompInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAnniversaryRatingDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AnniversaryRatingDt" );
  }


  public final void setAnniversaryRatingDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AnniversaryRatingDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnniversaryRatingDt getAnniversaryRatingDt_elem() {
    return (xsd.acord.AnniversaryRatingDt) TYPE.get().getPropertyValue( this, "_AnniversaryRatingDt_elem" );
  }


  public final void setAnniversaryRatingDt_elem( xsd.acord.AnniversaryRatingDt value ) {
    TYPE.get().setPropertyValue( this, "_AnniversaryRatingDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompIndividuals> getWorkCompIndividuals() {
    return (java.util.List<xsd.acord.WorkCompIndividuals>) TYPE.get().getPropertyValue( this, "_WorkCompIndividuals" );
  }


  public final void setWorkCompIndividuals( java.util.List<xsd.acord.WorkCompIndividuals> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompIndividuals", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SubcontractorInfo> getSubcontractorInfo() {
    return (java.util.List<xsd.acord.SubcontractorInfo>) TYPE.get().getPropertyValue( this, "_SubcontractorInfo" );
  }


  public final void setSubcontractorInfo( java.util.List<xsd.acord.SubcontractorInfo> value ) {
    TYPE.get().setPropertyValue( this, "_SubcontractorInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompAuditExposure> getWorkCompAuditExposure() {
    return (java.util.List<xsd.acord.WorkCompAuditExposure>) TYPE.get().getPropertyValue( this, "_WorkCompAuditExposure" );
  }


  public final void setWorkCompAuditExposure( java.util.List<xsd.acord.WorkCompAuditExposure> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompAuditExposure", value );
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
