/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CheckPayeeDTO_DeductionType extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/CheckPayeeDTO", "DeductionType", "pogo7" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/CheckPayeeDTO", "pogo7" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.CheckPayeeDTO_DeductionType" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType" );
    }
  };

  public CheckPayeeDTO_DeductionType() {
    super( 757206735, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType() );
  }

  public CheckPayeeDTO_DeductionType( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType typeInstance ) {
    super( 757206735, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CheckPayeeDTO_DeductionType( gw.internal.xml.XmlElementState state ) {
    super( 757206735, state );
  }

  public CheckPayeeDTO_DeductionType( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType value ) {
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
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.CheckPayeeDTO_DeductionType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.types.simple.DeductionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType getValue() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.enums.DeductionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}