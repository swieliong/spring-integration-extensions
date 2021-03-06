/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.samples.splunk.inbound;

import java.util.List;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.splunk.entity.SplunkData;
import org.springframework.stereotype.Component;

/**
 * @author Jarred Li
 * @since 1.0
 *
 */
@Component
public class SplunkDataHandler {

	@ServiceActivator
	public void handle(List<SplunkData> data) {
		for (SplunkData sd : data) {
			System.out.println("splunk data:" + sd.toString());
		}
	}
}
