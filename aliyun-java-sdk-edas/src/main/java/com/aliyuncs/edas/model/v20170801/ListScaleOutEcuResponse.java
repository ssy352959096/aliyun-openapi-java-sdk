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
import com.aliyuncs.edas.transform.v20170801.ListScaleOutEcuResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScaleOutEcuResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<EcuInfo> ecuInfoList;

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

	public List<EcuInfo> getEcuInfoList() {
		return this.ecuInfoList;
	}

	public void setEcuInfoList(List<EcuInfo> ecuInfoList) {
		this.ecuInfoList = ecuInfoList;
	}

	public static class EcuInfo {

		private String ecuId;

		private Boolean online;

		private Boolean dockerEnv;

		private Long createTime;

		private Long updateTime;

		private String ipAddr;

		private Long heartbeatTime;

		private String userId;

		private String name;

		private String zoneId;

		private String regionId;

		private String instanceId;

		private String vpcId;

		private Integer availableCpu;

		private Integer availableMem;

		public String getEcuId() {
			return this.ecuId;
		}

		public void setEcuId(String ecuId) {
			this.ecuId = ecuId;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public Boolean getDockerEnv() {
			return this.dockerEnv;
		}

		public void setDockerEnv(Boolean dockerEnv) {
			this.dockerEnv = dockerEnv;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getIpAddr() {
			return this.ipAddr;
		}

		public void setIpAddr(String ipAddr) {
			this.ipAddr = ipAddr;
		}

		public Long getHeartbeatTime() {
			return this.heartbeatTime;
		}

		public void setHeartbeatTime(Long heartbeatTime) {
			this.heartbeatTime = heartbeatTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
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

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Integer getAvailableCpu() {
			return this.availableCpu;
		}

		public void setAvailableCpu(Integer availableCpu) {
			this.availableCpu = availableCpu;
		}

		public Integer getAvailableMem() {
			return this.availableMem;
		}

		public void setAvailableMem(Integer availableMem) {
			this.availableMem = availableMem;
		}
	}

	@Override
	public ListScaleOutEcuResponse getInstance(UnmarshallerContext context) {
		return	ListScaleOutEcuResponseUnmarshaller.unmarshall(this, context);
	}
}
