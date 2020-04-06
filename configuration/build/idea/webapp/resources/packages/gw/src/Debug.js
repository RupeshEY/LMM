/**
 * Util class for debug trace
 */
Ext.define('gw.Debug', function() {
  var loggingEnum = { OFF: 'off', ON: 'on', NATIVE_EVENTS_ONLY: 'native_events'};
  var verboseEnum = { OFF: 'off', ON: 'on', FILTERED_ONLY: 'filtered'};

  if (Object.freeze) {
    // freeze our enums if the browser supports it
    Object.freeze(loggingEnum);
    Object.freeze(verboseEnum);
  }

  function getDbgWin() {
    if (window._dbgWin != null && window._dbgWin.closed) {
      window._dbgWin = undefined;
    }
    return window._dbgWin;
  }

  function isRealtime() {
    return getDbgWin().document.getElementById('realTime').checked;
  }

  function getCurrTime() {
    var t = new Date();
    return t.getHours() + ':' + t.getMinutes() + ':' + t.getSeconds() + '.' + t.getMilliseconds();
  }

  function isOn() {
    return getDbgWin() != null;
  }

  function getCallstack() {
    try {
      (0)()
    } catch (e) {
      var mode = e.stack ? 'Firefox' : window.opera ? 'Opera' : 'Other';
      var ANON = '{anonymous}';

      switch (mode) {
        case 'Firefox' :
          return e.stack.replace(/^.*?\n/, '').
              replace(/(?:\n@:0)?\s+$/m, '').
              replace(/^\(/gm, ANON+'(').
              split("\n");

        case 'Opera' : {
          var lines = e.message.split("\n"),
              lineRE = /Line\s+(\d+).*?in\s+(http\S+)(?:.*?in\s+function\s+(\S+))?/i,
              i,j,len;

          for (i = 4,j = 0,len = lines.length; i < len; i += 2) {
            if (lineRE.test(lines[i])) {
              lines[j++] = (RegExp.$3 ?
                            RegExp.$3 + '()@' + RegExp.$2 + RegExp.$1 :
                            ANON + RegExp.$2 + ':' + RegExp.$1) +
                           ' -- ' + lines[i + 1].replace(/^\s+/, '');
            }
          }

          lines.splice(j, lines.length - j);
          return lines;
        }

        default : {
          var curr = arguments.callee.caller,
              FUNC = 'function',
              fnRE = /function\s*([\w\-$]+)?\s*\(/i,
              stack = [],j = 0,
              fn,args,i;

          while (curr) {
            fn = fnRE.test(curr.toString()) ? RegExp.$1 || ANON : ANON;
            if (fn == ANON) { // show func body as tooltip
              fn = '<span title="'+curr.toString()+'">' + fn + '</span>'
            }
            args = stack.slice.call(curr.arguments);
            i = args.length;

            while (i--) {
              switch (typeof args[i]) {
                case 'string'  : args[i] = '"' + args[i].replace(/"/g, '\\"') + '"'; break;
                case 'function': args[i] = FUNC; break;
              }
            }

            stack[j++] = fn + '(' + args.join() + ')';
            curr = curr.caller;
          }

          return stack;
        }
      }
    }
  }

  function isEventLoggingOn() {
    // see if logging is off or if there is no facility to log
    if (gw.Debug.eventLogging === loggingEnum.OFF || !(isOn() || (console && console.log))) {
      return false;
    }

    return true;
  }

  function shouldLogEvent(ename, e) {
    // see if logging is off or if there is no facility to log
    if (!isEventLoggingOn()) {
      return false;
    }

    if (gw.Debug.eventLogging === loggingEnum.NATIVE_EVENTS_ONLY && !e) {
      return false;
    }

    function containsName(array, ename) {
      var found = Ext.Array.findBy(array, function (eventName) {
        return ename.indexOf(eventName) >= 0;
      });
      return !!found;
    }

    function isSkippedEvent(ename) {
      var hasInclusion = (Array.isArray(gw.Debug.eventLogOnlyEventsNamed) && gw.Debug.eventLogOnlyEventsNamed.length);
      var hasExclusion = (Array.isArray(gw.Debug.eventLogIgnoreEventsNamed) && gw.Debug.eventLogIgnoreEventsNamed.length);
      if (hasInclusion) {
        return !containsName(gw.Debug.eventLogOnlyEventsNamed, ename);
      } else if (hasExclusion) {
        return containsName(gw.Debug.eventLogIgnoreEventsNamed, ename);
      }
      return false;
    }
    return !isSkippedEvent(ename);
  }

  function debugOrConsoleLog(msg) {
    if (isOn()) {
      gw.Debug.log(msg, true);
    } else {
      console.log(msg);
    }
  }

  function addPadding(string) {
    if (!string) {
      return string;
    }
    var i,
        padding = "",
        max = gw.Debug.eventLoggingDepth > 4 ? 4 : gw.Debug.eventLoggingDepth;
    for (i = 1; i < max; i++) {
      padding += "-";
    }
    if (max < gw.Debug.eventLoggingDepth) {
      padding += gw.Debug.eventLoggingDepth + "|"
    }
    return padding + string;
  }

  function printAttributes(attributes) {
    var attrStr = "";
    if (attributes && attributes.length) {
      for (var i = 0; i < attributes.length; i++) {
        if (attributes[i].name !== 'id') {
          if (i > 0) {
            attrStr += "\n" + addPadding("          ");
          }
          attrStr += attributes[i].name + " = " + attributes[i].value;
        }
      }
    }
    return attrStr ? attrStr : "<none>";
  }

  function printArgument(arg, startString, depth) {
    var i, name,
        type = "",
        indent = "",
        string = "",
        isObject = Ext.isObject(arg) || Ext.isElement(arg);
    if (isObject && depth <= 1) {
      for (i = 0; i <= depth; i++) {
        indent += "  ";
      }
      type = arg.$className || arg.toString();
      string += startString + "(" + type + ") {";
      for (name in arg) {
        // If full verbose AND (the property name is the arg's own OR it is in the filtered list)
        // OR we are in (filtered verbose mode AND it's in the filtered list)... since verbose mode and
        // filtered verbose mode are mutually exclusive in this logic, then the shorthand logic is:
        if (gw.Debug.eventLoggingVerbose === verboseEnum.ON && arg.hasOwnProperty(name) ||
            Ext.Array.contains(gw.Debug.eventVerboseFilterList, name)) {
          string += "\n" + printArgument(arg[name], addPadding(indent + name + ": "), depth + 1);
        }
      }
      string += "\n" + addPadding(indent + "}");
    } else {
      if (isObject && type.$className) {
        type = "(" + type.$className + ") "
      }
      string += startString + type + arg;
    }

    return string;
  }

  return {
    singleton: true,

    start: function() {
      if (!isOn()) {
        window._dbgWin = window.open('', '__DBGWIN__', 'width=600,height=600,resizable=yes,scrollbars=yes');
        if (!window._dbgWin) {
          alert('Window failed to open, did the popup get blocked?');
          return;
        }
        window._dbgWin.document.writeln('<title>DEBUG</title>\n' +
                                        '<script>var _newContent = ""</script>\n' +
                                        '<Input type="Button" value="Clear" onClick="log.innerHTML = \'\'"/>\n' +
                                        '<Input type="Button" id="flush" value="Flush" onClick="window.opener.gw.Debug.flush()" style="display:none"/>\n' +
                                        '<Input type="checkbox" id="realTime" name="realTime" value="true" onClick="flush.style.display = this.checked ? \'none\' : \'\'" checked />Real time\n' +
                                        '<DIV id="log" style="width:95%;height:90%;overflow:auto"></DIV>');
      }
    },

    log: function(msg, bFlush) {
      if (isOn()) {
        var str = ('<li>[' + getCurrTime() + '] ' + msg + '<br>');
        if (bFlush || isRealtime()) {
          var logtxt = getDbgWin().document.getElementById('log');
          logtxt.innerHTML = logtxt.innerHTML + str;
          logtxt.scrollTop = logtxt.scrollHeight;
        } else {
          getDbgWin()._newContent += str;
        }
      }
    },

    flush : function () {
      var str = getDbgWin()._newContent;
      if (str) {
        gw.Debug.log(str, true);
        getDbgWin()._newContent = '';
      }
    },

    /**
     * Logs stack track
     * @param msg
     */
    stacktrace : function(msg) {
      if (isOn()) {
        var stack = getCallstack();
        stack.shift(); // remove call to this function
        this.log(msg + '<table border=1 style="margin-left:20px"><tr><th>Stack trace</th></tr><tr><td>' +
                 stack.join('</td></tr><tr><td>') + '</td></tr></table>')
      }
    },
    /**
     * Externally expose our enums
     */
    EventLoggingEnum : loggingEnum,
    EventVerboseEnum : verboseEnum,
    /**
     * Switch to turn on/off/native the event logging.
     * You can do this in the browser console via the commands:
     *
     *   gw.Debug.eventLogging = gw.Debug.EventLoggingEnum.OFF
     *   gw.Debug.eventLogging = gw.Debug.EventLoggingEnum.ON
     *   gw.Debug.eventLogging = gw.Debug.EventLoggingEnum.NATIVE_EVENTS_ONLY
     */
    eventLogging : loggingEnum.OFF,
    /**
     * Switch to indicate whether to do verbose logging of events when logging is enabled
     * You can do this in the browser console via the commands:
     *
     *   gw.Debug.eventLoggingVerbose = gw.Debug.EventVerboseEnum.OFF
     *   gw.Debug.eventLoggingVerbose = gw.Debug.EventVerboseEnum.ON
     *   gw.Debug.eventLoggingVerbose = gw.Debug.EventVerboseEnum.FILTERED_ONLY
     */
    eventLoggingVerbose: verboseEnum.OFF,
    /**
     * Providing the name of events in this array will only log those
     * specific events. This has precedence over the ignored events.
     */
    eventLogOnlyEventsNamed : [],
    /**
     * Providing the name of events in this array will ignore log those
     * specific events. Since the pesky mouse events will
     * often flood the queue, ignore them by default.
     */
    eventLogIgnoreEventsNamed : ['mouseenter', 'mouseleave', 'mousemove', 'mouseout', 'mouseover'],
    /**
     * Filter list used to determine whether to output the information for a attribute of an object.  If the 'name' of
     * the attribute is in this list, then it will be output, otherwise it will be skipped.
     */
    eventVerboseFilterList : [
        'event', 'shiftKey', 'ctrlKey', 'altKey', 'charCode', 'keyCode', 'toElement', 'fromElement', 'id', 'el',
        'name', 'nodeName', 'xtype', 'fieldLabel', 'postOnChange', 'postOnChangeTarget', 'required', 'ownerCt',
        'inputId', 'inputWrap', 'triggerWrap', 'bodyEl', 'labelEl', 'inputEl', 'browserEvent', 'value', 'rawValue',
        'lastValue', 'hasFocus', 'type', 'originalValue',
        // These are for server call logging, so that we can skip the callback and postCallback methods
        'url', 'params', 'fullPage','isRenderViewRootOnly','skipFocusOnPOC', 'timeout'
    ],
    /**
     * Counter keeping track of the depth of a logged event
     */
    eventLoggingDepth : 0,

    /**
     * Logs the ExtJs event, including bumping the depth counter.  This is expected to be paired with
     * a matching eventprocessed(ename) call in a try/finally block
     * @param ename
     * @param scope
     * @param dom
     * @param fn
     * @param e
     */
    eventlog : function(ename, scope, dom, fn, e, fnArgs) {
      if (!shouldLogEvent(ename, e)) {
        return;
      }

      function printScope(scope) {
        var scopeStr = "scope: ";
        if (scope) {
          if (scope.id) {
            scopeStr += "id = " + scope.id;
          } else if (scope.$className) {
            scopeStr += "class = " + scope.$className;
          } else {
            scopeStr += scope.toString();
          }
        } else {
         scopeStr = "";
        }
        return addPadding(scopeStr);
      }

      function printFn(fn, fnArgs) {
        var fnString = "fn: ";
        if (fn.$owner) {
          fnString += fn.$owner.$className;
        }
        if (fn.$name) {
          if (fnString.length) {
            fnString += ".";
          }
          fnString += fn.$name;
        }
        if (fnString.length === 4) {
          // No owner class or name for the function, so just toString() the object
          fnString = fn.toString();
        }
        if (gw.Debug.eventLoggingVerbose !== verboseEnum.OFF && Array.isArray(fnArgs)) {
          Ext.Array.each(fnArgs, function(arg, index) {
            fnString += printArgument(arg, "\n" + addPadding("arg[" + index + "] = "), 0);
          });
        }
        return addPadding(fnString);
      }

      function printDom(dom) {
        var domString = "dom: ";
        if (dom) {
          domString += (dom.id ? dom.id : "<no id>");
          if (gw.Debug.eventLoggingVerbose !== verboseEnum.OFF) {
            domString += "\n" + addPadding("dom.attrs: " + printAttributes(dom.attributes));
          }
        } else {
          domString = "";
        }
        return addPadding(domString);
      }

      function printEvent(e) {
        var eventString = "e: ";
        if (e) {
          eventString += e.type;
          if (e.type && e.type.indexOf && e.type.indexOf("key") === 0 && e.keyCode) {
            eventString += "; key = " + e.keyCode + "; shift = " + e.shiftKey + "; alt = " + e.altKey + "; ctrl = " + e.ctrlKey;
          }
          eventString += "\n" +
              addPadding("e.target: " + (e.target ? (e.target.id ? e.target.id : "<no id>") : "<none>"));
          if (gw.Debug.eventLoggingVerbose !== verboseEnum.OFF) {
            eventString += "\n" + addPadding("e.t.attrs: " + printAttributes(e.target.attributes));
          }
        } else {
          eventString = "";
        }
        return addPadding(eventString);
      }

      gw.Debug.eventLoggingDepth++;

      var scopeMsg = printScope(scope),
          domMsg = printDom(dom),
          msg = addPadding("ename: " + ename) + "\n" +
              (scopeMsg ? scopeMsg + "\n" : "" ) +
              (domMsg ? domMsg + "\n" : "" ) +
              printFn(fn, fnArgs) + "\n" +
              printEvent(e);

      debugOrConsoleLog(msg);
    },
    /**
     * Used to indicate that the given ename has finished processing.  Currently just decreases the depth counter
     * @param ename
     */
    eventprocessed : function(ename, e) {
      if (shouldLogEvent(ename, e)) {
        gw.Debug.eventLoggingDepth--;
      }
    },

    commandlog: function(command) {
      if (isEventLoggingOn()) {
        debugOrConsoleLog("Command: " + command);
      }
    },

    servercalllog: function(arg) {
      if (isEventLoggingOn()) {
        debugOrConsoleLog(printArgument(arg, addPadding("Server Call: "), 0));
      }
    }
  }
});
