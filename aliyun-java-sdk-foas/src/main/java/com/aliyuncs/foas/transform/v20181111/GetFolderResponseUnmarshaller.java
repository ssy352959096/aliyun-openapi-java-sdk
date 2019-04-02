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

import com.aliyuncs.foas.model.v20181111.GetFolderResponse;
import com.aliyuncs.foas.model.v20181111.GetFolderResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFolderResponseUnmarshaller {

	public static GetFolderResponse unmarshall(GetFolderResponse getFolderResponse, UnmarshallerContext context) {
		
		getFolderResponse.setRequestId(context.stringValue("GetFolderResponse.RequestId"));

		Folder folder = new Folder();
		folder.setFolderId(context.longValue("GetFolderResponse.Folder.FolderId"));
		folder.setPath(context.stringValue("GetFolderResponse.Folder.Path"));
		getFolderResponse.setFolder(folder);
	 
	 	return getFolderResponse;
	}
}