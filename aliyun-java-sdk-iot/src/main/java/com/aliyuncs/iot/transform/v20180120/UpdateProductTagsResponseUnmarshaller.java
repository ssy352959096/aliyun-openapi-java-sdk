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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.UpdateProductTagsResponse;
import com.aliyuncs.iot.model.v20180120.UpdateProductTagsResponse.ProductTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProductTagsResponseUnmarshaller {

	public static UpdateProductTagsResponse unmarshall(UpdateProductTagsResponse updateProductTagsResponse, UnmarshallerContext context) {
		
		updateProductTagsResponse.setRequestId(context.stringValue("UpdateProductTagsResponse.RequestId"));
		updateProductTagsResponse.setSuccess(context.booleanValue("UpdateProductTagsResponse.Success"));
		updateProductTagsResponse.setErrorMessage(context.stringValue("UpdateProductTagsResponse.ErrorMessage"));
		updateProductTagsResponse.setCode(context.stringValue("UpdateProductTagsResponse.Code"));

		List<ProductTag> invalidProductTags = new ArrayList<ProductTag>();
		for (int i = 0; i < context.lengthValue("UpdateProductTagsResponse.InvalidProductTags.Length"); i++) {
			ProductTag productTag = new ProductTag();
			productTag.setTagKey(context.stringValue("UpdateProductTagsResponse.InvalidProductTags["+ i +"].TagKey"));
			productTag.setTagValue(context.stringValue("UpdateProductTagsResponse.InvalidProductTags["+ i +"].TagValue"));

			invalidProductTags.add(productTag);
		}
		updateProductTagsResponse.setInvalidProductTags(invalidProductTags);
	 
	 	return updateProductTagsResponse;
	}
}