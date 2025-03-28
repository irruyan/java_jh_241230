<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>

<head>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-bs4.min.js"></script>
</head>

<body>
	<br>
	<h1>게시글 등록</h1>
	 <form action='<c:url value="/post/insert" />' method="post" enctype="multipart/form-data">
		<div class="form-group mt-3">
			<label for="board" class="form-lable">게시판</label>
			<select class="form-control" id="board" name="po_bo_num">
				<c:forEach items="${list }" var="board">
					<option value="${board.bo_num }">${board.bo_name}</option>
				</c:forEach>
			</select>
		</div>
		
		<div class="form-group mt-3">
			<label for="title" class="form-lable">제목</label>
			<input type="text" class="form-control" id="title" name="po_title">
		</div>
		<div class="form-group mt-3">
			<label for="content" class="form-lable">내용</label>
			<textarea class="form-control" id="content" name="po_content" rows="10"></textarea>
		</div>
		<div class="form-group mt-3">
			<label class="form-lable">첨부파일</label>
			<input type="file" class="form-control" name="fileList">
			<input type="file" class="form-control" name="fileList">
			<input type="file" class="form-control" name="fileList">
		</div>
		
		<button type="submit" class="btn btn-outline-success mt-3 col-8">게시글 등록</button>
	</form>
	
	<script type="text/javascript">
		$('#content').summernote({
	        placeholder: '내용을 작성하세요',
	        tabsize: 2,
	        height: 100
	      });
	</script>
	
</body>

</html>
