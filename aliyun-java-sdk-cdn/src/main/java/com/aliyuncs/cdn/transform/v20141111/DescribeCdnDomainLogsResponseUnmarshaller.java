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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainLogsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainLogsResponse.DomainLogModel;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainLogsResponseUnmarshaller {

	public static DescribeCdnDomainLogsResponse unmarshall(DescribeCdnDomainLogsResponse describeCdnDomainLogsResponse, UnmarshallerContext context) {
		
		describeCdnDomainLogsResponse.setRequestId(context.stringValue("DescribeCdnDomainLogsResponse.RequestId"));
		describeCdnDomainLogsResponse.setPageNumber(context.longValue("DescribeCdnDomainLogsResponse.PageNumber"));
		describeCdnDomainLogsResponse.setPageSize(context.longValue("DescribeCdnDomainLogsResponse.PageSize"));
		describeCdnDomainLogsResponse.setTotalCount(context.longValue("DescribeCdnDomainLogsResponse.TotalCount"));

		DomainLogModel domainLogModel = new DomainLogModel();
		domainLogModel.setDomainName(context.stringValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogName(context.stringValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails["+ i +"].LogName"));
			domainLogDetail.setLogPath(context.stringValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails["+ i +"].LogPath"));
			domainLogDetail.setLogSize(context.longValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails["+ i +"].LogSize"));
			domainLogDetail.setStartTime(context.stringValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails["+ i +"].StartTime"));
			domainLogDetail.setEndTime(context.stringValue("DescribeCdnDomainLogsResponse.DomainLogModel.DomainLogDetails["+ i +"].EndTime"));

			domainLogDetails.add(domainLogDetail);
		}
		domainLogModel.setDomainLogDetails(domainLogDetails);
		describeCdnDomainLogsResponse.setDomainLogModel(domainLogModel);
	 
	 	return describeCdnDomainLogsResponse;
	}
}