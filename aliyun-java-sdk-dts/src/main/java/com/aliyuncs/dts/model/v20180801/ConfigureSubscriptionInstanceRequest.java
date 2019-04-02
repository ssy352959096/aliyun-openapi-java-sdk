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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConfigureSubscriptionInstanceRequest extends RpcAcsRequest<ConfigureSubscriptionInstanceResponse> {
	
	public ConfigureSubscriptionInstanceRequest() {
		super("Dts", "2018-08-01", "ConfigureSubscriptionInstance", "dts");
		setMethod(MethodType.POST);
	}

	private String sourceEndpointInstanceID;

	private String sourceEndpointOwnerID;

	private String sourceEndpointPassword;

	private Boolean subscriptionDataTypeDML;

	private String subscriptionObject;

	private String subscriptionInstanceName;

	private String sourceEndpointUserName;

	private String subscriptionInstanceId;

	private String sourceEndpointRole;

	private String ownerId;

	private String sourceEndpointInstanceType;

	private Boolean subscriptionDataTypeDDL;

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpoint.InstanceID", sourceEndpointInstanceID);
		}
	}

	public String getSourceEndpointOwnerID() {
		return this.sourceEndpointOwnerID;
	}

	public void setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
		this.sourceEndpointOwnerID = sourceEndpointOwnerID;
		if(sourceEndpointOwnerID != null){
			putQueryParameter("SourceEndpoint.OwnerID", sourceEndpointOwnerID);
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpoint.Password", sourceEndpointPassword);
		}
	}

	public Boolean getSubscriptionDataTypeDML() {
		return this.subscriptionDataTypeDML;
	}

	public void setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
		this.subscriptionDataTypeDML = subscriptionDataTypeDML;
		if(subscriptionDataTypeDML != null){
			putQueryParameter("SubscriptionDataType.DML", subscriptionDataTypeDML.toString());
		}
	}

	public String getSubscriptionObject() {
		return this.subscriptionObject;
	}

	public void setSubscriptionObject(String subscriptionObject) {
		this.subscriptionObject = subscriptionObject;
		if(subscriptionObject != null){
			putQueryParameter("SubscriptionObject", subscriptionObject);
		}
	}

	public String getSubscriptionInstanceName() {
		return this.subscriptionInstanceName;
	}

	public void setSubscriptionInstanceName(String subscriptionInstanceName) {
		this.subscriptionInstanceName = subscriptionInstanceName;
		if(subscriptionInstanceName != null){
			putQueryParameter("SubscriptionInstanceName", subscriptionInstanceName);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpoint.UserName", sourceEndpointUserName);
		}
	}

	public String getSubscriptionInstanceId() {
		return this.subscriptionInstanceId;
	}

	public void setSubscriptionInstanceId(String subscriptionInstanceId) {
		this.subscriptionInstanceId = subscriptionInstanceId;
		if(subscriptionInstanceId != null){
			putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
		}
	}

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpoint.Role", sourceEndpointRole);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpoint.InstanceType", sourceEndpointInstanceType);
		}
	}

	public Boolean getSubscriptionDataTypeDDL() {
		return this.subscriptionDataTypeDDL;
	}

	public void setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
		this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
		if(subscriptionDataTypeDDL != null){
			putQueryParameter("SubscriptionDataType.DDL", subscriptionDataTypeDDL.toString());
		}
	}

	@Override
	public Class<ConfigureSubscriptionInstanceResponse> getResponseClass() {
		return ConfigureSubscriptionInstanceResponse.class;
	}

}
