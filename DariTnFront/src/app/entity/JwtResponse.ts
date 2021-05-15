export class JwtResponse {
    jwttoken:string;
    roles: string;

    constructor(jwttoken:string, roles:string){
        this.jwttoken=jwttoken;
        this.roles = roles;
    }
}
