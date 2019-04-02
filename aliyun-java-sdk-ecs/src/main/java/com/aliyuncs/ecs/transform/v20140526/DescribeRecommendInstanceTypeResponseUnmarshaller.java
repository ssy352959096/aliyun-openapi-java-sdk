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

import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType.InstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecommendInstanceTypeResponseUnmarshaller {

	public static DescribeRecommendInstanceTypeResponse unmarshall(DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeResponse, UnmarshallerContext context) {
		
		describeRecommendInstanceTypeResponse.setRequestId(context.stringValue("DescribeRecommendInstanceTypeResponse.RequestId"));

		List<RecommendInstanceType> data = new ArrayList<RecommendInstanceType>();
		for (int i = 0; i < context.lengthValue("DescribeRecommendInstanceTypeResponse.Data.Length"); i++) {
			RecommendInstanceType recommendInstanceType = new RecommendInstanceType();
			recommendInstanceType.setRegionNo(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].RegionNo"));
			recommendInstanceType.setCommodityCode(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].CommodityCode"));
			recommendInstanceType.setScene(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Scene"));

			InstanceType instanceType = new InstanceType();
			instanceType.setGeneration(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Generation"));
			instanceType.setInstanceTypeFamily(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.InstanceTypeFamily"));
			instanceType.setInstanceType(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.InstanceType"));
			instanceType.setSupportIoOptimized(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.SupportIoOptimized"));
			instanceType.setCores(context.integerValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Cores"));
			instanceType.setMemory(context.integerValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Memory"));
			recommendInstanceType.setInstanceType(instanceType);

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < context.lengthValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneNo(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].ZoneNo"));

				List<String> networkTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].NetworkTypes.Length"); k++) {
					networkTypes.add(context.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].NetworkTypes["+ k +"]"));
				}
				zone.setNetworkTypes(networkTypes);

				zones.add(zone);
			}
			recommendInstanceType.setZones(zones);

			data.add(recommendInstanceType);
		}
		describeRecommendInstanceTypeResponse.setData(data);
	 
	 	return describeRecommendInstanceTypeResponse;
	}
}