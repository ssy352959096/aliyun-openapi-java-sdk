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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBpsDataResponseUnmarshaller {

	public static DescribeDomainBpsDataResponse unmarshall(DescribeDomainBpsDataResponse describeDomainBpsDataResponse, UnmarshallerContext context) {
		
		describeDomainBpsDataResponse.setRequestId(context.stringValue("DescribeDomainBpsDataResponse.RequestId"));
		describeDomainBpsDataResponse.setDomainName(context.stringValue("DescribeDomainBpsDataResponse.DomainName"));
		describeDomainBpsDataResponse.setStartTime(context.stringValue("DescribeDomainBpsDataResponse.StartTime"));
		describeDomainBpsDataResponse.setEndTime(context.stringValue("DescribeDomainBpsDataResponse.EndTime"));
		describeDomainBpsDataResponse.setLocationNameEn(context.stringValue("DescribeDomainBpsDataResponse.LocationNameEn"));
		describeDomainBpsDataResponse.setIspNameEn(context.stringValue("DescribeDomainBpsDataResponse.IspNameEn"));
		describeDomainBpsDataResponse.setLocationName(context.stringValue("DescribeDomainBpsDataResponse.LocationName"));
		describeDomainBpsDataResponse.setIspName(context.stringValue("DescribeDomainBpsDataResponse.IspName"));
		describeDomainBpsDataResponse.setDataInterval(context.stringValue("DescribeDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setL2Value(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].L2Value"));
			dataModule.setDomesticL2Value(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticL2Value"));
			dataModule.setOverseasL2Value(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasL2Value"));
			dataModule.setDynamicValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicValue"));
			dataModule.setDynamicDomesticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicDomesticValue"));
			dataModule.setDynamicOverseasValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicOverseasValue"));
			dataModule.setStaticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticValue"));
			dataModule.setStaticDomesticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticDomesticValue"));
			dataModule.setStaticOverseasValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticOverseasValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDomainBpsDataResponse;
	}
}