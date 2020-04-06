package gw.sampledata

uses gw.api.locale.DisplayKey
uses gw.pl.persistence.core.Bundle

@Export
class SampleQuestions extends SampleDataBase {

  var questionSetsiucarquestionset : QuestionSet
  var questionSetsiucompquestionset : QuestionSet
  var questionSetsiugenquestionset : QuestionSet
  var questionSetQuestionSetSPM1 : QuestionSet
  var questionSetQuestionSetSPM2 : QuestionSet
  var questionSetQuestionSetSPM3 : QuestionSet
  var questionSetQuestionSetSPM4 : QuestionSet
  var questionSetQuestionSetSPM5 : QuestionSet
  var questionSetQuestionSetSPM6 : QuestionSet
  var questionsiugenquestion1 : Question
  var questionsiugenquestion2 : Question
  var questionsiugenquestion3 : Question
  var questionsiugenquestion4 : Question  
  var questionsiugenquestion5 : Question
  var questionsiugenquestion6 : Question
  var questionsiugenquestion7 : Question
  var questionsiugenquestion8 : Question    
  var questionsiugenquestion9 : Question    
  var questionsiugenquestion10 : Question    
  var questionsiugenquestion12 : Question    
  var questionsiugenquestion13 : Question    
  var questionsiugenquestion14 : Question    
  var questionsiugenquestion15 : Question    
  var questionsiucarquestion1 : Question
  var questionsiucarquestion2 : Question
  var questionsiucarquestion3 : Question
  var questionsiucarquestion4 : Question
  var questionsiucarquestion5 : Question
  var questionsiucarquestion7 : Question
  var questionsiucarquestion8 : Question
  var questionsiucarquestion9 : Question
  var questionsiucarquestion10 : Question
  var questionsiucarquestion11 : Question
  var questionsiucarquestion12 : Question
  var questionsiucarquestion13 : Question
  var questionsiucarquestion14 : Question
  var questionsiucompquestion1 : Question
  var questionsiucompquestion2 : Question
  var questionsiucompquestion3 : Question
  var questionsiucompquestion4 : Question
  var questionQuestionSPM1 : Question
  var questionQuestionSPM2 : Question
  var questionQuestionSPM3 : Question
  var questionQuestionSPM4 : Question
  var questionQuestionSPM5 : Question
  var questionQuestionSPM6 : Question
  var questionQuestionSPM7 : Question
  var questionQuestionSPM8 : Question
  var questionQuestionSPM9 : Question
  var questionQuestionSPM10 : Question
  var questionQuestionSPM11 : Question
  var questionQuestionSPM12 : Question
  var questionQuestionSPM13 : Question
  var questionQuestionSPM14 : Question
  var questionQuestionSPM15 : Question
  var questionQuestionSPM16 : Question
    
  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return DisplayKey.get("Web.CCSampleData.Questions")
  }
  
  override function testSampleData(bundle : Bundle) {
    testSampleData1(bundle)
    testSampleData2(bundle)
    testSampleData3(bundle)
    testSampleData4(bundle)
  }
  
  function testSampleData1(bundle : Bundle) {
    questionSetsiucarquestionset = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("siucarquestionset")
      .withPriority(1)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.AutoSIU")
      .withType(TC_SIUCAR)
      .create(bundle)


    questionSetsiucompquestionset = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("siucompquestionset")
      .withPriority(2)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.WorkersCompensationSIU")
      .withType(TC_SIUWORK)
      .create(bundle)


    questionSetsiugenquestionset = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("siugenquestionset")
      .withPriority(3)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.GeneralSIU")
      .withType(TC_SIUGEN)
      .create(bundle)


    questionSetQuestionSetSPM1 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:1")
      .withPriority(1)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.Timeliness")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionSetQuestionSetSPM2 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:2")
      .withPriority(2)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.Communications")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionSetQuestionSetSPM3 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:3")
      .withPriority(3)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.Technicians")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionSetQuestionSetSPM4 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:4")
      .withPriority(5)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.Quality")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionSetQuestionSetSPM5 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:5")
      .withPriority(6)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.AccuracyOfQuote")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionSetQuestionSetSPM6 = new gw.api.databuilder.QuestionSetBuilder()
      .withPublicId("QuestionSetSPM:6")
      .withPriority(4)
      .withNameByDisplayKey("Web.CCSampleData.QuestionSet.OfficeStaff")
      .withType(TC_SPMREVIEW)
      .create(bundle)


    questionsiugenquestion1 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion1")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesClaimInvolveASettlement")
      .create(bundle)


    questionsiugenquestion2 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion2")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesClaimantWantAnExceedinglyQuickSettlement")
      .create(bundle)


    questionsiugenquestion3 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion3")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantWillingToSettleForLessMoneyToSettleQuickly")
      .create(bundle)


    questionsiugenquestion4 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion4")
      .withPriority(3)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesClaimHaveDiscrepancies")
      .create(bundle)


    questionsiugenquestion5 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion5")
      .withPriority(4)
      .withTextByDisplayKey("Web.CCSampleData.Question.AreThereDiscrepanciesBetweenOfficialReportsOfIncidentAndStatementsMadeByInsuredClaimant")
      .create(bundle)


    questionsiugenquestion6 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion6")
      .withPriority(5)
      .withTextByDisplayKey("Web.CCSampleData.Question.AreThereDiscrepanciesBetweenWitnessAccountsAndStatementsMadeByInsuredClaimant")
      .create(bundle)


    questionsiugenquestion7 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion7")
      .withPriority(6)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesClaimHaveIssuesRelatedToInjuries")
        .create(bundle)


    questionsiugenquestion8 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion8")
      .withPriority(7)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesTheClaimantHavePriorInjuries")
      .create(bundle)


    questionsiugenquestion9 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion9")
      .withPriority(8)
      .withTextByDisplayKey("Web.CCSampleData.Question.AreTheClaimantInjuriesInLineWithTheDamagesFromTheIncident")
      .create(bundle)


    questionsiugenquestion10 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion10")
      .withPriority(9)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantExperiencingFinancialProblems")
      .create(bundle)


    questionsiugenquestion12 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICESELECT)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(20)
      .withPublicId("siugenquestion12")
      .withPriority(11)
      .withTextByDisplayKey("Web.CCSampleData.Question.WhatIsClaimantsCreditScore")
      .create(bundle)


    questionsiugenquestion13 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion13")
      .withPriority(12)
      .withTextByDisplayKey("Web.CCSampleData.Question.DidTheClaimantPresentExcessiveDocumentation")
      .create(bundle)


    questionsiugenquestion14 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion14")
      .withPriority(13)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantFamiliarWithInsuranceClaimsTerminologyAndProcedures")
      .create(bundle)


    questionsiugenquestion15 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiugenquestionset)
      .withIndent(0)
      .withPublicId("siugenquestion15")
      .withPriority(14)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesClaimantRefrainFromUsingMailFaxOrOtherTraceableTypesOfCommunication")
      .create(bundle)


    questionsiucarquestion1 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion1")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.WasVehicleStolen")
      .create(bundle)


    questionsiucarquestion2 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(20)
      .withPublicId("siucarquestion2")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.WasVehiclePurchasedOutsideOfState")
      .create(bundle)


    questionsiucarquestion3 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(20)
      .withPublicId("siucarquestion3")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesTheStolenVehicleHaveSalvageTitle")
      .create(bundle)


    questionsiucarquestion4 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(20)
      .withPublicId("siucarquestion4")
      .withPriority(3)
      .withTextByDisplayKey("Web.CCSampleData.Question.HasCarHadNotBeenSeenForSomeTimePriorToTheft")
      .create(bundle)


    questionsiucarquestion5 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICESELECT)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(40)
      .withPublicId("siucarquestion5")
      .withPriority(4)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowLongSinceVehicleHasBeenSeen")
      .create(bundle)


    questionsiucarquestion7 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion7")
      .withPriority(6)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoNeighborsFriendsAndRelativesHaveKnowledgeOfVehicle")
      .create(bundle)


    questionsiucarquestion8 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion8")
      .withPriority(7)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoAccountsOfTheAccidentByDriversPassengersAndWitnessesAppearRehearsedOrAreConverselyInconsistent")
      .create(bundle)


    questionsiucarquestion9 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion9")
      .withPriority(8)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoAppraisalPhotographsShowOnlyCloseUpViewOfTheDamageButNotEnoughOfTheCarToIdentifyMakeAndModel")
      .create(bundle)


    questionsiucarquestion10 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion10")
      .withPriority(9)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesSalvageOrRepairShopTakeActiveInterestInTheClaim")
      .create(bundle)


    questionsiucarquestion11 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion11")
      .withPriority(10)
      .withTextByDisplayKey("Web.CCSampleData.Question.AreTwoVehiclesInvolvedInAccident")
      .create(bundle)


    questionsiucarquestion12 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(20)
      .withPublicId("siucarquestion12")
      .withPriority(11)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesStruckVehicleHaveHeavyDamage")
      .create(bundle)


    questionsiucarquestion13 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(20)
      .withPublicId("siucarquestion13")
      .withPriority(12)
      .withTextByDisplayKey("Web.CCSampleData.Question.DoesStrikingVehicleHaveRelativelyLightDamage")
      .create(bundle)


    questionsiucarquestion14 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucarquestionset)
      .withIndent(0)
      .withPublicId("siucarquestion14")
      .withPriority(13)
      .withTextByDisplayKey("Web.CCSampleData.Question.WasTheVehicleRepairedBeforeTheClaimWasReported")
      .create(bundle)


    questionsiucompquestion1 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucompquestionset)
      .withIndent(0)
      .withPublicId("siucompquestion1")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsItPossibleInjuryIsNotJobRelated")
      .create(bundle)


    questionsiucompquestion2 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucompquestionset)
      .withIndent(0)
      .withPublicId("siucompquestion2")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantMissingWorkDueToTheInjury")
      .create(bundle)


    questionsiucompquestion3 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucompquestionset)
      .withIndent(20)
      .withPublicId("siucompquestion3")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantResistingGoingBackToWork")
      .create(bundle)


    questionsiucompquestion4 = new gw.api.databuilder.QuestionBuilder()
      .withFormat(TC_CHOICERADIO)
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetsiucompquestionset)
      .withIndent(20)
      .withPublicId("siucompquestion4")
      .withPriority(3)
      .withTextByDisplayKey("Web.CCSampleData.Question.IsClaimantWorkingInADifferentJob")
      .create(bundle)


    questionQuestionSPM1 = new gw.api.databuilder.QuestionBuilder()
        .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM1)
      .withIndent(0)
      .withPublicId("QuestionSPM:1")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowQuicklyWasTheServiceProviderAbleToScheduleTheRepair")
      .create(bundle)


    questionQuestionSPM2 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM1)
      .withIndent(0)
      .withPublicId("QuestionSPM:2")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowLongDidItTakeToGetAnEstimate")
      .create(bundle)


    questionQuestionSPM3 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM1)
      .withIndent(0)
      .withPublicId("QuestionSPM:3")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowTimelyWereTheRepairs")
      .create(bundle)


    questionQuestionSPM4 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM2)
      .withIndent(0)
      .withPublicId("QuestionSPM:4")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowWouldYouRateTheServiceProvidersExplanationOfTheNeededRepairs")
      .create(bundle)


    questionQuestionSPM5 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM2)
      .withIndent(0)
      .withPublicId("QuestionSPM:5")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.DidTheServiceProviderObtainYourAuthorizationBeforeBeginningTheRepairs")
      .create(bundle)


    questionQuestionSPM6 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM2)
      .withIndent(0)
      .withPublicId("QuestionSPM:6")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.DidTheServiceProviderSatisfactorilyAnswerAnyQuestionsYouHad")
      .create(bundle)


    questionQuestionSPM7 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM3)
      .withIndent(0)
      .withPublicId("QuestionSPM:7")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.Professionalism")
      .create(bundle)


    questionQuestionSPM8 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM3)
      .withIndent(0)
      .withPublicId("QuestionSPM:8")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.Knowledge")
      .create(bundle)


    questionQuestionSPM9 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM3)
      .withIndent(0)
      .withPublicId("QuestionSPM:9")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.Helpfulness")
      .create(bundle)


    questionQuestionSPM10 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM4)
      .withIndent(0)
      .withPublicId("QuestionSPM:10")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowWouldYouRateTheQualityOfTheServiceProvidersWork")
      .create(bundle)


    questionQuestionSPM11 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM5)
      .withIndent(0)
      .withPublicId("QuestionSPM:11")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.WereThereAnyRequotes")
      .create(bundle)


    questionQuestionSPM12 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM5)
      .withIndent(0)
      .withPublicId("QuestionSPM:12")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.HowManyRequotes")
      .create(bundle)


    questionQuestionSPM13 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM5)
      .withIndent(0)
      .withPublicId("QuestionSPM:13")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.PercentOfDifferenceBetweenInitialQuoteAndFinalPayment")
      .create(bundle)


    questionQuestionSPM14 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM6)
      .withIndent(0)
      .withPublicId("QuestionSPM:14")
      .withPriority(0)
      .withTextByDisplayKey("Web.CCSampleData.Question.Professionalism")
      .create(bundle)


    questionQuestionSPM15 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM6)
      .withIndent(0)
      .withPublicId("QuestionSPM:15")
      .withPriority(2)
      .withTextByDisplayKey("Web.CCSampleData.Question.Knowledge")
      .create(bundle)


    questionQuestionSPM16 = new gw.api.databuilder.QuestionBuilder()
      .withType(TC_CHOICE)
      .isNotRequired()
      .onQuestionSet(questionSetQuestionSetSPM6)
      .withIndent(0)
      .withPublicId("QuestionSPM:16")
      .withPriority(1)
      .withTextByDisplayKey("Web.CCSampleData.Question.Helpfulness")
      .create(bundle)
  }

  function testSampleData2(bundle : Bundle) {

    (\-> {
    var questionFiltersiugenfilter1 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter1")
      .withFilterQuestion(questionsiugenquestion1)
      .onQuestion(questionsiugenquestion2)
      .create(bundle)


    var questionFiltersiugenfilter2 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter2")
      .withFilterQuestion(questionsiugenquestion1)
      .onQuestion(questionsiugenquestion3)
      .create(bundle)


    var questionFiltersiugenfilter3 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter3")
      .withFilterQuestion(questionsiugenquestion4)
      .onQuestion(questionsiugenquestion5)
      .create(bundle)


    var questionFiltersiugenfilter4 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter4")
      .withFilterQuestion(questionsiugenquestion4)
      .onQuestion(questionsiugenquestion6)
      .create(bundle)


    var questionFiltersiugenfilter5 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter5")
      .withFilterQuestion(questionsiugenquestion7)
      .onQuestion(questionsiugenquestion8)
      .create(bundle)


    var questionFiltersiugenfilter6 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter6")
      .withFilterQuestion(questionsiugenquestion7)
      .onQuestion(questionsiugenquestion9)
      .create(bundle)


    var questionFiltersiugenfilter7 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siugenfilter7")
      .withFilterQuestion(questionsiugenquestion10)
      .onQuestion(questionsiugenquestion12)
      .create(bundle)


    var questionFiltersiucarfilter1 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter1")
      .withFilterQuestion(questionsiucarquestion1)
      .onQuestion(questionsiucarquestion2)
      .create(bundle)


    var questionFiltersiucarfilter2 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter2")
      .withFilterQuestion(questionsiucarquestion1)
      .onQuestion(questionsiucarquestion3)
      .create(bundle)


    var questionFiltersiucarfilter3 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter3")
      .withFilterQuestion(questionsiucarquestion1)
      .onQuestion(questionsiucarquestion4)
      .create(bundle)


    var questionFiltersiucarfilter4 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter4")
      .withFilterQuestion(questionsiucarquestion4)
      .onQuestion(questionsiucarquestion5)
      .create(bundle)


    var questionFiltersiucarfilter5 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter5")
      .withFilterQuestion(questionsiucarquestion11)
      .onQuestion(questionsiucarquestion12)
      .create(bundle)


    var questionFiltersiucarfilter6 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucarfilter6")
      .withFilterQuestion(questionsiucarquestion11)
      .onQuestion(questionsiucarquestion13)
      .create(bundle)


    var questionFiltersiucompfilter1 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucompfilter1")
      .withFilterQuestion(questionsiucompquestion2)
      .onQuestion(questionsiucompquestion3)
      .create(bundle)


    var questionFiltersiucompfilter2 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("Yes")
      .withPublicId("siucompfilter2")
      .withFilterQuestion(questionsiucompquestion2)
      .onQuestion(questionsiucompquestion4)
      .create(bundle)


    var questionFilterSPMQFilter1 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("yes")
      .withPublicId("SPMQFilter:1")
      .withFilterQuestion(questionQuestionSPM11)
      .onQuestion(questionQuestionSPM12)
      .create(bundle)


    var questionFilterSPMQFilter2 = new gw.api.databuilder.QuestionFilterBuilder()
      .withAnswer("yes")
      .withPublicId("SPMQFilter:2")
      .withFilterQuestion(questionQuestionSPM11)
      .onQuestion(questionQuestionSPM13)
      .create(bundle)


    var questionChoicesiugenquestion1yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion1yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiugenquestion1)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion2yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion2yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion2)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion3yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion3yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion3)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion4yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion4yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiugenquestion4)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion5yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion5yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion5)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion6yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion6yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion6)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion7yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion7yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiugenquestion7)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion8yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion8yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion8)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion9yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion9yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion9)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion10yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion10yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiugenquestion10)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion13yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion13yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion13)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion14yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion14yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion14)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion15yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siugenquestion15yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiugenquestion15)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion1yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion1yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiucarquestion1)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion2yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion2yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion2)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion3yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion3yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion3)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion4yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion4yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiucarquestion4)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion7yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion7yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion7)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion8yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion8yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion8)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion9yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion9yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion9)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion10yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion10yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion10)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion11yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion11yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiucarquestion11)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion12yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion12yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion12)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion13yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion13yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion13)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucarquestion14yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucarquestion14yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucarquestion14)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucompquestion1yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucompquestion1yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucompquestion1)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucompquestion2yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucompquestion2yes")
      .withCode("Yes")
      .withScore(0)
      .onQuestion(questionsiucompquestion2)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucompquestion3yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucompquestion3yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucompquestion3)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiucompquestion4yes = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("siucompquestion4yes")
      .withCode("Yes")
      .withScore(1)
      .onQuestion(questionsiucompquestion4)
      .withPriority(0)
      .withName("Yes")
      .create(bundle)


    var questionChoicesiugenquestion1no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion1no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion1)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion2no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion2no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion2)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion3no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion3no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion3)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion4no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion4no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion4)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion5no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion5no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion5)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion6no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion6no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion6)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion7no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion7no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion7)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion8no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion8no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion8)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion9no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion9no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion9)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion10no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion10no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion10)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion13no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion13no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion13)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion14no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion14no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion14)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiugenquestion15no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siugenquestion15no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiugenquestion15)
      .withPriority(1)
      .withName("No")
      .create(bundle)
    })()
  }

  function testSampleData3(bundle : Bundle) {
    (\-> {
    var questionChoicesiucarquestion1no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion1no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion1)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion2no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion2no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion2)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion3no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion3no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion3)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion4no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion4no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion4)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion7no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion7no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion7)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion8no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion8no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion8)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion9no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion9no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion9)
      .withPriority(1)
      .withName("No")
      .create(bundle)
    })()

    (\-> {
    var questionChoicesiucarquestion10no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion10no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion10)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion11no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion11no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion11)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion12no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion12no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion12)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion13no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion13no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion13)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucarquestion14no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucarquestion14no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucarquestion14)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucompquestion1no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucompquestion1no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucompquestion1)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucompquestion2no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucompquestion2no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucompquestion2)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucompquestion3no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucompquestion3no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucompquestion3)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiucompquestion4no = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("siucompquestion4no")
      .withCode("No")
      .withScore(0)
      .onQuestion(questionsiucompquestion4)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoicesiuq12below400 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Below 400")
      .withPublicId("siuq12below400")
      .withCode("Below 400")
      .withScore(3)
      .onQuestion(questionsiugenquestion12)
      .withPriority(3)
      .withName("Below 400")
      .create(bundle)


    var questionChoicesiuq12400500 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("400-500")
      .withPublicId("siuq12400500")
      .withCode("400-500")
      .withScore(2)
      .onQuestion(questionsiugenquestion12)
      .withPriority(2)
      .withName("400-500")
      .create(bundle)


    var questionChoicesiuq12500600 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("500-600")
      .withPublicId("siuq12500600")
      .withCode("500-600")
      .withScore(1)
      .onQuestion(questionsiugenquestion12)
      .withPriority(1)
      .withName("500-600")
      .create(bundle)


    var questionChoicesiuq12600above = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Above 600")
      .withPublicId("siuq12600above")
      .withCode("Above 600")
      .withScore(0)
      .onQuestion(questionsiugenquestion12)
      .withPriority(0)
      .withName("Above 600")
      .create(bundle)


    var questionChoicesiuq12notavail = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Not Available")
      .withPublicId("siuq12notavail")
      .withCode("Not Available")
      .withScore(1)
      .onQuestion(questionsiugenquestion12)
      .withPriority(1)
      .withName("Not Available")
      .create(bundle)


    var questionChoicesiuq530DaysLess = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("30 days or less")
      .withPublicId("siuq530DaysLess")
      .withCode("30 days or less")
      .withScore(1)
      .onQuestion(questionsiucarquestion5)
      .withPriority(1)
      .withName("30 days or less")
      .create(bundle)


    var questionChoicesiuq53090days = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("30-90 Days")
      .withPublicId("siuq53090days")
      .withCode("30-90 Days")
      .withScore(2)
      .onQuestion(questionsiucarquestion5)
      .withPriority(2)
      .withName("30-90 Days")
      .create(bundle)


    var questionChoicesiu590moredays = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("More than 90 Days")
      .withPublicId("siu590moredays")
      .withCode("More than 90 Days")
      .withScore(3)
      .onQuestion(questionsiucarquestion5)
      .withPriority(3)
      .withName("More than 90 Days")
      .create(bundle)


    var questionChoicesiuq5unavalable = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Unavailable")
      .withPublicId("siuq5unavalable")
      .withCode("Unavailable")
      .withScore(1)
      .onQuestion(questionsiucarquestion5)
      .withPriority(4)
      .withName("Unavailable")
      .create(bundle)
    })()
  }


  function testSampleData4(bundle : Bundle) {
    (\-> {
    var questionChoiceQuestionChoiceSPM1 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 1 day of initial contact")
      .withPublicId("QuestionChoiceSPM:1")
      .withCode("win1day")
      .withScore(100)
      .onQuestion(questionQuestionSPM1)
      .withPriority(1)
      .withName("Within 1 day of initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM2 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 3 days of initial contact")
      .withPublicId("QuestionChoiceSPM:2")
      .withCode("win3day")
      .withScore(50)
      .onQuestion(questionQuestionSPM1)
      .withPriority(2)
      .withName("Within 3 days of initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM3 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("More than 3 days from initial contact")
      .withPublicId("QuestionChoiceSPM:3")
      .withCode("more3days")
      .withScore(0)
      .onQuestion(questionQuestionSPM1)
      .withPriority(3)
      .withName("More than 3 days from initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM4 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Same Day")
      .withPublicId("QuestionChoiceSPM:4")
      .withCode("sameday")
      .withScore(100)
      .onQuestion(questionQuestionSPM2)
      .withPriority(1)
      .withName("Same Day")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM5 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 1 day of initial contact")
      .withPublicId("QuestionChoiceSPM:5")
      .withCode("win1day")
      .withScore(70)
      .onQuestion(questionQuestionSPM2)
      .withPriority(2)
      .withName("Within 1 day of initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM6 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 3 days of initial contact")
      .withPublicId("QuestionChoiceSPM:6")
      .withCode("win3day")
      .withScore(50)
      .onQuestion(questionQuestionSPM2)
      .withPriority(3)
      .withName("Within 3 days of initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM7 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("More than 3 days from initial contact")
      .withPublicId("QuestionChoiceSPM:7")
      .withCode("more3days")
      .withScore(0)
      .onQuestion(questionQuestionSPM2)
      .withPriority(4)
      .withName("More than 3 days from initial contact")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM8 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("On time")
      .withPublicId("QuestionChoiceSPM:8")
      .withCode("ontime")
      .withScore(100)
      .onQuestion(questionQuestionSPM3)
      .withPriority(1)
      .withName("On time")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM9 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 1 day of estimate")
      .withPublicId("QuestionChoiceSPM:9")
      .withCode("win1day")
      .withScore(70)
      .onQuestion(questionQuestionSPM3)
      .withPriority(2)
      .withName("Within 1 day of estimate")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM10 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 3 days of estimate")
      .withPublicId("QuestionChoiceSPM:10")
      .withCode("win3day")
      .withScore(50)
      .onQuestion(questionQuestionSPM3)
      .withPriority(3)
      .withName("Within 3 days of estimate")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM11 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("More than 3 days past estimate")
      .withPublicId("QuestionChoiceSPM:11")
      .withCode("more3days")
      .withScore(0)
      .onQuestion(questionQuestionSPM3)
      .withPriority(4)
      .withName("More than 3 days past estimate")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM12 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Excellent")
      .withPublicId("QuestionChoiceSPM:12")
      .withCode("excellent")
      .withScore(100)
      .onQuestion(questionQuestionSPM4)
      .withPriority(1)
      .withName("Excellent")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM13 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Satisfactory")
      .withPublicId("QuestionChoiceSPM:13")
      .withCode("satisfactory")
      .withScore(50)
      .onQuestion(questionQuestionSPM4)
      .withPriority(2)
      .withName("Satisfactory")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM14 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:14")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM4)
      .withPriority(3)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM15 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("QuestionChoiceSPM:15")
      .withCode("yes")
      .withScore(100)
      .onQuestion(questionQuestionSPM5)
      .withPriority(1)
      .withName("Yes")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM16 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("QuestionChoiceSPM:16")
      .withCode("no")
      .withScore(0)
      .onQuestion(questionQuestionSPM5)
      .withPriority(2)
      .withName("No")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM17 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("QuestionChoiceSPM:17")
      .withCode("yes")
      .withScore(100)
      .onQuestion(questionQuestionSPM6)
      .withPriority(1)
      .withName("Yes")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM18 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("QuestionChoiceSPM:18")
      .withCode("no")
      .withScore(0)
      .onQuestion(questionQuestionSPM6)
      .withPriority(2)
      .withName("No")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM19 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:19")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM7)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM20 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:20")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM7)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM21 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:21")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM7)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM22 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:22")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM7)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM23 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:23")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM8)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM24 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:24")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM8)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM25 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:25")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM8)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM26 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:26")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM8)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM27 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:27")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM9)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM28 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:28")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM9)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM29 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:29")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM9)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM30 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:30")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM9)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM31 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Excellent")
      .withPublicId("QuestionChoiceSPM:31")
      .withCode("excellent")
      .withScore(100)
      .onQuestion(questionQuestionSPM10)
      .withPriority(1)
      .withName("Excellent")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM32 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Satisfactory")
      .withPublicId("QuestionChoiceSPM:32")
      .withCode("satisfactory")
      .withScore(70)
      .onQuestion(questionQuestionSPM10)
      .withPriority(2)
      .withName("Satisfactory")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM33 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:33")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM10)
      .withPriority(3)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM34 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("No")
      .withPublicId("QuestionChoiceSPM:34")
      .withCode("no")
      .withScore(100)
      .onQuestion(questionQuestionSPM11)
      .withPriority(1)
      .withName("No")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM35 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Yes")
      .withPublicId("QuestionChoiceSPM:35")
      .withCode("yes")
      .withScore(0)
      .onQuestion(questionQuestionSPM11)
      .withPriority(2)
      .withName("Yes")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM36 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("1")
      .withPublicId("QuestionChoiceSPM:36")
      .withCode("one")
      .withScore(25)
      .onQuestion(questionQuestionSPM12)
      .withPriority(1)
      .withName("1")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM37 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("2 to 3")
      .withPublicId("QuestionChoiceSPM:37")
      .withCode("twothree")
      .withScore(10)
      .onQuestion(questionQuestionSPM12)
      .withPriority(2)
      .withName("2 to 3")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM38 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("More than 3")
      .withPublicId("QuestionChoiceSPM:38")
      .withCode("morethan3")
      .withScore(0)
      .onQuestion(questionQuestionSPM12)
      .withPriority(3)
      .withName("More than 3")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM39 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Within 5% of original quote")
      .withPublicId("QuestionChoiceSPM:39")
      .withCode("atmost5")
      .withScore(25)
      .onQuestion(questionQuestionSPM13)
      .withPriority(1)
      .withName("Within 5% of original quote")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM40 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Between 5% and 10%")
      .withPublicId("QuestionChoiceSPM:40")
      .withCode("fiveten")
      .withScore(10)
      .onQuestion(questionQuestionSPM13)
      .withPriority(2)
      .withName("Between 5% and 10%")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM41 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Between 10% and 20%")
      .withPublicId("QuestionChoiceSPM:41")
      .withCode("tentwenty")
      .withScore(5)
      .onQuestion(questionQuestionSPM13)
      .withPriority(3)
      .withName("Between 10% and 20%")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM42 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Greater than 20%")
      .withPublicId("QuestionChoiceSPM:42")
      .withCode("over20")
      .withScore(0)
      .onQuestion(questionQuestionSPM13)
      .withPriority(4)
      .withName("Greater than 20%")
      .create(bundle)
    })()

    (\-> {
    var questionChoiceQuestionChoiceSPM43 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:43")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM14)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM44 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:44")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM14)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM45 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:45")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM14)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM46 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:46")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM14)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM47 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:47")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM15)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM48 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:48")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM15)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM49 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:49")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM15)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM50 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:50")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM15)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM51 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Great")
      .withPublicId("QuestionChoiceSPM:51")
      .withCode("great")
      .withScore(100)
      .onQuestion(questionQuestionSPM16)
      .withPriority(1)
      .withName("Great")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM52 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Good")
      .withPublicId("QuestionChoiceSPM:52")
      .withCode("good")
      .withScore(70)
      .onQuestion(questionQuestionSPM16)
      .withPriority(2)
      .withName("Good")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM53 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("OK")
      .withPublicId("QuestionChoiceSPM:53")
      .withCode("ok")
      .withScore(50)
      .onQuestion(questionQuestionSPM16)
      .withPriority(3)
      .withName("OK")
      .create(bundle)


    var questionChoiceQuestionChoiceSPM54 = new gw.api.databuilder.QuestionChoiceBuilder()
      .withDescription("Poor")
      .withPublicId("QuestionChoiceSPM:54")
      .withCode("poor")
      .withScore(0)
      .onQuestion(questionQuestionSPM16)
      .withPriority(4)
      .withName("Poor")
      .create(bundle)


    var reviewTypeSPMReviewType1 = new gw.api.databuilder.ReviewTypeBuilder()
      .withPublicId("SPMReviewType:1")
      .withDescription("Sample Review Type for Auto Repair Shops")
      .withContactSubtype(TC_AUTOREPAIRSHOP)
      .withName("Auto Repair Service")
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet1 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_TIMELINESS)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM1)
      .withPublicId("ReviewCatQSet:1")
      .withElementOrder(1)
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet2 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_COMMUNICATION)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM2)
      .withPublicId("ReviewCatQSet:2")
      .withElementOrder(2)
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet3 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_OFFICESTAFF)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM6)
      .withPublicId("ReviewCatQSet:3")
      .withElementOrder(3)
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet4 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_TECHNICIANS)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM3)
      .withPublicId("ReviewCatQSet:4")
      .withElementOrder(4)
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet5 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_QUALITY)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM4)
      .withPublicId("ReviewCatQSet:5")
      .withElementOrder(5)
      .create(bundle)


    var reviewCategoryQuestionSetReviewCatQSet6 = new gw.api.databuilder.ReviewCategoryQuestionSetBuilder()
      .withReviewCategory(TC_ACCURACY)
      .onReviewType(reviewTypeSPMReviewType1)
      .withQuestionSet(questionSetQuestionSetSPM5)
      .withPublicId("ReviewCatQSet:6")
      .withElementOrder(6)
      .create(bundle)
    })()

  }
}
