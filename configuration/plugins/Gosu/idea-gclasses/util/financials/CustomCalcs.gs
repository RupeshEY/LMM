package util.financials;

uses gw.api.financials.FinancialsCalculation
uses gw.api.financials.FinancialsCalculationUtil

//  This is an example of how you could define custom financial calculations in one place and then refer to them 
//  in rules or PCF files throughout the application.  Once defined like this, you could refer to any of the 
//  calculations as follow:
//  util.financials.CustomCalcs.MyTotalIncurredNet.getAmount( foo ); // where 'foo' represents the args for one of the overloaded versions of the getAmount() method
//  An example of this usage can be found in the sample Transaction Approval rule provided in the default configuration.
@Export
class CustomCalcs
{
  construct()
  {
  }

  private static var calcMyTotalIncurredNet = FinancialsCalculationUtil.getFinancialsCalculation(
          FinancialsCalculationUtil.GrossTotalIncurredExpression.minus(FinancialsCalculationUtil.TotalRecoveryReservesExpression));
  
  public static property get MyTotalIncurredNet() : FinancialsCalculation
  {
    return calcMyTotalIncurredNet;
  }
}
