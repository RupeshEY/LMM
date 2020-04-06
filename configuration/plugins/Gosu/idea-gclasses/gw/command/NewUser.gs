package gw.command
uses gw.api.databuilder.UserBuilder

@Export
class NewUser extends CCBaseCommand {
  function withDefault() {
    var numUsers = gw.api.database.Query.make(entity.User).select().Count
    var user = new UserBuilder()
      .withName("testuser", (numUsers+1) as String)
      .create(Bundle)
    Bundle.commit()
    pcf.UserDetailPage.go(user)
  }
}
