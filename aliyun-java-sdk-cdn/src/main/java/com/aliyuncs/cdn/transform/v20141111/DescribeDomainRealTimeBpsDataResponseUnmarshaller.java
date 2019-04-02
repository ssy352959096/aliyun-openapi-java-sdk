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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeBpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeBpsDataResponse.BpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeBpsDataResponseUnmarshaller {

	public static DescribeDomainRealTimeBpsDataResponse unmarshall(DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeBpsDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeBpsDataResponse.RequestId"));

		List<BpsModel> data = new ArrayList<BpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeBpsDataResponse.Data.Length"); i++) {
			BpsModel bpsModel = new BpsModel();
			bpsModel.setBps(context.floatValue("DescribeDomainRealTimeBpsDataResponse.Data["+ i +"].Bps"));
			bpsModel.setTimeStamp(context.stringValue("DescribeDomainRealTimeBpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(bpsModel);
		}
		describeDomainRealTimeBpsDataResponse.setData(data);
	 
	 	return describeDomainRealTimeBpsDataResponse;
	}
}