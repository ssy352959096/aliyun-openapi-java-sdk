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

package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ShieldRequest extends RpcAcsRequest<ShieldResponse> {
	
	public ShieldRequest() {
		super("jaq", "2016-04-12", "Shield", "jaq");
	}

	private String channel;

	private String appInfo;

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
		if(appInfo != null){
			putQueryParameter("AppInfo", appInfo);
		}
	}

	@Override
	public Class<ShieldResponse> getResponseClass() {
		return ShieldResponse.class;
	}

}
