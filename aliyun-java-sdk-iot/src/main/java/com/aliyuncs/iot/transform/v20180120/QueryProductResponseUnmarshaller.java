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

import com.aliyuncs.iot.model.v20180120.QueryProductResponse;
import com.aliyuncs.iot.model.v20180120.QueryProductResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductResponseUnmarshaller {

	public static QueryProductResponse unmarshall(QueryProductResponse queryProductResponse, UnmarshallerContext context) {
		
		queryProductResponse.setRequestId(context.stringValue("QueryProductResponse.RequestId"));
		queryProductResponse.setSuccess(context.booleanValue("QueryProductResponse.Success"));
		queryProductResponse.setCode(context.stringValue("QueryProductResponse.Code"));
		queryProductResponse.setErrorMessage(context.stringValue("QueryProductResponse.ErrorMessage"));

		Data data = new Data();
		data.setGmtCreate(context.longValue("QueryProductResponse.Data.GmtCreate"));
		data.setDataFormat(context.integerValue("QueryProductResponse.Data.DataFormat"));
		data.setDescription(context.stringValue("QueryProductResponse.Data.Description"));
		data.setDeviceCount(context.integerValue("QueryProductResponse.Data.DeviceCount"));
		data.setNodeType(context.integerValue("QueryProductResponse.Data.NodeType"));
		data.setProductKey(context.stringValue("QueryProductResponse.Data.ProductKey"));
		data.setProductName(context.stringValue("QueryProductResponse.Data.ProductName"));
		data.setProductSecret(context.stringValue("QueryProductResponse.Data.ProductSecret"));
		data.setCategoryName(context.stringValue("QueryProductResponse.Data.CategoryName"));
		data.setCategoryKey(context.stringValue("QueryProductResponse.Data.CategoryKey"));
		data.setAliyunCommodityCode(context.stringValue("QueryProductResponse.Data.AliyunCommodityCode"));
		data.setId2(context.booleanValue("QueryProductResponse.Data.Id2"));
		data.setProtocolType(context.stringValue("QueryProductResponse.Data.ProtocolType"));
		data.setProductStatus(context.stringValue("QueryProductResponse.Data.ProductStatus"));
		data.setOwner(context.booleanValue("QueryProductResponse.Data.Owner"));
		data.setNetType(context.integerValue("QueryProductResponse.Data.NetType"));
		queryProductResponse.setData(data);
	 
	 	return queryProductResponse;
	}
}