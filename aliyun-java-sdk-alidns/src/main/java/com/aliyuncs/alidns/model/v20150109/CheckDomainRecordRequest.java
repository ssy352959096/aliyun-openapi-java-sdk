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
public class CheckDomainRecordRequest extends RpcAcsRequest<CheckDomainRecordResponse> {
	
	public CheckDomainRecordRequest() {
		super("Alidns", "2015-01-09", "CheckDomainRecord", "alidns");
	}

	private String rR;

	private String userClientIp;

	private String domainName;

	private String lang;

	private String type;

	private String value;

	public String getRR() {
		return this.rR;
	}

	public void setRR(String rR) {
		this.rR = rR;
		if(rR != null){
			putQueryParameter("RR", rR);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	@Override
	public Class<CheckDomainRecordResponse> getResponseClass() {
		return CheckDomainRecordResponse.class;
	}

}
