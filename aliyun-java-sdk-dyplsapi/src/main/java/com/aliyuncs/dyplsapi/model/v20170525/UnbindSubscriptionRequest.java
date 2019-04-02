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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UnbindSubscriptionRequest extends RpcAcsRequest<UnbindSubscriptionResponse> {
	
	public UnbindSubscriptionRequest() {
		super("Dyplsapi", "2017-05-25", "UnbindSubscription", "dyplsapi");
	}

	private String poolKey;

	private Long resourceOwnerId;

	private String subsId;

	private String secretNo;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String productType;

	public String getPoolKey() {
		return this.poolKey;
	}

	public void setPoolKey(String poolKey) {
		this.poolKey = poolKey;
		if(poolKey != null){
			putQueryParameter("PoolKey", poolKey);
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

	public String getSubsId() {
		return this.subsId;
	}

	public void setSubsId(String subsId) {
		this.subsId = subsId;
		if(subsId != null){
			putQueryParameter("SubsId", subsId);
		}
	}

	public String getSecretNo() {
		return this.secretNo;
	}

	public void setSecretNo(String secretNo) {
		this.secretNo = secretNo;
		if(secretNo != null){
			putQueryParameter("SecretNo", secretNo);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	@Override
	public Class<UnbindSubscriptionResponse> getResponseClass() {
		return UnbindSubscriptionResponse.class;
	}

}
