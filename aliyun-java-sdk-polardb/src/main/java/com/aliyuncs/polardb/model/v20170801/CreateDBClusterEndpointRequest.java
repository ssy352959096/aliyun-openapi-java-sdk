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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDBClusterEndpointRequest extends RpcAcsRequest<CreateDBClusterEndpointResponse> {
	
	public CreateDBClusterEndpointRequest() {
		super("polardb", "2017-08-01", "CreateDBClusterEndpoint", "polardb");
	}

	private Long resourceOwnerId;

	private String nodes;

	private String resourceOwnerAccount;

	private String endpointType;

	private String clientToken;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getNodes() {
		return this.nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
		if(nodes != null){
			putQueryParameter("Nodes", nodes);
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

	public String getBizEndpointType() {
		return this.endpointType;
	}

	public void setBizEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("EndpointType", endpointType);
		}
	}

	/**
	 * @deprecated use getBizEndpointType instead of this.
	 */
	@Deprecated
	public String getEndpointType() {
		return this.endpointType;
	}

	/**
	 * @deprecated use setBizEndpointType instead of this.
	 */
	@Deprecated
	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("EndpointType", endpointType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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
	public Class<CreateDBClusterEndpointResponse> getResponseClass() {
		return CreateDBClusterEndpointResponse.class;
	}

}
