<% uses gw.fest.fester.FesterProperty %><%@ params(prop : FesterProperty) %>
  /**
   * Is the ${prop.OwnerName.Words} ${prop.PropertyName.Words}?
   * @return this
   */
  public ${prop.MethodReturnType} is${prop.PropertyName.TypeName}() {
    return isPropertyEqualTo(${prop.JavaAccessor}, true);
  }

  /**
   * Is the ${prop.OwnerName.Words} not ${prop.PropertyName.Words}?
   * @return this
   */
  public ${prop.MethodReturnType} isNot${prop.PropertyName.TypeName}() {
    return isPropertyEqualTo(${prop.JavaAccessor}, false);
  }
