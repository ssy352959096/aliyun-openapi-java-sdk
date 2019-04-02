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
public class QueryTrademarkMonitorRulesRequest extends RpcAcsRequest<QueryTrademarkMonitorRulesResponse> {
	
	public QueryTrademarkMonitorRulesRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkMonitorRules", "trademark");
	}

	private Integer notifyUpdate;

	private Integer pageSize;

	private String ruleName;

	private String id;

	private Integer pageNum;

	public Integer getNotifyUpdate() {
		return this.notifyUpdate;
	}

	public void setNotifyUpdate(Integer notifyUpdate) {
		this.notifyUpdate = notifyUpdate;
		if(notifyUpdate != null){
			putQueryParameter("NotifyUpdate", notifyUpdate.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	@Override
	public Class<QueryTrademarkMonitorRulesResponse> getResponseClass() {
		return QueryTrademarkMonitorRulesResponse.class;
	}

}
