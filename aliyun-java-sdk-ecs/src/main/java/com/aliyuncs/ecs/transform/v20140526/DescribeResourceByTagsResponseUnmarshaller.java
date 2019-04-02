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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceByTagsResponseUnmarshaller {

	public static DescribeResourceByTagsResponse unmarshall(DescribeResourceByTagsResponse describeResourceByTagsResponse, UnmarshallerContext context) {
		
		describeResourceByTagsResponse.setRequestId(context.stringValue("DescribeResourceByTagsResponse.RequestId"));
		describeResourceByTagsResponse.setPageSize(context.integerValue("DescribeResourceByTagsResponse.PageSize"));
		describeResourceByTagsResponse.setPageNumber(context.integerValue("DescribeResourceByTagsResponse.PageNumber"));
		describeResourceByTagsResponse.setTotalCount(context.integerValue("DescribeResourceByTagsResponse.TotalCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeResourceByTagsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(context.stringValue("DescribeResourceByTagsResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceType(context.stringValue("DescribeResourceByTagsResponse.Resources["+ i +"].ResourceType"));
			resource.setRegionId(context.stringValue("DescribeResourceByTagsResponse.Resources["+ i +"].RegionId"));

			resources.add(resource);
		}
		describeResourceByTagsResponse.setResources(resources);
	 
	 	return describeResourceByTagsResponse;
	}
}