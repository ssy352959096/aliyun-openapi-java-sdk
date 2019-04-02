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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesByPerformanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesByPerformanceResponse.DBInstancePerformance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesByPerformanceResponseUnmarshaller {

	public static DescribeDBInstancesByPerformanceResponse unmarshall(DescribeDBInstancesByPerformanceResponse describeDBInstancesByPerformanceResponse, UnmarshallerContext context) {
		
		describeDBInstancesByPerformanceResponse.setRequestId(context.stringValue("DescribeDBInstancesByPerformanceResponse.RequestId"));
		describeDBInstancesByPerformanceResponse.setPageNumber(context.integerValue("DescribeDBInstancesByPerformanceResponse.PageNumber"));
		describeDBInstancesByPerformanceResponse.setTotalRecordCount(context.integerValue("DescribeDBInstancesByPerformanceResponse.TotalRecordCount"));
		describeDBInstancesByPerformanceResponse.setPageRecordCount(context.integerValue("DescribeDBInstancesByPerformanceResponse.PageRecordCount"));

		List<DBInstancePerformance> items = new ArrayList<DBInstancePerformance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesByPerformanceResponse.Items.Length"); i++) {
			DBInstancePerformance dBInstancePerformance = new DBInstancePerformance();
			dBInstancePerformance.setCPUUsage(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].CPUUsage"));
			dBInstancePerformance.setIOPSUsage(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].IOPSUsage"));
			dBInstancePerformance.setDiskUsage(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].DiskUsage"));
			dBInstancePerformance.setSessionUsage(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].SessionUsage"));
			dBInstancePerformance.setDBInstanceId(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].DBInstanceId"));
			dBInstancePerformance.setDBInstanceDescription(context.stringValue("DescribeDBInstancesByPerformanceResponse.Items["+ i +"].DBInstanceDescription"));

			items.add(dBInstancePerformance);
		}
		describeDBInstancesByPerformanceResponse.setItems(items);
	 
	 	return describeDBInstancesByPerformanceResponse;
	}
}