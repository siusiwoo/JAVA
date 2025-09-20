<%@ include file="menu.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<div class="container bg-warning">
		<div class="row">
			<div class="col">
			test 안녕하세용.안녕하세요
	<%! 
	int count=10;
	String makeItLower(String data){
		return data.toLowerCase();
	}
	%>
	
	<%
		for(int i=1; i<=count; i++){
			out.println("안녕"+i+"<br>");
		}
	
	%>
	
	<%= makeItLower("Hello World") %>
			
			</div>
			<div class="col-md-6">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit repellendus commodi assumenda cumque harum. Itaque harum culpa aliquam voluptatibus tempora hic commodi aut repellendus excepturi quod maiores eum labore? Vitae iure alias sit officia obcaecati beatae iste deleniti nisi sunt.</div>
			<div class="col">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit repellendus commodi assumenda cumque harum. Itaque harum culpa aliquam voluptatibus tempora hic commodi aut repellendus excepturi quod maiores eum labore? Vitae iure alias sit officia obcaecati beatae iste deleniti nisi sunt.</div>
			<div class="col-lg-6 bg-danger">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis nemo cum numquam. Dignissimos repudiandae quasi eos reiciendis accusantium pariatur velit nam iste possimus provident soluta corrupti odit consequuntur laboriosam corporis.</div>
			<div class="col-lg-6 bg-success">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam reprehenderit doloremque cupiditate iusto accusantium animi mollitia necessitatibus cum optio nemo! Similique recusandae labore obcaecati quos asperiores exercitationem facilis quasi ex.</div>
	
			
		</div>			
	</div>		
	
<%@ include file="footer.jsp" %>
	