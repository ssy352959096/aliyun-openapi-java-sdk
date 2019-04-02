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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainTopUrlVisitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainTopUrlVisitResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private List<UrlList> allUrlList;

	private List<UrlList> url200List;

	private List<UrlList> url300List;

	private List<UrlList> url400List;

	private List<UrlList> url500List;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<UrlList> getAllUrlList() {
		return this.allUrlList;
	}

	public void setAllUrlList(List<UrlList> allUrlList) {
		this.allUrlList = allUrlList;
	}

	public List<UrlList> getUrl200List() {
		return this.url200List;
	}

	public void setUrl200List(List<UrlList> url200List) {
		this.url200List = url200List;
	}

	public List<UrlList> getUrl300List() {
		return this.url300List;
	}

	public void setUrl300List(List<UrlList> url300List) {
		this.url300List = url300List;
	}

	public List<UrlList> getUrl400List() {
		return this.url400List;
	}

	public void setUrl400List(List<UrlList> url400List) {
		this.url400List = url400List;
	}

	public List<UrlList> getUrl500List() {
		return this.url500List;
	}

	public void setUrl500List(List<UrlList> url500List) {
		this.url500List = url500List;
	}

	public static class UrlList {

		private String urlDetail;

		private String visitData;

		private Float visitProportion;

		private String flow;

		private Float flowProportion;

		public String getUrlDetail() {
			return this.urlDetail;
		}

		public void setUrlDetail(String urlDetail) {
			this.urlDetail = urlDetail;
		}

		public String getVisitData() {
			return this.visitData;
		}

		public void setVisitData(String visitData) {
			this.visitData = visitData;
		}

		public Float getVisitProportion() {
			return this.visitProportion;
		}

		public void setVisitProportion(Float visitProportion) {
			this.visitProportion = visitProportion;
		}

		public String getFlow() {
			return this.flow;
		}

		public void setFlow(String flow) {
			this.flow = flow;
		}

		public Float getFlowProportion() {
			return this.flowProportion;
		}

		public void setFlowProportion(Float flowProportion) {
			this.flowProportion = flowProportion;
		}
	}

	@Override
	public DescribeDcdnDomainTopUrlVisitResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainTopUrlVisitResponseUnmarshaller.unmarshall(this, context);
	}
}
