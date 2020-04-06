package gw.solr.utils

uses gw.solr.SolrException

uses java.util.ArrayList
uses java.util.HashSet
uses java.util.Set
uses gw.api.system.CCConfigParameters
uses gw.pl.persistence.core.Key

@Export
class CCACLInfo {
  
  public static final var ACLINFO : String = "ACLInfo"

  final var _userList = new ArrayList<Key>()
  final var _groupList = new ArrayList<Key>()
  final var _securityZoneList = new ArrayList<Key>()
  final var _referencedBeans = new HashSet<KeyableBean>()
  var _anyone : boolean

  static function createACLInfoForCurrentUser() : CCACLInfo {
    return createACLInfoForCurrentUser(false, -1)
  }
  
  static function createACLInfoForCurrentUser(expanded : boolean, maxSize : int) : CCACLInfo {
    var userACLInfo : CCACLInfo = null
    var currentUser = User.util.CurrentUser
    if(CCConfigParameters.UseACLPermissions.Value && !currentUser.isUnrestrictedUser() && !perm.User.ignoreacl) {
      userACLInfo = new CCACLInfo(currentUser, expanded)
      if(maxSize > 0) {
        userACLInfo.validateSize(maxSize)
      }
    }
    return userACLInfo
  }
  
  static function createACLInfoForClaim(accessArray : ClaimAccess[]) : CCACLInfo {
    return new CCACLInfo(accessArray)
  }

  private construct(theUser : User, expanded : boolean) {
    _userList.add(theUser.ID)
    for (var group in theUser.AllGroups) {
      _groupList.add((group as Group).ID)
    }
    for (var sz in theUser.SecurityZones) {
      _securityZoneList.add(sz.ID)
    }
    _anyone = true
    
    if(expanded) {
       expandACLInfo(theUser)
    }
  }
  
  private construct(accessArray : ClaimAccess[]) {
    for (ca in accessArray) {
      if (ca.Permission == ClaimAccessType.TC_VIEW) {
        if (ca.User != null) {
          _userList.add(ca.User.ID)
        } else if (ca.Group != null) {
          _groupList.add(ca.Group.ID)
        } else if (ca.SecurityZone != null) {
          _securityZoneList.add(ca.SecurityZone.ID)
        } else if (ca.Anyone == true) {
          _anyone = true
        } else {
          // bean not used, don't add reference
          continue
        }
        _referencedBeans.add(ca)
      }
    }
  }
  
  final function expandACLInfo(theUser : User) {
    var superviseesCache = theUser.SuperviseesCache
    var supervisedUsers = superviseesCache.SupervisedUsers
    _userList.ensureCapacity(supervisedUsers.Count + 1)
    for (var supervisedUser in supervisedUsers) {
      _userList.add(supervisedUser.SupervisedUser.ID)
    }
   
    var supervisedGroups = superviseesCache.SupervisedGroups
    _groupList.ensureCapacity(supervisedGroups.Count + theUser.AllGroups.Count)
    for (var supervisedGroup in supervisedGroups) {
      _groupList.add(supervisedGroup.SupervisedGroup.ID)
    }
  }
  
  final function validateSize(maxTerms : int) {
    var termCount = _userList.Count + _groupList.Count + _securityZoneList.Count + 1
    if(termCount > maxTerms) {
      throw new SolrException("ACL filter term limit exceeded.")
    }
  }
  
  property get UserIds() : Key[] {
    return _userList.toTypedArray()
  }
  
  property get GroupIds() : Key[] {
    return _groupList.toTypedArray()
  }
  
  property get SecurityZoneIds() : Key[] {
    return _securityZoneList.toTypedArray()
  }
  
  property get Anyone() : boolean {
    return _anyone
  }
  
  property get ReferencedBeans() : Set<KeyableBean> {
    return _referencedBeans
  }
  
}
