package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheContentsChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeCacheContentsChartExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheContentsChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheContentsChartExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'dataValues' attribute on DataSeries at CentipedeCacheContentsChart.pcf: line 24, column 29
    function dataValues_0 () : java.lang.Object {
      return contentsMap.Second
    }
    
    // 'height' attribute on ChartPanel (id=CentipedeCacheContentsChart) at CentipedeCacheContentsChart.pcf: line 10, column 19
    function height_3 () : java.lang.Double {
      return height
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheContentsChart.pcf: line 24, column 29
    function label_1 (value :  gw.util.Pair<java.lang.String, java.lang.Integer>) : java.lang.String {
      return value.First
    }
    
    // 'label' attribute on ChartPanel (id=CentipedeCacheContentsChart) at CentipedeCacheContentsChart.pcf: line 10, column 19
    function label_4 () : java.lang.String {
      return gw.api.cache2.CacheInfoPageHelper.getCacheContentsLabel(contentsMap)
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheContentsChart.pcf: line 24, column 29
    function value_2 (value :  gw.util.Pair<java.lang.String, java.lang.Integer>) : java.lang.Object {
      return value.Second
    }
    
    // 'width' attribute on ChartPanel (id=CentipedeCacheContentsChart) at CentipedeCacheContentsChart.pcf: line 10, column 19
    function width_5 () : java.lang.Double {
      return width
    }
    
    property get contentsMap () : gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>> {
      return getRequireValue("contentsMap", 0) as gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>>
    }
    
    property set contentsMap ($arg :  gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>>) {
      setRequireValue("contentsMap", 0, $arg)
    }
    
    property get height () : int {
      return getRequireValue("height", 0) as java.lang.Integer
    }
    
    property set height ($arg :  int) {
      setRequireValue("height", 0, $arg)
    }
    
    property get width () : int {
      return getRequireValue("width", 0) as java.lang.Integer
    }
    
    property set width ($arg :  int) {
      setRequireValue("width", 0, $arg)
    }
    
    
  }
  
  
}