package gw.api.assignment.examples
uses gw.api.assignment.DynamicGroupAssignmentStrategy
uses java.util.Set
uses java.util.HashSet
uses gw.api.assignment.DynamicAssignmentUtil
uses java.util.Collections

@Export
class GroupSearchCriteriaAssignmentStrategy implements DynamicGroupAssignmentStrategy
{
  private var _searchCriteria : GroupSearchCriteria
  construct(searchCriteria : GroupSearchCriteria)
  {
    _searchCriteria = searchCriteria
  }

  override function getCandidateGroups( assignable: Assignable, group: Group, p2: boolean ) : Set<Group>
  {
    var groups = new HashSet<Group>()
    if (group != null) {
      _searchCriteria.ParentGroup = group
    }
    for (g in _searchCriteria.performSearch().iterator()) {
      groups.add(g as Group)
    }
    return groups
  }

  override function getLocksForAssignable( assignable: Assignable, candidates: Set<Group> ) : Set<KeyableBean>
  {
    
    var assignmentState : DynamicAssignmentState = DynamicAssignmentUtil.getOrCreateDynamicAssignmentState(_searchCriteria, null)
    
    return Collections.singleton( assignmentState ) 

  }

  override function findGroupToAssign( assignable: Assignable, candidates: Set<Group>, locks: Set<KeyableBean> ) : Group
  {
      var chosenGroup : Group  
  
      var lock = (locks.iterator().next()) as DynamicAssignmentState //See getLocksForAssignable below, we know this has exactly one element
      chosenGroup = DynamicAssignmentUtil.findRoundRobinGroupAssignment(lock, candidates as Set<Group>, assignable as KeyableBean)

      if (chosenGroup == null) {
        return null
      } else {
        return chosenGroup
      }

  }

  override function getAssignmentToken( assignable: Assignable ) : Object
  {
    return assignable
  }

  override function rollbackAssignment( p0: Assignable, p1: Object ) : boolean
  {
    return false
  }

}
