<% uses gw.fest.fester.FesterName %><%@ params(type : FesterName) %>
  /** Custom assert type for ${type.TypeName} */
  function assertThat(${type.Identifier} : ${type.TypeName}) : ${type.TypeName}Assert {
    return new ${type.TypeName}Assert(${type.Identifier})
  }
