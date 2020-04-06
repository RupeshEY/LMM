<% uses gw.fest.fester.FesterProperty %><%@ params(prop : FesterProperty) %>
  /**
   * Verify that the ${prop.OwnerName.Words} has a ${prop.PropertyTypeName.Words} that satisfies the given ${prop.PropertyTypeName.Words} assertion
   * @param ${prop.PropertyTypeName.Identifier}AssertEvaluator evaluator which will add conditions to a ${prop.PropertyTypeName.Words} assertion; usually specified
   *   as a block when called from Gosu
   * @return this
   */
  public ${prop.MethodReturnType} with${prop.PropertyName.TypeName}(AssertEvaluator<${prop.PropertyTypeName.TypeName}, ${prop.PropertyTypeName.TypeName}Assert> ${prop.PropertyTypeName.Identifier}AssertEvaluator) {
    return withLinkedEntity(${prop.JavaAccessor}, ${prop.PropertyTypeName.TypeName}Assert.class, ${prop.PropertyTypeName.Identifier}AssertEvaluator);
  }
