/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class IntegrityCheckStagingTableContentsAsBatchProcess extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClearErrorTable = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "clearErrorTable", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PopulateExclusionTable = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "populateExclusionTable", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllowRefsToExistingNonAdminRows = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "allowRefsToExistingNonAdminRows", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumThreadsIntegrityChecking = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "numThreadsIntegrityChecking", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.IntegrityCheckStagingTableContentsAsBatchProcess" );
    }
  };

  public IntegrityCheckStagingTableContentsAsBatchProcess() {
    super( -79084621, TYPE.get() );
  }

  private IntegrityCheckStagingTableContentsAsBatchProcess( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -79084621, state );
  }

  protected IntegrityCheckStagingTableContentsAsBatchProcess( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected IntegrityCheckStagingTableContentsAsBatchProcess( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.IntegrityCheckStagingTableContentsAsBatchProcess> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.IntegrityCheckStagingTableContentsAsBatchProcess get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getClearErrorTable() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ClearErrorTable" );
  }


  public final void setClearErrorTable( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ClearErrorTable", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_ClearErrorTable getClearErrorTable_elem() {
    return (wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_ClearErrorTable) TYPE.get().getPropertyValue( this, "_ClearErrorTable_elem" );
  }


  public final void setClearErrorTable_elem( wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_ClearErrorTable value ) {
    TYPE.get().setPropertyValue( this, "_ClearErrorTable_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPopulateExclusionTable() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PopulateExclusionTable" );
  }


  public final void setPopulateExclusionTable( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PopulateExclusionTable", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_PopulateExclusionTable getPopulateExclusionTable_elem() {
    return (wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_PopulateExclusionTable) TYPE.get().getPropertyValue( this, "_PopulateExclusionTable_elem" );
  }


  public final void setPopulateExclusionTable_elem( wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_PopulateExclusionTable value ) {
    TYPE.get().setPropertyValue( this, "_PopulateExclusionTable_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAllowRefsToExistingNonAdminRows() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AllowRefsToExistingNonAdminRows" );
  }


  public final void setAllowRefsToExistingNonAdminRows( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AllowRefsToExistingNonAdminRows", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_AllowRefsToExistingNonAdminRows getAllowRefsToExistingNonAdminRows_elem() {
    return (wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_AllowRefsToExistingNonAdminRows) TYPE.get().getPropertyValue( this, "_AllowRefsToExistingNonAdminRows_elem" );
  }


  public final void setAllowRefsToExistingNonAdminRows_elem( wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_AllowRefsToExistingNonAdminRows value ) {
    TYPE.get().setPropertyValue( this, "_AllowRefsToExistingNonAdminRows_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumThreadsIntegrityChecking() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumThreadsIntegrityChecking" );
  }


  public final void setNumThreadsIntegrityChecking( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumThreadsIntegrityChecking", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_NumThreadsIntegrityChecking getNumThreadsIntegrityChecking_elem() {
    return (wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_NumThreadsIntegrityChecking) TYPE.get().getPropertyValue( this, "_NumThreadsIntegrityChecking_elem" );
  }


  public final void setNumThreadsIntegrityChecking_elem( wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAsBatchProcess_NumThreadsIntegrityChecking value ) {
    TYPE.get().setPropertyValue( this, "_NumThreadsIntegrityChecking_elem", value );
  }

}
