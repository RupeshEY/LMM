Ext.define('gw.doc.HTML5UploadConnection', {
  extend: 'Ext.data.Connection',

  newRequest: function (options) {
    var me = this;
    var xhr = me.callParent(arguments);

    xhr.upload.onprogress = function (e) {
      me.fireEvent('uploadProgress', e);
    };
    xhr.upload.onloadend = function (e) {
      me.fireEvent('uploadComplete', e);
    };

    return xhr;
  }
});
