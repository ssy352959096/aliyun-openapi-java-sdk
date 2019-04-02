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

import com.aliyuncs.trademark.model.v20180724.DeleteTmMonitorRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTmMonitorRuleResponseUnmarshaller {

	public static DeleteTmMonitorRuleResponse unmarshall(DeleteTmMonitorRuleResponse deleteTmMonitorRuleResponse, UnmarshallerContext context) {
		
		deleteTmMonitorRuleResponse.setRequestId(context.stringValue("DeleteTmMonitorRuleResponse.RequestId"));
		deleteTmMonitorRuleResponse.setSuccess(context.booleanValue("DeleteTmMonitorRuleResponse.Success"));
		deleteTmMonitorRuleResponse.setErrorMsg(context.stringValue("DeleteTmMonitorRuleResponse.ErrorMsg"));
		deleteTmMonitorRuleResponse.setErrorCode(context.stringValue("DeleteTmMonitorRuleResponse.ErrorCode"));
	 
	 	return deleteTmMonitorRuleResponse;
	}
}