/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AddressDTO_GeocodeStatus extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/AddressDTO", "GeocodeStatus", "pogo3" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/AddressDTO", "pogo3" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.AddressDTO_GeocodeStatus" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus" );
    }
  };

  public AddressDTO_GeocodeStatus() {
    super( 542568783, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus() );
  }

  public AddressDTO_GeocodeStatus( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus typeInstance ) {
    super( 542568783, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AddressDTO_GeocodeStatus( gw.internal.xml.XmlElementState state ) {
    super( 542568783, state );
  }

  public AddressDTO_GeocodeStatus( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.AddressDTO_GeocodeStatus> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.GeocodeStatus typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus getValue() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.GeocodeStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
