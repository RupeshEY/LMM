package gw.api.activity

@Export
class ActivityUIHelper {

  /**
   * Links an Activity and a Document. This should be called when the toolbar
   * button for creating this linkage is clicked. Does nothing if the indicated
   * Activity is already linked to the indicated Document. This will do a bundle commit.
   *
   * @param document the Document to link the Activity to
   * @param activity the Activity to link to the indicated Document
   */
  public static function onPickDocument(document : Document, activity : Activity) : void {
    if (document != null) {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> {  {
        var bundleDoc = bundle.add(document)
        var bundleAct = bundle.add(activity)
        bundleAct.addLinkedDocument(bundleDoc)
      }
      })
    }
  }

}