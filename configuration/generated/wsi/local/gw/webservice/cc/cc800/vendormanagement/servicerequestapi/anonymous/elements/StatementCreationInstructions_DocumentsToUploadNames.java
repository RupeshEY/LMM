/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class StatementCreationInstructions_DocumentsToUploadNames extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "DocumentsToUploadNames", "pogo19" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "Entry", "pogo19" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames" );
    }
  };

  public StatementCreationInstructions_DocumentsToUploadNames() {
    super( 492239446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames() );
  }

  public StatementCreationInstructions_DocumentsToUploadNames( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames typeInstance ) {
    super( 492239446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private StatementCreationInstructions_DocumentsToUploadNames( gw.internal.xml.XmlElementState state ) {
    super( 492239446, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.StatementCreationInstructions_DocumentsToUploadNames typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getEntry() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames_Entry> getEntry_elem() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry_elem" );
  }


  public final void setEntry_elem( java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry_elem", value );
  }

}
