package libraries

@Export
enhancement ActivityUI : entity.Activity
{
  function setInitialValues() {
    // Activities are initialized from a pattern; don't overwrite fields already set by pattern
    if (this.Importance == null) {
      this.Importance = TC_NOTONCALENDAR;
    }
  }
  


}