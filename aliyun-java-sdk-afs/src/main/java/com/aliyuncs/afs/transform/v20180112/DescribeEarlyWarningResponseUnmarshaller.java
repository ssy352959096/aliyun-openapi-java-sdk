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

package com.aliyuncs.afs.transform.v20180112;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.afs.model.v20180112.DescribeEarlyWarningResponse;
import com.aliyuncs.afs.model.v20180112.DescribeEarlyWarningResponse.EarlyWarning;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEarlyWarningResponseUnmarshaller {

	public static DescribeEarlyWarningResponse unmarshall(DescribeEarlyWarningResponse describeEarlyWarningResponse, UnmarshallerContext context) {
		
		describeEarlyWarningResponse.setRequestId(context.stringValue("DescribeEarlyWarningResponse.RequestId"));
		describeEarlyWarningResponse.setHasWarning(context.booleanValue("DescribeEarlyWarningResponse.HasWarning"));
		describeEarlyWarningResponse.setBizCode(context.stringValue("DescribeEarlyWarningResponse.BizCode"));

		List<EarlyWarning> earlyWarnings = new ArrayList<EarlyWarning>();
		for (int i = 0; i < context.lengthValue("DescribeEarlyWarningResponse.EarlyWarnings.Length"); i++) {
			EarlyWarning earlyWarning = new EarlyWarning();
			earlyWarning.setWarnOpen(context.booleanValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].WarnOpen"));
			earlyWarning.setTitle(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].Title"));
			earlyWarning.setContent(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].Content"));
			earlyWarning.setFrequency(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].Frequency"));
			earlyWarning.setTimeOpen(context.booleanValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].TimeOpen"));
			earlyWarning.setTimeBegin(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].TimeBegin"));
			earlyWarning.setTimeEnd(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].TimeEnd"));
			earlyWarning.setChannel(context.stringValue("DescribeEarlyWarningResponse.EarlyWarnings["+ i +"].Channel"));

			earlyWarnings.add(earlyWarning);
		}
		describeEarlyWarningResponse.setEarlyWarnings(earlyWarnings);
	 
	 	return describeEarlyWarningResponse;
	}
}