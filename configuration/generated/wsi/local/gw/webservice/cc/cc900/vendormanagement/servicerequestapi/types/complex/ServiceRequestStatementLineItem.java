/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ServiceRequestStatementLineItem extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestStatementLineItem", "ServiceRequestStatementLineItem", "pogo20" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestStatementLineItem", "pogo20" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amount = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestStatementLineItem", "Amount", "pogo20" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Category = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestStatementLineItem", "Category", "pogo20" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestStatementLineItem", "Description", "pogo20" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.ServiceRequestStatementLineItem" );
    }
  };

  public ServiceRequestStatementLineItem() {
    super( 185753736, TYPE.get() );
  }

  private ServiceRequestStatementLineItem( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 185753736, state );
  }

  protected ServiceRequestStatementLineItem( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ServiceRequestStatementLineItem( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.ServiceRequestStatementLineItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.ServiceRequestStatementLineItem get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmount() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Amount" );
  }


  public final void setAmount( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Amount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Amount getAmount_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Amount) TYPE.get().getPropertyValue( this, "_Amount_elem" );
  }


  public final void setAmount_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Amount value ) {
    TYPE.get().setPropertyValue( this, "_Amount_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.enums.ServiceRequestStatementLineItemCategory getCategory() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.enums.ServiceRequestStatementLineItemCategory) TYPE.get().getPropertyValue( this, "_Category" );
  }


  public final void setCategory( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.enums.ServiceRequestStatementLineItemCategory value ) {
    TYPE.get().setPropertyValue( this, "_Category", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Category getCategory_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Category) TYPE.get().getPropertyValue( this, "_Category_elem" );
  }


  public final void setCategory_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Category value ) {
    TYPE.get().setPropertyValue( this, "_Category_elem", value );
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
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Description getDescription_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestStatementLineItem_Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }

}
