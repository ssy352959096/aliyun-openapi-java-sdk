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

import com.aliyuncs.ons.model.v20190214.OnsMqttQueryClientByTopicResponse;
import com.aliyuncs.ons.model.v20190214.OnsMqttQueryClientByTopicResponse.MqttClientSetDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryClientByTopicResponseUnmarshaller {

	public static OnsMqttQueryClientByTopicResponse unmarshall(OnsMqttQueryClientByTopicResponse onsMqttQueryClientByTopicResponse, UnmarshallerContext context) {
		
		onsMqttQueryClientByTopicResponse.setRequestId(context.stringValue("OnsMqttQueryClientByTopicResponse.RequestId"));
		onsMqttQueryClientByTopicResponse.setHelpUrl(context.stringValue("OnsMqttQueryClientByTopicResponse.HelpUrl"));

		MqttClientSetDo mqttClientSetDo = new MqttClientSetDo();
		mqttClientSetDo.setOnlineCount(context.longValue("OnsMqttQueryClientByTopicResponse.MqttClientSetDo.OnlineCount"));
		mqttClientSetDo.setPersistCount(context.longValue("OnsMqttQueryClientByTopicResponse.MqttClientSetDo.PersistCount"));
		onsMqttQueryClientByTopicResponse.setMqttClientSetDo(mqttClientSetDo);
	 
	 	return onsMqttQueryClientByTopicResponse;
	}
}