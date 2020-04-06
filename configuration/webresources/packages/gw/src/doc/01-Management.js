/**
 * Handlers for Document Management features.
 * Mostly copied over from the old DocumentUtil.js file.
 *
 * Factored into:
 *   doc/01-Management.js (so named to avoid EXtJS loader issues)
 *   doc/File.js
 *   doc/HiddenFile.js
 *   doc/ReadOnlyFile.js
 *   doc/HTML5UploadConnection.js
 */
Ext.define('gw.doc.Management', function() {
  var BYTES_PER_MB = 1048576;

  function convertToMB(size) {
    return Math.round((size / BYTES_PER_MB) * 10) / 10;
  }

  function uploadSizeError(banner, sizeLimit, tooBigFileNames) {
    if (!tooBigFileNames || tooBigFileNames.length < 1)
      return;

    var errMsg = gw.app.localize('Document.Upload.Failure.Size', tooBigFileNames.length, convertToMB(sizeLimit));
    var maxFilesInMsg = 20;
    for (var i = 0, len = tooBigFileNames.length > maxFilesInMsg ? maxFilesInMsg : tooBigFileNames.length ; i < len ; i++) {
      errMsg += '<BR/>' + Ext.String.htmlEncode(tooBigFileNames[i]);
    }
    if (tooBigFileNames.length > maxFilesInMsg) {
      errMsg += '<BR/>...';
    }
    showAlert(banner, errMsg);
  }

  function uploadTotalSizeError(banner, numRejectedFiles, totalSize, availableSpace) {
    if (totalSize <= 0)
      return;

    showAlert(banner, gw.app.localize('Document.Upload.Failure.TotalSize',
      numRejectedFiles, convertToMB(totalSize), convertToMB(availableSpace)));
  }

  function uploadTotalCountError(banner, numRejectedFiles, availableCount) {
    if (numRejectedFiles <= 0)
      return;

    showAlert(banner, gw.app.localize('Document.Upload.Failure.TotalCount', numRejectedFiles, availableCount));
  }

  function uploadOtherError(banner, otherErrors) {
    var otherErrorCount = otherErrors.length;
    if (otherErrorCount < 1)
      return;

    var errMsg = '';
    var maxOtherErrorsInMsg = 20;
    otherErrors.length = maxOtherErrorsInMsg;
    for (var otherError in otherErrors) {
      if (otherError != 0)
        errMsg += '<BR/>';
      errMsg += Ext.String.htmlEncode(otherErrors[otherError]);
    }
    if (otherErrorCount > maxOtherErrorsInMsg) {
      errMsg += '<BR/>...';
    }
    showAlert(banner, errMsg);
  }

  function processUploadResponse(banner, response, refreshFn) {
    if (response.errors) {
      for (var errorGeneralIndex in response.errors.errorGeneral)
        showAlert(banner, response.errors.errorGeneral[errorGeneralIndex]);
      if (response.errors.errorReasonSize) {
        uploadSizeError(banner, response.errors.errorReasonSize.sizeLimit,
          response.errors.errorReasonSize.files);
      }
      if (response.errors.errorReasonTotalSize) {
        if (response.errors.errorReasonTotalSize.rejectedDueToSizeCount) {
          uploadTotalSizeError(banner,
              response.errors.errorReasonTotalSize.rejectedDueToSizeCount,
              response.errors.errorReasonTotalSize.spaceRequested,
              response.errors.errorReasonTotalSize.availableSpace);
        }
        if (response.errors.errorReasonTotalSize.rejectedDueToQuotaExceededCount) {
          uploadTotalCountError(banner,
              response.errors.errorReasonTotalSize.rejectedDueToQuotaExceededCount,
              response.errors.errorReasonTotalSize.availableCount);
        }
      }
      if (response.errors.errorReasonOther) {
        uploadOtherError(banner, response.errors.errorReasonOther);
      }
    }
    refreshFn();
    return response.success;
  }

  function showAlert(messageBanner, messageText) {
    // Pop up different messages in their own box
    var me = new Ext.window.MessageBox().show({
      title: messageBanner || '&nbsp;',
      msg: messageText,
      buttons: Ext.Msg.OK,
      buttonText: {
        ok: gw.app.localize('Button.OK')
      },
      icon: Ext.Msg.ERROR,
      modal: true,
      closable: false,
      // Remove the message box from the DOM after user clicks OK
      fn: function() {
        me.destroy();
        return false;
      }
    });
  }

  // An effort was initially made to use standard AJAX requests for downloads
  // and then use Blob URLs to redirect the browser appropriately on successful
  // responses. Unfortunately, only Chrome and Firefox could be made to support
  // this well -- IE and Edge have cross-origin bugs with Blobs.

  // For 'attachment' download dispositions, inject a hidden iframe and submit an injected
  // form with hidden fields targeting that iframe. Successful downloads will trigger the browser's
  // builtin open/save mechanisms.
  //
  // For 'inline' (and any other type of) download dispositions,
  // open a new window and submit an injected form (in the new window) with
  // hidden fields targeting (an iframe in) the new window. This allows the content to be displayed
  // by the browser in that window (if it can) or an HTML error response if that occurs.
  // Note that some browsers may close this window when the content can't be handled directly
  // (and thus passed off to an external application, similar to 'attachment')
  // but that is beyond the Guidewire JavaScript's control.
  //
  // In all downloads, a "download completion token" is added to the injected form. The
  // server response for *successful* downloads will add a cookie with this token as its name (which
  // will be visible to the main app window even if generated by an inline popup window). When the
  // client JS code can detect this cookie, that indicates the browser has received the upload response,
  // and it is safe to delete the hidden iframe (for attachments only) and invoke any success callback
  // (to simulate an AJAX XHR success response for a download directly requested in the main AJAX
  // event loop).
  //
  // On errors, the server injects JavaScript into the response that posts a message to the main
  // window with the details of the error. This allows the main window to invoke any failure callback
  // (to simulate an XHR failure response for a download directly requested in the main AJAX event loop),
  // or to popup an alert for downloads indirectly requested in an AJAX response updating the UI (downloads
  // which should be initiated by the client).
  function downloadContent(options) {
    var token, waitForDownloadCompletionTask, newFrame, form, targetId;

    // Generate a unique completion token for this download based
    // the current CSRF token and an ID unique to this window.
    token = gw.app.getCsrfToken() + '-' + Ext.id();

    // Generate an ID for either the hidden frame for an attachment
    // download or the new window on an inline download.
    targetId = Ext.id();

    // Generate a hidden form that will target the frame or window
    //
    // Specify the token for the server to match with a download completion cookie,
    // and explicitly pass the requested download type (content disposition) in case this is a request
    // for a deferred download of a specific FileInput widget
    form = generateDownloadRequestForm(targetId, options.url, options.params,
        { token: token, contentDisposition: options.download });

    // Prepare a periodic task to scan for the token cookie,
    // or a timeout (handled by runCount limit in scanForDownloadCompletion), whichever comes first.
    // The runCount is defined in terms of the standard UI AJAX request timeout, assuming one
    // "run" approximately every 500 msecs. The default UI AJAX timeout is 10 minutes.
    //
    // If the token cookie comes in after this timeout, it has a short
    // expiration time set by the server.
    waitForDownloadCompletionTask = Ext.TaskManager.newTask({
      maxRuns: Math.round(gw.app.ajaxTimeout() / 500),
      fireOnStart: true,
      interval: 500,
      token: token,
      form: form,
      nodesToRemove: [ form ],
      options: options,
      run: scanForDownloadCompletion,
      onError: handleDownloadException
    });

    // Attachments are loaded into a hidden iFrame
    if (options.download == 'attachment') {
      newFrame = document.createElement('iframe');

      Ext.fly(newFrame).set({
        id: targetId,
        name: targetId,
        cls: Ext.baseCSSPrefix + 'hidden-display',
        src: Ext.SSL_SECURE_URL,
        tabIndex: -1
      });

      document.body.appendChild(newFrame);

      // This is required so that IE doesn't pop the response up in a new window.
      if (document.frames) {
        document.frames[targetId].name = targetId;
      }

      // Mark the frame for deletion on the completion task
      waitForDownloadCompletionTask.nodesToRemove.push(newFrame);

      waitForDownloadCompletionTask.newFrame = newFrame;
    }
    // Inline documents are loaded into a new browser window, and the browser decides what to do.
    else {
      // Do nothing yet -- see below for further steps when form is submitted.
    }

    // Start the task watching for the download completion
    waitForDownloadCompletionTask.start();

    // The form is targeted at the hidden iFrame or new window,
    // thus its submission will trigger the browser's download mechanism
    //
    // IE doesn't allow multiple files to be downloaded without some delay in
    // between each one, so wait a bit before submitting to a new frame or window
    // in case we just recently started another download
    Ext.defer(function() {
      try {
        // For attachment downloads, the form submission is target at the
        // already generated hidden iframe.
        // For inline downloads, the target attribute on the form DOM element is used
        // to allow the browser to handle a new window or tab or avoid opening a window
        // altogether if it can't handle the content directly (using JavaScript window.open()
        // would defeat that behavior).
        form.submit();

        // For inline downloads, we need to retrieve a handle to
        // the window the browser opens (in order to detect errors).
        // Some browsers don't process the form submission immediately,
        // so we use the brief deferral to force the retrieval of the
        // window to the end of the JavaScript processing queue.
        if (options.download != 'attachment') {
          Ext.defer(function() {
           var newWindow = window.open("", targetId);
            if (newWindow != null) {
              waitForDownloadCompletionTask.newWindow = newWindow;
            } else {
              waitForDownloadCompletionTask.popupBlocked = true;
            }
          }, 1);
        }
      }
      catch(e) {
        // This can happen when the browser blocks pop-ups
        if (!e.message && !e.description) {
          waitForDownloadCompletionTask.popupBlocked = true;
        } else {
          waitForDownloadCompletionTask.inlineException = e;
        }
      }
    }, Ext.isIE ? 500 : 0);
  }

  function scanForDownloadCompletion(runCount) {
    var me = this;
    var cookie, downloadErrorContent;

    cookie = Ext.util.Cookies.get(me.token);
    // If the cookie was found, the browser download has successfully begun.
    if (cookie) {
      // Clear the cookie
      try {
        // The server explicitly sets a root cookie, i.e., path '/'
        Ext.util.Cookies.clear(me.token, '/');
      } catch (ignore) {}
      onDownloadComplete.call(me, true);
      // Terminate the task
      return false;
    }
    // The form submission failed for some reason
    else if (me.inlineException != undefined) {
      onDownloadComplete.call(me, false, null /* errorContent */, me.inlineException);
      // Terminate the task
      return false;
    }
    // An inline download failed due to the browser blocking popups
    else if (me.popupBlocked) {
      // Mask any server related error context, as this is strictly a client related issue.
      me.options.alertDownloadFailure = undefined;
      onDownloadComplete.call(me, false, null /* errorContent */, new Error(gw.app.localize('Document.Download.Failure.Popup')));
      // Terminate the task
      return false;
    }
    // An inline download failed
    else if (me.newWindow && (downloadErrorContent = windowContent(me.newWindow)) != undefined) {
      onDownloadComplete.call(me, false, downloadErrorContent);
      // Terminate the task
      return false;
    }
    // An attachment download failed
    else if (me.newFrame && (downloadErrorContent = frameContent(me.newFrame)) != undefined) {
      onDownloadComplete.call(me, false, downloadErrorContent);
      // Terminate the task
      return false;
    }
    // The download did not respond within maxRuns repetitions, assume timeout failure
    else if (runCount > me.maxRuns) {
      onDownloadComplete.call(Ext.apply(me, { timedout: true }), false);
      // Terminate the task
      return false;
    }

    // Keep scanning
    return true;
  }

  function generateDownloadRequestForm(targetId, url, encodedParams, extraParams) {
    var theDocument = window.document,
        form = theDocument.createElement('form'),
        id = Ext.id(),
        encoding = 'multipart/form-data',
        addField = function(name, value) {
          var hiddenItem = theDocument.createElement('input');
          Ext.fly(hiddenItem).set({
            type: 'hidden',
            value: value,
            name: name
          });
          form.appendChild(hiddenItem);
        },
        obj, value, name, vLen, v;

    Ext.fly(form).set({
      id: id,
      name: id,
      cls: Ext.baseCSSPrefix + 'hidden-display',
      method: 'POST',
      enctype: encoding,
      encoding: encoding,
      action: url,
      target: targetId
    });

    obj = extraParams || {};
    if (encodedParams) {
      Ext.apply(obj, Ext.Object.fromQueryString(encodedParams) || {});
    }

    if (!obj.hasOwnProperty(gw.app.CSRF_TOKEN_PARAM_KEY)) {
      obj[gw.app.CSRF_TOKEN_PARAM_KEY] = gw.app.getCsrfToken();
    }

    for (name in obj) {
      if (obj.hasOwnProperty(name)) {
        value = obj[name];
        if (Ext.isArray(value)) {
          vLen = value.length;
          for (v = 0; v < vLen; v++) {
            addField(name, value[v]);
          }
        } else {
          addField(name, value);
        }
      }
    }

    return theDocument.body.appendChild(form);
  }

  function documentHasBodyContent(doc) {
    return doc && doc.body && doc.body.innerHTML;
  }

  function windowContent(theWindow) {
    try {
      var doc = theWindow.document;
      return documentHasBodyContent(doc) ? doc : undefined;
    } catch(e) {
      return new Error(gw.app.localize('Document.Download.Failure.Content'));
    }
  }

  function frameContent(theFrame) {
    try {
      var doc = (theFrame.contentWindow && theFrame.contentWindow.document) ||
          theFrame.contentDocument || (window.frames[newFrame.id] || {}).document;
      return documentHasBodyContent(doc) ? doc : undefined;
    } catch(e) {
      return new Error(gw.app.localize('Document.Download.Failure.Content'));
    }
  }

  function onDownloadComplete(success, errorContent, errorException) {
    var me = this,
        response = {
          responseText: '',
          responseXML: null,
          timedout: me.timedout
        }, callback, contentNode;

    try {
      if (errorException) {
        throw errorException;
      }

      if (success) {
        callback = me.options.success;
        response.responseText = Ext.encode({ success: true, message: me.options.url });
      } else {
        callback = me.options.failure;
        if (errorContent && errorContent.body) {
          // Response sent as Content-Type: text/json or text/plain. Browser will embed in a <pre> element
          // Note: The statement below tests the result of an assignment.
          if ((contentNode = errorContent.body.firstChild) && /pre/i.test(contentNode.tagName)) {
            response.responseText = contentNode.textContent || contentNode.innerText;
          }
          // Response sent as Content-Type: text/html. We must still support JSON response wrapped in textarea.
          // Note: The statement below tests the result of an assignment.
          else if ((contentNode = errorContent.getElementsByTagName('textarea')[0])) {
            response.responseText = contentNode.value;
          }
          // Response sent as Content-Type: text/html. Error message in an embedded <pre> element
          else if ((contentNode = errorContent.getElementsByTagName('pre')[0])) {
            response.responseText = contentNode.textContent || contentNode.innerText;
          }
          // Response sent as Content-Type: text/html with no wrapping. Scrape JSON response out of text
          else {
            response.responseText = errorContent.body.textContent || errorContent.body.innerText;
          }

          // If the server has given a non-JSON response, wrap it in a JSON showErrors command.
          if (!Ext.decode(response.responseText, true)) {
            response.responseText = Ext.encode([{ cmd: 'showErrors', errors: [ formatDownloadError(response.responseText, me.options) ] }]);
          }

          //in IE the document may still have a body even if returns XML.
          response.responseXML = errorContent.XMLDocument || errorContent;
        }
      }
    } catch(e) {
      callback = me.options.failure;
      response.responseText = Ext.encode([{ cmd: 'showErrors',
        errors: [ formatDownloadError(e.message || e.description || (e.toString && e.toString()),
            me.options, true) ] }]);
    }

    if (!success && me.newWindow) {
      try {
        me.newWindow.close();
      } catch(ignore) {}
    }

    Ext.Ajax.fireEvent(success ? 'requestcomplete' : 'requestexception', Ext.Ajax, response, me.options);

    try {
      Ext.callback(callback, me.options.scope, [response, me.options]);
    } catch(ignore){}
    try {
      // Override success to true to allow normal UI processing of a legitimate response on error (except timeouts)
      Ext.callback(me.options.callback, me.options.scope, [me.options, !me.timedout /* success */, response]);
    } catch(ignore){}

    // Remove the download request form and the iframe for attachments, if any
    while (me.nodesToRemove.length > 0) {
      try {
        Ext.removeNode(me.nodesToRemove.shift());
      } catch(ignore) {}
    }

    me.newWindow = null;
    me.newFrame = null;
    me.nodesToRemove = null;
  }

  // Terminate the download completion scan task immediately on exceptions
  function handleDownloadException(task, e) {
    var me = this;
    // The task runner will catch and ignore any further exceptions
    onDownloadComplete.call(me, false, null, e);
    return false;
  }

  function formatDownloadError(error, options, wrapError) {
    var message = Ext.String.trim(error), formattedMessage;

    if (!options.alertDownloadFailure)
      return message;

    formattedMessage = options.alertDownloadFailure;

    if (wrapError)
      formattedMessage += gw.app.localize('Document.Download.Failure.ReasonFailure');
    formattedMessage += gw.app.localize('Document.Download.Failure.Reason', message);
    if (wrapError && Ext.isIE)
      formattedMessage += gw.app.localize('Document.Download.Failure.ReasonFailure.IENote');

    return formattedMessage;
  }

  function addCsrfToken(url) {
    var csrfTokenParameter = gw.app.CSRF_TOKEN_PARAM_KEY + '=';
    if (url.indexOf(csrfTokenParameter) != -1)
      return url;

    var separator = url.indexOf('?') == -1 ? '?' : '&';
    return url + separator + csrfTokenParameter + gw.app.getCsrfToken();
  }

  return {
    singleton: true,
    requires: ['Ext.Ajax', 'gw.Debug', 'gw.app'],
    uses: ['Ext.Msg'],

    showAlert : showAlert,
    processUploadResponse : processUploadResponse,
    uploadSizeError: uploadSizeError,
    uploadTotalSizeError: uploadTotalSizeError,
    uploadTotalCountError: uploadTotalCountError,
    addCsrfToken : addCsrfToken,
    downloadContent: downloadContent,

    /**
     * Handles response from server
     * @param cmdInfo command info
     * @param response server response
     * @param requestOptions
     */
    handleResponse : function (cmdInfo, response, requestOptions) {
      if (cmdInfo.docAction) {
          var opName = cmdInfo.docAction;
          switch(opName) {
            case 'downloadFile' :
                // Route download request through standard AJAX event loop
                gw.app.handleAction(undefined, 'download',
                  { url: gw.app.getConfig().FileDownloadURL,
                    download: cmdInfo.contentDisposition,
                    alertDownloadFailure: cmdInfo.alertDownloadFailure,
                    isRenderViewRootOnly: true },
                  { widgetId: cmdInfo.widgetId,
                    docId: cmdInfo.docId,
                    ajaxRequestInfo: {} } );
                return;
              default:
                showAlert(null, 'unsupported document action: ' + opName);
          }
      }
    }
  }
});
