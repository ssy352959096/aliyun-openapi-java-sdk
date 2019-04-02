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

package com.aliyuncs.cloudauth.model.v20180916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetVerifyTokenRequest extends RpcAcsRequest<GetVerifyTokenResponse> {
	
	public GetVerifyTokenRequest() {
		super("Cloudauth", "2018-09-16", "GetVerifyToken", "CloudAuth");
		setProtocol(ProtocolType.HTTPS);
	}

	private String userData;

	private Long resourceOwnerId;

	private String biz;

	private String sourceIp;

	private String binding;

	private String verifyConfigs;

	private String ticketId;

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putQueryParameter("Biz", biz);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getBinding() {
		return this.binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
		if(binding != null){
			putBodyParameter("Binding", binding);
		}
	}

	public String getVerifyConfigs() {
		return this.verifyConfigs;
	}

	public void setVerifyConfigs(String verifyConfigs) {
		this.verifyConfigs = verifyConfigs;
		if(verifyConfigs != null){
			putQueryParameter("VerifyConfigs", verifyConfigs);
		}
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putQueryParameter("TicketId", ticketId);
		}
	}

	@Override
	public Class<GetVerifyTokenResponse> getResponseClass() {
		return GetVerifyTokenResponse.class;
	}

}
