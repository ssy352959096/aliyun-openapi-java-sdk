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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsConsumerGetConnectionResponse;
import com.aliyuncs.ons.model.v20190214.OnsConsumerGetConnectionResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsConsumerGetConnectionResponse.Data.ConnectionDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerGetConnectionResponseUnmarshaller {

	public static OnsConsumerGetConnectionResponse unmarshall(OnsConsumerGetConnectionResponse onsConsumerGetConnectionResponse, UnmarshallerContext context) {
		
		onsConsumerGetConnectionResponse.setRequestId(context.stringValue("OnsConsumerGetConnectionResponse.RequestId"));
		onsConsumerGetConnectionResponse.setHelpUrl(context.stringValue("OnsConsumerGetConnectionResponse.HelpUrl"));

		Data data = new Data();

		List<ConnectionDo> connectionList = new ArrayList<ConnectionDo>();
		for (int i = 0; i < context.lengthValue("OnsConsumerGetConnectionResponse.Data.ConnectionList.Length"); i++) {
			ConnectionDo connectionDo = new ConnectionDo();
			connectionDo.setClientId(context.stringValue("OnsConsumerGetConnectionResponse.Data.ConnectionList["+ i +"].ClientId"));
			connectionDo.setClientAddr(context.stringValue("OnsConsumerGetConnectionResponse.Data.ConnectionList["+ i +"].ClientAddr"));
			connectionDo.setLanguage(context.stringValue("OnsConsumerGetConnectionResponse.Data.ConnectionList["+ i +"].Language"));
			connectionDo.setVersion(context.stringValue("OnsConsumerGetConnectionResponse.Data.ConnectionList["+ i +"].Version"));

			connectionList.add(connectionDo);
		}
		data.setConnectionList(connectionList);
		onsConsumerGetConnectionResponse.setData(data);
	 
	 	return onsConsumerGetConnectionResponse;
	}
}