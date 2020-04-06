// This specialized version of action.Submit avoids
// an issue the default one has with non-JSON responses
Ext.define('gw.doc.Submit', {
  extend: 'Ext.form.action.Submit',
  alias: 'formaction.gw.doc.Submit',
  requires: ['Ext.Ajax', 'Ext.decode', 'gw.app'],

  /**
   * @private
   * Overriden. Adds csrfToken to the ajax option params.
   */
  doSubmit: function() {
    var me = this,
        ajaxOptions = Ext.apply(me.createCallback(), {
          url: me.getUrl(),
          method: me.getMethod(),
          headers: me.headers
        }),
        form = me.form,
        jsonSubmit = me.jsonSubmit || form.jsonSubmit,
        paramsProp = jsonSubmit ? 'jsonData' : 'params',
        formInfo;

    // For uploads we need to create an actual form that contains the file upload fields,
    // and pass that to the ajax call so it can do its iframe-based submit method.
    if (form.hasUpload()) {
      formInfo = me.buildForm();
      ajaxOptions.form = formInfo.formEl;
      ajaxOptions.isUpload = true;
      //// overridden. csrf token
      ajaxOptions.params = {csrfToken: gw.app.getCsrfToken()}
      //// end of override.
    } else {
      ajaxOptions[paramsProp] = me.getParams(jsonSubmit);
    }

    Ext.Ajax.request(ajaxOptions);
    if (formInfo) {
      me.cleanup(formInfo);
    }
  },

  handleResponse: function(response) {
    var json = Ext.decode(response.responseText, true);
    if (!json) {
      json = {
        success: false,
        errors: [ response.responseText ]
      }
    }
    return json;
  }
});
