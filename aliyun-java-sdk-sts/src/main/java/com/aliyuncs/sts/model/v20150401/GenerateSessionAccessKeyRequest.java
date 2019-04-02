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

package com.aliyuncs.sts.model.v20150401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GenerateSessionAccessKeyRequest extends RpcAcsRequest<GenerateSessionAccessKeyResponse> {
	
	public GenerateSessionAccessKeyRequest() {
		super("Sts", "2015-04-01", "GenerateSessionAccessKey", "sts");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long durationSeconds;

	public Long getDurationSeconds() {
		return this.durationSeconds;
	}

	public void setDurationSeconds(Long durationSeconds) {
		this.durationSeconds = durationSeconds;
		if(durationSeconds != null){
			putQueryParameter("DurationSeconds", durationSeconds.toString());
		}
	}

	@Override
	public Class<GenerateSessionAccessKeyResponse> getResponseClass() {
		return GenerateSessionAccessKeyResponse.class;
	}

}
