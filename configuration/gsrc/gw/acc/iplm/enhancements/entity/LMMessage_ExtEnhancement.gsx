package gw.acc.iplm.enhancements.entity

uses entity.LMMessage_Ext

enhancement LMMessage_ExtEnhancement: LMMessage_Ext {

  /**
   * Returns a string value of this message type which can be used in the UI.
   *
   * @return String
   */
  property get MessageTypeString(): String {
    final var messageTypeStringKey = this.MessageType.SubMessageType ? this.MessageType.toString() : this.Subtype.toString()

    return LMMessageTypeString_Ext.get(messageTypeStringKey)?.DisplayName ?: null
  }

}