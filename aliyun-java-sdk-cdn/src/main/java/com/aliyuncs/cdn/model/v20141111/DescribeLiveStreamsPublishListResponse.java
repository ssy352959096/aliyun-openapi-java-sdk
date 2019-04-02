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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamsPublishListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsPublishListResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamPublishInfo> publishInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamPublishInfo> getPublishInfo() {
		return this.publishInfo;
	}

	public void setPublishInfo(List<LiveStreamPublishInfo> publishInfo) {
		this.publishInfo = publishInfo;
	}

	public static class LiveStreamPublishInfo {

		private String domainName;

		private String appName;

		private String streamName;

		private String streamUrl;

		private String publishTime;

		private String stopTime;

		private String publishUrl;

		private String clientAddr;

		private String edgeNodeAddr;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public String getPublishUrl() {
			return this.publishUrl;
		}

		public void setPublishUrl(String publishUrl) {
			this.publishUrl = publishUrl;
		}

		public String getClientAddr() {
			return this.clientAddr;
		}

		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}

		public String getEdgeNodeAddr() {
			return this.edgeNodeAddr;
		}

		public void setEdgeNodeAddr(String edgeNodeAddr) {
			this.edgeNodeAddr = edgeNodeAddr;
		}
	}

	@Override
	public DescribeLiveStreamsPublishListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsPublishListResponseUnmarshaller.unmarshall(this, context);
	}
}
