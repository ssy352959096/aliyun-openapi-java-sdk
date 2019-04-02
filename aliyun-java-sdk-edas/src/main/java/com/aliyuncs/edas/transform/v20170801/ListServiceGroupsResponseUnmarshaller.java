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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListServiceGroupsResponse;
import com.aliyuncs.edas.model.v20170801.ListServiceGroupsResponse.ListServiceGroups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceGroupsResponseUnmarshaller {

	public static ListServiceGroupsResponse unmarshall(ListServiceGroupsResponse listServiceGroupsResponse, UnmarshallerContext context) {
		
		listServiceGroupsResponse.setRequestId(context.stringValue("ListServiceGroupsResponse.RequestId"));
		listServiceGroupsResponse.setCode(context.integerValue("ListServiceGroupsResponse.Code"));
		listServiceGroupsResponse.setMessage(context.stringValue("ListServiceGroupsResponse.Message"));

		List<ListServiceGroups> serviceGroupsList = new ArrayList<ListServiceGroups>();
		for (int i = 0; i < context.lengthValue("ListServiceGroupsResponse.ServiceGroupsList.Length"); i++) {
			ListServiceGroups listServiceGroups = new ListServiceGroups();
			listServiceGroups.setCreateTime(context.stringValue("ListServiceGroupsResponse.ServiceGroupsList["+ i +"].CreateTime"));
			listServiceGroups.setGroupId(context.stringValue("ListServiceGroupsResponse.ServiceGroupsList["+ i +"].GroupId"));
			listServiceGroups.setGroupName(context.stringValue("ListServiceGroupsResponse.ServiceGroupsList["+ i +"].GroupName"));

			serviceGroupsList.add(listServiceGroups);
		}
		listServiceGroupsResponse.setServiceGroupsList(serviceGroupsList);
	 
	 	return listServiceGroupsResponse;
	}
}