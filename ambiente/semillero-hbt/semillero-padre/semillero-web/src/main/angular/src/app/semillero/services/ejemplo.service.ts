import { Injectable } from '@angular/core';
import { Injector } from "@angular/core";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from './template.service';

/**
 * Servicio encargado de llamar a los servicios REST de
 * ejemplo
 */
@Injectable({
  providedIn: 'root'
})
export class EjemploService extends AbstractService {

  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * Servicio encargado de hacer invocaciones de ejemplo al servicio de consulta
   *  
   */
  public saludo() {
    console.log('Invocando al servicio')
    this.get<string>('semillero-servicios', '/GestionarComic/saludo');
  }
}
