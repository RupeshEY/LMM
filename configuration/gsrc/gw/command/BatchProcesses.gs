package gw.command
uses gw.batchprocess.BatchProcessTestUtil
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.quickjump.Argument

@DefaultMethod("withDefault")
@Export
class BatchProcesses extends CCBaseCommand {
  
  function financialsEscalation() {
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd(BatchProcessType.TC_FINANCIALSESC, 100000, {})
  }

  function bulkInvoicesEscalation() {
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd(BatchProcessType.TC_BULKINVOICEESC, 100000, {})
  }

  function exchangeRate() {
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd(BatchProcessType.TC_EXCHANGERATE, 100000, {})
  }

  //Added the full list of available batch processes
  @Argument("Batch Process", BatchProcessType.getTypeKeys(false)*.toString())
  function byName() {
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd(typekey.BatchProcessType.get(Argument.toLowerCase()), 100000, {})
  }

  // I haven't figured out a way to call the batch processes that require the server to be in
  // maintenance mode, since you can't be logged in through the UI when the server
  // is in maintenance mode.

  
  function withDefault() {
// One test to run all batch processes, and manually check the server log for exceptions/errors after the test.        
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_ACTIVITYESC, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_AGGLIMITCALC, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_BULKINVOICEESC, 100000, {} )              
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_BULKINVOICESUBMISSION, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_BULKINVOICEWF, 100000, {} )   
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_BULKPURGE, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_CATASTROPHECLAIMFINDER, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_CLAIMCONTACTSCALC, 100000, {} )   
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_CLAIMEXCEPTION, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_CLAIMHEALTHCALC, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_CONTACTAUTOSYNC, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_DASHBOARDSTATISTICS, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_EXCHANGERATE, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_FINANCIALSCALC, 100000, {} )   
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_FINANCIALSESC, 100000, {} )
   //Commment out GEOCODE batchprocess since this needs the Geocode setup and will be manually tested  
    //BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_GEOCODE, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_GROUPEXCEPTION, 100000, {} )   
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_REVIEWSYNC, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_STATISTICS, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_TACCOUNTESC, 100000, {} )   
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_USEREXCEPTION, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_WORKFLOW, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_WORKQUEUEINSTRUMENTATIONPURGE, 100000, {} )
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_DATADISTRIBUTION, 100000, {} )
    // TC_DBSTATS requires null to indicate that there are no args
    BatchProcessTestUtil.startAndWaitUntilWorkFinishedEndToEnd( BatchProcessType.TC_DBSTATS, 100000, null )
    // TC_CLAIMVALIDATION does not appear here because it requires a specific loadcommandid
  }
}