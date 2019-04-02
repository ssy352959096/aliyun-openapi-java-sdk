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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.CreateSynchronizationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSynchronizationJobResponseUnmarshaller {

	public static CreateSynchronizationJobResponse unmarshall(CreateSynchronizationJobResponse createSynchronizationJobResponse, UnmarshallerContext context) {
		
		createSynchronizationJobResponse.setRequestId(context.stringValue("CreateSynchronizationJobResponse.RequestId"));
		createSynchronizationJobResponse.setSuccess(context.stringValue("CreateSynchronizationJobResponse.Success"));
		createSynchronizationJobResponse.setErrCode(context.stringValue("CreateSynchronizationJobResponse.ErrCode"));
		createSynchronizationJobResponse.setErrMessage(context.stringValue("CreateSynchronizationJobResponse.ErrMessage"));
		createSynchronizationJobResponse.setSynchronizationJobId(context.stringValue("CreateSynchronizationJobResponse.SynchronizationJobId"));
	 
	 	return createSynchronizationJobResponse;
	}
}