package gw.api.assignment.examples
uses gw.api.assignment.DynamicUserAssignmentStrategy
uses java.util.Set
uses java.util.HashSet
uses java.util.Collections
uses gw.pl.persistence.core.Bundle
uses gw.transaction.Transaction
uses gw.api.assignment.DynamicAssignmentUtil
uses java.util.List

@Export
class MultipleRolesAssignmentStrategy implements DynamicUserAssignmentStrategy 
{
  var _roles : List<Role>
  
  construct(roles : List<Role>) {
    _roles = roles  
  }
  
    override function findUserToAssign( assignable: Assignable, candidates: Set<User>, locks: Set<KeyableBean> ) : GroupUser
  {
      var chosenUser : User

      var lock = (locks.iterator().next()) as DynamicAssignmentState //See getLocksForAssignable below, we know this has exactly one element
      chosenUser = DynamicAssignmentUtil.findRoundRobinUserAssignment(lock, candidates as Set<User>, assignable as KeyableBean)

      if (chosenUser == null) {
        return null
      } else {
        return chosenUser.GroupUsers[0]
      }
  }

  override function getCandidateUsers( assignable: Assignable, group: Group, includeSubGroups: boolean ) : Set<User>
  {
      var users = new HashSet<User>()
      
      for (nextRole in _roles) {
        for (nextUser in nextRole.AllUsers) {
          users.add((nextUser as UserRole).User)
        }
      }
      
      return users;
  }

  override function getLocksForAssignable( assignable: Assignable, candidates: Set<User> ) : Set<KeyableBean>
  {    
    var fingerprint : String = "MultipleRoleAssignment"
    
    for (role in _roles) {
      fingerprint = fingerprint + role.Name
    }
    
    var assignmentState : DynamicAssignmentState = DynamicAssignmentUtil.getOrCreateDynamicAssignmentState(fingerprint, false)
    
    return Collections.singleton( assignmentState ) 
  }
  
  override function getAssignmentToken( assignable: Assignable ) : Object
  {
    return assignable
  }

  override function rollbackAssignment( assignable: Assignable, assignedEntity: Object ) : boolean
  {
    return false
  }

}
