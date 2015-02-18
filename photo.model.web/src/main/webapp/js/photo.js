$(document).ready(function() {

	var sections = $("body section");
	sections.hide();
	$("#registrati").show();

	xhr_get("p/getTipiUtente").done(function(data){
		var select = $("#tipoutente");
		$.each(data, function(index, value){
			var option = $(document.createElement('option'));
			option.attr('name',value.id);
			option.text(value.descrizione);
			select.append(option);
		});		
	});
	
	
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

function xhr_get(url) {

	return $.ajax({
		url : url,
		type : 'get',
		dataType : 'json'
	}).always(function() {
//		alert('always');
	}).fail(function() {
		alert('fail');
	});

}