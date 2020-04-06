package gw.financials

uses gw.api.financials.CurrencyAmountPair
uses java.lang.UnsupportedOperationException
uses java.util.Date
uses java.util.List

/**
 * The CheckRecurrenceUIHelper encapsulates the properties and functions needed to
 * display a check recurrence within the New/Edit/Clone Check Wizard Instructions Page. 
 */
@Export
class CheckRecurrenceUIHelper {

  protected var _check : Check
  protected var _recurrenceType : CheckRecurrenceType
  protected var _issueCheckInAdvance : boolean

  private var _weeklyRecurrenceUIHelper : WeeklyRecurrenceUIHelper = new WeeklyRecurrenceUIHelper()
  private var _monthlyRecurrenceUIHelper : MonthlyRecurrenceUIHelper = new MonthlyRecurrenceUIHelper()
  
  construct(primaryCheck : Check) {
    _check = primaryCheck
    initialize()
  }
  
  /**
   * Current check being modified in the wizard.
   */
  public property get Check() : Check { 
    return _check 
  }
  
  /**
   * Whether or not this is a recurring check.
   */  
  public property get Recurring() : boolean { 
    return _recurrenceType == CheckRecurrenceType.SINGLE ? false : true
  }

  /**
   * Whether the check should be issued a number of days ahead of the check due date.
   */
  public property get IssueCheckInAdvance() : boolean { 
    return _issueCheckInAdvance 
  }
  
  /**
   * Sets the visibility of the input box for the number of days in advance
   * a check should be issued. 
   */
  public property set IssueCheckInAdvance(value : boolean) { 
    _issueCheckInAdvance = value
    if(_issueCheckInAdvance and CheckRecurrence.IssuanceDateOffset < 1) {
      CheckRecurrence.IssuanceDateOffset = null
    } else if (!_issueCheckInAdvance) {
      CheckRecurrence.IssuanceDateOffset = 0
    }
  }

  /**
   * Sets the check's due date and check recurrence's first due date for recurring checks.
   */
  public property set ScheduledSendDate(date : Date) {
     _check.ScheduledSendDate = date
     if(Recurring) {
       CheckRecurrence.FirstDueDate = date
     }
   }
   
   /**
    * The check due date of a non-recurring check or the first check due date for a recurring check.
    */
  public property get ScheduledSendDate() : Date {
     return Recurring ? CheckRecurrence.FirstDueDate : _check.ScheduledSendDate
   }
   
  /**
   * Total gross amount of the check recurrence in the transaction currency and reserving currency.
   */
  public property get TotalAmount() : CurrencyAmountPair {
    if(Recurring) {
      if (CheckRecurrence.NumChecks > 1) {
        if(!Check.isGroupMember(false)) {
          return new CurrencyAmountPair(_check.GrossAmountPair.PrimaryAmount * CheckRecurrence.NumChecks, 
                                        _check.GrossAmountPair.SecondaryAmount * CheckRecurrence.NumChecks)
        } else {
          return new CurrencyAmountPair(_check.Group.GrossAmountPair.PrimaryAmount * CheckRecurrence.NumChecks,
                                        _check.Group.GrossAmountPair.SecondaryAmount * CheckRecurrence.NumChecks)
        }
      } else {
        return null
      }
    } else {
      return (!Check.isGroupMember(false) ? _check.GrossAmountPair : _check.Group.GrossAmountPair)
    }
  }

  /**
   * Sets the check recurrence type. Every time the check recurrence type is changed, the old recurrence data is 
   * preserved within the session. Common recurrence fields like ScheduledSendDate, IssuanceDateOffset, and 
   * the NumChecks are saved when switching between recurrence types. 
   */
  public property set RecurrenceType(type : CheckRecurrenceType) {
    var oldRecurrence = _check.CheckSet.Recurrence
    _recurrenceType = type
    
    switch(_recurrenceType) {
      case CheckRecurrenceType.SINGLE:
        _check.CheckSet.Recurrence = null
        break
      case CheckRecurrenceType.WEEKLY:
        if(_weeklyRecurrenceUIHelper.Recurrence.Retired) {
          _weeklyRecurrenceUIHelper.Recurrence = _weeklyRecurrenceUIHelper.Recurrence.copy() as WeeklyCheckRecurrence
        }
        _check.CheckSet.Recurrence = _weeklyRecurrenceUIHelper.Recurrence
        break
      case CheckRecurrenceType.MONTHLY:
        if(_monthlyRecurrenceUIHelper.Recurrence.Retired) {
          _monthlyRecurrenceUIHelper.Recurrence = _monthlyRecurrenceUIHelper.Recurrence.copy() as MonthlyCheckRecurrence
        }
        _check.CheckSet.Recurrence = _monthlyRecurrenceUIHelper.Recurrence
        break
      default:
        throw new UnsupportedOperationException("Check Recurrence type of " + type + " does not exist.")
    }
    
    // copy common recurrence data from old to new recurrence type
    ScheduledSendDate = oldRecurrence == null ? _check.ScheduledSendDate : oldRecurrence.FirstDueDate
    
    if(CheckRecurrence != null and oldRecurrence != null) {
      CheckRecurrence.NumChecks = oldRecurrence.NumChecks
      CheckRecurrence.IssuanceDateOffset = oldRecurrence.IssuanceDateOffset
    }

    if(oldRecurrence != null) {
      oldRecurrence.remove()
    }
  }
  
