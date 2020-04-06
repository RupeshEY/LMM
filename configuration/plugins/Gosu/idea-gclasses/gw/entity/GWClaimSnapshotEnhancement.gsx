package gw.entity

uses gw.api.snapshot.ClaimSnapshotUtil

@Export
enhancement GWClaimSnapshotEnhancement: ClaimSnapshot {

  property get ClaimDataUncompressed():String {
    return ClaimSnapshotUtil.getClaimDataUncompressedFromSnapshot(this)
  }

}
