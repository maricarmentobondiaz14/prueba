function cambiarPais(pais){
    if (pais=="México"){
		
		
		var zonah='America/Mexico_City';
        paises.innerHTML = "<div id='pais2'><p>" +pais +"</p>"
        +"<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png'></div>";
        darHora(zonah);
        consultarAPI("Ciudad de México",pais);
        zonas.innerHTML="<div id='zonas2'>"+
            '<p><a onclick="javascript:zonahoraria(1,1)">Ciudad de México Central</a></p>'+
            "<p><a onclick='javascript:zonahoraria(1,2)'>Tijuana</a></p>"+
            "<p><a onclick='javascript:zonahoraria(1,3)'>Monterrey</a></p></div";

    }else if(pais=="Estados Unidos"){
		var zonah='America/Chicago';
        paises.innerHTML = "<div id='pais2'><p>" +pais +"</p>"
        +"<img src='https://images-na.ssl-images-amazon.com/images/I/61SiPzQldpL._AC_SX425_.jpg'></div>";
        darHora(zonah);
        consultarAPI("Chicago",pais);
        zonas.innerHTML="<div id='zonas2'>"+
            "<p><a onclick='javascript:zonahoraria(2,1)'>Chicago</a></p>"+
            "<p><a onclick='javascript:zonahoraria(2,2)'>Denver</a></p>"+
            "<p><a onclick='javascript:zonahoraria(2,3)'>Phoenix</a></p>"+
            "<p><a onclick='javascript:zonahoraria(2,4)'>Los Ángeles</a></p>"+
            "<p><a onclick='javascript:zonahoraria(2,5)'>Anchorage</a></p>"+
            "<p><a onclick='javascript:zonahoraria(2,6)'>Honolulu</a></p></div>";
    }else if(pais=="Ecuador"){
	        const ciudad="Puerto Ayora";
	        var zonah='America/Guayaquil';
	        darHora(zonah);
			consultarAPI(ciudad,pais);
			
        paises.innerHTML = "<div id='pais2'><p>" +pais +"</p>"+
        "<img src='https://hemptoday.net/es/wp-content/uploads/2020/07/flag-of-ecuador-710x437-1.jpg'></div>";

        zonas.innerHTML="<div id='zonas2'>"+
            "<p><a th:onclick='zonahoraria(3,1)'>Islas Galápagos, Ecuador</a></p></div>";
          



    }
}
const consultarAPI=async(ciudad,pais)=>{
	            const kelvin=273.15;
				const apikey="9101fb8b7fd7f7451a9544b9c9d14ccf";
				console.log("Entro");
				const url=`http://api.openweathermap.org/data/2.5/weather?q=${ciudad},${pais}&appid=${apikey}`;
				console.log(url);
				const respuesta=await fetch(url);
				const resultado=await respuesta.json();
				console.log(resultado); 
				const {name,main}=resultado;
				if(!name) return null;
				clima.innerHTML=`<div id="clima2" form-row>
				<div class="form-group col-md-6">
				<img src='https://www.viajarafrancia.com/wp-content/uploads/2014/10/clima-1-760x500.jpg'>
				</div>
				<div class="form-group col-md-6">
				<p class="temperatura">${parseFloat(main.temp-kelvin,10).toFixed(2)}<span> &#x2103;</span>
				</p>
				<p class=>Temperatura minima: ${parseFloat(main.temp_min-kelvin,10).toFixed(2)}<span> &#x2103;</span>
				<p class=>Temperatura máxima: ${parseFloat(main.temp_max-kelvin,10).toFixed(2)}<span> &#x2103;</span>
				<p class=>Humedad: ${parseFloat(main.humidity,10).toFixed(2)}<span> %</span>

				</p>
				</div>
				</div>
				`;
				
			}






