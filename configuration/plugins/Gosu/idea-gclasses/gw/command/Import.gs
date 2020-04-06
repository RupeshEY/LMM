package gw.command

uses gw.sampledata.SampleDataGroup
uses com.guidewire.pl.quickjump.DefaultMethod

@DefaultMethod("withDefault")
@Export
class Import extends CCBaseCommand {

  construct() {
  }

  function sampleAdminData() {
    SampleDataGroup.Admin.load()
  }

  function fromDemoSampleData() {
    SampleDataGroup.Demo.load()
  }

  function fromTestSampleData() {
    SampleDataGroup.Test.load()
  }

  function fromMinimalTestData() {
    SampleDataGroup.MinimalTest.load()
  }

  function fromExchangeRateData() {
    SampleDataGroup.ExchangeRates.load()
  }

  function withDefault() {
    fromDemoSampleData()
  }
}
