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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse.Vpc;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse.Vpc.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext context) {
		
		describeVpcsResponse.setRequestId(context.stringValue("DescribeVpcsResponse.RequestId"));
		describeVpcsResponse.setTotalCount(context.integerValue("DescribeVpcsResponse.TotalCount"));
		describeVpcsResponse.setPageNumber(context.integerValue("DescribeVpcsResponse.PageNumber"));
		describeVpcsResponse.setPageSize(context.integerValue("DescribeVpcsResponse.PageSize"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < context.lengthValue("DescribeVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setVpcId(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcId"));
			vpc.setRegionId(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RegionId"));
			vpc.setStatus(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Status"));
			vpc.setVpcName(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcName"));
			vpc.setCreationTime(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CreationTime"));
			vpc.setCidrBlock(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setIpv6CidrBlock(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Ipv6CidrBlock"));
			vpc.setVRouterId(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VRouterId"));
			vpc.setDescription(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Description"));
			vpc.setIsDefault(context.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].IsDefault"));
			vpc.setResourceGroupId(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].ResourceGroupId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds["+ j +"]"));
			}
			vpc.setVSwitchIds(vSwitchIds);

			List<String> userCidrs = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs.Length"); j++) {
				userCidrs.add(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs["+ j +"]"));
			}
			vpc.setUserCidrs(userCidrs);

			List<String> natGatewayIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].NatGatewayIds.Length"); j++) {
				natGatewayIds.add(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].NatGatewayIds["+ j +"]"));
			}
			vpc.setNatGatewayIds(natGatewayIds);

			List<String> routerTableIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].RouterTableIds.Length"); j++) {
				routerTableIds.add(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RouterTableIds["+ j +"]"));
			}
			vpc.setRouterTableIds(routerTableIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(context.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vpc.setTags(tags);

			vpcs.add(vpc);
		}
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}