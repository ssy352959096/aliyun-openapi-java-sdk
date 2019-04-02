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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeAuditPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditPolicyResponse extends AcsResponse {

	private String requestId;

	private String logAuditStatus;

	private Integer storagePeriod;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogAuditStatus() {
		return this.logAuditStatus;
	}

	public void setLogAuditStatus(String logAuditStatus) {
		this.logAuditStatus = logAuditStatus;
	}

	public Integer getStoragePeriod() {
		return this.storagePeriod;
	}

	public void setStoragePeriod(Integer storagePeriod) {
		this.storagePeriod = storagePeriod;
	}

	@Override
	public DescribeAuditPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
