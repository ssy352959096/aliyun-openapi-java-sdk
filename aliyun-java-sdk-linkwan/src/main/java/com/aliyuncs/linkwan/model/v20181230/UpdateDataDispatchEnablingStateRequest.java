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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataDispatchEnablingStateRequest extends RpcAcsRequest<UpdateDataDispatchEnablingStateResponse> {
	
	public UpdateDataDispatchEnablingStateRequest() {
		super("LinkWAN", "2018-12-30", "UpdateDataDispatchEnablingState", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String nodeGroupId;

	private Boolean dataDispatchEnabled;

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	public Boolean getDataDispatchEnabled() {
		return this.dataDispatchEnabled;
	}

	public void setDataDispatchEnabled(Boolean dataDispatchEnabled) {
		this.dataDispatchEnabled = dataDispatchEnabled;
		if(dataDispatchEnabled != null){
			putBodyParameter("DataDispatchEnabled", dataDispatchEnabled.toString());
		}
	}

	@Override
	public Class<UpdateDataDispatchEnablingStateResponse> getResponseClass() {
		return UpdateDataDispatchEnablingStateResponse.class;
	}

}
