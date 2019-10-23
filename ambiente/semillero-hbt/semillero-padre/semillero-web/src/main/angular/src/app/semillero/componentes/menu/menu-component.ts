import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

/**
 * @description Componenete gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'home-page',
  templateUrl: './menu-component.html',
})
export class MenuComponent implements OnInit {
    
    constructor(private router : Router) {

    }  

    ngOnInit(): void {
        
    }
  
    public navegarGestionarComic() : void {
      this.router.navigate(['gestionar-comic']);
    }
}