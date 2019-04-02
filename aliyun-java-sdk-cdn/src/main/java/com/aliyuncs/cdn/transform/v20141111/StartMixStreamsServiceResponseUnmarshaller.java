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

import com.aliyuncs.cdn.model.v20141111.StartMixStreamsServiceResponse;
import com.aliyuncs.cdn.model.v20141111.StartMixStreamsServiceResponse.MixStreamsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartMixStreamsServiceResponseUnmarshaller {

	public static StartMixStreamsServiceResponse unmarshall(StartMixStreamsServiceResponse startMixStreamsServiceResponse, UnmarshallerContext context) {
		
		startMixStreamsServiceResponse.setRequestId(context.stringValue("StartMixStreamsServiceResponse.RequestId"));

		List<MixStreamsInfo> mixStreamsInfoList = new ArrayList<MixStreamsInfo>();
		for (int i = 0; i < context.lengthValue("StartMixStreamsServiceResponse.MixStreamsInfoList.Length"); i++) {
			MixStreamsInfo mixStreamsInfo = new MixStreamsInfo();
			mixStreamsInfo.setDomainName(context.stringValue("StartMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].DomainName"));
			mixStreamsInfo.setAppName(context.stringValue("StartMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].AppName"));
			mixStreamsInfo.setStreamName(context.stringValue("StartMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].StreamName"));

			mixStreamsInfoList.add(mixStreamsInfo);
		}
		startMixStreamsServiceResponse.setMixStreamsInfoList(mixStreamsInfoList);
	 
	 	return startMixStreamsServiceResponse;
	}
}