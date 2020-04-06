package gw.acc.iplm.services.api

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.services.claim.ecfwb.ECFClaimService
uses gw.acc.iplm.utils.ECFConstants
uses org.slf4j.Logger


/**
 * This is an abstract class inherited by specific service layer.
 * It should have common code among services and enforce certain behaviour
 *
 * @param <T> extends LMMessage_Ext
 */
abstract class AbstractService<T extends entity.LMMessage_Ext> {

  protected static final var LOGGER: Logger = ECFConstants.LOGGER_BLOCK()

  protected var _policyDAO: PolicyDAO as PolicyDAO = new PolicyDAOImpl()
  protected var _claimDAO: ClaimDAO as ClaimDAO = new ClaimDAO()
  protected var _ecfClaimService: ECFClaimService as ECFClaimService = new ECFClaimService()

  /**
   * Processes either an inbound or outbound message.
   * The implementation depends on the type of message.
   *
   * @param ecfMessage: ECFMessage_Ext
   */
  abstract function process(ecfMessage: T)

}