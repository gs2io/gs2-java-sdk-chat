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
import io.gs2.chat.Gs2Chat;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateLobbyRequest extends Gs2BasicRequest<UpdateLobbyRequest> {

	public static class Constant extends Gs2Chat.Constant {
		public static final String FUNCTION = "UpdateLobby";
	}

	/** ロビーの名前 */
	private String lobbyName;

	/** 通知方式 */
	private String notificationType;

	/** サービスクラス */
	private String serviceClass;

	/** 説明文 */
	private String description;

	/** 通知先 GS2-InGamePushNotification の ゲーム名 */
	private String notificationGameName;

	/** 通知先URL */
	private String notificationUrl;


	/**
	 * ロビーの名前を取得
	 *
	 * @return ロビーの名前
	 */
	public String getLobbyName() {
		return lobbyName;
	}

	/**
	 * ロビーの名前を設定
	 *
	 * @param lobbyName ロビーの名前
	 */
	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}

	/**
	 * ロビーの名前を設定
	 *
	 * @param lobbyName ロビーの名前
	 * @return this
	 */
	public UpdateLobbyRequest withLobbyName(String lobbyName) {
		setLobbyName(lobbyName);
		return this;
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
	 * 通知方式を設定
	 *
	 * @param notificationType 通知方式
	 * @return this
	 */
	public UpdateLobbyRequest withNotificationType(String notificationType) {
		setNotificationType(notificationType);
		return this;
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
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateLobbyRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
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

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 * @return this
	 */
	public UpdateLobbyRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * 通知先 GS2-InGamePushNotification の ゲーム名を取得
	 *
	 * @return 通知先 GS2-InGamePushNotification の ゲーム名
	 */
	public String getNotificationGameName() {
		return notificationGameName;
	}

	/**
	 * 通知先 GS2-InGamePushNotification の ゲーム名を設定
	 *
	 * @param notificationGameName 通知先 GS2-InGamePushNotification の ゲーム名
	 */
	public void setNotificationGameName(String notificationGameName) {
		this.notificationGameName = notificationGameName;
	}

	/**
	 * 通知先 GS2-InGamePushNotification の ゲーム名を設定
	 *
	 * @param notificationGameName 通知先 GS2-InGamePushNotification の ゲーム名
	 * @return this
	 */
	public UpdateLobbyRequest withNotificationGameName(String notificationGameName) {
		setNotificationGameName(notificationGameName);
		return this;
	}

	/**
	 * 通知先URLを取得
	 *
	 * @return 通知先URL
	 */
	public String getNotificationUrl() {
		return notificationUrl;
	}

	/**
	 * 通知先URLを設定
	 *
	 * @param notificationUrl 通知先URL
	 */
	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	/**
	 * 通知先URLを設定
	 *
	 * @param notificationUrl 通知先URL
	 * @return this
	 */
	public UpdateLobbyRequest withNotificationUrl(String notificationUrl) {
		setNotificationUrl(notificationUrl);
		return this;
	}

}