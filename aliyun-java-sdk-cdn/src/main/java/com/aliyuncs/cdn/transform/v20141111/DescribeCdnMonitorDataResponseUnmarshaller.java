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

import com.aliyuncs.cdn.model.v20141111.DescribeCdnMonitorDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnMonitorDataResponse.CDNMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnMonitorDataResponseUnmarshaller {

	public static DescribeCdnMonitorDataResponse unmarshall(DescribeCdnMonitorDataResponse describeCdnMonitorDataResponse, UnmarshallerContext context) {
		
		describeCdnMonitorDataResponse.setRequestId(context.stringValue("DescribeCdnMonitorDataResponse.RequestId"));
		describeCdnMonitorDataResponse.setDomainName(context.stringValue("DescribeCdnMonitorDataResponse.DomainName"));
		describeCdnMonitorDataResponse.setStartTime(context.stringValue("DescribeCdnMonitorDataResponse.StartTime"));
		describeCdnMonitorDataResponse.setEndTime(context.stringValue("DescribeCdnMonitorDataResponse.EndTime"));
		describeCdnMonitorDataResponse.setMonitorInterval(context.stringValue("DescribeCdnMonitorDataResponse.MonitorInterval"));

		List<CDNMonitorData> monitorDatas = new ArrayList<CDNMonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeCdnMonitorDataResponse.MonitorDatas.Length"); i++) {
			CDNMonitorData cDNMonitorData = new CDNMonitorData();
			cDNMonitorData.setTimeStamp(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].TimeStamp"));
			cDNMonitorData.setBytesPerSecond(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].BytesPerSecond"));
			cDNMonitorData.setQueryPerSecond(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].QueryPerSecond"));
			cDNMonitorData.setRequestHitRate(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].RequestHitRate"));
			cDNMonitorData.setBytesHitRate(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].BytesHitRate"));
			cDNMonitorData.setAverageObjectSize(context.stringValue("DescribeCdnMonitorDataResponse.MonitorDatas["+ i +"].AverageObjectSize"));

			monitorDatas.add(cDNMonitorData);
		}
		describeCdnMonitorDataResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeCdnMonitorDataResponse;
	}
}