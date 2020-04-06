package gw.acc.iplm.enhancements.entity

uses com.guidewire.pl.web.config.PCFTypeUtil
uses pcf.api.Location

/**
 * A Catastrophe Enhancement.
 */
enhancement ECFCatastropheEnhancement: Catastrophe {
  /**
   *  This method saves catastrophe and navigates to the given location.
   *  This method is using out of the box API, It allows you to overrides default behavior of Update button
   *  in Edit toolbar and works similar to it.
   *
   * @param location
   */
  public function saveCatastropheAndNavigateToLocation(location:Location){
    PCFTypeUtil.getLocationWidget(location).setPickedValueAndCommitChanges(this);
  }
}
