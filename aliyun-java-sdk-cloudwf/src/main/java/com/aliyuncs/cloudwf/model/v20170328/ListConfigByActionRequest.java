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
public class ListConfigByActionRequest extends RpcAcsRequest<ListConfigByActionResponse> {
	
	public ListConfigByActionRequest() {
		super("cloudwf", "2017-03-28", "ListConfigByAction", "cloudwf");
	}

	private String searchName;

	private Integer limit;

	private String actionName;

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putQueryParameter("SearchName", searchName);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getBizActionName() {
		return this.actionName;
	}

	public void setBizActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putQueryParameter("ActionName", actionName);
		}
	}

	/**
	 * @deprecated use getBizActionName instead of this.
	 */
	@Deprecated
	public String getActionName() {
		return this.actionName;
	}

	/**
	 * @deprecated use setBizActionName instead of this.
	 */
	@Deprecated
	public void setActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putQueryParameter("ActionName", actionName);
		}
	}

	@Override
	public Class<ListConfigByActionResponse> getResponseClass() {
		return ListConfigByActionResponse.class;
	}

}
