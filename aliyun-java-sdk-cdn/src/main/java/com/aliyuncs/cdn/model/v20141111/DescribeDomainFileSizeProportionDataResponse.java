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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainFileSizeProportionDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainFileSizeProportionDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private List<UsageData> fileSizeProportionDataInterval;

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

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
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

	public List<UsageData> getFileSizeProportionDataInterval() {
		return this.fileSizeProportionDataInterval;
	}

	public void setFileSizeProportionDataInterval(List<UsageData> fileSizeProportionDataInterval) {
		this.fileSizeProportionDataInterval = fileSizeProportionDataInterval;
	}

	public static class UsageData {

		private String timeStamp;

		private List<FileSizeProportionData> value;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public List<FileSizeProportionData> getValue() {
			return this.value;
		}

		public void setValue(List<FileSizeProportionData> value) {
			this.value = value;
		}

		public static class FileSizeProportionData {

			private String fileSize;

			private String proportion;

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}

			public String getProportion() {
				return this.proportion;
			}

			public void setProportion(String proportion) {
				this.proportion = proportion;
			}
		}
	}

	@Override
	public DescribeDomainFileSizeProportionDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainFileSizeProportionDataResponseUnmarshaller.unmarshall(this, context);
	}
}
