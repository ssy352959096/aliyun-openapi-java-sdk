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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamOnlineUserNumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamOnlineUserNumResponse extends AcsResponse {

	private String requestId;

	private Long totalUserNumber;

	private List<LiveStreamOnlineUserNumInfo> onlineUserInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalUserNumber() {
		return this.totalUserNumber;
	}

	public void setTotalUserNumber(Long totalUserNumber) {
		this.totalUserNumber = totalUserNumber;
	}

	public List<LiveStreamOnlineUserNumInfo> getOnlineUserInfo() {
		return this.onlineUserInfo;
	}

	public void setOnlineUserInfo(List<LiveStreamOnlineUserNumInfo> onlineUserInfo) {
		this.onlineUserInfo = onlineUserInfo;
	}

	public static class LiveStreamOnlineUserNumInfo {

		private String streamUrl;

		private Long userNumber;

		private String time;

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public Long getUserNumber() {
			return this.userNumber;
		}

		public void setUserNumber(Long userNumber) {
			this.userNumber = userNumber;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeLiveStreamOnlineUserNumResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamOnlineUserNumResponseUnmarshaller.unmarshall(this, context);
	}
}
