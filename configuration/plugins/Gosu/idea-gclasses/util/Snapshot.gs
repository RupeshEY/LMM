package util;

uses gw.api.locale.DisplayKey
uses gw.api.snapshot.ISnapshotEntity
uses gw.api.upgrade.Coercions
uses gw.lang.reflect.features.PropertyReference

uses java.util.Date

@Export
class Snapshot
{

  /**
   *  Used for static functionality only.
   */
  private construct() {
  }

  /**
   * Return a primary phone number for a given contact.
   */
  public static function getPrimaryPhone( contact : dynamic.Dynamic ) : String {
    var primaryPhoneType = getValueOf(contact, entity.Contact#PrimaryPhone)["Code"] as String;
    if( primaryPhoneType == null ) {
      return null;
    }
    switch(primaryPhoneType) {
      case typekey.PrimaryPhoneType.TC_HOME.Code:
          return getValueOf(contact, entity.Contact#HomePhone) as String
      case typekey.PrimaryPhoneType.TC_MOBILE.Code:
          return getValueOf(contact, entity.Person#CellPhone) as String
      case typekey.PrimaryPhoneType.TC_WORK.Code:
          return getValueOf(contact, entity.Contact#WorkPhone) as String
      default:
          return null
    }
  }

  /**
   * Dynamically retrieves the value of the property with the same name from the bean.
   */
  private static function getValueOf(bean:dynamic.Dynamic, propRef:PropertyReference): dynamic.Dynamic {
    return bean[propRef.PropertyInfo.Name]
  }

  /**
   * 300 only - get covered parties for policy
   */
  public static function getCoveredParties( claim : dynamic.Dynamic, policy : dynamic.Dynamic ) : dynamic.Dynamic {
    var claimContacts = new java.util.ArrayList();
    for( cc in claim["contacts"] ) {
      for( role in cc["roles"] ) {
        if( (role["Role"] as String) == "coveredparty" && (role["CoveredPartyType"] as String) == "addinsured" && role["Policy"] == policy ) {
          claimContacts.add( cc );
          break;
        }
      }
    }
    return claimContacts.toTypedArray();
  }

  /**
   * 300 only - get name of coverage, in 300 there is no Vehicle property on VehicleCoverage snapshot or
   * Property property on PropertyCoverage snapshot
   */
  public static function getCoverageName(claim : dynamic.Dynamic, coverage : dynamic.Dynamic) : String {
    var result = ""
    if (coverage == null) {
      // Leave result null
    } else if ((typeof coverage).RelativeName == "PropertyCoverage") {
      for (policyProperty in claim["Policy"]["Properties"] as Object[]) {
        if ((policyProperty["Property"]["Coverages"] as Object[]).toList().hasMatch(\ propertyCoverage -> propertyCoverage == coverage)) {
          result = getDisplayName(policyProperty)
          break
        }
      }
    } else if ((typeof coverage).RelativeName == "VehicleCoverage") {
      for (policyVehicle in claim["Policy"]["Vehicles"] as Object[]) {
        if ((policyVehicle["Vehicle"]["Coverages"] as Object[]).toList().hasMatch(\ vehicleCoverage -> vehicleCoverage == coverage)) {
          result = getDisplayName(policyVehicle)
          break
        }
      }
    } else {
       result = "Policy Level Coverage";
    }
    return result;
  }
  
  /**
   * Return an array of ClaimContactRoles corresponding with a given role name.
   */
  public static function getClaimContactRolesByRole( claim : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    var claimContactRoles = new java.util.ArrayList();
    for (cc in claim["contacts"]) {
      for (role in cc["roles"]) {
        if (role["Role"] != null and strRole.equalsIgnoreCase(role["Role"]["Code"] as String)) {
          claimContactRoles.add( role );
        }
      }
    }
    return claimContactRoles.toArray();
  }

  /**
   * Returns the claimant for a given exposure.
   */
  public static function getClaimant( claim : dynamic.Dynamic, exposure : dynamic.Dynamic ): dynamic.Dynamic {
    var contacts = getClaimContactsByOwnerAndRole( claim, "Exposure", exposure, "Claimant" );
    if( contacts.length == 0 ) {
      contacts = getClaimContactsByRole( claim, "Claimant" );
    }
    return contacts.length > 0 ? contacts[0] : null;
  }

  /**
   * Returns an array of ClaimContacts for a given role name.
   */
  public static function getClaimContactsByRole( claim : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    return getClaimContactsByOwnerAndRole( claim, null, null, strRole );
  }
  
  /**
   * Returns the contact corresponding to an exclusive role on a Policy
   */
  public static function getPolicyClaimContact( claim : dynamic.Dynamic, policy : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    var contacts = getClaimContactsByOwnerAndRole( claim, "Policy", policy, strRole );
    return contacts.length > 0 ? contacts[0]["Contact"] : null;
  }

  /**
   * Returns the contact corresponding to an exclusive role on an Exposure
   */
  public static function getExposureClaimContact( claim : dynamic.Dynamic, exposure : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    var contacts = getClaimContactsByOwnerAndRole( claim, "Exposure", exposure, strRole );
    return contacts.length > 0 ? contacts[0]["Contact"] : null;
  }

  /**
   * Return an array of ClaimContacts for a given exposure and role name.
   */
  public static function getClaimContactsByOwnerAndRole( claim : dynamic.Dynamic, ownerProperty : String, owner : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    var claimContacts = new java.util.ArrayList();
    for (cc in claim["contacts"]) {
      for (role in cc["roles"]) {
        if (role["Role"] != null and strRole.equalsIgnoreCase(role["Role"]["Code"] as String)) {
          if (owner == null || role[ownerProperty] == owner) {
            claimContacts.add( cc );
          }
        }
      }
    }
    return claimContacts?.toTypedArray();
  }

  public static function getContactByRole( claim : dynamic.Dynamic, strRole : String ) : dynamic.Dynamic {
    var claimContacts = getClaimContactsByRole( claim, strRole );
    return (claimContacts != null and claimContacts.length > 0)
           ? claimContacts[0]["Contact"]
           : null;
  }

  /**
   * Return role owner for a given claim contact role. Note we can't use the
   * Owner domain property because it is not included in the snapshot data. So
   * we check each of the ClaimContactRole's related entities to find the owner.
   */
  public static function getRoleOwner( claimContactRole : dynamic.Dynamic ): String {
    return hasProperty(claimContactRole, "Exposure") && claimContactRole["Exposure"] != null
           ? getDisplayName(claimContactRole["Exposure"])
           : hasProperty(claimContactRole, "Matter") && claimContactRole["Matter"] != null
             ? getDisplayName(claimContactRole["Matter"])
             : hasProperty(claimContactRole, "Policy") && claimContactRole["Policy"] != null
               ? getDisplayName(claimContactRole["Policy"])
               : hasProperty(claimContactRole, "ClaimContact") && claimContactRole["ClaimContact"] != null
                 ? getDisplayName(claimContactRole["ClaimContact"]["Claim"])
                 : "The Claim";
  }

  /**
   * Returns an array of distinct contact roles for a given array of
   * ClaimContactRoles.
   */
  public static function getDistinctContactRoles( claimContactRoles : dynamic.Dynamic ) : String {
    var distinctRoles = new java.util.HashSet();
    for( role in claimContactRoles ) {
      distinctRoles.add( role["Role"] );
    }
    return renderValue(distinctRoles?.toTypedArray());
  }

  /**
   * Filters an array of beans, returning only those which have the named type
   */
  public static function filterBeansOfType(beans : dynamic.Dynamic, typeName : String) : dynamic.Dynamic {
    var result = new java.util.ArrayList();
    for (var bean in beans) {
      if (getEntityType(bean) == typeName) {
        result.add(bean);
      }
    }
    return result?.toTypedArray();
  }

  public static function getViewableNotes(Claim : Claim, notes : dynamic.Dynamic) : dynamic.Dynamic {
    var currentUser = User.util.CurrentUser;
    var canViewConfidential = perm.Claim.viewconfidentialnotes(Claim);
    var result = new java.util.ArrayList();
    for (note in notes) {
      if (!(Coercions.makeBooleanFrom(note["Confidential"])) or canViewConfidential
          or (note["Author"]["PublicID"] as String) == currentUser.PublicID) {
        result.add(note);
      }
    }
    return result?.toTypedArray();    
  }
    
  /**
   * Renders a String value for a give dynamic.Dynamic value using the following rules:
   * - Null              = empty string
   * - Boolean           = "Yes" or "No"
   * - DateTime          = "MM/dd/yyyy hh:mm a" (short format, as configured in localization file)
   * - Array             = Comma separated list of recursive calls to this method
   * - has a DisplayName = Renders the value's DisplayName
   * - Default           = Cast the value as a String using Gosu coercion
   */
  public static function renderValue( value : dynamic.Dynamic ) : String {
    if( value == null ) {
      return "";
    }

    if( value typeis Boolean ) {
      return (value as Boolean) ? DisplayKey.get("Java.NameValueView.Boolean.True") : DisplayKey.get("Java.NameValueView.Boolean.False");
    }

    if( value typeis Date ) {
      return (value as Date).formatDateTime(SHORT, SHORT)
    }

    if( value typeis Object[] ) {
      var strArray = "";
      for (elem in (value as Object[]) index i ) {
        strArray = strArray + (i > 0 ? ", " : "") + renderValue( elem );
      }
      return strArray;
    }

    if (hasProperty(value, "DisplayName")) {
      return value["DisplayName"] as String;
    }

    return getDisplayName(value);
  }

  /**
   * If given value is a non null date returns just the date (not the time part) formatted
   * using the short format given in localization.xml. Otherwise returns the empty string
   */
  public static function renderDate(value : dynamic.Dynamic) : String {
    if (value == null || !(value typeis Date)) {
      return "";
    }
    return gw.api.util.StringUtil.formatDate(Coercions.makeDateFrom(value), "short");
  }

  /**
   * If given value is a non null date returns just the time (not the date part) formatted
   * using the short format given in localization.xml. Otherwise returns the empty string
   */
  public static function renderTime(value : dynamic.Dynamic) : String {
    if (value == null || !(value typeis Date)) {
      return "";
    }
    return gw.api.util.StringUtil.formatTime(Coercions.makeDateFrom(value), "short");
  }

  public static function getEntityType(root : Object) : String {
    if (root == null) {
      return null
    } else if (root typeis ISnapshotEntity) {
      return root.EntityType
    } else {
      return (typeof root).RelativeName
    }
  }

  public static function getPropertyValue( root : dynamic.Dynamic, strProperty : String ) : dynamic.Dynamic {
    return hasProperty(root, strProperty) ? root[strProperty] : null
  }

  public static function hasProperty( root : dynamic.Dynamic, strProperty : String ) : boolean {
    return root typeis ISnapshotEntity && root.hasProperty(strProperty)
            || root != null && (typeof root).TypeInfo.getProperty(strProperty) != null
  }

  public static function getDisplayName( bean : dynamic.Dynamic ) : String
  {
    if( bean == null )
    {
      return "";
    }

    if( java.lang.Number.Type.isAssignableFrom( typeof bean ) )
    {
      return (Coercions.makeDoubleFrom(bean)).isNaN() ? "" : bean as String;
    }

    if( bean typeis String )
    {
      return bean;
    }

    var strTypeName = getEntityType(bean);

    switch( strTypeName )
    {
      case "Person":
      {
        var strDisplayName = "" ;
        if ((bean["FirstName"] as String).HasContent) {
          strDisplayName = strDisplayName + bean["FirstName"] + " ";
        }
        if ((bean["LastName"] as String).HasContent) {
          strDisplayName = strDisplayName + bean["LastName"] + " ";
        }
        if (bean["Suffix"] != null) {
          strDisplayName = strDisplayName + bean["Suffix"] + " ";
        }
        return strDisplayName;
      }

      case "Claim":
        return bean["ClaimNumber"] as String;

      case "ActivityPattern":
        return bean["Code"] as String;

      case "Address":
      {
        var sb = new java.lang.StringBuffer();
        if ((bean["AddressLine1"] as String).HasContent) {
          sb.append(bean["AddressLine1"]).append(" ");
        }
        if ((bean["AddressLine2"] as String).HasContent) {
          sb.append(bean["AddressLine2"]).append(" ");
        }
        if ((bean["AddressLine3"] as String).HasContent) {
          sb.append(bean["AddressLine3"]).append(" ");
        }
        if ((bean["City"] as String).HasContent) {
          sb.append(bean["City"]).append(" ");
        }
        if (bean["State"] != null) {
          sb.append(bean["State"]).append(" ");
        }
        if ((bean["PostalCode"] as String).HasContent) {
          sb.append(bean["PostalCode"]).append(" ");
        }

        var retString = sb.toString();
        if (not retString.HasContent) {
          retString = DisplayKey.get("Java.DisplayName.NewlyCreated");
        }

        return retString;
      }

      case "Catastrophe":
        return bean["CatastropheNumber"] + " - " + bean["Name"];

      case "EmploymentClass":
      {
        var retString = bean["ClassCode"] as String;
        if ((bean["Description"] as String).HasContent) {
          retString = retString + " - " + bean["Description"];
        }
        return retString;
      }

      case "Policy":
        return bean["PolicyNumber"] as String;

      case "PhysicalProperty":
      case "PolicyLocation":
      case "Property":
      {
        var retString = "";
        if ((bean["location"] as String).HasContent) {
          retString = retString + bean["location"] + " ";
        }
        if ((bean["buildingNumber"] as String).HasContent) {
          retString = retString + "(building: " + bean["buildingNumber"] + ") ";
        }
        var strAddress = getDisplayName(bean["address"]);
        if (strAddress.HasContent) {
          var wrapAddress = retString.HasContent;
          if (wrapAddress) {
            retString = retString + "(";
          }
          retString = retString + strAddress;
          if (wrapAddress) {
            retString = retString + ")";
          }
        }

        if (not retString.HasContent) {
          retString = DisplayKey.get("Java.DisplayName.NewlyCreated");
        }

        return retString;
      }

      case "PolicyProperty":
        return getDisplayName(bean["Property"]);

      case "StatCode":
      {
        var sb = new java.lang.StringBuffer();

        sb.append(bean["lineNumber"]).append(". ").append(bean["InsuranceLine"]).append(" / ").append(bean["InsuranceSubLine"]).append(" (");
        if ((bean["BuildingNumber"] as String).HasContent) {
          sb.append(bean["BuildingNumber"]);
        } else
        if ((bean["VehicleNumber"] as String).HasContent) {
          sb.append(bean["VehicleNumber"]);
        } else
        if ((bean["LocationNumber"] as String).HasContent) {
          sb.append(bean["LocationNumber"]);
        } else
        if ((bean["ClassCode"] as String).HasContent) {
          sb.append(bean["ClassCode"]);
        }
        sb.append( ")");

        return sb.toString();
      }

      case "User":
        return getDisplayName( bean["Contact"] );

      case "Vehicle":
      {
        var sb = new java.lang.StringBuffer();
        if ((bean["year"] as String).HasContent) {
        var strYear = bean["year"] + " ";
          sb.append(strYear);
        }
        if ((bean["make"] as String).HasContent) {
          sb.append(bean["make"]).append(" ");
        }
        if ((bean["model"] as String).HasContent) {
          sb.append(bean["model"]).append(" ");
        }
        if ((bean["licensePlate"] as String).HasContent) {
          sb.append("(").append(bean["licensePlate"]);
          if (bean["state"] != null) {
            sb.append(" / ").append(bean["state"]);
          }
          sb.append(")");
        }

        var retString = sb.toString();
        if (not retString.HasContent) {
          retString = DisplayKey.get("Java.DisplayName.NewlyCreated");
        }

        return retString;
      }

      case "Exposure":
      {
        var retString = "(" + bean["ClaimOrder"] + ") " + bean["Subtype"] + " - ";
        if (bean["lossParty"] != null) {
          retString = retString + bean["lossParty"];
        }
        return retString;
      }

      case "Coverage":
      {
        var retString = "";
        if (getDisplayName(bean["subType"]) == "PropertyCoverage") {
          retString = getDisplayName(bean["property"]);
        }
        if (getDisplayName(bean["SubType"]) == "VehicleCoverage") {
          retString = getDisplayName(bean["vehicle"]);
        }
        if (getDisplayName(bean["SubType"]) == "PolicyCoverage") {
          retString = "Policy Level Coverage";
        }
        return retString;
      }

      case "PolicyCoverage":
        return "Policy Level Coverage";

      case "VehicleCoverage":
        return getDisplayName( bean["Vehicle"] );

      case "PropertyCoverage":
        return getDisplayName( bean["Property"] );

      case "PolicyVehicle":
        return getDisplayName( bean["Vehicle"] );

      case "Activity":
        return bean["Subject"] as String;

      case "PropertyOwner":
      case "VehicleOwner":
        return getDisplayName( bean["lienholder"] );

      case "UserRoleAssignment":
        return getDisplayName( bean["role"] );

      default:
      {
        var nameValue = getPropertyValue(bean, "Name") as String
        return nameValue != null ? nameValue : (bean as String)
      }
    }
  }

}
