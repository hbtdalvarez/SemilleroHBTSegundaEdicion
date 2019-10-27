import { Component, OnInit } from '@angular/core';
import { ComicDTO } from '../../dto/comic.dto';

/**
 * @description Componenete gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
    selector: 'gestionar-comic',
    templateUrl: './gestionar-comic.html',
    styleUrls: ['./gestionar-comic.css']
})
export class GestionarComicComponent implements OnInit {

    /**
     * Atributo que contendra la informacion del comic
     */
    public comic: ComicDTO;

    constructor() { }

    /**
     * Evento angular que se ejecuta al invocar el componente
     */
    ngOnInit(): void {
        this.comic = new ComicDTO();
        
    }

}