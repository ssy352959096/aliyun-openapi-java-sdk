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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainRealTimeReqHitRateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainRealTimeReqHitRateDataResponse extends AcsResponse {

	private String requestId;

	private List<ReqHitRateDataModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ReqHitRateDataModel> getData() {
		return this.data;
	}

	public void setData(List<ReqHitRateDataModel> data) {
		this.data = data;
	}

	public static class ReqHitRateDataModel {

		private Float reqHitRate;

		private String timeStamp;

		public Float getReqHitRate() {
			return this.reqHitRate;
		}

		public void setReqHitRate(Float reqHitRate) {
			this.reqHitRate = reqHitRate;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDomainRealTimeReqHitRateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainRealTimeReqHitRateDataResponseUnmarshaller.unmarshall(this, context);
	}
}
