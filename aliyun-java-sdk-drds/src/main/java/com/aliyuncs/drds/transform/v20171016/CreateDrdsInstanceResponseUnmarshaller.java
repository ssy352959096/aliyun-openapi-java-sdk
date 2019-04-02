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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.CreateDrdsInstanceResponse;
import com.aliyuncs.drds.model.v20171016.CreateDrdsInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDrdsInstanceResponseUnmarshaller {

	public static CreateDrdsInstanceResponse unmarshall(CreateDrdsInstanceResponse createDrdsInstanceResponse, UnmarshallerContext context) {
		
		createDrdsInstanceResponse.setRequestId(context.stringValue("CreateDrdsInstanceResponse.RequestId"));
		createDrdsInstanceResponse.setSuccess(context.booleanValue("CreateDrdsInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(context.longValue("CreateDrdsInstanceResponse.Data.OrderId"));

		List<String> drdsInstanceIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateDrdsInstanceResponse.Data.DrdsInstanceIdList.Length"); i++) {
			drdsInstanceIdList.add(context.stringValue("CreateDrdsInstanceResponse.Data.DrdsInstanceIdList["+ i +"]"));
		}
		data.setDrdsInstanceIdList(drdsInstanceIdList);
		createDrdsInstanceResponse.setData(data);
	 
	 	return createDrdsInstanceResponse;
	}
}