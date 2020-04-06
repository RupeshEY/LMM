/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.tableimportapi.ports;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class TableImportAPI_Soap11Port extends gw.internal.xml.ws.WsdlPortImpl {

  public static final javax.xml.namespace.QName PORT_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "TableImportAPISoap11Port", "" );
  public static final javax.xml.namespace.QName SERVICE_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "TableImportAPI", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.ws.WsdlPortTypeDataImpl init() {
      return (gw.internal.xml.ws.WsdlPortTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.ports.TableImportAPI_Soap11Port" );
    }
  };
  public static final java.net.URI ADDRESS;

  static {
    try {
      ADDRESS = new java.net.URI( "local:///gw/wsi/pl/TableImportAPI/soap11" );
    }
    catch ( java.net.URISyntaxException ex ) {
      throw gw.internal.xml.util.ExceptionUtil.forceThrow( ex );
    }
  }

  public TableImportAPI_Soap11Port() {
    super( TYPE.get(), new gw.xml.ws.WsdlConfig() );
  }

  public TableImportAPI_Soap11Port( gw.xml.ws.WsdlConfig config ) {
    super( TYPE.get(), config );
  }


  public final gw.xml.XmlElement document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.XmlElement) invoke( "document_literal", new java.lang.Object[] { document } );
  }

  public final gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap11_envelope.Envelope> async_document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "document_literal", new java.lang.Object[] { document } );
  }


  public final void clearErrorTable() {
    invoke( "clearErrorTable", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearErrorTable() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearErrorTable", new java.lang.Object[] {} );
  }


  public final void clearErrorTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearErrorTableHeaders soapHeaders ) {
    invoke( "clearErrorTable", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearErrorTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearErrorTableHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearErrorTable", new java.lang.Object[] { soapHeaders } );
  }


  public final void clearExclusionTable() {
    invoke( "clearExclusionTable", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearExclusionTable() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearExclusionTable", new java.lang.Object[] {} );
  }


  public final void clearExclusionTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearExclusionTableHeaders soapHeaders ) {
    invoke( "clearExclusionTable", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearExclusionTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearExclusionTableHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearExclusionTable", new java.lang.Object[] { soapHeaders } );
  }


  public final void clearStagingTables() {
    invoke( "clearStagingTables", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearStagingTables() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearStagingTables", new java.lang.Object[] {} );
  }


  public final void clearStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearStagingTablesHeaders soapHeaders ) {
    invoke( "clearStagingTables", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_clearStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.ClearStagingTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "clearStagingTables", new java.lang.Object[] { soapHeaders } );
  }


  public final void deleteExcludedRowsFromStagingTables() {
    invoke( "deleteExcludedRowsFromStagingTables", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_deleteExcludedRowsFromStagingTables() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "deleteExcludedRowsFromStagingTables", new java.lang.Object[] {} );
  }


  public final void deleteExcludedRowsFromStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.DeleteExcludedRowsFromStagingTablesHeaders soapHeaders ) {
    invoke( "deleteExcludedRowsFromStagingTables", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_deleteExcludedRowsFromStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.DeleteExcludedRowsFromStagingTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "deleteExcludedRowsFromStagingTables", new java.lang.Object[] { soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID deleteExcludedRowsFromStagingTablesAsBatchProcess() {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "deleteExcludedRowsFromStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_deleteExcludedRowsFromStagingTablesAsBatchProcess() {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "deleteExcludedRowsFromStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID deleteExcludedRowsFromStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.DeleteExcludedRowsFromStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "deleteExcludedRowsFromStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_deleteExcludedRowsFromStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.DeleteExcludedRowsFromStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "deleteExcludedRowsFromStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }


  public final void populateExclusionTable() {
    invoke( "populateExclusionTable", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_populateExclusionTable() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "populateExclusionTable", new java.lang.Object[] {} );
  }


  public final void populateExclusionTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.PopulateExclusionTableHeaders soapHeaders ) {
    invoke( "populateExclusionTable", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_populateExclusionTable( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.PopulateExclusionTableHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "populateExclusionTable", new java.lang.Object[] { soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID populateExclusionTableAsBatchProcess() {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "populateExclusionTableAsBatchProcess", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_populateExclusionTableAsBatchProcess() {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "populateExclusionTableAsBatchProcess", new java.lang.Object[] {} );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID populateExclusionTableAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.PopulateExclusionTableAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "populateExclusionTableAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_populateExclusionTableAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.PopulateExclusionTableAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "populateExclusionTableAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }


  public final void updateStatisticsOnStagingTables() {
    invoke( "updateStatisticsOnStagingTables", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateStatisticsOnStagingTables() {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateStatisticsOnStagingTables", new java.lang.Object[] {} );
  }


  public final void updateStatisticsOnStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.UpdateStatisticsOnStagingTablesHeaders soapHeaders ) {
    invoke( "updateStatisticsOnStagingTables", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateStatisticsOnStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.UpdateStatisticsOnStagingTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateStatisticsOnStagingTables", new java.lang.Object[] { soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID updateStatisticsOnStagingTablesAsBatchProcess() {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "updateStatisticsOnStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_updateStatisticsOnStagingTablesAsBatchProcess() {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateStatisticsOnStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID updateStatisticsOnStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.UpdateStatisticsOnStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "updateStatisticsOnStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_updateStatisticsOnStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.UpdateStatisticsOnStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateStatisticsOnStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckStagingTableContents( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckStagingTableContents", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContents( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContents", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckStagingTableContents( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckStagingTableContents", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContents( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContents", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID integrityCheckStagingTableContentsAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "integrityCheckStagingTableContentsAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID integrityCheckStagingTableContentsAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "integrityCheckStagingTableContentsAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckStagingTableContentsAndLoadSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckStagingTableContentsAndLoadSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAndLoadSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAndLoadSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckStagingTableContentsAndLoadSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAndLoadSourceTablesHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckStagingTableContentsAndLoadSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAndLoadSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAndLoadSourceTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAndLoadSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Integer numThreadsIntegrityChecking ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, numThreadsIntegrityChecking } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Integer numThreadsIntegrityChecking ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, numThreadsIntegrityChecking } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckZoneStagingTableContentsAndLoadZoneSourceTablesHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult) invoke( "integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, numThreadsIntegrityChecking, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckZoneStagingTableContentsAndLoadZoneSourceTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.TableImportResult,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, numThreadsIntegrityChecking, soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess( java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows, java.lang.Integer numThreadsIntegrityChecking, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess", new java.lang.Object[] { clearErrorTable, populateExclusionTable, updateDBStatisticsWithEstimates, allowRefsToExistingNonAdminRows, numThreadsIntegrityChecking, soapHeaders } );
  }


  public final int encryptDataOnStagingTables() {
    return (java.lang.Integer) invoke( "encryptDataOnStagingTables", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap11_envelope.Envelope> async_encryptDataOnStagingTables() {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "encryptDataOnStagingTables", new java.lang.Object[] {} );
  }


  public final int encryptDataOnStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.EncryptDataOnStagingTablesHeaders soapHeaders ) {
    return (java.lang.Integer) invoke( "encryptDataOnStagingTables", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap11_envelope.Envelope> async_encryptDataOnStagingTables( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.EncryptDataOnStagingTablesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "encryptDataOnStagingTables", new java.lang.Object[] { soapHeaders } );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID encryptDataOnStagingTablesAsBatchProcess() {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "encryptDataOnStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_encryptDataOnStagingTablesAsBatchProcess() {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "encryptDataOnStagingTablesAsBatchProcess", new java.lang.Object[] {} );
  }


  public final wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID encryptDataOnStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.EncryptDataOnStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID) invoke( "encryptDataOnStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope> async_encryptDataOnStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.soapheaders.EncryptDataOnStagingTablesAsBatchProcessHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.wsi.pl.tableimportapi.types.complex.ProcessID,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "encryptDataOnStagingTablesAsBatchProcess", new java.lang.Object[] { soapHeaders } );
  }


  public final java.lang.String[] getLoadHistoryReportsInfo( int numDownloads ) {
    return (java.lang.String[]) invoke( "getLoadHistoryReportsInfo", new java.lang.Object[] { numDownloads } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String[],gw.xsd.w3c.soap11_envelope.Envelope> async_getLoadHistoryReportsInfo( int numDownloads ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String[],gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getLoadHistoryReportsInfo", new java.lang.Object[] { numDownloads } );
  }


  public final java.lang.String[] getLoadHistoryReportsInfo( int numDownloads, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.GetLoadHistoryReportsInfoHeaders soapHeaders ) {
    return (java.lang.String[]) invoke( "getLoadHistoryReportsInfo", new java.lang.Object[] { numDownloads, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String[],gw.xsd.w3c.soap11_envelope.Envelope> async_getLoadHistoryReportsInfo( int numDownloads, wsi.local.gw.wsi.pl.tableimportapi.soapheaders.GetLoadHistoryReportsInfoHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String[],gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getLoadHistoryReportsInfo", new java.lang.Object[] { numDownloads, soapHeaders } );
  }

}