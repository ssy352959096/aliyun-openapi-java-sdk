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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetMapUrlRequest extends RpcAcsRequest<GetMapUrlResponse> {
	
	public GetMapUrlRequest() {
		super("cloudwf", "2017-03-28", "GetMapUrl", "cloudwf");
	}

	private Long mapId;

	public Long getMapId() {
		return this.mapId;
	}

	public void setMapId(Long mapId) {
		this.mapId = mapId;
		if(mapId != null){
			putQueryParameter("MapId", mapId.toString());
		}
	}

	@Override
	public Class<GetMapUrlResponse> getResponseClass() {
		return GetMapUrlResponse.class;
	}

}
