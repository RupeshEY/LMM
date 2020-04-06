package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum

/**
 * Indicator Enhancements for ClaimResponseRq messages.
 * This enhancement is just for indicators.
 * For other purposes, use {@link ECFMessageClaimResponseRq_ExtEnhancement}
 */
enhancement ECFMessageClaimResponseRq_ExtIndicatorsEnhancement: ECFMessageClaimResponseRq_Ext {

  /**
   * Sets the ChaseUpIndicator string value based on the provided boolean.
   * If indicator is set as false, interval is set as null.
   *
   * @param {@link boolean} chaseUpIndicatorBoolean
   */
  property set ChaseUpIndicatorBoolean(chaseUpIndicatorBoolean: boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(chaseUpIndicatorBoolean).IntegrationCode
    this.ChaseUpIndicator = newValue == this.ClaimDataResponded.ChaseUpIndicator ? null : newValue

    if(chaseUpIndicatorBoolean) {
      // Might seem strange, setting the Interval with the default value or the value from the Claim Notify message
      this.ChaseUpIndicatorIntervalInteger = this.ChaseUpIndicatorIntervalInteger
    } else {
      // If it is false, there is no meaning to have an interval, set it null
      this.ChaseUpIndicatorInterval = null
    }
  }

  /**
   * Gets a boolean representation of the ChaseUpIndicator.
   *
   * @return {@link boolean}
   */
  property get ChaseUpIndicatorBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.ChaseUpIndicator?:this.ClaimDataResponded.ChaseUpIndicator)
  }

  /**
   * Sets the ChaseUpIndicatorInterval
   * If the value is the same as the {@link entity.ECFMessageClaimData_Ext} this response
   * is for, a null value will be set.
   * If interval value has been changed to be different than related message, indicator is set as true in order to
   * having changes in the XML.
   *
   * @param {@link java.lang.Integer} chaseUpIndicatorInterval
   */
  property set ChaseUpIndicatorIntervalInteger(chaseUpIndicatorInterval: Integer) {
    if (chaseUpIndicatorInterval == this.ClaimDataResponded.ChaseUpIndicatorInterval) {
      this.ChaseUpIndicatorInterval = null
    } else {
      this.ChaseUpIndicatorInterval = chaseUpIndicatorInterval
      this.ChaseUpIndicator = ECFIndicatorEnum.Y.IntegrationCode
    }
  }

  /**
   * Gets the ChaseUpIndicatorInterval, if it is null, gets the one from the associated Claim Data message
   *
   * @return {@link java.lang.Integer} chaseUpIndicatorInterval
   */
  property get ChaseUpIndicatorIntervalInteger(): Integer {
    var defaultValue : Integer
    if(this.ClaimDataResponded.ChaseUpIndicatorInterval == null) {
      defaultValue = ECFConstants.CHASE_UP_INDICATOR_DEFAULT
    } else {
      defaultValue = this.ClaimDataResponded.ChaseUpIndicatorInterval
    }
    return this.ChaseUpIndicatorInterval ?: defaultValue
  }

  /**
   * Sets the SimultaneousRIPIndicator string value based on the provided boolean.
   *
   * @param {@link boolean} simultaneousRIPIndicator
   */
  property set SimultaneousRIPIndicatorBoolean(simultaneousRIPIndicator: boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(simultaneousRIPIndicator).IntegrationCode
    if (newValue == this.ClaimDataResponded.SimultaneousReinstatementReq) {
      this.SimultaneousRIPIndicator = null
    } else {
      this.SimultaneousRIPIndicator = newValue
    }
  }

  /**
   * Gets a boolean representation of the SimultaneousRIPIndicator.
   *
   * @return {@link boolean}
   */
  property get SimultaneousRIPIndicatorBoolean(): boolean {
    if (this.SimultaneousRIPIndicator == null) {
      return ECFIndicatorEnum.getBooleanValue(this.ClaimDataResponded.SimultaneousReinstatementReq)
    }
    return ECFIndicatorEnum.getBooleanValue(this.SimultaneousRIPIndicator)
  }

  /**
   * Sets the CedantInLiquidationIndicator string value based on the provided boolean.
   *
   * @param {@link boolean} cedantInLiquidationIndicator
   */
  property set CedantInLiquidationIndicatorBoolean(cedantInLiquidationIndicator: boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(cedantInLiquidationIndicator).IntegrationCode
    if (newValue == this.ClaimDataResponded.CedantInLiquidationIndicator) {
      this.CedantInLiquidationIndicator = null
    } else {
      this.CedantInLiquidationIndicator = newValue
    }
  }

  /**
   * Gets a boolean representation of the CedantInLiquidationIndicator.
   *
   * @return {@link boolean}
   */
  property get CedantInLiquidationIndicatorBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.CedantInLiquidationIndicator?:this.ClaimDataResponded.CedantInLiquidationIndicator)
  }

  /**
   * Sets the NoFurtherResponseIndicator string value based on the provided boolean.
   * Because the field is mandatory for Lirma SAP and just applicable for it, no option for null value.
   *
   * @param {@link boolean} noFurtherResponseIndicator
   */
  property set NoFurtherResponseIndicatorBoolean(noFurtherResponseIndicator: boolean) {
    this.NoFurtherResponseIndicator = ECFIndicatorEnum.findByBooleanValue(noFurtherResponseIndicator).IntegrationCode
  }

  /**
   * Gets a boolean representation of the NoFurtherResponseIndicator
   *
   * @return {@link boolean}
   */
  property get NoFurtherResponseIndicatorBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.NoFurtherResponseIndicator)
  }

  /**
   * Sets the ImmediatePartCollectionIndicator string value based on the provided boolean.
   *
   * If the value is the same as the {@link entity.ECFMessageClaimData_Ext} this response
   * is for, a null value will be set.
   *
   * @param {@link boolean} immediatePartCollectionIndicator
   */
  property set ImmediatePartCollectionIndicatorBoolean(immediatePartCollectionIndicator: boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(immediatePartCollectionIndicator).IntegrationCode
    if (newValue == this.ClaimDataResponded.ImmediatePartCollectionInd) {
      this.ImmediatePartCollectionInd = null
    } else {
      this.ImmediatePartCollectionInd = newValue
    }
  }

  /**
   * Gets a boolean representation of the ImmediatePartCollectionInd, or if it
   * is null, the value in the {@link entity.ECFMessageClaimData_Ext} this response is for.
   *
   * @return {@link boolean}
   */
  property get ImmediatePartCollectionIndicatorBoolean(): boolean {
    if(this.ImmediatePartCollectionInd == null){
      return ECFIndicatorEnum.getBooleanValue(this.ClaimDataResponded.ImmediatePartCollectionInd)
    }
    return ECFIndicatorEnum.getBooleanValue(this.ImmediatePartCollectionInd)
  }

  /**
   * Sets the MultipleResponseIndicator string value based on the provided boolean.
   *
   * If the value is the same as the {@link entity.ECFMessageClaimData_Ext} this response
   * is for, a null value will be set.
   *
   * @param {@link boolean} multipleResponseIndicator
   */
  property set MultipleResponseIndicatorBoolean(multipleResponseIndicator: boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(multipleResponseIndicator).IntegrationCode
    if (newValue == this.ClaimDataResponded.MultipleResponseIndicator) {
      this.MultipleResponseIndicator = null
    } else {
      this.MultipleResponseIndicator = newValue
    }
  }

  /**
   * Gets a boolean representation of the MultipleResponseIndicator, or if it
   * is null, the value in the {@link entity.ECFMessageClaimData_Ext} this response is for.
   *
   * @return {@link boolean}
   */
  property get MultipleResponseIndicatorBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.MultipleResponseIndicator?:this.ClaimDataResponded.MultipleResponseIndicator)
  }

  /**
   * Sets the MinorPrecautionaryIndicator string value based on the provided boolean.
   * It is mandatory for Lirma Lead and only applicable for Lirma Lead, so no option for null value.
   *
   * @param {@link boolean} minorPrecautionaryIndicator
   */
  property set MinorPrecautionaryIndicatorBoolean(minorPrecautionaryIndicator: boolean) {
    this.MinorPrecautionaryIndicator = ECFIndicatorEnum.findByBooleanValue(minorPrecautionaryIndicator).IntegrationCode
  }

  /**
   * Gets a boolean representation of the MinorPrecautionaryIndicator
   *
   * @return {@link boolean}
   */
  property get MinorPrecautionaryIndicatorBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.MinorPrecautionaryIndicator)
  }

  /**
   * Sets the AllUnderwritersToSeeFileInd string value based on the provided boolean.
   * It is mandatory for Lirma Lead and only applicable for Lirma Lead, so no option for null value.
   *
   * @param {@link boolean} allUnderwritersToSeeFileInd
   */
  property set AllUnderwritersToSeeFileIndBoolean(allUnderwritersToSeeFileInd: boolean) {
    this.AllUnderwritersToSeeFileInd = ECFIndicatorEnum.findByBooleanValue(allUnderwritersToSeeFileInd).IntegrationCode
  }

  /**
   * Gets a boolean representation of the AllUnderwritersToSeeFileInd
   *
   * @return {@link boolean}
   */
  property get AllUnderwritersToSeeFileIndBoolean(): boolean {
    return ECFIndicatorEnum.getBooleanValue(this.AllUnderwritersToSeeFileInd)
  }

  /**
   * Sets the XcsToAgreeIndicator string value based on the provided boolean.
   * <p>
   * If the value is the same as the {@link entity.ECFMessageClaimData_Ext} this response
   * is for, a null value will be set.
   *
   * @param {@link boolean} allUnderwritersToSeeFileInd
   */
  property set XcsToAgreeIndicatorBoolean(xcsToAgreeIndicator: Boolean) {
    var newValue = ECFIndicatorEnum.findByBooleanValue(xcsToAgreeIndicator).IntegrationCode
    var previousValue = ECFIndicatorEnum.getBooleanValue(this.ClaimDataResponded.XcsToAgreeIndicator)

    if (xcsToAgreeIndicator.booleanValue() != previousValue) {
      this.XcsToAgreeIndicator = newValue
    } else {
      this.XcsToAgreeIndicator = null
    }
  }

  /**
   * Gets a boolean representation of the XcsToAgreeIndicator, or if it
   * is null, the value in the {@link entity.ECFMessageClaimData_Ext} this response is for.
   *
   * @return {@link boolean}
   */
  property get XcsToAgreeIndicatorBoolean(): Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.XcsToAgreeIndicator?:this.ClaimDataResponded.XcsToAgreeIndicator)
  }
}
