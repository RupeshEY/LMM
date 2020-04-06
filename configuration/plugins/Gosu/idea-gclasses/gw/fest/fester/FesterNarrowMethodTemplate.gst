<% uses gw.fest.fester.FesterType %><%@ params(subtype : FesterType) %>
  /**
   * Verify that this ${subtype.Supertype.Name.Words} is of type ${subtype.Name.TypeName}, then return an appropriately typed custom assert that
   * can be used to check ${subtype.Name.TypeName} specific properties
   * @return a custom assert for type ${subtype.Name.TypeName}
   */
  public ${subtype.Name.TypeName}Assert narrowTo${subtype.Name.TypeName}() {
    return narrowToSubtype(${subtype.Name.TypeName}.class, ${subtype.Name.TypeName}Assert.class);
  }
