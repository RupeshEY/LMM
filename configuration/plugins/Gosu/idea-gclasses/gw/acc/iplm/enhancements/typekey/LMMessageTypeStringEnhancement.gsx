package gw.acc.iplm.enhancements.typekey

uses com.guidewire.commons.typelist.TypeFilter

enhancement LMMessageTypeStringEnhancement: LMMessageTypeString_Ext {

  /**
   * Returns an array of TypeFilters from the LMMessageTypeString_Ext typelist
   * which are intended to be used for filtering messages in the UI.
   *
   * @return TypeFilter[]
   */
  static property get UITypeFilters(): TypeFilter[] {

    var excludedTypeFilters = {"Inbound", "Outbound"}

    var anyTypeKey = LMMessageTypeString_Ext.AllTypeKeys.first()
    var allTypeFilters = anyTypeKey.IntrinsicType.TypeFilters

    var resultTypeFilters = allTypeFilters.where(\elt -> not excludedTypeFilters.contains(elt.Name))

    return resultTypeFilters.toTypedArray()
  }
}
