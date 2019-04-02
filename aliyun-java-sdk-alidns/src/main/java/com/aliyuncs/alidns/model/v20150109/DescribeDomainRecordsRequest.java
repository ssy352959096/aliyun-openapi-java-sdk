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
public class DescribeDomainRecordsRequest extends RpcAcsRequest<DescribeDomainRecordsResponse> {
	
	public DescribeDomainRecordsRequest() {
		super("Alidns", "2015-01-09", "DescribeDomainRecords", "alidns");
	}

	private String valueKeyWord;

	private Long groupId;

	private String domainName;

	private String orderBy;

	private Long pageNumber;

	private Long pageSize;

	private String searchMode;

	private String lang;

	private String keyWord;

	private String typeKeyWord;

	private String rRKeyWord;

	private String direction;

	public String getValueKeyWord() {
		return this.valueKeyWord;
	}

	public void setValueKeyWord(String valueKeyWord) {
		this.valueKeyWord = valueKeyWord;
		if(valueKeyWord != null){
			putQueryParameter("ValueKeyWord", valueKeyWord);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
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

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSearchMode() {
		return this.searchMode;
	}

	public void setSearchMode(String searchMode) {
		this.searchMode = searchMode;
		if(searchMode != null){
			putQueryParameter("SearchMode", searchMode);
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

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
		if(keyWord != null){
			putQueryParameter("KeyWord", keyWord);
		}
	}

	public String getTypeKeyWord() {
		return this.typeKeyWord;
	}

	public void setTypeKeyWord(String typeKeyWord) {
		this.typeKeyWord = typeKeyWord;
		if(typeKeyWord != null){
			putQueryParameter("TypeKeyWord", typeKeyWord);
		}
	}

	public String getRRKeyWord() {
		return this.rRKeyWord;
	}

	public void setRRKeyWord(String rRKeyWord) {
		this.rRKeyWord = rRKeyWord;
		if(rRKeyWord != null){
			putQueryParameter("RRKeyWord", rRKeyWord);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<DescribeDomainRecordsResponse> getResponseClass() {
		return DescribeDomainRecordsResponse.class;
	}

}
