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
public class CreateUidWhiteListGroupRequest extends RpcAcsRequest<CreateUidWhiteListGroupResponse> {
	
	public CreateUidWhiteListGroupRequest() {
		super("jarvis", "2018-02-06", "CreateUidWhiteListGroup", "jarvis");
	}

	private String note;

	private Long resourceOwnerId;

	private String sourceIp;

	private Integer dstPort;

	private String instanceIdList;

	private Integer liveTime;

	private String productName;

	private Integer whiteListType;

	private String lang;

	private String srcUid;

	private String sourceCode;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Integer getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(Integer dstPort) {
		this.dstPort = dstPort;
		if(dstPort != null){
			putQueryParameter("DstPort", dstPort.toString());
		}
	}

	public String getInstanceIdList() {
		return this.instanceIdList;
	}

	public void setInstanceIdList(String instanceIdList) {
		this.instanceIdList = instanceIdList;
		if(instanceIdList != null){
			putQueryParameter("InstanceIdList", instanceIdList);
		}
	}

	public Integer getLiveTime() {
		return this.liveTime;
	}

	public void setLiveTime(Integer liveTime) {
		this.liveTime = liveTime;
		if(liveTime != null){
			putQueryParameter("LiveTime", liveTime.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getSrcUid() {
		return this.srcUid;
	}

	public void setSrcUid(String srcUid) {
		this.srcUid = srcUid;
		if(srcUid != null){
			putQueryParameter("SrcUid", srcUid);
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
	public Class<CreateUidWhiteListGroupResponse> getResponseClass() {
		return CreateUidWhiteListGroupResponse.class;
	}

}
