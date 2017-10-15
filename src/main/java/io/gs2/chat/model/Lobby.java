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
 * ロビー
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Lobby implements Serializable {

	/** ロビーID */
	String lobbyId;

	/** ゲーム名 */
	String name;

	/** サービスクラス */
	String serviceClass;

	/** 通知方式 */
	String notificationType;

	/** gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN */
	String notificationGameId;

	/** 作成日時(エポック秒) */
	Integer createAt;

	/** http/https を選択した際の通知先URL */
	String notificationUrl;

	/** オーナーID */
	String ownerId;

	/** 最終更新日時(エポック秒) */
	Integer updateAt;

	/** 説明文 */
	String description;


	/**
	 * ロビーIDを取得
	 *
	 * @return ロビーID
	 */
	public String getLobbyId() {
		return lobbyId;
	}

	/**
	 * ロビーIDを設定
	 *
	 * @param lobbyId ロビーID
	 */
	public void setLobbyId(String lobbyId) {
		this.lobbyId = lobbyId;
	}

	/**
	 * ゲーム名を取得
	 *
	 * @return ゲーム名
	 */
	public String getName() {
		return name;
	}

	/**
	 * ゲーム名を設定
	 *
	 * @param name ゲーム名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * サービスクラスを取得
	 *
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * 通知方式を取得
	 *
	 * @return 通知方式
	 */
	public String getNotificationType() {
		return notificationType;
	}

	/**
	 * 通知方式を設定
	 *
	 * @param notificationType 通知方式
	 */
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	/**
	 * gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRNを取得
	 *
	 * @return gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN
	 */
	public String getNotificationGameId() {
		return notificationGameId;
	}

	/**
	 * gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRNを設定
	 *
	 * @param notificationGameId gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN
	 */
	public void setNotificationGameId(String notificationGameId) {
		this.notificationGameId = notificationGameId;
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
	 * http/https を選択した際の通知先URLを取得
	 *
	 * @return http/https を選択した際の通知先URL
	 */
	public String getNotificationUrl() {
		return notificationUrl;
	}

	/**
	 * http/https を選択した際の通知先URLを設定
	 *
	 * @param notificationUrl http/https を選択した際の通知先URL
	 */
	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	/**
	 * オーナーIDを取得
	 *
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * 説明文を取得
	 *
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}