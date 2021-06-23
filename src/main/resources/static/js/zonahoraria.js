function zonahoraria(id_Pais,id_horaria){
   if(id_Pais==1){
	  const pais="México";
	  if(id_horaria==1){
		 var zonah='America/Mexico_City';
	     const ciudad="Ciudad de México";     
	     darHora(zonah);
	     consultarAPI(ciudad,pais);
	  }else if(id_horaria==2){
		var zonah='America/Tijuana';
		const ciudad="Tijuana";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);
	 }else if(id_horaria==3){
		var zonah='America/Monterrey';
		const ciudad="Monterrey";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);


	  }

	
   }else if(id_Pais==2){
	  const pais="Estados Unidos";
	  if(id_horaria==1){
		 var zonah='America/Chicago';
	     const ciudad="Chicago";
	     darHora(zonah);
	     consultarAPI(ciudad,pais);
	  }else if(id_horaria==2){
		var zonah='America/Denver';
		const ciudad="Denver";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);

	  }else if(id_horaria==3){
		var zonah='America/Phoenix';
		const ciudad="Phoenix";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);
	    
	  }else if(id_horaria==4){
		var zonah='America/Los_Angeles';
		const ciudad="Los Ángeles";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);

	  }else if(id_horaria==5){
		var zonah='America/Anchorage';
		const ciudad="Anchorage";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);
	    
	  }else if(id_horaria==6){
		var zonah='Pacific/Honolulu';
		const ciudad="Honolulu";
	    consultarAPI(ciudad,pais);
	    darHora(zonah);
	    
	    
	  }
  }
}
function darHora(zonahoraria){
    var x=new Date().toLocaleString("en-US",{timeZone:zonahoraria,timeStyle:'medium',hourCyCle:'h24'});
	hora.innerHTML=`<div id="hora2"><p>${x}</p> </div>`;
	
}