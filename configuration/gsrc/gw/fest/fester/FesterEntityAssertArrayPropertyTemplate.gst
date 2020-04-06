<% uses gw.fest.fester.FesterProperty %><%@ params(prop : FesterProperty) %>
  /**
   * Verify that the ${prop.OwnerName.Words} has ${prop.PropertyTypeName.WordsPlural} that satisfy the given ${prop.PropertyTypeName.Words} list assertion
   * @param ${prop.PropertyTypeName.Identifier}ListAssertEvaluator evaluator which will add conditions to the ${prop.PropertyTypeName.Words} list assertion;
   *   usually specified as a block when called from Gosu
   * @return this
   */
  public ${prop.MethodReturnType} with${prop.PropertyName.TypeName}(AssertEvaluator<List<${prop.PropertyTypeName.TypeName}>, ${prop.PropertyTypeName.TypeName}ListAssert> ${prop.PropertyTypeName.Identifier}ListAssertEvaluator) {
    return withArrayOfEntity(${prop.JavaAccessor}, ${prop.PropertyTypeName.TypeName}ListAssert.class, ${prop.PropertyTypeName.Identifier}ListAssertEvaluator);
  }
