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

import com.aliyuncs.edas.model.v20170801.ListConsumedServicesResponse;
import com.aliyuncs.edas.model.v20170801.ListConsumedServicesResponse.ListConsumedServices;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConsumedServicesResponseUnmarshaller {

	public static ListConsumedServicesResponse unmarshall(ListConsumedServicesResponse listConsumedServicesResponse, UnmarshallerContext context) {
		
		listConsumedServicesResponse.setRequestId(context.stringValue("ListConsumedServicesResponse.RequestId"));
		listConsumedServicesResponse.setCode(context.integerValue("ListConsumedServicesResponse.Code"));
		listConsumedServicesResponse.setMessage(context.stringValue("ListConsumedServicesResponse.Message"));

		List<ListConsumedServices> consumedServicesList = new ArrayList<ListConsumedServices>();
		for (int i = 0; i < context.lengthValue("ListConsumedServicesResponse.ConsumedServicesList.Length"); i++) {
			ListConsumedServices listConsumedServices = new ListConsumedServices();
			listConsumedServices.setAppId(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].AppId"));
			listConsumedServices.setDockerApplication(context.booleanValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].DockerApplication"));
			listConsumedServices.setGroup2Ip(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Group2Ip"));
			listConsumedServices.setName(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Name"));
			listConsumedServices.setType(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Type"));
			listConsumedServices.setVersion(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Version"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Groups.Length"); j++) {
				groups.add(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Groups["+ j +"]"));
			}
			listConsumedServices.setGroups(groups);

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Ips.Length"); j++) {
				ips.add(context.stringValue("ListConsumedServicesResponse.ConsumedServicesList["+ i +"].Ips["+ j +"]"));
			}
			listConsumedServices.setIps(ips);

			consumedServicesList.add(listConsumedServices);
		}
		listConsumedServicesResponse.setConsumedServicesList(consumedServicesList);
	 
	 	return listConsumedServicesResponse;
	}
}