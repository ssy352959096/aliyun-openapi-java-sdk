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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListSnapshotsResponse;
import com.aliyuncs.vod.model.v20170321.ListSnapshotsResponse.MediaSnapshot;
import com.aliyuncs.vod.model.v20170321.ListSnapshotsResponse.MediaSnapshot.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotsResponseUnmarshaller {

	public static ListSnapshotsResponse unmarshall(ListSnapshotsResponse listSnapshotsResponse, UnmarshallerContext context) {
		
		listSnapshotsResponse.setRequestId(context.stringValue("ListSnapshotsResponse.RequestId"));

		MediaSnapshot mediaSnapshot = new MediaSnapshot();
		mediaSnapshot.setTotal(context.longValue("ListSnapshotsResponse.MediaSnapshot.Total"));
		mediaSnapshot.setRegular(context.stringValue("ListSnapshotsResponse.MediaSnapshot.Regular"));
		mediaSnapshot.setCreationTime(context.stringValue("ListSnapshotsResponse.MediaSnapshot.CreationTime"));
		mediaSnapshot.setJobId(context.stringValue("ListSnapshotsResponse.MediaSnapshot.JobId"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < context.lengthValue("ListSnapshotsResponse.MediaSnapshot.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setIndex(context.longValue("ListSnapshotsResponse.MediaSnapshot.Snapshots["+ i +"].Index"));
			snapshot.setUrl(context.stringValue("ListSnapshotsResponse.MediaSnapshot.Snapshots["+ i +"].Url"));

			snapshots.add(snapshot);
		}
		mediaSnapshot.setSnapshots(snapshots);
		listSnapshotsResponse.setMediaSnapshot(mediaSnapshot);
	 
	 	return listSnapshotsResponse;
	}
}