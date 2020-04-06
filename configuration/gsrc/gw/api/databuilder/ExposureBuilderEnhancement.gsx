package gw.api.databuilder

@Export
enhancement ExposureBuilderEnhancement: ExposureBuilder {
  /**
   * Adds the service request to the exposure.
   *
   * @param serviceRequest the service request to add
   * @return the modified builder
   */
  function withServiceRequest(serviceRequest: ServiceRequest): ExposureBuilder {
    return withServiceRequest(DataBuilder.wrapBean(serviceRequest));
  }

  /**
   * Adds the service request to the exposure.
   *
   * @param serviceRequest a value generator that will return the desired value
   * @return the modified builder
   */
  function withServiceRequest(serviceRequest: ValueGenerator<ServiceRequest>): ExposureBuilder {
    this.addArrayElement(Exposure#ServiceRequests, serviceRequest);
    return this;
  }

}
