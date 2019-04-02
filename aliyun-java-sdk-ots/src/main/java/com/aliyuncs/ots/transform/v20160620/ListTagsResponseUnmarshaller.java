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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.ListTagsResponse;
import com.aliyuncs.ots.model.v20160620.ListTagsResponse.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext context) {
		
		listTagsResponse.setRequestId(context.stringValue("ListTagsResponse.RequestId"));
		listTagsResponse.setTotalCount(context.longValue("ListTagsResponse.TotalCount"));
		listTagsResponse.setPageNum(context.longValue("ListTagsResponse.PageNum"));
		listTagsResponse.setPageSize(context.longValue("ListTagsResponse.PageSize"));

		List<TagInfo> tagInfos = new ArrayList<TagInfo>();
		for (int i = 0; i < context.lengthValue("ListTagsResponse.TagInfos.Length"); i++) {
			TagInfo tagInfo = new TagInfo();
			tagInfo.setTagKey(context.stringValue("ListTagsResponse.TagInfos["+ i +"].TagKey"));
			tagInfo.setTagValue(context.stringValue("ListTagsResponse.TagInfos["+ i +"].TagValue"));

			tagInfos.add(tagInfo);
		}
		listTagsResponse.setTagInfos(tagInfos);
	 
	 	return listTagsResponse;
	}
}