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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeCdnMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnMonitorDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String monitorInterval;

	private List<CDNMonitorData> monitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMonitorInterval() {
		return this.monitorInterval;
	}

	public void setMonitorInterval(String monitorInterval) {
		this.monitorInterval = monitorInterval;
	}

	public List<CDNMonitorData> getMonitorDatas() {
		return this.monitorDatas;
	}

	public void setMonitorDatas(List<CDNMonitorData> monitorDatas) {
		this.monitorDatas = monitorDatas;
	}

	public static class CDNMonitorData {

		private String timeStamp;

		private String bytesPerSecond;

		private String queryPerSecond;

		private String requestHitRate;

		private String bytesHitRate;

		private String averageObjectSize;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getBytesPerSecond() {
			return this.bytesPerSecond;
		}

		public void setBytesPerSecond(String bytesPerSecond) {
			this.bytesPerSecond = bytesPerSecond;
		}

		public String getQueryPerSecond() {
			return this.queryPerSecond;
		}

		public void setQueryPerSecond(String queryPerSecond) {
			this.queryPerSecond = queryPerSecond;
		}

		public String getRequestHitRate() {
			return this.requestHitRate;
		}

		public void setRequestHitRate(String requestHitRate) {
			this.requestHitRate = requestHitRate;
		}

		public String getBytesHitRate() {
			return this.bytesHitRate;
		}

		public void setBytesHitRate(String bytesHitRate) {
			this.bytesHitRate = bytesHitRate;
		}

		public String getAverageObjectSize() {
			return this.averageObjectSize;
		}

		public void setAverageObjectSize(String averageObjectSize) {
			this.averageObjectSize = averageObjectSize;
		}
	}

	@Override
	public DescribeCdnMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
