/*
GROUP BY = 행을 줄여서 집계한다
분석함수 = 행을 유지하면서 집계값을 옆에 붙인다
        =>  집계함수() OVER (
                PARTITION BY 그룹기준
                ORDER BY 정렬기준
            )
EXTRACT = 날짜에서 원하는 부분만 뽑는 함수

DATE 'YYYY-MM-DD' = 오라클에서 날짜를 직접 만드는 안전한 표현
TO_CHAR(날짜, 형식) = 날짜를 문자로 바꾸는 표현
*/

-- 2022-08 ~ 2022-10월까지 총 대여 횟수가 5회 이상인 자동차
-- 해당 기간 동안 월별 자동차 ID별 총 대여 횟수 RECORDS
-- 월 오름차순, 자동차 ID 내림차순
-- 특정 월 총 대여 횟수 0이면 제외

SELECT MONTH
     , CAR_ID
     , COUNT(*) AS RECORDS
FROM (
    SELECT EXTRACT(MONTH FROM START_DATE) AS MONTH
         , CAR_ID
         , COUNT(*) OVER (PARTITION BY CAR_ID) AS TOTAL_COUNT
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE START_DATE >= DATE '2022-08-01'
    AND START_DATE < DATE '2022-11-01'
)
WHERE TOTAL_COUNT >= 5
GROUP BY MONTH, CAR_ID
ORDER BY MONTH ASC, CAR_ID DESC