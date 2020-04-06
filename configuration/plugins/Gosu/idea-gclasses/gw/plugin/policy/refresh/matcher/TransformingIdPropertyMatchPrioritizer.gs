package gw.plugin.policy.refresh.matcher
uses gw.api.bean.compare.PropertyMatchPrioritizer
uses java.util.Comparator
uses gw.api.policy.refresh.IdPropertyMatchPrioritizer

@Export
class TransformingIdPropertyMatchPrioritizer<T,C extends KeyableBean> implements Comparator<T> {

  private var _propertyMatchPrioritizer : PropertyMatchPrioritizer<C>
  private var _transform : block(input : T) : C

  construct(toBeMatched : T, transform : block(input : T) : C) {
    _propertyMatchPrioritizer = new IdPropertyMatchPrioritizer<C>(transform(toBeMatched))
    _transform = transform
  }

  override function compare(potentialMatch1 : T, potentialMatch2 : T) : int {
    return _propertyMatchPrioritizer.compare(_transform(potentialMatch1), _transform(potentialMatch2))
  }

}
