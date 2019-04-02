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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainOriginTrafficDataRequest extends RpcAcsRequest<DescribeDcdnDomainOriginTrafficDataResponse> {
	
	public DescribeDcdnDomainOriginTrafficDataRequest() {
		super("dcdn", "2018-01-15", "DescribeDcdnDomainOriginTrafficData");
	}

	private String startTime;

	private String fixTimeGap;

	private String timeMerge;

	private String domainName;

	private String endTime;

	private Long ownerId;

	private String interval;

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getFixTimeGap() {
		return this.fixTimeGap;
	}

	public void setFixTimeGap(String fixTimeGap) {
		this.fixTimeGap = fixTimeGap;
		if(fixTimeGap != null){
			putQueryParameter("FixTimeGap", fixTimeGap);
		}
	}

	public String getTimeMerge() {
		return this.timeMerge;
	}

	public void setTimeMerge(String timeMerge) {
		this.timeMerge = timeMerge;
		if(timeMerge != null){
			putQueryParameter("TimeMerge", timeMerge);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	@Override
	public Class<DescribeDcdnDomainOriginTrafficDataResponse> getResponseClass() {
		return DescribeDcdnDomainOriginTrafficDataResponse.class;
	}

}
