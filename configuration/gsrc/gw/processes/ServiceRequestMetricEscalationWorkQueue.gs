package gw.processes
uses java.util.Iterator
uses gw.api.database.Query
uses gw.api.util.DateUtil
uses gw.api.database.IQueryBeanResult
uses com.google.common.collect.Iterables

@Export
class ServiceRequestMetricEscalationWorkQueue extends WorkQueueBase<ServiceRequestMetric, StandardWorkItem>{

  construct() {
    super(BatchProcessType.TC_SERVICEREQUESTMETRICESCALATION, StandardWorkItem, ServiceRequestMetric)
  }

  /**
   * For each work item, create an activity from a metric-specific pattern assigned to the service request's assigned user 
   * and mark the metric as escalated.
   */
  override function processWorkItem(workItem : StandardWorkItem) {
    var metric = extractTarget(workItem)
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      metric = bundle.add(metric)
      var metricAsDelegate = metric as ServiceRequestMetricEscalationDelegate
      var activity = metric.ServiceRequest.Claim.newActivity(metricAsDelegate.EscalationActivityPatternForMetric, null)
      activity.assign(metric.ServiceRequest.AssignedGroup, metric.ServiceRequest.AssignedUser)
      activity.RelatedTo = metric.ServiceRequest
      metricAsDelegate.Escalated = true
    })
  }
  
  /**
   * Queries for specialist initial response time metrics that are open and not escalated, have a ReachRedTime before the 
   * current time, and have not been already picked up by the work queue.
   */
  override function findTargets() : Iterator<ServiceRequestMetric> {
    return Iterables.concat(findMetricsMetricsToEscalate(SpecialistInitialResponseTimeServiceRequestMetric), 
                            findMetricsMetricsToEscalate(QuoteTimelinessServiceRequestMetric),
                            findMetricsMetricsToEscalate(ServiceTimelinessServiceRequestMetric)).iterator()
  }
  
  private function findMetricsMetricsToEscalate(metricType : Type<ServiceRequestMetric>) : IQueryBeanResult<ServiceRequestMetric> {
    var workItemQ = Query.make(StandardWorkItem).compare(StandardWorkItem#QueueType, Equals, BatchProcessType.TC_SERVICEREQUESTMETRICESCALATION)
    return Query.make(metricType)
                       .compare(ServiceRequestMetric#ReachRedTime, LessThanOrEquals, DateUtil.currentDate())
                       .compare(ServiceRequestMetricEscalationDelegate#Escalated, Equals, false)
                       .compare(TimeBasedServiceRequestMetric#IsOpen, Equals, true)
                       .subselect(ServiceRequestMetric#ID, CompareNotIn, workItemQ, StandardWorkItem#Target)
                       .select()
  }
}