package com.lgl.gms.webapi.inc.dto.response;

import java.util.Date;

import lombok.Data;

/**
 * 공통코드 값
 * @author jokim
 * 2022.02.21
 */
@Data
public class TccValResponse {
	
	private Integer tccvId;				// 공통코드값 ID
	private Integer tccId;					// 공통코드_ID
	private String stdCd;					// 기초 코드
	private String stdCdNm;			// 기초 코드 명
	private String stdCdNmEng;		// 기초 코드 명 영어
	private String cdVal;				// 코드 값
	private Integer viewSeq;			// 코드 레벨
	private String delYn;			// 삭제 YN
	private Date regDt;			// 등록일자
	private Date updDt;			// 수정일자
	private String workIp;		// 작업자 IP
	private String regNo;		// 등록자 NO
	private String updNo;		// 갱신자 NO
	
	

}