package gw.typelist

@Export
enhancement GWLossTypeEnhancement: LossType {

  /**
   * Retrieves the Worker's Comp LossType typekey
   */
  public static property get TypekeyUsedForWorkersComp() : LossType {
    return LossType.TC_WC
  }
}
