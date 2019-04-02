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

package com.aliyuncs.itaas.model.v20170505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itaas.transform.v20170505.GetWelcomePageURIResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWelcomePageURIResponse extends AcsResponse {

	private String requestId;

	private String data;

	private Integer errorCode;

	private String errorMsg;

	private Boolean success;

	private List<ErrorMessage> errorList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ErrorMessage> getErrorList() {
		return this.errorList;
	}

	public void setErrorList(List<ErrorMessage> errorList) {
		this.errorList = errorList;
	}

	public static class ErrorMessage {

		private String errorMessage;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public GetWelcomePageURIResponse getInstance(UnmarshallerContext context) {
		return	GetWelcomePageURIResponseUnmarshaller.unmarshall(this, context);
	}
}
