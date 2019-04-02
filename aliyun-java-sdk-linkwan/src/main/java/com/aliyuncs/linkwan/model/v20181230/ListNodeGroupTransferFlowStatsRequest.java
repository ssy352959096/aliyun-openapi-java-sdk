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
public class ListNodeGroupTransferFlowStatsRequest extends RpcAcsRequest<ListNodeGroupTransferFlowStatsResponse> {
	
	public ListNodeGroupTransferFlowStatsRequest() {
		super("LinkWAN", "2018-12-30", "ListNodeGroupTransferFlowStats", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long endMillis;

	private Long beginMillis;

	private String nodeGroupId;

	private String timeIntervalUnit;

	public Long getEndMillis() {
		return this.endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
		if(endMillis != null){
			putBodyParameter("EndMillis", endMillis.toString());
		}
	}

	public Long getBeginMillis() {
		return this.beginMillis;
	}

	public void setBeginMillis(Long beginMillis) {
		this.beginMillis = beginMillis;
		if(beginMillis != null){
			putBodyParameter("BeginMillis", beginMillis.toString());
		}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	public String getTimeIntervalUnit() {
		return this.timeIntervalUnit;
	}

	public void setTimeIntervalUnit(String timeIntervalUnit) {
		this.timeIntervalUnit = timeIntervalUnit;
		if(timeIntervalUnit != null){
			putBodyParameter("TimeIntervalUnit", timeIntervalUnit);
		}
	}

	@Override
	public Class<ListNodeGroupTransferFlowStatsResponse> getResponseClass() {
		return ListNodeGroupTransferFlowStatsResponse.class;
	}

}
