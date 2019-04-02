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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreateLabNodeRequest extends RpcAcsRequest<CreateLabNodeResponse> {
	
	public CreateLabNodeRequest() {
		super("LinkWAN", "2018-12-30", "CreateLabNode", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String classMode;

	private String loraVersion;

	private Long freqBandPlanGroupId;

	private String name;

	public String getClassMode() {
		return this.classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
		if(classMode != null){
			putBodyParameter("ClassMode", classMode);
		}
	}

	public String getLoraVersion() {
		return this.loraVersion;
	}

	public void setLoraVersion(String loraVersion) {
		this.loraVersion = loraVersion;
		if(loraVersion != null){
			putBodyParameter("LoraVersion", loraVersion);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putBodyParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<CreateLabNodeResponse> getResponseClass() {
		return CreateLabNodeResponse.class;
	}

}
