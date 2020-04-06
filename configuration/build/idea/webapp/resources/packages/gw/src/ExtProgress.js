/**
 * Progress polling function
 */
Ext.define('gw.progressfunction', function() {
  var _progBarTask = null;

  // Counter for the progress requests we made.
  var _progVersion = 0;

  // Assoc. array of requests with array of IDs of elements requested per request. This grows.
  var _needPoll = [];
  var PROGRESS_POLL_INTERVAL = 3000; // 3 seconds

  function doPoll() {
    if (_needPoll[_progVersion] == null || _needPoll[_progVersion].length === 0) {
      return;
    }

    // Create requests for all IDs that need polling. Clean up old, used record.
    var ids = _needPoll[_progVersion];
    delete _needPoll[_progVersion];
    var requests = [];
    for (var i = 0; i < ids.length; i++) {
      requests[i] = {viewRootId:ids[i], paramMap:{progBarId:ids[i]}, childrenOnly:false};
    }

    // Set up next element for future use.
    _progVersion = _progVersion+1;
    _needPoll[_progVersion] = [];

    gw.app.requestViewRoots(requests,
        function(options, success, response) {
          if (gw.app.wasUnsuccessfulAjaxStatusHandled(success, response)) {
            return;
          }
          var commands = Ext.decode(response.responseText);
          var op;
          if (requests.length == 1) {
            op = commands[0];
            // Need to handle case where there is no op because
            // the progress is no longer visible (navigated to another page)
            // in that case, an empty op is sent.
            if (op) {
              gw.CmdProc[op.cmd](op, response)
            }
          } else {
            for (var i = 0; i < commands.length; i++) {
              op = Ext.decode(commands[i])[0];
              if (op) {
                gw.CmdProc[op.cmd](op, response)
              }
            }
          }
        })
  }

  function _getProgBarTask () {
    if (_progBarTask == null) {
      // Create the progress bar task.
      _progBarTask = {
        run: function() {
          doPoll()
        },
        interval: PROGRESS_POLL_INTERVAL
      };
      Ext.TaskManager.start(_progBarTask);
    }
    return _progBarTask;
  }

  return {
    singleton: true,
    requires: ['Ext.TaskManager'],

    registerToPoll : function(progBarId) {
      _getProgBarTask();
      if (_needPoll[_progVersion] == null) {
        _needPoll[_progVersion] = []
      }
      if (!Ext.Array.contains(_needPoll[_progVersion], progBarId)) {
        _needPoll[_progVersion].push(progBarId);
      }
    }
  }
});
