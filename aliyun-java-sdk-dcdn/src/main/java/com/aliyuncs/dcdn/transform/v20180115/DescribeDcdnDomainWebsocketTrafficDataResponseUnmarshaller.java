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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainWebsocketTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainWebsocketTrafficDataResponse unmarshall(DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainWebsocketTrafficDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.RequestId"));
		describeDcdnDomainWebsocketTrafficDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.DomainName"));
		describeDcdnDomainWebsocketTrafficDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.StartTime"));
		describeDcdnDomainWebsocketTrafficDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.EndTime"));
		describeDcdnDomainWebsocketTrafficDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainWebsocketTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainWebsocketTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setWebsocketTraffic(context.floatValue("DescribeDcdnDomainWebsocketTrafficDataResponse.TrafficDataPerInterval["+ i +"].WebsocketTraffic"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainWebsocketTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDcdnDomainWebsocketTrafficDataResponse;
	}
}