import { Role } from "./Role";

export class User {
    id: string="";
    firstName: string="";
    lastName:String="";
    email:string="";
    login:string="";
    password:string="";
    role:Role;
}