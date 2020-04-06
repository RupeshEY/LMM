package gw.acc.iplm.utils

uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Jv_Ins_Reinsurance


/**
 * Constants related to LM Message Standard
 */
class LMMessageConstants {

  public static final var JV_INS_REINSURANCE_QNAME_LP: String = Jv_Ins_Reinsurance.$QNAME.LocalPart

  public final static var DEFAULT_CONTACT_ROLES: List<typekey.ContactRole> = {
      ContactRole.TC_BROKER_EXT,
      ContactRole.TC_CLAIMANT,
      ContactRole.TC_BUREAULEADINSURERORREINSURER_EXT}
}