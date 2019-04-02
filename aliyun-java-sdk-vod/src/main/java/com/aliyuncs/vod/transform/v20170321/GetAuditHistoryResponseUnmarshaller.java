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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetAuditHistoryResponse;
import com.aliyuncs.vod.model.v20170321.GetAuditHistoryResponse.History;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuditHistoryResponseUnmarshaller {

	public static GetAuditHistoryResponse unmarshall(GetAuditHistoryResponse getAuditHistoryResponse, UnmarshallerContext context) {
		
		getAuditHistoryResponse.setRequestId(context.stringValue("GetAuditHistoryResponse.RequestId"));
		getAuditHistoryResponse.setStatus(context.stringValue("GetAuditHistoryResponse.Status"));
		getAuditHistoryResponse.setTotal(context.longValue("GetAuditHistoryResponse.Total"));

		List<History> histories = new ArrayList<History>();
		for (int i = 0; i < context.lengthValue("GetAuditHistoryResponse.Histories.Length"); i++) {
			History history = new History();
			history.setCreationTime(context.stringValue("GetAuditHistoryResponse.Histories["+ i +"].CreationTime"));
			history.setStatus(context.stringValue("GetAuditHistoryResponse.Histories["+ i +"].Status"));
			history.setReason(context.stringValue("GetAuditHistoryResponse.Histories["+ i +"].Reason"));
			history.setComment(context.stringValue("GetAuditHistoryResponse.Histories["+ i +"].Comment"));
			history.setAuditor(context.stringValue("GetAuditHistoryResponse.Histories["+ i +"].Auditor"));

			histories.add(history);
		}
		getAuditHistoryResponse.setHistories(histories);
	 
	 	return getAuditHistoryResponse;
	}
}