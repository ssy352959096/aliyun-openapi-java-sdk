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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetForwardSchemeConfigRequest extends RpcAcsRequest<SetForwardSchemeConfigResponse> {
	
	public SetForwardSchemeConfigRequest() {
		super("Cdn", "2014-11-11", "SetForwardSchemeConfig");
	}

	private String schemeOrigin;

	private String schemeOriginPort;

	private String securityToken;

	private String enable;

	private String domainName;

	private Long ownerId;

	public String getSchemeOrigin() {
		return this.schemeOrigin;
	}

	public void setSchemeOrigin(String schemeOrigin) {
		this.schemeOrigin = schemeOrigin;
		if(schemeOrigin != null){
			putQueryParameter("SchemeOrigin", schemeOrigin);
		}
	}

	public String getSchemeOriginPort() {
		return this.schemeOriginPort;
	}

	public void setSchemeOriginPort(String schemeOriginPort) {
		this.schemeOriginPort = schemeOriginPort;
		if(schemeOriginPort != null){
			putQueryParameter("SchemeOriginPort", schemeOriginPort);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<SetForwardSchemeConfigResponse> getResponseClass() {
		return SetForwardSchemeConfigResponse.class;
	}

}
