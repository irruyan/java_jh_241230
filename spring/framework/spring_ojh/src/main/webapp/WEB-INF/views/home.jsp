<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!doctype html>
    
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<!-- 서버에서 보낸 데이터를 처리할때는 아래와 같이 이용하여 활용
 - 단 주석에서도 바로 인식되므로 주의할 것 -->
<P> 서버에서 보낸 제 이름은 ${name} 입니다. </P>
<c:url value="/redirect?name=hongkildong&age=10" />
<c:url value="" />
<c:url value="" />
<a href="<c:url value="?name=abc&age=10" />">서버로 name 과 age 값을 전송</a>
<br>
<a href="<c:url value="/send?name=abc&age=10" />">서버(/send)로 name 과 age 값을 전송</a>

<form action="<c:url value="/send" />" method="get">
	<h1>form 태그를 이용하여 get 방식으로 전송</h1>
	<input type="text" name="name" placeholder="이름을 입력하세요">
	<br>
	<input type="number" name="age" placeholder="나이를 입력하세요">
	<br>
	<button type="submit"> SEND </button>
</form>
	
<form action="<c:url value="/send" />" method="post">
	<h1>form 태그를 이용하여 post 방식으로 전송</h1>
	<input type="text" name="name" placeholder="이름을 입력하세요">
	<br>
	<input type="number" name="age" placeholder="나이를 입력하세요">
	<br>
	<button type="submit"> SEND </button>
</form>
<h1>url 경로에 데이터 보내기</h1>
<a href="<c:url value="/홍길동/10"/>"> url 경로에 데이터 보내기</a>
<h1>redirect 예제</h1>
<a href="<c:url value="/redirect?name=hongkildong&age=10" />">리다이렉트 예제</a>
<h1>forward 예제</h1>
<a href="<c:url value="/forward?name=hongkildong&age=10" />">포워드 예제</a>

<script type="text/javascript">
	let name1 = "${name}";
	console.log(name1);
	/* js 변수 name1 을 이용하여 `` 안에 변수 값을 넣음 */
	let str = `서버에서 보낸 이름은 \${name1} 입니다.`;
	console.log(str);
</script>

</body>
</html>
