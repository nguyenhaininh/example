<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form action="/user/checkLogin" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">  
	<s:textfield name="user.username" label="Name"></s:textfield>  <br/>
	<s:password name="user.password" label="Password"></s:password>  
	<s:submit value="login"></s:submit>  
</s:form>  
<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Welcome to Online Student Enrollment!</h1>
				<p>To get started, you need to enter your details to enroll with
					us. Or login to access your details, if you are already enrolled.</p>
			</div>

			<a class="btn btn-primary" href="signup-input">Signup » </a> <a
				class="btn btn-primary" href="login-input">Login » </a>
		</div>

		<div></div>
	</div>