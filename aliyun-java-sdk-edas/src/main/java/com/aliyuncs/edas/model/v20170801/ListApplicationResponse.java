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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Application> applicationList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Application> getApplicationList() {
		return this.applicationList;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}

	public static class Application {

		private String appId;

		private String name;

		private String regionId;

		private String description;

		private String owner;

		private Integer instanceCount;

		private Integer runningInstanceCount;

		private Integer port;

		private String userId;

		private String slbId;

		private String slbIp;

		private Integer slbPort;

		private String extSlbId;

		private String extSlbIp;

		private String applicationType;

		private Integer clusterType;

		private String clusterId;

		private Boolean dockerize;

		private Integer cpu;

		private Integer memory;

		private String healthCheckUrl;

		private Long buildPackageId;

		private Long createTime;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getRunningInstanceCount() {
			return this.runningInstanceCount;
		}

		public void setRunningInstanceCount(Integer runningInstanceCount) {
			this.runningInstanceCount = runningInstanceCount;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public Integer getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(Integer slbPort) {
			this.slbPort = slbPort;
		}

		public String getExtSlbId() {
			return this.extSlbId;
		}

		public void setExtSlbId(String extSlbId) {
			this.extSlbId = extSlbId;
		}

		public String getExtSlbIp() {
			return this.extSlbIp;
		}

		public void setExtSlbIp(String extSlbIp) {
			this.extSlbIp = extSlbIp;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getDockerize() {
			return this.dockerize;
		}

		public void setDockerize(Boolean dockerize) {
			this.dockerize = dockerize;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getHealthCheckUrl() {
			return this.healthCheckUrl;
		}

		public void setHealthCheckUrl(String healthCheckUrl) {
			this.healthCheckUrl = healthCheckUrl;
		}

		public Long getBuildPackageId() {
			return this.buildPackageId;
		}

		public void setBuildPackageId(Long buildPackageId) {
			this.buildPackageId = buildPackageId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListApplicationResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
