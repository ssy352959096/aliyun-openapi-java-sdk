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

package com.aliyuncs.actiontrail.model.v20171204;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20171204.DescribeTrailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrailsResponse extends AcsResponse {

	private String requestId;

	private List<TrailListItem> trailList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrailListItem> getTrailList() {
		return this.trailList;
	}

	public void setTrailList(List<TrailListItem> trailList) {
		this.trailList = trailList;
	}

	public static class TrailListItem {

		private String name;

		private String homeRegion;

		private String roleName;

		private String status;

		private String includeGlobalServiceEvent;

		private String ossBucketName;

		private String ossKeyPrefix;

		private String region;

		private String eventRW;

		private String type;

		private String slsWriteRoleArn;

		private String slsProjectArn;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHomeRegion() {
			return this.homeRegion;
		}

		public void setHomeRegion(String homeRegion) {
			this.homeRegion = homeRegion;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIncludeGlobalServiceEvent() {
			return this.includeGlobalServiceEvent;
		}

		public void setIncludeGlobalServiceEvent(String includeGlobalServiceEvent) {
			this.includeGlobalServiceEvent = includeGlobalServiceEvent;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssKeyPrefix() {
			return this.ossKeyPrefix;
		}

		public void setOssKeyPrefix(String ossKeyPrefix) {
			this.ossKeyPrefix = ossKeyPrefix;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getEventRW() {
			return this.eventRW;
		}

		public void setEventRW(String eventRW) {
			this.eventRW = eventRW;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSlsWriteRoleArn() {
			return this.slsWriteRoleArn;
		}

		public void setSlsWriteRoleArn(String slsWriteRoleArn) {
			this.slsWriteRoleArn = slsWriteRoleArn;
		}

		public String getSlsProjectArn() {
			return this.slsProjectArn;
		}

		public void setSlsProjectArn(String slsProjectArn) {
			this.slsProjectArn = slsProjectArn;
		}
	}

	@Override
	public DescribeTrailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
