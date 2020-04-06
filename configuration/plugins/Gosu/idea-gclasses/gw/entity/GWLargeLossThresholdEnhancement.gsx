package gw.entity

@Export
enhancement GWLargeLossThresholdEnhancement : entity.LargeLossThreshold
{
  public static function getThreshold(policyType : PolicyType, notificationType : LargeLossNotificationType) : LargeLossThreshold {
    return gw.api.database.Query.make(entity.LargeLossThreshold).compare("PolicyType", Equals, policyType).compare("NotificationType", Equals, notificationType).select().FirstResult
  }
}