  public property get RecurrenceTypes() : List<CheckRecurrenceType> {
    // when editting, disable changing from recurring to non-recurring
    if(!_check.New and _recurrenceType != CheckRecurrenceType.SINGLE) {
      return CheckRecurrenceType.AllValues.where(\ c -> c != CheckRecurrenceType.SINGLE)
    }
    return CheckRecurrenceType.AllValues
  }
  
  /**
   * Weekly recurrence helper that holds data specific to a check with a weekly recurrence.
   */
  public property get Weekly() : WeeklyRecurrenceUIHelper {
    return _weeklyRecurrenceUIHelper
  }

  /**
   * Monthly recurrence helper that holds data specific to a check with a monthly recurrence.
   */
  public property get Monthly() : MonthlyRecurrenceUIHelper {
    return _monthlyRecurrenceUIHelper  
  }
  
  /**
   * The appropriate CheckRecurrence depending on the selected check recurrence type.
   */
  public property get CheckRecurrence() : CheckRecurrence {
    if(RecurrenceType == CheckRecurrenceType.WEEKLY) {
      return _weeklyRecurrenceUIHelper.Recurrence
    } else if (RecurrenceType == CheckRecurrenceType.MONTHLY) {
      return _monthlyRecurrenceUIHelper.Recurrence 
    }
    return null
  }
  
  /**
   * The type of check recurrence (i.e. Single (No recurrence), Weekly, or Monthly)
   */
  public property get RecurrenceType() : CheckRecurrenceType {
    return _recurrenceType
  }

  /**
   * Whether the CheckRecurrence input set should be visible or not: hide if check is rejected.
   */
  public property get Visible() : boolean {
    return _check.CheckSet.ApprovalStatus != ApprovalStatus.TC_REJECTED
  }
  // --------------------------------------------------------------------------------------------------- Private Methods
  /**
   * Initialize the recurrence information displayed in the UI depending on whether a recurrence exists on the CheckSet.
   * When first creating a check in the NewCheckWizard, the check has no recurrence. By default, a single recurrence 
   * (i.e. no recurrence) is selected in the UI.
   * When editting or cloning a check, a check recurrence may exist. Given the check recurrence, the appropriate
   * recurrence type is set and the recurrence is saved so that it can be easily modified.
   */
  private function initialize() {
    // if a check recurrence exists (either in EditCheckWizard or CloneCheckWizard)
    if(_check.CheckSet.Recurrence != null) {
      if(_check.CheckSet.Recurrence typeis WeeklyCheckRecurrence) {
        _recurrenceType = CheckRecurrenceType.WEEKLY
        _weeklyRecurrenceUIHelper.Recurrence = _check.CheckSet.Recurrence
      } else if(_check.CheckSet.Recurrence typeis MonthlyCheckRecurrence) {
        _recurrenceType = CheckRecurrenceType.MONTHLY
        _monthlyRecurrenceUIHelper.Recurrence = _check.CheckSet.Recurrence
        if(_check.CheckSet.Recurrence.RecurrenceDate == null) {
          _monthlyRecurrenceUIHelper.DateType = MonthlyRecurrenceDateType.WEEKDAY
        }
      }
      if(_check.CheckSet.Recurrence.IssuanceDateOffset > 0) {
        IssueCheckInAdvance = true      
      }
    } else {
      _recurrenceType = CheckRecurrenceType.SINGLE
    }
  }
  
  
  // --------------------------------------------------------------------------------------------------- Weekly Recurrence
  /**
   * Helper class that holds data specific to a check with a weekly recurrence.
   */
  public class WeeklyRecurrenceUIHelper {
    private var _recurrence : WeeklyCheckRecurrence
    
    construct() {     
      if(_check.CheckSet.Recurrence != null ) {
        _recurrence = _check.CheckSet.Recurrence as WeeklyCheckRecurrence
      } 
    }
    
    /**
     * Weekly check recurrence being modified.
     */
    public property get Recurrence() : WeeklyCheckRecurrence {
      if(_recurrence == null) {
        createRecurrenceWithDefaults()
      }
      return _recurrence
    }

