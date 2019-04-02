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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveTaskRequest extends RpcAcsRequest<SaveTaskResponse> {
	
	public SaveTaskRequest() {
		super("Trademark", "2018-07-24", "SaveTask", "trademark");
	}

	private String bizType;

	private String request;

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
		if(request != null){
			putQueryParameter("Request", request);
		}
	}

	@Override
	public Class<SaveTaskResponse> getResponseClass() {
		return SaveTaskResponse.class;
	}

}
