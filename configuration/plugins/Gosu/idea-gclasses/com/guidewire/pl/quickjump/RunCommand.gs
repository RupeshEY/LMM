package com.guidewire.pl.quickjump

uses com.guidewire.pl.system.dependency.PLDependencies
uses com.guidewire.pl.web.navigation.Location
uses com.guidewire.pl.web.navigation.Navigator
uses com.guidewire.pl.web.navigator.commands.ProgressivelyDisclosedCommand
uses gw.pl.util.StringUtil
uses gw.api.contact.AutocompleteHandler
uses gw.api.contact.AutocompleteResult
uses gw.api.databuilder.DataBuilder
uses gw.api.util.DisplayableException
uses gw.api.util.LocationUtil
uses gw.api.system.PLConfigParameters
uses gw.lang.reflect.IMethodInfo
uses gw.lang.reflect.IType
uses gw.lang.reflect.ReflectUtil
uses gw.lang.reflect.TypeSystem
uses gw.lang.reflect.gs.IGosuClass
uses java.io.Writer

uses java.lang.IllegalArgumentException
uses java.lang.StringBuilder
uses java.lang.Throwable
uses java.util.Collections
uses java.util.ArrayList
uses java.util.HashMap
uses java.util.Map
uses org.apache.commons.lang.StringUtils
uses java.util.List

@Export
class RunCommand extends ProgressivelyDisclosedCommand{

  construct(name : String) {
    super(name)
  }
  
  private static final var REFRESH_THIS = "RefreshDefinition"
  private static final var LIST_METHODS = "ListAllMethods"
  private static final var LIST_COMMANDS = "ListAllCommands"
  private static final var REFRESH_ALL_COMMANDS = "RefreshTypeSystem"
  private static var _lastArguments : String[]
  private var _classInstance : IType // cached value
  private var _allTypeNames = new HashMap<String, IType>()

  function refreshTypeSystem() {
    _allTypeNames.clear()
    _allTypeNames.put(REFRESH_ALL_COMMANDS, null)
    _allTypeNames.put(LIST_COMMANDS, null)
    _allTypeNames.putAll(getAllCommandNames())
  }
  
  /**
   * May need to override this function to improve performance. Eg. PCRunCommand
   */
  public function getAllCommandNames() : Map<String, IType>{
    return BaseCommand.Type.Subtypes.partitionUniquely(\ i -> i.RelativeName)
  }

  override function evaluate(commandText : String, args : String[], navigator : Navigator, topLocation : Location, out : Writer) {
    try {
      if (_allTypeNames.isEmpty()) {
        refreshTypeSystem()
      }
      if (args != null && args.length > 0) {
        _lastArguments = args
      }
      if(_lastArguments == null or _lastArguments.length == 0){
        throw new IllegalArgumentException("Must specify command name")
      }
      
      // special commands
      if (REFRESH_ALL_COMMANDS.equalsIgnoreCase(_lastArguments[0])) { // refresh type system
        TypeSystem.refresh(true)
        refreshTypeSystem()
        LocationUtil.addRequestScopedInfoMessage("TypeSystem is Refreshed")
        return
      }else if (LIST_COMMANDS.equalsIgnoreCase(_lastArguments[0])) {
        _allTypeNames.Keys.partition(\ s -> s.charAt(0))
          .eachKeyAndValue(\ c, s -> {
              LocationUtil.addRequestScopedInfoMessage(("${s.join(", ")}"))
        })
        return
      }

      var gosuClass = updateCommandClass(_lastArguments[0])
      if(gosuClass == null) {
        throw new DisplayableException(_lastArguments[0] + " is not a command class")
      }
      var command = initCommand()

      var methodName = args.Count > 1 ? args[1] : getDefaultMethod(command)
      // special methods for every command
      if(REFRESH_THIS.equalsIgnoreCase(methodName)){
        var ref = TypeSystem.getTypeReference(gosuClass)
        TypeSystem.refresh(ref)
        LocationUtil.addRequestScopedInfoMessage(gosuClass.getName() + " has been refreshed")
        return
      }else if(LIST_METHODS.equalsIgnoreCase(methodName)){
        var methods = listMethods(gosuClass)
        LocationUtil.addRequestScopedErrorMessage(methods)
        return
      }
      
      run(command, methodName, topLocation, _lastArguments)
    } catch (e : Throwable) {
      e.printStackTrace()
      var message = e.getMessage()
      LocationUtil.addRequestScopedErrorMessage(StringUtils.isEmpty(message) ? e.toString() : e.getMessage())
    }
  }
  
