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

package com.aliyuncs.oms.model.v20150212;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetProductDefineRequest extends RpcAcsRequest<GetProductDefineResponse> {
	
	public GetProductDefineRequest() {
		super("Oms", "2015-02-12", "GetProductDefine", "oms");
	}

	private String dataType;

	private String productName;

	private String siteBid;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getSiteBid() {
		return this.siteBid;
	}

	public void setSiteBid(String siteBid) {
		this.siteBid = siteBid;
		if(siteBid != null){
			putQueryParameter("siteBid", siteBid);
		}
	}

	@Override
	public Class<GetProductDefineResponse> getResponseClass() {
		return GetProductDefineResponse.class;
	}

}
