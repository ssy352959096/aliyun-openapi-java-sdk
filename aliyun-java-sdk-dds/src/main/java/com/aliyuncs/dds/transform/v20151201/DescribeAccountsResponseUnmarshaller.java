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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAccountsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAccountsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setDBInstanceId(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DBInstanceId"));
			account.setAccountName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			account.setAccountStatus(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			account.setAccountDescription(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));

			accounts.add(account);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}