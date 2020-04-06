<% uses gw.fest.fester.FesterType %><%@ params(type : FesterType) %>
/**
 * Custom assert for ${type.Name.TypeName} entities
 */
@PublishInGosu
public class ${type.Name.TypeName}Assert extends ${type.Name.TypeName}AssertBase<${type.Name.TypeName},${type.Name.TypeName}Assert> {

  /**
   * Constructor, requires non null ${type.Name.Words}
   *
   * @param actual non null ${type.Name.Words}
   */
  public ${type.Name.TypeName}Assert(${type.Name.TypeName} actual) {
    super(actual);
  }

}
