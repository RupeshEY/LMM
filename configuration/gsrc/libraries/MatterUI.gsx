package libraries

@Export
enhancement MatterUI : entity.Matter
{
  /*
   * Initialize any standard default values on a newly created matter. Used in the new matter
   * page in the claim file
   */
  function setInitialValues() {
    this.ValidationLevel = TC_NEWLOSS; 
  }
  


}