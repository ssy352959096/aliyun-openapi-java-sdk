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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.BatchInsertItemsResponse;
import com.aliyuncs.cloudesl.model.v20180801.BatchInsertItemsResponse.BatchResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchInsertItemsResponseUnmarshaller {

	public static BatchInsertItemsResponse unmarshall(BatchInsertItemsResponse batchInsertItemsResponse, UnmarshallerContext context) {
		
		batchInsertItemsResponse.setRequestId(context.stringValue("BatchInsertItemsResponse.RequestId"));
		batchInsertItemsResponse.setSuccess(context.booleanValue("BatchInsertItemsResponse.Success"));
		batchInsertItemsResponse.setMessage(context.stringValue("BatchInsertItemsResponse.Message"));
		batchInsertItemsResponse.setErrorCode(context.stringValue("BatchInsertItemsResponse.ErrorCode"));

		List<BatchResult> batchResults = new ArrayList<BatchResult>();
		for (int i = 0; i < context.lengthValue("BatchInsertItemsResponse.BatchResults.Length"); i++) {
			BatchResult batchResult = new BatchResult();
			batchResult.setIndex(context.integerValue("BatchInsertItemsResponse.BatchResults["+ i +"].Index"));
			batchResult.setSuccess(context.booleanValue("BatchInsertItemsResponse.BatchResults["+ i +"].Success"));
			batchResult.setMessage(context.stringValue("BatchInsertItemsResponse.BatchResults["+ i +"].Message"));
			batchResult.setErrorCode(context.stringValue("BatchInsertItemsResponse.BatchResults["+ i +"].ErrorCode"));

			batchResults.add(batchResult);
		}
		batchInsertItemsResponse.setBatchResults(batchResults);
	 
	 	return batchInsertItemsResponse;
	}
}