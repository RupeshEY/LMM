package gw.testharness.v3

uses com.guidewire.pl.system.server.Version
uses gw.test.TestEnvironment
uses gw.testharness.remote.RemoteForwardingTestEnvironment
uses gw.testharness.remote.RemoteTestClass

uses java.lang.Exception
uses java.lang.System

public abstract class GUnitTestClass extends PLTestClass {

  construct() {
  }

  construct(name : String) {
    super(name)
  }

  function createDefaultEnvironment() : TestEnvironment {
    var localTestEnvironment = createLocalTestEnvironment()

    try {
      var host = System.Properties.getProperty("gw.testv3.host", "localhost")
      var port = System.Properties.getProperty("gw.testv3.port", "8090")
      var url = "http://${host}:${port}/${Version.AppCode}/NewTestServlet"
      RemoteTestClass.makeRemoteRequest(url, "ping")
      return new RemoteForwardingTestEnvironment(url, localTestEnvironment)
    } catch (e : Exception) {
      // No remote server available, so run locally
    }
    return localTestEnvironment
  }

  function createLocalTestEnvironment() : TestEnvironment {
    return new GUnitServerTestEnvironment ()
  }

  property get AppName(): String {
    return Version.AppCode
  }

  property get FullAppName(): String {
    return Version.AppName
  }
}
