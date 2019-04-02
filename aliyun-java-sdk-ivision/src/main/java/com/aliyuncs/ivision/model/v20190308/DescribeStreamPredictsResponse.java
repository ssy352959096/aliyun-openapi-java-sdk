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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.DescribeStreamPredictsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamPredictsResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long currentPage;

	private Long pageSize;

	private String nextPageToken;

	private List<StreamPredict> streamPredicts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<StreamPredict> getStreamPredicts() {
		return this.streamPredicts;
	}

	public void setStreamPredicts(List<StreamPredict> streamPredicts) {
		this.streamPredicts = streamPredicts;
	}

	public static class StreamPredict {

		private String predictId;

		private String streamType;

		private String streamId;

		private String modelIds;

		private String probabilityThresholds;

		private String output;

		private String notify;

		private String userData;

		private String creationTime;

		private String status;

		public String getPredictId() {
			return this.predictId;
		}

		public void setPredictId(String predictId) {
			this.predictId = predictId;
		}

		public String getStreamType() {
			return this.streamType;
		}

		public void setStreamType(String streamType) {
			this.streamType = streamType;
		}

		public String getStreamId() {
			return this.streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}

		public String getModelIds() {
			return this.modelIds;
		}

		public void setModelIds(String modelIds) {
			this.modelIds = modelIds;
		}

		public String getProbabilityThresholds() {
			return this.probabilityThresholds;
		}

		public void setProbabilityThresholds(String probabilityThresholds) {
			this.probabilityThresholds = probabilityThresholds;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getNotify() {
			return this.notify;
		}

		public void setNotify(String notify) {
			this.notify = notify;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeStreamPredictsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamPredictsResponseUnmarshaller.unmarshall(this, context);
	}
}
