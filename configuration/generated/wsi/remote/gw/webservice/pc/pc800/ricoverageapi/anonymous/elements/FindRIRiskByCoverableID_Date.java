/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FindRIRiskByCoverableID_Date extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/reinsurance/RICoverageAPI", "date", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/reinsurance/RICoverageAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.ricoverageapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIRiskByCoverableID_Date" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.ricoverageapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date" );
    }
  };

  public FindRIRiskByCoverableID_Date() {
    super( -153904372, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date() );
  }

  public FindRIRiskByCoverableID_Date( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date typeInstance ) {
    super( -153904372, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FindRIRiskByCoverableID_Date( gw.internal.xml.XmlElementState state ) {
    super( -153904372, state );
  }

  public FindRIRiskByCoverableID_Date( java.util.Date value ) {
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
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIRiskByCoverableID_Date> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.simple.FindRIRiskByCoverableID_Date typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getValue() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date get$Value() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
