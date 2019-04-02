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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeCdnRegionAndIspResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnRegionAndIspResponse.Isp;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnRegionAndIspResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnRegionAndIspResponseUnmarshaller {

	public static DescribeCdnRegionAndIspResponse unmarshall(DescribeCdnRegionAndIspResponse describeCdnRegionAndIspResponse, UnmarshallerContext context) {
		
		describeCdnRegionAndIspResponse.setRequestId(context.stringValue("DescribeCdnRegionAndIspResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("DescribeCdnRegionAndIspResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setNameZh(context.stringValue("DescribeCdnRegionAndIspResponse.Regions["+ i +"].NameZh"));
			region.setNameEn(context.stringValue("DescribeCdnRegionAndIspResponse.Regions["+ i +"].NameEn"));

			regions.add(region);
		}
		describeCdnRegionAndIspResponse.setRegions(regions);

		List<Isp> isps = new ArrayList<Isp>();
		for (int i = 0; i < context.lengthValue("DescribeCdnRegionAndIspResponse.Isps.Length"); i++) {
			Isp isp = new Isp();
			isp.setNameZh(context.stringValue("DescribeCdnRegionAndIspResponse.Isps["+ i +"].NameZh"));
			isp.setNameEn(context.stringValue("DescribeCdnRegionAndIspResponse.Isps["+ i +"].NameEn"));

			isps.add(isp);
		}
		describeCdnRegionAndIspResponse.setIsps(isps);
	 
	 	return describeCdnRegionAndIspResponse;
	}
}