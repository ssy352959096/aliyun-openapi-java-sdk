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

/**
 * @author auto create
 * @version 
 */
public class DeleteSynchronizationJobRequest extends RpcAcsRequest<DeleteSynchronizationJobResponse> {
	
	public DeleteSynchronizationJobRequest() {
		super("Dts", "2018-08-01", "DeleteSynchronizationJob", "dts");
	}

	private String synchronizationJobId;

	private String ownerId;

	public String getSynchronizationJobId() {
		return this.synchronizationJobId;
	}

	public void setSynchronizationJobId(String synchronizationJobId) {
		this.synchronizationJobId = synchronizationJobId;
		if(synchronizationJobId != null){
			putQueryParameter("SynchronizationJobId", synchronizationJobId);
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

	@Override
	public Class<DeleteSynchronizationJobResponse> getResponseClass() {
		return DeleteSynchronizationJobResponse.class;
	}

}
