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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse.DBAccount;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse.DBAccount.DatabasePrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

		List<DBAccount> accounts = new ArrayList<DBAccount>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBAccount dBAccount = new DBAccount();
			dBAccount.setAccountName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBAccount.setAccountStatus(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBAccount.setAccountDescription(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBAccount.setAccountType(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			dBAccount.setPrivilegeExceeded(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivilegeExceeded"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < context.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setDBName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));
				databasePrivilege.setAccountPrivilege(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));

				databasePrivileges.add(databasePrivilege);
			}
			dBAccount.setDatabasePrivileges(databasePrivileges);

			accounts.add(dBAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}