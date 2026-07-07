SELECT ID
     , EMAIL
     , FIRST_NAME
     , LAST_NAME
FROM DEVELOPERS
WHERE 1 = 1
AND (
     SKILL_CODE & (
                    SELECT SUM(CODE)
                    FROM SKILLCODES
                    WHERE CATEGORY = 'Front End'
                 ) > 0
    )
ORDER BY ID ASC;