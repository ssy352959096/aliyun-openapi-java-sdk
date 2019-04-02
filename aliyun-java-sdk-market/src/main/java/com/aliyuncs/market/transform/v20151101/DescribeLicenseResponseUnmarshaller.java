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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License.ExtendInfo;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License.LicenseAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLicenseResponseUnmarshaller {

	public static DescribeLicenseResponse unmarshall(DescribeLicenseResponse describeLicenseResponse, UnmarshallerContext context) {
		
		describeLicenseResponse.setRequestId(context.stringValue("DescribeLicenseResponse.RequestId"));

		License license = new License();
		license.setLicenseStatus(context.stringValue("DescribeLicenseResponse.License.LicenseStatus"));
		license.setLicenseCode(context.stringValue("DescribeLicenseResponse.License.LicenseCode"));
		license.setInstanceId(context.stringValue("DescribeLicenseResponse.License.InstanceId"));
		license.setCreateTime(context.stringValue("DescribeLicenseResponse.License.CreateTime"));
		license.setExpiredTime(context.stringValue("DescribeLicenseResponse.License.ExpiredTime"));
		license.setActivateTime(context.stringValue("DescribeLicenseResponse.License.ActivateTime"));
		license.setProductSkuId(context.stringValue("DescribeLicenseResponse.License.ProductSkuId"));
		license.setProductCode(context.stringValue("DescribeLicenseResponse.License.ProductCode"));
		license.setProductName(context.stringValue("DescribeLicenseResponse.License.ProductName"));

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setAliUid(context.longValue("DescribeLicenseResponse.License.ExtendInfo.AliUid"));
		extendInfo.setEmail(context.stringValue("DescribeLicenseResponse.License.ExtendInfo.Email"));
		extendInfo.setMobile(context.stringValue("DescribeLicenseResponse.License.ExtendInfo.Mobile"));
		extendInfo.setAccountQuantity(context.longValue("DescribeLicenseResponse.License.ExtendInfo.AccountQuantity"));
		license.setExtendInfo(extendInfo);

		List<LicenseAttribute> extendArray = new ArrayList<LicenseAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeLicenseResponse.License.ExtendArray.Length"); i++) {
			LicenseAttribute licenseAttribute = new LicenseAttribute();
			licenseAttribute.setCode(context.stringValue("DescribeLicenseResponse.License.ExtendArray["+ i +"].Code"));
			licenseAttribute.setValue(context.stringValue("DescribeLicenseResponse.License.ExtendArray["+ i +"].Value"));

			extendArray.add(licenseAttribute);
		}
		license.setExtendArray(extendArray);
		describeLicenseResponse.setLicense(license);
	 
	 	return describeLicenseResponse;
	}
}