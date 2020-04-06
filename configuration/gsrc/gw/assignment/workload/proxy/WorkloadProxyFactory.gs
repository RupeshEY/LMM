package gw.assignment.workload.proxy

uses gw.api.assignment.workload.proxy.WorkloadProxy
uses gw.api.assignment.workload.proxy.WorkloadProxyFactoryBase
uses gw.entity.IEntityType
uses gw.lang.reflect.TypeSystem

/**
 * <p>Factory which manufactures and manages WeightProxy singleton resources.</p>
 *
 * <p>To add support for weighted workload for a class of Assignable, a WorkloadProxy must be created for that Assignable type
 * and must be registered here in the WorkloadProxyFactory.</p>
 */
@Export
final public class WorkloadProxyFactory extends WorkloadProxyFactoryBase {

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Statics
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Singleton access to the Workload Proxy Factory.
   */
  private final static var _instance : WorkloadProxyFactory as readonly INSTANCE = new gw.assignment.workload.proxy.WorkloadProxyFactory()


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns a workload proxy for a given Assignable type or null if not supported.
   */
  public static function getProxy(type : IEntityType) : WorkloadProxy {
    return INSTANCE._proxyMap.get(type)
  }

  /**
   * Returns a workload proxy for a given Assignable based on its type or null if not supported.
   */
  public static function getProxy(assignable : Assignable) : WorkloadProxy {
    return getProxy(TypeSystem.getTypeFromObject(assignable) as IEntityType)
  }

}