/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrievePolicy extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration", "policyNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration", "asOfDate", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Filter = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration", "filter", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.types.complex.RetrievePolicy" );
    }
  };

  public RetrievePolicy() {
    super( 402825668, TYPE.get() );
  }

  private RetrievePolicy( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 402825668, state );
  }

  protected RetrievePolicy( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrievePolicy( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.types.complex.RetrievePolicy> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.types.complex.RetrievePolicy get$TypeInstance() {
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
  public final wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_PolicyNumber getPolicyNumber_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getAsOfDate() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_AsOfDate" );
  }


  public final void setAsOfDate( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_AsOfDate getAsOfDate_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_AsOfDate) TYPE.get().getPropertyValue( this, "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_AsOfDate value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_Filter getFilter() {
    return (wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_Filter) TYPE.get().getPropertyValue( this, "_Filter" );
  }


  public final void setFilter( wsi.remote.gw.webservice.pc.pc800.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_Filter value ) {
    TYPE.get().setPropertyValue( this, "_Filter", value );
  }

}
