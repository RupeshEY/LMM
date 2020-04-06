package gw.acc.iplm.enhancements.typekey

enhancement ECFClaimTransactionTypeEnhancement: ECFClaimTransactionType_Ext {

  property get IsAdvice(): boolean {
    return this == ECFClaimTransactionType_Ext.TC_FIRSTADVICE || this == ECFClaimTransactionType_Ext.TC_INTERIMADVICE
  }

  property get FirstAdvice(): boolean {
    return this == ECFClaimTransactionType_Ext.TC_FIRSTADVICE
  }

  property get IsSettlement(): boolean {
    return this == ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT || this == ECFClaimTransactionType_Ext.TC_INTERIMADVICEANDSETTLEMENT
  }
}
