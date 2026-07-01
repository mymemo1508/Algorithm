/*
- 조회: 사번, 성명, 평가 등급, 성과금
- 그룹: 사원별 성과금 정보
- 정렬: 사번 오름차순
HR_DEPARTMENT D HR_EMPLOYEES E HR_GRADE G
*/

WITH BASE AS (
SELECT E.EMP_NO
     , E.EMP_NAME
     , CASE    
            WHEN AVG(G.SCORE) >= 96 THEN 'S'
            WHEN AVG(G.SCORE) >= 90 THEN 'A'
            WHEN AVG(G.SCORE) >= 80 THEN 'B'
            ELSE 'C'
       END AS GRADE
     , E.SAL
FROM HR_EMPLOYEES E
JOIN HR_GRADE G ON E.EMP_NO = G.EMP_NO
GROUP BY E.EMP_NO, E.EMP_NAME
)
SELECT EMP_NO
     , EMP_NAME
     , GRADE
     , CASE
            WHEN GRADE = 'S' THEN SAL * 0.2
            WHEN GRADE = 'A' THEN SAL * 0.15
            WHEN GRADE = 'B' THEN SAL * 0.1
            ELSE 0
       END AS BONUS
FROM BASE
ORDER BY EMP_NO