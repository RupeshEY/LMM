package gw.acc.iplm.controller

uses gw.acc.iplm.utils.ECFConstants
uses pcf.api.Location

class LMActivityDetailsScreenController {


  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _activity: Activity
  private var _currentLocation: Location

  construct(activity: Activity, currentLocation: Location) {
    _activity = activity
    _currentLocation = currentLocation
  }

  /**
   * Rejects an Activity and commits the result to the database.
   * If the current location is not in edit mode, changes it first.
   */
  public function rejectActivity() {
    performActionAndCommit(\-> _activity.reject())
  }

  /**
   * Approves an activity and commits the result to the database.
   */
  public function approveActivity(){
    performActionAndCommit(\-> _activity.approve())
  }

  /**
   * Performs the action and then commits the result to the database.
   * If the location is not in edit mode, puts it in edit mode first.
   * @param action : the action to execute
   */
  private function performActionAndCommit(action : Runnable) {
    if (not _currentLocation.InEditMode) {
      _currentLocation.startEditing()
    }

    action.run()

    try {
      _currentLocation.commit()
    } catch(e: Exception) {
      LOGGER.warn("Failed while committing the transaction to update Activity ${_activity.PublicID}: ", e)
      resetActivityToInitialValues()
    }
  }

  /**
   * Resets the activity to its original values
   */
  private function resetActivityToInitialValues() {
    _activity.Status = _activity.getOriginalValue(Activity#Status)
    _activity.Approved = _activity.getOriginalValue(Activity#Approved)
  }
}