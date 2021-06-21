function zonahoraria(id_Pais,id_horaria){
   if(id_Pais==1){
	  const pais="México";
	  if(id_horaria==1){
	     const ciudad="Ciudad de México";
	     consultarAPI(ciudad,pais);
	  }else if(id_horaria==2){
		const ciudad="Tijuana";
	    consultarAPI(ciudad,pais);

	    }else if(id_horaria==3){
		const ciudad="Monterrey";
	    consultarAPI(ciudad,pais);

	  }

	
   }else if(id_Pais==2){
	  const pais="Estados Unidos";
	  if(id_horaria==1){
	     const ciudad="Chicago";
	     consultarAPI(ciudad,pais);
	  }else if(id_horaria==2){
		const ciudad="Denver";
	    consultarAPI(ciudad,pais);

	    }else if(id_horaria==3){
		const ciudad="Phoenix";
	    consultarAPI(ciudad,pais);
	   }else if(id_horaria==4){
		const ciudad="Los Ángeles";
	    consultarAPI(ciudad,pais);

	    }else if(id_horaria==5){
		const ciudad="Anchorage";
	    consultarAPI(ciudad,pais);
	   }else if(id_horaria==6){
		const ciudad="Honolulu";
	    consultarAPI(ciudad,pais);
	   }
  }
}