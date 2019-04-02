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

import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorsResponse.Ipv6Translator;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIPv6TranslatorsResponseUnmarshaller {

	public static DescribeIPv6TranslatorsResponse unmarshall(DescribeIPv6TranslatorsResponse describeIPv6TranslatorsResponse, UnmarshallerContext context) {
		
		describeIPv6TranslatorsResponse.setRequestId(context.stringValue("DescribeIPv6TranslatorsResponse.RequestId"));
		describeIPv6TranslatorsResponse.setTotalCount(context.integerValue("DescribeIPv6TranslatorsResponse.TotalCount"));
		describeIPv6TranslatorsResponse.setPageNumber(context.integerValue("DescribeIPv6TranslatorsResponse.PageNumber"));
		describeIPv6TranslatorsResponse.setPageSize(context.integerValue("DescribeIPv6TranslatorsResponse.PageSize"));

		List<Ipv6Translator> ipv6Translators = new ArrayList<Ipv6Translator>();
		for (int i = 0; i < context.lengthValue("DescribeIPv6TranslatorsResponse.Ipv6Translators.Length"); i++) {
			Ipv6Translator ipv6Translator = new Ipv6Translator();
			ipv6Translator.setIpv6TranslatorId(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Ipv6TranslatorId"));
			ipv6Translator.setCreateTime(context.longValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].CreateTime"));
			ipv6Translator.setEndTime(context.longValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].EndTime"));
			ipv6Translator.setSpec(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Spec"));
			ipv6Translator.setName(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Name"));
			ipv6Translator.setDescription(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Description"));
			ipv6Translator.setStatus(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Status"));
			ipv6Translator.setBusinessStatus(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].BusinessStatus"));
			ipv6Translator.setPayType(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].PayType"));
			ipv6Translator.setBandwidth(context.integerValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Bandwidth"));
			ipv6Translator.setAllocateIpv6Addr(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].AllocateIpv6Addr"));
			ipv6Translator.setAllocateIpv4Addr(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].AllocateIpv4Addr"));
			ipv6Translator.setAvailableBandwidth(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].AvailableBandwidth"));
			ipv6Translator.setRegionId(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].RegionId"));

			List<String> ipv6TranslatorEntryIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Ipv6TranslatorEntryIds.Length"); j++) {
				ipv6TranslatorEntryIds.add(context.stringValue("DescribeIPv6TranslatorsResponse.Ipv6Translators["+ i +"].Ipv6TranslatorEntryIds["+ j +"]"));
			}
			ipv6Translator.setIpv6TranslatorEntryIds(ipv6TranslatorEntryIds);

			ipv6Translators.add(ipv6Translator);
		}
		describeIPv6TranslatorsResponse.setIpv6Translators(ipv6Translators);
	 
	 	return describeIPv6TranslatorsResponse;
	}
}