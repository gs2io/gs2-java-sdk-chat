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

package io.gs2.chat.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * メッセージ
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message implements Serializable {

	/** 発言者ユーザID */
	private String userId;

	/** メッセージテキスト */
	private String message;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** メッセージメタデータ */
	private String meta;

	/** メッセージID */
	private String messageId;


	/**
	 * 発言者ユーザIDを取得
	 *
	 * @return 発言者ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 発言者ユーザIDを設定
	 *
	 * @param userId 発言者ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * メッセージテキストを取得
	 *
	 * @return メッセージテキスト
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * メッセージテキストを設定
	 *
	 * @param message メッセージテキスト
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * メッセージメタデータを取得
	 *
	 * @return メッセージメタデータ
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * メッセージメタデータを設定
	 *
	 * @param meta メッセージメタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}

	/**
	 * メッセージIDを取得
	 *
	 * @return メッセージID
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * メッセージIDを設定
	 *
	 * @param messageId メッセージID
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}