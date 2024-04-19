import { Program } from "./Program";
import { ClientStat } from "./ClientStat";

export interface User {
    clientId: number;
    firstName: string;
    lastName: string;
    emailAddress: string;
    username: string;
    password: string;
    birthDate: string;
    clientStats: ClientStat[];
    programs: Program[];
}
