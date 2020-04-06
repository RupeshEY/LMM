package gw.entity
uses gw.datatype.DataTypes

@Export
enhancement GWMessageEnhancement : Message {
  
  /**
   * Sets the error descripton for this message but first checks that the message will fit into
   * the underlying database field. If it is too long it is truncated before being stored.
   */
  function safeSetErrorDescription(error : String) {
    var maxLength = DataTypes.get(Message.Type.TypeInfo.getProperty("ErrorDescription")).asPersistentDataType().Length
    if (error.length > maxLength) {
      error = error.substring(0, maxLength)
    }
    this.ErrorDescription = error
  }

}
