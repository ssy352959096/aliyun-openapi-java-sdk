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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetDNSSLBStatusRequest extends RpcAcsRequest<SetDNSSLBStatusResponse> {
	
	public SetDNSSLBStatusRequest() {
		super("Alidns", "2015-01-09", "SetDNSSLBStatus", "alidns");
	}

	private String userClientIp;

	private String subDomain;

	private String lang;

	private Boolean open;

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
		if(subDomain != null){
			putQueryParameter("SubDomain", subDomain);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getOpen() {
		return this.open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
		if(open != null){
			putQueryParameter("Open", open.toString());
		}
	}

	@Override
	public Class<SetDNSSLBStatusResponse> getResponseClass() {
		return SetDNSSLBStatusResponse.class;
	}

}
