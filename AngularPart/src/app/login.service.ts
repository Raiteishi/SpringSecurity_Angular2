import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';
import { User } from './user';
import { Observable }     from 'rxjs/Observable';
import 'rxjs/add/operator/map';


@Injectable()
export class LoginService {

    private link = "http://localhost:8080/";

    constructor(private http : Http){}


    getUser(username: String, password: String) {
        return this.http.get(`${this.link}?username=${username}&password=${password}`);
    }

    sendCredential(username: String, password: String) {
        let headers = new Headers();
        headers.append('Content-Type', 'application/x-www-form-urlencoded');
        headers.append('Accept','text/html');
        let params = "username="+username+"&password="+password;
        return this.http.post(this.link+"login", params,{headers:headers,withCredentials:true})
        .map(response => response.json());
    }
}