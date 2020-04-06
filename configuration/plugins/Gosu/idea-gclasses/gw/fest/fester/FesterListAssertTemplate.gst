<% uses gw.fest.fester.FesterName %>
<%@ params(type : FesterName) %>
/**
 * Assertions for lists of ${type.IdentifierPlural}
 */
@PublishInGosu
public class ${type.TypeName}ListAssert extends EntityListAssertBase<${type.TypeName}, ${type.TypeName}ListAssert> {

  /**
   * Constructor, requires non null list of ${type.TypeNamePlural}
   * @param description description of the list, used in error messages
   * @param actual non null list of ${type.TypeNamePlural}
   */
  public ${type.TypeName}ListAssert(String description, List<${type.TypeName}> actual) {
    super(description, actual);
  }

  /**
   * Evaluate the given callback (usually a block, if called from Gosu) passing in an ${type.TypeName}Assert
   * created from the currently picked value
   * @param ${type.Identifier}AssertEvaluator the callback or block, must not be null
   * @return this
   */
  public ${type.TypeName}ListAssert withPicked(AssertEvaluator<${type.TypeName}, ${type.TypeName}Assert> ${type.Identifier}AssertEvaluator) {
    return withPickedEntity(${type.TypeName}Assert.class, ${type.Identifier}AssertEvaluator);
  }

}
