package datatype

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "")
enhancement GWDataTypesEnhancement : gw.datatype.DataTypes {
  static function account () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("account", parameters)
  }
  
  static function account (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("account", parameters)
  }
  
  static function addressline () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("addressline", parameters)
  }
  
  static function addressline (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("addressline", parameters)
  }
  
  static function bit () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("bit", parameters)
  }
  
  static function bit (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("bit", parameters)
  }
  
  static function blob () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("blob", parameters)
  }
  
  static function claimnumber () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("claimnumber", parameters)
  }
  
  static function claimnumber (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("claimnumber", parameters)
  }
  
  static function companyname () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("companyname", parameters)
  }
  
  static function companyname (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("companyname", parameters)
  }
  
  static function contactidentifier () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("contactidentifier", parameters)
  }
  
  static function contactidentifier (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("contactidentifier", parameters)
  }
  
  static function creditcardnumber () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("creditcardnumber", parameters)
  }
  
  static function creditcardnumber (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("creditcardnumber", parameters)
  }
  
  static function currencyamount () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("currencyamount", parameters)
  }
  
  static function currencyamount (validator :  java.lang.String, currencyProperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("currencyProperty", currencyProperty as java.lang.String)
    return gw.datatype.DataTypes.get("currencyamount", parameters)
  }
  
  static function dateonly () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("dateonly", parameters)
  }
  
  static function dateonly (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("dateonly", parameters)
  }
  
  static function datetime () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("datetime", parameters)
  }
  
  static function datetime (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("datetime", parameters)
  }
  
  static function daysworkedweek () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("daysworkedweek", parameters)
  }
  
  static function daysworkedweek (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("daysworkedweek", parameters)
  }
  
  static function dbstat () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("dbstat", parameters)
  }
  
  static function dbstat (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("dbstat", parameters)
  }
  
  static function decimal (precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("decimal", parameters)
  }
  
  static function decimal (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("decimal", parameters)
  }
  
  static function decimalmetric () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("decimalmetric", parameters)
  }
  
  static function decimalmetric (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("decimalmetric", parameters)
  }
  
  static function driverlicense () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("driverlicense", parameters)
  }
  
  static function driverlicense (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("driverlicense", parameters)
  }
  
  static function duns () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("duns", parameters)
  }
  
  static function duns (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("duns", parameters)
  }
  
  static function employmentclassification () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("employmentclassification", parameters)
  }
  
  static function employmentclassification (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("employmentclassification", parameters)
  }
  
  static function exchangerate () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("exchangerate", parameters)
  }
  
  static function exchangerate (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("exchangerate", parameters)
  }
  
  static function exmod () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("exmod", parameters)
  }
  
  static function exmod (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("exmod", parameters)
  }
  
  static function externalid () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("externalid", parameters)
  }
  
  static function firstname () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("firstname", parameters)
  }
  
  static function firstname (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("firstname", parameters)
  }
  
  static function foreignkey () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("foreignkey", parameters)
  }
  
  static function hoursworkedday () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("hoursworkedday", parameters)
  }
  
  static function hoursworkedday (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("hoursworkedday", parameters)
  }
  
  static function integer () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("integer", parameters)
  }
  
  static function integer (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("integer", parameters)
  }
  
  static function japaneseimperialdate () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("japaneseimperialdate", parameters)
  }
  
  static function key () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("key", parameters)
  }
  
  static function lastname () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("lastname", parameters)
  }
  
  static function lastname (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("lastname", parameters)
  }
  
  static function localizedstring (validator :  java.lang.String, size :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, countryproperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("size", size as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("countryproperty", countryproperty as java.lang.String)
    return gw.datatype.DataTypes.get("localizedstring", parameters)
  }
  
  static function localizedstring (validator :  java.lang.String, size :  java.lang.Integer, countryproperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("size", size as java.lang.String)
    parameters.put("countryproperty", countryproperty as java.lang.String)
    return gw.datatype.DataTypes.get("localizedstring", parameters)
  }
  
  static function lockingcolumn () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("lockingcolumn", parameters)
  }
  
  static function lockingcolumn (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("lockingcolumn", parameters)
  }
  
  static function longint () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("longint", parameters)
  }
  
  static function longint (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("longint", parameters)
  }
  
  static function longtext () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("longtext", parameters)
  }
  
  static function longtext (validator :  java.lang.String, logicalSize :  java.lang.Integer, trimwhitespace :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    return gw.datatype.DataTypes.get("longtext", parameters)
  }
  
  static function mediumtext () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("mediumtext", parameters)
  }
  
  static function mediumtext (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("mediumtext", parameters)
  }
  
  static function money () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("money", parameters)
  }
  
  static function money (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("money", parameters)
  }
  
  static function monthlyfrequency () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("monthlyfrequency", parameters)
  }
  
  static function monthlyfrequency (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("monthlyfrequency", parameters)
  }
  
  static function negativemoney () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("negativemoney", parameters)
  }
  
  static function negativemoney (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("negativemoney", parameters)
  }
  
  static function nonnegativecurrencyamount () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("nonnegativecurrencyamount", parameters)
  }
  
  static function nonnegativecurrencyamount (validator :  java.lang.String, currencyProperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("currencyProperty", currencyProperty as java.lang.String)
    return gw.datatype.DataTypes.get("nonnegativecurrencyamount", parameters)
  }
  
  static function nonnegativeinteger () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("nonnegativeinteger", parameters)
  }
  
  static function nonnegativeinteger (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("nonnegativeinteger", parameters)
  }
  
  static function nonnegativemoney () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("nonnegativemoney", parameters)
  }
  
  static function nonnegativemoney (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("nonnegativemoney", parameters)
  }
  
  static function nonpersistentjapaneseimperialdate () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("nonpersistentjapaneseimperialdate", parameters)
  }
  
  static function nonpersistentjapaneseimperialdate (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("nonpersistentjapaneseimperialdate", parameters)
  }
  
  static function nonpositivemoney () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("nonpositivemoney", parameters)
  }
  
  static function nonpositivemoney (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("nonpositivemoney", parameters)
  }
  
  static function normalizedexchangerate () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("normalizedexchangerate", parameters)
  }
  
  static function normalizedexchangerate (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("normalizedexchangerate", parameters)
  }
  
  static function pastdatetime () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("pastdatetime", parameters)
  }
  
  static function pastdatetime (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("pastdatetime", parameters)
  }
  
  static function patterncode () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("patterncode", parameters)
  }
  
  static function patterncode (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("patterncode", parameters)
  }
  
  static function percentage () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("percentage", parameters)
  }
  
  static function percentage (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("percentage", parameters)
  }
  
  static function percentagedec () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("percentagedec", parameters)
  }
  
  static function percentagedec (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("percentagedec", parameters)
  }
  
  static function percentagemetric () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("percentagemetric", parameters)
  }
  
  static function percentagemetric (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("percentagemetric", parameters)
  }
  
  static function phone () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("phone", parameters)
  }
  
  static function phone (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean, phonecountrycodeProperty :  java.lang.String, extensionProperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    parameters.put("phonecountrycodeProperty", phonecountrycodeProperty as java.lang.String)
    parameters.put("extensionProperty", extensionProperty as java.lang.String)
    return gw.datatype.DataTypes.get("phone", parameters)
  }
  
  static function policynumber () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("policynumber", parameters)
  }
  
  static function policynumber (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("policynumber", parameters)
  }
  
  static function policysystemid () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("policysystemid", parameters)
  }
  
  static function policysystemid (size :  java.lang.Integer, validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("size", size as java.lang.String)
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("policysystemid", parameters)
  }
  
  static function positivecurrencyamount () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("positivecurrencyamount", parameters)
  }
  
  static function positivecurrencyamount (validator :  java.lang.String, currencyProperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("currencyProperty", currencyProperty as java.lang.String)
    return gw.datatype.DataTypes.get("positivecurrencyamount", parameters)
  }
  
  static function positiveinteger () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("positiveinteger", parameters)
  }
  
  static function positiveinteger (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("positiveinteger", parameters)
  }
  
  static function positivemoney () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("positivemoney", parameters)
  }
  
  static function positivemoney (validator :  java.lang.String, precision :  java.lang.Integer, scale :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("precision", precision as java.lang.String)
    parameters.put("scale", scale as java.lang.String)
    return gw.datatype.DataTypes.get("positivemoney", parameters)
  }
  
  static function postalcode () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("postalcode", parameters)
  }
  
  static function postalcode (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean, countryproperty :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    parameters.put("countryproperty", countryproperty as java.lang.String)
    return gw.datatype.DataTypes.get("postalcode", parameters)
  }
  
  static function prorationfactor () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("prorationfactor", parameters)
  }
  
  static function prorationfactor (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("prorationfactor", parameters)
  }
  
  static function publicid () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("publicid", parameters)
  }
  
  static function rate () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("rate", parameters)
  }
  
  static function rate (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("rate", parameters)
  }
  
  static function ratinglinebasisamount () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("ratinglinebasisamount", parameters)
  }
  
  static function ratinglinebasisamount (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("ratinglinebasisamount", parameters)
  }
  
  static function ripercentagedec () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("ripercentagedec", parameters)
  }
  
  static function ripercentagedec (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("ripercentagedec", parameters)
  }
  
  static function risk () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("risk", parameters)
  }
  
  static function risk (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("risk", parameters)
  }
  
  static function shorttext () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("shorttext", parameters)
  }
  
  static function shorttext (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("shorttext", parameters)
  }
  
  static function softentityreference () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("softentityreference", parameters)
  }
  
  static function spatialpoint () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("spatialpoint", parameters)
  }
  
  static function spatialpolygon () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("spatialpolygon", parameters)
  }
  
  static function speed () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("speed", parameters)
  }
  
  static function speed (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("speed", parameters)
  }
  
  static function sqlidentifier () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("sqlidentifier", parameters)
  }
  
  static function ssn () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("ssn", parameters)
  }
  
  static function ssn (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("ssn", parameters)
  }
  
  static function text () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("text", parameters)
  }
  
  static function text (validator :  java.lang.String, logicalSize :  java.lang.Integer, trimwhitespace :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    return gw.datatype.DataTypes.get("text", parameters)
  }
  
  static function typekey () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("typekey", parameters)
  }
  
  static function typelistkey () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("typelistkey", parameters)
  }
  
  static function unlimiteddecimal () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("unlimiteddecimal", parameters)
  }
  
  static function varbinary () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("varbinary", parameters)
  }
  
  static function varchar (size :  java.lang.Integer) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("size", size as java.lang.String)
    return gw.datatype.DataTypes.get("varchar", parameters)
  }
  
  static function varchar (size :  java.lang.Integer, validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("size", size as java.lang.String)
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("varchar", parameters)
  }
  
  static function version () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("version", parameters)
  }
  
  static function vin () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("vin", parameters)
  }
  
  static function vin (validator :  java.lang.String, logicalSize :  java.lang.Integer, encryption :  java.lang.Boolean, trimwhitespace :  java.lang.Boolean, linguistic :  java.lang.Boolean) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    parameters.put("logicalSize", logicalSize as java.lang.String)
    parameters.put("encryption", encryption as java.lang.String)
    parameters.put("trimwhitespace", trimwhitespace as java.lang.String)
    parameters.put("linguistic", linguistic as java.lang.String)
    return gw.datatype.DataTypes.get("vin", parameters)
  }
  
  static function weeklyfrequency () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("weeklyfrequency", parameters)
  }
  
  static function weeklyfrequency (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("weeklyfrequency", parameters)
  }
  
  static function year () : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    return gw.datatype.DataTypes.get("year", parameters)
  }
  
  static function year (validator :  java.lang.String) : gw.datatype.IDataType {
    var parameters :  java.util.HashMap<java.lang.String, java.lang.String> = new java.util.HashMap<java.lang.String, java.lang.String>()
    parameters.put("validator", validator as java.lang.String)
    return gw.datatype.DataTypes.get("year", parameters)
  }
  
  
}