 /**
  * args will be something like: [Account, withPolicy, 1000, 200]
  */
  private function run(command : BaseCommand, methodName : String, location : Location, args : String[]){
    command.TopLocation = location
    var thisType = command.IntrinsicType
    var methodInfo = thisType.TypeInfo.getMethod( methodName, new IType[0] )
    if(methodInfo == null){
      throw "Could not find method with name: '${methodName}'"
    }
    var openPopup = methodInfo.hasAnnotation(OpenPopup)
    var argIndex = args.Count > 2 ? (args[2] == "?" ? 1 : 2) : 0
    if(openPopup){
      registerParams(command, methodInfo, args, 0)
    }else{
      // 2: start with the first argument, 1 : popup, 0: default value
      registerParams(command, methodInfo, args, argIndex)
    }
    run(command, methodInfo, openPopup or argIndex == 1)
  }
  
  private function getDefaultMethod(command : BaseCommand) : String{
    var anno = command.IntrinsicType.TypeInfo.getAnnotation(DefaultMethod).Instance
    var methodName = (anno as DefaultMethod).MethodName
    if(methodName != null){
      return methodName
    }
    throw "Command ${command.IntrinsicType} does not have a default method, please defined it using @DefaultMethod"
  }
  
  /**
  * @param i : way of entering the params
  *  0: no params entered (eg. Run Account create) -> use random default value
  *  1: using the popup (eg. Run Account create ?) -> use blank default value
  *  >= 2: inline params (eg. Run Account create AccountNumber 15) -> use the entered param
  */
  private function registerParams(command : BaseCommand, methodInfo : IMethodInfo, args : String[], i : int){
    var methodParams = methodInfo.Annotations.map( \ elem -> elem.Instance )
      .whereTypeIs(Argument)
    var j = i
    for(p in methodParams){
      if(j == 0 or j == 1){
        // no params entered
        command.Arguments.add( p )
      }else{
        if(args.Count > j){
          p.Value = args[j]
          command.Arguments.add(p) // pass in the paramter entered
          j = j + 1
        }else{
          throw "Invalid number of Arguments"
        }
      }
    }
    var calls = methodInfo.getAnnotationsOfType( Arguments )
    for(c in calls){
      var call = c.Instance as Arguments
      var className = call.ClassName.length == 0 ? _classInstance.Name : call.ClassName
      var classInstance = TypeSystem.getByFullName( className )
      var method = classInstance.TypeInfo.getMethod( c.Instance["MethodName"] as String, new IType[0] )
      registerParams(command, method, args, j)
    }
  }
  
  private function run(command : BaseCommand, methodInfo : IMethodInfo, openPopup : boolean){
    var result : Object
    var message : String
    try{
      if(openPopup)
      {
        result = pcf.RunCommandPopup.push( command, methodInfo )
      }else{
        result = methodInfo.CallHandler.handleCall( command, {} )
      }
    }catch(e : Throwable){
      e.printStackTrace()
      var ex = e.Cause
      message = "Exception: " + e.toString()
      while(ex != null){
        message = message + ". Caused by: " + ex.toString()
        ex = ex.Cause
      }
      LocationUtil.addRequestScopedErrorMessage(message)
    } finally {
      /**
       * While DataBuilder.resetDefaultBundle() is deprecated,
       * DataBuilder.create(), which uses the default bundle, is not.
       * Many run commands use data builders and may use DataBuilder.create().
       * After executing the first run command that uses the default bundle,
       * the default bundle contains stale data and may cause problems.
       * Here, we're calling resetDefaultBundle to avoid this stale data issue.
       */
      DataBuilder.resetDefaultBundle()
    }
    if(result typeis String){
      LocationUtil.addRequestScopedInfoMessage(result)
    }
  }

