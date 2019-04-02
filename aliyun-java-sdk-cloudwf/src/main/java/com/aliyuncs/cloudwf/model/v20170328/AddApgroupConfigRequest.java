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
public class AddApgroupConfigRequest extends RpcAcsRequest<AddApgroupConfigResponse> {
	
	public AddApgroupConfigRequest() {
		super("cloudwf", "2017-03-28", "AddApgroupConfig", "cloudwf");
	}

	private Long parentApgroupId;

	private String name;

	private String description;

	public Long getParentApgroupId() {
		return this.parentApgroupId;
	}

	public void setParentApgroupId(Long parentApgroupId) {
		this.parentApgroupId = parentApgroupId;
		if(parentApgroupId != null){
			putQueryParameter("ParentApgroupId", parentApgroupId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	@Override
	public Class<AddApgroupConfigResponse> getResponseClass() {
		return AddApgroupConfigResponse.class;
	}

}
