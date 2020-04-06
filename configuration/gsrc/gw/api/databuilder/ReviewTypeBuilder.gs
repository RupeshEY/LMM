package gw.api.databuilder

@Export
class ReviewTypeBuilder extends CCDataBuilder<ReviewType, ReviewTypeBuilder> {
  construct()
  {
    super( entity.ReviewType );
  }
  
  public function withContactSubtype(contactSubtype : typekey.Contact) : ReviewTypeBuilder {
    set(ReviewType.Type.TypeInfo.getProperty( "ContactSubtype" ), contactSubtype)
    return this
  }
  
  public function withDescription(description : String) : ReviewTypeBuilder {
    set(ReviewType.Type.TypeInfo.getProperty( "Description" ), description)
    return this
  }
  
  public function withName(name : String) : ReviewTypeBuilder {
    set(ReviewType.Type.TypeInfo.getProperty( "Name" ), name)
    return this
  }
}
