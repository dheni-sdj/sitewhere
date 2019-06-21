/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.device.spi.kafka;

import com.sitewhere.spi.microservice.kafka.IMicroserviceKafkaProducer;

/**
 * Kafka producer that sends events triggered by device management interactions.
 */
public interface IDeviceInteractionEventsProducer extends IMicroserviceKafkaProducer {
}