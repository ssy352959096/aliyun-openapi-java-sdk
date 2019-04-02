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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetMediaAuditResultDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaAuditResultDetailResponse extends AcsResponse {

	private String requestId;

	private MediaAuditResultDetail mediaAuditResultDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaAuditResultDetail getMediaAuditResultDetail() {
		return this.mediaAuditResultDetail;
	}

	public void setMediaAuditResultDetail(MediaAuditResultDetail mediaAuditResultDetail) {
		this.mediaAuditResultDetail = mediaAuditResultDetail;
	}

	public static class MediaAuditResultDetail {

		private Integer total;

		private List<ListItem> list;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String pornLabel;

			private String pornScore;

			private String terrorismLabel;

			private String terrorismScore;

			private String timestamp;

			private String url;

			public String getPornLabel() {
				return this.pornLabel;
			}

			public void setPornLabel(String pornLabel) {
				this.pornLabel = pornLabel;
			}

			public String getPornScore() {
				return this.pornScore;
			}

			public void setPornScore(String pornScore) {
				this.pornScore = pornScore;
			}

			public String getTerrorismLabel() {
				return this.terrorismLabel;
			}

			public void setTerrorismLabel(String terrorismLabel) {
				this.terrorismLabel = terrorismLabel;
			}

			public String getTerrorismScore() {
				return this.terrorismScore;
			}

			public void setTerrorismScore(String terrorismScore) {
				this.terrorismScore = terrorismScore;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public String getBizUrl() {
				return this.url;
			}

			public void setBizUrl(String url) {
				this.url = url;
			}

			/**
			 * @deprecated use getBizUrl instead of this.
			 */
			@Deprecated
			public String getUrl() {
				return this.url;
			}

			/**
			 * @deprecated use setBizUrl instead of this.
			 */
			@Deprecated
			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public GetMediaAuditResultDetailResponse getInstance(UnmarshallerContext context) {
		return	GetMediaAuditResultDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
