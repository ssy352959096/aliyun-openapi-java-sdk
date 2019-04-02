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

import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageResponse.SnapshotPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotPackageResponseUnmarshaller {

	public static DescribeSnapshotPackageResponse unmarshall(DescribeSnapshotPackageResponse describeSnapshotPackageResponse, UnmarshallerContext context) {
		
		describeSnapshotPackageResponse.setRequestId(context.stringValue("DescribeSnapshotPackageResponse.RequestId"));
		describeSnapshotPackageResponse.setTotalCount(context.integerValue("DescribeSnapshotPackageResponse.TotalCount"));
		describeSnapshotPackageResponse.setPageNumber(context.integerValue("DescribeSnapshotPackageResponse.PageNumber"));
		describeSnapshotPackageResponse.setPageSize(context.integerValue("DescribeSnapshotPackageResponse.PageSize"));

		List<SnapshotPackage> snapshotPackages = new ArrayList<SnapshotPackage>();
		for (int i = 0; i < context.lengthValue("DescribeSnapshotPackageResponse.SnapshotPackages.Length"); i++) {
			SnapshotPackage snapshotPackage = new SnapshotPackage();
			snapshotPackage.setStartTime(context.stringValue("DescribeSnapshotPackageResponse.SnapshotPackages["+ i +"].StartTime"));
			snapshotPackage.setEndTime(context.stringValue("DescribeSnapshotPackageResponse.SnapshotPackages["+ i +"].EndTime"));
			snapshotPackage.setInitCapacity(context.longValue("DescribeSnapshotPackageResponse.SnapshotPackages["+ i +"].InitCapacity"));
			snapshotPackage.setDisplayName(context.stringValue("DescribeSnapshotPackageResponse.SnapshotPackages["+ i +"].DisplayName"));

			snapshotPackages.add(snapshotPackage);
		}
		describeSnapshotPackageResponse.setSnapshotPackages(snapshotPackages);
	 
	 	return describeSnapshotPackageResponse;
	}
}