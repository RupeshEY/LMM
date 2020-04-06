package gw.acc.iplm.config

uses gw.api.startable.StartablePluginCallbackHandler
uses gw.api.startable.StartablePluginState
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito


class LMConfigStartablePluginTest extends GUnitTestClass {
  private var _LMConfigStartablePlugin:LMConfigStartablePlugin

  override function afterMethod(t : Throwable) {
    super.afterMethod(t)
    _LMConfigStartablePlugin = null
  }

  override function beforeMethod() {
    super.beforeMethod()
    _LMConfigStartablePlugin = new LMConfigStartablePlugin()
  }

  /**
   * Test that the ECF Config startable plugin starts correctly
   */
  function testStarts() {
    var startablePluginCallbackHandlerMock = Mockito.mock(StartablePluginCallbackHandler)
    _LMConfigStartablePlugin.start(startablePluginCallbackHandlerMock, true)
    assertEquals(StartablePluginState.Started, _LMConfigStartablePlugin.State)
    assertNotNull(_LMConfigStartablePlugin.LLOYDS_COMPANIES)
    assertNotNull(_LMConfigStartablePlugin.LIRMA_COMPANIES)
    assertNotNull(_LMConfigStartablePlugin.ILU_COMPANIES)
    assertEquals(3, _LMConfigStartablePlugin.LLOYDS_COMPANIES.Count)
    assertEquals(3, _LMConfigStartablePlugin.LIRMA_COMPANIES.Count)
    assertEquals(3, _LMConfigStartablePlugin.ILU_COMPANIES.Count)
  }

  /**
   * Test that the ECF Config startable plugin stops correctly
   */
  function testStops() {
    _LMConfigStartablePlugin.stop(true)
    assertEquals(StartablePluginState.Stopped, _LMConfigStartablePlugin.State)
  }

}