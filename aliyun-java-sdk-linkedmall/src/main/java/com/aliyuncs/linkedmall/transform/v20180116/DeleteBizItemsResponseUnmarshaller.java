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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.DeleteBizItemsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBizItemsResponseUnmarshaller {

	public static DeleteBizItemsResponse unmarshall(DeleteBizItemsResponse deleteBizItemsResponse, UnmarshallerContext context) {
		
		deleteBizItemsResponse.setRequestId(context.stringValue("DeleteBizItemsResponse.RequestId"));
		deleteBizItemsResponse.setCode(context.stringValue("DeleteBizItemsResponse.Code"));
		deleteBizItemsResponse.setMessage(context.stringValue("DeleteBizItemsResponse.Message"));
	 
	 	return deleteBizItemsResponse;
	}
}