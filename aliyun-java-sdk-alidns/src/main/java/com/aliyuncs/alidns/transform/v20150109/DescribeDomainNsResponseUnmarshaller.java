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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainNsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainNsResponseUnmarshaller {

	public static DescribeDomainNsResponse unmarshall(DescribeDomainNsResponse describeDomainNsResponse, UnmarshallerContext context) {
		
		describeDomainNsResponse.setRequestId(context.stringValue("DescribeDomainNsResponse.RequestId"));
		describeDomainNsResponse.setAllAliDns(context.booleanValue("DescribeDomainNsResponse.AllAliDns"));
		describeDomainNsResponse.setIncludeAliDns(context.booleanValue("DescribeDomainNsResponse.IncludeAliDns"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDomainNsResponse.DnsServers.Length"); i++) {
			dnsServers.add(context.stringValue("DescribeDomainNsResponse.DnsServers["+ i +"]"));
		}
		describeDomainNsResponse.setDnsServers(dnsServers);

		List<String> expectDnsServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDomainNsResponse.ExpectDnsServers.Length"); i++) {
			expectDnsServers.add(context.stringValue("DescribeDomainNsResponse.ExpectDnsServers["+ i +"]"));
		}
		describeDomainNsResponse.setExpectDnsServers(expectDnsServers);
	 
	 	return describeDomainNsResponse;
	}
}