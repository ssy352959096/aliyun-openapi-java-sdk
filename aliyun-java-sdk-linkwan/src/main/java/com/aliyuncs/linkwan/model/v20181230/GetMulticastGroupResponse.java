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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetMulticastGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMulticastGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String mcAddress;

		private String classMode;

		private Float frequency;

		private Integer dataRate;

		private Integer periodicity;

		private String loraVersion;

		public String getMcAddress() {
			return this.mcAddress;
		}

		public void setMcAddress(String mcAddress) {
			this.mcAddress = mcAddress;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}

		public Float getFrequency() {
			return this.frequency;
		}

		public void setFrequency(Float frequency) {
			this.frequency = frequency;
		}

		public Integer getDataRate() {
			return this.dataRate;
		}

		public void setDataRate(Integer dataRate) {
			this.dataRate = dataRate;
		}

		public Integer getPeriodicity() {
			return this.periodicity;
		}

		public void setPeriodicity(Integer periodicity) {
			this.periodicity = periodicity;
		}

		public String getLoraVersion() {
			return this.loraVersion;
		}

		public void setLoraVersion(String loraVersion) {
			this.loraVersion = loraVersion;
		}
	}

	@Override
	public GetMulticastGroupResponse getInstance(UnmarshallerContext context) {
		return	GetMulticastGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
