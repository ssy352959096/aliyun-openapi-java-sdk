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

package com.aliyuncs.ons.model.v20190214;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsTraceQueryByMsgKeyRequest extends RpcAcsRequest<OnsTraceQueryByMsgKeyResponse> {
	
	public OnsTraceQueryByMsgKeyRequest() {
		super("Ons", "2019-02-14", "OnsTraceQueryByMsgKey", "ons");
	}

	private Long preventCache;

	private String instanceId;

	private String topic;

	private Long endTime;

	private Long beginTime;

	private String msgKey;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
		if(msgKey != null){
			putQueryParameter("MsgKey", msgKey);
		}
	}

	@Override
	public Class<OnsTraceQueryByMsgKeyResponse> getResponseClass() {
		return OnsTraceQueryByMsgKeyResponse.class;
	}

}
