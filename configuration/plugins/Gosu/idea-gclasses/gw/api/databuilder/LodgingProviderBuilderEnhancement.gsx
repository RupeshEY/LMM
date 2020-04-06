package gw.api.databuilder

@Export
enhancement LodgingProviderBuilderEnhancement : gw.api.databuilder.LodgingProviderBuilder {
  /**
   * Sets the Contact
   */
  function withContact(contact : Contact) : LodgingProviderBuilder {
    this.set(LodgingProvider#Contact, contact)
    return this
  }
}
