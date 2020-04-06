package gw.api.assignment.examples
uses gw.api.assignment.Assignee

@Export
class LeastRecentlyModifiedAssignee implements Assignee
{
  construct()
  {
  }

  override function assignToThis( p0: Assignable ) : void
  {
    p0.assignUserDynamically(new LeastRecentlyModifiedAssignmentStrategy(), p0.AssignedGroup, false)
  }
  
  override function toString() : String {
    return "Load Balanced Assignment"    
  }

}
