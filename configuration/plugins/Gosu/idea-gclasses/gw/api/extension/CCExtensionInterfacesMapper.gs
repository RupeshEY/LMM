package gw.api.extension

uses gw.api.assignment.workload.proxy.WorkloadProxy
uses gw.api.email.Email
uses gw.api.exposure.ExposureDuplicateChecker
uses gw.api.extension.entity.IClaimExtensions
uses gw.api.extension.entity.IDecimalMetricDelegateExtensions
uses gw.api.extension.entity.IExposureExtensions
uses gw.api.extension.entity.IFinancialThresholdExtensions
uses gw.api.extension.entity.IIntegerMetricDelegateExtensions
uses gw.api.extension.entity.IMessageExtensions
uses gw.api.extension.entity.IMoneyMetricDelegateExtensions
uses gw.api.extension.entity.IPercentMetricDelegateExtensions
uses gw.api.extension.entity.IPolicySummaryExtensions
uses gw.api.extension.entity.IPolicyTypeExtensions
uses gw.api.extension.entity.IServiceRequestDocumentLinkExtensions
uses gw.api.extension.entity.IServiceRequestExtensions
uses gw.api.extension.entity.ITimeBasedMetricDelegateExtensions
uses gw.api.financials.CurrencyAmount
uses gw.api.iso.IISOPreparePayload
uses gw.api.iso.IISOSend
uses gw.api.iso.ISOPreparePayload
uses gw.api.iso.ISOSend
uses gw.api.metric.DateCalculator
uses gw.api.metric.DateCalculators
uses gw.api.metric.TimeBasedMetricMethods
uses gw.api.specialhandling.FinancialThresholdCalculator
uses gw.assignment.workload.proxy.ClaimWorkloadProxy
uses gw.assignment.workload.proxy.ExposureWorkloadProxy
uses gw.i18n.ILocale
uses gw.plugin.contact.ContactSystemApprovalUtil
uses gw.plugin.email.IEmailTemplateDescriptor
uses gw.plugin.extension.ExtensionBinder
uses gw.policy.notification.PolicySystemNotificationBase
uses gw.policy.notification.PolicySystemNotificationList

uses java.math.BigDecimal
uses java.util.Map

uses entity.Contact
uses gw.webservice.contactapi.NameMapper

/**
 * Extension interfaces mapper implementation.
 * <p/>
 * WARNING: Customers must never modify this mapping class file. Treat this file as read-only, despite the @Export
 * annotation that is in this file for internal reasons. However, you can edit the writable implementation classes
 * that this file references.
 */
@Export
class CCExtensionInterfacesMapper implements ExtensionInterfacesMapper {

