package gw.processes;

uses gw.api.locale.DisplayKey
uses gw.solr.utils.CCSolrClient

@Export
public class SolrDataImportBatchProcess extends BatchProcessBase {

  private static final var docType = "claimcontact"

  construct() {
    super(BatchProcessType.TC_SOLRDATAIMPORT);
  }

  override function doWork() {
    new CCSolrClient().bulkLoad(docType)
  }

  override property get Exclusive() : boolean {
    return true
  }

  override function requestTermination() : boolean {
    return false
  }
}
