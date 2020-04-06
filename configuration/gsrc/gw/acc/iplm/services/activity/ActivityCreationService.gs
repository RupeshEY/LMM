package gw.acc.iplm.services.activity

uses entity.LMMessage_Ext


interface ActivityCreationService {

  /**
   * Processes activities for a given LMMessage_Ext entity
   * @param message
   */
  function createActivities(message: LMMessage_Ext)
}