/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class VoyageType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "VoyageType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepartureDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DepartureDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LoadingOrEmbarkationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LoadingOrEmbarkationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepartureLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DepartureLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DestinationLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DestinationLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.VoyageType" );
    }
  };

  public VoyageType() {
    super( 1708984978, TYPE.get() );
  }

  private VoyageType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1708984978, state );
  }

  protected VoyageType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected VoyageType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.VoyageType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.VoyageType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDepartureDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DepartureDateTime" );
  }


  public final void setDepartureDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DepartureDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureDateTime getDepartureDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureDateTime) TYPE.get().getPropertyValue( this, "_DepartureDateTime_elem" );
  }


  public final void setDepartureDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureDateTime value ) {
    TYPE.get().setPropertyValue( this, "_DepartureDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLoadingOrEmbarkationDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LoadingOrEmbarkationDate" );
  }


  public final void setLoadingOrEmbarkationDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LoadingOrEmbarkationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LoadingOrEmbarkationDate getLoadingOrEmbarkationDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LoadingOrEmbarkationDate) TYPE.get().getPropertyValue( this, "_LoadingOrEmbarkationDate_elem" );
  }


  public final void setLoadingOrEmbarkationDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LoadingOrEmbarkationDate value ) {
    TYPE.get().setPropertyValue( this, "_LoadingOrEmbarkationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureLocation getDepartureLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureLocation) TYPE.get().getPropertyValue( this, "_DepartureLocation" );
  }


  public final void setDepartureLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DepartureLocation value ) {
    TYPE.get().setPropertyValue( this, "_DepartureLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DestinationLocation getDestinationLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DestinationLocation) TYPE.get().getPropertyValue( this, "_DestinationLocation" );
  }


  public final void setDestinationLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DestinationLocation value ) {
    TYPE.get().setPropertyValue( this, "_DestinationLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.VoyageType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.VoyageType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.VoyageType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