  private function listMethods(type : IType) : String{
    var list = new StringBuilder()
    var gosuClass = type as IGosuClass
    var methodInfos = gosuClass.getTypeInfo().getDeclaredMethods()
    for(methodInfo in methodInfos){
      list.append(methodInfo.getDisplayName()).append("\n")
    }
    return list.toString()
  }

  private function initCommand() : BaseCommand{
    var instance = ReflectUtil.construct(_classInstance.Name, {})
    if (instance == null) {
      throw new DisplayableException("Cannot instantiate instance of : " + _classInstance.getName())
    }
    return instance as BaseCommand
  }

  private function updateCommandClass(className : String) : IType{
    _classInstance = _allTypeNames.get(className)
    return _classInstance
  }

  override property get CommandDisplaySuffix() : String{
    return " class method"
  }

  protected override function addParameterSuggestions(parsedString : String[], returnList : List<AutocompleteResult> , isMidParameter : boolean) {
    if (_allTypeNames.isEmpty()) {
      refreshTypeSystem()
    }
    var numberOfTokens = parsedString.length // this includes the command
    //noinspection unchecked
    var suggestions = Collections.EMPTY_LIST
    if (numberOfTokens == 2) {
      suggestions = getClassSuggestions(parsedString[1])
    } else if (numberOfTokens == 3) {
      suggestions = getMethodSuggestions(parsedString[1], parsedString[2])
    }

    if (not suggestions.isEmpty()) {
      var results = suggestions.iterator()
      var count = 0

      var suggestionPrefix = getDisplayName() + " "
      if(numberOfTokens == 3){
        suggestionPrefix += parsedString[1] + " "
      }

      while (results.hasNext() and AutocompleteHandler.SUGGESTION_LIMIT > count) {
        count++
        var suggestionText = suggestionPrefix + results.next()
        returnList.add(createAutocompleteSuggestion(suggestionText))
      }
    }
  }

  private function createAutocompleteSuggestion(suggestionText : String) : AutocompleteResult{
    return new AutocompleteResult(suggestionText, suggestionText, true)
  }

  private function getClassSuggestions(classNameHint : String) : List<String>{
    var suggestions = new ArrayList<String>()
    for (typeName in _allTypeNames.keySet()) {
      if (StringUtil.startsWithIgnoreCase(typeName, classNameHint)) {
        suggestions.add(typeName)
      }
    }

    return suggestions
  }

  private function getMethodSuggestions(className : String, methodHint : String) : List<String>{
    var suggestions = new ArrayList<String>()
    updateCommandClass(className)
    var classTypeInfo = (_classInstance as IGosuClass).getTypeInfo()
    var methodInfoList = classTypeInfo.getDeclaredMethods()
    //noinspection unchecked
    for (method in methodInfoList) {
      if (method.isPublic() && !method.isAbstract()) {
        var methodName = method.getDisplayName()
        if (StringUtil.startsWithIgnoreCase(methodName, methodHint)) {
          suggestions.add(methodName)
        }
      }
    }
    suggestions.add(REFRESH_THIS)
    suggestions.add(LIST_METHODS)
    return suggestions
  }

  override property get Permitted() : boolean {
    return PLConfigParameters.EnableInternalDebugTools.getValue()
            && PLDependencies.getServerMode().isDev()
            && PLDependencies.getCommonDependencies().getCurrentUser().isSystemUser()
  }
}
