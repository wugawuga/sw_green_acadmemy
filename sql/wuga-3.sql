/* 1.10번 부서에 대해 급여의 평균 값,최대 값,최소 값,인원 수를 구하여 출력하여라.*/
SELECT AVG(SAL), MAX(SAL), MIN(SAL), COUNT(*) FROM EMP
	WHERE DEPTNO = 10;

/* 2.각 부서별 같은 직무를 갖는 사원의 인원수를 구하여 부서 번호, 직무,인원수를 출력하여라.*/
SELECT DEPTNO, JOB, COUNT(8) "인원 수" FROM EMP
	GROUP BY DEPTNO, JOB;

/* 3.사원들의 직무별 평균 급여와 최고급여,최저급여를 평균급여에 대해 오름차순으로 정렬하여라.*/
SELECT JOB, AVG(SAL), MAX(SAL), MIN(SAL) FROM EMP
	GROUP BY JOB
	ORDER BY AVG(SAL);
	
/* 4.EMP와 DEPT테이블을 조인하여 모든 사원에 대해 부서 번호, 부서이름, 사원이름, 급여를 출력하여라.*/
SELECT e.EMPNO, e.DEPTNO, d.DNAME, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO;

/* 5.이름이 'ALLEN'인 사원의 부서 이름을 출력하여라.*/
SELECT d.DNAME FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.ENAME = (SELECT ENAME FROM EMP WHERE ENAME = 'ALLEN');
	
/* 6.'ALLEN'과 직무가 같은 사원의 이름,부서 이름, 급여, 부서위치를 출력하여라.*/
SELECT e.ENAME, d.DNAME, e.SAL, d.LOC FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.JOB = (SELECT JOB FROM EMP WHERE ENAME = 'ALLEN');

/* 7.전체사원의 평균 급여보다 급여가 많은 사람의 사원 번호, 이름, 부서이름, 입사일, 부서위치, 급여를 출력하여라.*/
SELECT e.EMPNO, e.ENAME, d.DNAME, e.HIREDATE, d.LOC, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.SAL > (SELECT AVG(SAL) FROM EMP);
/* 8.10번 부서 사원들 중에서 20번 부서의 사원과 같은 직무를 갖는 사원의 사원 번호 ,이름,부서 이름, 입사일, 부서 위치를 출력하여라.*/
SELECT e.EMPNO, e.ENAME, d.DNAME, e.HIREDATE, d.LOC FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.DEPTNO = 10 AND e.JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 20);

/* 9.'ALLEN'의 급여보다 많고 'SCOTT'의 급여보다 적은 사원의 사원번호, 이름, 부서이름, 부서위치, 급여를 급여가 많은 순으로 출력하여라.*/
SELECT e.EMPNO, e.ENAME, d.DNAME, d.LOC, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.SAL > (SELECT SAL FROM EMP WHERE ENAME = 'ALLEN') AND e.SAL < (SELECT SAL FROM EMP WHERE ENAME = 'SCOTT');

/* 10.30번 부서의 최고급여보다 급여가 많은 사원의 사원 번호 ,이름,급여를 출력하여라.*/
SELECT e.EMPNO, e.ENAME, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND e.SAL > (SELECT MAX(SAL) FROM EMP WHERE DEPTNO = 30);

/* 11.사원 이름의 두 번째 글자가 'A'인 사원들의 수를 출력하여라.*/
SELECT COUNT(*) "두번째 글자 A인 사람" FROM EMP WHERE ENAME LIKE '_A%';

/* 12.사원들의 평균 급여,총 급여, 최고급여액,최저 급여액을 구하여라.*/
SELECT AVG(SAL), SUM(SAL), MAX(SAL), MIN(SAL) FROM EMP;

/* 13.평균급여가 1500이 넘는 직무와 평균 급여를 구하여라.*/
SELECT JOB, AVG(SAL) FROM EMP 
	GROUP BY JOB
	HAVING AVG(SAL) > 1500;

/* 14.사원들의 이름,부서 이름, 급여를 출력하여라.*/
SELECT e.ENAME, d.DNAME, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO;

/* 15.각 부서별 부서 번호(모든 부서에 대해서), 부서 이름, 부서 위치, 사원의 수를 출력하여라.*/
SELECT d.DEPTNO, d.DNAME, d.LOC, count(*) FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO
	GROUP BY d.DEPTNO, d.DNAME, d.LOC;

/* 16.모든 사원들의 평균 급여보다 많이 받는 사원들의 사원 번호와 이름을 출력하여라.*/
SELECT e.EMPNO, e.ENAME FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO
	AND SAL > (SELECT AVG(SAL) FROM EMP);

/* 17.'FORD'와 부서가 같은 사원들의 이름,부서 이름, 직무, 급여를 출력하여라.*/
SELECT e.ENAME, d.DNAME, e.JOB, e.SAL FROM EMP e, DEPT d
	WHERE e.DEPTNO = d.DEPTNO AND d.DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'FORD');

/* 18.부서이름이 'SALES'인 사원들의 평균 급여보다 많고, 
 * 부서 이름이 'RESEARCH'인 사원들의 평균 급여보다 적은 사원들의 이름, 부서번호, 급여, 직무를 출력하여라.*/
SELECT ENAME, DEPTNO, SAL, JOB FROM EMP
	WHERE SAL > (SELECT AVG(SAL) FROM EMP e, DEPT d WHERE e.DEPTNO = d.DEPTNO AND d.DNAME = 'SALES')
		AND SAL < (SELECT AVG(SAL) FROM EMP e2, DEPT d2 WHERE e2.DEPTNO = d2.DEPTNO AND d2.DNAME = 'RESEARCH');

/* 19.부서별 평균 급여가 2000보다 적은 부서 사원들의 부서 번호를 출력하여라.*/
SELECT DEPTNO FROM EMP
	GROUP BY DEPTNO
	HAVING AVG(SAL) < 2000; 

/* 20.직무가 'ANALYST'인 사원보다 급여가 적으면서, 직무가 'ANALYST'가 아닌 사원들의 사원번호,이름, 직무, 급여를 출력하여라.*/
SELECT EMPNO, ENAME, JOB, SAL FROM EMP
	WHERE SAL < (SELECT AVG(SAL) FROM EMP WHERE JOB = 'ANALYST') AND JOB <> 'ANALYST';