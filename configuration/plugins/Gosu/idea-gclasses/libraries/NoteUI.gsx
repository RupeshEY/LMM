package libraries

@Export
enhancement NoteUI : entity.Note
{
  /*
   * Initialize any standard default values on a newly created Note. Used in the new
   * Note page
   */
  function setInitialValues() {
    this.Confidential = false
  }
  


}