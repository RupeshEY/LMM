package gw.plugin.policy.refresh.diffdisplay

uses gw.api.bean.compare.EntityDiff
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.plugin.policy.refresh.CoverageValidator
uses gw.api.web.UIMessageList
uses gw.plugin.policy.refresh.ui.PolicyRefreshMessageContext

/**
 * Base DiffDisplay for Coverages.
 */
@Export
abstract class CoverageDiffDisplay<T extends Coverage> extends EntityDiffDisplayBase<T> 
{
  var _validator = new CoverageValidator()
    
  construct(theDiff : EntityDiff<T>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }
  
  protected property get Validator() : CoverageValidator {
    return _validator
  }
  
  /**
   * Returns a list of errors and warnings associated with the Coverage,
   * if any.
   */
  override function getMessages(ctx : PolicyRefreshMessageContext) : UIMessageList {
    var result:UIMessageList
    if(Type==REMOVED) {
      result = _validator.performValidation(Diff.SourceValue)
    } else if(Type==CHANGED) {
      result = _validator.performValidation(Diff.SourceValue, Diff.CompareValue)
    } else {
      //no validation
      result = new UIMessageList()
    }
    return result
  }
}
