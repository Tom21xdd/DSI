$(function() {
    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

	var eye = document.getElementById('Eye');
	var input = document.getElementById('Input');
	eye.addEventListener("click", function(){
		if (input.type === "password") {
			input.type = "text";
			eye.style.opacity = 0.8;
		} else {
			input.type = "password";
			eye.style.opacity = 0.2;
		}
	})

	var eye_2 = document.getElementById('Eye_2');
	var input_2 = document.getElementById('Input_2');
	eye_2.addEventListener("click", function(){
		if (input_2.type === "password") {
			input_2.type = "text";
			eye_2.style.opacity = 0.8;
		} else {
			input_2.type = "password";
			eye_2.style.opacity = 0.2;
		}
	})
});