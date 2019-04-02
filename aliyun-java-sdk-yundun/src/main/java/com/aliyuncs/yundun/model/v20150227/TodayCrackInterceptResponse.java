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

package com.aliyuncs.yundun.model.v20150227;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150227.TodayCrackInterceptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TodayCrackInterceptResponse extends AcsResponse {

	private String requestId;

	private Long interceptNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getInterceptNum() {
		return this.interceptNum;
	}

	public void setInterceptNum(Long interceptNum) {
		this.interceptNum = interceptNum;
	}

	@Override
	public TodayCrackInterceptResponse getInstance(UnmarshallerContext context) {
		return	TodayCrackInterceptResponseUnmarshaller.unmarshall(this, context);
	}
}
