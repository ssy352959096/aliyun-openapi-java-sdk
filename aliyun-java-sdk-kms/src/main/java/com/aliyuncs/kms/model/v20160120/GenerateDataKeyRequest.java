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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GenerateDataKeyRequest extends RpcAcsRequest<GenerateDataKeyResponse> {
	
	public GenerateDataKeyRequest() {
		super("Kms", "2016-01-20", "GenerateDataKey", "kms");
		setProtocol(ProtocolType.HTTPS);
	}

	private String encryptionContext;

	private String keyId;

	private String keySpec;

	private String sTSToken;

	private Integer numberOfBytes;

	public String getEncryptionContext() {
		return this.encryptionContext;
	}

	public void setEncryptionContext(String encryptionContext) {
		this.encryptionContext = encryptionContext;
		if(encryptionContext != null){
			putQueryParameter("EncryptionContext", encryptionContext);
		}
	}

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
		if(keyId != null){
			putQueryParameter("KeyId", keyId);
		}
	}

	public String getKeySpec() {
		return this.keySpec;
	}

	public void setKeySpec(String keySpec) {
		this.keySpec = keySpec;
		if(keySpec != null){
			putQueryParameter("KeySpec", keySpec);
		}
	}

	public String getSTSToken() {
		return this.sTSToken;
	}

	public void setSTSToken(String sTSToken) {
		this.sTSToken = sTSToken;
		if(sTSToken != null){
			putQueryParameter("STSToken", sTSToken);
		}
	}

	public Integer getNumberOfBytes() {
		return this.numberOfBytes;
	}

	public void setNumberOfBytes(Integer numberOfBytes) {
		this.numberOfBytes = numberOfBytes;
		if(numberOfBytes != null){
			putQueryParameter("NumberOfBytes", numberOfBytes.toString());
		}
	}

	@Override
	public Class<GenerateDataKeyResponse> getResponseClass() {
		return GenerateDataKeyResponse.class;
	}

}
