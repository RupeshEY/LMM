package gw.api.assignment.examples

@Export
class AttributeAssignmentBySeniority
{
  static var i = 0;
  var regularAdjuster : AttributeCriteriaElement;
  var seniorAdjuster : AttributeCriteriaElement;

  construct()
  { 
    regularAdjuster = new AttributeCriteriaElement();
    regularAdjuster.AttributeType = UserAttributeType.TC_EXPERTISE;
    regularAdjuster.AttributeField = "Name"
    regularAdjuster.AttributeValue = "Regular";

    seniorAdjuster = new AttributeCriteriaElement();
    seniorAdjuster.AttributeType = UserAttributeType.TC_EXPERTISE;
    seniorAdjuster.AttributeField = "Name"
    seniorAdjuster.AttributeValue = "Senior";
  }

  function assignByComplexityAndSeniority(claim: Claim, group:Group) : boolean {
    var complex = isComplexClaim(claim); 
    var attrCriElem : AttributeCriteriaElement;
    if (complex) {
      attrCriElem = seniorAdjuster;
      // java.lang.System.Err.println("Assigning to Senior adjuster");
    } else { 
      attrCriElem = regularAdjuster
      // java.lang.System.Err.println("Assigning to Regular adjuster");
    }
    var criteria = new AttributeBasedAssignmentCriteria()
    criteria.addToAttributeCriteria( attrCriElem )
    return claim.assignByUserAttributes( criteria, true, group)
  }

    // var reallycomplex = isMoreComplexClaim(claim)
    // complex: single BI, UIM claims
    // very complex: 
    // * multiple BI
    // * fatalities    

  
  function isComplexClaim(claim: Claim) : boolean {
    i = i + 1;
    if (i % 5 == 0) return true;  
    // simple claim:
    // * 1,2 car collisoins with no injuries
    // * Glass claim
    return false;
  }
}

