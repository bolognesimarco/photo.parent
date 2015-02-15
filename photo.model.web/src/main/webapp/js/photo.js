$(document).ready(function() {
	
	var sections = $("body section");
	sections.hide();
	$("#registrati").show();
	
	$.ajax(
			{
				url: "/p/getTipiUtente", 
				success: function(result){
					
					
					
				}
			}
	);
	
	$("nav ul li a").click(function(event) {// quando si clicka su un menu item
		var clicked = $(this).attr("href");
		sections.each(function() {// per tutte le section
			if ($(this).attr("id") == clicked) {// quella clickata..
				if (!$(this).is(":visible")) {// se non è già visibile..
					$(this).fadeIn("slow");// la mostro
				}// altrimenti niente
			} else {// se non è quella clickata..
				$(this).hide();// la nascondo
			}
		});
		event.preventDefault();
	});
	
});