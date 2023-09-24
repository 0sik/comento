
```
<!-- 1) 월별 접속자 수 -->
     <select id="selectMonthLogin" parameterType="string" resultType="hashMap">
	    SELECT COUNT(*) AS totCnt
	    FROM statistc.requestinfo ri
	    WHERE SUBSTRING(ri.createDate, 3, 2) = #{month};
    </select>

<!-- 2) 일자별 접속자 수 -->
<select id="selectDailyLogins" parameterType="null" resultType="hashMap">
    SELECT
        createDate AS date,
        COUNT(*) AS dailyLogins
    FROM statistc.requestInfo ri
    GROUP BY date
    ORDER BY date;
</select>

<!-- 3) 평균 하루 로그인 수 -->
<select id="selectAvgDailyLogins" parameterType="null" resultType="hashMap">
    SELECT
        AVG(dailyLogins) AS avgDailyLogins
    FROM (
        SELECT
            createDate,
            COUNT(*) AS dailyLogins
        FROM statistc.requestInfo ri
        GROUP BY createDate
    ) AS dailyLoginCounts;
</select>

<!-- 4) 휴일을 제외한 로그인 수 (휴일을 포함하는 경우) -->
<select id="selectLoginsExcludingHolidays" parameterType="null" resultType="hashMap">
    <!-- 이 쿼리는 휴일을 특정 날짜로 하드 코딩한 예제입니다.
    휴일 데이터를 따로 관리하거나 공공API를 활용해야 합니다. -->
    SELECT
        createDate AS date,
        COUNT(*) AS loginsExcludingHolidays
    FROM statistc.requestInfo ri
    WHERE createDate NOT IN ('1906220920') -- 휴일을 포함하는 경우, 휴일 날짜를 여기에 추가
    GROUP BY date
    ORDER BY date;
</select>

<!-- 5) 부서별 월별 로그인 수 -->
<select id="selectDepartmentMonthlyLogins" parameterType="null" resultType="hashMap">
    SELECT
        u.HR_ORGAN AS department,
        SUBSTRING(ri.createDate, 1, 6) AS month,
        COUNT(*) AS monthlyLogins
    FROM statistc.requestInfo ri
    INNER JOIN statistc.user u ON ri.userID = u.userID
    GROUP BY department, month
    ORDER BY department, month;
</select>
```
