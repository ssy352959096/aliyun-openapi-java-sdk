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

import com.aliyuncs.cdn.model.v20141111.StopMixStreamsServiceResponse;
import com.aliyuncs.cdn.model.v20141111.StopMixStreamsServiceResponse.MixStreamsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopMixStreamsServiceResponseUnmarshaller {

	public static StopMixStreamsServiceResponse unmarshall(StopMixStreamsServiceResponse stopMixStreamsServiceResponse, UnmarshallerContext context) {
		
		stopMixStreamsServiceResponse.setRequestId(context.stringValue("StopMixStreamsServiceResponse.RequestId"));

		List<MixStreamsInfo> mixStreamsInfoList = new ArrayList<MixStreamsInfo>();
		for (int i = 0; i < context.lengthValue("StopMixStreamsServiceResponse.MixStreamsInfoList.Length"); i++) {
			MixStreamsInfo mixStreamsInfo = new MixStreamsInfo();
			mixStreamsInfo.setDomainName(context.stringValue("StopMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].DomainName"));
			mixStreamsInfo.setAppName(context.stringValue("StopMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].AppName"));
			mixStreamsInfo.setStreamName(context.stringValue("StopMixStreamsServiceResponse.MixStreamsInfoList["+ i +"].StreamName"));

			mixStreamsInfoList.add(mixStreamsInfo);
		}
		stopMixStreamsServiceResponse.setMixStreamsInfoList(mixStreamsInfoList);
	 
	 	return stopMixStreamsServiceResponse;
	}
}