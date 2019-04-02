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

package com.aliyuncs.ons.transform.v20190214;

import com.aliyuncs.ons.model.v20190214.OnsConsumerTimeSpanResponse;
import com.aliyuncs.ons.model.v20190214.OnsConsumerTimeSpanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerTimeSpanResponseUnmarshaller {

	public static OnsConsumerTimeSpanResponse unmarshall(OnsConsumerTimeSpanResponse onsConsumerTimeSpanResponse, UnmarshallerContext context) {
		
		onsConsumerTimeSpanResponse.setRequestId(context.stringValue("OnsConsumerTimeSpanResponse.RequestId"));
		onsConsumerTimeSpanResponse.setHelpUrl(context.stringValue("OnsConsumerTimeSpanResponse.HelpUrl"));

		Data data = new Data();
		data.setTopic(context.stringValue("OnsConsumerTimeSpanResponse.Data.Topic"));
		data.setMinTimeStamp(context.longValue("OnsConsumerTimeSpanResponse.Data.MinTimeStamp"));
		data.setMaxTimeStamp(context.longValue("OnsConsumerTimeSpanResponse.Data.MaxTimeStamp"));
		data.setConsumeTimeStamp(context.longValue("OnsConsumerTimeSpanResponse.Data.ConsumeTimeStamp"));
		data.setInstanceId(context.stringValue("OnsConsumerTimeSpanResponse.Data.InstanceId"));
		onsConsumerTimeSpanResponse.setData(data);
	 
	 	return onsConsumerTimeSpanResponse;
	}
}