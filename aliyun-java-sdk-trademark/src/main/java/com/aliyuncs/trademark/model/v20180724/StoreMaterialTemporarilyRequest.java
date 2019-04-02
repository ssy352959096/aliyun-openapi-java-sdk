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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class StoreMaterialTemporarilyRequest extends RpcAcsRequest<StoreMaterialTemporarilyResponse> {
	
	public StoreMaterialTemporarilyRequest() {
		super("Trademark", "2018-07-24", "StoreMaterialTemporarily", "trademark");
	}

	private String contactEmail;

	private String contactAddress;

	private String eAddress;

	private String country;

	private String legalNoticeOssKey;

	private String address;

	private String town;

	private String contactNumber;

	private String city;

	private String idCardOssKey;

	private String type;

	private String contactName;

	private String passportOssKey;

	private String contactZipcode;

	private String eName;

	private String province;

	private String businessLicenceOssKey;

	private String name;

	private String cardNumber;

	private String region;

	private String loaOssKey;

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		if(contactEmail != null){
			putQueryParameter("ContactEmail", contactEmail);
		}
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		if(contactAddress != null){
			putQueryParameter("ContactAddress", contactAddress);
		}
	}

	public String getEAddress() {
		return this.eAddress;
	}

	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
		if(eAddress != null){
			putQueryParameter("EAddress", eAddress);
		}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getLegalNoticeOssKey() {
		return this.legalNoticeOssKey;
	}

	public void setLegalNoticeOssKey(String legalNoticeOssKey) {
		this.legalNoticeOssKey = legalNoticeOssKey;
		if(legalNoticeOssKey != null){
			putQueryParameter("LegalNoticeOssKey", legalNoticeOssKey);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
		if(town != null){
			putQueryParameter("Town", town);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putQueryParameter("ContactNumber", contactNumber);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getIdCardOssKey() {
		return this.idCardOssKey;
	}

	public void setIdCardOssKey(String idCardOssKey) {
		this.idCardOssKey = idCardOssKey;
		if(idCardOssKey != null){
			putQueryParameter("IdCardOssKey", idCardOssKey);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getPassportOssKey() {
		return this.passportOssKey;
	}

	public void setPassportOssKey(String passportOssKey) {
		this.passportOssKey = passportOssKey;
		if(passportOssKey != null){
			putQueryParameter("PassportOssKey", passportOssKey);
		}
	}

	public String getContactZipcode() {
		return this.contactZipcode;
	}

	public void setContactZipcode(String contactZipcode) {
		this.contactZipcode = contactZipcode;
		if(contactZipcode != null){
			putQueryParameter("ContactZipcode", contactZipcode);
		}
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
		if(eName != null){
			putQueryParameter("EName", eName);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getBusinessLicenceOssKey() {
		return this.businessLicenceOssKey;
	}

	public void setBusinessLicenceOssKey(String businessLicenceOssKey) {
		this.businessLicenceOssKey = businessLicenceOssKey;
		if(businessLicenceOssKey != null){
			putQueryParameter("BusinessLicenceOssKey", businessLicenceOssKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getLoaOssKey() {
		return this.loaOssKey;
	}

	public void setLoaOssKey(String loaOssKey) {
		this.loaOssKey = loaOssKey;
		if(loaOssKey != null){
			putQueryParameter("LoaOssKey", loaOssKey);
		}
	}

	@Override
	public Class<StoreMaterialTemporarilyResponse> getResponseClass() {
		return StoreMaterialTemporarilyResponse.class;
	}

}
