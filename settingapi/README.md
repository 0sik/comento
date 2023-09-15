# 지원서 보관함 API 가이드 문서

## 버전
- 1.0 2023/09/08 최초작성 박영식
- 2.0 2023/09/15 sw활용 현황 추가 박영식
## 지원서 보관함 데이터
year  int default=2023 
count int default=0

## 지원서 보관함 생성 

```json
POST /api/application-folders
Content-Type: application/json
Authorization: Bearer ...

{
	"year": 2023
}
```

```json
201 CREATED
Content-Type: application/json
Location: "/application-folders/{folder id}"
```

- 에러 상황
    - 이미 있는 년도인 경우 → 400 에러

## 지원서 보관함 모두 조회 

```json
GET /api/application-folders
Content-Type: application/json
Authorization: Bearer ...
```

```json
200 OK
Content-Type: application/json
// 최근 년도순 정렬, 페이징 x
[
	{
			"year": 2023,
			"count": 2 // 개수 추가
	},
	{
			"year": 2022,
			"count": 1
	},
	{
			"year": 2021,
			"count": 0
	}
]


//생성 년도가 없는 경우
[]
```

# sw 활용현황 API
월 별 접속자 수
요청 URL:   ~/{login}/{month}

Request Parameters
login : string 
month : string

Response Body
{
“totCnt” : 
“month” :
“requestLog”:
“is_success” :
}
