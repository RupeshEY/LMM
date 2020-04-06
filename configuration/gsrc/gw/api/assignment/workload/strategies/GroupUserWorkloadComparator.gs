package gw.api.assignment.workload.strategies

uses gw.api.util.Math

uses java.lang.Integer
uses java.util.Comparator
uses java.util.Map

/**
 * <p>Comparator class which is by Workload Assignment Strategies to sort Users by workload. The goal
 * of Weighted Workload is to find the User with the least workload as the potential assignee for an
 * Assignable. This will almost always be the first element of the sorted list.</p>
 * 
 * <p>The criteria for ordering is as follows:
 * <ul>
 * <li>The user's workload based on the sum of all weights calculated from all matching classifications and supplemental weight</li>
 * <li>The last time the user's workload was computed and updated</li>
 * <li>The user's username</li>
 * </ul>
 * </p>
 * 
 */
@Export
public class GroupUserWorkloadComparator implements Comparator<GroupUser> {

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Members
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Map of unbiased user workload weights.
   */
  private var _weights : Map<GroupUser, Integer> as readonly UserWeights
 
 
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  internal construct(weightTable : Map<GroupUser, Integer>) {
    _weights = weightTable
  }


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  public override function compare(firstGroupUser : GroupUser, secondGroupUser : GroupUser) : int {
    // obtain total workloads for each of the users being used for comparison
    var firstGroupUserWeight = calculateWorkload(firstGroupUser)
    var secondGroupUserWeight = calculateWorkload(secondGroupUser)
    
    // winner is the one with the lower workload
    if (firstGroupUserWeight < secondGroupUserWeight) {
      return -1
    } else if (firstGroupUserWeight > secondGroupUserWeight) {
      return 1
    }       
    
    // Tiebreaker condition if both User's Workloads being compared are the same: use the last time
    // the user workload was updated as tiebreaker.
    else {
      // safety default - use the User object last update time in case the workload last update time
      // is undefined
      var firstGroupUserTime = firstGroupUser.User.UpdateTime
      var secondGroupUserTime = secondGroupUser.User.UpdateTime
      
      // use workload last update time if defined
      if (firstGroupUser.GroupUserWorkload != null and firstGroupUser.GroupUserWorkload.WorkloadUpdated != null) {
        firstGroupUserTime = firstGroupUser.GroupUserWorkload.WorkloadUpdated
      } 
      
      // use workload last update time if defined
      if (secondGroupUser.GroupUserWorkload != null and secondGroupUser.GroupUserWorkload.WorkloadUpdated != null) {
        secondGroupUserTime = secondGroupUser.GroupUserWorkload.WorkloadUpdated
      }                

      // tiebreaker based on last time User Workload was updated, if not defined then use the last time the
      // User object itself was updated.
      if (firstGroupUserTime != secondGroupUserTime) {
        return firstGroupUserTime.compareTo(secondGroupUserTime)
      } else {
        // final tiebreakers -- username and associated group
        if (not firstGroupUser.User.Credential.UserName.equalsIgnoreCase(secondGroupUser.User.Credential.UserName)) {
          return firstGroupUser.User.Credential.UserName.compareToIgnoreCase(secondGroupUser.User.Credential.UserName)
        } else {
          return compare(firstGroupUser.Group, secondGroupUser.Group)
        }
      }
    }
  }

  private function compare(group1 : Group, group2 : Group) : int {
    var cmp = 0
    if (group1.NameKanji != null) {
      cmp = group1.NameKanji.compareTo(group2.NameKanji)
    } else if (group2.NameKanji != null) {
      cmp = - group2.NameKanji.compareTo(group1.NameKanji)
    }
    if (cmp == 0) {
      cmp = group1.Name.compareToIgnoreCase(group2.Name)
    }
    return cmp
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  /**
   * Returns the load factor mulitplier for a user-group relationship. 
   */
  protected function getUserLoadFactor(gu : GroupUser) : int {
    return Math.Nz(gu.LoadFactor)
  }
  
  
  /**
   * Returns the group load factor mulitplier for the user's group. 
   */
  protected function getGroupLoadFactor(gu : GroupUser)  : int {
    return Math.Nz(gu.Group.LoadFactor)
  }
  
  
  /**
   * Returns the workload for the user. 
   */
  protected function calculateWorkload(groupUser : GroupUser) : int {
    return UserWeights.get(groupUser)
  }

}
