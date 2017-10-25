/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.chat.control;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.chat.model.Room;


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetRoomResult {

	/** ルーム */
	private Room item;


	/**
	 * ルームを取得
	 *
	 * @return ルーム
	 */
	public Room getItem() {
		return item;
	}

	/**
	 * ルームを設定
	 *
	 * @param item ルーム
	 */
	public void setItem(Room item) {
		this.item = item;
	}

}