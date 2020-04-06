package util;

@Export
class SIUTotalScore
{
  public static function getSIUTotalScore(claimInput : Claim) : int {
    var result = 0;
    var FraudQS = claimInput.getQuestionSets(util.QuestionUtils.getAppropriateQuestionSet(claimInput))
    var FraudQSScore = util.QuestionUtils.getQuestionSetTotalScore(claimInput, FraudQS);
    var FraudTriggerScore = claimInput.SIScore;
    result = FraudQSScore + FraudTriggerScore;
    return   (result);
    
 }
}