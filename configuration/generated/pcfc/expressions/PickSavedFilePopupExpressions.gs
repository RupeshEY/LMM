package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickSavedFilePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickSavedFilePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'value' attribute on FileInput (id=ZipFile) at PickSavedFilePopup.pcf: line 31, column 30
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      zipFile = (__VALUE_TO_SET as gw.api.web.WebFile)
    }
    
    // EditButtons at PickSavedFilePopup.pcf: line 22, column 35
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at PickSavedFilePopup.pcf: line 22, column 35
    function pickValue_0 () : gw.api.profiler.ProfilerDataSource {
      return pickFile()
    }
    
    // 'value' attribute on FileInput (id=ZipFile) at PickSavedFilePopup.pcf: line 31, column 30
    function value_2 () : gw.api.web.WebFile {
      return zipFile
    }
    
    override property get CurrentLocation () : pcf.PickSavedFilePopup {
      return super.CurrentLocation as pcf.PickSavedFilePopup
    }
    
    property get zipFile () : gw.api.web.WebFile {
      return getVariableValue("zipFile", 0) as gw.api.web.WebFile
    }
    
    property set zipFile ($arg :  gw.api.web.WebFile) {
      setVariableValue("zipFile", 0, $arg)
    }
    
    property get zipFileString () : String {
      return getVariableValue("zipFileString", 0) as String
    }
    
    property set zipFileString ($arg :  String) {
      setVariableValue("zipFileString", 0, $arg)
    }
    
    
    function pickFile() : gw.api.profiler.ProfilerDataSource {
      try {
        return gw.api.profiler.ProfilerStacksDownloaderUploader.readProfilerStacksFromZipFile(zipFile)
    //    return zipFileString==null?ProfilerStacksDownloaderUploader.readProfilerStacksFromZipFile(zipFile):ProfilerStacksDownloaderUploader.readProfilerStacksFromZipFile(new java.io.File(zipFileString))
      } catch (e : java.io.IOException) {
        throw new com.guidewire.pl.web.controller.UserDisplayableException( DisplayKey.get("Web.Profiler.InvalidFile",  zipFile.getName(), e.getMessage() ) )
      }
    }
        
    
    
  }
  
  
}