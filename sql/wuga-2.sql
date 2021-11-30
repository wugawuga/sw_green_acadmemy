/* 1.모든사원의 사원번호, 이름, 급여, 부서 번호를 출력하여라.*/
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP;

/* 2.모든 사원의 이름, 급여, 커미션, 총액(급여+커미션)을 구하여 총액이 많은 순서로 출력하여라(단,커미션이 null인 사원도 0으로해서 포함하여라.)*/
SELECT ENAME, SAL, NVL(COMM, 0) AS "COMM", SAL+NVL(COMM, 0) AS "SAL+COMM" FROM EMP
	ORDER BY SAL+COMM DESC;
	
/* 3.10번부서의 모든 사원에게 급여의 13%를 보너스로 지불하기로 하였다. 10번부서 사원들의 이름,급여,보너스 금액,부서번호를 출력하여라.*/
SELECT ENAME, SAL, SAL*1.13 AS "BONUS", DEPTNO FROM EMP
	WHERE DEPTNO = 10;
	
/* 4.급여가 $1,500부터$3,000 사이의 사원 급여의 15%를 회비로 지불. 해당되는 사원의 이름,급여,회비(소수이하 2자리까지 반올림)를 출력하여라.*/
SELECT ENAME, SAL, ROUND(SAL*0.15, 2) AS "회비" FROM EMP
	WHERE SAL BETWEEN 1500 AND 3000;
	
/* 5.모든 사원의 부서번호, 이름, 입사일, 현재일, 입사일부터 현재까지의 근무 일 수(소수점 이하 절삭),근무 년 수, 근무 월 수(30일 기준), 근무 주수를 출력하여라.*/
SELECT DEPTNO, ENAME, HIREDATE, SYSDATE,
	TRUNC(SYSDATE-HIREDATE),
	floor(trunc(sysdate-hiredate)/365) "근무년수",
	floor(trunc(sysdate-hiredate)/30) "근무월수",
	floor(trunc(sysdate-hiredate)/7) "근무주수"
	FROM EMP;

/* 6.모든 사원에 대해 입사일로부터 90일이 지난 후의 날짜를 계산해서 이름, 입사일, 90일 후의 날짜,급여를 출력하여라.*/
SELECT ENAME, HIREDATE, HIREDATE+90 AS "90일 ", SAL FROM EMP;

/* 7.모든 사원에 대해 입사한 달의 근무 일수를 계산하여 부서 번호, 이름, 근무 일 수를 출력하여라.*/
SELECT  DEPTNO, ENAME, LAST_DAY(HIREDATE)-HIREDATE AS "입사한 달 근무일수" FROM EMP;

/* 8.모든 사원에 대해 입사한 날로부터 60일이 지난 후의 '월요일'이 몇 년,몇 월,몇 일인지를 구하여 이름, 입사일, 60일 후의 '월요일' 날짜를 출력하여라.*/
SELECT ENAME, HIREDATE AS "입사일", TO_CHAR(next_day(hiredate+60, 2), 'yyyy/mm/dd') "60일 이후 월요일" FROM EMP;

/* 9.이름의 글자수가 6자 이상인 사원의 이름을 앞에서 3자만 구하여 소문자로 이름만 출력하여라.*/
SELECT LOWER(SUBSTR(ENAME,1,3)) "소문자이름" FROM EMP 
	WHERE LENGTH(ENAME) >= 6;

/* 10.모든 사원에 대해 사원의 이름은 앞에서 세 글자만 대문자로, 업무는 소문자로 하여 이름, 직무, 부서 번호를 출력하여라.*/
SELECT UPPER(SUBSTR(ename,1,3)) "대문자이름", LOWER(JOB)"직무", DEPTNO FROM EMP;

/* 11.모든 사원에 대해 사원의 이름과 부서 번호를 합성시켜 "연결예제"라는 HEADING으로 출력하여라.*/
SELECT CONCAT(ENAME,DEPTNO) "이름/부서" FROM EMP;

/* 12.사원의 직무가 'SAL'로 시작하는 사원의 이름과 사원 이름의 길이를 출력하여라.*/
SELECT ENAME, LENGTH(ENAME) "이름길이" FROM EMP
	WHERE JOB LIKE 'SAL%';

/* 13.이름의 두 번째 글자가 'A'인 사원들의 이름과 직무를 출력하여라(단, 직무는 앞에서부터 세 글자로 줄여 표시하여라.)*/
SELECT ENAME, SUBSTR(JOB,1,3) "JOB" FROM EMP
	WHERE ENAME LIKE '_A%';

/* 14.현재의 7일전과 7일후, 그리고 30일이 지난 후의 첫 번째 월요일을 출력하여라.*/
SELECT next_day(sysdate-7, '월') "7일전", next_day(sysdate+7,2) "7일후", next_day(sysdate+30, '월요일') "30일후" FROM EMP;

/* 15.직무가 'CLERK'인 사원들의 사원 번호, 이름, 급여를 표시하여라(단, 급여는 1000단위마다 콤마(,)를 찍고 앞에는 국가별 화폐단위를 붙여 표시하여라.)*/
SELECT EMPNO, ENAME, TO_CHAR(SAL, 'L9,999,99') "원" FROM EMP
	WHERE JOB = 'CLERK';

/* 16.사원들의 사원 번호와 급여, 커미션,연봉((comm+sal)*12)을 연봉이 많은 순서로 출력하여라(단,커미션이 null인 사원도 0 으로 계산하여라.)*/
SELECT  EMPNO, SAL, NVL(COMM, 0), ((NVL(COMM,0)+SAL)*12) "연봉" FROM EMP
	ORDER BY "연봉" DESC;

/* 17.모든 사원에 대해 입사일로부터 6개월이 지난 후의 날짜를 계산해서 이름, 입사일, 6개월 후의 날짜를 출력하여라.*/
SELECT ENAME, ADD_MONTHS(HIREDATE, 6) "6개월 후" FROM EMP;

/* 18.모든 사원에 대해 사원들의 이름, 급여, 커미션을 급여가 적은 것부터 출력하여라(단, 커미션이 없는 사원은 'No Commission'이라는 말이 출력되게하여라.)*/
SELECT ENAME, SAL, DECODE(COMM, NULL, 'NO COMM', COMM) "커미션" FROM EMP;

/* 19.'CLERK'은 20%, 'SALESMAN'은 15%,'ANALYST'는 10%, 'MANAGER'는 5%, 'PRESIDENT' 는 0%와 같이 업무에 따라 급여인상을 다르게 할 경우, 
 * 모든 사원들의 이름, 직무, 급여, 인상 후의 급여를 출력하여라.*/
SELECT ENAME, JOB, SAL, (DECODE(JOB, 'CLERK', 0.2, 'SALESMAN', 0.15, 'ANALYST', 0.1, 'MANAGER', 0.05, 'PRESIDENT', 0) * SAL) + SAL "인상 후" from emp;

/* 20. 모든 사원들의 입사한 년도와 입사한 달을 출력하여라.*/
SELECT TO_CHAR(HIREDATE, 'YYYY'), TO_CHAR(HIREDATE, 'MM') FROM EMP;

/* 21.사원번호가 짝수인 사원들의 모든 정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE MOD(EMPNO, 2) = 0;