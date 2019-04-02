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

package com.aliyuncs.hpc.model.v20160603;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	
	public DescribeInstancesRequest() {
		super("HPC", "2016-06-03", "DescribeInstances", "hpc");
		setMethod(MethodType.POST);
	}

	private String instanceId;

	private String instanceType;

	private String tOKEN;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getTOKEN() {
		return this.tOKEN;
	}

	public void setTOKEN(String tOKEN) {
		this.tOKEN = tOKEN;
		if(tOKEN != null){
			putQueryParameter("TOKEN", tOKEN);
		}
	}

	@Override
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
