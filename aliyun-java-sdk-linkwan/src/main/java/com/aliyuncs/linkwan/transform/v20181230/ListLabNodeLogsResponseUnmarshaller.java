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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListLabNodeLogsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListLabNodeLogsResponse.LabNodeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabNodeLogsResponseUnmarshaller {

	public static ListLabNodeLogsResponse unmarshall(ListLabNodeLogsResponse listLabNodeLogsResponse, UnmarshallerContext context) {
		
		listLabNodeLogsResponse.setRequestId(context.stringValue("ListLabNodeLogsResponse.RequestId"));
		listLabNodeLogsResponse.setSuccess(context.booleanValue("ListLabNodeLogsResponse.Success"));

		List<LabNodeLog> data = new ArrayList<LabNodeLog>();
		for (int i = 0; i < context.lengthValue("ListLabNodeLogsResponse.Data.Length"); i++) {
			LabNodeLog labNodeLog = new LabNodeLog();
			labNodeLog.setLogType(context.stringValue("ListLabNodeLogsResponse.Data["+ i +"].LogType"));
			labNodeLog.setLogMillis(context.longValue("ListLabNodeLogsResponse.Data["+ i +"].LogMillis"));
			labNodeLog.setContent(context.stringValue("ListLabNodeLogsResponse.Data["+ i +"].Content"));

			data.add(labNodeLog);
		}
		listLabNodeLogsResponse.setData(data);
	 
	 	return listLabNodeLogsResponse;
	}
}