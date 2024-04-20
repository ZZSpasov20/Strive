import type { Day } from "./Day";
import type { User } from "./User";

export interface Program {
    programId?: number;
    user?: User;
    name?: string;
    days?: Day[];
}