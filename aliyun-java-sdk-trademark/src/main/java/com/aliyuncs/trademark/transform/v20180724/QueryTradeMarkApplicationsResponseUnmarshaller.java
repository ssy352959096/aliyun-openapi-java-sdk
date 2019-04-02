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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.RenewResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.ThirdClassifications;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationsResponseUnmarshaller {

	public static QueryTradeMarkApplicationsResponse unmarshall(QueryTradeMarkApplicationsResponse queryTradeMarkApplicationsResponse, UnmarshallerContext context) {
		
		queryTradeMarkApplicationsResponse.setRequestId(context.stringValue("QueryTradeMarkApplicationsResponse.RequestId"));
		queryTradeMarkApplicationsResponse.setTotalItemNum(context.integerValue("QueryTradeMarkApplicationsResponse.TotalItemNum"));
		queryTradeMarkApplicationsResponse.setCurrentPageNum(context.integerValue("QueryTradeMarkApplicationsResponse.CurrentPageNum"));
		queryTradeMarkApplicationsResponse.setPageSize(context.integerValue("QueryTradeMarkApplicationsResponse.PageSize"));
		queryTradeMarkApplicationsResponse.setTotalPageNum(context.integerValue("QueryTradeMarkApplicationsResponse.TotalPageNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < context.lengthValue("QueryTradeMarkApplicationsResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setBizId(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].BizId"));
			tmProduces.setOrderId(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderId"));
			tmProduces.setMaterialName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialName"));
			tmProduces.setTmIcon(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmName"));
			tmProduces.setTmNumber(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmNumber"));
			tmProduces.setCreateTime(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].CreateTime"));
			tmProduces.setType(context.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(context.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Status"));
			tmProduces.setUserId(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UserId"));
			tmProduces.setOrderPrice(context.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setMaterialId(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialId"));
			tmProduces.setLoaUrl(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setNote(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Note"));
			tmProduces.setUpdateTime(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setSupplementStatus(context.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementStatus"));
			tmProduces.setSupplementId(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementId"));

			List<String> flags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags.Length"); j++) {
				flags.add(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags["+ j +"]"));
			}
			tmProduces.setFlags(flags);

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationCode(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationCode"));
			firstClassification.setClassificationName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationName"));
			tmProduces.setFirstClassification(firstClassification);

			RenewResponse renewResponse = new RenewResponse();
			renewResponse.setName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Name"));
			renewResponse.setEngName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngName"));
			renewResponse.setAddress(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Address"));
			renewResponse.setEngAddress(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngAddress"));
			renewResponse.setRegisterTime(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.RegisterTime"));
			renewResponse.setSubmitSbjtime(context.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.SubmitSbjtime"));
			tmProduces.setRenewResponse(renewResponse);

			List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
			for (int j = 0; j < context.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassifications thirdClassifications = new ThirdClassifications();
				thirdClassifications.setClassificationCode(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));
				thirdClassifications.setClassificationName(context.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationName"));

				thirdClassification.add(thirdClassifications);
			}
			tmProduces.setThirdClassification(thirdClassification);

			data.add(tmProduces);
		}
		queryTradeMarkApplicationsResponse.setData(data);
	 
	 	return queryTradeMarkApplicationsResponse;
	}
}