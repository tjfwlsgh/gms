package com.lgl.gms.webapi.inc.dto.response;

import java.math.BigDecimal;
import java.util.Date;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

/**
 * 법인 비용실적
 * @author jokim
 * @date 2022.03.14
 */
@Data
public class BoIncExpRetResponse {
	
	private Integer boId;			// 법인 ID
	private String	IncYymm;		// 손익_년월
	private String	defCl;			// 확정 구분
	private Long	seq;				// SEQ	
	private Integer incItmId;		// 손익 항목 ID
	
	private String typCd;			// 유형 코드
	private String cl1Cd;				// 구분1 코드
	private String cl2Cd;				// 구분2 코드
	private String cl3Cd;				// 구분3 코드
	private String	grp1Cd;		// 그룹1 코드
	private BigDecimal rvnAmt;		// 수익 금액
	private BigDecimal expAmt;	// 비용 금액
	private String retDt;				// 실적 일자
	private String aggYn;			// 집계	
	private String incItmDetId;	// 손익 항목 상세 ID
	private String incNote;			// 비고
	
	private Date regDt;				// 등록일자
	private Date updDt;				// 수정일자
	private String workIp;			// 작업자 IP
	private String regNo;			// 등록자 NO
	private String updNo;			// 갱신자 NO

}