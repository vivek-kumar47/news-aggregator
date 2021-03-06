/*
 * Copyright IBM Corp. 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bluemix.newsaggregator.api;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class ResponseApproveNewsEntryDTO {

	public ResponseApproveNewsEntryDTO() {
	}
	
	private String newsEntryId;

	@ApiModelProperty(value = "ID of the approved news entry", required=true)
	public String getNewsEntryId() {
		return newsEntryId;
	}

	public void setNewsEntryId(String newsEntryId) {
		this.newsEntryId = newsEntryId;
	}

	private String tweetUrl;

	@ApiModelProperty(value = "Url of the tweet", required=false)
	public String getTweetUrl() {
		return tweetUrl;
	}

	public void setTweetUrl(String tweetUrl) {
		this.tweetUrl = tweetUrl;
	}
}
