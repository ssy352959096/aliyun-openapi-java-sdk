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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.GetGroupApRadioOnoffProgressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupApRadioOnoffProgressResponseUnmarshaller {

	public static GetGroupApRadioOnoffProgressResponse unmarshall(GetGroupApRadioOnoffProgressResponse getGroupApRadioOnoffProgressResponse, UnmarshallerContext context) {
		
		getGroupApRadioOnoffProgressResponse.setRequestId(context.stringValue("GetGroupApRadioOnoffProgressResponse.RequestId"));
		getGroupApRadioOnoffProgressResponse.setSuccess(context.booleanValue("GetGroupApRadioOnoffProgressResponse.Success"));
		getGroupApRadioOnoffProgressResponse.setMessage(context.stringValue("GetGroupApRadioOnoffProgressResponse.Message"));
		getGroupApRadioOnoffProgressResponse.setData(context.stringValue("GetGroupApRadioOnoffProgressResponse.Data"));
		getGroupApRadioOnoffProgressResponse.setErrorCode(context.integerValue("GetGroupApRadioOnoffProgressResponse.ErrorCode"));
		getGroupApRadioOnoffProgressResponse.setErrorMsg(context.stringValue("GetGroupApRadioOnoffProgressResponse.ErrorMsg"));
	 
	 	return getGroupApRadioOnoffProgressResponse;
	}
}