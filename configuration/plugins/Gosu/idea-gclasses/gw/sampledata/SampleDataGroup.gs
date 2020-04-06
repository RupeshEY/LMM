package gw.sampledata

uses gw.api.locale.DisplayKey
uses java.util.ArrayList
uses gw.pl.persistence.core.Bundle
uses java.lang.System
uses gw.api.testdata.TestDataUtil
uses java.lang.StringBuilder
uses gw.api.util.Logger
uses java.lang.RuntimeException
uses gw.api.util.DisplayableException
uses gw.api.util.LocaleUtil

/**
 * Enumeration that describes the different groupings of sample data and
 * provides a "load" method to load each group. A sample data group has a 
 * name and description plus a list of sample data sets that it loads.
 * Different groups may also call different methods on the data sets when
 * loading them for example "demoSampleData" vs "testSampleData".
 */
@Export
enum SampleDataGroup {
  Admin(
    true,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.AdminGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.AdminGroupDescription"),
    { SampleSeczonesRegions,
      SampleZones,
      SampleUsersGroups,
      SampleExchangeRates,
      SampleCatastrophes,
      SampleCustomerServiceTiers,
      SampleSpecialistServiceTree,
      SampleSpecialistServiceDetails,
      SampleMetricLimits,
      SampleRefTables,
      SampleXMLRefTables,
      SampleQuestions,
      SampleWeightWorkloadClassifications      
    },
    \ data, bundle -> data.demoSampleData(bundle)
  ),
  
  Test(
    false,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.TestGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.TestGroupDescription"),
    { SampleSeczonesRegions,
      SampleZones,
      SampleUsersGroups,
      SampleExchangeRates,
      SampleCatastrophes,
      SampleSpecialistServiceTree,
      SampleSpecialistServiceDetails,
      SampleCustomerServiceTiers,
      SampleWeightWorkloadClassifications,
      SampleClaims,
      SampleAggregateLimits,
      SampleAuthorityLimits,
      SampleMessages,
      SampleRefTables,
      SampleXMLRefTables,
      SampleContacts,
      SampleQuestions
    },
    \ data, bundle -> data.testSampleData(bundle)
  ),

  Demo(
    true,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.DemoGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.DemoGroupDescription"),
    { SampleSeczonesRegions,
      SampleZones,
      SampleUsersGroups,
      SampleExchangeRates,
      SampleCatastrophes,
      SampleCustomerServiceTiers,
      SampleSpecialistServiceTree,
      SampleSpecialistServiceDetails,
      SampleMetricLimits,
      SampleWeightWorkloadClassifications,
      SampleClaims,
      SampleAggregateLimits,
      SampleAuthorityLimits,
      SampleMessages,
      SampleRefTables,
      SampleXMLRefTables,
      SampleContacts,
      SampleQuestions
    },
    \ data, bundle -> data.demoSampleData(bundle)
  ),

  CatastropheSearch(
    true,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.CatastropheSearchGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.CatastropheSearchGroupDescription"),
    { SampleSeczonesRegions,   // matches 'Demo' above
      SampleZones,
      SampleUsersGroups,
      SampleExchangeRates,
      SampleCatastrophes,
      SampleCustomerServiceTiers,
      SampleSpecialistServiceTree,
      SampleSpecialistServiceDetails,
      SampleMetricLimits,
      SampleWeightWorkloadClassifications,
      SampleClaims,
      SampleAggregateLimits,
      SampleAuthorityLimits,
      SampleMessages,
      SampleRefTables,
      SampleXMLRefTables,
      SampleContacts,
      SampleQuestions,
      SampleCatastropheSearchCC    // plus catastrophe info
    },
    \ data, bundle -> data.demoSampleData(bundle)
    ),
    
  MinimalTest(
    false,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.MinimalTestGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.MinimalTestGroupDescription"),
    { SampleSeczonesRegions,
      SampleUsersGroups,
      SampleContacts,
      SampleSpecialistServiceTree,
      SampleSpecialistServiceDetails
    },
    \ data, bundle -> data.minimalTestSampleData(bundle)
  ),

