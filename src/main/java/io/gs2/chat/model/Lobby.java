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

	/** 説明文 */
	private String description;

	/** ルーム削除時 に実行されるGS2-Script */
	private String deleteRoomTriggerScript;

	/** ルーム購読完了時 に実行されるGS2-Script */
	private String createSubscribeDoneTriggerScript;

	/** ルーム削除完了時 に実行されるGS2-Script */
	private String deleteRoomDoneTriggerScript;

	/** サービスクラス */
	private String serviceClass;

	/** メッセージ送信時 に実行されるGS2-Script */
	private String sendMessageTriggerScript;

	/** 通知方式 */
	private String notificationType;

	/** ルーム購読時 に実行されるGS2-Script */
	private String createSubscribeTriggerScript;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** ロビーID */
	private String lobbyId;

	/** ルーム購読解除時 に実行されるGS2-Script */
	private String deleteSubscribeTriggerScript;

	/** メッセージ送信完了時 に実行されるGS2-Script */
	private String sendMessageDoneTriggerScript;

	/** ゲーム名 */
	private String name;

	/** ルーム購読解除完了時 に実行されるGS2-Script */
	private String deleteSubscribeDoneTriggerScript;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** ルーム作成完了時 に実行されるGS2-Script */
	private String createRoomDoneTriggerScript;

	/** gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN */
	private String notificationGameName;

	/** http/https を選択した際の通知先URL */
	private String notificationUrl;

	/** オーナーID */
	private String ownerId;

	/** ルーム作成時 に実行されるGS2-Script */
	private String createRoomTriggerScript;


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
	 * ルーム削除時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム削除時 に実行されるGS2-Script
	 */
	public String getDeleteRoomTriggerScript() {
		return deleteRoomTriggerScript;
	}

	/**
	 * ルーム削除時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteRoomTriggerScript ルーム削除時 に実行されるGS2-Script
	 */
	public void setDeleteRoomTriggerScript(String deleteRoomTriggerScript) {
		this.deleteRoomTriggerScript = deleteRoomTriggerScript;
	}

	/**
	 * ルーム購読完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム購読完了時 に実行されるGS2-Script
	 */
	public String getCreateSubscribeDoneTriggerScript() {
		return createSubscribeDoneTriggerScript;
	}

	/**
	 * ルーム購読完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param createSubscribeDoneTriggerScript ルーム購読完了時 に実行されるGS2-Script
	 */
	public void setCreateSubscribeDoneTriggerScript(String createSubscribeDoneTriggerScript) {
		this.createSubscribeDoneTriggerScript = createSubscribeDoneTriggerScript;
	}

	/**
	 * ルーム削除完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム削除完了時 に実行されるGS2-Script
	 */
	public String getDeleteRoomDoneTriggerScript() {
		return deleteRoomDoneTriggerScript;
	}

	/**
	 * ルーム削除完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteRoomDoneTriggerScript ルーム削除完了時 に実行されるGS2-Script
	 */
	public void setDeleteRoomDoneTriggerScript(String deleteRoomDoneTriggerScript) {
		this.deleteRoomDoneTriggerScript = deleteRoomDoneTriggerScript;
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
	 * メッセージ送信時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ送信時 に実行されるGS2-Script
	 */
	public String getSendMessageTriggerScript() {
		return sendMessageTriggerScript;
	}

	/**
	 * メッセージ送信時 に実行されるGS2-Scriptを設定
	 *
	 * @param sendMessageTriggerScript メッセージ送信時 に実行されるGS2-Script
	 */
	public void setSendMessageTriggerScript(String sendMessageTriggerScript) {
		this.sendMessageTriggerScript = sendMessageTriggerScript;
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
	 * ルーム購読時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム購読時 に実行されるGS2-Script
	 */
	public String getCreateSubscribeTriggerScript() {
		return createSubscribeTriggerScript;
	}

	/**
	 * ルーム購読時 に実行されるGS2-Scriptを設定
	 *
	 * @param createSubscribeTriggerScript ルーム購読時 に実行されるGS2-Script
	 */
	public void setCreateSubscribeTriggerScript(String createSubscribeTriggerScript) {
		this.createSubscribeTriggerScript = createSubscribeTriggerScript;
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
	 * ルーム購読解除時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム購読解除時 に実行されるGS2-Script
	 */
	public String getDeleteSubscribeTriggerScript() {
		return deleteSubscribeTriggerScript;
	}

	/**
	 * ルーム購読解除時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteSubscribeTriggerScript ルーム購読解除時 に実行されるGS2-Script
	 */
	public void setDeleteSubscribeTriggerScript(String deleteSubscribeTriggerScript) {
		this.deleteSubscribeTriggerScript = deleteSubscribeTriggerScript;
	}

	/**
	 * メッセージ送信完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ送信完了時 に実行されるGS2-Script
	 */
	public String getSendMessageDoneTriggerScript() {
		return sendMessageDoneTriggerScript;
	}

	/**
	 * メッセージ送信完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param sendMessageDoneTriggerScript メッセージ送信完了時 に実行されるGS2-Script
	 */
	public void setSendMessageDoneTriggerScript(String sendMessageDoneTriggerScript) {
		this.sendMessageDoneTriggerScript = sendMessageDoneTriggerScript;
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
	 * ルーム購読解除完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム購読解除完了時 に実行されるGS2-Script
	 */
	public String getDeleteSubscribeDoneTriggerScript() {
		return deleteSubscribeDoneTriggerScript;
	}

	/**
	 * ルーム購読解除完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteSubscribeDoneTriggerScript ルーム購読解除完了時 に実行されるGS2-Script
	 */
	public void setDeleteSubscribeDoneTriggerScript(String deleteSubscribeDoneTriggerScript) {
		this.deleteSubscribeDoneTriggerScript = deleteSubscribeDoneTriggerScript;
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
	 * ルーム作成完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム作成完了時 に実行されるGS2-Script
	 */
	public String getCreateRoomDoneTriggerScript() {
		return createRoomDoneTriggerScript;
	}

	/**
	 * ルーム作成完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param createRoomDoneTriggerScript ルーム作成完了時 に実行されるGS2-Script
	 */
	public void setCreateRoomDoneTriggerScript(String createRoomDoneTriggerScript) {
		this.createRoomDoneTriggerScript = createRoomDoneTriggerScript;
	}

	/**
	 * gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRNを取得
	 *
	 * @return gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN
	 */
	public String getNotificationGameName() {
		return notificationGameName;
	}

	/**
	 * gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRNを設定
	 *
	 * @param notificationGameName gs2-in-game-push-notification を選択した際の GS2-InGamePushNotification のゲームGRN
	 */
	public void setNotificationGameName(String notificationGameName) {
		this.notificationGameName = notificationGameName;
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
	 * ルーム作成時 に実行されるGS2-Scriptを取得
	 *
	 * @return ルーム作成時 に実行されるGS2-Script
	 */
	public String getCreateRoomTriggerScript() {
		return createRoomTriggerScript;
	}

	/**
	 * ルーム作成時 に実行されるGS2-Scriptを設定
	 *
	 * @param createRoomTriggerScript ルーム作成時 に実行されるGS2-Script
	 */
	public void setCreateRoomTriggerScript(String createRoomTriggerScript) {
		this.createRoomTriggerScript = createRoomTriggerScript;
	}

}