package gw.document

uses gw.api.locale.DisplayKey
uses gw.plugin.document.IDocumentContentSource

/**
 * Enhancement for Document entity.
 */
@Export
enhancement DocumentEnhancement : entity.Document {
  /**
   * Callback prior to synchronously storing the Document. 
   */
  function preSynchronousStore(documentContentSource : IDocumentContentSource) {
    adjustDocumentNameIfDuplicate(documentContentSource)
  }
  
  /**
   * Adjust the supplied document's name to avoid conflicts with documents already in the system. This
   * will supply a numeric argument to a display key, producing alternate names like "Foo (2)", "Foo (3)", etc.
   * until a unique name is generated.
   * 
   * NOTE: this may cause an infinite loop if the document name is not used in identifying the
   * document in the DMS--i.e., IDocumentContentSource#isDocument returns true for regardless of the
   * name of the document. In this case, change the <code>preSynchronouseStore()</code> implementation
   * to remove the call to this method.
   */
  private function adjustDocumentNameIfDuplicate(documentContentSource : IDocumentContentSource) {
    var i=1;
    var originalName = this.Name;
    while(documentContentSource.isDocument( this )) {
      //As long as the DocumentSource rejects the document name, tweak it to avoid conflicts.
      //This assumes that the name is all that needs to be changed; that may not be true for
      // every DMS integration.
      i = i+1; //Start the index at 2, since by definition there's already one
      this.Name = DisplayKey.get("Java.Document.DocumentDuplicateNameAdjustment", originalName, i);
    }
  }
}
