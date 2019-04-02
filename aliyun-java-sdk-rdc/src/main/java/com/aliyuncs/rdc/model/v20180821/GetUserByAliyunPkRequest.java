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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetUserByAliyunPkRequest extends RpcAcsRequest<GetUserByAliyunPkResponse> {
	
	public GetUserByAliyunPkRequest() {
		super("Rdc", "2018-08-21", "GetUserByAliyunPk");
	}

	private String pk;

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	@Override
	public Class<GetUserByAliyunPkResponse> getResponseClass() {
		return GetUserByAliyunPkResponse.class;
	}

}
