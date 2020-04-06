<% uses gw.fest.fester.FesterType %><%@ params(type : FesterType) %>
/**
 * Base class for custom asserts for ${type.Name.TypeName} entities
 */
@PublishInGosu
public abstract class ${type.Name.TypeName}AssertBase<B extends ${type.Name.TypeName}, A extends ${type.Name.TypeName}AssertBase<B,A>> extends ${type.BaseAssertClass}<B,A> {

  /**
   * Constructor, requires non null ${type.Name.Identifier}
   *
   * @param actual non null ${type.Name.Identifier}
   */
  public ${type.Name.TypeName}AssertBase(B actual) {
    super(actual);
  }
