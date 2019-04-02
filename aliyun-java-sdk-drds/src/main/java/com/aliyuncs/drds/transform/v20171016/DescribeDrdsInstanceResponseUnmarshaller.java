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

import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceResponse.Data;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceResponse.Data.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceResponseUnmarshaller {

	public static DescribeDrdsInstanceResponse unmarshall(DescribeDrdsInstanceResponse describeDrdsInstanceResponse, UnmarshallerContext context) {
		
		describeDrdsInstanceResponse.setRequestId(context.stringValue("DescribeDrdsInstanceResponse.RequestId"));
		describeDrdsInstanceResponse.setSuccess(context.booleanValue("DescribeDrdsInstanceResponse.Success"));

		Data data = new Data();
		data.setDrdsInstanceId(context.stringValue("DescribeDrdsInstanceResponse.Data.DrdsInstanceId"));
		data.setType(context.stringValue("DescribeDrdsInstanceResponse.Data.Type"));
		data.setRegionId(context.stringValue("DescribeDrdsInstanceResponse.Data.RegionId"));
		data.setZoneId(context.stringValue("DescribeDrdsInstanceResponse.Data.ZoneId"));
		data.setDescription(context.stringValue("DescribeDrdsInstanceResponse.Data.Description"));
		data.setNetworkType(context.stringValue("DescribeDrdsInstanceResponse.Data.NetworkType"));
		data.setStatus(context.stringValue("DescribeDrdsInstanceResponse.Data.Status"));
		data.setCreateTime(context.longValue("DescribeDrdsInstanceResponse.Data.CreateTime"));
		data.setVersion(context.longValue("DescribeDrdsInstanceResponse.Data.Version"));
		data.setSpecification(context.stringValue("DescribeDrdsInstanceResponse.Data.Specification"));
		data.setVpcCloudInstanceId(context.stringValue("DescribeDrdsInstanceResponse.Data.VpcCloudInstanceId"));

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsInstanceResponse.Data.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setIP(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].IP"));
			vip.setPort(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].Port"));
			vip.setType(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].Type"));
			vip.setVpcId(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].VpcId"));
			vip.setVswitchId(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].VswitchId"));

			vips.add(vip);
		}
		data.setVips(vips);
		describeDrdsInstanceResponse.setData(data);
	 
	 	return describeDrdsInstanceResponse;
	}
}