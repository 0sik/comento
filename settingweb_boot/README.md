
```
<!-- 0) 년도 접속자 수 -->
    <select id="selectYearLogin" parameterType="string" resultType="hashMap">
        select count(*) as totCnt
        from statistc.requestinfo ri
        where left(ri.createDate, 2) = #{year};
    </select>
<!-- 1) 월별 접속자 수 -->
     <select id="selectMonthLogin" parameterType="string" resultType="hashMap">
	    SELECT COUNT(*) AS totCnt
	    FROM statistc.requestinfo ri
	    WHERE SUBSTRING(ri.createDate, 3, 2) = #{month};
    </select>

<!-- 2) 일자별 접속자 수 -->
    <select id="selectDayLogin" parameterType="string" resultType="hashMap">
	    SELECT COUNT(*) AS totCnt
	    FROM statistc.requestinfo ri
	    WHERE SUBSTRING(ri.createDate, 5, 2) = #{day};
    </select>

<!-- 3) 평균 하루 로그인 수 -->
<select id="selectAvgDailyLogin" parameterType="string" resultType="hashMap">
    SELECT AVG(daily_login_count) AS avg_daily_login_count
    FROM (
        SELECT
            SUBSTRING(createDate, 1, 8) AS date,
            COUNT(DISTINCT userID) AS daily_login_count
        FROM statistc.requestInfo
        GROUP BY date
    ) AS daily_user_counts;
</select>

<!-- 4) 휴일을 제외한 로그인 수 (휴일을 포함하는 경우) -->


<!-- 5) 부서별 월별 로그인 수 -->

```
