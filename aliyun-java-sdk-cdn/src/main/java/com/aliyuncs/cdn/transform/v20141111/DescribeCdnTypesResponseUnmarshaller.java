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

import com.aliyuncs.cdn.model.v20141111.DescribeCdnTypesResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnTypesResponse.CdnType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnTypesResponseUnmarshaller {

	public static DescribeCdnTypesResponse unmarshall(DescribeCdnTypesResponse describeCdnTypesResponse, UnmarshallerContext context) {
		
		describeCdnTypesResponse.setRequestId(context.stringValue("DescribeCdnTypesResponse.RequestId"));

		List<CdnType> cdnTypes = new ArrayList<CdnType>();
		for (int i = 0; i < context.lengthValue("DescribeCdnTypesResponse.CdnTypes.Length"); i++) {
			CdnType cdnType = new CdnType();
			cdnType.setType(context.stringValue("DescribeCdnTypesResponse.CdnTypes["+ i +"].Type"));
			cdnType.setDesc(context.stringValue("DescribeCdnTypesResponse.CdnTypes["+ i +"].Desc"));

			cdnTypes.add(cdnType);
		}
		describeCdnTypesResponse.setCdnTypes(cdnTypes);
	 
	 	return describeCdnTypesResponse;
	}
}