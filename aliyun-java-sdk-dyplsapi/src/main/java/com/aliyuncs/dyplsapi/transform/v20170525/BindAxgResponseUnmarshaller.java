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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.BindAxgResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindAxgResponse.SecretBindDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAxgResponseUnmarshaller {

	public static BindAxgResponse unmarshall(BindAxgResponse bindAxgResponse, UnmarshallerContext context) {
		
		bindAxgResponse.setRequestId(context.stringValue("BindAxgResponse.RequestId"));
		bindAxgResponse.setCode(context.stringValue("BindAxgResponse.Code"));
		bindAxgResponse.setMessage(context.stringValue("BindAxgResponse.Message"));

		SecretBindDTO secretBindDTO = new SecretBindDTO();
		secretBindDTO.setSubsId(context.stringValue("BindAxgResponse.SecretBindDTO.SubsId"));
		secretBindDTO.setSecretNo(context.stringValue("BindAxgResponse.SecretBindDTO.SecretNo"));
		secretBindDTO.setExtension(context.stringValue("BindAxgResponse.SecretBindDTO.Extension"));
		bindAxgResponse.setSecretBindDTO(secretBindDTO);
	 
	 	return bindAxgResponse;
	}
}