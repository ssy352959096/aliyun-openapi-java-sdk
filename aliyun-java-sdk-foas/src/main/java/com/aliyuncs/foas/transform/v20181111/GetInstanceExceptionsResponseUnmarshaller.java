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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetInstanceExceptionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceExceptionsResponseUnmarshaller {

	public static GetInstanceExceptionsResponse unmarshall(GetInstanceExceptionsResponse getInstanceExceptionsResponse, UnmarshallerContext context) {
		
		getInstanceExceptionsResponse.setRequestId(context.stringValue("GetInstanceExceptionsResponse.RequestId"));
		getInstanceExceptionsResponse.setExceptions(context.stringValue("GetInstanceExceptionsResponse.Exceptions"));
	 
	 	return getInstanceExceptionsResponse;
	}
}