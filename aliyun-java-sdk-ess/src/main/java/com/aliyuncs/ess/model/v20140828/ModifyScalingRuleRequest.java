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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingRuleRequest extends RpcAcsRequest<ModifyScalingRuleResponse> {
	
	public ModifyScalingRuleRequest() {
		super("Ess", "2014-08-28", "ModifyScalingRule", "ess");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Integer adjustmentValue;

	private Integer estimatedInstanceWarmup;

	private String ownerAccount;

	private String adjustmentType;

	private Boolean disableScaleIn;

	private Long ownerId;

	private String scalingRuleId;

	private String scalingRuleName;

	private Integer cooldown;

	private Float targetValue;

	private String metricName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
		}
	}

	public Integer getEstimatedInstanceWarmup() {
		return this.estimatedInstanceWarmup;
	}

	public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
		this.estimatedInstanceWarmup = estimatedInstanceWarmup;
		if(estimatedInstanceWarmup != null){
			putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
		if(adjustmentType != null){
			putQueryParameter("AdjustmentType", adjustmentType);
		}
	}

	public Boolean getDisableScaleIn() {
		return this.disableScaleIn;
	}

	public void setDisableScaleIn(Boolean disableScaleIn) {
		this.disableScaleIn = disableScaleIn;
		if(disableScaleIn != null){
			putQueryParameter("DisableScaleIn", disableScaleIn.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScalingRuleId() {
		return this.scalingRuleId;
	}

	public void setScalingRuleId(String scalingRuleId) {
		this.scalingRuleId = scalingRuleId;
		if(scalingRuleId != null){
			putQueryParameter("ScalingRuleId", scalingRuleId);
		}
	}

	public String getScalingRuleName() {
		return this.scalingRuleName;
	}

	public void setScalingRuleName(String scalingRuleName) {
		this.scalingRuleName = scalingRuleName;
		if(scalingRuleName != null){
			putQueryParameter("ScalingRuleName", scalingRuleName);
		}
	}

	public Integer getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
		if(cooldown != null){
			putQueryParameter("Cooldown", cooldown.toString());
		}
	}

	public Float getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(Float targetValue) {
		this.targetValue = targetValue;
		if(targetValue != null){
			putQueryParameter("TargetValue", targetValue.toString());
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	@Override
	public Class<ModifyScalingRuleResponse> getResponseClass() {
		return ModifyScalingRuleResponse.class;
	}

}
