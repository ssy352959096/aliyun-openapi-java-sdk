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

package com.aliyuncs.industry_brain.transform.v20180712;

import com.aliyuncs.industry_brain.model.v20180712.AsyncResponsePostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AsyncResponsePostResponseUnmarshaller {

	public static AsyncResponsePostResponse unmarshall(AsyncResponsePostResponse asyncResponsePostResponse, UnmarshallerContext context) {
		
		asyncResponsePostResponse.setRequestId(context.stringValue("AsyncResponsePostResponse.RequestId"));
		asyncResponsePostResponse.setData(context.stringValue("AsyncResponsePostResponse.Data"));
		asyncResponsePostResponse.setStatus(context.stringValue("AsyncResponsePostResponse.Status"));
		asyncResponsePostResponse.setCode(context.stringValue("AsyncResponsePostResponse.Code"));
		asyncResponsePostResponse.setMessage(context.stringValue("AsyncResponsePostResponse.Message"));
	 
	 	return asyncResponsePostResponse;
	}
}