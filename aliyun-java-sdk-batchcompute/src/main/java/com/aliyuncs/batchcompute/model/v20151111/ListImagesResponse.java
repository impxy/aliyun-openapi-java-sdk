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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Image;
import com.aliyuncs.batchcompute.transform.v20151111.ListImagesResponseUnmarshaller;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ListImagesResponse extends BatchComputeResponse {

	public String getNextMarker() {
		return nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<Image> getItems() {
		return items;
	}

	public void setItems(List<Image> items) {
		this.items = items;
	}

	private String nextMarker;
	private List<Image> items;


	@Override
	public ListImagesResponse getInstance(UnmarshallerContext context) throws ServerException {
		return	ListImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