  Solr ( // These are the additional data sets (in addition to those loaded by default) that are required by Solr tests.
    false,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.SolrGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.SolrGroupDescription"),
    { SampleZones,
      SampleCatastrophes,
      SampleMetricLimits,
      SampleClaims,
      SampleAggregateLimits,
      SampleMessages,
      SampleRefTables,
      SampleXMLRefTables,
      SampleQuestions
    },
    \ data, bundle -> data.demoSampleData(bundle)
  ),
  
  ExchangeRates(
    false,
    \ -> DisplayKey.get("Web.Tools.CCSampleData.ExchangeRateGroupName"),
    \ -> DisplayKey.get("Web.Tools.CCSampleData.ExchangeRateGroupDescription"),
    { SampleExchangeRates
    },
    \ data, bundle -> data.testSampleData(bundle)
  )




  private construct(
          visibleInUIParam : boolean,
          inGroupName : block() : String,
          inGroupDescription : block() : String,
          dataSetTypes : ArrayList<Type>,
          loadCall : block(data : SampleDataBase, bundle : Bundle)) {
    _visibleInUI = visibleInUIParam
    _groupName = inGroupName
    _groupDescription = inGroupDescription
    _dataSetTypes = dataSetTypes
    _loadCall = loadCall
  }
  
  var _visibleInUI : boolean as readonly VisibleInUI
  var _groupName : block() : String
  var _groupDescription : block() : String
  var _dataSetTypes : ArrayList<Type>
  var _loadCall : block(data : SampleDataBase, bundle : Bundle)

  property get GroupName() : String {
    return _groupName()
  }
  
  property get GroupDescription() : String {
    return _groupDescription()
  }
    
  function load() : String {
    var result = new StringBuilder()
    var start = System.currentTimeMillis()
    var cache = new SampleDataCache()
    for (type in _dataSetTypes) {
      var dataSetStart = System.currentTimeMillis()
      var constructor = type.TypeInfo.getConstructor({SampleDataCache})
      var dataSet = constructor.Constructor.newInstance({cache}) as SampleDataBase
      try {
        TestDataUtil.runWithNewBundleIgnoreMessageGeneration(\ b -> {
          LocaleUtil.runAsCurrentLanguage(LocaleUtil.DefaultLanguage, \ -> {
            _loadCall(dataSet, b)
          })
        })
      } catch (e : RuntimeException) {
        // Log exception here since RunCommand eats it. reopened PL-4847
        //var message = "Error loading sample data set: " + dataSet.Description
        var message = DisplayKey.get("Web.Tools.CCSampleData.ImportError", dataSet.Description)
        Logger.logError( message, e )
        // when PL-4847 is fixed, this should do the right thing. Otherwise, it's hopeless
        throw new DisplayableException(message, e)
      }
      var dataSetEnd = System.currentTimeMillis()
      var duration = formatDuration(dataSetEnd - dataSetStart)
      var message = DisplayKey.get("Web.Tools.CCSampleData.DataSetImportSucceeded", dataSet.Description, duration)
      Logger.logInfo(message)
      result.append(message).append("\n")
    }
    var end = System.currentTimeMillis()
    var duration = end - start
    var totalTimeMessage = DisplayKey.get("Web.Tools.CCSampleData.ImportComplete", formatDuration(duration))
    Logger.logInfo(totalTimeMessage)
    result.append(totalTimeMessage).append("\n")
    return result.toString()
  }
  
  private function formatDuration(millis : long) : String {
    if (millis < 0) {
      millis = -millis
    }
    var secs = (millis / 1000) as int
    if (millis % 1000 >= 500) {
      secs++
    }
    var mins = (secs / 60) % 60
    var hrs = secs / 3600
    secs = secs % 60
    return DisplayKey.get("Web.Tools.CCSampleData.DurationFormat", hrs, zeroPad(mins), zeroPad(secs))
  }

  private function zeroPad(twoDigitInt : int) : String {
    return twoDigitInt < 10 ? "0" + twoDigitInt : twoDigitInt as String
  }

}
