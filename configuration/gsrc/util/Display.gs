package util;
uses gw.api.util.Math;
uses java.lang.Double

@Export
class Display
{
 
  public static function DisplayPercent(Numerator: Double, Denominator: Double) : String {  
    
    var result : String;
    var tempResult : Double;
  
    if (Denominator > 0) {
      tempResult = Numerator / Denominator;
    
      var tempResult2 : Double = Math.roundNearest(tempResult * 1000);
      tempResult2  = tempResult2 / 10;
      if (tempResult2 == Math.roundNearest(tempResult2) ){
        result = (tempResult2 as String) + ".0%";
      } else { 
        result = (tempResult2 as String) + "%";
      }
    

    } else {  
      if (Denominator < 0){
        result = "na"
      } else {
        result = "--"
      }
    }
  
    return result; 
  }
   
         
}

