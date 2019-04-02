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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryUserOmsDataResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryUserOmsDataResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserOmsDataResponseUnmarshaller {

	public static QueryUserOmsDataResponse unmarshall(QueryUserOmsDataResponse queryUserOmsDataResponse, UnmarshallerContext context) {
		
		queryUserOmsDataResponse.setRequestId(context.stringValue("QueryUserOmsDataResponse.RequestId"));
		queryUserOmsDataResponse.setSuccess(context.booleanValue("QueryUserOmsDataResponse.Success"));
		queryUserOmsDataResponse.setCode(context.stringValue("QueryUserOmsDataResponse.Code"));
		queryUserOmsDataResponse.setMessage(context.stringValue("QueryUserOmsDataResponse.Message"));

		Data data = new Data();
		data.setMarker(context.stringValue("QueryUserOmsDataResponse.Data.Marker"));
		data.setHostId(context.stringValue("QueryUserOmsDataResponse.Data.HostId"));

		List<Map<Object, Object>> omsData = context.listMapValue("QueryUserOmsDataResponse.Data.OmsData");
		data.setOmsData(omsData);
		queryUserOmsDataResponse.setData(data);
	 
	 	return queryUserOmsDataResponse;
	}
}