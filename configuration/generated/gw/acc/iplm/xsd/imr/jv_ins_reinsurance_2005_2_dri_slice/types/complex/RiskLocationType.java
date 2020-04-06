/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RiskLocationType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "RiskLocationType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Address", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludedLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "ExcludedLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RiskLocationType" );
    }
  };

  public RiskLocationType() {
    super( -1037962978, TYPE.get() );
  }

  private RiskLocationType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1037962978, state );
  }

  protected RiskLocationType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RiskLocationType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RiskLocationType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RiskLocationType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Address getAddress() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Address) TYPE.get().getPropertyValue( this, "_Address" );
  }


  public final void setAddress( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Address value ) {
    TYPE.get().setPropertyValue( this, "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Location getLocation() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ExcludedLocation getExcludedLocation() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ExcludedLocation) TYPE.get().getPropertyValue( this, "_ExcludedLocation" );
  }


  public final void setExcludedLocation( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ExcludedLocation value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.RiskLocationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.RiskLocationType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.RiskLocationType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}