package gw.entity

uses java.lang.StringBuilder


/**
 * Add field level Display names for Japanese Kanji
 */
@Export
enhancement GWPolicySummaryPropertyEnhancement: entity.PolicySummaryProperty {
   property get DisplayAddress() : String {
     var sb = new StringBuilder()

     //Japan
     if(this.AddressLine1Kanji.HasContent){
       sb.append(this.AddressLine1Kanji)
       if(this.AddressLine2Kanji.HasContent){
         sb.append(this.AddressLine2Kanji)
       } else if(this.AddressLine2.HasContent){
         sb.append(this.AddressLine2)
       }
     //Other country
     } else if(this.AddressLine1.HasContent){
       sb.append(this.AddressLine1)
       if(this.AddressLine2.HasContent){
         sb.append(",")
           .append(this.AddressLine2)
       }
     }
     return sb.toString()
   }

   property get DisplayCity() : String {
     return this.CityKanji.HasContent ? this.CityKanji : this.City
   }
}
