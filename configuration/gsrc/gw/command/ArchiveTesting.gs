package gw.command
uses gw.api.archiving.ArchivingLogger
uses gw.api.databuilder.ClaimBuilder
uses gw.api.databuilder.SequentialIntegerGenerator
uses gw.plugin.Plugins
uses gw.plugin.archiving.IArchiveSource
uses gw.api.util.DisplayableException
uses gw.api.archiving.ArchivingUtil
uses java.lang.StringBuilder
uses com.guidewire.pl.quickjump.BaseCommand
uses com.guidewire.pl.quickjump.DefaultMethod

@DefaultMethod("withDefault")
@Export
class ArchiveTesting extends BaseCommand {
  static var _numGen = new SequentialIntegerGenerator(gw.api.database.Query.make(entity.Claim).select().Count + 1)
  
  function archive() {
    var foundVar = TopLocation.getVariable("Claim")
    var claim = foundVar.Value
    if (claim typeis Claim) {
      if (claim.Closed) {
        claim.ClaimInfo.scheduleForArchive()
        claim.Bundle.commit()
        com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache().evictBean(claim.ID)
        pcf.ArchiveInfo.go( )
      }
      else {
        throw new DisplayableException("Claim not closed");
      }
    }
    else {
      throw new DisplayableException("Need to be on a claim page");
    }
  }

  function refresh() {
    Plugins.get(IArchiveSource).refresh()
  }
  
  function incrementNumBy100() {
    var x = _numGen.create(null)
    _numGen = new SequentialIntegerGenerator(x + 100)
  }

  function sendQueueClaim() {
     newClaim("send:queue:")
  }

  function sendRetryClaim() {
     newClaim("send:retry:")
  }

  function sendDupRetryClaim() {
     newClaim("send:retryDup:")
  }

  function sendExceptionClaim() {
     newClaim("send:ex:")
  }

  function sendDupExceptionClaim() {
     newClaim("send:exDup:")
  }

  function sendFailClaim() {
     newClaim("send:fail:")
  }

  function recvOnClaim() {
     newClaim("recv:on:")
  }

  function recvOffClaim() {
     newClaim("recv:off:")
  }

  function recvExceptionClaim() {
     newClaim("recv:ex:")
  }

  function recvFailClaim() {
     newClaim("recv:fail:")
  }

  function delOnClaim() {
     newClaim("del:on:")
  }

  function delOffClaim() {
     newClaim("del:off:")
  }

  function delExceptionClaim() {
     newClaim("del:ex:")
  }

  function delFailClaim() {
     newClaim("del:fail:")
  }

  function quickClaim() {
    var claim = innerNewClaim("send:avail:")
    claim.ClaimInfo.scheduleForArchive()
    claim.Bundle.commit()
  }

  function quick10Claims() {
    var i = 0
    while (i > 10) {
      i++
      quickClaim()
    }
  }

  function wakeup() {
    ArchivingUtil.notifyWorkers()
  }

  function withDefault() {
    throw new DisplayableException("Archiving test util, expected a command of the following: "
      + "\n"
      + "\nincrementNumBy100 - increment num sequence by 100"
      + "\nwakeup - notify and wake up workers"
      + "\narchive - archive the current claim, requires on a claim screen"
      + "\nrefresh - resets send and recv status redoes status"
      + "\nquickClaim - create and schedule for archive a claim"
      + "\nquick10Claims - create and schedule for archive 10 claims"
      + "\n"
      + "\nSendFailClaim - throws an exception on store and fails future stores (use command refresh to clean)"
      + "\nSendExceptionClaim - excludes the Claim for archiving and throws a RuntimeExcepton"
      + "\nSendExceptionDupClaim - excludes the Claim for archiving and throws a RuntimeExcepton, under the same exclude reason"
      + "\nSendRetryClaim - throws a retryable exception"
      + "\nSendRetryDupClaim - throws a retryable exception, under the same exclude reason"
      + "\nSendQueueClaim - store is not available but will permit queuing additional claims. Run wakeup after running this to wake up workers"
      + "\n"
      + "\nRecvFailClaim - throws an exception on retrieval and fails future retrieval(use command refresh to clean)"
      + "\nRecvExceptionClaim - throws an exception on UI"
      + "\nRecvOffClaim - turns off further retrieval (use command refresh or RecvOnClaim to reset)"
      + "\nRecvOnClaim - turns on further retrievals"
      + "\n"
      + "\nDelFailClaim - throws an exception on delete and fails future delete(use command refresh to clean)"
      + "\nDelExceptionClaim - throws an exception on UI"
      + "\nDelOffClaim - turns off further delete (use command refresh or DelOnClaim to reset)"
      + "\nDelOnClaim - turns on further deletes"
      + "\n"
      + "\n Note: the claims created must be archived to execute the command (or retrieved to get the exception)")
  }

  private function newClaim(publicIdPrefix : String) : Claim {
    var claim = innerNewClaim(publicIdPrefix)
    pcf.ClaimSummary.go( claim )
    return claim
  }

  private function innerNewClaim(publicIdPrefix : String) : Claim {
      var id = _numGen.create(null)
      var id_str = id as String
      var claimNumber = new StringBuilder("000-00-000000")
      claimNumber.replace(claimNumber.length() - id_str.length(), claimNumber.length(), id_str)
    var claim = runWithNewBundle(\ bundle -> {
      var claim = ClaimBuilder
                     .uiReadyAuto()
                     .withPublicID(publicIdPrefix + _numGen.create(null))
                     .closed()
                     .assigned()
                     .withClaimNumber(claimNumber.toString())
                     .withAssignedGroupFoundByName("Auto1 - TeamA")
                     .withAssignedUserFoundByName("aapplegate")
                     .withSegment(TC_AUTO_LOW)
                     .create(bundle)
      return claim
    })
    pcf.ClaimSummary.go( claim )  
    ArchivingLogger.info("created claim:  " + claim.ClaimNumber + " with publicID = " + claim.PublicID)
    return claim
  }

}
