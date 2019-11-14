import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

import {EjemploService} from '../../services/ejemplo.service';

/**
 * @description Componente bienvenida, el cual contiene la imagen de bienvenida al semillero
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'bienvenida',
  templateUrl: './bienvenida-component.html',
})
export class BienvenidaComponent implements OnInit {
  
  public urlImagen : string;
  
  constructor(private router : Router, private activatedRoute: ActivatedRoute, private ejemploService: EjemploService) {
    console.log("entro al constructor del componente bienvenida");
  }

  ngOnInit(): void {
    this.urlImagen = "https://www.elempleo.com/sitios-empresariales/colombia/heinsohn-business-technology/img/elempleo-02.jpg";
    let data = this.activatedRoute.snapshot.params;
    
<<<<<<< HEAD
    console.log("Parametros recibidos " + JSON.stringify(data));
    
=======
    console.log("Parametros recibidos " + data);
    this.ejemploService.saludo();
>>>>>>> a7f57bab836eb2249b08d632e9036764ab7e9cb5
  }

  public ejecucionEventoClick( parametroEvento : any, numero : number ) : void {
    alert("Hola: " + parametroEvento + ' ' + numero);
    
  }

}