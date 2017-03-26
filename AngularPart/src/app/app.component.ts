import { Component } from '@angular/core';
import { LoginService } from './login.service';
import { Response } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [LoginService]
})
export class AppComponent {
  
  private u: String;
  private p: String;

  constructor(private loginService: LoginService){}

  sendCredential() {
    this.loginService.sendCredential(this.u,this.p).subscribe( (res: Response) => console.log(res));
  }
}
