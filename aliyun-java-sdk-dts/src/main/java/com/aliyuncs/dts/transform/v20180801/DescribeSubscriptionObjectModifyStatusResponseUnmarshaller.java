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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionObjectModifyStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionObjectModifyStatusResponse.CheckItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionObjectModifyStatusResponseUnmarshaller {

	public static DescribeSubscriptionObjectModifyStatusResponse unmarshall(DescribeSubscriptionObjectModifyStatusResponse describeSubscriptionObjectModifyStatusResponse, UnmarshallerContext context) {
		
		describeSubscriptionObjectModifyStatusResponse.setRequestId(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.RequestId"));
		describeSubscriptionObjectModifyStatusResponse.setStatus(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Status"));
		describeSubscriptionObjectModifyStatusResponse.setPercent(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Percent"));

		List<CheckItem> detail = new ArrayList<CheckItem>();
		for (int i = 0; i < context.lengthValue("DescribeSubscriptionObjectModifyStatusResponse.Detail.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setItemName(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Detail["+ i +"].ItemName"));
			checkItem.setCheckStatus(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Detail["+ i +"].CheckStatus"));
			checkItem.setErrorMessage(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Detail["+ i +"].ErrorMessage"));
			checkItem.setRepairMethod(context.stringValue("DescribeSubscriptionObjectModifyStatusResponse.Detail["+ i +"].RepairMethod"));

			detail.add(checkItem);
		}
		describeSubscriptionObjectModifyStatusResponse.setDetail(detail);
	 
	 	return describeSubscriptionObjectModifyStatusResponse;
	}
}