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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingRulesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<ScalingRule> scalingRules;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScalingRule> getScalingRules() {
		return this.scalingRules;
	}

	public void setScalingRules(List<ScalingRule> scalingRules) {
		this.scalingRules = scalingRules;
	}

	public static class ScalingRule {

		private String scalingRuleId;

		private String scalingGroupId;

		private String scalingRuleName;

		private Integer cooldown;

		private String adjustmentType;

		private Integer adjustmentValue;

		private Integer minSize;

		private Integer maxSize;

		private String scalingRuleAri;

		private String scalingRuleType;

		private Integer estimatedInstanceWarmup;

		private String metricName;

		private Float targetValue;

		private Boolean disableScaleIn;

		private List<Alarm> alarms;

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getScalingRuleName() {
			return this.scalingRuleName;
		}

		public void setScalingRuleName(String scalingRuleName) {
			this.scalingRuleName = scalingRuleName;
		}

		public Integer getCooldown() {
			return this.cooldown;
		}

		public void setCooldown(Integer cooldown) {
			this.cooldown = cooldown;
		}

		public String getAdjustmentType() {
			return this.adjustmentType;
		}

		public void setAdjustmentType(String adjustmentType) {
			this.adjustmentType = adjustmentType;
		}

		public Integer getAdjustmentValue() {
			return this.adjustmentValue;
		}

		public void setAdjustmentValue(Integer adjustmentValue) {
			this.adjustmentValue = adjustmentValue;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public String getScalingRuleAri() {
			return this.scalingRuleAri;
		}

		public void setScalingRuleAri(String scalingRuleAri) {
			this.scalingRuleAri = scalingRuleAri;
		}

		public String getScalingRuleType() {
			return this.scalingRuleType;
		}

		public void setScalingRuleType(String scalingRuleType) {
			this.scalingRuleType = scalingRuleType;
		}

		public Integer getEstimatedInstanceWarmup() {
			return this.estimatedInstanceWarmup;
		}

		public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
			this.estimatedInstanceWarmup = estimatedInstanceWarmup;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Float getTargetValue() {
			return this.targetValue;
		}

		public void setTargetValue(Float targetValue) {
			this.targetValue = targetValue;
		}

		public Boolean getDisableScaleIn() {
			return this.disableScaleIn;
		}

		public void setDisableScaleIn(Boolean disableScaleIn) {
			this.disableScaleIn = disableScaleIn;
		}

		public List<Alarm> getAlarms() {
			return this.alarms;
		}

		public void setAlarms(List<Alarm> alarms) {
			this.alarms = alarms;
		}

		public static class Alarm {

			private String alarmTaskName;

			private String alarmTaskId;

			public String getAlarmTaskName() {
				return this.alarmTaskName;
			}

			public void setAlarmTaskName(String alarmTaskName) {
				this.alarmTaskName = alarmTaskName;
			}

			public String getAlarmTaskId() {
				return this.alarmTaskId;
			}

			public void setAlarmTaskId(String alarmTaskId) {
				this.alarmTaskId = alarmTaskId;
			}
		}
	}

	@Override
	public DescribeScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
