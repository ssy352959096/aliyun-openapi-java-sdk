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
public class DescribeDomainInfoRequest extends RpcAcsRequest<DescribeDomainInfoResponse> {
	
	public DescribeDomainInfoRequest() {
		super("Alidns", "2015-01-09", "DescribeDomainInfo", "alidns");
	}

	private String userClientIp;

	private String domainName;

	private String lang;

	private Boolean needDetailAttributes;

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

	public Boolean getNeedDetailAttributes() {
		return this.needDetailAttributes;
	}

	public void setNeedDetailAttributes(Boolean needDetailAttributes) {
		this.needDetailAttributes = needDetailAttributes;
		if(needDetailAttributes != null){
			putQueryParameter("NeedDetailAttributes", needDetailAttributes.toString());
		}
	}

	@Override
	public Class<DescribeDomainInfoResponse> getResponseClass() {
		return DescribeDomainInfoResponse.class;
	}

}
