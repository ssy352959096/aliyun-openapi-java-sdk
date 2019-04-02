/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ocs.model.v20150301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocs.transform.v20150301.DescribeMonitorValuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorValuesResponse extends AcsResponse {

	private String requestId;

	private String date;

	private List<OcsInstanceMonitor> instanceIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<OcsInstanceMonitor> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<OcsInstanceMonitor> instanceIds) {
		this.instanceIds = instanceIds;
	}

	public static class OcsInstanceMonitor {

		private String instanceId;

		private List<OcsMonitorKey> monitorKeys;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<OcsMonitorKey> getMonitorKeys() {
			return this.monitorKeys;
		}

		public void setMonitorKeys(List<OcsMonitorKey> monitorKeys) {
			this.monitorKeys = monitorKeys;
		}

		public static class OcsMonitorKey {

			private String monitorKey;

			private String value;

			private String unit;

			public String getMonitorKey() {
				return this.monitorKey;
			}

			public void setMonitorKey(String monitorKey) {
				this.monitorKey = monitorKey;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}
	}

	@Override
	public DescribeMonitorValuesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorValuesResponseUnmarshaller.unmarshall(this, context);
	}
}
