package gw.testharness.v3

uses com.guidewire.pl.system.server.Version

/**
 * Unit test that doesn't start the server with a databse . It's for quick local testing
 */
public abstract class GUnitUnitTestClass extends PLTestClass {

  construct() {
  }

  construct(name : String) {
    super(name)
  }

  property get AppName(): String {
    return Version.AppCode
  }

  property get FullAppName(): String {
    return Version.AppName
  }
}
