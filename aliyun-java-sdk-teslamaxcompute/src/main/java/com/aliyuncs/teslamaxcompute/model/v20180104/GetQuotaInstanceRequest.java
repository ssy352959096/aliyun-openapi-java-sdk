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

package com.aliyuncs.teslamaxcompute.model.v20180104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaInstanceRequest extends RpcAcsRequest<GetQuotaInstanceResponse> {
	
	public GetQuotaInstanceRequest() {
		super("TeslaMaxCompute", "2018-01-04", "GetQuotaInstance", "teslamaxcompute");
	}

	private String cluster;

	private Integer pageSize;

	private String quotaId;

	private Integer pageNum;

	private String region;

	private String quotaName;

	private String status;

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getQuotaId() {
		return this.quotaId;
	}

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
		if(quotaId != null){
			putQueryParameter("QuotaId", quotaId);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getQuotaName() {
		return this.quotaName;
	}

	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
		if(quotaName != null){
			putQueryParameter("QuotaName", quotaName);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<GetQuotaInstanceResponse> getResponseClass() {
		return GetQuotaInstanceResponse.class;
	}

}
