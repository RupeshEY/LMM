Ext.define('gw.doc.file', function() {
  var isHTML5Supported = function() {
    return typeof FileReader != 'undefined' && typeof FormData != 'undefined';
  };

  // The callback to handle files made available by the browser (defined below)
  var handleFiles = null;

  var maxFilesPerRequest = 100;
  var maxBytesPerRequest = 2097152; // 2MB

  var dragEnter = function(e) {
    e.dataTransfer.dropEffect = 'copy';
    e.stopPropagation();
    e.preventDefault();
  };

  var dragOver = function(e) {
    e.dataTransfer.dropEffect = 'copy';
    e.stopPropagation();
    e.preventDefault();
  };


  var handleFilesForEvent = function(e, files) {
    e.stopPropagation();
    e.preventDefault();

    // addDragAndDrop below adds a reference to the component
    // before attaching this method as a listener
    handleFiles(e.currentTarget.scope, files);
  };

  var drop = function(e) {
    e.dataTransfer.dropEffect = 'copy';
    handleFilesForEvent(e, e.dataTransfer.files);
  };

  var block = function(e) {
    e.dataTransfer.dropEffect = 'none';
    e.preventDefault();
  };

  var addDragAndDrop = function (widget, cmp) {
    // Determine if dropzone widget is an immediate child of a Panel.
    // If so, expand the dropzone to the the first container of the widget.
    // This is done so that dropzones specifying worksheets, popups or pages encompass
    // the entire visible frame for that dropzone.
    var el = ((widget.up('panel', 2) && widget.up('container', 2)) || widget).getEl();
    var dom = el ? el.dom : null;

    if (!dom) {
      gw.Debug.log('Could not find DOM element for widget ' + widget.getId());
      return;
    }

    // Add a reference to the component on the actual DOM element
    // so that the event can refer to it through Event.target.scope
    dom.scope = cmp;

    dom.addEventListener('dragenter', dragEnter, false);
    dom.addEventListener('dragover', dragOver, false);
    dom.addEventListener('drop', drop, false);
  };

  var processUploadIntermediateResponse = function(response,result) {
    var intermediateResult = Ext.decode(response.responseText, true /*safe*/) || {};
    intermediateResult.errors = intermediateResult.errors || {};

    // If there is no valid response status and this is not an aborted AJAX response,
    // e.g., from the user cancelling the upload, then add a general error message to show the failure
    if (!Ext.data.Connection.prototype.parseStatus(response.status).success) {
      if (!response.aborted && Object.keys(intermediateResult.errors).length == 0) {
        intermediateResult.errors =
        { errorGeneral: [ gw.app.localize('ExtJS.Alert.HTTPRequestFailed', response.status) ] };
      }
    }
    if (!result) {
      return intermediateResult;
    }

    result.success = result.success && intermediateResult.success;

    result.fileAcceptedCount += intermediateResult.fileAcceptedCount;

    if (intermediateResult.errors.errorGeneral)
      result.errors.errorGeneral = Ext.Array.merge(result.errors.errorGeneral || [],
        intermediateResult.errors.errorGeneral);

    if (intermediateResult.errors.errorReasonSize)
      result.errors.errorReasonSize = Ext.Array.merge(result.errors.errorReasonSize || [],
        intermediateResult.errors.errorReasonSize);

    if (intermediateResult.errors.errorReasonTotalSize > 0)
      result.errors.errorReasonTotalSize =
        (result.errors.errorReasonTotalSize || 0) + intermediateResult.errors.errorReasonTotalSize;

    if (intermediateResult.errors.errorReasonOther)
      Ext.merge(result.errors.errorReasonOther || {}, intermediateResult.errors.errorReasonOther);

    return result;
  };

  var processUploadHelper = function(cmp, response, result) {
    result = result || processUploadIntermediateResponse(response);
    gw.doc.Management.processUploadResponse('', result, function() {
      gw.app.handleCompAction(cmp, null, cmp.getEl());
    });
  };

  // For HTML5 browsers, send files through AJAX with a progress indicator
  if (isHTML5Supported()) {
    handleFiles = function (cmp, allFiles) {
      var currentFileIndex = 0,
        currentUploaded = 0,
        totalSize = 0,
        progressBar = null,
        progressTaskInitialize = null;

      // The limits are rendered with the File component
      var sizeLimit = cmp.sizeLimit;
      var availableSpace = cmp.availableSpace;
      var countLimit = cmp.countLimit;
      var availableCount = cmp.availableCount;

      var filteredFiles = [];
      var tooBigFileNames = [];

      // First calculate the total upload size of all files that
      // do not exceed the individual size limit
      for (var i = 0, len = allFiles.length ; i < len ; i++) {
        if (allFiles[i].size <= sizeLimit) {
          filteredFiles[filteredFiles.length] = allFiles[i];
          totalSize += allFiles[i].size;
        } else {
          tooBigFileNames[tooBigFileNames.length] = allFiles[i].name;
        }
      }

      // Show an alert for individual files too big
      if (tooBigFileNames.length > 0) {
        gw.doc.Management.uploadSizeError('', sizeLimit, tooBigFileNames);
      }

      // Reject the entire upload if the total size is too big
      // Note that 'availableSpace' may be less than 'totalSizeLimit' because of prior files
      // uploaded in this session that have not yet been committed.
      if (totalSize > availableSpace) {
        gw.doc.Management.uploadTotalSizeError('', filteredFiles.length, totalSize, availableSpace);
        return;
      }

      // Don't bother continuing if no files qualified for upload
      if (filteredFiles.length <= 0)
        return;

      // Reject the entire upload if the total count is too big
      // Note that 'availableCount' may be less than 'countLimit' because of prior files
      // uploaded in this session that have not yet been committed.
      if (countLimit > 0 && filteredFiles.length > availableCount) {
        gw.doc.Management.uploadTotalCountError('', filteredFiles.length, availableCount);
        return;
      }

      // Results of the entire file upload
      var completeResult = null;

      var html5UploadConnection = new gw.doc.HTML5UploadConnection({
        listeners: {
          uploadProgress: function(e) {
            if (e.lengthComputable && progressBar) {
              var fraction = (currentUploaded + e.loaded) / totalSize;
              progressBar.updateProgress(fraction, gw.app.localize('Document.Upload.Progress.Percent', Math.round(fraction * 100)));
            }
          },
          uploadComplete: function(e) {
            if (e.lengthComputable) {
              currentUploaded += e.loaded;
            }
          }
        }
      });

      // Brief delay before showing the progress bar in case the upload is fast
      progressTaskInitialize = new Ext.util.DelayedTask(function() {
        progressBar = new Ext.window.MessageBox({
        }).show({
            buttons: Ext.Msg.CANCEL,
            buttonText: {
              cancel: gw.app.localize('Button.Cancel')
            },
            closable: false,
            fn: function(buttonId) {
              if (buttonId === 'cancel') {
                html5UploadConnection.abort();
              }
            },
            msg: null,
            progress: true,
            progressText: gw.app.localize('Document.Upload.Progress.Percent', 0),
            title: gw.app.localize('Document.Upload.Progress.Banner')
          });
      });
      progressTaskInitialize.delay(1000);

      var task = new Ext.util.DelayedTask(function() {
        var filesForRequest = 0;
        var bytesForRequest = 0;

        // Only process at most maxFilesPerRquest and maxBytesPerRequest
        // per request to avoid overloading the server connection handler
        var formData = new FormData();

        gw.app.prepFormData(formData);

        // eventParam will be the widgetId for files nested within a grid cell
        formData.append(cmp.uploadURLWidgetIdParam, cmp.eventParam || cmp.id);
        while (currentFileIndex < filteredFiles.length &&
          filesForRequest < maxFilesPerRequest && bytesForRequest <= maxBytesPerRequest) {
          var file = filteredFiles[currentFileIndex++];
          filesForRequest++;
          bytesForRequest += file.size;
          formData.append(cmp.uploadURLFileContentParam, file);
        }

        html5UploadConnection.request({
          url: cmp.uploadURL,
          method: 'POST',

          // Null content-type and rawData prevent ExtJS from
          // interfering with the underlying XHR processing of FormData
          // as a multipart/form-data request
          rawData: formData,
          headers: {
            'Content-Type' : null
          },

          timeout : gw.app.ajaxTimeout(),

          callback: function(options, success, response) {
            completeResult = processUploadIntermediateResponse(response, completeResult);

            // If the upload was aborted, e.g., by the user hitting cancel,
            // schedule one last request with no files to tell the server to
            // delete any temporary files it has already uploaded for the request.
            if (response.aborted) {
              currentFileIndex = filteredFiles.length;
              task.delay(0);
            }
            // schedule another upload if there are remaining files
            else if (currentFileIndex < filteredFiles.length) {
              task.delay(0);
            }
            // Otherwise, cancel the progress bar
            else {
              if (progressTaskInitialize) {
                progressTaskInitialize.cancel();
                progressTaskInitialize = null;
              }
              if (progressBar) {
                progressBar.close();
                progressBar = null;
              }
              processUploadHelper(cmp, response, completeResult);
            }
          }
        });
      });
      task.delay(0);
    };
  }
  // For non-HTML5 browsers, use the traditional HTML FILE input based hidden-iframe
  else {
    var processUploadFormSuccess = function(form, action) {
      form.value = null;
      action.response = action.response || {};
      if (!action.response.hasOwnProperty('status'))
        action.response.status = 200;
      processUploadHelper(form.owner, action.response);
    };


    var processUploadFormFailure = function(form, action) {
      form.value = null;
      action.response = action.response || {};
      processUploadHelper(form.owner, action.response);
    };

    handleFiles = function (cmp /*, files*/) {
      // Used instead of the standard form.submit()
      // because of issues with non-JSON responses
      cmp.getForm().doAction('gw.doc.Submit', {
        url: cmp.uploadURL,
        success: processUploadFormSuccess,
        failure: processUploadFormFailure
      });
    }
  }

  var wrappedCreateFileInput = function() {
    var me = this;
    me.originalCreateFileInput();
    me.fileInputEl.set({ multiple: 'multiple' });
  };

  var markAsMultiple = function(cmp, fileField) {
    if (cmp.multiple) {
      // ExtJS doesn't directly support the 'multiple' attribute on
      // an HTML FILE INPUT element, so we must explicitly add it to the DOM
      // for both the input itself and its hidden ExtJS FileButton
      fileField.fileInputEl.set({ multiple: 'multiple' });
      fileField.button.fileInputEl.set({ multiple: 'multiple' });

      // The method below on FileButton is called when ExtJS
      // clears the FILE input on form submission -- and it discards the
      // original DOM element and recreates it. So we have to capture that too.
      if (!fileField.button.originalCreateFileInput) {
        fileField.button.originalCreateFileInput = fileField.button.createFileInput;
        fileField.button.createFileInput = wrappedCreateFileInput;
      }
    }
  };

  var addDropzones = function(cmp/*, fileField*/) {
    if (!isHTML5Supported()) {
      return;
    }

    var dropzoneWidgetIds = cmp.dropzoneWidgetIds || [];
    var cmpId = cmp.getId();
    var i;

    // Always add the file component as a dropzone of itself, if not already specified
    var found = false;
    for (i = 0 ; i < dropzoneWidgetIds.length ; i++) {
      if (dropzoneWidgetIds[i]== cmpId) {
        found = true;
        break;
      }
    }
    if (!found) {
      dropzoneWidgetIds[dropzoneWidgetIds.length] = cmpId;
    }

    for (i = 0 ; i < dropzoneWidgetIds.length ; i++) {
      var dropzoneWidget = Ext.getCmp(dropzoneWidgetIds[i]);
      if (dropzoneWidget) {
        // Delay adding events to referenced widgets until they are fully rendered
        if (!dropzoneWidget.getEl()) {
          dropzoneWidget.on('afterrender', addDragAndDrop, null, cmp);
        } else {
          addDragAndDrop(dropzoneWidget, cmp);
        }
      }
    }
  };

  var handleFilesForBrowserFileInputElementEvent = function(e) {
    handleFilesForEvent(e, e.target.files);
  };

  var addBrowserFileInputHandler = function(cmp, fileField) {
    // Finally, attach a 'change' listener to the actual FILE input element
    // to use the same handler for manual selections as Drag and Drop.
    fileField.fileInputEl.dom.scope = cmp;
    fileField.fileInputEl.on('change', handleFilesForBrowserFileInputElementEvent);
  };

  var postRenderFileField = function(fileField) {
    var cmp = fileField.scope;
    markAsMultiple(cmp, fileField);
    addDropzones(cmp, fileField);
    addBrowserFileInputHandler(cmp, fileField);
  };

  // PLWEB-4752: Browse button does not appear for doc upload in Firefox
  // Given how Guidewire renders components via AJAX, sometimes the browse button is rendered with the style 'width: 0'.
  // This is because the button's bounding rectangle is not quite ready in onRender when the trigger wrap's width is
  // set.  Even with 0 width, the button inside the wrap appears to render fine in Chrome and IE.  Firefox honors the
  // 0 width and the button is effectively hidden.  This fix re-runs the trigger's width on 'boxready', which fires one
  // time after the component was laid out the first time, and the bounding rectangle is properly set.
  //
  // NOTE: Brian Dantes did not really like this solution so we filed PLWEB-5554 to get to a root-cause analysis
  // when we can
  var fixWidthOnBoxReady = function(fileField) {
    var trigger = fileField.getTrigger('filebutton');
    var buttonEl = trigger.component.el;
    trigger.el.setWidth(buttonEl.getWidth() + buttonEl.getMargin('lr'));
  };

  // Block drag and drop events by default
  window.addEventListener('dragenter', block, false);
  window.addEventListener('dragover', block, false);
  window.addEventListener('drop', block, false);

  return {
    requires: ['gw.Debug', 'gw.app', 'gw.doc.Management'],
    uses: ['gw.doc.HTML5UploadConnection', 'gw.doc.Submit'],
    extend: 'Ext.form.Panel',
    mixins: ['Ext.form.field.Field'],
    alias: 'widget.gfile',
    tabIndex: -1,
    border: false,

    animCollapse: false,

    layout: {
      type: 'column'
    },

    initComponent : function() {
      var me = this;
      var uploadURLFileContentParamValue = gw.app.getConfig().FileUploadFileContentParam;

      if (me.onloadScript) {
        eval(me.onloadScript);
      }

      Ext.apply(me, {
        uploadURL: gw.app.getConfig().FileUploadURL,
        uploadURLWidgetIdParam: gw.app.getConfig().FileUploadWidgetIdParam,
        uploadURLFileContentParam: uploadURLFileContentParamValue,
        items: [
          {
            xtype: 'hiddenfield',
            name: 'widgetId',
            value: me.id
          },
          {
            xtype: 'textfield',
            fieldLabel: me.fieldLabel,
            required: me.required,
            invalid: me.invalid,
            readOnly: true,
            submitValue: false,
            value: me.value,
            padding: '0 5 0 0',
            hidden: !me.valueDisplayed,
            columnWidth: 0.7
          },
          {
            scope: me, // Expand the scope to the containing component,
                       // necessary so event handlers can see the entire component
            xtype: 'filefield',
            name: uploadURLFileContentParamValue,
            buttonOnly: true,
            buttonText: me.buttonText,
            invalid: me.invalid,
            columnWidth: 0.3,

            listeners: {
              afterrender: postRenderFileField,
              boxready: fixWidthOnBoxReady
            }
          }
        ]
      });
      me.callParent(arguments);

      me.initField();
    }
  }
});