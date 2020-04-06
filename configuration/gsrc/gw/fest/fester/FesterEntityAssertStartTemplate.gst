<% uses gw.fest.fester.FesterType %><%@ params(type : FesterType) %>
/**
 * Custom assert for ${type.Name.TypeName} entities
 */
@PublishInGosu
public class ${type.Name.TypeName}Assert extends ${type.BaseAssertClass}<${type.Name.TypeName}, ${type.Name.TypeName}Assert> {

  /**
   * Constructor, requires non null ${type.Name.Identifier}
   *
   * @param actual non null ${type.Name.Identifier}
   */
  public ${type.Name.TypeName}Assert(${type.Name.TypeName} actual) {
    super(actual);
  }
