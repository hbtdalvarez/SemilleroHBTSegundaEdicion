import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { APP_BASE_HREF } from '@angular/common';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic';
import { MenuComponent } from './semillero/componentes/menu/menu-component';

export { ComicDTO } from './semillero/dto/comic.dto';
export { ResultadoDTO } from './semillero/dto/resultado.dto';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    GestionarComicComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
    
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 

}
