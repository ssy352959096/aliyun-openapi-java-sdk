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

import com.aliyuncs.bssopenapi.model.v20171214.CancelOrderResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CancelOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelOrderResponseUnmarshaller {

	public static CancelOrderResponse unmarshall(CancelOrderResponse cancelOrderResponse, UnmarshallerContext context) {
		
		cancelOrderResponse.setRequestId(context.stringValue("CancelOrderResponse.RequestId"));
		cancelOrderResponse.setSuccess(context.booleanValue("CancelOrderResponse.Success"));
		cancelOrderResponse.setCode(context.stringValue("CancelOrderResponse.Code"));
		cancelOrderResponse.setMessage(context.stringValue("CancelOrderResponse.Message"));

		Data data = new Data();
		data.setHostId(context.stringValue("CancelOrderResponse.Data.HostId"));
		cancelOrderResponse.setData(data);
	 
	 	return cancelOrderResponse;
	}
}