  override function bindImplementations(config: ExtensionInterfacesConfig) {

    /**
     * AB 800 integration extensions
     */

    config.setImplementation<IContactIntegrationMapperFactoryExtensions_AB800>(new IContactIntegrationMapperFactoryExtensions_AB800() {
      override function mapper(): gw.contactmapper.ab800.ContactIntegrationMapper {
        return gw.contactmapper.ab800.ContactIntegrationMapperFactory.mapper()
      }
    })

    config.setImplementation<ICCNameMapperExtensions_AB800>(new ICCNameMapperExtensions_AB800() {
      override property get Instance(): NameMapper {
        return gw.contactmapper.ab800.CCNameMapper.Instance
      }
    })


    /**
     * AB 900 integrations extensions
     */

    config.setImplementation<IContactIntegrationMapperFactoryExtensions_AB900>(new IContactIntegrationMapperFactoryExtensions_AB900() {
      override function mapper(): gw.contactmapper.ab900.ContactIntegrationMapper {
        return gw.contactmapper.ab900.ContactIntegrationMapperFactory.mapper()
      }
    })

    config.setImplementation<ICCNameMapperExtensions_AB900>(new ICCNameMapperExtensions_AB900() {
      override property get Instance(): NameMapper {
        return gw.contactmapper.ab900.CCNameMapper.Instance
      }
    })


    /**
     * CC Extensions
     */

    config.setImplementation<IContactSystemApprovalUtilExtensions>(new IContactSystemApprovalUtilExtensions() {
      override function shouldCreateRelatedContactInContactSystem(mainContact: Contact, relationship: ContactBidiRel, relatedContact: Contact): boolean {
        return ContactSystemApprovalUtil.shouldCreateRelatedContactInContactSystem(mainContact, relationship, relatedContact)
      }
      override function operationRequiresApproval(eventName: String, theContact: Contact): boolean {
        return ContactSystemApprovalUtil.operationRequiresApproval(eventName, theContact)
      }
    })

    config.setImplementation<IExposureWorkloadProxyFactory>(new IExposureWorkloadProxyFactory() {
      override function newInstance(): WorkloadProxy {
        return new ExposureWorkloadProxy()
      }
    })

    config.setImplementation<IEmailExtensions>(new IEmailExtensions() {
      override function useEmailTemplate(email: Email, template: IEmailTemplateDescriptor, beans: Map<String, Object>) {
        email.useEmailTemplate(template, beans)
      }
    })

    config.setImplementation<IISOPreparePayloadFactory>(new IISOPreparePayloadFactory() {
      override function newInstance(): IISOPreparePayload {
        return new ISOPreparePayload()
      }
    })

    config.setImplementation<IISOSendFactory>(new IISOSendFactory() {
      override function newInstance(): IISOSend {
        return new ISOSend()
      }
    })

    config.setImplementation<IClaimWorkloadProxyFactory>(new IClaimWorkloadProxyFactory() {
      override function newInstance(): WorkloadProxy {
        return new ClaimWorkloadProxy()
      }
    })

    config.setImplementation<IPolicySystemNotificationListExtensions>(new IPolicySystemNotificationListExtensions() {
      override property get ALL(): List<PolicySystemNotificationBase> {
        return PolicySystemNotificationList.ALL
      }
    })

    config.setImplementation<ILossTypeExtensions>(new ILossTypeExtensions() {
      override property get WC(): LossType {
        return LossType.TypekeyUsedForWorkersComp
      }
    })

    config.setImplementation<IDateCalculatorExtensions>(new IDateCalculatorExtensions() {
      override property get BUSINESS_DAYS(): DateCalculator {
        return DateCalculators.BUSINESS_DAYS
      }
    })

    //ENTITY EXTENSIONS

    config.setImplementation<ExtensionBinder<Claim>>(\ claim -> new IClaimExtensions() {
      override function saveEmailAsDocument(emailToSend: Email, locale: ILocale, extraParams: Map<String, Object>, throwIfTemplateMissing: boolean) {
        claim.saveEmailAsDocument(emailToSend, locale, extraParams, throwIfTemplateMissing)
      }

      override property get CoverageInQuestionDescription(): String {
        return claim.getCoverageInQuestionDescription()
      }

      override function setClaimTier() {
        claim.setClaimTier()
      }

      override function createRelevantWorkCompExposures() {
        claim.createRelevantWorkCompExposures()
      }
    })

    config.setImplementation<ExtensionBinder<Exposure>>(\ exposure -> new IExposureExtensions() {
        override function setExposureTier() {
          exposure.setExposureTier()
        }

        override function verifyExposureClaimantCoverageSubtypeUnique() {
          ExposureDuplicateChecker.verifyExposureClaimantCoverageSubtypeUnique(exposure)
        }

        override function verifyExposureClaimantCoverageSubtypeUnique(updateClaimant: boolean) {
          ExposureDuplicateChecker.verifyExposureClaimantCoverageSubtypeUnique(exposure, updateClaimant)
        }
      })

    config.setImplementation<ExtensionBinder<Message>>(\ message -> new IMessageExtensions() {
      override function safeSetErrorDescription(error: String) {
        message.safeSetErrorDescription(error)
      }
    })

    config.setImplementation<ExtensionBinder<PolicySummary>>(\ policySummary -> new IPolicySummaryExtensions() {
      override function selectMatchingRiskUnits(oldPolicy: Policy) {
        policySummary.selectMatchingRiskUnits(oldPolicy)
      }

      override function selectAllRiskUnits() {
        policySummary.selectAllRiskUnits()
      }

      override property get CanSelectRiskUnits(): boolean {
        return policySummary.CanSelectRiskUnits
      }

      override function matchProperty(locationBasedRU: LocationBasedRU, policySummaryProperty: PolicySummaryProperty): boolean {
        return policySummary.matchProperty(locationBasedRU, policySummaryProperty)
      }

      override function matchVehicle(vehicleRU: VehicleRU, policySummaryVehicle: PolicySummaryVehicle): boolean {
        return policySummary.matchVehicle(vehicleRU, policySummaryVehicle)
      }
    })

    config.setImplementation<ExtensionBinder<PolicyType>>(\ policyType -> new IPolicyTypeExtensions() {
      override function allowsRiskUnitSelection() : boolean {
        return policyType.isAllowsRiskUnitSelection()
      }
    })

    config.setImplementation<ExtensionBinder<ServiceRequest>>(\ serviceRequest -> new IServiceRequestExtensions() {
      override property get AlreadyPromoted(): boolean {
        return serviceRequest.AlreadyPromoted
      }
      override function setServiceRequestTier() {
        serviceRequest.setServiceRequestTier()
      }
    })

    config.setImplementation<ExtensionBinder<ServiceRequestDocumentLink>>(\ serviceRequestDocumentLink -> new IServiceRequestDocumentLinkExtensions() {
      override property get Unlinkable() : boolean {
        return serviceRequestDocumentLink.Unlinkable
      }
    })

    config.setImplementation<ExtensionBinder<DecimalMetricDelegate>>(\ metricDelegate -> new IDecimalMetricDelegateExtensions() {
      override function getApplicableDisplayValue(value: BigDecimal, displayScale: int): String {
        return metricDelegate.getApplicableDisplayValue(value, displayScale)
      }
    })

    config.setImplementation<ExtensionBinder<IntegerMetricDelegate>>(\ metricDelegate -> new IIntegerMetricDelegateExtensions() {
      override function getApplicableDisplayValue(value: Integer): String {
        return metricDelegate.getApplicableDisplayValue(value)
      }
    })

    config.setImplementation<ExtensionBinder<MoneyMetricDelegate>>(\ metricDelegate -> new IMoneyMetricDelegateExtensions() {
      override function getApplicableDisplayValue(value: CurrencyAmount): String {
        return metricDelegate.getApplicableDisplayValue(value)
      }

      override property get ZeroDisplayValue(): String {
        return metricDelegate.getZeroDisplayValue()
      }
    })

    config.setImplementation<ExtensionBinder<PercentMetricDelegate>>(\ metricDelegate -> new IPercentMetricDelegateExtensions() {
      override function getApplicableDisplayValue(value: BigDecimal): String {
        return metricDelegate.getApplicableDisplayValue(value)
      }

      override function fractionToPercentage(numerator: BigDecimal, denominator: BigDecimal): BigDecimal {
        return metricDelegate.fractionToPercentage(numerator, denominator)
      }
    })

    config.setImplementation<ExtensionBinder<TimeBasedMetricDelegate>>(\ metricDelegate -> new ITimeBasedMetricDelegateExtensions() {
      override function updateMetricLimitReachedTimes(metric: TimeBasedMetricMethods) {
        metricDelegate.updateMetricLimitReachedTimes(metric)
      }

      override function getValue(metric: TimeBasedMetricMethods): Integer {
        return metricDelegate.getValue(metric)
      }

      override function close(metric: TimeBasedMetricMethods, finalTime: Date) {
        metricDelegate.close(metric, finalTime)
      }

      override function handleOwnerStateChange(metric: TimeBasedMetricMethods, ownerIsOpen: boolean, closeTime: Date) {
        metricDelegate.handleOwnerStateChange(metric, ownerIsOpen, closeTime)
      }

      override function getApplicableDisplayValue(value: Integer): String {
        return metricDelegate.getApplicableDisplayValue(value)
      }
    })

    config.setImplementation<ExtensionBinder<FinancialThreshold>>(\ financialThreshold -> new IFinancialThresholdExtensions() {
      override function calculator(): FinancialThresholdCalculator {
        return financialThreshold.calculator()
      }
    })
  }
}
