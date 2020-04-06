package gw.pcf.medicalcasemgmt

uses com.google.common.cache.CacheBuilder
uses com.google.common.cache.CacheLoader
uses com.google.common.cache.LoadingCache
uses gw.api.database.Query
uses gw.api.locale.DisplayKey

/**
 * Helper to MedicalDiagnosisLV.pcf
 */
@Export
class MedicalDiagnosisLVHelper {
  var _injury: InjuryIncident
  var _icdCodeCache: LoadingCache<String, Optional<ICDCode>>

  construct(injury: InjuryIncident) {
    _injury = injury
    _icdCodeCache = CacheBuilder<String, Optional<ICDCode>>.newBuilder()
        .maximumSize(200)
        .build(new CacheLoader<String, Optional<ICDCode>>() {
          override function load(key: String): Optional<ICDCode> {
            return Optional.ofNullable(findICDCode(key))
          }
        })
  }

  function convertInputtedICDCode(code: String): ICDCode {
    return _icdCodeCache.get(code).orElse(null)
  }

  function validateICDCode(code: String): String {
    if (_injury.InjuryDiagnoses.where(\i -> i.ICDCode.Code == code).Count > 1) {
      return DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.ICDCode.DuplicateCodeValidation", code)
    }
    return null
  }

  function providerOnPick(injuryDiagnosis: InjuryDiagnosis) {
    injuryDiagnosis.InjuryIncident.Claim.createClaimContact(injuryDiagnosis.Contact)
    injuryDiagnosis.InjuryIncident.Claim.addRole(TC_DOCTOR, injuryDiagnosis.Contact)
  }

  private function findICDCode(valueToConvert: String): ICDCode {
    return Query.make(entity.ICDCode).compare(ICDCode#Code, Equals, valueToConvert)
        .and(\andRestriction -> andRestriction.or(\orRestriction -> orRestriction.compare(ICDCode#AvailabilityDate, Equals, null)
            .compare(ICDCode#AvailabilityDate, LessThan, gw.api.util.DateUtil.currentDate()))
            .or(\orRestriction -> orRestriction.compare(ICDCode#ExpiryDate, Equals, null)
                .compare(ICDCode#ExpiryDate, GreaterThan, gw.api.util.DateUtil.currentDate())))
        .select().AtMostOneRow
  }
}