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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyRouteEntryRequest extends RpcAcsRequest<ModifyRouteEntryResponse> {
	
	public ModifyRouteEntryRequest() {
		super("Vpc", "2016-04-28", "ModifyRouteEntry", "vpc");
	}

	private String routeEntryName;

	private String routeEntryId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	public String getRouteEntryName() {
		return this.routeEntryName;
	}

	public void setRouteEntryName(String routeEntryName) {
		this.routeEntryName = routeEntryName;
		if(routeEntryName != null){
			putQueryParameter("RouteEntryName", routeEntryName);
		}
	}

	public String getRouteEntryId() {
		return this.routeEntryId;
	}

	public void setRouteEntryId(String routeEntryId) {
		this.routeEntryId = routeEntryId;
		if(routeEntryId != null){
			putQueryParameter("RouteEntryId", routeEntryId);
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
	public Class<ModifyRouteEntryResponse> getResponseClass() {
		return ModifyRouteEntryResponse.class;
	}

}
