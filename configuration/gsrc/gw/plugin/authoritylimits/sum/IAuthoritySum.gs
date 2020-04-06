package gw.plugin.authoritylimits.sum

@Export
/**
 * Each authority limit type should have one corresponding concrete implementation of this interface
 * that defines what it means for that limit type to be exceeded.
 */
public interface IAuthoritySum {
  /**
   * Determines whether the authority limit for the bean is exceeded
   * @param bean the bean
   * @param limit the limit
   * @return boolean whether limit is exceeded or not
   */
  function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean

  /**
   * Gets the authority limit type code
   * @return AuthorityLimitType the authority limt type
   */
  property get AuthorityLimitType(): AuthorityLimitType
}