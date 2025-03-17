
SELECT CHAR_LENGTH("HI HELLO") AS CHAR_LENGTH;



SELECT ADDDATE("2025-02-27 13:00:00", 2);
SELECT ADDDATE(NOW(), 14);
SELECT SUBDATE(NOW(), 14);

SELECT ADDTIME(NOW(), "2:00:00");
SELECT SUBTIME(NOW(), "00:10:00");

SELECT YEAR(NOW()) AS YEAR, MONTH(NOW()) AS MONTH, DAY(NOW()) AS DAY;

SELECT HOUR(NOW()) AS HOUR, MINUTE(NOW()) AS MINUTE, SECOND(NOW()) AS SECOND, MICROSECOND(NOW(6)) AS MICROSECOND;

SELECT DATEDIFF(NOW(), "2025-02-20 13:00:00") DATEDIFF;

SELECT NOW(), SYSDATE();

SELECT DATE_ADD(NOW(), INTERVAL 1 DAY) ADDDATE와같음;
SELECT DATE_ADD(NOW(), INTERVAL 1 QUARTER);
SELECT DATE_ADD(NOW(), INTERVAL 1 WEEK) 1주추가;

SELECT CEIL(1.49), FLOOR(1.49), ROUND(1.49);
SELECT CEIL(1.59), FLOOR(1.59), ROUND(1.59);