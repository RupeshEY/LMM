package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.api.databuilder.DataBuilder
uses gw.api.databuilder.ValueGenerator

uses java.math.BigDecimal

public class ECFMessageClaimDataDocument_ExtBuilder extends DataBuilder<ECFMessageClaimDataDocument_Ext, ECFMessageClaimDataDocument_ExtBuilder>{

  construct() {
    super(ECFMessageClaimDataDocument_Ext)
  }

  public function withDescription(value:String) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#Description, value)
    return this
  }

  public function withDocType(value:typekey.IMRDocumentType_Ext) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#DocType, value)
    return this
  }

  public function withDocumentId(value:String) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#DocumentId, value)
    return this
  }

  public function withECFMsgBuilder(builder: ValueGenerator<entity.ECFMessageClaimNotifyRq_Ext>) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#ECFMsg, builder)
    return this
  }

  public function withECFMsg(value:entity.ECFMessageClaimNotifyRq_Ext) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#ECFMsg, value)
    return this
  }

  public function withFileFormat(value:typekey.ECFFileFormat_Ext) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#FileFormat, value)
    return this
  }

  public function withFileSize(value:BigDecimal) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#FileSize, value)
    return this
  }

  public function withFileSizeUnit(value:typekey.ECFMsgNotifRqDocSizeUnit_Ext) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#FileSizeUnit, value)
    return this
  }

  public function withReference(value:String) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#Reference, value)
    return this
  }

  public function withVersion(value:String) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#Version, value)
    return this
  }

  public function withVersionDate(value:Date) : ECFMessageClaimDataDocument_ExtBuilder {
    set(ECFMessageClaimDataDocument_Ext#VersionDate, value)
    return this
  }
}