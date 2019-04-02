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

package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.SetWelcomePageURIResponse;
import com.aliyuncs.itaas.model.v20170505.SetWelcomePageURIResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetWelcomePageURIResponseUnmarshaller {

	public static SetWelcomePageURIResponse unmarshall(SetWelcomePageURIResponse setWelcomePageURIResponse, UnmarshallerContext context) {
		
		setWelcomePageURIResponse.setRequestId(context.stringValue("SetWelcomePageURIResponse.RequestId"));
		setWelcomePageURIResponse.setErrorCode(context.integerValue("SetWelcomePageURIResponse.ErrorCode"));
		setWelcomePageURIResponse.setErrorMsg(context.stringValue("SetWelcomePageURIResponse.ErrorMsg"));
		setWelcomePageURIResponse.setSuccess(context.booleanValue("SetWelcomePageURIResponse.Success"));

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("SetWelcomePageURIResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("SetWelcomePageURIResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		setWelcomePageURIResponse.setErrorList(errorList);
	 
	 	return setWelcomePageURIResponse;
	}
}