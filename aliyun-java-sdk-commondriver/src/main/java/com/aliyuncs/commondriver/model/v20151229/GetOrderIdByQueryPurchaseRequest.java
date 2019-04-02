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

package com.aliyuncs.commondriver.model.v20151229;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetOrderIdByQueryPurchaseRequest extends RpcAcsRequest<GetOrderIdByQueryPurchaseResponse> {
	
	public GetOrderIdByQueryPurchaseRequest() {
		super("Commondriver", "2015-12-29", "GetOrderIdByQueryPurchase", "commondriver");
	}

	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("orderId", orderId);
		}
	}

	@Override
	public Class<GetOrderIdByQueryPurchaseResponse> getResponseClass() {
		return GetOrderIdByQueryPurchaseResponse.class;
	}

}
