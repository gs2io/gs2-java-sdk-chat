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


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CheckEstimateScanByteByAllRoomResult {

	/** 予想されるスキャンサイズ */
	Integer scanSize;


	/**
	 * 予想されるスキャンサイズを取得
	 *
	 * @return 予想されるスキャンサイズ
	 */
	public Integer getScanSize() {
		return scanSize;
	}

	/**
	 * 予想されるスキャンサイズを設定
	 *
	 * @param scanSize 予想されるスキャンサイズ
	 */
	public void setScanSize(Integer scanSize) {
		this.scanSize = scanSize;
	}

}