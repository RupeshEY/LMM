package gw.command
uses gw.util.financials.FinancialsTestUtil
uses gw.api.database.Query
uses com.guidewire.pl.quickjump.Argument

@Export
class Financials extends CCBaseCommand {

  @Argument("Check number", "1")
  function denyCheckByCheckNumber() {
    var checkResult = gw.api.database.Query.make(entity.Check).compare("CheckNumber", Equals, Argument).select()
    if( checkResult.getCount() == 0 ) {
      displayMessageAndExit("check not found")
    }
    if( checkResult.getCount() > 1 ) {
      displayMessageAndExit("multiple checks found with CheckNumber '"+Argument+"' found")
    }
    var check = checkResult.getFirstResult()
    Bundle.add( check )
    check.denyCheck()
    Bundle.commit()
  }
  
  @Argument("public ID", "cc:101")
  function denyCheckByPublicID() {
    var checkResult = gw.api.database.Query.make(entity.Check).compare("PublicID", Equals, Argument).select()
    if( checkResult.getCount() == 0 ) {
      displayMessageAndExit("check with PublicID '"+Argument+"' not found")
    }
    // should be impossible for there to be multiple results
    var check = checkResult.getFirstResult()
    Bundle.add( check )
    check.denyCheck()
    Bundle.commit()
  }
  
  function ackAll() {
    FinancialsTestUtil.ackAll()
  }
  
  @Argument("public ID", "cc:101")
  function ackTxnByPID() {
    var txn = Query.make(Transaction).compare("PublicID", Equals, Argument).select().single()
    FinancialsTestUtil.ackTransaction(txn)
  }
  
  @Argument("public ID", "cc:101")
  function ackCheckByPID() {
    var check = Query.make(Check).compare("PublicID", Equals, Argument).select().single()
    FinancialsTestUtil.ackCheck(check)
  }
  
  @Argument("public ID", "cc:101")
  function ackInvoiceByPID() {
    var invoice = Query.make(BulkInvoice).compare("PublicID", Equals, Argument).select().single()
    FinancialsTestUtil.ackInvoice(invoice)
  }

}
