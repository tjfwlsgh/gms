package com.lgl.gms.webapi.fin.dto.request;

import java.util.List;

import com.lgl.gms.webapi.common.context.UserInfo;
import com.lgl.gms.webapi.fin.dto.response.BoPlInfoResponse;

import lombok.Data;

/**
 * 재무 > 손익계산서 Request
 * @author jokim
 * @date 2022.04.13
 */
@Data
public class FinIncomeStatementRequest {

	private Integer frmId;		// 양식 ID
	private String clsYymm; 	// 결산 년월
	private String crncyType; 	// 원화/외화 구분 ( KRW : 원화 , LOC : 외화 )
	private Integer sheetNum;
	
	private List<BoPlInfoResponse> frmBoList;
	
	private Integer compId = UserInfo.getCompId();	// 회사 ID
	private String locale =  UserInfo.getLocale();	// 언어
	
}
