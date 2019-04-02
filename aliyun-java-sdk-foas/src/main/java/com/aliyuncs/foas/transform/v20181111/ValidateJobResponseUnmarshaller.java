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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ValidateJobResponse;
import com.aliyuncs.foas.model.v20181111.ValidateJobResponse.JobInOut;
import com.aliyuncs.foas.model.v20181111.ValidateJobResponse.JobInOut.Input;
import com.aliyuncs.foas.model.v20181111.ValidateJobResponse.JobInOut.Output;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateJobResponseUnmarshaller {

	public static ValidateJobResponse unmarshall(ValidateJobResponse validateJobResponse, UnmarshallerContext context) {
		
		validateJobResponse.setRequestId(context.stringValue("ValidateJobResponse.RequestId"));

		JobInOut jobInOut = new JobInOut();

		List<Input> inputs = new ArrayList<Input>();
		for (int i = 0; i < context.lengthValue("ValidateJobResponse.JobInOut.Inputs.Length"); i++) {
			Input input = new Input();
			input.setType(context.stringValue("ValidateJobResponse.JobInOut.Inputs["+ i +"].Type"));
			input.setWorkspace(context.stringValue("ValidateJobResponse.JobInOut.Inputs["+ i +"].Workspace"));
			input.setName(context.stringValue("ValidateJobResponse.JobInOut.Inputs["+ i +"].Name"));
			input.setProperties(context.mapValue("ValidateJobResponse.JobInOut.Inputs["+ i +"].Properties"));

			inputs.add(input);
		}
		jobInOut.setInputs(inputs);

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < context.lengthValue("ValidateJobResponse.JobInOut.Outputs.Length"); i++) {
			Output output = new Output();
			output.setType(context.stringValue("ValidateJobResponse.JobInOut.Outputs["+ i +"].Type"));
			output.setWorkspace(context.stringValue("ValidateJobResponse.JobInOut.Outputs["+ i +"].Workspace"));
			output.setName(context.stringValue("ValidateJobResponse.JobInOut.Outputs["+ i +"].Name"));
			output.setProperties(context.mapValue("ValidateJobResponse.JobInOut.Outputs["+ i +"].Properties"));

			outputs.add(output);
		}
		jobInOut.setOutputs(outputs);
		validateJobResponse.setJobInOut(jobInOut);
	 
	 	return validateJobResponse;
	}
}