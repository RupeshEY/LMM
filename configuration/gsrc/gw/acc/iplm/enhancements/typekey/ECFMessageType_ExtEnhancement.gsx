package gw.acc.iplm.enhancements.typekey

enhancement ECFMessageType_ExtEnhancement: ECFMessageType_Ext {

  /**
   * Checks if a given Message Type is an ECF Writeback message
   *
   * @return Boolean - True when the message is an ECF Writeback message, False otherwise
   */
  property get ECFWritebackType() : Boolean {
    return ECFMessageType_Ext.TF_ECFWRITEBACK.TypeKeys.contains(this)
  }

  /**
   * Checks if a given Message Type is an IMR message
   *
   * @return Boolean - True when the message is an IMR message, False otherwise
   */
  property get IMRType() : Boolean {
    return ECFMessageType_Ext.TF_IMR.TypeKeys.contains(this)
  }

  /**
   * Checks if a given Message Type is a Claim Movement message
   *
   * @return Boolean - True when the message is a Claim Movement message, False otherwise
   */
  property get ClaimMovementType() : Boolean {
    return ECFMessageType_Ext.TF_CLAIMMOVEMENT.TypeKeys.contains(this)
  }

  /**
   * Checks if a given Message Type is a SubMessage
   *
   * @return Boolean - True when the message is a Submessage, False otherwise
   */
  property get SubMessageType() : Boolean {
    return ECFMessageType_Ext.TF_SUBMESSAGE.TypeKeys.contains(this)
  }

}
