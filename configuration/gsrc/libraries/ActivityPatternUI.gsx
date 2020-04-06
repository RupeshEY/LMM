package libraries
uses gw.api.admin.BaseAdminUtil


@Export
enhancement ActivityPatternUI : entity.ActivityPattern
{
  /*
   * Initialize any standard default values on a newly created ActivityPattern. Used in the new
   * ActivityPattern page
   */
  function setInitialValues() {
    this.Priority = TC_NORMAL
  }
}