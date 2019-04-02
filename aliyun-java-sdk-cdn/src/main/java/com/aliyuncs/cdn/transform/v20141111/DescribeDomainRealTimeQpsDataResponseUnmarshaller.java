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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeQpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeQpsDataResponse.QpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeQpsDataResponseUnmarshaller {

	public static DescribeDomainRealTimeQpsDataResponse unmarshall(DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeQpsDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeQpsDataResponse.RequestId"));

		List<QpsModel> data = new ArrayList<QpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeQpsDataResponse.Data.Length"); i++) {
			QpsModel qpsModel = new QpsModel();
			qpsModel.setQps(context.floatValue("DescribeDomainRealTimeQpsDataResponse.Data["+ i +"].Qps"));
			qpsModel.setTimeStamp(context.stringValue("DescribeDomainRealTimeQpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(qpsModel);
		}
		describeDomainRealTimeQpsDataResponse.setData(data);
	 
	 	return describeDomainRealTimeQpsDataResponse;
	}
}