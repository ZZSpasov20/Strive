import { Day } from "./Day";
import { User } from "./User";

export interface Program {
    programId: number;
    user: User;
    name: string;
    days: Day[];
}