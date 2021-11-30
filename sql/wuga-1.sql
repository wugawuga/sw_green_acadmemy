/* 1.사원 번호가 7499인 사원 중 이름, 입사일, 부서번호를 출력하여라.*/
SELECT ENAME, HIREDATE, DEPTNO
	FROM EMP WHERE EMPNO = '7499';

/* 2.이름이 ALLEN인 사원의 모든정보를 출력하여라.*/
SELECT * FROM EMP WHERE ENAME = 'ALLEN';

/* 3.이름이 K보다 큰 글자로 시작하는 사원의 모든 정보를 출력하여라.*/
SELECT * FROM EMP WHERE ENAME > 'K';

/* 4.입사일이 02-APR-81보다 늦고 09-DEC-82보다 빠른 사원의 이름,급여,부서번호를 출력하여라.*/
SELECT ENAME, SAL, DEPTNO FROM EMP
	WHERE TO_CHAR(hiredate,'dd-mm-yy')>'02-APR-81' 
	AND TO_CHAR(hiredate,'dd-mm-yy')<'09-DEC-82';
	
/* 5.급여가 $1,600 보다 크고 $3,000보다 작은 사원의 이름,직무,급여를 출력하여라.*/
SELECT ENAME, JOB, SAL FROM EMP
	WHERE SAL > 1600 AND SAL < 3000;
	
/* 6.입사일이 81년 이외에 입사한 사원의 모든 정보를 입력하여라.*/
SELECT * FROM EMP
	WHERE TO_CHAR(HIREDATE, 'DD-MM-YY') != '1981'; 
	
/* 7.직업이 MANAGER와 SALESMAN인 사원의 모든 정보를 출력하여라.*/
SELECT  * FROM EMP
WHERE JOB = 'MANAGER' OR JOB = 'SALESMAN';

/* 8.부서 번호가 20번,30번을 제외한 모든 사원의 이름, 사원번호, 부서번호를 출력하여라.*/
SELECT ENAME, EMPNO, DEPTNO FROM EMP e
WHERE e.DEPTNO NOT IN (20,30);

/* 9.이름이 S로 시작하는 사원의 사원번호,이름,입사일,부서번호를 출력하여라.*/
SELECT EMPNO, ENAME, HIREDATE, DEPTNO FROM EMP e
WHERE ENAME LIKE 'S%';

/* 10.입사일이 81년도인 사원의 모든정보를 출력하여라.*/
SELECT * FROM EMP e 
	WHERE TO_CHAR(e.HIREDATE, 'yyyy') = '1981';
	
/* 11.이름중 S자가 들어가 있는 사원의 모든정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE ENAME LIKE '%S%';
	
/* 12.이름이 S자로 시작하고 마지막 글자가 T인사원의 모든정보를 출력하여라.(단, 이름은 전체 5자리이다.)*/
SELECT * FROM EMP
	WHERE ENAME LIKE 'S%'
	AND ENAME LIKE '%T';

/* 13.처음의 글자는 관계없고 두 번째 글자가 A인 사원의 모든 정보를 출력하여라.*/
SELECT  * FROM EMP
	WHERE ENAME LIKE '_A%';

/* 14. 커미션이 NULL이 아닌 사원의 모든 정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE COMM IS NOT NULL;

/* 15.급여가 $1,500 이상이고, 부서번호가 30번인 사원중 직무가 MANAGER인 사원의 모든정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE SAL > '1500'
	AND DEPTNO = 30;

/* 16.부서 번호가 30인 사원들의 모든 정보를 사원 번호 순으로 정렬하여라.*/
SELECT * FROM EMP
	WHERE DEPTNO = 30
	ORDER BY EMPNO;

/* 17.사원의 모든정보를 부서 번호에 대해 내림차순으로 정렬하고  이름에 대해 오름차순으로, 급여에 대해 내림차순으로 정렬하여라.*/
SELECT * FROM EMP
	ORDER BY DEPTNO DESC, ENAME, SAL DESC;

/* 18.부서번호가 10번인 사원의 사원 번호,이름,급여를 출력하여라.*/
SELECT EMPNO, ENAME, SAL FROM EMP
	WHERE DEPTNO = 10;

/* 19.직무가 MANAGER가 아닌 사원의 모든 정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE JOB != 'MANAGER';

/* 20. 1981년 4월 2일 이후에 입사한 사원의 정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE TO_CHAR(HIREDATE, 'dd-mm-yy') > '1981-04-02';

/* 21.사원 번호가 7698보다 작거나 같은 사원들의 사원번호와 이름을 출력하여라.*/
SELECT EMPNO, ENAME FROM EMP
	WHERE EMPNO <= '7698';

/* 22. 사원 번호가 7654와 7782 사이 이외의 사원의 모든정보를 출력하여라.*/
SELECT * FROM EMP
	WHERE EMPNO < '7654' OR EMPNO > '7782';

SELECT * FROM EMP
	WHERE EMPNO NOT BETWEEN 7654 AND 7782;

/* 23. 부서가 30번이고 급여가 $1,500 이상인 사원의 이름,부서,급여를 출력하여라.*/
SELECT ENAME, DEPTNO, SAL FROM EMP
	WHERE DEPTNO = '30' AND SAL > 1500;

/* 24. 사원의 모든 정보를 부서 번호에 대해 오름차순으로 정렬한 후 급여가 많은 사원부터 차례로 출력하여라.*/
SELECT * FROM EMP e
	ORDER BY DEPTNO, SAL DESC ;
