package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.testharness.v3.GUnitTestClass

class ECFMessageClaimResponseRq_ExtIndicatorsEnhancementTest extends GUnitTestClass {

  private var newClaimNotify : ECFMessageClaimNotifyRq_Ext
  private var newClaimResponse : ECFMessageClaimResponseRq_Ext

  private final var INTERVAL_12 = 12
  private final var INTERVAL_15 = 15

  function beforeMethod() {
    super.beforeMethod()
    newClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    newClaimResponse = ECFMessageEntityUtil.createClaimResponseRq()
    newClaimResponse.ReferredUUID = newClaimNotify.UUID
  }

  function afterMethod(t: Throwable) {
    super.afterMethod(t)
    newClaimNotify = null
    newClaimResponse = null
  }

  function testGetChaseUpIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.ChaseUpIndicator = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.ChaseUpIndicatorBoolean)
  }

  function testGetChaseUpIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ChaseUpIndicator = null
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.ChaseUpIndicatorBoolean)
  }

  function testSetChaseUpIndicatorBooleanTrueWhileDefaultValueTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimNotify.ChaseUpIndicatorInterval = 12
      newClaimResponse.ChaseUpIndicator = null
      newClaimResponse.ChaseUpIndicatorInterval = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorBoolean = true
    assertNull(newClaimResponse.ChaseUpIndicator)
  }

  function testSetChaseUpIndicatorBooleanTrueWhileDefaultValueFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ChaseUpIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorBoolean = true
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.ChaseUpIndicator)
  }

  function testSetChaseUpIndicatorBooleanFalseWhileDefaultValueTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.ChaseUpIndicator = null
      newClaimResponse.ChaseUpIndicatorInterval = INTERVAL_15
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.ChaseUpIndicator)
    assertNull(newClaimResponse.ChaseUpIndicatorInterval)
  }

  function testSetChaseUpIndicatorBooleanFalseWhileDefaultValueFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ChaseUpIndicator = null
      newClaimResponse.ChaseUpIndicatorInterval = INTERVAL_15
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorBoolean = false
    assertNull(newClaimResponse.ChaseUpIndicator)
    assertNull(newClaimResponse.ChaseUpIndicatorInterval)
  }

  function testGetChaseUpIndicatorIntervalIntegerFilled() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicatorInterval = INTERVAL_15
      newClaimResponse.ChaseUpIndicatorInterval = null
    }, User.util.getUnrestrictedUser())
    assertEquals(INTERVAL_15, newClaimResponse.ChaseUpIndicatorIntervalInteger)
  }

  function testGetChaseUpIndicatorIntervalIntegerDefault() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicatorInterval = null
      newClaimResponse.ChaseUpIndicatorInterval = null
    }, User.util.getUnrestrictedUser())
    assertEquals(INTERVAL_12, newClaimResponse.ChaseUpIndicatorIntervalInteger)
  }

  function testSetChaseUpIndicatorIntervalIntegerChanged() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimNotify.ChaseUpIndicatorInterval = INTERVAL_15
      newClaimResponse.ChaseUpIndicator = null
      newClaimResponse.ChaseUpIndicatorInterval = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorIntervalInteger = INTERVAL_12
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.ChaseUpIndicator)
    assertEquals(INTERVAL_12, newClaimResponse.ChaseUpIndicatorInterval)
  }

  function testSetChaseUpIndicatorIntervalIntegerNotChanged() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ChaseUpIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimNotify.ChaseUpIndicatorInterval = INTERVAL_15
      newClaimResponse.ChaseUpIndicator = null
      newClaimResponse.ChaseUpIndicatorInterval = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ChaseUpIndicatorIntervalInteger = INTERVAL_15
    assertNull(newClaimResponse.ChaseUpIndicator)
    assertNull(newClaimResponse.ChaseUpIndicatorInterval)
  }

  function testGetSimultaneousRIPIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.SimultaneousRIPIndicator = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.SimultaneousRIPIndicatorBoolean)
  }

  function testGetSimultaneousRIPIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.N.IntegrationCode
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SimultaneousRIPIndicator = null
    assertFalse(newClaimResponse.SimultaneousRIPIndicatorBoolean)
  }

  function testSetSimultaneousRIPIndicatorBooleanTrueWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.SimultaneousRIPIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SimultaneousRIPIndicatorBoolean = true
    assertNull(newClaimResponse.SimultaneousRIPIndicator)
  }

  function testSetSimultaneousRIPIndicatorBooleanTrueWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.SimultaneousRIPIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SimultaneousRIPIndicatorBoolean = true
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.SimultaneousRIPIndicator)
  }

  function testSetSimultaneousRIPIndicatorBooleanFalseWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.SimultaneousRIPIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SimultaneousRIPIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.SimultaneousRIPIndicator)
  }

  function testSetSimultaneousRIPIndicatorBooleanFalseWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SimultaneousReinstatementReq = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.SimultaneousRIPIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SimultaneousRIPIndicatorBoolean = false
    assertNull(newClaimResponse.SimultaneousRIPIndicator)
  }

  function testGetCedantInLiquidationIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.CedantInLiquidationIndicatorBoolean)
  }

  function testGetCedantInLiquidationIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.CedantInLiquidationIndicatorBoolean)
  }

  function testSetCedantInLiquidationIndicatorBooleanTrueWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CedantInLiquidationIndicatorBoolean = true
    assertNull(newClaimResponse.CedantInLiquidationIndicator)
  }

  function testSetCedantInLiquidationIndicatorBooleanTrueWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CedantInLiquidationIndicatorBoolean = true
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.CedantInLiquidationIndicator)
  }

  function testSetCedantInLiquidationIndicatorBooleanFalseWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CedantInLiquidationIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.CedantInLiquidationIndicator)
  }

  function testSetCedantInLiquidationIndicatorBooleanFalseWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CedantInLiquidationIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.CedantInLiquidationIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CedantInLiquidationIndicatorBoolean = false
    assertNull(newClaimResponse.CedantInLiquidationIndicator)
  }

  function testGetNoFurtherResponseIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NoFurtherResponseIndicator = ECFIndicatorEnum.Y.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.NoFurtherResponseIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.NoFurtherResponseIndicator)
  }

  function testGetNoFurtherResponseIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NoFurtherResponseIndicator = ECFIndicatorEnum.N.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.NoFurtherResponseIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.NoFurtherResponseIndicator)
  }

  function testSetNoFurtherResponseIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NoFurtherResponseIndicatorBoolean = true
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.NoFurtherResponseIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.NoFurtherResponseIndicator)
  }

  function testSetNoFurtherResponseIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NoFurtherResponseIndicatorBoolean = false
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.NoFurtherResponseIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.NoFurtherResponseIndicator)
  }

  function testGetImmediatePartCollectionIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.ImmediatePartCollectionIndicatorBoolean)
  }

  function testGetImmediatePartCollectionIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.ImmediatePartCollectionIndicatorBoolean)
  }

  function testSetImmediatePartCollectionIndicatorBooleanTrueWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ImmediatePartCollectionIndicatorBoolean = true
    assertNull(newClaimResponse.ImmediatePartCollectionInd)
  }

  function testSetImmediatePartCollectionIndicatorBooleanTrueWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ImmediatePartCollectionIndicatorBoolean = true
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.ImmediatePartCollectionInd)
  }

  function testSetImmediatePartCollectionIndicatorBooleanFalseWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ImmediatePartCollectionIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.ImmediatePartCollectionInd)
  }

  function testSetImmediatePartCollectionIndicatorBooleanFalseWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.ImmediatePartCollectionInd = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.ImmediatePartCollectionInd = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.ImmediatePartCollectionIndicatorBoolean = false
    assertNull(newClaimResponse.ImmediatePartCollectionInd)
  }

  function testGetMultipleResponseIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.MultipleResponseIndicatorBoolean)
  }

  function testGetMultipleResponseIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.MultipleResponseIndicatorBoolean)
  }

  function testSetMultipleResponseIndicatorBooleanTrueWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.MultipleResponseIndicatorBoolean = true
    assertNull(newClaimResponse.MultipleResponseIndicator)
  }

  function testSetMultipleResponseIndicatorBooleanTrueWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.MultipleResponseIndicatorBoolean = true
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.MultipleResponseIndicator)
  }

  function testSetMultipleResponseIndicatorBooleanFalseWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.MultipleResponseIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.MultipleResponseIndicator)
  }

  function testSetMultipleResponseIndicatorBooleanFalseWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.MultipleResponseIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.MultipleResponseIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.MultipleResponseIndicatorBoolean = false
    assertNull(newClaimResponse.MultipleResponseIndicator)
  }

  function testGetXcsToAgreeIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.XcsToAgreeIndicatorBoolean)
  }

  function testGetXcsToAgreeIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.XcsToAgreeIndicatorBoolean)
  }

  function testSetXcsToAgreeIndicatorBooleanTrueWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.XcsToAgreeIndicatorBoolean = true
    assertNull(newClaimResponse.XcsToAgreeIndicator)
  }

  function testSetXcsToAgreeIndicatorBooleanTrueWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
      newClaimResponse.XcsToAgreeIndicatorBoolean = true
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.XcsToAgreeIndicator)
  }

  function testSetXcsToAgreeIndicatorBooleanFalseWhileTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.Y.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.XcsToAgreeIndicatorBoolean = false
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.XcsToAgreeIndicator)
  }

  function testSetXcsToAgreeIndicatorBooleanFalseWhileFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.XcsToAgreeIndicator = ECFIndicatorEnum.N.IntegrationCode
      newClaimResponse.XcsToAgreeIndicator = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.XcsToAgreeIndicatorBoolean = false
    assertNull(newClaimResponse.XcsToAgreeIndicator)
  }

  function testGetMinorPrecautionaryIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.MinorPrecautionaryIndicator = ECFIndicatorEnum.Y.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.MinorPrecautionaryIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.MinorPrecautionaryIndicator)
  }

  function testGetMinorPrecautionaryIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.MinorPrecautionaryIndicator = ECFIndicatorEnum.N.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.MinorPrecautionaryIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.MinorPrecautionaryIndicator)
  }

  function testSetMinorPrecautionaryIndicatorBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.MinorPrecautionaryIndicatorBoolean = true
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.MinorPrecautionaryIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.MinorPrecautionaryIndicator)
  }

  function testSetMinorPrecautionaryIndicatorBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.MinorPrecautionaryIndicatorBoolean = false
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.MinorPrecautionaryIndicatorBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.MinorPrecautionaryIndicator)
  }

  function testGetAllUnderwritersToSeeFileIndBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.AllUnderwritersToSeeFileInd = ECFIndicatorEnum.Y.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.AllUnderwritersToSeeFileIndBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.AllUnderwritersToSeeFileInd)
  }

  function testGetAllUnderwritersToSeeFileIndBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.AllUnderwritersToSeeFileInd = ECFIndicatorEnum.N.IntegrationCode
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.AllUnderwritersToSeeFileIndBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.AllUnderwritersToSeeFileInd)
  }

  function testSetAllUnderwritersToSeeFileIndBooleanTrue() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.AllUnderwritersToSeeFileIndBoolean = true
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.AllUnderwritersToSeeFileIndBoolean)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, newClaimResponse.AllUnderwritersToSeeFileInd)
  }

  function testSetAllUnderwritersToSeeFileIndBooleanFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.AllUnderwritersToSeeFileIndBoolean = false
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.AllUnderwritersToSeeFileIndBoolean)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, newClaimResponse.AllUnderwritersToSeeFileInd)
  }
}