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
import com.aliyuncs.edas.transform.v20170801.ListSlbResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlbResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<SlbEntity> slbList;

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

	public List<SlbEntity> getSlbList() {
		return this.slbList;
	}

	public void setSlbList(List<SlbEntity> slbList) {
		this.slbList = slbList;
	}

	public static class SlbEntity {

		private String slbId;

		private String slbName;

		private String regionId;

		private String userId;

		private String address;

		private String slbStatus;

		private String addressType;

		private String vswitchId;

		private String vpcId;

		private String networkType;

		private Integer groupId;

		private Boolean expired;

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSlbName() {
			return this.slbName;
		}

		public void setSlbName(String slbName) {
			this.slbName = slbName;
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

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSlbStatus() {
			return this.slbStatus;
		}

		public void setSlbStatus(String slbStatus) {
			this.slbStatus = slbStatus;
		}

		public String getAddressType() {
			return this.addressType;
		}

		public void setAddressType(String addressType) {
			this.addressType = addressType;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}
	}

	@Override
	public ListSlbResponse getInstance(UnmarshallerContext context) {
		return	ListSlbResponseUnmarshaller.unmarshall(this, context);
	}
}
