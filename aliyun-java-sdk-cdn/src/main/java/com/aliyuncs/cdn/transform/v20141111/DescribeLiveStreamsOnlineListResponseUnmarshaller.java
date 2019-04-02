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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamsOnlineListResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamsOnlineListResponse.LiveStreamOnlineInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsOnlineListResponseUnmarshaller {

	public static DescribeLiveStreamsOnlineListResponse unmarshall(DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineListResponse, UnmarshallerContext context) {
		
		describeLiveStreamsOnlineListResponse.setRequestId(context.stringValue("DescribeLiveStreamsOnlineListResponse.RequestId"));
		describeLiveStreamsOnlineListResponse.setPageNum(context.integerValue("DescribeLiveStreamsOnlineListResponse.PageNum"));
		describeLiveStreamsOnlineListResponse.setPageSize(context.integerValue("DescribeLiveStreamsOnlineListResponse.PageSize"));
		describeLiveStreamsOnlineListResponse.setTotalNum(context.integerValue("DescribeLiveStreamsOnlineListResponse.TotalNum"));
		describeLiveStreamsOnlineListResponse.setTotalPage(context.integerValue("DescribeLiveStreamsOnlineListResponse.TotalPage"));

		List<LiveStreamOnlineInfo> onlineInfo = new ArrayList<LiveStreamOnlineInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo.Length"); i++) {
			LiveStreamOnlineInfo liveStreamOnlineInfo = new LiveStreamOnlineInfo();
			liveStreamOnlineInfo.setDomainName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].DomainName"));
			liveStreamOnlineInfo.setAppName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AppName"));
			liveStreamOnlineInfo.setStreamName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].StreamName"));
			liveStreamOnlineInfo.setPublishTime(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishTime"));
			liveStreamOnlineInfo.setPublishUrl(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishUrl"));

			onlineInfo.add(liveStreamOnlineInfo);
		}
		describeLiveStreamsOnlineListResponse.setOnlineInfo(onlineInfo);
	 
	 	return describeLiveStreamsOnlineListResponse;
	}
}