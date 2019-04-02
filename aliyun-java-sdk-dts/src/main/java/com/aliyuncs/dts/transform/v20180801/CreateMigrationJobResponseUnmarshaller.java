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

import com.aliyuncs.dts.model.v20180801.CreateMigrationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMigrationJobResponseUnmarshaller {

	public static CreateMigrationJobResponse unmarshall(CreateMigrationJobResponse createMigrationJobResponse, UnmarshallerContext context) {
		
		createMigrationJobResponse.setRequestId(context.stringValue("CreateMigrationJobResponse.RequestId"));
		createMigrationJobResponse.setSuccess(context.stringValue("CreateMigrationJobResponse.Success"));
		createMigrationJobResponse.setErrCode(context.stringValue("CreateMigrationJobResponse.ErrCode"));
		createMigrationJobResponse.setErrMessage(context.stringValue("CreateMigrationJobResponse.ErrMessage"));
		createMigrationJobResponse.setMigrationJobId(context.stringValue("CreateMigrationJobResponse.MigrationJobId"));
	 
	 	return createMigrationJobResponse;
	}
}