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
 * 購読
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Subscribe implements Serializable {

	/** ルームID */
	private String roomId;

	/** ユーザID */
	private String userId;

	/** オフライン転送を使用するか */
	private Boolean enableOfflineTransfer;

	/** 通知音 */
	private String offlineTransferSound;

	/** 購読日時(エポック秒) */
	private Integer subscribeAt;


	/**
	 * ルームIDを取得
	 *
	 * @return ルームID
	 */
	public String getRoomId() {
		return roomId;
	}

	/**
	 * ルームIDを設定
	 *
	 * @param roomId ルームID
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	/**
	 * ユーザIDを取得
	 *
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザIDを設定
	 *
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * オフライン転送を使用するかを取得
	 *
	 * @return オフライン転送を使用するか
	 */
	public Boolean getEnableOfflineTransfer() {
		return enableOfflineTransfer;
	}

	/**
	 * オフライン転送を使用するかを設定
	 *
	 * @param enableOfflineTransfer オフライン転送を使用するか
	 */
	public void setEnableOfflineTransfer(Boolean enableOfflineTransfer) {
		this.enableOfflineTransfer = enableOfflineTransfer;
	}

	/**
	 * 通知音を取得
	 *
	 * @return 通知音
	 */
	public String getOfflineTransferSound() {
		return offlineTransferSound;
	}

	/**
	 * 通知音を設定
	 *
	 * @param offlineTransferSound 通知音
	 */
	public void setOfflineTransferSound(String offlineTransferSound) {
		this.offlineTransferSound = offlineTransferSound;
	}

	/**
	 * 購読日時(エポック秒)を取得
	 *
	 * @return 購読日時(エポック秒)
	 */
	public Integer getSubscribeAt() {
		return subscribeAt;
	}

	/**
	 * 購読日時(エポック秒)を設定
	 *
	 * @param subscribeAt 購読日時(エポック秒)
	 */
	public void setSubscribeAt(Integer subscribeAt) {
		this.subscribeAt = subscribeAt;
	}

}