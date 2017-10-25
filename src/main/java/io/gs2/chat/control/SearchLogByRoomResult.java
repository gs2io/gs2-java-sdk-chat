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

import java.util.List;

import io.gs2.chat.model.MessageLog;


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchLogByRoomResult {

	/** 次のページを読み込むためのトークン */
	private String nextPageToken;

	/** メッセージ */
	private List<MessageLog> items;

	/** 検索時にスキャンしたログデータサイズ */
	private Integer scanSize;


	/**
	 * 次のページを読み込むためのトークンを取得
	 *
	 * @return 次のページを読み込むためのトークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * 次のページを読み込むためのトークンを設定
	 *
	 * @param nextPageToken 次のページを読み込むためのトークン
	 */
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	/**
	 * メッセージを取得
	 *
	 * @return メッセージ
	 */
	public List<MessageLog> getItems() {
		return items;
	}

	/**
	 * メッセージを設定
	 *
	 * @param items メッセージ
	 */
	public void setItems(List<MessageLog> items) {
		this.items = items;
	}

	/**
	 * 検索時にスキャンしたログデータサイズを取得
	 *
	 * @return 検索時にスキャンしたログデータサイズ
	 */
	public Integer getScanSize() {
		return scanSize;
	}

	/**
	 * 検索時にスキャンしたログデータサイズを設定
	 *
	 * @param scanSize 検索時にスキャンしたログデータサイズ
	 */
	public void setScanSize(Integer scanSize) {
		this.scanSize = scanSize;
	}

}