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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewAttributeResponse unmarshall(DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAutoRenewAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.RequestId"));
		describeInstanceAutoRenewAttributeResponse.setPageNumber(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.PageNumber"));
		describeInstanceAutoRenewAttributeResponse.setPageSize(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.PageSize"));
		describeInstanceAutoRenewAttributeResponse.setTotalCount(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.TotalCount"));

		List<InstanceRenewAttribute> instanceRenewAttributes = new ArrayList<InstanceRenewAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes.Length"); i++) {
			InstanceRenewAttribute instanceRenewAttribute = new InstanceRenewAttribute();
			instanceRenewAttribute.setInstanceId(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].InstanceId"));
			instanceRenewAttribute.setAutoRenewEnabled(context.booleanValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].AutoRenewEnabled"));
			instanceRenewAttribute.setDuration(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].Duration"));
			instanceRenewAttribute.setPeriodUnit(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].PeriodUnit"));
			instanceRenewAttribute.setRenewalStatus(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].RenewalStatus"));

			instanceRenewAttributes.add(instanceRenewAttribute);
		}
		describeInstanceAutoRenewAttributeResponse.setInstanceRenewAttributes(instanceRenewAttributes);
	 
	 	return describeInstanceAutoRenewAttributeResponse;
	}
}