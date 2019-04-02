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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyReplicaModeRequest extends RpcAcsRequest<ModifyReplicaModeResponse> {
	
	public ModifyReplicaModeRequest() {
		super("Dds", "2015-12-01", "ModifyReplicaMode", "dds");
	}

	private String domainMode;

	private Long resourceOwnerId;

	private String primaryInstanceId;

	private String replicaMode;

	private String securityToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String replicaId;

	private Long ownerId;

	public String getDomainMode() {
		return this.domainMode;
	}

	public void setDomainMode(String domainMode) {
		this.domainMode = domainMode;
		if(domainMode != null){
			putQueryParameter("DomainMode", domainMode);
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

	public String getPrimaryInstanceId() {
		return this.primaryInstanceId;
	}

	public void setPrimaryInstanceId(String primaryInstanceId) {
		this.primaryInstanceId = primaryInstanceId;
		if(primaryInstanceId != null){
			putQueryParameter("PrimaryInstanceId", primaryInstanceId);
		}
	}

	public String getReplicaMode() {
		return this.replicaMode;
	}

	public void setReplicaMode(String replicaMode) {
		this.replicaMode = replicaMode;
		if(replicaMode != null){
			putQueryParameter("ReplicaMode", replicaMode);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
		if(replicaId != null){
			putQueryParameter("ReplicaId", replicaId);
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

	@Override
	public Class<ModifyReplicaModeResponse> getResponseClass() {
		return ModifyReplicaModeResponse.class;
	}

}
