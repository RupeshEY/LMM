package gw.sampledata
uses gw.pl.persistence.core.Bundle

@Export
class SampleMessages extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "Messages"
  }
    
  override function testSampleData(bundle : Bundle) {
    new gw.api.databuilder.MessageBuilder()
      .withAckCount(1)
      .withDuplicateCount(0)
      .withRetryCount(1)
      .withStatus(2)
      .withCreationTime(BaseDate.addDays(-244))
      .withSendOrder(6)
      .withPublicId("default_data:6")
      .withDestinationId(65)
      .withPayload("Payload 6")
      .withEventName("Event 6")
      .create(bundle)
    new gw.api.databuilder.MessageBuilder()
      .withAckCount(1)
      .withDuplicateCount(0)
      .withRetryCount(0)
      .withStatus(3)
      .withCreationTime(BaseDate.addDays(-244))
      .withSendOrder(7)
      .withPublicId("default_data:7")
      .withDestinationId(65)
      .withPayload("Payload 7")
      .withEventName("Event 7")
      .create(bundle)
    new gw.api.databuilder.MessageHistoryBuilder()
      .withAckCount(0)
      .withDuplicateCount(0)
      .withObjectKey("claim:1")
      .withRetryCount(0)
      .withStatus(11)
      .withCreationTime(BaseDate.addDays(-244))
      .withSendOrder(2)
      .withEventRootKey("claim:1")
      .withPublicId("default_data:2")
      .withDestinationID(65)
      .withPayload("Payload 2")
      .withOrigMsgId(2)
      .withEventName("Event 2")
      .create(bundle)
    new gw.api.databuilder.MessageHistoryBuilder()
      .withAckCount(0)
      .withDuplicateCount(0)
      .withObjectKey("claim:1")
      .withRetryCount(0)
      .withStatus(12)
      .withCreationTime(BaseDate.addDays(-244))
      .withSendOrder(3)
      .withEventRootKey("claim:1")
      .withPublicId("default_data:3")
      .withDestinationID(65)
      .withPayload("Payload 3")
      .withOrigMsgId(3)
      .withEventName("Event 3")
      .create(bundle)
  }
}
