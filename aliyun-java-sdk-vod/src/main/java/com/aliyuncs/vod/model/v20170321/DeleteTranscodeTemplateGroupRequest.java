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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteTranscodeTemplateGroupRequest extends RpcAcsRequest<DeleteTranscodeTemplateGroupResponse> {
	
	public DeleteTranscodeTemplateGroupRequest() {
		super("vod", "2017-03-21", "DeleteTranscodeTemplateGroup", "vod");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String transcodeTemplateIds;

	private Long ownerId;

	private String transcodeTemplateGroupId;

	private String forceDelGroup;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getTranscodeTemplateIds() {
		return this.transcodeTemplateIds;
	}

	public void setTranscodeTemplateIds(String transcodeTemplateIds) {
		this.transcodeTemplateIds = transcodeTemplateIds;
		if(transcodeTemplateIds != null){
			putQueryParameter("TranscodeTemplateIds", transcodeTemplateIds);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTranscodeTemplateGroupId() {
		return this.transcodeTemplateGroupId;
	}

	public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
		this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		if(transcodeTemplateGroupId != null){
			putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
		}
	}

	public String getForceDelGroup() {
		return this.forceDelGroup;
	}

	public void setForceDelGroup(String forceDelGroup) {
		this.forceDelGroup = forceDelGroup;
		if(forceDelGroup != null){
			putQueryParameter("ForceDelGroup", forceDelGroup);
		}
	}

	@Override
	public Class<DeleteTranscodeTemplateGroupResponse> getResponseClass() {
		return DeleteTranscodeTemplateGroupResponse.class;
	}

}