    /**
     * Sets the weekly check recurrence.
     */
    public property set Recurrence(inRecurrence : WeeklyCheckRecurrence) { 
      _recurrence = inRecurrence
    }
    
    /**
     * Weekly frequency of the check (i.e. every week, every two weeks, other (user defined every X weeks)).
     */
    public property get FrequencyType() : WeeklyRecurrenceFrequency {
      switch(Recurrence.WeeklyFrequency) {
        case 1 :
          return WeeklyRecurrenceFrequency.EVERY_WEEK
        case 2 :
          return WeeklyRecurrenceFrequency.EVERY_TWO_WEEKS
        default :
          return WeeklyRecurrenceFrequency.OTHER
      }
    }
  
    /**
     * Sets the weekly frequency type. Fails if the given frequency type does not exist. 
     */
    public property set FrequencyType(frequency : WeeklyRecurrenceFrequency) {
      switch(frequency) {
        case WeeklyRecurrenceFrequency.EVERY_WEEK:
          Recurrence.WeeklyFrequency = 1
          break;
        case WeeklyRecurrenceFrequency.EVERY_TWO_WEEKS:
          Recurrence.WeeklyFrequency = 2
          break;
        case WeeklyRecurrenceFrequency.OTHER:
          Recurrence.WeeklyFrequency = null
          break;
        default:
          throw new UnsupportedOperationException("Weekly frequency type " + frequency + " does not exist.")
      }
    }  
    
    /**
     * Creates a new weekly check recurrence set to every week and first due date 
     * the same as the check's due date.
     */
    private function createRecurrenceWithDefaults() {
      _recurrence = new WeeklyCheckRecurrence()
      _recurrence.RecurrenceDay = RecurrenceDay.TC_MON
      _recurrence.WeeklyFrequency = 1
      _recurrence.FirstDueDate = _check.ScheduledSendDate
      _recurrence.NumChecks = null
    }
  }
  
  // --------------------------------------------------------------------------------------------------- Monthly Recurrence
  public class MonthlyRecurrenceUIHelper {
    private var _recurrence : MonthlyCheckRecurrence
    private var _dueDateType : MonthlyRecurrenceDateType
    
    construct() {
      if(_check.CheckSet.Recurrence != null) {
        _recurrence = _check.CheckSet.Recurrence as MonthlyCheckRecurrence
      }
    }

    /**
     * Monthly check recurrence being modified.
     */
    public property get Recurrence() : MonthlyCheckRecurrence { 
      if(_recurrence == null) {
        createRecurrenceWithDefaults()
      }
      return _recurrence
    }

    /**
     * Sets the monthly check recurrence.
     */
    public property set Recurrence(inRecurrence : MonthlyCheckRecurrence) { 
      _recurrence = inRecurrence
    }
  
    /**
     * Monthly frequency of the check (i.e. every month, or other (user defined every X months)).
     */
    public property get FrequencyType() : MonthlyRecurrenceFrequency {
      switch(Recurrence.MonthlyFrequency) {
        case 1 :
          return MonthlyRecurrenceFrequency.EVERY_MONTH
        default :
          return MonthlyRecurrenceFrequency.OTHER
      }
    }

    /**
     * Sets the monthly frequency type. Fails if the given frequency type does not exist. 
     */
    public property set FrequencyType(frequency : MonthlyRecurrenceFrequency) {
      switch(frequency) {
        case MonthlyRecurrenceFrequency.EVERY_MONTH:
          Recurrence.MonthlyFrequency = 1
          break;
        case MonthlyRecurrenceFrequency.OTHER:
          Recurrence.MonthlyFrequency = null
          break;
        default:
          throw new UnsupportedOperationException("Monthly frequency type of " + frequency + " does not exist.")
      }
    }  

    /**
     * Type of monthly recurrence date (i.e. specific day of the month (15) or day of the week (Tuesday)).
     */
    public property get DateType() : MonthlyRecurrenceDateType {
      if(_dueDateType == null) {
        return MonthlyRecurrenceDateType.SPECIFIC_DATE
      }
      return _dueDateType
    }
  
    /**
     * Sets the type of monthly recurrence date
     */
    public property set DateType(type : MonthlyRecurrenceDateType) {
      // resets the 
      Recurrence.RecurrenceDate = null
      _dueDateType = type
    }  

    /**
     * Creates a new monthly check recurrence set to every month and first due date 
     * the same as the check's due date.
     */
    private function createRecurrenceWithDefaults() {
      _recurrence = new MonthlyCheckRecurrence()
      _recurrence.RecurrenceDay = RecurrenceDay.TC_MON
      _recurrence.RecurrenceWeek = RecurrenceWeek.TC_FIRST
      _recurrence.MonthlyFrequency = 1
      _recurrence.FirstDueDate = _check.ScheduledSendDate
      _recurrence.NumChecks = null
    }
  }
}
