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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeviceBatchCreateRequest extends RpcAcsRequest<DeviceBatchCreateResponse> {
	
	public DeviceBatchCreateRequest() {
		super("cloudwf", "2017-03-28", "DeviceBatchCreate", "cloudwf");
	}

	private String sn;

	private Integer deviceType;

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
		if(sn != null){
			putQueryParameter("Sn", sn);
		}
	}

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType.toString());
		}
	}

	@Override
	public Class<DeviceBatchCreateResponse> getResponseClass() {
		return DeviceBatchCreateResponse.class;
	}

}
