package gw.api.databuilder

@Export
class PlaceBuilder extends PlaceBuilderBase<Place, PlaceBuilder> {
  construct() {
    super( entity.Place );
  }
}