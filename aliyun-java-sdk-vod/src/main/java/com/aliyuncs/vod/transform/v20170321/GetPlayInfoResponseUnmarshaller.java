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

import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.PlayInfo;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.VideoBase;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.VideoBase.Thumbnail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlayInfoResponseUnmarshaller {

	public static GetPlayInfoResponse unmarshall(GetPlayInfoResponse getPlayInfoResponse, UnmarshallerContext context) {
		
		getPlayInfoResponse.setRequestId(context.stringValue("GetPlayInfoResponse.RequestId"));

		VideoBase videoBase = new VideoBase();
		videoBase.setOutputType(context.stringValue("GetPlayInfoResponse.VideoBase.OutputType"));
		videoBase.setCoverURL(context.stringValue("GetPlayInfoResponse.VideoBase.CoverURL"));
		videoBase.setDuration(context.stringValue("GetPlayInfoResponse.VideoBase.Duration"));
		videoBase.setStatus(context.stringValue("GetPlayInfoResponse.VideoBase.Status"));
		videoBase.setTitle(context.stringValue("GetPlayInfoResponse.VideoBase.Title"));
		videoBase.setVideoId(context.stringValue("GetPlayInfoResponse.VideoBase.VideoId"));
		videoBase.setMediaType(context.stringValue("GetPlayInfoResponse.VideoBase.MediaType"));
		videoBase.setCreationTime(context.stringValue("GetPlayInfoResponse.VideoBase.CreationTime"));
		videoBase.setTranscodeMode(context.stringValue("GetPlayInfoResponse.VideoBase.TranscodeMode"));

		List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
		for (int i = 0; i < context.lengthValue("GetPlayInfoResponse.VideoBase.ThumbnailList.Length"); i++) {
			Thumbnail thumbnail = new Thumbnail();
			thumbnail.setURL(context.stringValue("GetPlayInfoResponse.VideoBase.ThumbnailList["+ i +"].URL"));

			thumbnailList.add(thumbnail);
		}
		videoBase.setThumbnailList(thumbnailList);
		getPlayInfoResponse.setVideoBase(videoBase);

		List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
		for (int i = 0; i < context.lengthValue("GetPlayInfoResponse.PlayInfoList.Length"); i++) {
			PlayInfo playInfo = new PlayInfo();
			playInfo.setWidth(context.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Width"));
			playInfo.setHeight(context.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Height"));
			playInfo.setSize(context.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Size"));
			playInfo.setPlayURL(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].PlayURL"));
			playInfo.setBitrate(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Bitrate"));
			playInfo.setDefinition(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Definition"));
			playInfo.setDuration(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Duration"));
			playInfo.setFormat(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Format"));
			playInfo.setFps(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Fps"));
			playInfo.setEncrypt(context.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Encrypt"));
			playInfo.setPlaintext(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Plaintext"));
			playInfo.setComplexity(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Complexity"));
			playInfo.setStreamType(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].StreamType"));
			playInfo.setRand(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Rand"));
			playInfo.setJobId(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].JobId"));
			playInfo.setPreprocessStatus(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].PreprocessStatus"));
			playInfo.setWatermarkId(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].WatermarkId"));
			playInfo.setStatus(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Status"));
			playInfo.setCreationTime(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].CreationTime"));
			playInfo.setModificationTime(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].ModificationTime"));
			playInfo.setEncryptType(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].EncryptType"));
			playInfo.setNarrowBandType(context.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].NarrowBandType"));

			playInfoList.add(playInfo);
		}
		getPlayInfoResponse.setPlayInfoList(playInfoList);
	 
	 	return getPlayInfoResponse;
	}
}