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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetNodeTuplesDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeTuplesDownloadUrlResponseUnmarshaller {

	public static GetNodeTuplesDownloadUrlResponse unmarshall(GetNodeTuplesDownloadUrlResponse getNodeTuplesDownloadUrlResponse, UnmarshallerContext context) {
		
		getNodeTuplesDownloadUrlResponse.setRequestId(context.stringValue("GetNodeTuplesDownloadUrlResponse.RequestId"));
		getNodeTuplesDownloadUrlResponse.setSuccess(context.booleanValue("GetNodeTuplesDownloadUrlResponse.Success"));
		getNodeTuplesDownloadUrlResponse.setData(context.stringValue("GetNodeTuplesDownloadUrlResponse.Data"));
	 
	 	return getNodeTuplesDownloadUrlResponse;
	}
}