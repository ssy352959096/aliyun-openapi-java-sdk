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

package com.aliyuncs.jarvis.model.v20180206;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessWhiteListGroupRequest extends RpcAcsRequest<DescribeAccessWhiteListGroupResponse> {
	
	public DescribeAccessWhiteListGroupRequest() {
		super("jarvis", "2018-02-06", "DescribeAccessWhiteListGroup", "jarvis");
	}

	private String srcIP;

	private String sourceIp;

	private Integer pageSize;

	private String queryProduct;

	private Integer currentPage;

	private Integer whiteListType;

	private String dstIP;

	private String lang;

	private String status;

	private String sourceCode;

	public String getSrcIP() {
		return this.srcIP;
	}

	public void setSrcIP(String srcIP) {
		this.srcIP = srcIP;
		if(srcIP != null){
			putQueryParameter("SrcIP", srcIP);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public String getQueryProduct() {
		return this.queryProduct;
	}

	public void setQueryProduct(String queryProduct) {
		this.queryProduct = queryProduct;
		if(queryProduct != null){
			putQueryParameter("queryProduct", queryProduct);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getWhiteListType() {
		return this.whiteListType;
	}

	public void setWhiteListType(Integer whiteListType) {
		this.whiteListType = whiteListType;
		if(whiteListType != null){
			putQueryParameter("WhiteListType", whiteListType.toString());
		}
	}

	public String getDstIP() {
		return this.dstIP;
	}

	public void setDstIP(String dstIP) {
		this.dstIP = dstIP;
		if(dstIP != null){
			putQueryParameter("DstIP", dstIP);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
		if(sourceCode != null){
			putQueryParameter("SourceCode", sourceCode);
		}
	}

	@Override
	public Class<DescribeAccessWhiteListGroupResponse> getResponseClass() {
		return DescribeAccessWhiteListGroupResponse.class;
	}

}
