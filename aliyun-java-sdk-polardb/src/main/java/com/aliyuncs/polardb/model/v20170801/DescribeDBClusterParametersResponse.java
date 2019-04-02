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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterParametersResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String dBType;

	private String dBVersion;

	private List<Parameter> runningParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public List<Parameter> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<Parameter> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public static class Parameter {

		private String parameterName;

		private String dataType;

		private String defaultParameterValue;

		private String parameterValue;

		private Boolean isModifiable;

		private Boolean forceRestart;

		private String parameterStatus;

		private String checkingCode;

		private String parameterDescription;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getDefaultParameterValue() {
			return this.defaultParameterValue;
		}

		public void setDefaultParameterValue(String defaultParameterValue) {
			this.defaultParameterValue = defaultParameterValue;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public Boolean getIsModifiable() {
			return this.isModifiable;
		}

		public void setIsModifiable(Boolean isModifiable) {
			this.isModifiable = isModifiable;
		}

		public Boolean getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(Boolean forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getParameterStatus() {
			return this.parameterStatus;
		}

		public void setParameterStatus(String parameterStatus) {
			this.parameterStatus = parameterStatus;
		}

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}
	}

	@Override
	public DescribeDBClusterParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
