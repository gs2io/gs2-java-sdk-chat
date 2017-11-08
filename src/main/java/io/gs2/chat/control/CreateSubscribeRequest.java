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

import org.json.JSONObject;
import java.util.List;
import io.gs2.chat.Gs2Chat;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class CreateSubscribeRequest extends Gs2BasicRequest<CreateSubscribeRequest> {

	public static class Constant extends Gs2Chat.Constant {
		public static final String FUNCTION = "CreateSubscribe";
	}

	/** ロビーの名前 */
	private String lobbyName;

	/** ルームID */
	private String roomId;

	/** ユーザID */
	private String userId;

	/** GS2-InGamePushNotification 使用時にオフライン転送を使用するか */
	private Boolean enableOfflineTransfer;

	/** パスワード */
	private String password;

	/** GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音 */
	private String offlineTransferSound;


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
	public CreateSubscribeRequest withLobbyName(String lobbyName) {
		setLobbyName(lobbyName);
		return this;
	}

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
	 * ルームIDを設定
	 *
	 * @param roomId ルームID
	 * @return this
	 */
	public CreateSubscribeRequest withRoomId(String roomId) {
		setRoomId(roomId);
		return this;
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
	 * ユーザIDを設定
	 *
	 * @param userId ユーザID
	 * @return this
	 */
	public CreateSubscribeRequest withUserId(String userId) {
		setUserId(userId);
		return this;
	}

	/**
	 * GS2-InGamePushNotification 使用時にオフライン転送を使用するかを取得
	 *
	 * @return GS2-InGamePushNotification 使用時にオフライン転送を使用するか
	 */
	public Boolean getEnableOfflineTransfer() {
		return enableOfflineTransfer;
	}

	/**
	 * GS2-InGamePushNotification 使用時にオフライン転送を使用するかを設定
	 *
	 * @param enableOfflineTransfer GS2-InGamePushNotification 使用時にオフライン転送を使用するか
	 */
	public void setEnableOfflineTransfer(Boolean enableOfflineTransfer) {
		this.enableOfflineTransfer = enableOfflineTransfer;
	}

	/**
	 * GS2-InGamePushNotification 使用時にオフライン転送を使用するかを設定
	 *
	 * @param enableOfflineTransfer GS2-InGamePushNotification 使用時にオフライン転送を使用するか
	 * @return this
	 */
	public CreateSubscribeRequest withEnableOfflineTransfer(Boolean enableOfflineTransfer) {
		setEnableOfflineTransfer(enableOfflineTransfer);
		return this;
	}

	/**
	 * パスワードを取得
	 *
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定
	 *
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * パスワードを設定
	 *
	 * @param password パスワード
	 * @return this
	 */
	public CreateSubscribeRequest withPassword(String password) {
		setPassword(password);
		return this;
	}

	/**
	 * GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音を取得
	 *
	 * @return GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音
	 */
	public String getOfflineTransferSound() {
		return offlineTransferSound;
	}

	/**
	 * GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音を設定
	 *
	 * @param offlineTransferSound GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音
	 */
	public void setOfflineTransferSound(String offlineTransferSound) {
		this.offlineTransferSound = offlineTransferSound;
	}

	/**
	 * GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音を設定
	 *
	 * @param offlineTransferSound GS2-InGamePushNotification 使用時のモバイルプッシュ通知で使用する通知音
	 * @return this
	 */
	public CreateSubscribeRequest withOfflineTransferSound(String offlineTransferSound) {
		setOfflineTransferSound(offlineTransferSound);
		return this;
	}

}