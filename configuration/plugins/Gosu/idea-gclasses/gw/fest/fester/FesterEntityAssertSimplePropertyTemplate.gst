<% uses gw.fest.fester.FesterProperty %><%@ params(prop : FesterProperty) %>
  /**
   * Does the ${prop.OwnerName.Words} have the given ${prop.PropertyName.Words}?
   * @param ${prop.PropertyName.Identifier} the desired ${prop.PropertyName.Words}
   * @return this
   */
  public ${prop.MethodReturnType} has${prop.PropertyName.TypeName}EqualTo(${prop.PropertyTypeName.TypeName} ${prop.PropertyName.Identifier}) {
    return isPropertyEqualTo(${prop.JavaAccessor}, ${prop.PropertyName.Identifier});
  }

  /**
   * Does the ${prop.OwnerName.Words} ${prop.PropertyName.Words} differ from the given value?
   * @param ${prop.PropertyName.Identifier} the ${prop.PropertyName.Words} the ${prop.OwnerName.Words} should not have
   * @return this
   */
  public ${prop.MethodReturnType} has${prop.PropertyName.TypeName}NotEqualTo(${prop.PropertyTypeName.TypeName} ${prop.PropertyName.Identifier}) {
    return isPropertyNotEqualTo(${prop.JavaAccessor}, ${prop.PropertyName.Identifier});
  }
