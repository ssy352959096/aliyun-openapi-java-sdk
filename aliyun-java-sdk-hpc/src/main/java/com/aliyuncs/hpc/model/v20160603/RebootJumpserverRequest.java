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
public class RebootJumpserverRequest extends RpcAcsRequest<RebootJumpserverResponse> {
	
	public RebootJumpserverRequest() {
		super("HPC", "2016-06-03", "RebootJumpserver", "hpc");
		setMethod(MethodType.POST);
	}

	private String instanceId;

	private Integer force;

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

	public Integer getForce() {
		return this.force;
	}

	public void setForce(Integer force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
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
	public Class<RebootJumpserverResponse> getResponseClass() {
		return RebootJumpserverResponse.class;
	}

}
