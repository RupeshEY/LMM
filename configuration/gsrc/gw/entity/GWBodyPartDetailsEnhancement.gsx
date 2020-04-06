package gw.entity

@Export
enhancement GWBodyPartDetailsEnhancement : entity.BodyPartDetails {

  /**
   * Tests if the DetailedBodyPart of this BodyPartDetails requires the SideOfBody be indicated.
   *
   * @returns true if a SideOfBody is required for a DetailedBodyPart, false otherwise (or if DetailedBodyPart is null)
   *
   */
  function requiresSideOfBodyField() : boolean {
    if (this.DetailedBodyPart == null) {
      return false
    }

    return DetailedBodyPartType.TF_REQUIRESSIDEOFBODY.TypeKeys.contains(this.DetailedBodyPart)
  }
}
